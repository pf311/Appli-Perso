package fr.wcs.applicationpersonnelle;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;

public class TypeModel {

    private String titlePortfolio;
    private int imagePort;

    public TypeModel(String titlePortfolio, int imagePort) {

        this.titlePortfolio = titlePortfolio;
        this.imagePort = imagePort;
    }

    public int getImagePort() {
        return imagePort;
    }

    public void setImagePort(int imagePort) {
        this.imagePort = imagePort;
    }

    public String getTitlePortfolio() {
        return titlePortfolio;
    }

    public void setTitlePortfolio(String titlePortfolio) {
        this.titlePortfolio = titlePortfolio;
    }
}

