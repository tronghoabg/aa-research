package defpackage;

/* loaded from: classes.dex */
public final class bei extends afde implements afeg {
    final /* synthetic */ cqz a;
    final /* synthetic */ ben b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bei(cqz cqzVar, ben benVar, afck afckVar) {
        super(2, afckVar);
        this.a = cqzVar;
        this.b = benVar;
    }

    @Override // defpackage.afcy
    public final afck b(Object obj, afck afckVar) {
        bei beiVar = new bei(this.a, this.b, afckVar);
        beiVar.c = obj;
        return beiVar;
    }

    @Override // defpackage.afcy
    public final Object hT(Object obj) throws Throwable {
        woy.dF(obj);
        aitx aitxVar = (aitx) this.c;
        cqz cqzVar = this.a;
        ben benVar = this.b;
        ahnc.d(aitxVar, null, 4, new beh(cqzVar, benVar, null, 1, null), 1);
        return ahnc.d(aitxVar, null, 4, new beh(cqzVar, benVar, (afck) null, 0), 1);
    }

    @Override // defpackage.afeg
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((bei) b((aitx) obj, (afck) obj2)).hT(afak.a);
    }
}
