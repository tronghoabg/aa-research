package com.waze.map.main;

import com.waze.map.MapViewChooser;
import com.waze.navigate.ev;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class bh implements kotlinx.coroutines.b.l {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Object f29374a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Object f29375b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f29376c;

    bh(Object obj, Object obj2, int i2) {
        this.f29376c = i2;
        this.f29374a = obj;
        this.f29375b = obj2;
    }

    @Override // kotlinx.coroutines.b.l
    public final /* synthetic */ Object emit(Object obj, h.c.e eVar) {
        if (this.f29376c != 0) {
            ((p) this.f29374a).B().a("blocking main canvas in fragment");
            ((MapViewChooser) this.f29375b).h();
            return h.ab.f48028a;
        }
        ev evVar = (ev) obj;
        h.g.b.aq aqVar = (h.g.b.aq) this.f29374a;
        com.waze.shared_infra.s.d dVar = (com.waze.shared_infra.s.d) aqVar.f48105a;
        if (dVar != null) {
            dVar.a();
        }
        aqVar.f48105a = null;
        if (evVar != null) {
            Object obj2 = this.f29375b;
            bm bmVar = (bm) obj2;
            aqVar.f48105a = bmVar.f29390b.c(evVar.a().b(), new com.waze.car_lib.e.d(obj2, evVar, 14, null));
            if (evVar.b()) {
                com.waze.places.f fVarA = evVar.a();
                bmVar.K(fVarA.b(), new com.waze.view.popups.a.q(fVarA));
            }
        }
        return h.ab.f48028a;
    }
}
