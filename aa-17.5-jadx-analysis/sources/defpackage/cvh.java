package defpackage;

/* loaded from: classes.dex */
public final class cvh extends cuu {
    @Override // defpackage.cuu
    public final float a(float f, cst cstVar, cst cstVar2) {
        long jH = cstVar.h() & 4294967295L;
        return Float.intBitsToFloat((int) (cstVar2.i(cstVar, (Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(((int) jH) / 2.0f) & 4294967295L)) >> 32));
    }
}
