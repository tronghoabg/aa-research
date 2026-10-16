package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class are {
    public defpackage.apn a;
    public long b;

    public are(defpackage.apn apnVar, long j) {
        this.a = apnVar;
        this.b = j;
    }

    public final float a(long j) {
        return java.lang.Float.intBitsToFloat(this.a == defpackage.apn.b ? (int) (j >> 32) : (int) (j & 4294967295L));
    }

    public final long b(long j, float f) {
        long jAh = defpackage.a.ah(this.b, j);
        this.b = jAh;
        float fA = this.a == null ? defpackage.cji.a(jAh) : java.lang.Math.abs(a(jAh));
        if (fA <= 0.0f || fA < f) {
            return 9205357640488583168L;
        }
        defpackage.apn apnVar = this.a;
        long j2 = this.b;
        if (apnVar == null) {
            return defpackage.acmj.r(this.b, defpackage.cji.c(defpackage.cji.b(j2, defpackage.cji.a(j2)), f));
        }
        float fA2 = a(j2) - (java.lang.Math.signum(a(this.b)) * f);
        long j3 = this.b;
        defpackage.apn apnVar2 = this.a;
        defpackage.apn apnVar3 = defpackage.apn.b;
        float fIntBitsToFloat = java.lang.Float.intBitsToFloat((int) (apnVar2 == apnVar3 ? j3 & 4294967295L : j3 >> 32));
        if (this.a == apnVar3) {
            return (((long) java.lang.Float.floatToRawIntBits(fA2)) << 32) | (((long) java.lang.Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L);
        }
        return (((long) java.lang.Float.floatToRawIntBits(fA2)) & 4294967295L) | (((long) java.lang.Float.floatToRawIntBits(fIntBitsToFloat)) << 32);
    }
}
