package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class mxa implements defpackage.affh {
    final /* synthetic */ defpackage.bby a;
    final /* synthetic */ defpackage.cgf b;
    final /* synthetic */ boolean c;
    final /* synthetic */ long d;
    final /* synthetic */ boolean e;
    final /* synthetic */ int f;
    final /* synthetic */ boolean g;
    final /* synthetic */ defpackage.affc h;

    public mxa(defpackage.bby bbyVar, defpackage.cgf cgfVar, boolean z, long j, boolean z2, int i, boolean z3, defpackage.affc affcVar) {
        this.a = bbyVar;
        this.b = cgfVar;
        this.c = z;
        this.d = j;
        this.e = z2;
        this.f = i;
        this.g = z3;
        this.h = affcVar;
    }

    @Override // defpackage.affh
    public final /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        long j = ((defpackage.ckd) obj).a;
        defpackage.bve bveVar = (defpackage.bve) obj2;
        int iIntValue = ((java.lang.Number) obj3).intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= true != bveVar.B(j) ? 2 : 4;
        }
        if (bveVar.I((iIntValue & 19) != 18, iIntValue & 1)) {
            defpackage.mkc.H(this.a, this.b, this.c, this.d, j, this.e, 0.0f, 0.0f, 0.0f, this.f, this.g, this.h, bveVar, (iIntValue << 12) & 57344, 0);
        } else {
            bveVar.s();
        }
        return defpackage.afbk.a;
    }
}
