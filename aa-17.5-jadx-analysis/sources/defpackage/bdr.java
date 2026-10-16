package defpackage;

/* loaded from: classes.dex */
public final class bdr extends afde implements afeg {
    final /* synthetic */ cqz a;
    final /* synthetic */ ben b;
    final /* synthetic */ blr c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bdr(cqz cqzVar, ben benVar, blr blrVar, afck afckVar) {
        super(2, afckVar);
        this.a = cqzVar;
        this.b = benVar;
        this.c = blrVar;
    }

    @Override // defpackage.afcy
    public final afck b(Object obj, afck afckVar) {
        bdr bdrVar = new bdr(this.a, this.b, this.c, afckVar);
        bdrVar.d = obj;
        return bdrVar;
    }

    @Override // defpackage.afcy
    public final Object hT(Object obj) throws Throwable {
        woy.dF(obj);
        aitx aitxVar = (aitx) this.d;
        cqz cqzVar = this.a;
        ahnc.d(aitxVar, null, 4, new ain(cqzVar, this.b, (afck) null, 19), 1);
        ahnc.d(aitxVar, null, 4, new ain(cqzVar, this.c, (afck) null, 20), 1);
        return afak.a;
    }

    @Override // defpackage.afeg
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((bdr) b((aitx) obj, (afck) obj2)).hT(afak.a);
    }
}
