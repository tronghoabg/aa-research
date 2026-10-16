package defpackage;

/* loaded from: classes2.dex */
final class gfe extends afde implements afeg {
    int a;
    final /* synthetic */ gff b;
    final /* synthetic */ int c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gfe(gff gffVar, int i, afck afckVar) {
        super(2, afckVar);
        this.b = gffVar;
        this.c = i;
    }

    @Override // defpackage.afcy
    public final afck b(Object obj, afck afckVar) {
        gfe gfeVar = new gfe(this.b, this.c, afckVar);
        gfeVar.d = obj;
        return gfeVar;
    }

    @Override // defpackage.afcy
    public final Object hT(Object obj) throws Throwable {
        bxd bxdVar;
        afcr afcrVar = afcr.a;
        if (this.a != 0) {
            bxdVar = (bxd) this.d;
            woy.dF(obj);
        } else {
            woy.dF(obj);
            bxd bxdVar2 = (bxd) this.d;
            gff gffVar = this.b;
            int i = this.c;
            this.d = bxdVar2;
            this.a = 1;
            aitg aitgVar = new aitg(affa.s(this), 1);
            aitgVar.z();
            hbz.k(gffVar.a, gffVar.b, new gfd(aitgVar), gffVar.b(), i, i);
            Object objK = aitgVar.k();
            if (objK == afcrVar) {
                return afcrVar;
            }
            obj = objK;
            bxdVar = bxdVar2;
        }
        bxdVar.b(obj);
        return afak.a;
    }

    @Override // defpackage.afeg
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((gfe) b((bxd) obj, (afck) obj2)).hT(afak.a);
    }
}
