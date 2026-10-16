package defpackage;

/* loaded from: classes2.dex */
public final class pfe implements jlr {
    final /* synthetic */ pfh a;
    final /* synthetic */ aitf b;

    public pfe(pfh pfhVar, aitf aitfVar) {
        this.a = pfhVar;
        this.b = aitfVar;
    }

    @Override // defpackage.jlr
    public final void a(int i) {
        if (i > 0) {
            ((ype) pfh.a.f()).w("CDM confirmed wireless device appeared. ID = %d", i);
            this.a.d(yxi.WIRELESS_CDM_APPROVED);
            this.b.w(afak.a);
        } else {
            ((ype) pfh.a.g()).u("CDM failed to confirm wireless device appeared");
            this.a.d(yxi.WIRELESS_CDM_REJECTED_INVALID_ASSOCIATION);
            this.b.w(afak.a);
        }
    }
}
