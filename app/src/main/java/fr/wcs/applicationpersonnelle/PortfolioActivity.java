package fr.wcs.applicationpersonnelle;

import android.net.ParseException;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class PortfolioActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.portfolio_activity);

        ListView listPortfolio = findViewById(R.id.list);
        ArrayList<TypeModel> listModel = new ArrayList<>();
        try{
            listModel.add(new TypeModel("Logo Personnel", R.drawable.ouou));
        } catch (ParseException e) {
        }


        PortfolioAdapter adapter = new PortfolioAdapter(this, listModel);
        listPortfolio.setAdapter(adapter);
    }
}

