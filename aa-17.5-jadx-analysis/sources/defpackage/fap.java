package defpackage;

/* loaded from: classes2.dex */
final class fap extends afde implements afeg {
    int a;
    final /* synthetic */ ezc b;
    final /* synthetic */ boolean c;
    final /* synthetic */ boolean d;
    final /* synthetic */ afec e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fap(ezc ezcVar, boolean z, boolean z2, afec afecVar, afck afckVar) {
        super(2, afckVar);
        this.b = ezcVar;
        this.c = z;
        this.d = z2;
        this.e = afecVar;
    }

    @Override // defpackage.afcy
    public final afck b(Object obj, afck afckVar) {
        return new fap(this.b, this.c, this.d, this.e, afckVar);
    }

    @Override // defpackage.afcy
    public final Object hT(Object obj) throws Throwable {
        afcr afcrVar = afcr.a;
        int i = this.a;
        woy.dF(obj);
        if (i != 0) {
            return obj;
        }
        ezc ezcVar = this.b;
        fao faoVar = new fao(!(ezcVar.o() && ezcVar.p()) && this.c, this.d, ezcVar, null, this.e);
        this.a = 1;
        Object objR = ezcVar.r(faoVar, this);
        return objR == afcrVar ? afcrVar : objR;
    }

    @Override // defpackage.afeg
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((fap) b((aitx) obj, (afck) obj2)).hT(afak.a);
    }
}
