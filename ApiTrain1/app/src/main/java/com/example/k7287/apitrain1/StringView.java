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
        // 文字のサイズ指定
        paint.setTextSize(30);
        // 文字の色指定
        paint.setColor(Color.rgb(60, 200, 30));
        // 画面のサイズを出力
        canvas.drawText("画面サイズ" + getWidth() + "x" + getHeight(), 0, 60, paint);
        //
        canvas.drawText("文字幅" + (int)paint.measureText("A"), 0, 60*2, paint);
        //
        canvas.drawText("アセント" + (int)paint.ascent(), 0, 60*3, paint);
        //
        canvas.drawText("ディセント" + (int)paint.descent(), 0, 60*4, paint);
        // 文字のサイズ指定
        paint.setTextSize(24);
        canvas.drawText("24pxの文字", 0, 60*5, paint);
        // 文字のサイズ指定
        paint.setTextSize(36);
        canvas.drawText("36pxの文字", 0, 60*6, paint);
        // 文字のサイズ指定
        paint.setTextSize(48);
        canvas.drawText("48pxの文字", 0, 60*7, paint);


    }
}
