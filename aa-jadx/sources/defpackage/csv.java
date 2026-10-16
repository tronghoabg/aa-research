package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class csv extends defpackage.cvd {
    @Override // defpackage.cvd
    public final float a(float f, defpackage.ctc ctcVar, defpackage.ctc ctcVar2) {
        return java.lang.Float.intBitsToFloat((int) (ctcVar2.i(ctcVar, (((long) java.lang.Float.floatToRawIntBits(((int) (ctcVar.h() >> 32)) / 2.0f)) << 32) | (((long) java.lang.Float.floatToRawIntBits(f)) & 4294967295L)) & 4294967295L));
    }
}
