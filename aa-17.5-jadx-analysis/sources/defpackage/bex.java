package defpackage;

/* loaded from: classes.dex */
final class bex extends afde implements afeg {
    final /* synthetic */ bwq a;
    final /* synthetic */ long b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bex(bwq bwqVar, long j, afck afckVar) {
        super(2, afckVar);
        this.a = bwqVar;
        this.b = j;
    }

    @Override // defpackage.afcy
    public final afck b(Object obj, afck afckVar) {
        return new bex(this.a, this.b, afckVar);
    }

    @Override // defpackage.afcy
    public final Object hT(Object obj) throws Throwable {
        woy.dF(obj);
        bwq bwqVar = this.a;
        if (((asi) bwqVar.a()) != null) {
            bwqVar.b(null);
        }
        bwqVar.b(new asi(this.b));
        return afak.a;
    }

    @Override // defpackage.afeg
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((bex) b((aitx) obj, (afck) obj2)).hT(afak.a);
    }
}
