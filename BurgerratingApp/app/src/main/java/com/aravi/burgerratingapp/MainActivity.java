package com.aravi.burgerratingapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RatingBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    RatingBar ratingBar;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ratingBar=findViewById(R.id.ratingBar);
        textView=findViewById(R.id.textView);
    }

    public void submitmethod(View view) {
        float ratingvalues=ratingBar.getRating();

        if (ratingvalues<2)
            textView.setText("Rating is:"+ ratingvalues+"\n we will surly improve");
        else if (ratingvalues<=3 && ratingvalues>=2)
            textView.setText("Rating is:"+ ratingvalues+"\n we are constantly improving..");
        else if (ratingvalues<=4 && ratingvalues>3)
            textView.setText("Rating is:"+ ratingvalues+"\n thankyou for rating and supporting");
        else
            textView.setText("Rating is:"+ ratingvalues+"\n thankyou so much your supporting");

    }
}
