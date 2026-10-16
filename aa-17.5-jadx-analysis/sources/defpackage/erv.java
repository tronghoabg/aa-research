package defpackage;

/* loaded from: classes2.dex */
public final class erv extends afde implements afeg {
    int a;
    final /* synthetic */ ept b;
    final /* synthetic */ eps c;
    final /* synthetic */ afco d;
    final /* synthetic */ aiyk e;
    private /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public erv(ept eptVar, eps epsVar, afco afcoVar, aiyk aiykVar, afck afckVar) {
        super(2, afckVar);
        this.b = eptVar;
        this.c = epsVar;
        this.d = afcoVar;
        this.e = aiykVar;
    }

    @Override // defpackage.afcy
    public final afck b(Object obj, afck afckVar) {
        erv ervVar = new erv(this.b, this.c, this.d, this.e, afckVar);
        ervVar.f = obj;
        return ervVar;
    }

    @Override // defpackage.afcy
    public final Object hT(Object obj) throws Throwable {
        afcr afcrVar = afcr.a;
        int i = this.a;
        woy.dF(obj);
        if (i == 0) {
            bxd bxdVar = (bxd) this.f;
            ept eptVar = this.b;
            eps epsVar = this.c;
            bqi bqiVar = new bqi(this.d, this.e, bxdVar, (afck) null, 4);
            this.a = 1;
            if (eqs.b(eptVar, epsVar, bqiVar, this) == afcrVar) {
                return afcrVar;
            }
        }
        return afak.a;
    }

    @Override // defpackage.afeg
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((erv) b((bxd) obj, (afck) obj2)).hT(afak.a);
    }
}
