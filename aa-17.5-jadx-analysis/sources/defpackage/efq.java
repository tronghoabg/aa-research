package defpackage;

/* loaded from: classes2.dex */
final class efq extends afde implements afeg {
    int a;
    /* synthetic */ boolean b;
    final /* synthetic */ egd c;
    final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public efq(egd egdVar, int i, afck afckVar) {
        super(2, afckVar);
        this.c = egdVar;
        this.d = i;
    }

    @Override // defpackage.afcy
    public final afck b(Object obj, afck afckVar) {
        efq efqVar = new efq(this.c, this.d, afckVar);
        efqVar.b = ((Boolean) obj).booleanValue();
        return efqVar;
    }

    @Override // defpackage.afcy
    public final Object hT(Object obj) throws Throwable {
        int iIntValue;
        boolean z = this.b;
        afcr afcrVar = afcr.a;
        int i = this.a;
        woy.dF(obj);
        if (i != 0) {
            iIntValue = ((Number) obj).intValue();
        } else if (z) {
            egp egpVarC = this.c.c();
            this.b = true;
            this.a = 1;
            obj = egpVarC.a(this);
            if (obj == afcrVar) {
                return afcrVar;
            }
            iIntValue = ((Number) obj).intValue();
        } else {
            iIntValue = this.d;
        }
        return new Integer(iIntValue);
    }

    @Override // defpackage.afeg
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((efq) b(bool, (afck) obj2)).hT(afak.a);
    }
}
