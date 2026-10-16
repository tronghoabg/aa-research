package com.bumptech.glide.load.c.a;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.util.Log;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class as {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f3324a = 0;

    /* renamed from: b, reason: collision with root package name */
    private static final Paint f3325b = new Paint(6);

    /* renamed from: c, reason: collision with root package name */
    private static final Paint f3326c = new Paint(7);

    /* renamed from: d, reason: collision with root package name */
    private static final Paint f3327d;

    /* renamed from: e, reason: collision with root package name */
    private static final Set f3328e;

    /* renamed from: f, reason: collision with root package name */
    private static final Lock f3329f;

    static {
        HashSet hashSet = new HashSet(Arrays.asList("XT1085", "XT1092", "XT1093", "XT1094", "XT1095", "XT1096", "XT1097", "XT1098", "XT1031", "XT1028", "XT937C", "XT1032", "XT1008", "XT1033", "XT1035", "XT1034", "XT939G", "XT1039", "XT1040", "XT1042", "XT1045", "XT1063", "XT1064", "XT1068", "XT1069", "XT1072", "XT1077", "XT1078", "XT1079"));
        f3328e = hashSet;
        f3329f = hashSet.contains(Build.MODEL) ? new ReentrantLock() : new ar();
        Paint paint = new Paint(7);
        f3327d = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
    }

    public static Bitmap a(com.bumptech.glide.load.a.a.c cVar, Bitmap bitmap, int i2, int i3) {
        float height;
        float f2;
        if (bitmap.getWidth() == i2 && bitmap.getHeight() == i3) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        float f3 = i3;
        float f4 = i2;
        float width = 0.0f;
        if (bitmap.getWidth() * i3 > bitmap.getHeight() * i2) {
            height = f3 / bitmap.getHeight();
            f2 = 0.0f;
            width = (f4 - (bitmap.getWidth() * height)) * 0.5f;
        } else {
            float width2 = f4 / bitmap.getWidth();
            float height2 = (f3 - (bitmap.getHeight() * width2)) * 0.5f;
            height = width2;
            f2 = height2;
        }
        matrix.setScale(height, height);
        matrix.postTranslate((int) (width + 0.5f), (int) (f2 + 0.5f));
        Bitmap bitmapA = cVar.a(i2, i3, h(bitmap));
        e(bitmap, bitmapA);
        i(bitmap, bitmapA, matrix);
        if (bitmapA != null && !bitmapA.equals(bitmap) && ((bitmapA.getWidth() != bitmap.getWidth() || bitmapA.getHeight() != bitmap.getHeight()) && Log.isLoggable("GlideMemoryTracking", 3))) {
            com.bumptech.glide.g.r.p("TransformationUtils [centerCrop]", null, bitmapA, bitmap.getWidth(), bitmap.getHeight());
        }
        return bitmapA;
    }

    public static Bitmap b(com.bumptech.glide.load.a.a.c cVar, Bitmap bitmap, int i2, int i3) {
        Bitmap bitmapA;
        int iMin = Math.min(i2, i3);
        float f2 = iMin;
        float width = bitmap.getWidth();
        float height = bitmap.getHeight();
        float fMax = Math.max(f2 / width, f2 / height);
        float f3 = width * fMax;
        float f4 = fMax * height;
        float f5 = (f2 - f3) / 2.0f;
        float f6 = (f2 - f4) / 2.0f;
        RectF rectF = new RectF(f5, f6, f3 + f5, f4 + f6);
        Bitmap.Config configG = g(bitmap);
        float f7 = f2 / 2.0f;
        if (configG.equals(bitmap.getConfig())) {
            bitmapA = bitmap;
        } else {
            bitmapA = cVar.a(bitmap.getWidth(), bitmap.getHeight(), configG);
            new Canvas(bitmapA).drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        }
        Bitmap bitmapA2 = cVar.a(iMin, iMin, g(bitmap));
        bitmapA2.setHasAlpha(true);
        Lock lock = f3329f;
        lock.lock();
        try {
            Canvas canvas = new Canvas(bitmapA2);
            canvas.drawCircle(f7, f7, f7, f3326c);
            canvas.drawBitmap(bitmapA, (Rect) null, rectF, f3327d);
            j(canvas);
            lock.unlock();
            if (!bitmapA.equals(bitmap)) {
                cVar.d(bitmapA);
            }
            return bitmapA2;
        } catch (Throwable th) {
            f3329f.unlock();
            throw th;
        }
    }

    public static Bitmap c(com.bumptech.glide.load.a.a.c cVar, Bitmap bitmap, int i2, int i3) {
        if (bitmap.getWidth() != i2 || bitmap.getHeight() != i3) {
            float fMin = Math.min(i2 / bitmap.getWidth(), i3 / bitmap.getHeight());
            int iRound = Math.round(bitmap.getWidth() * fMin);
            int iRound2 = Math.round(bitmap.getHeight() * fMin);
            if (bitmap.getWidth() != iRound || bitmap.getHeight() != iRound2) {
                Bitmap bitmapA = cVar.a((int) (bitmap.getWidth() * fMin), (int) (bitmap.getHeight() * fMin), h(bitmap));
                e(bitmap, bitmapA);
                if (Log.isLoggable("TransformationUtils", 2)) {
                    Log.v("TransformationUtils", "request: " + i2 + "x" + i3);
                    Log.v("TransformationUtils", "toFit:   " + bitmap.getWidth() + "x" + bitmap.getHeight());
                    Log.v("TransformationUtils", "toReuse: " + bitmapA.getWidth() + "x" + bitmapA.getHeight());
                    StringBuilder sb = new StringBuilder("minPct:   ");
                    sb.append(fMin);
                    Log.v("TransformationUtils", sb.toString());
                }
                Matrix matrix = new Matrix();
                matrix.setScale(fMin, fMin);
                i(bitmap, bitmapA, matrix);
                if (bitmapA != null && !bitmapA.equals(bitmap) && ((bitmapA.getWidth() != bitmap.getWidth() || bitmapA.getHeight() != bitmap.getHeight()) && Log.isLoggable("GlideMemoryTracking", 3))) {
                    com.bumptech.glide.g.r.p("TransformationUtils [fitCenter]", null, bitmapA, bitmap.getWidth(), bitmap.getHeight());
                }
                return bitmapA;
            }
            if (Log.isLoggable("TransformationUtils", 2)) {
                Log.v("TransformationUtils", "adjusted target size matches input, returning input");
            }
        } else if (Log.isLoggable("TransformationUtils", 2)) {
            Log.v("TransformationUtils", "requested target size matches input, returning input");
            return bitmap;
        }
        return bitmap;
    }

    public static Lock d() {
        return f3329f;
    }

    public static void e(Bitmap bitmap, Bitmap bitmap2) {
        bitmap2.setHasAlpha(bitmap.hasAlpha());
    }

    public static boolean f(int i2) {
        switch (i2) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return true;
            default:
                return false;
        }
    }

    private static Bitmap.Config g(Bitmap bitmap) {
        return Bitmap.Config.RGBA_F16.equals(bitmap.getConfig()) ? Bitmap.Config.RGBA_F16 : Bitmap.Config.ARGB_8888;
    }

    private static Bitmap.Config h(Bitmap bitmap) {
        return bitmap.getConfig() != null ? bitmap.getConfig() : Bitmap.Config.ARGB_8888;
    }

    private static void i(Bitmap bitmap, Bitmap bitmap2, Matrix matrix) {
        Lock lock = f3329f;
        lock.lock();
        try {
            Canvas canvas = new Canvas(bitmap2);
            canvas.drawBitmap(bitmap, matrix, f3325b);
            j(canvas);
            lock.unlock();
        } catch (Throwable th) {
            f3329f.unlock();
            throw th;
        }
    }

    private static void j(Canvas canvas) {
        canvas.setBitmap(null);
    }
}
