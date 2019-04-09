package com.example.preetham.libra;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.io.InputStream;

public class TxtSyllabus extends AppCompatActivity {
    TextView syllabus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_txt_syllabus);

        syllabus = (TextView)findViewById(R.id.syllabus);
        String text = "";
        try{
            InputStream inputStream = getAssets().open("test.txt");
            int size = inputStream.available();
            byte[] buffer = new byte[size];
            inputStream.read(buffer);
            inputStream.close();
            text = new String(buffer);
        }catch (Exception e){
            e.printStackTrace();
        }
        syllabus.setText(text);
    }
}
