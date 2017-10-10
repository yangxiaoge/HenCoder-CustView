package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;


public class Practice9DrawPathView extends View {
    Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
    Path path = new Path();

    public Practice9DrawPathView(Context context) {
        super(context);
    }

    public Practice9DrawPathView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice9DrawPathView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawPath() 方法画心形

        /*// 画二次贝塞尔曲线
        paint.setStyle(Paint.Style.STROKE);
        path.quadTo(100, 100, 300, 300);
        path.rQuadTo(300, 300, 700, 300);
        canvas.drawPath(path, paint);

        // 画三次贝塞尔曲线
        paint.setStyle(Paint.Style.STROKE);
        path.cubicTo(100,100,200,200,240,260);
        path.rCubicTo(240,260,300,250,500,320);
        canvas.drawPath(path, paint);*/

        /*
        //不用 arcto 方法绘制的粗糙版本
        canvas.drawCircle(200,200,100,paint);
        canvas.drawCircle(300,200,100,paint);

        paint.setStyle(Paint.Style.FILL);
        path.moveTo(100, 200);
        path.lineTo(300, 800);
        path.lineTo(500, 200);

        canvas.drawPath(path,paint);*/

        paint.setStyle(Paint.Style.FILL);
        path.arcTo(100,100,300,300,-200,200,true); // 相当于 path.addArc(100,100,300,300,-200,200);
        path.arcTo(300,100,500,300,-180,200,false);
        path.lineTo(300,500);
        canvas.drawPath(path,paint);

    }
}
