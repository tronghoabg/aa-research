package defpackage;

/* loaded from: classes3.dex */
public final class tcg implements eqn, epf {
    final /* synthetic */ eqn a;
    private boolean b;

    public tcg(eqn eqnVar) {
        this.a = eqnVar;
    }

    @Override // defpackage.eqn
    public final void eS(Object obj) {
        if (this.b) {
            this.a.eS(obj);
        } else {
            this.b = true;
        }
    }

    @Override // defpackage.epf
    public final void fL(eqa eqaVar) {
        this.b = false;
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
