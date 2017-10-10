package com.hencoder.hencoderpracticedraw2.practice;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LightingColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

import com.hencoder.hencoderpracticedraw2.R;

public class Practice06LightingColorFilterView extends View {
    Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
    Bitmap bitmap;

    public Practice06LightingColorFilterView(Context context) {
        super(context);
    }

    public Practice06LightingColorFilterView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice06LightingColorFilterView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    {
        bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.batman);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        // 详细的像素，它的计算过程就是： https://juejin.im/post/596baf5f6fb9a06bb15a3df9
        // 使用 Paint.setColorFilter() 来设置 LightingColorFilter
        // 模拟简单的光照效果
        /**
         * R' = R * 0x0 / 0xff + 0x0 = 0 // 红色被移除
         * G' = G * 0xff / 0xff + 0x0 = G
         * B' = B * 0xff / 0xff + 0x0 = B
         */
        paint.setColorFilter(new LightingColorFilter(0x00ffff, 0x000000)); //如果你想去掉原像素中的红色，可以把它的 mul 改为 0x00ffff （红色部分为 0 ）
        // 第一个 LightingColorFilter：去掉红色部分
        canvas.drawBitmap(bitmap, 0, 0, paint);

        /**
         * R' = R * 0xff / 0xff + 0x0 = R
         * G' = G * 0xff / 0xff + 0x30 = G + 0x30 // 绿色被加强
         * B' = B * 0xff / 0xff + 0x0 = B
         */
        paint.setColorFilter(new LightingColorFilter(0xffffff, 0x003000));
        // 第二个 LightingColorFilter：增强绿色部分
        canvas.drawBitmap(bitmap, bitmap.getWidth() + 100, 0, paint);

        // PorterDuffColorFilter , 增加一个单色的 ColorFilter
        paint.setColorFilter(new PorterDuffColorFilter(Color.RED, PorterDuff.Mode.SCREEN));
        canvas.drawBitmap(bitmap, 0, bitmap.getHeight() + 10, paint);
    }
}
