package com.example.baileyrighi.hackisu17;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by Bailey Righi on 2/24/2017.
 */

public class DescriptionActivity extends AppCompatActivity {

    private Button mBreastfeedingButton;
    private Button mSoftFoodButton;
    private Button mSolidFoodButton;
    private Button mBlackButton;
    private Button mBrownButton;
    private Button mGreenButton;
    private Button mYellowButton;
    private Button mRedButton;
    private Button mWhiteButton;
    private Button mRunnyButton;
    private Button mSoftButton;
    private Button mHardButton;
    private Button mChunkyButton;
    private Button mConstipatedButton;

    private Button mNextButton;
    private Button mBackButton;

    private TextView mQuestionText;

    private int question = 0;
    private int foodType;
    private int color;
    private int consistency;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diagnostic);

        mQuestionText = (TextView)findViewById(R.id.question_text);

        mBreastfeedingButton = (Button)findViewById(R.id.breastfeeding_button);
        mBreastfeedingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                foodType = 1;
            }
        });

        mSoftFoodButton = (Button)findViewById(R.id.soft_food_button);
        mSoftFoodButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                foodType = 2;
            }
        });

        mSolidFoodButton = (Button)findViewById(R.id.solid_food_button);
        mSolidFoodButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                foodType = 3;
            }
        });

        mBlackButton = (Button)findViewById(R.id.black_button);
        mBlackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                color = 1;
            }
        });

        mBrownButton = (Button)findViewById(R.id.brown_button);
        mBrownButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                color = 2;
            }
        });

        mGreenButton = (Button)findViewById(R.id.green_button);
        mGreenButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                color = 3;
            }
        });

        mYellowButton = (Button)findViewById(R.id.yellow_button);
        mYellowButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                color = 4;
            }
        });

        mRedButton = (Button)findViewById(R.id.red_button);
        mRedButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                color = 5;
            }
        });

        mWhiteButton = (Button)findViewById(R.id.white_button);
        mWhiteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                color = 6;
            }
        });

        mRunnyButton = (Button)findViewById(R.id.runny_button);
        mRunnyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                consistency = 1;
            }
        });

        mSoftButton = (Button)findViewById(R.id.soft_button);
        mSoftButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                consistency = 2;
            }
        });

        mHardButton = (Button)findViewById(R.id.hard_button);
        mHardButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                consistency = 3;
            }
        });

        mChunkyButton = (Button)findViewById(R.id.chunky_button);
        mChunkyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                consistency = 4;
            }
        });

        mConstipatedButton = (Button)findViewById(R.id.constipated_button);
        mConstipatedButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                consistency = 5;
            }
        });

        mBreastfeedingButton.setVisibility(View.INVISIBLE);
        mSoftFoodButton.setVisibility(View.INVISIBLE);
        mSolidFoodButton.setVisibility(View.INVISIBLE);
        mBlackButton.setVisibility(View.INVISIBLE);
        mBrownButton.setVisibility(View.INVISIBLE);
        mGreenButton.setVisibility(View.INVISIBLE);
        mYellowButton.setVisibility(View.INVISIBLE);
        mRedButton.setVisibility(View.INVISIBLE);
        mWhiteButton.setVisibility(View.INVISIBLE);
        mRunnyButton.setVisibility(View.INVISIBLE);
        mSoftButton.setVisibility(View.INVISIBLE);
        mHardButton.setVisibility(View.INVISIBLE);
        mChunkyButton.setVisibility(View.INVISIBLE);
        mConstipatedButton.setVisibility(View.INVISIBLE);


        mQuestionText.setText(R.string.diagnostic_start_text);

        mNextButton = (Button)findViewById(R.id.next_button);
        mNextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                question += 1;

                if (question == 1) {
                    mBreastfeedingButton.setVisibility(View.VISIBLE);
                    mSoftFoodButton.setVisibility(View.VISIBLE);
                    mSolidFoodButton.setVisibility(View.VISIBLE);
                    mBlackButton.setVisibility(View.INVISIBLE);
                    mBrownButton.setVisibility(View.INVISIBLE);
                    mGreenButton.setVisibility(View.INVISIBLE);
                    mYellowButton.setVisibility(View.INVISIBLE);
                    mRedButton.setVisibility(View.INVISIBLE);
                    mWhiteButton.setVisibility(View.INVISIBLE);
                    mRunnyButton.setVisibility(View.INVISIBLE);
                    mSoftButton.setVisibility(View.INVISIBLE);
                    mHardButton.setVisibility(View.INVISIBLE);
                    mChunkyButton.setVisibility(View.INVISIBLE);
                    mConstipatedButton.setVisibility(View.INVISIBLE);

                    mQuestionText.setText(R.string.food_type_instructions);

                }
                else if (question == 2) {
                    mBreastfeedingButton.setVisibility(View.INVISIBLE);
                    mSoftFoodButton.setVisibility(View.INVISIBLE);
                    mSolidFoodButton.setVisibility(View.INVISIBLE);
                    mBlackButton.setVisibility(View.VISIBLE);
                    mBrownButton.setVisibility(View.VISIBLE);
                    mGreenButton.setVisibility(View.VISIBLE);
                    mYellowButton.setVisibility(View.VISIBLE);
                    mRedButton.setVisibility(View.VISIBLE);
                    mWhiteButton.setVisibility(View.VISIBLE);
                    mRunnyButton.setVisibility(View.INVISIBLE);
                    mSoftButton.setVisibility(View.INVISIBLE);
                    mHardButton.setVisibility(View.INVISIBLE);
                    mChunkyButton.setVisibility(View.INVISIBLE);
                    mConstipatedButton.setVisibility(View.INVISIBLE);

                    mQuestionText.setText(R.string.color_instructions);
                }
                else if (question == 3) {
                    mBreastfeedingButton.setVisibility(View.INVISIBLE);
                    mSoftFoodButton.setVisibility(View.INVISIBLE);
                    mSolidFoodButton.setVisibility(View.INVISIBLE);
                    mBlackButton.setVisibility(View.INVISIBLE);
                    mBrownButton.setVisibility(View.INVISIBLE);
                    mGreenButton.setVisibility(View.INVISIBLE);
                    mYellowButton.setVisibility(View.INVISIBLE);
                    mRedButton.setVisibility(View.INVISIBLE);
                    mWhiteButton.setVisibility(View.INVISIBLE);
                    mRunnyButton.setVisibility(View.VISIBLE);
                    mSoftButton.setVisibility(View.VISIBLE);
                    mHardButton.setVisibility(View.VISIBLE);
                    mChunkyButton.setVisibility(View.VISIBLE);
                    mConstipatedButton.setVisibility(View.VISIBLE);

                    mQuestionText.setText(R.string.consistency_instructions);
                }
                else {
                    Intent i = new Intent(DescriptionActivity.this, ResultsActivity.class);
                    i.putExtra("type of food", foodType);
                    i.putExtra("color", color);
                    i.putExtra("consistency", consistency);
                    startActivity(i);
                }

            }
        });

        mBackButton = (Button)findViewById(R.id.back_button);
        mBackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                question -= 1;
                if (question == 0) {
                    Intent i = new Intent(DescriptionActivity.this, MainActivity.class);
                    startActivity(i);
                }
                //question = Math.max(1, question - 1);

                if (question == 1) {
                    mBreastfeedingButton.setVisibility(View.VISIBLE);
                    mSoftFoodButton.setVisibility(View.VISIBLE);
                    mSolidFoodButton.setVisibility(View.VISIBLE);
                    mBlackButton.setVisibility(View.INVISIBLE);
                    mBrownButton.setVisibility(View.INVISIBLE);
                    mGreenButton.setVisibility(View.INVISIBLE);
                    mYellowButton.setVisibility(View.INVISIBLE);
                    mRedButton.setVisibility(View.INVISIBLE);
                    mWhiteButton.setVisibility(View.INVISIBLE);
                    mRunnyButton.setVisibility(View.INVISIBLE);
                    mSoftButton.setVisibility(View.INVISIBLE);
                    mHardButton.setVisibility(View.INVISIBLE);
                    mChunkyButton.setVisibility(View.INVISIBLE);
                    mConstipatedButton.setVisibility(View.INVISIBLE);

                    mQuestionText.setText(R.string.food_type_instructions);

                }
                else if (question == 2) {
                    mBreastfeedingButton.setVisibility(View.INVISIBLE);
                    mSoftFoodButton.setVisibility(View.INVISIBLE);
                    mSolidFoodButton.setVisibility(View.INVISIBLE);
                    mBlackButton.setVisibility(View.VISIBLE);
                    mBrownButton.setVisibility(View.VISIBLE);
                    mGreenButton.setVisibility(View.VISIBLE);
                    mYellowButton.setVisibility(View.VISIBLE);
                    mRedButton.setVisibility(View.VISIBLE);
                    mWhiteButton.setVisibility(View.VISIBLE);
                    mRunnyButton.setVisibility(View.INVISIBLE);
                    mRunnyButton.setVisibility(View.INVISIBLE);
                    mSoftButton.setVisibility(View.INVISIBLE);
                    mHardButton.setVisibility(View.INVISIBLE);
                    mChunkyButton.setVisibility(View.INVISIBLE);
                    mConstipatedButton.setVisibility(View.INVISIBLE);

                    mQuestionText.setText(R.string.color_instructions);
                }
                else if (question == 3) {
                    mBreastfeedingButton.setVisibility(View.INVISIBLE);
                    mSoftFoodButton.setVisibility(View.INVISIBLE);
                    mSolidFoodButton.setVisibility(View.INVISIBLE);
                    mBlackButton.setVisibility(View.INVISIBLE);
                    mBrownButton.setVisibility(View.INVISIBLE);
                    mGreenButton.setVisibility(View.INVISIBLE);
                    mYellowButton.setVisibility(View.INVISIBLE);
                    mRedButton.setVisibility(View.INVISIBLE);
                    mWhiteButton.setVisibility(View.INVISIBLE);
                    mRunnyButton.setVisibility(View.VISIBLE);
                    mSoftButton.setVisibility(View.VISIBLE);
                    mHardButton.setVisibility(View.VISIBLE);
                    mChunkyButton.setVisibility(View.VISIBLE);
                    mConstipatedButton.setVisibility(View.VISIBLE);

                    mQuestionText.setText(R.string.consistency_instructions);
                }

            }
        });



    }

}
