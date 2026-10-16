package defpackage;

/* loaded from: classes.dex */
final class eqh extends eqi implements epy {
    final eqa a;
    final /* synthetic */ eqj b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eqh(eqj eqjVar, eqa eqaVar, eqn eqnVar) {
        super(eqjVar, eqnVar);
        this.b = eqjVar;
        this.a = eqaVar;
    }

    @Override // defpackage.epy
    public final void a(eqa eqaVar, epr eprVar) {
        eqa eqaVar2 = this.a;
        eps epsVarA = eqaVar2.getLifecycle().a();
        if (epsVarA == eps.a) {
            this.b.k(this.c);
            return;
        }
        eps epsVar = null;
        while (epsVar != epsVarA) {
            d(eR());
            epsVar = epsVarA;
            epsVarA = eqaVar2.getLifecycle().a();
        }
    }

    @Override // defpackage.eqi
    public final void b() {
        this.a.getLifecycle().d(this);
    }

    @Override // defpackage.eqi
    public final boolean c(eqa eqaVar) {
        return this.a == eqaVar;
    }

    @Override // defpackage.eqi
    public final boolean eR() {
        return this.a.getLifecycle().a().a(eps.d);
    }
}
