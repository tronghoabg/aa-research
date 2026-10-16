package defpackage;

/* loaded from: classes.dex */
final class bfd extends cxt<bfe> {
    private final dfw a;

    public bfd(dfw dfwVar) {
        this.a = dfwVar;
    }

    @Override // defpackage.cxt
    public final /* bridge */ /* synthetic */ cfx d() {
        return new bfe(this.a);
    }

    @Override // defpackage.cxt
    public final /* bridge */ /* synthetic */ void e(cfx cfxVar) {
        bfe bfeVar = (bfe) cfxVar;
        dfw dfwVarG = dao.g(this.a, bzi.q(bfeVar).s);
        bfeVar.f(dfwVarG, (wci) bzi.x(bfeVar, dbc.f));
        bfc.c(bfeVar.d(), null, null, dfwVarG, 23);
        bzi.q(bfeVar).I();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof bfd) {
            return affa.f(this.a, ((bfd) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
