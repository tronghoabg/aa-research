package defpackage;

/* loaded from: classes.dex */
final class vxu extends vym {
    public vxu(ajfz ajfzVar, boolean z) {
        super(z, ajfzVar);
    }

    @Override // defpackage.vym
    public final vyk a(String str) {
        ajfz ajfzVarC = c(null);
        return ajfzVarC.equals(ajfz.a) ? vyk.a : vyk.b(ajfzVarC);
    }

    @Override // defpackage.vym
    public final ajfz b(vyk vykVar) {
        return c(vykVar);
    }

    public final ajfz c(vyk vykVar) {
        return this.a ? f(vykVar) : e();
    }
}
