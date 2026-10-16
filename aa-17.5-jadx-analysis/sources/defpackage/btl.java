package defpackage;

/* loaded from: classes2.dex */
final class btl extends afde implements afeg {
    int a;
    final /* synthetic */ btp b;
    final /* synthetic */ float c;
    final /* synthetic */ aec d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public btl(btp btpVar, float f, aec aecVar, afck afckVar) {
        super(2, afckVar);
        this.b = btpVar;
        this.c = f;
        this.d = aecVar;
    }

    @Override // defpackage.afcy
    public final afck b(Object obj, afck afckVar) {
        return new btl(this.b, this.c, this.d, afckVar);
    }

    @Override // defpackage.afcy
    public final Object hT(Object obj) throws Throwable {
        afcr afcrVar = afcr.a;
        int i = this.a;
        woy.dF(obj);
        if (i == 0) {
            btp btpVar = this.b;
            Float f = new Float(this.c);
            aec aecVar = this.d;
            this.a = 1;
            if (adu.k(btpVar.g, f, aecVar, null, this, 12) == afcrVar) {
                return afcrVar;
            }
        }
        return afak.a;
    }

    @Override // defpackage.afeg
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((btl) b((aitx) obj, (afck) obj2)).hT(afak.a);
    }
}
