package com.example.administrator.hencoder.class1.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by yang.jianan on 2017/10/09 14:03.
 */

public class 画直线1 extends View {
    Paint paint = new Paint();
    Path path = new Path();  // 初始化 Path 对象

    public 画直线1(Context context) {
        super(context);
    }

    public 画直线1(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public 画直线1(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        paint.setStyle(Paint.Style.STROKE);
        path.lineTo(100, 100); // 由当前位置 (0, 0) 向 (100, 100) 画一条直线
        path.rLineTo(100, 0); // 由当前位置 (100, 100) 向正右方 100 像素的位置画一条直线
//        paint.setStyle(Paint.Style.STROKE);
//        path.lineTo(100, 100);
//        path.arcTo(100, 100, 300, 300, -90, 90, true); // 强制移动到弧形起点（无痕迹）
        canvas.drawPath(path, paint);
    }
}
