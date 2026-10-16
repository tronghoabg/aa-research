package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ali implements defpackage.alf {
    private final /* synthetic */ int c;
    public static final defpackage.ali b = new defpackage.ali(1);
    public static final defpackage.ali a = new defpackage.ali(0);

    private ali(int i) {
        this.c = i;
    }

    @Override // defpackage.alf
    public final boolean a() {
        return this.c == 0;
    }

    @Override // defpackage.alf
    public final /* synthetic */ defpackage.alg b(android.view.View view, boolean z, long j, float f, float f2, boolean z2, defpackage.dlo dloVar, float f3) {
        if (this.c != 0) {
            return new defpackage.alg(new android.widget.Magnifier(view));
        }
        if (z) {
            return new defpackage.alh(new android.widget.Magnifier(view));
        }
        long jDP = dloVar.dP(j);
        float fDI = dloVar.dI(f);
        float fDI2 = dloVar.dI(f2);
        android.widget.Magnifier.Builder builder = new android.widget.Magnifier.Builder(view);
        if (jDP != 9205357640488583168L) {
            alh$.ExternalSyntheticApiModelOutline0.m(builder, defpackage.afhi.k(java.lang.Float.intBitsToFloat((int) (jDP >> 32))), defpackage.afhi.k(java.lang.Float.intBitsToFloat((int) (jDP & 4294967295L))));
        }
        if (!java.lang.Float.isNaN(fDI)) {
            alh$.ExternalSyntheticApiModelOutline0.m(builder, fDI);
        }
        if (!java.lang.Float.isNaN(fDI2)) {
            alh$.ExternalSyntheticApiModelOutline0.m$1(builder, fDI2);
        }
        if (!java.lang.Float.isNaN(f3)) {
            alh$.ExternalSyntheticApiModelOutline0.m$2(builder, f3);
        }
        alh$.ExternalSyntheticApiModelOutline0.m(builder, z2);
        return new defpackage.alh(alh$.ExternalSyntheticApiModelOutline0.m(builder));
    }
}
