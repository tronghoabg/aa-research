package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
public final class aen implements aes {
    private final float a;
    private final float b;
    private final float c;
    private final float d;
    private final float e;
    private final float f;

    public aen(float f, float f2, float f3, float f4) {
        int iB;
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        if (Float.isNaN(f) || Float.isNaN(f2) || Float.isNaN(f3) || Float.isNaN(f4)) {
            afp.a("Parameters to CubicBezierEasing cannot be NaN. Actual parameters are: " + f + ", " + f2 + ", " + f3 + ", " + f4 + ".");
        }
        float[] fArr = new float[5];
        float f5 = (f4 - f2) * 3.0f;
        double d = f5;
        float f6 = (f2 + BitmapDescriptorFactory.HUE_RED) * 3.0f;
        double d2 = f6;
        double d3 = d + d;
        float f7 = (1.0f - f4) * 3.0f;
        double d4 = f7;
        double d5 = (d2 - d3) + d4;
        if (d5 == 0.0d) {
            iB = d == d4 ? 0 : cjn.b((float) ((d3 - d4) / (d3 - (d4 + d4))), fArr, 0);
        } else {
            double d6 = -Math.sqrt((d * d) - (d4 * d2));
            double d7 = (-d2) + d;
            int iB2 = cjn.b((float) ((-(d6 + d7)) / d5), fArr, 0);
            iB = cjn.b((float) ((d6 - d7) / d5), fArr, iB2) + iB2;
            if (iB > 1) {
                float f8 = fArr[0];
                float f9 = fArr[1];
                if (f8 > f9) {
                    fArr[0] = f9;
                    fArr[1] = f8;
                } else if (f8 == f9) {
                    iB = 1;
                }
            }
        }
        float f10 = f5 - f6;
        float f11 = f7 - f5;
        float f12 = f10 + f10;
        int iB3 = iB + cjn.b((-f12) / ((f11 + f11) - f12), fArr, iB);
        float fMin = Math.min(BitmapDescriptorFactory.HUE_RED, 1.0f);
        float fMax = Math.max(BitmapDescriptorFactory.HUE_RED, 1.0f);
        for (int i = 0; i < iB3; i++) {
            float f13 = fArr[i];
            float f14 = ((((((((f2 - f4) * 3.0f) + 1.0f + BitmapDescriptorFactory.HUE_RED) * f13) + (((f4 - (f2 + f2)) + BitmapDescriptorFactory.HUE_RED) * 3.0f)) * f13) + f6) * f13) + BitmapDescriptorFactory.HUE_RED;
            fMin = Math.min(fMin, f14);
            fMax = Math.max(fMax, f14);
        }
        long jAA = roc.aA(fMin, fMax);
        this.e = Float.intBitsToFloat((int) (jAA >> 32));
        this.f = Float.intBitsToFloat((int) (jAA & 4294967295L));
    }

    /* JADX WARN: Removed duplicated region for block: B:127:0x022f A[PHI: r3
  0x022f: PHI (r3v19 float) = (r3v6 float), (r3v12 float), (r3v17 float), (r3v25 float), (r3v30 float) binds: [B:125:0x022b, B:114:0x01fa, B:89:0x01ad, B:45:0x00da, B:22:0x0088] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0069  */
    @Override // defpackage.aes
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final float a(float r27) {
        /*
            Method dump skipped, instructions count: 653
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aen.a(float):float");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof aen)) {
            return false;
        }
        aen aenVar = (aen) obj;
        return this.a == aenVar.a && this.b == aenVar.b && this.c == aenVar.c && this.d == aenVar.d;
    }

    public final int hashCode() {
        return (((((Float.floatToIntBits(this.a) * 31) + Float.floatToIntBits(this.b)) * 31) + Float.floatToIntBits(this.c)) * 31) + Float.floatToIntBits(this.d);
    }

    public final String toString() {
        return "CubicBezierEasing(a=" + this.a + ", b=" + this.b + ", c=" + this.c + ", d=" + this.d + ")";
    }
}
