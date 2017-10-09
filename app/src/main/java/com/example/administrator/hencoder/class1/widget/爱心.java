package com.example.administrator.hencoder.class1.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by yang.jianan on 2017/10/09 11:29.
 */

public class 爱心 extends View {
    public 爱心(Context context) {
        super(context);
    }

    public 爱心(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public 爱心(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    Paint paint = new Paint();
    Path path = new Path(); // 初始化 Path 对象

    {
        // 使用 path 对图形进行描述（这段描述代码不必看懂）
        path.addArc(200, 200, 400, 400, -225, 225);
        path.arcTo(400, 200, 600, 400, -180, 225, false);
        path.lineTo(400, 542);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        canvas.drawPath(path, paint); // 绘制出 path 描述的图形（心形），大功告成
    }
}
