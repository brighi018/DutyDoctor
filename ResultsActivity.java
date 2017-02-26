package com.example.baileyrighi.hackisu17;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Bailey Righi on 2/25/2017.
 */

public class ResultsActivity extends AppCompatActivity {

    private int foodType;
    private int color;
    private int consistency;

    private TextView mFoodTypeResult;
    private TextView mColorResult;
    private TextView mConsistencyResult;
    private TextView mResultsAdvice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);

        Intent intent = getIntent();
        foodType = intent.getIntExtra("type of food", 0);
        color = intent.getIntExtra("color", 0);
        consistency = intent.getIntExtra("consistency", 0);

        mFoodTypeResult = (TextView)findViewById(R.id.food_type_result);
        mColorResult = (TextView)findViewById(R.id.color_result);
        mConsistencyResult = (TextView)findViewById(R.id.consistency_result);
        mResultsAdvice = (TextView)findViewById(R.id.results_advice);

        switch (foodType) {
            case 1:
                mFoodTypeResult.setText(R.string.breastfeeding_button_text);
                break;
            case 2:
                mFoodTypeResult.setText(R.string.soft_food_button_text);
                break;
            case 3:
                mFoodTypeResult.setText(R.string.solid_food_button_text);
        }

        switch (color) {
            case 1:
                mColorResult.setText(R.string.black_text);
                break;
            case 2:
                mColorResult.setText(R.string.brown_text);
                break;
            case 3:
                mColorResult.setText(R.string.green_text);
                break;
            case 4:
                mColorResult.setText(R.string.yellow_text);
                break;
            case 5:
                mColorResult.setText(R.string.red_text);
                break;
            case 6:
                mColorResult.setText(R.string.white_text);
                break;
        }

        switch (consistency) {
            case 1:
                mConsistencyResult.setText(R.string.runny_text);
                break;
            case 2:
                mConsistencyResult.setText(R.string.soft_text);
                break;
            case 3:
                mConsistencyResult.setText(R.string.hard_text);
                break;
            case 4:
                mConsistencyResult.setText(R.string.chunky_text);
                break;
            case 5:
                mConsistencyResult.setText(R.string.constipated_text);
        }

        if (consistency == 5) {
            String text = (String) mResultsAdvice.getText();
            mResultsAdvice.append(text + "If your child appears to be in pain while pooping or isn't pooping at all he this can be a major issue. To fix this problem you should inegrate more fiber into your child's diet. If your child is formula fed you should consider chamging their formula in case of possible allergies. For immediate and short term relief try massaging the stomach of your child. This solution will provide short term stress and should only be used until other solutions solve the problem. \n\n" );
        }
        else {
            if (consistency == 1) {
                String text = (String) mResultsAdvice.getText();
                mResultsAdvice.append(text + "In the case that your child has runny diapers or diarrhea you should pay close attention to how long it lasts. Try feeding your child bananas, rice, applesauce, or toast. Also be sure to keep your child hydrated by having them drink lots of water. If the diarrhea doesn't stop see a medical professional. \n\n");
            } else {
                if (color == 6) {
                    if (foodType == 1) {
                        String text = (String) mResultsAdvice.getText();
                        mResultsAdvice.append(text + "There is no need to worry. This can be caused by the digestive system not fully breaking down food.This is more common if your child is formula fed. However, if this becomes a constant occurrence you should talk to a medical professional. \n\n");
                    } else {
                        String text = (String) mResultsAdvice.getText();
                        mResultsAdvice.append(text + "Since your child's stool is white this could be quite severe. You should contact a medical professional. This means that the nutrients from your child's food are not being absorbed. \n\n");
                    }
                }
                if (color == 5) {
                    if (consistency == 3) {
                        String text = (String) mResultsAdvice.getText();
                        mResultsAdvice.append(text + "This should be cause for concern. However, if your child has consumed beets recently that could be the cause. If that isn't the case you should contact a medical professional. \n\n");
                    } else {
                        String text = (String) mResultsAdvice.getText();
                        mResultsAdvice.append(text + "While your child having red stool isn't necessarily an immediate concern in this case it is. Since it is combined with non-solid stool you should contact a medical professional. \n\n");
                    }
                }
                if (color == 1) {
                    String text = (String) mResultsAdvice.getText();
                    mResultsAdvice.append(text + "Your child is dehydrated. Make sure it is consuming enough water to order to fix this issue. If this problem continues contact a medical professional. \n\n");
                }
//                if (color == 4) {
//                    String text = (String) mResultsAdvice.getText();
//                    mResultsAdvice.append(text + "This means your child's food made its way through the digestive system quickly and wasn't broken down completely. While this is not an immediate issue if this continues contact a medical professional. \n\n");
//                }
                if (foodType == 3) {
                    if (consistency == 4) {
                        //System.out.println(mResultsAdvice.getText());
                        String text = String.valueOf(mResultsAdvice.getText());
                        mResultsAdvice.append(text + "This is perfectly fine. However, if there is solid chunks of food in their stool you should keep track of the next few diapers. If this continues then contact a medical professional. \n\n");

                    }
                } else {
                    if (color == 3) {
                        String text = (String) mResultsAdvice.getText();
                        mResultsAdvice.append(text + "This is perfectly normal. This could be caused by your child eating green food or their food being digested more quickly. \n\n");
                    }
                }
                if ((mResultsAdvice.getText()).equals("")) {
                    String text = (String) mResultsAdvice.getText();
                    mResultsAdvice.setText("This stool is normal. There is no need to be worried, your child is perfectly fine. ");
                }
            }
        }

    }
}
