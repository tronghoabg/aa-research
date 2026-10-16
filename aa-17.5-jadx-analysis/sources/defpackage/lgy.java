package defpackage;

/* loaded from: classes.dex */
public final class lgy extends eql {
    private final mpz a;
    private final lgz h = new man(this, 1);

    static {
        yph.c("GH.DefaultAppLD");
    }

    public lgy(mpz mpzVar) {
        this.a = mpzVar;
    }

    @Override // defpackage.eql, defpackage.eqj
    protected final void c() {
        super.c();
        lha lhaVarA = lgv.a();
        mpz mpzVar = this.a;
        lhaVarA.c(mpzVar, this.h);
        if (kio.b().p()) {
            m(lgv.a().a(mpzVar));
        }
    }

    @Override // defpackage.eql, defpackage.eqj
    protected final void d() {
        lgv.a().e(this.a, this.h);
        super.d();
    }
}
