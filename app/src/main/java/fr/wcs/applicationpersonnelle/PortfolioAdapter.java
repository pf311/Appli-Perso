package fr.wcs.applicationpersonnelle;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class PortfolioAdapter extends ArrayAdapter<TypeModel> {
    public PortfolioAdapter(Context context, ArrayList<TypeModel> models) {
        super(context, 0, models);
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Get the data item for this position
        TypeModel model = getItem(position);
        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.portoflio_type, parent, false);
        }
        // Lookup view for data population
        TextView title = (TextView) convertView.findViewById(R.id.titleType);
        ImageView imageWichTtpe = (ImageView) convertView.findViewById(R.id.imageType);
        // Populate the data into the template view using the data object
        title.setText(model.getTitlePortfolio());
        imageWichTtpe.setImageResource(model.getImagePort());
        // Return the completed view to render on screen
        return convertView;
    }



}
