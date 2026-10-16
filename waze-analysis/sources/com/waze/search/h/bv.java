package com.waze.search.h;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class bv implements kotlinx.coroutines.b.l {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ bx f35857a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f35858b;

    bv(bx bxVar, int i2) {
        this.f35858b = i2;
        this.f35857a = bxVar;
    }

    @Override // kotlinx.coroutines.b.l
    public final /* synthetic */ Object emit(Object obj, h.c.e eVar) {
        Object objD;
        ce ceVarL;
        Object objD2;
        if (this.f35858b != 0) {
            com.waze.br.b.o oVar = (com.waze.br.b.o) obj;
            kotlinx.coroutines.b.bn bnVar = this.f35857a.s;
            do {
                objD2 = bnVar.d();
            } while (!bnVar.f(objD2, ce.l((ce) objD2, bx.Q(oVar), null, null, null, false, false, false, null, null, false, 4094)));
            return h.ab.f48028a;
        }
        com.waze.search.e.ac acVar = (com.waze.search.e.ac) obj;
        bx bxVar = this.f35857a;
        kotlinx.coroutines.b.bn bnVar2 = bxVar.s;
        do {
            objD = bnVar2.d();
            ceVarL = (ce) objD;
            if (((ce) bxVar.s.d()).k() instanceof com.waze.search.e.ac) {
                ceVarL = ce.l(ceVarL, null, acVar, null, null, acVar.b() instanceof com.waze.search.e.ab, false, false, null, null, false, 4077);
            }
        } while (!bnVar2.f(objD, ceVarL));
        return h.ab.f48028a;
    }
}
