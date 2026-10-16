package defpackage;

/* loaded from: classes.dex */
final class aal extends afdd implements afeg {
    Object a;
    Object b;
    int c;
    int d;
    final /* synthetic */ aam e;
    private /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aal(aam aamVar, afck afckVar) {
        super(afckVar);
        this.e = aamVar;
    }

    @Override // defpackage.afcy
    public final afck b(Object obj, afck afckVar) {
        aal aalVar = new aal(this.e, afckVar);
        aalVar.f = obj;
        return aalVar;
    }

    @Override // defpackage.afcy
    public final Object hT(Object obj) throws Throwable {
        airr airrVar;
        Object obj2;
        int i;
        Object obj3;
        afcr afcrVar = afcr.a;
        if (this.d != 0) {
            i = this.c;
            obj2 = this.b;
            Object obj4 = this.a;
            airrVar = (airr) this.f;
            woy.dF(obj);
            obj3 = obj4;
        } else {
            woy.dF(obj);
            airrVar = (airr) this.f;
            aaj aajVar = this.e.b;
            Object obj5 = aajVar.b;
            obj2 = aajVar.c;
            i = aajVar.e;
            obj3 = obj5;
        }
        while (i != Integer.MAX_VALUE) {
            long j = ((long[]) obj2)[i] >> 31;
            Object obj6 = ((Object[]) obj3)[i];
            this.f = airrVar;
            this.a = obj3;
            this.b = obj2;
            i = (int) (j & 2147483647L);
            this.c = i;
            this.d = 1;
            if (airrVar.a(obj6, this) == afcrVar) {
                return afcrVar;
            }
        }
        return afak.a;
    }

    @Override // defpackage.afeg
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((aal) b((airr) obj, (afck) obj2)).hT(afak.a);
    }
}
