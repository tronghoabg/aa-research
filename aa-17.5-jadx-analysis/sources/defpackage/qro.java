package defpackage;

/* loaded from: classes.dex */
public final class qro implements epy {
    final /* synthetic */ qrq a;
    final /* synthetic */ bii b;

    public qro(qrq qrqVar, bii biiVar) {
        this.b = biiVar;
        this.a = qrqVar;
    }

    @Override // defpackage.epy
    public final void a(eqa eqaVar, epr eprVar) {
        if (eprVar == epr.ON_CREATE) {
            this.b.z(this.a.C().getOnBackInvokedDispatcher());
        }
    }
}
