package defpackage;

/* loaded from: classes.dex */
final class efg extends afde implements afeh {
    int a;
    final /* synthetic */ egd b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public efg(egd egdVar, afck afckVar) {
        super(3, afckVar);
        this.b = egdVar;
    }

    @Override // defpackage.afcy
    public final Object hT(Object obj) throws Throwable {
        afcr afcrVar = afcr.a;
        int i = this.a;
        woy.dF(obj);
        if (i == 0) {
            egd egdVar = this.b;
            this.a = 1;
            if (egdVar.e(this) == afcrVar) {
                return afcrVar;
            }
        }
        return afak.a;
    }

    @Override // defpackage.afeh
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return new efg(this.b, (afck) obj3).hT(afak.a);
    }
}
