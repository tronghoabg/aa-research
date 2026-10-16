package defpackage;

/* loaded from: classes.dex */
final class efy extends afde implements afec {
    int a;
    final /* synthetic */ egd b;
    final /* synthetic */ afco c;
    final /* synthetic */ afeg d;
    final /* synthetic */ fdf e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public efy(egd egdVar, fdf fdfVar, afco afcoVar, afeg afegVar, afck afckVar) {
        super(1, afckVar);
        this.b = egdVar;
        this.e = fdfVar;
        this.c = afcoVar;
        this.d = afegVar;
    }

    @Override // defpackage.afcy
    public final Object hT(Object obj) throws Throwable {
        afcr afcrVar = afcr.a;
        int i = this.a;
        woy.dF(obj);
        if (i != 0) {
            return obj;
        }
        efx efxVar = new efx(this.b, this.c, this.d, null);
        this.a = 1;
        Object objG = dsu.g(efxVar, this);
        return objG == afcrVar ? afcrVar : objG;
    }

    @Override // defpackage.afec
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new efy(this.b, this.e, this.c, this.d, (afck) obj).hT(afak.a);
    }
}
