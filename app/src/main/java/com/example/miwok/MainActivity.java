package com.example.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView numberView = findViewById(R.id.numbers);
        numberView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(v.getContext(), NumbersActivity.class));
            }
        });

        // for phrases
        //finds the view that shows the phrases category
        TextView phrases = findViewById(R.id.phrases);
        //set onclick listener on the view
        phrases.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //creates an intent that takes us to the Phrases' page
                startActivity(new Intent(v.getContext(), PhrasesActivity.class));
            }
        });

        //for family
        TextView family = findViewById(R.id.family);
        family.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(v.getContext(), FamilyActivity.class));
            }
        });
        //for color
        TextView color = findViewById(R.id.colors);
        color.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(v.getContext(), ColorsActivity.class));
            }
        });

    }

    /** this triggers when the view, Number, is clicked
     *
     * @param view is the input view
     */
//    public void openNumbersList(View view) {
//        Intent intent = new Intent(this, NumbersActivity.class);
//        startActivity(intent);
//
//
//    }
}
