package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ckp extends defpackage.clb {
    private final java.util.List a;
    private final long c;
    private final long d;
    private final java.util.List b = null;
    private final int e = 0;

    public ckp(java.util.List list, long j, long j2) {
        this.a = list;
        this.c = j;
        this.d = j2;
    }

    @Override // defpackage.clb
    public final android.graphics.Shader b(long j) {
        long j2 = this.c;
        int i = (int) (j2 >> 32);
        if (java.lang.Float.intBitsToFloat(i) == Float.POSITIVE_INFINITY) {
            i = (int) (j >> 32);
        }
        float fIntBitsToFloat = java.lang.Float.intBitsToFloat(i);
        int i2 = (int) (j2 & 4294967295L);
        if (java.lang.Float.intBitsToFloat(i2) == Float.POSITIVE_INFINITY) {
            i2 = (int) (j & 4294967295L);
        }
        float fIntBitsToFloat2 = java.lang.Float.intBitsToFloat(i2);
        long j3 = this.d;
        int i3 = (int) (j3 >> 32);
        if (java.lang.Float.intBitsToFloat(i3) == Float.POSITIVE_INFINITY) {
            i3 = (int) (j >> 32);
        }
        float fIntBitsToFloat3 = java.lang.Float.intBitsToFloat(i3);
        int i4 = (int) (j3 & 4294967295L);
        if (java.lang.Float.intBitsToFloat(i4) == Float.POSITIVE_INFINITY) {
            i4 = (int) (j & 4294967295L);
        }
        float fIntBitsToFloat4 = java.lang.Float.intBitsToFloat(i4);
        java.util.List list = this.a;
        long jFloatToRawIntBits = java.lang.Float.floatToRawIntBits(fIntBitsToFloat);
        long jFloatToRawIntBits2 = ((long) java.lang.Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L;
        long jFloatToRawIntBits3 = java.lang.Float.floatToRawIntBits(fIntBitsToFloat3);
        long jFloatToRawIntBits4 = ((long) java.lang.Float.floatToRawIntBits(fIntBitsToFloat4)) & 4294967295L;
        defpackage.rj.i(list);
        long j4 = (jFloatToRawIntBits << 32) | jFloatToRawIntBits2;
        long j5 = (jFloatToRawIntBits3 << 32) | jFloatToRawIntBits4;
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            return defpackage.ckk.a.a(j4, j5, defpackage.rj.g(list), null, 0);
        }
        return new android.graphics.LinearGradient(java.lang.Float.intBitsToFloat((int) (j4 >> 32)), java.lang.Float.intBitsToFloat((int) (j4 & 4294967295L)), java.lang.Float.intBitsToFloat((int) (j5 >> 32)), java.lang.Float.intBitsToFloat((int) (j5 & 4294967295L)), defpackage.rj.h(list), (float[]) null, android.graphics.Shader.TileMode.CLAMP);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.ckp)) {
            return false;
        }
        defpackage.ckp ckpVar = (defpackage.ckp) obj;
        if (!defpackage.afga.f(this.a, ckpVar.a)) {
            return false;
        }
        java.util.List list = ckpVar.b;
        if (this.c != ckpVar.c || this.d != ckpVar.d) {
            return false;
        }
        int i = ckpVar.e;
        return true;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 961;
        long j = this.c;
        long j2 = this.d;
        return (((iHashCode + ((int) (j ^ (j >>> 32)))) * 31) + ((int) ((j2 >>> 32) ^ j2))) * 31;
    }

    public final java.lang.String toString() {
        java.lang.String str;
        long j = this.c;
        java.lang.String str2 = "";
        if (((((j & 9187343241974906880L) ^ 9187343241974906880L) - 4294967297L) & (-9223372034707292160L)) == 0) {
            str = "start=" + defpackage.cji.d(j) + ", ";
        } else {
            str = "";
        }
        long j2 = this.d;
        if (((((j2 & 9187343241974906880L) ^ 9187343241974906880L) - 4294967297L) & (-9223372034707292160L)) == 0) {
            str2 = "end=" + defpackage.cji.d(j2) + ", ";
        }
        return "LinearGradient(colors=" + this.a + ", stops=null, " + str + str2 + "tileMode=Clamp)";
    }
}
