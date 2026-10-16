package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class aaiu {
    public static final double a = 0.6931471805599453d;
    private static final int b = i(360.0d);

    private aaiu() {
    }

    public static double a(int i) {
        return b(i % b);
    }

    public static double b(int i) {
        return ((double) i) * 1.0E-6d;
    }

    public static float c(float f, float f2) {
        float fG = g(f - f2);
        return fG < 180.0f ? fG : fG - 360.0f;
    }

    public static float d(float f, float f2, float f3) {
        return java.lang.Math.min(f3, java.lang.Math.max(f2, f));
    }

    public static float e(float f) {
        if (java.lang.Float.isNaN(f)) {
            throw new java.lang.ArithmeticException("Tilt value is NaN.");
        }
        return d(f, -90.0f, 90.0f);
    }

    public static float f(float f) {
        return (float) (java.lang.Math.log(f) / a);
    }

    public static float g(float f) {
        return f - (((float) java.lang.Math.floor(f / 360.0f)) * 360.0f);
    }

    public static int h(float f) {
        return ((int) java.lang.Math.floor((f + 22.5f) / 45.0f)) & 7;
    }

    public static int i(double d) {
        return (int) java.lang.Math.round(d * 1000000.0d);
    }

    public static boolean j(com.google.android.libraries.maps.model.StreetViewPanoramaCamera streetViewPanoramaCamera) {
        return (streetViewPanoramaCamera == null || java.lang.Float.isNaN(streetViewPanoramaCamera.zoom) || java.lang.Float.isNaN(streetViewPanoramaCamera.tilt) || java.lang.Float.isNaN(streetViewPanoramaCamera.bearing)) ? false : true;
    }

    public static double k(double d) {
        return java.lang.Math.min(1.0d, java.lang.Math.max(0.0d, d));
    }

    public static double l(boolean z, int i, int i2) {
        if (z == (i >= i2)) {
            return 90.0d;
        }
        double d = i2;
        double d2 = i;
        double dAtan = java.lang.Math.atan((z ? d2 / d : d / d2) * 0.9999999878320356d) * 57.295780181884766d;
        return dAtan + dAtan;
    }
}
