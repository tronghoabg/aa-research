package androidx.graphics.shapes;

import androidx.collection.FloatFloatPair;
import h.g.a.a;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class Utils {
    public static final float AngleEpsilon = 1.0E-6f;
    public static final boolean DEBUG = false;
    public static final float DistanceEpsilon = 1.0E-4f;
    public static final float RelaxedDistanceEpsilon = 0.005f;
    private static final long Zero = FloatFloatPair.m1675constructorimpl(0.0f, 0.0f);
    private static final float FloatPi = 3.1415927f;
    private static final float TwoPi = 6.2831855f;

    public static final boolean collinearIsh(float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        long jM11975rotate90DnnuFBc = m11975rotate90DnnuFBc(FloatFloatPair.m1675constructorimpl(f4 - f2, f5 - f3));
        long jM1675constructorimpl = FloatFloatPair.m1675constructorimpl(f6 - f2, f7 - f3);
        float fAbs = Math.abs(PointKt.m11936dotProductybeJwSQ(jM11975rotate90DnnuFBc, jM1675constructorimpl));
        return fAbs < f8 || fAbs < (PointKt.m11938getDistanceDnnuFBc(jM11975rotate90DnnuFBc) * f8) * PointKt.m11938getDistanceDnnuFBc(jM1675constructorimpl);
    }

    public static /* synthetic */ boolean collinearIsh$default(float f2, float f3, float f4, float f5, float f6, float f7, float f8, int i2, Object obj) {
        if ((i2 & 64) != 0) {
            f8 = 1.0E-4f;
        }
        return collinearIsh(f2, f3, f4, f5, f6, f7, f8);
    }

    /* renamed from: convex-b22R3LQ, reason: not valid java name */
    public static final boolean m11972convexb22R3LQ(long j2, long j3, long j4) {
        return PointKt.m11931clockwiseybeJwSQ(PointKt.m11943minusybeJwSQ(j3, j2), PointKt.m11943minusybeJwSQ(j4, j3));
    }

    public static final void debugLog(String str, a<String> aVar) {
        x.f(str, "tag");
        x.f(aVar, "messageFactory");
    }

    public static final long directionVector(float f2, float f3) {
        float fDistance = distance(f2, f3);
        if (fDistance > 0.0f) {
            return FloatFloatPair.m1675constructorimpl(f2 / fDistance, f3 / fDistance);
        }
        throw new IllegalArgumentException("Required distance greater than zero");
    }

    public static final float distance(float f2, float f3) {
        return (float) Math.sqrt((f2 * f2) + (f3 * f3));
    }

    public static final float distanceSquared(float f2, float f3) {
        return (f2 * f2) + (f3 * f3);
    }

    public static final float findMinimum(float f2, float f3, float f4, FindMinimumFunction findMinimumFunction) {
        x.f(findMinimumFunction, "f");
        while (f3 - f2 > f4) {
            float f5 = ((f2 + f2) + f3) / 3.0f;
            float f6 = ((f3 + f3) + f2) / 3.0f;
            if (findMinimumFunction.invoke(f5) < findMinimumFunction.invoke(f6)) {
                f3 = f6;
            } else {
                f2 = f5;
            }
        }
        return (f2 + f3) / 2.0f;
    }

    public static /* synthetic */ float findMinimum$default(float f2, float f3, float f4, FindMinimumFunction findMinimumFunction, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            f4 = 0.001f;
        }
        return findMinimum(f2, f3, f4, findMinimumFunction);
    }

    public static final float getFloatPi() {
        return FloatPi;
    }

    public static final float getTwoPi() {
        return TwoPi;
    }

    public static final long getZero() {
        return Zero;
    }

    public static final float interpolate(float f2, float f3, float f4) {
        return ((1.0f - f4) * f2) + (f4 * f3);
    }

    public static final float positiveModulo(float f2, float f3) {
        return ((f2 % f3) + f3) % f3;
    }

    /* renamed from: radialToCartesian-L6JJ3z0, reason: not valid java name */
    public static final long m11973radialToCartesianL6JJ3z0(float f2, float f3, long j2) {
        return PointKt.m11944plusybeJwSQ(PointKt.m11946timesso9K2fw(directionVector(f3), f2), j2);
    }

    /* renamed from: radialToCartesian-L6JJ3z0$default, reason: not valid java name */
    public static /* synthetic */ long m11974radialToCartesianL6JJ3z0$default(float f2, float f3, long j2, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            j2 = Zero;
        }
        return m11973radialToCartesianL6JJ3z0(f2, f3, j2);
    }

    /* renamed from: rotate90-DnnuFBc, reason: not valid java name */
    public static final long m11975rotate90DnnuFBc(long j2) {
        return FloatFloatPair.m1675constructorimpl(-PointKt.m11941getYDnnuFBc(j2), PointKt.m11940getXDnnuFBc(j2));
    }

    public static final float square(float f2) {
        return f2 * f2;
    }

    public static final long directionVector(float f2) {
        double d2 = f2;
        return FloatFloatPair.m1675constructorimpl((float) Math.cos(d2), (float) Math.sin(d2));
    }
}
