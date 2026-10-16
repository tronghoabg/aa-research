package defpackage;

/* loaded from: classes2.dex */
final class efs extends afde implements afeg {
    Object a;
    int b;
    int c;
    /* synthetic */ boolean d;
    final /* synthetic */ egd e;
    final /* synthetic */ afeg f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public efs(egd egdVar, afeg afegVar, afck afckVar) {
        super(2, afckVar);
        this.e = egdVar;
        this.f = afegVar;
    }

    @Override // defpackage.afcy
    public final afck b(Object obj, afck afckVar) {
        efs efsVar = new efs(this.e, this.f, afckVar);
        efsVar.d = ((Boolean) obj).booleanValue();
        return efsVar;
    }

    @Override // defpackage.afcy
    public final Object hT(Object obj) throws Throwable {
        Object obj2;
        int i;
        boolean z = this.d;
        afcr afcrVar = afcr.a;
        int i2 = this.c;
        if (i2 == 0) {
            woy.dF(obj);
            egd egdVar = this.e;
            this.d = z;
            this.c = 1;
            obj = egdVar.h(this);
            if (obj == afcrVar) {
                return afcrVar;
            }
        } else {
            if (i2 != 1) {
                i = this.b;
                obj2 = this.a;
                woy.dF(obj);
                return new ees(obj2, i, ((Number) obj).intValue());
            }
            woy.dF(obj);
        }
        int iHashCode = obj != null ? obj.hashCode() : 0;
        afeg afegVar = this.f;
        Boolean boolValueOf = Boolean.valueOf(z);
        this.a = obj;
        this.d = z;
        this.b = iHashCode;
        this.c = 2;
        Object objInvoke = afegVar.invoke(boolValueOf, this);
        if (objInvoke == afcrVar) {
            return afcrVar;
        }
        Object obj3 = obj;
        obj = objInvoke;
        obj2 = obj3;
        i = iHashCode;
        return new ees(obj2, i, ((Number) obj).intValue());
    }

    @Override // defpackage.afeg
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((efs) b(bool, (afck) obj2)).hT(afak.a);
    }
}
