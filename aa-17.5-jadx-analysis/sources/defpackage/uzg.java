package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes3.dex */
public final class uzg {
    public static final /* synthetic */ int a = 0;
    private static final float b = (float) (1.0d / Math.log(2.0d));

    public static float a(float f) {
        return ((float) Math.log(f)) * b;
    }

    public static float b(float f) {
        float f2;
        if (Float.isInfinite(f) || Float.isNaN(f)) {
            return BitmapDescriptorFactory.HUE_RED;
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
            throw new IllegalArgumentException("Greatest common divisor should be computed on numbers greater than zero.");
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
        Math.ceil(j / 1048576.0d);
    }
}
