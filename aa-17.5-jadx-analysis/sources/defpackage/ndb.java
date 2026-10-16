package defpackage;

/* loaded from: classes2.dex */
final class ndb implements afeh {
    final /* synthetic */ ndp a;
    final /* synthetic */ boolean b;
    final /* synthetic */ bym c;

    public ndb(ndp ndpVar, boolean z, bym bymVar) {
        this.a = ndpVar;
        this.b = z;
        this.c = bymVar;
    }

    @Override // defpackage.afeh
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        nul nulVar = (nul) obj;
        bux buxVar = (bux) obj2;
        ((Number) obj3).intValue();
        buxVar.v(-1909846396);
        String strG = ndj.g(this.c);
        int i = ndp.q;
        mvs mvsVarI = ndj.i(nulVar, this.a, strG, true != this.b ? Float.NaN : 124.0f, buxVar, 0);
        buxVar.o();
        return mvsVarI;
    }
}
