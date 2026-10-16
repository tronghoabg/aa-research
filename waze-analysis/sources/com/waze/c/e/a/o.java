package com.waze.c.e.a;

import com.waze.c.d.ai;
import com.waze.map.b.de;
import h.ab;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class o implements kotlinx.coroutines.b.l {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ t f18451a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f18452b;

    o(t tVar, int i2) {
        this.f18452b = i2;
        this.f18451a = tVar;
    }

    @Override // kotlinx.coroutines.b.l
    public final /* synthetic */ Object emit(Object obj, h.c.e eVar) {
        if (this.f18452b != 0) {
            this.f18451a.x(((de) obj).a(), ai.f18290a);
            return ab.f48028a;
        }
        t tVar = this.f18451a;
        c cVar = (c) obj;
        com.waze.shared_infra.i.e eVar2 = tVar.f18480k;
        int size = cVar.b().h().size();
        com.waze.shared_infra.n.c cVar2 = tVar.r;
        eVar2.a("collecting map state, routes: " + size + ", mainCanvasControl:" + (cVar2 != null ? (com.waze.map.b.d) cVar2.e().d() : null));
        if (tVar.r == null) {
            Object objG = t.g(tVar, eVar);
            if (objG == h.c.a.a.f48038a) {
                return objG;
            }
        } else {
            Object objE = t.e(tVar, cVar, true, eVar);
            if (objE == h.c.a.a.f48038a) {
                return objE;
            }
        }
        return ab.f48028a;
    }
}
