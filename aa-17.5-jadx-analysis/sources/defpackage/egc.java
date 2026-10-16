package defpackage;

/* loaded from: classes.dex */
final class egc extends afde implements afeg {
    int a;
    final /* synthetic */ egd b;
    final /* synthetic */ afft c;
    final /* synthetic */ Object d;
    final /* synthetic */ boolean e;
    private /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public egc(egd egdVar, afft afftVar, Object obj, boolean z, afck afckVar) {
        super(2, afckVar);
        this.b = egdVar;
        this.c = afftVar;
        this.d = obj;
        this.e = z;
    }

    @Override // defpackage.afcy
    public final afck b(Object obj, afck afckVar) {
        egc egcVar = new egc(this.b, this.c, this.d, this.e, afckVar);
        egcVar.f = obj;
        return egcVar;
    }

    @Override // defpackage.afcy
    public final Object hT(Object obj) throws Throwable {
        egh eghVar = (egh) this.f;
        afcr afcrVar = afcr.a;
        int i = this.a;
        woy.dF(obj);
        if (i == 0) {
            egb egbVar = new egb(this.c, this.b, eghVar, this.d, this.e, null);
            this.f = null;
            this.a = 1;
            if (dsu.g(egbVar, this) == afcrVar) {
                return afcrVar;
            }
        }
        return afak.a;
    }

    @Override // defpackage.afeg
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((egc) b((egh) obj, (afck) obj2)).hT(afak.a);
    }
}
