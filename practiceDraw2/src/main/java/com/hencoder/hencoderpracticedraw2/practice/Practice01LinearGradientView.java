package com.hencoder.hencoderpracticedraw2.practice;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

import com.hencoder.hencoderpracticedraw2.R;

public class Practice01LinearGradientView extends View {
    Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
    Bitmap bitmap;

    public Practice01LinearGradientView(Context context) {
        super(context);
    }

    public Practice01LinearGradientView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice01LinearGradientView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    {

        bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.batman);

    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        int count = 66;

        bitmap = bitmap.copy(Bitmap.Config.ARGB_8888, true);
        int textureWidth = bitmap.getWidth();
        canvas.drawBitmap(bitmap, 0, 0, paint);
        Log.d("textureWidth", "textureWidth = " + textureWidth);
        paint.setColor(Color.RED);
        canvas.drawCircle(textureWidth - 17 - 6, 16 + 6, 16 + 6, paint);
        paint.setColor(Color.WHITE);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(2);
        canvas.drawCircle(textureWidth - 17 - 6, 16 + 6, 16 + 6, paint);

        Paint countPaint = new Paint(Paint.ANTI_ALIAS_FLAG | Paint.DEV_KERN_TEXT_FLAG);
        countPaint.setColor(Color.WHITE);
        countPaint.setTextSize(26f);
        countPaint.setTypeface(Typeface.DEFAULT_BOLD);

        float x = textureWidth - 24 - 4;
        if (count > 9) x -= 4 + 6;

        if (count > 99) {
            countPaint.setTextSize(22f);
            String text = String.valueOf(99) + "+";
            canvas.drawText(text, x - 2, 25 + 5, countPaint);
        } else {
            String text = String.valueOf(count);
            canvas.drawText(text, x, 25 + 5, countPaint);
        }
    }
}
