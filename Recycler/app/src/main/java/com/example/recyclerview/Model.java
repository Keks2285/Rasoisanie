package com.example.recyclerview;

import android.widget.ImageView;

public class Model {
    private  String name;

    public Model( String name) {
        this.name = name;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
