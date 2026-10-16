package defpackage;

/* loaded from: classes2.dex */
public final class kuf implements ckv {
    final /* synthetic */ float a;
    private final /* synthetic */ int b;

    public kuf(float f, int i) {
        this.b = i;
        this.a = f;
    }

    @Override // defpackage.ckv
    public final /* synthetic */ ckm a(long j, dlr dlrVar, dlg dlgVar) {
        if (this.b != 0) {
            dlrVar.getClass();
            dlgVar.getClass();
            return new ckk(byx.E(0L, a.ah(Float.intBitsToFloat((int) (j >> 32)) * this.a, Float.intBitsToFloat((int) (j & 4294967295L)))));
        }
        dlrVar.getClass();
        dlgVar.getClass();
        return new ckk(byx.E(0L, a.ah(Float.intBitsToFloat((int) (j >> 32)) * this.a, Float.intBitsToFloat((int) (j & 4294967295L)))));
    }

    public final String toString() {
        return "RectangleShape";
    }
}
