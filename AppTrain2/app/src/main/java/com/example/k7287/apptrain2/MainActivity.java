package com.example.k7287.apptrain2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) { // import android.view.View;が必要
                // import android.widget.Toast;が必要
                Toast.makeText(MainActivity.this, "ボタンが押されました。", Toast.LENGTH_SHORT)
                        .show();
            }
        });
    }
}