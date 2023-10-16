package com.example.pizzaapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.pizzaapplication.R;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        Intent intent = getIntent();
        int img = intent.getIntExtra("photo",0);
        String n = intent.getStringExtra("nom");
        String d = intent.getStringExtra("description");
        String i = intent.getStringExtra("ingredients");
        String p = intent.getStringExtra("preparation");

        ImageView image = findViewById(R.id.image);
        TextView nom = findViewById(R.id.nom);
        TextView desc = findViewById(R.id.description);
        TextView ingred = findViewById(R.id.ingredients);
        TextView prep = findViewById(R.id.preparation);

        image.setImageResource(img);
        nom.setText(n);
        desc.setText(d);
        ingred.setText(i);
        prep.setText(p);

    }
}