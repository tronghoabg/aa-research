package defpackage;

/* loaded from: classes.dex */
final class aqc extends afde implements afeg {
    final /* synthetic */ long a;
    private /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aqc(long j, afck afckVar) {
        super(2, afckVar);
        this.a = j;
    }

    @Override // defpackage.afcy
    public final afck b(Object obj, afck afckVar) {
        aqc aqcVar = new aqc(this.a, afckVar);
        aqcVar.b = obj;
        return aqcVar;
    }

    @Override // defpackage.afcy
    public final Object hT(Object obj) throws Throwable {
        woy.dF(obj);
        ((izj) this.b).p(this.a);
        return afak.a;
    }

    @Override // defpackage.afeg
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((aqc) b((izj) obj, (afck) obj2)).hT(afak.a);
    }
}
