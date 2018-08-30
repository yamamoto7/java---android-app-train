package com.example.k7287.designtrain3;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class ListViewActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle bundle){
        super.onCreate(bundle);
        setContentView(R.layout.list_view);

        ListView listView = (ListView) findViewById(R.id.listView);

        // アダプタの作成
        ListAdapter adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, items);
        // アダプタの設定
        listView.setAdapter(adapter);
    }

    // ListViewに表示させる文字列
    private static String[] items = new String[] { "item1", "item2", "item3", "item4", "item5" };
}
