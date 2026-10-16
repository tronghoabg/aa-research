package defpackage;

/* loaded from: classes.dex */
final class myr extends afde implements afeg {
    final /* synthetic */ long a;
    final /* synthetic */ boolean b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public myr(long j, boolean z, afck afckVar) {
        super(2, afckVar);
        this.a = j;
        this.b = z;
    }

    @Override // defpackage.afcy
    public final afck b(Object obj, afck afckVar) {
        myr myrVar = new myr(this.a, this.b, afckVar);
        myrVar.c = obj;
        return myrVar;
    }

    @Override // defpackage.afcy
    public final Object hT(Object obj) throws Throwable {
        woy.dF(obj);
        ((bxd) this.c).b(Boolean.valueOf(myv.l(dll.a(this.a), this.b)));
        return afak.a;
    }

    @Override // defpackage.afeg
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((myr) b((bxd) obj, (afck) obj2)).hT(afak.a);
    }
}
