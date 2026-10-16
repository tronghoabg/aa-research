package com.bytedance.adsdk.oa.ivm;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.graphics.RectF;
import android.provider.Settings;
import com.bytedance.adsdk.oa.uef.uef.tpx;
import com.unity3d.services.UnityAdsConstants;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import java.nio.channels.ClosedChannelException;
import javax.net.ssl.SSLException;

/* loaded from: classes.dex */
public final class ivm {
    private static final ThreadLocal<PathMeasure> uef = new ThreadLocal<PathMeasure>() { // from class: com.bytedance.adsdk.oa.ivm.ivm.1
        @Override // java.lang.ThreadLocal
        /* renamed from: uef, reason: merged with bridge method [inline-methods] */
        public PathMeasure initialValue() {
            return new PathMeasure();
        }
    };

    /* renamed from: oa, reason: collision with root package name */
    private static final ThreadLocal<Path> f24558oa = new ThreadLocal<Path>() { // from class: com.bytedance.adsdk.oa.ivm.ivm.2
        @Override // java.lang.ThreadLocal
        /* renamed from: uef, reason: merged with bridge method [inline-methods] */
        public Path initialValue() {
            return new Path();
        }
    };
    private static final ThreadLocal<Path> yo = new ThreadLocal<Path>() { // from class: com.bytedance.adsdk.oa.ivm.ivm.3
        @Override // java.lang.ThreadLocal
        /* renamed from: uef, reason: merged with bridge method [inline-methods] */
        public Path initialValue() {
            return new Path();
        }
    };
    private static final ThreadLocal<float[]> moa = new ThreadLocal<float[]>() { // from class: com.bytedance.adsdk.oa.ivm.ivm.4
        @Override // java.lang.ThreadLocal
        /* renamed from: uef, reason: merged with bridge method [inline-methods] */
        public float[] initialValue() {
            return new float[4];
        }
    };
    private static final float lw = (float) (Math.sqrt(2.0d) / 2.0d);

    public static boolean oa(Matrix matrix) {
        float[] fArr = moa.get();
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        fArr[2] = 37394.73f;
        fArr[3] = 39575.234f;
        matrix.mapPoints(fArr);
        return fArr[0] == fArr[2] || fArr[1] == fArr[3];
    }

    public static int uef(float f10, float f11, float f12, float f13) {
        int i5 = f10 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? (int) (f10 * 527.0f) : 17;
        if (f11 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            i5 = (int) (i5 * 31 * f11);
        }
        if (f12 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            i5 = (int) (i5 * 31 * f12);
        }
        return f13 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? (int) (i5 * 31 * f13) : i5;
    }

    public static boolean uef(int i5, int i10, int i11, int i12, int i13, int i14) {
        if (i5 < i12) {
            return false;
        }
        if (i5 > i12) {
            return true;
        }
        if (i10 < i13) {
            return false;
        }
        return i10 > i13 || i11 >= i14;
    }

    public static Path uef(PointF pointF, PointF pointF2, PointF pointF3, PointF pointF4) {
        Path path = new Path();
        path.moveTo(pointF.x, pointF.y);
        if (pointF3 != null && pointF4 != null && (pointF3.length() != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || pointF4.length() != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)) {
            float f10 = pointF.x + pointF3.x;
            float f11 = pointF.y + pointF3.y;
            float f12 = pointF2.x;
            float f13 = f12 + pointF4.x;
            float f14 = pointF2.y;
            path.cubicTo(f10, f11, f13, f14 + pointF4.y, f12, f14);
            return path;
        }
        path.lineTo(pointF2.x, pointF2.y);
        return path;
    }

    public static void uef(Closeable closeable) throws IOException {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e7) {
                throw e7;
            } catch (Exception unused) {
            }
        }
    }

    public static float uef(Matrix matrix) {
        float[] fArr = moa.get();
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        float f10 = lw;
        fArr[2] = f10;
        fArr[3] = f10;
        matrix.mapPoints(fArr);
        return (float) Math.hypot(fArr[2] - fArr[0], fArr[3] - fArr[1]);
    }

    public static void uef(Path path, tpx tpxVar) {
        if (tpxVar == null || tpxVar.ivm()) {
            return;
        }
        uef(path, ((com.bytedance.adsdk.oa.uef.oa.moa) tpxVar.yo()).cz() / 100.0f, ((com.bytedance.adsdk.oa.uef.oa.moa) tpxVar.moa()).cz() / 100.0f, ((com.bytedance.adsdk.oa.uef.oa.moa) tpxVar.lw()).cz() / 360.0f);
    }

    public static void uef(Path path, float f10, float f11, float f12) {
        com.bytedance.adsdk.oa.lw.uef("applyTrimPathIfNeeded");
        PathMeasure pathMeasure = uef.get();
        Path path2 = f24558oa.get();
        Path path3 = yo.get();
        pathMeasure.setPath(path, false);
        float length = pathMeasure.getLength();
        if (f10 == 1.0f && f11 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            com.bytedance.adsdk.oa.lw.oa("applyTrimPathIfNeeded");
            return;
        }
        if (length >= 1.0f && Math.abs((f11 - f10) - 1.0f) >= 0.01d) {
            float f13 = f10 * length;
            float f14 = f11 * length;
            float f15 = f12 * length;
            float fMin = Math.min(f13, f14) + f15;
            float fMax = Math.max(f13, f14) + f15;
            if (fMin >= length && fMax >= length) {
                fMin = lw.uef(fMin, length);
                fMax = lw.uef(fMax, length);
            }
            if (fMin < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                fMin = lw.uef(fMin, length);
            }
            if (fMax < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                fMax = lw.uef(fMax, length);
            }
            if (fMin == fMax) {
                path.reset();
                com.bytedance.adsdk.oa.lw.oa("applyTrimPathIfNeeded");
                return;
            }
            if (fMin >= fMax) {
                fMin -= length;
            }
            path2.reset();
            pathMeasure.getSegment(fMin, fMax, path2, true);
            if (fMax > length) {
                path3.reset();
                pathMeasure.getSegment(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, fMax % length, path3, true);
                path2.addPath(path3);
            } else if (fMin < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                path3.reset();
                pathMeasure.getSegment(fMin + length, length, path3, true);
                path2.addPath(path3);
            }
            path.set(path2);
            com.bytedance.adsdk.oa.lw.oa("applyTrimPathIfNeeded");
            return;
        }
        com.bytedance.adsdk.oa.lw.oa("applyTrimPathIfNeeded");
    }

    public static float uef() {
        return Resources.getSystem().getDisplayMetrics().density;
    }

    public static float uef(Context context) {
        return Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f);
    }

    public static Bitmap uef(Bitmap bitmap, int i5, int i10) {
        if (bitmap.getWidth() == i5 && bitmap.getHeight() == i10) {
            return bitmap;
        }
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, i5, i10, true);
        bitmap.recycle();
        return bitmapCreateScaledBitmap;
    }

    public static boolean uef(Throwable th) {
        return (th instanceof SocketException) || (th instanceof ClosedChannelException) || (th instanceof InterruptedIOException) || (th instanceof ProtocolException) || (th instanceof SSLException) || (th instanceof UnknownHostException) || (th instanceof UnknownServiceException);
    }

    public static void uef(Canvas canvas, RectF rectF, Paint paint) {
        uef(canvas, rectF, paint, 31);
    }

    public static void uef(Canvas canvas, RectF rectF, Paint paint, int i5) {
        com.bytedance.adsdk.oa.lw.uef("Utils#saveLayer");
        canvas.saveLayer(rectF, paint);
        com.bytedance.adsdk.oa.lw.oa("Utils#saveLayer");
    }
}
