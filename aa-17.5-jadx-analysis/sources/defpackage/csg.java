package defpackage;

/* loaded from: classes.dex */
public final class csg implements csi {
    private final /* synthetic */ int a;

    public csg(int i) {
        this.a = i;
    }

    @Override // defpackage.csi
    public final long a(long j, long j2) {
        int i = this.a;
        if (i == 0) {
            float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32)) / Float.intBitsToFloat((int) (j >> 32));
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j2 & 4294967295L)) / Float.intBitsToFloat((int) (j & 4294967295L));
            return (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
        }
        if (i == 1) {
            float fMax = Math.max(Float.intBitsToFloat((int) (j2 >> 32)) / Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)) / Float.intBitsToFloat((int) (j & 4294967295L)));
            return (Float.floatToRawIntBits(fMax) << 32) | (Float.floatToRawIntBits(fMax) & 4294967295L);
        }
        if (i == 2) {
            return (Float.floatToRawIntBits(r8) & 4294967295L) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 & 4294967295L)) / Float.intBitsToFloat((int) (j & 4294967295L))) << 32);
        }
        if (i == 3) {
            return (Float.floatToRawIntBits(r8) & 4294967295L) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 >> 32)) / Float.intBitsToFloat((int) (j >> 32))) << 32);
        }
        if (i == 4) {
            float fX = czz.x(j, j2);
            return (Float.floatToRawIntBits(fX) << 32) | (Float.floatToRawIntBits(fX) & 4294967295L);
        }
        if (Float.intBitsToFloat((int) (j >> 32)) <= Float.intBitsToFloat((int) (j2 >> 32)) && Float.intBitsToFloat((int) (j & 4294967295L)) <= Float.intBitsToFloat((int) (j2 & 4294967295L))) {
            return (Float.floatToRawIntBits(1.0f) << 32) | (Float.floatToRawIntBits(1.0f) & 4294967295L);
        }
        float fX2 = czz.x(j, j2);
        return (Float.floatToRawIntBits(fX2) << 32) | (Float.floatToRawIntBits(fX2) & 4294967295L);
    }
}
