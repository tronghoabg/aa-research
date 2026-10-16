package defpackage;

/* loaded from: classes2.dex */
final class efo extends afde implements afec {
    Object a;
    int b;
    final /* synthetic */ egd c;
    final /* synthetic */ afeg d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public efo(egd egdVar, afeg afegVar, afck afckVar) {
        super(1, afckVar);
        this.c = egdVar;
        this.d = afegVar;
    }

    @Override // defpackage.afcy
    public final Object hT(Object obj) throws Throwable {
        Object obj2;
        ehi egxVar;
        afcr afcrVar = afcr.a;
        int i = this.b;
        try {
        } catch (Throwable th) {
            afeg afegVar = this.d;
            this.a = th;
            this.b = 2;
            Object objInvoke = afegVar.invoke(true, this);
            if (objInvoke != afcrVar) {
                obj = objInvoke;
                obj2 = th;
            }
        }
        if (i == 0) {
            woy.dF(obj);
            egd egdVar = this.c;
            afeg afegVar2 = this.d;
            this.b = 1;
            obj = egdVar.i(true, afegVar2, this);
            if (obj == afcrVar) {
                return afcrVar;
            }
        } else {
            if (i != 1) {
                obj2 = this.a;
                woy.dF(obj);
                egxVar = new egx((Throwable) obj2, ((Number) obj).intValue());
                return new aezu(egxVar, true);
            }
            woy.dF(obj);
        }
        egxVar = (ehi) obj;
        return new aezu(egxVar, true);
    }

    @Override // defpackage.afec
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new efo(this.c, this.d, (afck) obj).hT(afak.a);
    }
}
