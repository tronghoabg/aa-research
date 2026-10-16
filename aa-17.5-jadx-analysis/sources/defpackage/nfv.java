package defpackage;

/* loaded from: classes.dex */
public final class nfv implements epy {
    final eqa a;
    public final nfx b;
    public boolean c;
    final /* synthetic */ nfw d;

    public nfv(nfw nfwVar, eqa eqaVar, nfx nfxVar) {
        this.d = nfwVar;
        this.b = nfxVar;
        this.a = eqaVar;
    }

    @Override // defpackage.epy
    public final void a(eqa eqaVar, epr eprVar) {
        eqa eqaVar2 = this.a;
        eps epsVarA = eqaVar2.getLifecycle().a();
        if (epsVarA != eps.a) {
            this.c = epsVarA.a(eps.d);
            return;
        }
        this.d.b.remove(this);
        eqaVar2.getLifecycle().d(this);
        this.c = false;
    }
}
