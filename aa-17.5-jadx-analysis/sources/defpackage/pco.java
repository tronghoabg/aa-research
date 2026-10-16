package defpackage;

/* loaded from: classes2.dex */
public final class pco extends afde implements afeg {
    /* synthetic */ Object a;
    final /* synthetic */ boolean b;
    final /* synthetic */ kzt c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pco(kzt kztVar, boolean z, afck afckVar) {
        super(2, afckVar);
        this.c = kztVar;
        this.b = z;
    }

    @Override // defpackage.afcy
    public final afck b(Object obj, afck afckVar) {
        pco pcoVar = new pco(this.c, this.b, afckVar);
        pcoVar.a = obj;
        return pcoVar;
    }

    @Override // defpackage.afcy
    public final Object hT(Object obj) throws Throwable {
        woy.dF(obj);
        pcq pcqVarH = kzt.h((pcm) this.a, aczv.be());
        boolean z = false;
        if (!this.b ? pcqVarH == pcq.c || pcqVarH == pcq.d : pcqVarH == pcq.d) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.afeg
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((pco) b((pcm) obj, (afck) obj2)).hT(afak.a);
    }
}
