package com.example.k7287.apitrain1;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;


public class StringView extends View {
    public StringView(Context context){
        super(context);
        setBackgroundColor(Color.WHITE);
    }

    @Override
    protected void onDraw(Canvas canvas){
        Paint paint = new Paint();
        paint.setTextSize(30);
        paint.setColor(Color.rgb(60, 200, 30));
        canvas.drawText("画面サイズ" + getWidth() + "x" + getHeight(), 0, 60, paint);
    }
}
