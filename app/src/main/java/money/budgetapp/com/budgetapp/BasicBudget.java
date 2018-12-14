package money.budgetapp.com.budgetapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Gravity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class BasicBudget extends AppCompatActivity {


    EditText personalPercentage ;
    EditText investmentPercentage;
    TextView tvRemainingPercentage;
    public void useDefault(View view){

       // Toast.makeText(this, "Old TImer", Toast.LENGTH_SHORT).show();



        personalPercentage =  findViewById(R.id.edPersonal);


        investmentPercentage = findViewById(R.id.edInvestment);


        personalPercentage.setText("40");
        investmentPercentage.setText("30");



        tvRemainingPercentage = findViewById(R.id.tvPercentageRemaining);

        tvRemainingPercentage.setText("0%");

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_basic_budget);

        final int remainingPercentage = 70;

        personalPercentage =  findViewById(R.id.edPersonal);
        investmentPercentage = findViewById(R.id.edInvestment);
        tvRemainingPercentage = findViewById(R.id.tvPercentageRemaining);

        personalPercentage.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {


            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                double percentageCalculationValue;
                double test;


                if((personalPercentage.getText().toString()).matches("")){

                  //  test = 0 ;
                  //  percentageCalculationValue = remainingPercentage - test;
                  //  tvRemainingPercentage.setText("" + percentageCalculationValue + "%");
                    tvRemainingPercentage.setText("70%");
                   // Toast.makeText(BasicBudget.this, "Its empty", Toast.LENGTH_SHORT).show();


                }else{

                    test = Double.parseDouble(personalPercentage.getText().toString());
                    if(test > 70)
                    {
                       // Toast.makeText(BasicBudget.this, "Percentage should be less than 70%", Toast.LENGTH_LONG).setGravity(Gravity.CENTER,0,0).show();

                        Toast toast = Toast.makeText(BasicBudget.this,"Percentage should be less than 70%", Toast.LENGTH_LONG);
                        toast.setGravity(Gravity.CENTER, 0, 0);
                        toast.show();

                        personalPercentage.setText("");
                    }
                    else
                    {
                        percentageCalculationValue = remainingPercentage - test;

                        tvRemainingPercentage.setText("" + percentageCalculationValue + "%");
                        double investmentPercent =  percentageCalculationValue;
                        investmentPercentage.setText(""+investmentPercent);
                        investmentPercentage.setEnabled(false);
                    }
                }

                //Edittext.setEnabled(false);
               // Toast.makeText(BasicBudget.this, "" + personalPercentage.getText().toString() , Toast.LENGTH_SHORT).show();



            }

            @Override
            public void afterTextChanged(Editable s) {
                //Toast.makeText(BasicBudget.this, "wawa", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
