package com.airbnb.lottie.g;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.provider.Settings;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f2415a = 0;

    /* renamed from: b, reason: collision with root package name */
    private static final ThreadLocal f2416b = new g();

    /* renamed from: c, reason: collision with root package name */
    private static final ThreadLocal f2417c = new h();

    /* renamed from: d, reason: collision with root package name */
    private static final ThreadLocal f2418d = new i();

    /* renamed from: e, reason: collision with root package name */
    private static final ThreadLocal f2419e = new j();

    /* renamed from: f, reason: collision with root package name */
    private static final float f2420f = (float) (Math.sqrt(2.0d) / 2.0d);

    public static float a() {
        return Resources.getSystem().getDisplayMetrics().density;
    }

    public static float b(Context context) {
        return Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f);
    }

    public static float c(Matrix matrix) {
        float[] fArr = (float[]) f2419e.get();
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        float f2 = f2420f;
        fArr[2] = f2;
        fArr[3] = f2;
        matrix.mapPoints(fArr);
        return (float) Math.hypot(fArr[2] - fArr[0], fArr[3] - fArr[1]);
    }

    public static Bitmap d(Bitmap bitmap, int i2, int i3) {
        if (bitmap.getWidth() == i2 && bitmap.getHeight() == i3) {
            return bitmap;
        }
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, i2, i3, true);
        bitmap.recycle();
        return bitmapCreateScaledBitmap;
    }

    public static void e(Path path, float f2, float f3, float f4) {
        PathMeasure pathMeasure = (PathMeasure) f2416b.get();
        Path path2 = (Path) f2417c.get();
        Path path3 = (Path) f2418d.get();
        pathMeasure.setPath(path, false);
        float length = pathMeasure.getLength();
        if (!(f2 == 1.0f && f3 == 0.0f) && length >= 1.0f && Math.abs((f3 - f2) - 1.0f) >= 0.01d) {
            float f5 = f2 * length;
            float f6 = f3 * length;
            float f7 = f4 * length;
            float fMin = Math.min(f5, f6) + f7;
            float fMax = Math.max(f5, f6) + f7;
            if (fMin >= length && fMax >= length) {
                fMin = f.a(fMin, length);
                fMax = f.a(fMax, length);
            }
            if (fMin < 0.0f) {
                fMin = f.a(fMin, length);
            }
            if (fMax < 0.0f) {
                fMax = f.a(fMax, length);
            }
            if (fMin == fMax) {
                path.reset();
                return;
            }
            if (fMin >= fMax) {
                fMin -= length;
            }
            path2.reset();
            pathMeasure.getSegment(fMin, fMax, path2, true);
            if (fMax > length) {
                path3.reset();
                pathMeasure.getSegment(0.0f, fMax % length, path3, true);
                path2.addPath(path3);
            } else if (fMin < 0.0f) {
                path3.reset();
                pathMeasure.getSegment(fMin + length, length, path3, true);
                path2.addPath(path3);
            }
            path.set(path2);
        }
    }

    public static boolean f(Matrix matrix) {
        float[] fArr = (float[]) f2419e.get();
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        fArr[2] = 37394.73f;
        fArr[3] = 39575.234f;
        matrix.mapPoints(fArr);
        return fArr[0] == fArr[2] || fArr[1] == fArr[3];
    }
}
