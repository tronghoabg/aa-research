package com.carstream.tech.launcher;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import defpackage.ad;
import java.io.ByteArrayOutputStream;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class NotiArt {
    public static final int H = 184;
    private static final float U = 2.0f;
    public static final int W = 1400;
    public static final float X_FRAC = 0.092f;

    private NotiArt() {
    }

    private static String cat(Paint paint, String str, float f) {
        if (str == null) {
            return "";
        }
        String strTrim = str.replace('\n', ' ').trim();
        if (paint.measureText(strTrim) <= f) {
            return strTrim;
        }
        int length = strTrim.length();
        int i = 0;
        while (i < length) {
            int i2 = ((i + length) + 1) / 2;
            if (paint.measureText(strTrim.substring(0, i2) + "…") <= f) {
                i = i2;
            } else {
                length = i2 - 1;
            }
        }
        return ad.c(strTrim.substring(0, i), "…");
    }

    private static float dp(float f) {
        return f * U;
    }

    private static Bitmap draw(Drawable drawable, String str, String str2) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(W, H, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint(1);
        float fDp = dp(20.0f);
        paint.setColor(-233038818);
        canvas.drawRoundRect(new RectF(0.0f, 0.0f, 1400.0f, 184.0f), fDp, fDp, paint);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(dp(1.0f));
        paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, 184.0f, 788529151, 184549375, Shader.TileMode.CLAMP));
        canvas.drawRoundRect(new RectF(dp(0.5f), dp(0.5f), 1400.0f - dp(0.5f), 184.0f - dp(0.5f)), fDp, fDp, paint);
        paint.setShader(null);
        paint.setStyle(Paint.Style.FILL);
        float fDp2 = dp(14.0f);
        float f = 184.0f - (fDp2 * U);
        if (drawable != null) {
            try {
                int i = (int) fDp2;
                float f2 = fDp2 + f;
                int i2 = (int) f2;
                drawable.setBounds(new Rect(i, i, i2, i2));
                int iSave = canvas.save();
                Path path = new Path();
                path.addRoundRect(new RectF(fDp2, fDp2, f2, f2), dp(14.0f), dp(14.0f), Path.Direction.CW);
                canvas.clipPath(path);
                drawable.draw(canvas);
                canvas.restoreToCount(iSave);
            } catch (Throwable unused) {
            }
        }
        float fDp3 = fDp2 + f + dp(14.0f);
        float fDp4 = (1271.2f - fDp3) - dp(8.0f);
        paint.setColor(-855305);
        paint.setTextSize(dp(16.0f));
        paint.setTypeface(Typeface.create("sans-serif-medium", 1));
        canvas.drawText(cat(paint, str, fDp4), fDp3, 80.96f, paint);
        paint.setColor(-6645088);
        paint.setTextSize(dp(14.0f));
        paint.setTypeface(Typeface.create("sans-serif", 0));
        canvas.drawText(cat(paint, str2, fDp4), fDp3, 132.48001f, paint);
        float fDp5 = dp(9.0f);
        paint.setColor(536870911);
        canvas.drawCircle(1335.6f, 92.0f, dp(17.0f), paint);
        paint.setColor(-855305);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(dp(U));
        paint.setStrokeCap(Paint.Cap.ROUND);
        float f3 = 1335.6f - fDp5;
        float f4 = 92.0f - fDp5;
        float f5 = 1335.6f + fDp5;
        float f6 = fDp5 + 92.0f;
        canvas.drawLine(f3, f4, f5, f6, paint);
        canvas.drawLine(f5, f4, f3, f6, paint);
        return bitmapCreateBitmap;
    }

    public static byte[] png(Drawable drawable, String str, String str2) {
        Bitmap bitmapDraw = draw(drawable, str, str2);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(30000);
        bitmapDraw.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        bitmapDraw.recycle();
        return byteArrayOutputStream.toByteArray();
    }
}
