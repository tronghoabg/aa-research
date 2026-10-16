package com.google.android.libraries.handwriting.base;

/* JADX INFO: loaded from: classes3.dex */
public class MathTools {
    public static int argmax(double[] dArr) {
        int i = -1;
        double d = -1.7976931348623157E308d;
        for (int i2 = 0; i2 < dArr.length; i2++) {
            double d2 = dArr[i2];
            if (d2 >= d) {
                i = i2;
            }
            if (d2 >= d) {
                d = d2;
            }
        }
        return i;
    }

    public static float semiringLogSum(float[] fArr) {
        int iArgmax = argmax(fArr);
        float f = fArr[iArgmax];
        float fExp = com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
        for (int i = 0; i < fArr.length; i++) {
            if (i != iArgmax) {
                fExp = (float) (((double) fExp) + java.lang.Math.exp(fArr[i] - f));
            }
        }
        return ((float) java.lang.Math.log1p(fExp)) + f;
    }

    public static int argmax(float[] fArr) {
        int i = -1;
        float f = -3.4028235E38f;
        for (int i2 = 0; i2 < fArr.length; i2++) {
            float f2 = fArr[i2];
            if (f2 >= f) {
                i = i2;
            }
            if (f2 >= f) {
                f = f2;
            }
        }
        return i;
    }

    public static double semiringLogSum(double[] dArr) {
        int iArgmax = argmax(dArr);
        double d = dArr[iArgmax];
        double dExp = 0.0d;
        for (int i = 0; i < dArr.length; i++) {
            if (i != iArgmax) {
                dExp += java.lang.Math.exp(dArr[i] - d);
            }
        }
        return java.lang.Math.log1p(dExp) + d;
    }
}
