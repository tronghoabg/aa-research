package com.waze.t.b;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class s implements kotlinx.coroutines.b.l {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ag f40807a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ int f40808b;

    s(ag agVar, int i2) {
        this.f40807a = agVar;
        this.f40808b = i2;
    }

    @Override // kotlinx.coroutines.b.l
    public final Object emit(Object obj, h.c.e<? super h.ab> eVar) {
        Object objB = ((h.m) obj).b();
        Throwable thC = h.m.c(objB);
        ag agVar = this.f40807a;
        if (thC == null) {
            Object objK = ag.k(agVar, (com.waze.t.a.u) objB, this.f40808b, eVar);
            if (objK == h.c.a.a.f48038a) {
                return objK;
            }
        } else {
            ag.t(agVar, thC);
        }
        return h.ab.f48028a;
    }
}
