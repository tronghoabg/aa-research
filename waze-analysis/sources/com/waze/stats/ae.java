package com.waze.stats;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class ae implements kotlinx.coroutines.b.l {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ an f40500a;

    ae(an anVar) {
        this.f40500a = anVar;
    }

    @Override // kotlinx.coroutines.b.l
    public final /* bridge */ /* synthetic */ Object emit(Object obj, h.c.e eVar) {
        com.waze.sharedui.utils.f fVar = (com.waze.sharedui.utils.f) obj;
        if (fVar instanceof ac) {
            Object objG = an.g(this.f40500a, ((ac) fVar).o(), eVar);
            if (objG == h.c.a.a.f48038a) {
                return objG;
            }
        } else {
            if (!(fVar instanceof ad)) {
                throw new h.i();
            }
            Object objI = an.i(this.f40500a, ((ad) fVar).o(), eVar);
            if (objI == h.c.a.a.f48038a) {
                return objI;
            }
        }
        return h.ab.f48028a;
    }
}
