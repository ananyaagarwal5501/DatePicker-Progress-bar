package com.example.datepickerandprogressbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.ProgressBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    DatePicker datePicker;
    Button btn;
    Button btn2;
    ProgressBar progressBar;
    int progress=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        datePicker = findViewById(R.id.datePicker);
        btn = findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //getting the date in these variables and displaying by a toast message
                String day = "Day "+ datePicker.getDayOfMonth();
                String month = "Month "+ (datePicker.getMonth()+1);
                String year = "Year "+ datePicker.getYear();

                Toast.makeText(
                        MainActivity.this,
                        day + " " + month + " " + year,
                        Toast.LENGTH_SHORT).show();

            }
        });

        progressBar = findViewById(R.id.progressBar);
        btn2 = findViewById(R.id.btn2);

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                progress = progress+10;
                progressBar.setProgress(progress);//sets the progress as it increases
            }
        });



    }
}