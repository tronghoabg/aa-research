package com.bytedance.adsdk.ugeno.xs;

/* loaded from: classes.dex */
public final class yo {
    public static float uef(String str, float f10) {
        if (str != null) {
            try {
                return Float.parseFloat(str);
            } catch (Throwable unused) {
            }
        }
        return f10;
    }

    public static int uef(String str, int i5) {
        if (str != null) {
            try {
                return (int) Float.parseFloat(str);
            } catch (Throwable unused) {
            }
        }
        return i5;
    }

    public static long uef(String str, long j8) {
        if (str != null) {
            try {
                return Long.parseLong(str);
            } catch (Throwable unused) {
            }
        }
        return j8;
    }

    public static double uef(String str, double d3) {
        if (str != null) {
            try {
                return Double.parseDouble(str);
            } catch (Throwable unused) {
            }
        }
        return d3;
    }

    public static boolean uef(String str, boolean z2) {
        if (str != null) {
            try {
                return Boolean.parseBoolean(str);
            } catch (Throwable unused) {
            }
        }
        return z2;
    }
}
