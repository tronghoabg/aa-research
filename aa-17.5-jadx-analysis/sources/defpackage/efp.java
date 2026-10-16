package defpackage;

/* loaded from: classes2.dex */
final class efp extends afde implements afeg {
    Object a;
    int b;
    /* synthetic */ boolean c;
    final /* synthetic */ egd d;
    final /* synthetic */ afeg e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public efp(egd egdVar, afeg afegVar, afck afckVar) {
        super(2, afckVar);
        this.d = egdVar;
        this.e = afegVar;
    }

    @Override // defpackage.afcy
    public final afck b(Object obj, afck afckVar) {
        efp efpVar = new efp(this.d, this.e, afckVar);
        efpVar.c = ((Boolean) obj).booleanValue();
        return efpVar;
    }

    @Override // defpackage.afcy
    public final Object hT(Object obj) throws Throwable {
        Object obj2;
        ehi egxVar;
        boolean z = this.c;
        afcr afcrVar = afcr.a;
        int i = this.b;
        try {
        } catch (Throwable th) {
            afeg afegVar = this.e;
            Boolean boolValueOf = Boolean.valueOf(z);
            this.a = th;
            this.c = z;
            this.b = 2;
            Object objInvoke = afegVar.invoke(boolValueOf, this);
            if (objInvoke != afcrVar) {
                obj = objInvoke;
                obj2 = th;
            }
        }
        if (i == 0) {
            woy.dF(obj);
            egd egdVar = this.d;
            afeg afegVar2 = this.e;
            this.c = z;
            this.b = 1;
            obj = egdVar.i(z, afegVar2, this);
            if (obj == afcrVar) {
                return afcrVar;
            }
        } else {
            if (i != 1) {
                obj2 = this.a;
                woy.dF(obj);
                egxVar = new egx((Throwable) obj2, ((Number) obj).intValue());
                return new aezu(egxVar, Boolean.valueOf(z));
            }
            woy.dF(obj);
        }
        egxVar = (ehi) obj;
        return new aezu(egxVar, Boolean.valueOf(z));
    }

    @Override // defpackage.afeg
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((efp) b(bool, (afck) obj2)).hT(afak.a);
    }
}
