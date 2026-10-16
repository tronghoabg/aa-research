package defpackage;

/* loaded from: classes3.dex */
final class vxx extends vym {
    private final vxu c;

    public vxx(ajfz ajfzVar, boolean z) {
        super(z, ajfzVar);
        this.c = new vxu(ajfzVar, z);
    }

    @Override // defpackage.vym
    public final ajfz b(vyk vykVar) {
        return vykVar == null ? this.c.c(null) : vykVar.d() ? f(vykVar) : e();
    }

    @Override // defpackage.vym
    public final vyk d(String str) {
        return this.c.a(str);
    }
}
