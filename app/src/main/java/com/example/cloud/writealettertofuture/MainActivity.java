package com.example.cloud.writealettertofuture;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button myLetterImageBtn = (Button)findViewById(R.id.writeMyLetterBtn);
        myLetterImageBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent startIntent =  new Intent(getApplicationContext(),WriteLetterActivity.class);
                startActivity(startIntent);
            }
        });
    }
}
