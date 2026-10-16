package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class kiz extends defpackage.kfp implements defpackage.epl {
    defpackage.qsh a;
    final /* synthetic */ defpackage.kja b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kiz(defpackage.kja kjaVar) {
        super(null);
        this.b = kjaVar;
        this.a = null;
    }

    private final void l() {
        boolean zA = defpackage.ler.c().getLifecycle().a().a(defpackage.epx.d);
        defpackage.kja kjaVar = this.b;
        if (zA) {
            kjaVar.m(this.a);
        } else {
            kjaVar.m(null);
        }
    }

    @Override // defpackage.kfp
    public final void a(defpackage.qsh qshVar) {
        this.a = qshVar;
        l();
    }

    @Override // defpackage.kfp
    public final void b() {
        this.a = null;
        l();
    }

    @Override // defpackage.kfp
    public final void d(rcp rcpVar) {
        this.a = null;
        l();
    }

    @Override // defpackage.epl
    public final void eG(defpackage.eqg eqgVar) {
        l();
    }

    @Override // defpackage.kfp
    public final void eH() {
        this.a = null;
        l();
    }

    @Override // defpackage.epl
    public final void eT(defpackage.eqg eqgVar) {
        l();
    }

    @Override // defpackage.epl
    public final /* synthetic */ void eU() {
    }

    @Override // defpackage.kfp
    public final void c(defpackage.qsh qshVar) {
    }

    @Override // defpackage.epl
    public final /* synthetic */ void eD(defpackage.eqg eqgVar) {
    }

    @Override // defpackage.epl
    public final /* synthetic */ void eE(defpackage.eqg eqgVar) {
    }

    @Override // defpackage.epl
    public final /* synthetic */ void eF(defpackage.eqg eqgVar) {
    }
}
