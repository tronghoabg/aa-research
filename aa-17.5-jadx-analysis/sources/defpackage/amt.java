package defpackage;

/* loaded from: classes.dex */
final class amt extends afde implements afec {
    int a;
    final /* synthetic */ amv b;
    final /* synthetic */ Object c;
    final /* synthetic */ afei d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public amt(amv amvVar, Object obj, afei afeiVar, afck afckVar) {
        super(1, afckVar);
        this.b = amvVar;
        this.c = obj;
        this.d = afeiVar;
    }

    @Override // defpackage.afcy
    public final Object hT(Object obj) throws Throwable {
        afcr afcrVar = afcr.a;
        int i = this.a;
        woy.dF(obj);
        if (i == 0) {
            amv amvVar = this.b;
            amvVar.l(this.c);
            alg algVar = new alg(amvVar, 7);
            ams amsVar = new ams(this.d, amvVar, (afck) null, 0);
            this.a = 1;
            if (amm.a(algVar, amsVar, this) == afcrVar) {
                return afcrVar;
            }
        }
        Boolean bool = true;
        bool.getClass();
        amv amvVar2 = this.b;
        Object obj2 = this.c;
        amvVar2.d.a(amvVar2.n().a(obj2), amvVar2.a());
        amvVar2.m(obj2);
        amvVar2.k(obj2);
        return afak.a;
    }

    @Override // defpackage.afec
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new amt(this.b, this.c, this.d, (afck) obj).hT(afak.a);
    }
}
