package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class dvm {
    public char a;
    public final float[] b;

    public dvm(defpackage.dvm dvmVar) {
        this.a = dvmVar.a;
        float[] fArr = dvmVar.b;
        this.b = defpackage.dtk.f(fArr, fArr.length);
    }

    public static void a(android.graphics.Path path, float f, float f2, float f3, float f4, float f5, float f6, float f7, boolean z, boolean z2) {
        double d;
        double d2;
        double radians = java.lang.Math.toRadians(f7);
        double dCos = java.lang.Math.cos(radians);
        double dSin = java.lang.Math.sin(radians);
        double d3 = f;
        double d4 = f2;
        double d5 = d4 * dSin;
        double d6 = d4;
        double d7 = f4;
        double d8 = f6;
        double d9 = ((((double) (-f)) * dSin) + (d6 * dCos)) / d8;
        double d10 = ((((double) (-f3)) * dSin) + (d7 * dCos)) / d8;
        double d11 = d9 - d10;
        double d12 = f5;
        double d13 = ((d3 * dCos) + d5) / d12;
        double d14 = ((((double) f3) * dCos) + (d7 * dSin)) / d12;
        double d15 = d13 - d14;
        double d16 = (d15 * d15) + (d11 * d11);
        if (d16 == 0.0d) {
            android.util.Log.w("PathParser", " Points are coincident");
            return;
        }
        double d17 = (1.0d / d16) - 0.25d;
        if (d17 < 0.0d) {
            android.util.Log.w("PathParser", "Points are too far apart " + d16);
            float fSqrt = (float) (java.lang.Math.sqrt(d16) / 1.99999d);
            a(path, f, f2, f3, f4, f5 * fSqrt, fSqrt * f6, f7, z, z2);
            return;
        }
        double dSqrt = java.lang.Math.sqrt(d17);
        double d18 = (d9 + d10) / 2.0d;
        double d19 = d15 * dSqrt;
        double d20 = (d13 + d14) / 2.0d;
        double d21 = dSqrt * d11;
        if (z == z2) {
            d = d20 - d21;
            d2 = d18 + d19;
        } else {
            d = d20 + d21;
            d2 = d18 - d19;
        }
        double d22 = d2;
        double d23 = d;
        double dAtan2 = java.lang.Math.atan2(d9 - d22, d13 - d);
        double dAtan3 = java.lang.Math.atan2(d10 - d22, d14 - d23) - dAtan2;
        if (z2 != (dAtan3 >= 0.0d)) {
            dAtan3 += dAtan3 > 0.0d ? -6.283185307179586d : 6.283185307179586d;
        }
        double d24 = d23 * d12;
        double d25 = d22 * d8;
        double d26 = d24 * dCos;
        double d27 = d25 * dSin;
        double d28 = d24 * dSin;
        double d29 = d25 * dCos;
        int iCeil = (int) java.lang.Math.ceil(java.lang.Math.abs((dAtan3 * 4.0d) / 3.141592653589793d));
        double dCos2 = java.lang.Math.cos(radians);
        double dSin2 = java.lang.Math.sin(radians);
        double dCos3 = java.lang.Math.cos(dAtan2);
        double dSin3 = java.lang.Math.sin(dAtan2);
        double d30 = -d12;
        double d31 = d30 * dCos2;
        double d32 = d8 * dSin2;
        double d33 = d30 * dSin2;
        double d34 = d8 * dCos2;
        double d35 = (dSin3 * d33) + (dCos3 * d34);
        double d36 = (d31 * dSin3) - (d32 * dCos3);
        double d37 = d3;
        int i = 0;
        double d38 = dAtan2;
        while (i < iCeil) {
            double d39 = d12;
            double d40 = (dAtan3 / ((double) iCeil)) + d38;
            double dSin4 = java.lang.Math.sin(d40);
            double dCos4 = java.lang.Math.cos(d40);
            double d41 = d40 - d38;
            double dTan = java.lang.Math.tan(d41 / 2.0d);
            double dSin5 = (java.lang.Math.sin(d41) * (java.lang.Math.sqrt(((dTan * 3.0d) * dTan) + 4.0d) - 1.0d)) / 3.0d;
            int i2 = iCeil;
            double d42 = d37 + (d36 * dSin5);
            path.rLineTo(com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED);
            double d43 = d28 + d29 + (d39 * dSin2 * dCos4) + (d34 * dSin4);
            double d44 = ((d26 - d27) + ((d39 * dCos2) * dCos4)) - (d32 * dSin4);
            double d45 = (dSin4 * d33) + (dCos4 * d34);
            double d46 = (d31 * dSin4) - (d32 * dCos4);
            path.cubicTo((float) d42, (float) (d6 + (d35 * dSin5)), (float) (d44 - (dSin5 * d46)), (float) (d43 - (dSin5 * d45)), (float) d44, (float) d43);
            i++;
            d6 = d43;
            d33 = d33;
            d37 = d44;
            dCos2 = dCos2;
            dAtan3 = dAtan3;
            d35 = d45;
            d12 = d39;
            d36 = d46;
            dSin2 = dSin2;
            iCeil = i2;
            d38 = d40;
        }
    }

    public dvm(char c, float[] fArr) {
        this.a = c;
        this.b = fArr;
    }
}
