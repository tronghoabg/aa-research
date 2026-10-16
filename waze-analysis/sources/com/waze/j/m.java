package com.waze.j;

import com.waze.R;
import com.waze.authentication.ax;
import com.waze.search.e.p;
import com.waze.search.e.s;
import com.waze.search.e.z;
import com.waze.search.h.cd;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class m implements l {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.shared_infra.o.a f24915a;

    /* renamed from: b, reason: collision with root package name */
    private final h.g.a.l f24916b;

    /* renamed from: c, reason: collision with root package name */
    private final h.g.a.a f24917c;

    public m(com.waze.shared_infra.o.a aVar, h.g.a.l lVar, h.g.a.a aVar2) {
        x.f(aVar, "stringProvider");
        x.f(lVar, "distanceFromCurrentLocation");
        x.f(aVar2, "canShowServerProvidedDistance");
        this.f24915a = aVar;
        this.f24916b = lVar;
        this.f24917c = aVar2;
    }

    @Override // com.waze.j.l
    public final z a(com.waze.w.i iVar, h.g.a.l lVar, h.g.a.l lVar2, h.g.a.l lVar3) {
        p pVar;
        x.f(iVar, "autoCompletePlace");
        x.f(lVar, "onShown");
        x.f(lVar2, "onClick");
        x.f(lVar3, "onLongClick");
        com.waze.search.e.j jVar = new com.waze.search.e.j();
        if (iVar instanceof com.waze.w.f) {
            com.waze.shared_infra.o.a aVar = this.f24915a;
            com.waze.w.f fVar = (com.waze.w.f) iVar;
            pVar = new p(fVar.f(), ax.e(fVar), new com.waze.ui.ac.m(fVar.h()), null, lVar2, lVar3, null, null, new com.waze.search.e.i(new com.waze.ui.ac.m(fVar.g()), false), null, ax.f(fVar, aVar, this.f24916b, fVar.a(), this.f24917c), ax.d(fVar, jVar), null, 17864);
            lVar.invoke(pVar);
        } else if (iVar instanceof com.waze.w.h) {
            com.waze.w.h hVar = (com.waze.w.h) iVar;
            com.waze.shared_infra.o.a aVar2 = this.f24915a;
            com.waze.w.h hVar2 = hVar;
            pVar = new p(hVar.f(), ax.e(hVar2), hVar.h().length() > 0 ? new com.waze.ui.ac.m(hVar.h()) : cd.d(hVar.d(), null), null, lVar2, lVar3, null, null, new com.waze.search.e.i(hVar.g().length() > 0 ? new com.waze.ui.ac.m(hVar.g()) : cd.c(hVar.d()), false), null, ax.f(hVar2, aVar2, this.f24916b, hVar.a(), this.f24917c), ax.d(hVar2, jVar), null, 17864);
            lVar.invoke(pVar);
        } else {
            if (!(iVar instanceof com.waze.w.e)) {
                throw new h.i();
            }
            com.waze.w.e eVar = (com.waze.w.e) iVar;
            pVar = new p(iVar.f(), new s(eVar.c()), new com.waze.ui.ac.m(eVar.h()), null, lVar2, null, null, null, null, new com.waze.search.e.i(new com.waze.ui.ac.j(R.string.AUTOCOMPLETE_OPEN_CATEGORY_SEARCH)), null, null, false, null, 65000);
            lVar.invoke(pVar);
        }
        return pVar;
    }
}
