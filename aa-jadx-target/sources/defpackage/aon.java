package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class aon {
    public static final defpackage.affh a = new defpackage.aom((defpackage.afdk) null, 1, (byte[]) null);
    public static final defpackage.affh b = new defpackage.aom(null, 0);

    public static final float a(long j, defpackage.apn apnVar) {
        return java.lang.Float.intBitsToFloat((int) (apnVar == defpackage.apn.a ? j & 4294967295L : j >> 32));
    }

    public static final long b(long j) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        return defpackage.tna.aK(java.lang.Float.isNaN(java.lang.Float.intBitsToFloat(i)) ? 0.0f : java.lang.Float.intBitsToFloat(i), java.lang.Float.isNaN(java.lang.Float.intBitsToFloat(i2)) ? 0.0f : java.lang.Float.intBitsToFloat(i2));
    }

    public static final boolean c(defpackage.apn apnVar, float f) {
        if (apnVar == defpackage.apn.b) {
            return f <= 30.0f;
        }
        return f > 30.0f && f <= 90.0f;
    }
}
