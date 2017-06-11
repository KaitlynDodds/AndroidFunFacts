package com.treehouse.kadodds.funfacts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class FunFactsActivity extends AppCompatActivity {

//    declare our View variables
    private TextView factTextView;
    private Button showFactBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);

//        assign the Views from the layout file to the corresponding variables
        factTextView = (TextView) findViewById(R.id.factTextView);
        showFactBtn = (Button) findViewById(R.id.showFactBtn);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // button was clicked, update factTextView with new fact
                String fact = "Ostriches can run faster than horses.";
                factTextView.setText(fact);
            }
        };
        showFactBtn.setOnClickListener(listener);
    }
}
