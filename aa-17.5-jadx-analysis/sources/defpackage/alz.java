package defpackage;

/* loaded from: classes.dex */
final class alz extends afde implements afeg {
    int a;
    /* synthetic */ long b;
    final /* synthetic */ ama c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public alz(ama amaVar, afck afckVar) {
        super(2, afckVar);
        this.c = amaVar;
    }

    @Override // defpackage.afcy
    public final afck b(Object obj, afck afckVar) {
        alz alzVar = new alz(this.c, afckVar);
        alzVar.b = ((cja) obj).a;
        return alzVar;
    }

    @Override // defpackage.afcy
    public final Object hT(Object obj) throws Throwable {
        afcr afcrVar = afcr.a;
        int i = this.a;
        woy.dF(obj);
        if (i != 0) {
            return obj;
        }
        long j = this.b;
        ama amaVar = this.c;
        this.a = 1;
        Object objI = amaVar.i(j, this);
        return objI == afcrVar ? afcrVar : objI;
    }

    @Override // defpackage.afeg
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((alz) b(new cja(((cja) obj).a), (afck) obj2)).hT(afak.a);
    }
}
