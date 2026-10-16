package defpackage;

/* loaded from: classes.dex */
final class kit extends kfn implements epf {
    qrn a;
    final /* synthetic */ kiu b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kit(kiu kiuVar) {
        super(null);
        this.b = kiuVar;
        this.a = null;
    }

    private final void r() {
        boolean zA = lbh.d().getLifecycle().a().a(eps.d);
        kiu kiuVar = this.b;
        if (zA) {
            kiuVar.m(this.a);
        } else {
            kiuVar.m(null);
        }
    }

    @Override // defpackage.kfn
    public final void a(qrn qrnVar) {
        this.a = qrnVar;
        r();
    }

    @Override // defpackage.kfn
    public final void b() {
        this.a = null;
        r();
    }

    @Override // defpackage.kfn
    public final void d(rbu rbuVar) {
        this.a = null;
        r();
    }

    @Override // defpackage.epf
    public final void fL(eqa eqaVar) {
        r();
    }

    @Override // defpackage.epf
    public final void fy(eqa eqaVar) {
        r();
    }

    @Override // defpackage.kfn
    public final void fz() {
        this.a = null;
        r();
    }

    @Override // defpackage.epf
    public final /* synthetic */ void fM() {
    }

    @Override // defpackage.kfn
    public final void c(qrn qrnVar) {
    }

    @Override // defpackage.epf
    public final /* synthetic */ void fv(eqa eqaVar) {
    }

    @Override // defpackage.epf
    public final /* synthetic */ void fw(eqa eqaVar) {
    }

    @Override // defpackage.epf
    public final /* synthetic */ void fx(eqa eqaVar) {
    }
}
