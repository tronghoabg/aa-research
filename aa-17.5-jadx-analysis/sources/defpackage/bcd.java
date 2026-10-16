package defpackage;

/* loaded from: classes.dex */
final class bcd extends afde implements afeg {
    final /* synthetic */ bce a;
    final /* synthetic */ cst b;
    final /* synthetic */ afdr c;
    final /* synthetic */ afdr d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bcd(bce bceVar, cst cstVar, afdr afdrVar, afdr afdrVar2, afck afckVar) {
        super(2, afckVar);
        this.a = bceVar;
        this.b = cstVar;
        this.c = afdrVar;
        this.d = afdrVar2;
    }

    @Override // defpackage.afcy
    public final afck b(Object obj, afck afckVar) {
        bcd bcdVar = new bcd(this.a, this.b, this.c, this.d, afckVar);
        bcdVar.e = obj;
        return bcdVar;
    }

    @Override // defpackage.afcy
    public final Object hT(Object obj) throws Throwable {
        woy.dF(obj);
        aitx aitxVar = (aitx) this.e;
        bce bceVar = this.a;
        ahnc.d(aitxVar, null, 0, new aio(bceVar, this.b, this.c, (afck) null, 11), 3);
        return ahnc.d(aitxVar, null, 0, new ain(bceVar, this.d, (afck) null, 17), 3);
    }

    @Override // defpackage.afeg
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((bcd) b((aitx) obj, (afck) obj2)).hT(afak.a);
    }
}
