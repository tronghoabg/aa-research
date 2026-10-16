package defpackage;

/* loaded from: classes.dex */
public final class csm extends cuu {
    @Override // defpackage.cuu
    public final float a(float f, cst cstVar, cst cstVar2) {
        return Float.intBitsToFloat((int) (cstVar2.i(cstVar, (Float.floatToRawIntBits(((int) (cstVar.h() >> 32)) / 2.0f) << 32) | (Float.floatToRawIntBits(f) & 4294967295L)) & 4294967295L));
    }
}
