package fr.wcs.applicationpersonnelle;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;

import com.dd.CircularProgressButton;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView myImageView = findViewById(R.id.fLogo);
        myImageView.setImageResource(R.drawable.ouou);

        Button myButton = findViewById(R.id.fButton);
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent homePage = new Intent(MainActivity.this, PortfolioActivity.class);
                startActivity(homePage);
            }
        });
       
    }
}
