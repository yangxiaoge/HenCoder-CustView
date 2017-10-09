package com.example.administrator.hencoder.class1.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by yang.jianan on 2017/10/09 11:09.
 */

public class 椭圆圆弧 extends View {
    private Paint paint = new Paint();

    public 椭圆圆弧(Context context) {
        super(context);
    }

    public 椭圆圆弧(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public 椭圆圆弧(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        paint.setStyle(Paint.Style.FILL); // 填充模式
        canvas.drawArc(200, 100, 800, 500, -110, 100, true, paint); // 绘制扇形
        canvas.drawArc(200, 100, 800, 500, 20, 140, false, paint); // 绘制弧形
        paint.setStyle(Paint.Style.STROKE); // 画线模式
        canvas.drawArc(200, 100, 800, 500, 180, 60, false, paint); // 绘制不封口的弧形
    }
}
