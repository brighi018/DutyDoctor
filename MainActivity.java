package com.example.baileyrighi.hackisu17;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mFoodDescription;
    private Button mDiagnosticButton;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mDiagnosticButton = (Button)findViewById(R.id.diagnostic_button);
        mDiagnosticButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, DescriptionActivity.class);
                startActivity(i);
            }
        });

//        mBreastfeedingButton = (Button)findViewById(R.id.breastfeeding_button);
//        mBreastfeedingButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                foodType = 1;
//                Intent i = new Intent(MainActivity.this, DescriptionActivity.class);
//                i.putExtra("type of food", foodType);
//                startActivity(i);
//            }
//        });



    }



}
