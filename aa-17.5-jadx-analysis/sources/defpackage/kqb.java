package defpackage;

/* loaded from: classes.dex */
public final class kqb extends eql {
    public final ogz a;
    private eqj h;

    public kqb(ogz ogzVar) {
        this.a = ogzVar;
    }

    public static kqb a() {
        return (kqb) mki.a.i(kqb.class);
    }

    @Override // defpackage.eql, defpackage.eqj
    protected final void c() {
        super.c();
        eqj eqjVarD = tby.d((kpp) mki.a.i(kpp.class), kqd.a(), new kbi(4));
        this.h = eqjVarD;
        r(eqjVarD, new kqc(this, 1));
    }

    @Override // defpackage.eql, defpackage.eqj
    protected final void d() {
        s(this.h);
        p();
        super.d();
    }
}
