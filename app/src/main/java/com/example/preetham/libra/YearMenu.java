package com.example.preetham.libra;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class YearMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_year_menu);

    }
    public void subjectMenu(View v){
        String newString = "";
        Intent in = getIntent();
        Bundle bundle = in.getExtras();
        if(bundle!=null){
            newString= (String) bundle.get("branch");
            Log.i("main",newString);
        }

        if(v.getId() == R.id.firstsem){
            newString+="first18";
        }
        else if(v.getId() == R.id.secondsem){
            newString+="second18";
        }
        else if(v.getId() == R.id.thirdsem){
            newString+="third17";
        }
        else if(v.getId() == R.id.fourthsem){
            newString+="fourth17";
        }
        else if(v.getId() == R.id.fifthsem){
            newString+="fifth15";
        }
        else if(v.getId() == R.id.sixthsem){
            newString+="sixth15";
        }
        else if(v.getId() == R.id.seventhsem){
            newString+="seventh15";
        }
        else if(v.getId() == R.id.eighthsem){
            newString+="eighth15";
        }
        Intent intent =  new Intent(YearMenu.this,SyllabusPdf.class);
        intent.putExtra("id",newString);
        startActivity(intent);
    }
}
