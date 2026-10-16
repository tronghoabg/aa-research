package defpackage;

/* loaded from: classes3.dex */
final class ugw implements uiv {
    final /* synthetic */ ukp a;
    final /* synthetic */ uij b;
    final /* synthetic */ uko c;
    final /* synthetic */ boolean d;
    final /* synthetic */ ugy e;

    public ugw(ugy ugyVar, ukp ukpVar, uij uijVar, uko ukoVar, boolean z) {
        this.a = ukpVar;
        this.b = uijVar;
        this.c = ukoVar;
        this.d = z;
        this.e = ugyVar;
    }

    @Override // defpackage.uiv
    public final void H(wnq wnqVar) {
        ugy ugyVar = this.e;
        if (wnqVar == null) {
            ugyVar.l(this.a, this.d);
            return;
        }
        ugyVar.i.execute(new ugx(ugyVar, ugyVar.m.l, ugyVar.d, this.a, this.b, wnqVar, this.c, this.d));
    }
}
