package money.budgetapp.com.budgetapp;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Home extends AppCompatActivity {



    public void basicBudget(View view){

       // Toast.makeText(this, "This is a basic budget", Toast.LENGTH_SHORT).show();
        startActivity(new Intent(Home.this , BasicBudget.class));
    }



    public void advancedBudget(View view){
        //Toast.makeText(this, "This is an advanced budget", Toast.LENGTH_SHORT).show();
        startActivity(new Intent(Home.this , AdvancedBudget.class));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


    }
}
