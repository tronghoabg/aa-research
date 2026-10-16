package defpackage;

/* loaded from: classes.dex */
public final class tch implements eqn, epf {
    final /* synthetic */ eqn a;
    final /* synthetic */ eqj b;
    private boolean c;

    public tch(eqn eqnVar, eqj eqjVar) {
        this.a = eqnVar;
        this.b = eqjVar;
    }

    @Override // defpackage.eqn
    public final void eS(Object obj) {
        this.a.eS(obj);
        this.b.k(this);
        this.c = true;
    }

    @Override // defpackage.epf
    public final void fL(eqa eqaVar) {
        if (!this.c) {
            this.b.k(this);
            this.c = true;
        }
        eqaVar.getLifecycle().d(this);
    }

    @Override // defpackage.epf
    public final /* synthetic */ void fM() {
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

    @Override // defpackage.epf
    public final /* synthetic */ void fy(eqa eqaVar) {
    }
}
