package com.carstream.tech.launcher;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import java.io.ByteArrayOutputStream;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class CarBarArt {
    static final int H = 160;
    static final String[] LABELS_ONE = {"Quay lại", "Chạy nền", "Đóng", "Chia đôi", "Cài đặt"};
    static final String[] LABELS_SPLIT = {"Quay lại", "Chạy nền", "Đóng", "Một màn", "Cài đặt"};
    private static final int NBTN = 5;
    private static final float U = 2.5f;
    static final int W = 1550;

    private CarBarArt() {
    }

    private static void banhRang(Canvas canvas, Paint paint, float f, float f2, float f3) {
        float f4 = 0.9f * f3;
        float f5 = 0.6f * f3;
        RectF rectF = new RectF(f - f4, f2 - f4, f + f4, f4 + f2);
        RectF rectF2 = new RectF(f - f5, f2 - f5, f + f5, f5 + f2);
        Path path = new Path();
        int i = 0;
        while (i < 8) {
            float f6 = i * 45.0f;
            path.arcTo(rectF, f6 - 13.0f, 26.0f, i == 0);
            path.arcTo(rectF2, f6 + 13.0f, 19.0f, false);
            i++;
        }
        path.close();
        canvas.drawPath(path, paint);
        canvas.drawCircle(f, f2, f3 * 0.26f, paint);
    }

    private static float dp(float f) {
        return f * U;
    }

    private static Bitmap draw(boolean z) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(W, H, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint(1);
        paint.setColor(-233038818);
        canvas.drawRoundRect(new RectF(0.0f, 0.0f, 1550.0f, 160.0f), 80.0f, 80.0f, paint);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(dp(1.0f));
        paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, 160.0f, 788529151, 184549375, Shader.TileMode.CLAMP));
        canvas.drawRoundRect(new RectF(dp(0.5f), dp(0.5f), 1550.0f - dp(0.5f), 160.0f - dp(0.5f)), 80.0f, 80.0f, paint);
        paint.setShader(null);
        paint.setStyle(Paint.Style.FILL);
        String[] strArr = z ? LABELS_SPLIT : LABELS_ONE;
        int i = 0;
        while (i < 5) {
            float f = 155.0f + (310.0f * i);
            int i2 = i == 2 ? -47814 : -855305;
            veIcon(canvas, paint, i, z, f, 59.2f, dp(11.0f), i2);
            int i3 = i;
            label(canvas, paint, strArr[i3], f, 130.4f, i2);
            i = i3 + 1;
        }
        return bitmapCreateBitmap;
    }

    private static void label(Canvas canvas, Paint paint, String str, float f, float f2, int i) {
        paint.setStyle(Paint.Style.FILL);
        paint.setShader(null);
        paint.setColor(i);
        paint.setTextSize(dp(12.0f));
        paint.setTextAlign(Paint.Align.CENTER);
        paint.setTypeface(Typeface.create("sans-serif-medium", 0));
        paint.setLetterSpacing(0.01f);
        canvas.drawText(str, f, f2, paint);
    }

    public static byte[] png(boolean z) {
        Bitmap bitmapDraw = draw(z);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(40000);
        bitmapDraw.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        bitmapDraw.recycle();
        return byteArrayOutputStream.toByteArray();
    }

    public static void veIcon(Canvas canvas, Paint paint, int i, boolean z, float f, float f2, float f3, int i2) {
        paint.setColor(i2);
        paint.setStrokeWidth(0.185f * f3);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStyle(Paint.Style.STROKE);
        paint.setShader(null);
        if (i == 0) {
            paint.setStrokeWidth(0.2f * f3);
            Path path = new Path();
            float f4 = 0.25f * f3;
            float f5 = f + f4;
            float f6 = f3 * 0.5f;
            path.moveTo(f5, f2 + f6);
            path.lineTo(f - f4, f2);
            path.lineTo(f5, f2 - f6);
            canvas.drawPath(path, paint);
            return;
        }
        if (i == 1) {
            Path path2 = new Path();
            float f7 = 0.75f * f3;
            float f8 = f2 - (0.125f * f3);
            path2.moveTo(f - f7, f8);
            path2.lineTo(f, f2 - f7);
            path2.lineTo(f + f7, f8);
            canvas.drawPath(path2, paint);
            Path path3 = new Path();
            float f9 = 0.583f * f3;
            float f10 = f - f9;
            float f11 = f2 - (f3 * 0.208f);
            path3.moveTo(f10, f11);
            float f12 = f2 + f7;
            path3.lineTo(f10, f12);
            float f13 = f + f9;
            path3.lineTo(f13, f12);
            path3.lineTo(f13, f11);
            canvas.drawPath(path3, paint);
            return;
        }
        if (i == 2) {
            float f14 = 0.62f * f3;
            float f15 = f - f14;
            float f16 = f2 - f14;
            float f17 = f + f14;
            float f18 = f14 + f2;
            canvas.drawLine(f15, f16, f17, f18, paint);
            canvas.drawLine(f17, f16, f15, f18, paint);
            return;
        }
        if (i != 3) {
            banhRang(canvas, paint, f, f2, f3);
            return;
        }
        float f19 = 0.88f * f3;
        float f20 = 0.66f * f3;
        float f21 = f2 - f20;
        float f22 = f2 + f20;
        float f23 = f3 * 0.24f;
        canvas.drawRoundRect(new RectF(f - f19, f21, f19 + f, f22), f23, f23, paint);
        if (z) {
            return;
        }
        canvas.drawLine(f, f21, f, f22, paint);
    }
}
