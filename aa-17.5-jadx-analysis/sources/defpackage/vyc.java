package defpackage;

/* loaded from: classes3.dex */
final class vyc extends vym {
    private final double c;
    private final vxu d;

    /* JADX WARN: Illegal instructions before constructor call */
    public vyc(ajfz ajfzVar, double d) {
        vyk vykVarB = vyk.b(ajfzVar);
        super(vykVarB.c > 0, ajfzVar);
        this.c = d;
        this.d = new vxu(ajfzVar, vykVarB.c(d));
    }

    @Override // defpackage.vym
    public final ajfz b(vyk vykVar) {
        return vykVar == null ? this.d.c(null) : vykVar.c(this.c) ? f(vykVar) : e();
    }

    @Override // defpackage.vym
    public final vyk d(String str) {
        return this.d.a(str);
    }
}
