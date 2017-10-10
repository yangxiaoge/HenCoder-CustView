package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice11PieChartView extends View {
    Paint paint;

    public Practice11PieChartView(Context context) {
        super(context);
        init();
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        paint = new Paint(Paint.ANTI_ALIAS_FLAG);
        paint.setStyle(Paint.Style.FILL);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画饼图

        //普通圆（除了红色）
        RectF rect = new RectF(200, 200, 700, 700);
        //红色圆
        RectF rectRed = new RectF(200 - 15, 200 - 15, 700 - 15, 700 - 15);

        //Marshmallow
        paint.setColor(Color.parseColor("#FFFFB940"));
        canvas.drawArc(rect, -45, 45, true, paint);

        //Froyo
        paint.setColor(Color.parseColor("#506E7A"));
        canvas.drawArc(rect, 0, 3, true, paint);

        //Gingerbread
        paint.setColor(Color.parseColor("#FFA640FF"));
        canvas.drawArc(rect, 3, 6, true, paint);

        //Ice Cream Sandwich
        paint.setColor(Color.parseColor("#FF8B8281"));
        canvas.drawArc(rect, 13, 5, true, paint);

        //Jelly Bean
        paint.setColor(Color.parseColor("#FF1D9E50"));
        canvas.drawArc(rect, 22, 60, true, paint);

        //KitKat
        paint.setColor(Color.parseColor("#FF35A1FF"));
        canvas.drawArc(rect, 85, 100, true, paint);

        //KitKat
        paint.setColor(Color.RED);
        canvas.drawArc(rectRed, -173, 126, true, paint);
    }
}
