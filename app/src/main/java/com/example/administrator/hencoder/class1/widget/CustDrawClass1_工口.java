package com.example.administrator.hencoder.class1.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by yang.jianan on 2017/10/09 10:54.
 */

public class CustDrawClass1_工口 extends View{
    Paint paint = new Paint();

    public CustDrawClass1_工口(Context context) {
        super(context);
    }

    public CustDrawClass1_工口(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public CustDrawClass1_工口(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float[] points = {20, 20, 120, 20, 70, 20, 70, 120, 20, 120, 120, 120, 150, 20, 250, 20, 150, 20, 150, 120, 250, 20, 250, 120, 150, 120, 250, 120};
        canvas.drawLines(points, paint);
    }
}
