package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class kqj extends defpackage.eqr {
    public final defpackage.kqe a;
    private defpackage.eqp h;

    public kqj(defpackage.kqe kqeVar) {
        this.a = kqeVar;
    }

    public static defpackage.kqj a() {
        return (defpackage.kqj) defpackage.mkp.a.i(defpackage.kqj.class);
    }

    @Override // defpackage.eqr, defpackage.eqp
    protected final void c() {
        super.c();
        defpackage.eqp eqpVarD = defpackage.tcu.d((defpackage.kpv) defpackage.mkp.a.i(defpackage.kpv.class), kql.a(), new kbk(7));
        this.h = eqpVarD;
        r(eqpVarD, new defpackage.kqk(this, 1));
    }

    @Override // defpackage.eqr, defpackage.eqp
    protected final void d() {
        s(this.h);
        p();
        super.d();
    }
}
