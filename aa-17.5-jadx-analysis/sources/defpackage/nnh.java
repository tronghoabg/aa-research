package defpackage;

/* loaded from: classes.dex */
final class nnh extends afde implements afeg {
    final /* synthetic */ nnl a;
    final /* synthetic */ bwq b;
    final /* synthetic */ bwq c;
    final /* synthetic */ cil d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nnh(nnl nnlVar, bwq bwqVar, bwq bwqVar2, cil cilVar, afck afckVar) {
        super(2, afckVar);
        this.a = nnlVar;
        this.b = bwqVar;
        this.c = bwqVar2;
        this.d = cilVar;
    }

    @Override // defpackage.afcy
    public final afck b(Object obj, afck afckVar) {
        return new nnh(this.a, this.b, this.c, this.d, afckVar);
    }

    @Override // defpackage.afcy
    public final Object hT(Object obj) throws Throwable {
        woy.dF(obj);
        bwq bwqVar = this.b;
        nnl nnlVar = this.a;
        if (!affa.f(nnlVar, bwqVar.a())) {
            bwq bwqVar2 = this.c;
            if ((bwqVar2.a() == nmr.c && nnlVar.o == null) || ((bwqVar2.a() == nmr.d && nnlVar.p == null) || (bwqVar2.a() == nmr.e && nnlVar.q == null))) {
                this.d.a(7);
                bwqVar.b(nnlVar);
            }
        }
        return afak.a;
    }

    @Override // defpackage.afeg
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((nnh) b((aitx) obj, (afck) obj2)).hT(afak.a);
    }
}
