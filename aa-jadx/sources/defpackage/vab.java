package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class vab {
    public static final /* synthetic */ int a = 0;
    private static final float b = 1.442695f;

    public static float a(float f) {
        return ((float) java.lang.Math.log(f)) * b;
    }

    public static float b(float f) {
        float f2;
        if (java.lang.Float.isInfinite(f) || java.lang.Float.isNaN(f)) {
            return com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
        }
        if (f >= 180.0f) {
            f2 = -360.0f;
        } else {
            if (f >= -180.0f) {
                return f;
            }
            f2 = 360.0f;
        }
        return f + f2;
    }

    public static int c(int i, int i2) {
        while (i2 < i) {
            i2 += i2;
        }
        return i2;
    }

    public static int d(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            throw new java.lang.IllegalArgumentException("Greatest common divisor should be computed on numbers greater than zero.");
        }
        while (true) {
            int i3 = i2;
            int i4 = i;
            i = i3;
            if (i == 0) {
                return i4;
            }
            i2 = i4 % i;
        }
    }

    public static boolean e(int i) {
        return (i & (i + (-1))) == 0;
    }

    public static void f(long j) {
    }
}
