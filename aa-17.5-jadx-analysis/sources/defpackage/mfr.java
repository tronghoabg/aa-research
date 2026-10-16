package defpackage;

/* loaded from: classes.dex */
public final class mfr implements mfq {
    public final yzz a;
    public boolean b;

    static {
        yph.c("GH.PreflightScreenLog");
    }

    public mfr(yzz yzzVar) {
        this.a = yzzVar;
    }

    @Override // defpackage.mfq
    public final void a(yzy yzyVar) {
        ((ohs) mki.a.i(ohs.class)).F(rrc.h(yxy.FRX, this.a, yzyVar).l());
    }

    @Override // defpackage.mfq
    public final void b(eqa eqaVar) {
        eqaVar.getLifecycle().c(new mfs(this, 1));
    }
}
