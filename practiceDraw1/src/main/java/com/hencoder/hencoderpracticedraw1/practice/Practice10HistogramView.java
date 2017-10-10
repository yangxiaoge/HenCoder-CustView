package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

import java.util.Random;

public class Practice10HistogramView extends View {
    String[] devices = {"Froyo", "GB", "ICS", "JB", "KitKat", "L", "M"};
    Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
    int offset = 66; //第一个 字体和柱体 的位置
    int padding = 150;//柱体之间间距
    int width = 100;//柱体的宽度
    int textY = 700;//字体的纵坐标
    int lineY = 666;//柱体的纵坐标

    public Practice10HistogramView(Context context) {
        super(context);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画直方图

        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(Color.WHITE);
        paint.setStrokeWidth(1);
        canvas.drawLine(50, 100, 50, 666, paint);
        canvas.drawLine(50, 666, 1200, 666, paint);

        for (int i = 0; i < devices.length; i++) {

            //画柱体
            paint.setStyle(Paint.Style.FILL);
            paint.setColor(Color.GREEN);
            int randomTop = 50 + 100 * new Random().nextInt(devices.length); //柱状体随机高度
            canvas.drawRect(offset + padding * i, randomTop, offset + padding * i + width, lineY, paint);

            //画字体
            String text = devices[i];
            paint.setColor(Color.WHITE);
            paint.setTextSize(30);
            Rect bound = new Rect();
            paint.getTextBounds(text, 0, text.length(), bound);
            // 字体的中间点和柱状图的中间点一直
            canvas.drawText(text, offset + padding * i + (width / 2 - bound.width() / 2), textY, paint);
        }
    }
}
