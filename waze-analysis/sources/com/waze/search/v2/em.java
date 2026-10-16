package com.waze.search.v2;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class em implements kotlinx.coroutines.b.l {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Object f36445a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f36446b;

    em(Object obj, int i2) {
        this.f36446b = i2;
        this.f36445a = obj;
    }

    @Override // kotlinx.coroutines.b.l
    public final /* synthetic */ Object emit(Object obj, h.c.e eVar) {
        Object objD;
        if (this.f36446b != 0) {
            ((ck) this.f36445a).E((h) obj);
            return h.ab.f48028a;
        }
        com.waze.ui.m.dl dlVar = (com.waze.ui.m.dl) obj;
        kotlinx.coroutines.b.bn bnVar = ((fi) this.f36445a).E;
        do {
            objD = bnVar.d();
        } while (!bnVar.f(objD, dlVar));
        return h.ab.f48028a;
    }
}
