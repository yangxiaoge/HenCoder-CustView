package com.example.administrator.hencoder.class1.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by yang.jianan on 2017/10/09 15:06.
 */

public class 画直线3 extends View {
    Paint paint = new Paint();
    Path path = new Path();  // 初始化 Path 对象

    public 画直线3(Context context) {
        super(context);
    }

    public 画直线3(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public 画直线3(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        paint.setStyle(Paint.Style.STROKE);
        path.lineTo(100, 100);
        path.arcTo(100, 100, 300, 300, -90, 90, false); // 直接连线连到弧形起点（有痕迹）
        canvas.drawPath(path,paint);
    }
}
