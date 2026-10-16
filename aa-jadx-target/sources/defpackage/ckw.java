package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ckw extends defpackage.clb {
    private final java.util.List a;
    private final long c;
    private final float d;
    private final java.util.List b = null;
    private final int e = 0;

    public ckw(java.util.List list, long j, float f) {
        this.a = list;
        this.c = j;
        this.d = f;
    }

    @Override // defpackage.clb
    public final android.graphics.Shader b(long j) {
        float fIntBitsToFloat;
        float fIntBitsToFloat2;
        long j2 = this.c;
        if ((9223372034707292159L & j2) == 9205357640488583168L) {
            long jY = defpackage.bzo.y(j);
            fIntBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (jY >> 32));
            fIntBitsToFloat = java.lang.Float.intBitsToFloat((int) (jY & 4294967295L));
        } else {
            int i = (int) (j2 >> 32);
            if (java.lang.Float.intBitsToFloat(i) == Float.POSITIVE_INFINITY) {
                i = (int) (j >> 32);
            }
            float fIntBitsToFloat3 = java.lang.Float.intBitsToFloat(i);
            int i2 = (int) (j2 & 4294967295L);
            if (java.lang.Float.intBitsToFloat(i2) == Float.POSITIVE_INFINITY) {
                i2 = (int) (j & 4294967295L);
            }
            fIntBitsToFloat = java.lang.Float.intBitsToFloat(i2);
            fIntBitsToFloat2 = fIntBitsToFloat3;
        }
        java.util.List list = this.a;
        long jFloatToRawIntBits = ((long) java.lang.Float.floatToRawIntBits(fIntBitsToFloat2)) << 32;
        long jFloatToRawIntBits2 = ((long) java.lang.Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L;
        float fB = this.d;
        if (fB == Float.POSITIVE_INFINITY) {
            fB = defpackage.cjl.b(j) / 2.0f;
        }
        float f = fB;
        long j3 = jFloatToRawIntBits | jFloatToRawIntBits2;
        defpackage.rj.i(list);
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            return defpackage.ckk.a.b(j3, f, defpackage.rj.g(list), null, 0);
        }
        return new android.graphics.RadialGradient(java.lang.Float.intBitsToFloat((int) (j3 >> 32)), java.lang.Float.intBitsToFloat((int) (4294967295L & j3)), f, defpackage.rj.h(list), (float[]) null, android.graphics.Shader.TileMode.CLAMP);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.ckw)) {
            return false;
        }
        defpackage.ckw ckwVar = (defpackage.ckw) obj;
        if (!defpackage.afga.f(this.a, ckwVar.a)) {
            return false;
        }
        java.util.List list = ckwVar.b;
        if (this.c != ckwVar.c || this.d != ckwVar.d) {
            return false;
        }
        int i = ckwVar.e;
        return true;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 961;
        long j = this.c;
        return (((iHashCode + ((int) (j ^ (j >>> 32)))) * 31) + java.lang.Float.floatToIntBits(this.d)) * 31;
    }

    public final java.lang.String toString() {
        java.lang.String str;
        long j = this.c;
        java.lang.String str2 = "";
        if ((9223372034707292159L & j) != 9205357640488583168L) {
            str = "center=" + defpackage.cji.d(j) + ", ";
        } else {
            str = "";
        }
        float f = this.d;
        if ((java.lang.Float.floatToRawIntBits(f) & Integer.MAX_VALUE) < 2139095040) {
            str2 = "radius=" + f + ", ";
        }
        return "RadialGradient(colors=" + this.a + ", stops=null, " + str + str2 + "tileMode=Clamp)";
    }
}
