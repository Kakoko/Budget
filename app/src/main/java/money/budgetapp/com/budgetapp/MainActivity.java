package money.budgetapp.com.budgetapp;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Handler mHandler = new Handler();
        mHandler.postDelayed(new Runnable() {

            @Override
            public void run() {

                startActivity(new Intent(MainActivity.this , Home.class));
              //  Toast.makeText(MainActivity.this, "Its been three seconds", Toast.LENGTH_SHORT).show();
            }

        }, 3000L);
    }
}
