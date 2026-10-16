package defpackage;

import com.google.android.libraries.maps.model.StreetViewPanoramaCamera;

/* loaded from: classes3.dex */
public final class aahr {
    public static final double a = Math.log(2.0d);
    private static final int b = i(360.0d);

    private aahr() {
    }

    public static double a(int i) {
        return b(i % b);
    }

    public static double b(int i) {
        return i * 1.0E-6d;
    }

    public static float c(float f, float f2) {
        float fG = g(f - f2);
        return fG < 180.0f ? fG : fG - 360.0f;
    }

    public static float d(float f, float f2, float f3) {
        return Math.min(f3, Math.max(f2, f));
    }

    public static float e(float f) {
        if (Float.isNaN(f)) {
            throw new ArithmeticException("Tilt value is NaN.");
        }
        return d(f, -90.0f, 90.0f);
    }

    public static float f(float f) {
        return (float) (Math.log(f) / a);
    }

    public static float g(float f) {
        return f - (((float) Math.floor(f / 360.0f)) * 360.0f);
    }

    public static int h(float f) {
        return ((int) Math.floor((f + 22.5f) / 45.0f)) & 7;
    }

    public static int i(double d) {
        return (int) Math.round(d * 1000000.0d);
    }

    public static boolean j(StreetViewPanoramaCamera streetViewPanoramaCamera) {
        return (streetViewPanoramaCamera == null || Float.isNaN(streetViewPanoramaCamera.zoom) || Float.isNaN(streetViewPanoramaCamera.tilt) || Float.isNaN(streetViewPanoramaCamera.bearing)) ? false : true;
    }

    public static double k(double d) {
        return Math.min(1.0d, Math.max(0.0d, d));
    }

    public static double l(boolean z, int i, int i2) {
        if (z == (i >= i2)) {
            return 90.0d;
        }
        double d = i2;
        double d2 = i;
        double dAtan = Math.atan((z ? d2 / d : d / d2) * Math.tan(0.7853981573134661d)) * 57.295780181884766d;
        return dAtan + dAtan;
    }
}
