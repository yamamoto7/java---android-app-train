package com.example.k7287.apptrain2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setScreenMain();
    }

    private void setScreenMain(){
        setContentView(R.layout.activity_main);

        Button button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) { // import android.view.View;が必要
                // import android.widget.Toast;が必要
                Toast.makeText(MainActivity.this, "ボタンが押されました。", Toast.LENGTH_SHORT)
                        .show();
            }
        });

        ImageButton button2 = (ImageButton) findViewById(R.id.imageButton);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "画像ボタンが押されました。", Toast.LENGTH_SHORT)
                        .show();
            }
        });

        Button pagerButton = (Button)findViewById(R.id.pagerButton);
        pagerButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                setScreenSub();
            }
        });

    }
    private void setScreenSub(){
        setContentView(R.layout.activity_sub);

        Button returnButton = (Button)findViewById(R.id.returnButton);
        returnButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setScreenMain();
            }
        });
    }

}
