package org.techtown.activitytest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Button butBack = (Button)findViewById(R.id.but_back);
        butBack.setOnClickListener(butBackHandler);
    }
    View.OnClickListener butBackHandler = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            finish();
        }
    };
}
