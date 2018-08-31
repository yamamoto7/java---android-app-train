package com.example.k7287.designtrain3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_main);

        Button listButton = (Button)findViewById(R.id.list_view);
        listButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplication(), ListViewActivity.class);
                startActivity(intent);
            }
        });
        Button tableButton = (Button)findViewById(R.id.table_view);
        tableButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplication(), TableViewActivity.class);
                startActivity(intent);
            }
        });

    }
}
