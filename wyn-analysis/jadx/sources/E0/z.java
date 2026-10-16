package e0;

import U8.v0;
import ad.C1355I;
import android.graphics.Bitmap;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.os.Build;
import c7.C1576l;
import com.applovin.shadow.okhttp3.internal.ws.WebSocketProtocol;
import com.unity3d.services.UnityAdsConstants;
import d0.C2383b;
import d0.C2384c;
import f0.AbstractC2546b;
import f0.AbstractC2547c;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes.dex */
public abstract class z {

    /* renamed from: a, reason: collision with root package name */
    public static final C1355I f34394a = new C1355I(5);

    /* renamed from: b, reason: collision with root package name */
    public static Method f34395b;

    /* renamed from: c, reason: collision with root package name */
    public static Method f34396c;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f34397d;

    public static final long a(float f10, float f11, float f12, float f13, AbstractC2547c colorSpace) {
        AbstractC3340k.e(colorSpace, "colorSpace");
        float fC = colorSpace.c(0);
        if (f10 <= colorSpace.b(0) && fC <= f10) {
            float fC2 = colorSpace.c(1);
            if (f11 <= colorSpace.b(1) && fC2 <= f11) {
                float fC3 = colorSpace.c(2);
                if (f12 <= colorSpace.b(2) && fC3 <= f12 && UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT <= f13 && f13 <= 1.0f) {
                    if (colorSpace.d()) {
                        long j8 = (((((((int) ((f10 * 255.0f) + 0.5f)) << 16) | (((int) ((f13 * 255.0f) + 0.5f)) << 24)) | (((int) ((f11 * 255.0f) + 0.5f)) << 8)) | ((int) ((f12 * 255.0f) + 0.5f))) & 4294967295L) << 32;
                        int i5 = C2465q.f34381j;
                        return j8;
                    }
                    int i10 = AbstractC2546b.f34737e;
                    if (((int) (colorSpace.f34739b >> 32)) != 3) {
                        throw new IllegalArgumentException("Color only works with ColorSpaces with 3 components");
                    }
                    int i11 = colorSpace.f34740c;
                    if (i11 == -1) {
                        throw new IllegalArgumentException("Unknown color space, please use a color space in ColorSpaces");
                    }
                    short sA = s.a(f10);
                    long jA = ((s.a(f11) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 32) | ((sA & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 48) | ((s.a(f12) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 16) | ((((int) ((Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, Math.min(f13, 1.0f)) * 1023.0f) + 0.5f)) & 1023) << 6) | (i11 & 63);
                    int i12 = C2465q.f34381j;
                    return jA;
                }
            }
        }
        throw new IllegalArgumentException(("red = " + f10 + ", green = " + f11 + ", blue = " + f12 + ", alpha = " + f13 + " outside the range for " + colorSpace).toString());
    }

    public static final long b(int i5) {
        long j8 = i5 << 32;
        int i10 = C2465q.f34381j;
        return j8;
    }

    public static final long c(long j8) {
        long j10 = (j8 & 4294967295L) << 32;
        int i5 = C2465q.f34381j;
        return j10;
    }

    public static final C1576l d() {
        C1576l c1576l = new C1576l();
        c1576l.f19706b = new Paint(7);
        c1576l.f19705a = 3;
        return c1576l;
    }

    public static final C2454f e() {
        return new C2454f(new Path());
    }

    public static final Bitmap f(C2452d c2452d) {
        AbstractC3340k.e(c2452d, "<this>");
        if (c2452d instanceof C2452d) {
            return c2452d.f34361a;
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Bitmap");
    }

    public static final long g(long j8, long j10) {
        AbstractC2547c colorSpace = C2465q.e(j10);
        AbstractC3340k.e(colorSpace, "colorSpace");
        if (!colorSpace.equals(C2465q.e(j8))) {
            G9.e eVarF = f0.h.f(C2465q.e(j8), colorSpace, 2);
            float[] fArr = {C2465q.g(j8), C2465q.f(j8), C2465q.d(j8), C2465q.c(j8)};
            eVarF.G(fArr);
            j8 = a(fArr[0], fArr[1], fArr[2], fArr[3], colorSpace);
        }
        float fC = C2465q.c(j10);
        float fC2 = C2465q.c(j8);
        float f10 = 1.0f - fC2;
        float f11 = (fC * f10) + fC2;
        float fG = C2465q.g(j8);
        float fG2 = C2465q.g(j10);
        float f12 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        float f13 = f11 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0.0f : (((fG2 * fC) * f10) + (fG * fC2)) / f11;
        float f14 = f11 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0.0f : (((C2465q.f(j10) * fC) * f10) + (C2465q.f(j8) * fC2)) / f11;
        float fD = C2465q.d(j8);
        float fD2 = C2465q.d(j10);
        if (f11 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            f12 = (((fD2 * fC) * f10) + (fD * fC2)) / f11;
        }
        return a(f13, f14, f12, f11, C2465q.e(j10));
    }

    public static float[] h() {
        return new float[]{1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f};
    }

    public static void i(Canvas canvas, boolean z2) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Method method;
        AbstractC3340k.e(canvas, "canvas");
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 29) {
            C2464p.f34372a.a(canvas, z2);
            return;
        }
        if (!f34397d) {
            try {
                if (i5 == 28) {
                    Method declaredMethod = Class.class.getDeclaredMethod("getDeclaredMethod", String.class, new Class[0].getClass());
                    f34395b = (Method) declaredMethod.invoke(Canvas.class, "insertReorderBarrier", new Class[0]);
                    f34396c = (Method) declaredMethod.invoke(Canvas.class, "insertInorderBarrier", new Class[0]);
                } else {
                    f34395b = Canvas.class.getDeclaredMethod("insertReorderBarrier", new Class[0]);
                    f34396c = Canvas.class.getDeclaredMethod("insertInorderBarrier", new Class[0]);
                }
                Method method2 = f34395b;
                if (method2 != null) {
                    method2.setAccessible(true);
                }
                Method method3 = f34396c;
                if (method3 != null) {
                    method3.setAccessible(true);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
            f34397d = true;
        }
        if (z2) {
            try {
                Method method4 = f34395b;
                if (method4 != null) {
                    method4.invoke(canvas, new Object[0]);
                }
            } catch (IllegalAccessException | InvocationTargetException unused2) {
                return;
            }
        }
        if (z2 || (method = f34396c) == null) {
            return;
        }
        method.invoke(canvas, new Object[0]);
    }

    public static final Z.k j(Z.k kVar, tf.l block) {
        AbstractC3340k.e(kVar, "<this>");
        AbstractC3340k.e(block, "block");
        return kVar.g(new C2460l(block));
    }

    public static Z.k k(Z.k graphicsLayer, InterfaceC2442E interfaceC2442E, int i5) {
        long j8 = C2447J.f34353b;
        if ((i5 & 2048) != 0) {
            interfaceC2442E = f34394a;
        }
        InterfaceC2442E shape = interfaceC2442E;
        boolean z2 = (i5 & 4096) == 0;
        long j10 = t.f34386a;
        AbstractC3340k.e(graphicsLayer, "$this$graphicsLayer");
        AbstractC3340k.e(shape, "shape");
        return graphicsLayer.g(new C2443F(j8, shape, z2, j10, j10));
    }

    public static final float l(long j8) {
        AbstractC2547c abstractC2547cE = C2465q.e(j8);
        if (!AbstractC2546b.a(abstractC2547cE.f34739b, AbstractC2546b.f34733a)) {
            throw new IllegalArgumentException(("The specified color must be encoded in an RGB color space. The supplied color space is " + ((Object) AbstractC2546b.b(abstractC2547cE.f34739b))).toString());
        }
        Double dValueOf = Double.valueOf(C2465q.g(j8));
        f0.m mVar = ((f0.n) abstractC2547cE).f34791n;
        double dDoubleValue = ((Number) mVar.invoke(dValueOf)).doubleValue();
        float fDoubleValue = (float) ((((Number) mVar.invoke(Double.valueOf(C2465q.d(j8)))).doubleValue() * 0.0722d) + (((Number) mVar.invoke(Double.valueOf(C2465q.f(j8)))).doubleValue() * 0.7152d) + (dDoubleValue * 0.2126d));
        if (fDoubleValue <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        if (fDoubleValue >= 1.0f) {
            return 1.0f;
        }
        return fDoubleValue;
    }

    public static final long m(long j8, float[] fArr) {
        float fB = C2384c.b(j8);
        float fC = C2384c.c(j8);
        float f10 = 1 / (((fArr[7] * fC) + (fArr[3] * fB)) + fArr[15]);
        if (Float.isInfinite(f10) || Float.isNaN(f10)) {
            f10 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        return v0.f(((fArr[4] * fC) + (fArr[0] * fB) + fArr[12]) * f10, ((fArr[5] * fC) + (fArr[1] * fB) + fArr[13]) * f10);
    }

    public static final void n(float[] fArr, C2383b c2383b) {
        long jM = m(v0.f(c2383b.f33927a, c2383b.f33928b), fArr);
        long jM2 = m(v0.f(c2383b.f33927a, c2383b.f33930d), fArr);
        long jM3 = m(v0.f(c2383b.f33929c, c2383b.f33928b), fArr);
        long jM4 = m(v0.f(c2383b.f33929c, c2383b.f33930d), fArr);
        c2383b.f33927a = Math.min(Math.min(C2384c.b(jM), C2384c.b(jM2)), Math.min(C2384c.b(jM3), C2384c.b(jM4)));
        c2383b.f33928b = Math.min(Math.min(C2384c.c(jM), C2384c.c(jM2)), Math.min(C2384c.c(jM3), C2384c.c(jM4)));
        c2383b.f33929c = Math.max(Math.max(C2384c.b(jM), C2384c.b(jM2)), Math.max(C2384c.b(jM3), C2384c.b(jM4)));
        c2383b.f33930d = Math.max(Math.max(C2384c.c(jM), C2384c.c(jM2)), Math.max(C2384c.c(jM3), C2384c.c(jM4)));
    }

    public static final void o(float[] fArr) {
        int i5 = 0;
        while (i5 < 4) {
            int i10 = 0;
            while (i10 < 4) {
                fArr[(i10 * 4) + i5] = i5 == i10 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                i10++;
            }
            i5++;
        }
    }

    public static final void p(float[] setFrom, Matrix matrix) {
        AbstractC3340k.e(setFrom, "$this$setFrom");
        AbstractC3340k.e(matrix, "matrix");
        matrix.getValues(setFrom);
        float f10 = setFrom[0];
        float f11 = setFrom[1];
        float f12 = setFrom[2];
        float f13 = setFrom[3];
        float f14 = setFrom[4];
        float f15 = setFrom[5];
        float f16 = setFrom[6];
        float f17 = setFrom[7];
        float f18 = setFrom[8];
        setFrom[0] = f10;
        setFrom[1] = f13;
        setFrom[2] = 0.0f;
        setFrom[3] = f16;
        setFrom[4] = f11;
        setFrom[5] = f14;
        setFrom[6] = 0.0f;
        setFrom[7] = f17;
        setFrom[8] = 0.0f;
        setFrom[9] = 0.0f;
        setFrom[10] = 1.0f;
        setFrom[11] = 0.0f;
        setFrom[12] = f12;
        setFrom[13] = f15;
        setFrom[14] = 0.0f;
        setFrom[15] = f18;
    }

    public static final BlendMode q(int i5) {
        return i5 == 0 ? BlendMode.CLEAR : i5 == 1 ? BlendMode.SRC : i5 == 2 ? BlendMode.DST : i5 == 3 ? BlendMode.SRC_OVER : i5 == 4 ? BlendMode.DST_OVER : i5 == 5 ? BlendMode.SRC_IN : i5 == 6 ? BlendMode.DST_IN : i5 == 7 ? BlendMode.SRC_OUT : i5 == 8 ? BlendMode.DST_OUT : i5 == 9 ? BlendMode.SRC_ATOP : i5 == 10 ? BlendMode.DST_ATOP : i5 == 11 ? BlendMode.XOR : i5 == 12 ? BlendMode.PLUS : i5 == 13 ? BlendMode.MODULATE : i5 == 14 ? BlendMode.SCREEN : i5 == 15 ? BlendMode.OVERLAY : i5 == 16 ? BlendMode.DARKEN : i5 == 17 ? BlendMode.LIGHTEN : i5 == 18 ? BlendMode.COLOR_DODGE : i5 == 19 ? BlendMode.COLOR_BURN : i5 == 20 ? BlendMode.HARD_LIGHT : i5 == 21 ? BlendMode.SOFT_LIGHT : i5 == 22 ? BlendMode.DIFFERENCE : i5 == 23 ? BlendMode.EXCLUSION : i5 == 24 ? BlendMode.MULTIPLY : i5 == 25 ? BlendMode.HUE : i5 == 26 ? BlendMode.SATURATION : i5 == 27 ? BlendMode.COLOR : i5 == 28 ? BlendMode.LUMINOSITY : BlendMode.SRC_OVER;
    }

    public static final Rect r(d0.d dVar) {
        return new Rect((int) dVar.f33937a, (int) dVar.f33938b, (int) dVar.f33939c, (int) dVar.f33940d);
    }

    public static final int s(long j8) {
        AbstractC2547c abstractC2547cE = C2465q.e(j8);
        if (abstractC2547cE.d()) {
            return (int) (j8 >>> 32);
        }
        float[] fArr = {C2465q.g(j8), C2465q.f(j8), C2465q.d(j8), C2465q.c(j8)};
        f0.h.f(abstractC2547cE, null, 3).G(fArr);
        return (((int) ((fArr[3] * 255.0f) + 0.5f)) << 24) | (((int) ((fArr[0] * 255.0f) + 0.5f)) << 16) | (((int) ((fArr[1] * 255.0f) + 0.5f)) << 8) | ((int) ((fArr[2] * 255.0f) + 0.5f));
    }

    public static final Bitmap.Config t(int i5) {
        if (i5 == 0) {
            return Bitmap.Config.ARGB_8888;
        }
        if (i5 == 1) {
            return Bitmap.Config.ALPHA_8;
        }
        if (i5 == 2) {
            return Bitmap.Config.RGB_565;
        }
        int i10 = Build.VERSION.SDK_INT;
        return (i10 < 26 || i5 != 3) ? (i10 < 26 || i5 != 4) ? Bitmap.Config.ARGB_8888 : Bitmap.Config.HARDWARE : Bitmap.Config.RGBA_F16;
    }

    public static final PorterDuff.Mode u(int i5) {
        return i5 == 0 ? PorterDuff.Mode.CLEAR : i5 == 1 ? PorterDuff.Mode.SRC : i5 == 2 ? PorterDuff.Mode.DST : i5 == 3 ? PorterDuff.Mode.SRC_OVER : i5 == 4 ? PorterDuff.Mode.DST_OVER : i5 == 5 ? PorterDuff.Mode.SRC_IN : i5 == 6 ? PorterDuff.Mode.DST_IN : i5 == 7 ? PorterDuff.Mode.SRC_OUT : i5 == 8 ? PorterDuff.Mode.DST_OUT : i5 == 9 ? PorterDuff.Mode.SRC_ATOP : i5 == 10 ? PorterDuff.Mode.DST_ATOP : i5 == 11 ? PorterDuff.Mode.XOR : i5 == 12 ? PorterDuff.Mode.ADD : i5 == 14 ? PorterDuff.Mode.SCREEN : i5 == 15 ? PorterDuff.Mode.OVERLAY : i5 == 16 ? PorterDuff.Mode.DARKEN : i5 == 17 ? PorterDuff.Mode.LIGHTEN : i5 == 13 ? PorterDuff.Mode.MULTIPLY : PorterDuff.Mode.SRC_OVER;
    }

    public static void v(float[] fArr, float f10, float f11) {
        float f12 = (fArr[8] * UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) + (fArr[4] * f11) + (fArr[0] * f10) + fArr[12];
        float f13 = (fArr[9] * UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) + (fArr[5] * f11) + (fArr[1] * f10) + fArr[13];
        float f14 = (fArr[10] * UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) + (fArr[6] * f11) + (fArr[2] * f10) + fArr[14];
        float f15 = (fArr[11] * UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) + (fArr[7] * f11) + (fArr[3] * f10) + fArr[15];
        fArr[12] = f12;
        fArr[13] = f13;
        fArr[14] = f14;
        fArr[15] = f15;
    }
}
