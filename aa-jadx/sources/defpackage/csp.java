package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class csp implements defpackage.csr {
    private final /* synthetic */ int a;

    public csp(int i) {
        this.a = i;
    }

    @Override // defpackage.csr
    public final long a(long j, long j2) {
        int i = this.a;
        if (i == 0) {
            float fIntBitsToFloat = java.lang.Float.intBitsToFloat((int) (j2 >> 32)) / java.lang.Float.intBitsToFloat((int) (j >> 32));
            return (((long) java.lang.Float.floatToRawIntBits(java.lang.Float.intBitsToFloat((int) (j2 & 4294967295L)) / java.lang.Float.intBitsToFloat((int) (j & 4294967295L)))) & 4294967295L) | (java.lang.Float.floatToRawIntBits(fIntBitsToFloat) << 32);
        }
        if (i == 1) {
            float fMax = java.lang.Math.max(java.lang.Float.intBitsToFloat((int) (j2 >> 32)) / java.lang.Float.intBitsToFloat((int) (j >> 32)), java.lang.Float.intBitsToFloat((int) (j2 & 4294967295L)) / java.lang.Float.intBitsToFloat((int) (j & 4294967295L)));
            return (((long) java.lang.Float.floatToRawIntBits(fMax)) << 32) | (((long) java.lang.Float.floatToRawIntBits(fMax)) & 4294967295L);
        }
        if (i == 2) {
            float fIntBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (j2 & 4294967295L)) / java.lang.Float.intBitsToFloat((int) (j & 4294967295L));
            return (((long) java.lang.Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L) | (java.lang.Float.floatToRawIntBits(fIntBitsToFloat2) << 32);
        }
        if (i == 3) {
            float fIntBitsToFloat3 = java.lang.Float.intBitsToFloat((int) (j2 >> 32)) / java.lang.Float.intBitsToFloat((int) (j >> 32));
            return (((long) java.lang.Float.floatToRawIntBits(fIntBitsToFloat3)) & 4294967295L) | (java.lang.Float.floatToRawIntBits(fIntBitsToFloat3) << 32);
        }
        if (i == 4) {
            float fJ = defpackage.dai.J(j, j2);
            return (((long) java.lang.Float.floatToRawIntBits(fJ)) << 32) | (((long) java.lang.Float.floatToRawIntBits(fJ)) & 4294967295L);
        }
        if (java.lang.Float.intBitsToFloat((int) (j >> 32)) <= java.lang.Float.intBitsToFloat((int) (j2 >> 32)) && java.lang.Float.intBitsToFloat((int) (j & 4294967295L)) <= java.lang.Float.intBitsToFloat((int) (j2 & 4294967295L))) {
            return 4575657222473777152L;
        }
        float fJ2 = defpackage.dai.J(j, j2);
        return (((long) java.lang.Float.floatToRawIntBits(fJ2)) << 32) | (((long) java.lang.Float.floatToRawIntBits(fJ2)) & 4294967295L);
    }
}
