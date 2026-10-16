package com.waze.map.main;

import kotlinx.coroutines.b.ch;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public class ap implements com.waze.ui.r.a.b.a {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.map.b.aj f29335a;

    /* renamed from: b, reason: collision with root package name */
    private final kotlinx.coroutines.af f29336b = com.waze.ui.a.l.p(this, null);

    /* renamed from: c, reason: collision with root package name */
    private boolean f29337c;

    /* renamed from: d, reason: collision with root package name */
    private final ch f29338d;

    public /* synthetic */ ap(com.waze.map.b.aj ajVar) {
        this.f29335a = ajVar;
        this.f29338d = ajVar.i();
    }

    public final com.waze.shared_infra.s.d b(com.waze.shared_infra.h.c cVar, boolean z) {
        h.g.b.x.f(cVar, "coordinate");
        return this.f29335a.d(cVar, z);
    }

    public final com.waze.shared_infra.s.d c(com.waze.shared_infra.h.c cVar, h.g.a.a aVar) {
        h.g.b.x.f(cVar, "coordinate");
        h.g.b.x.f(aVar, "onClick");
        return this.f29335a.e(cVar, aVar);
    }

    @Override // com.waze.ui.r.a.b.a, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        kotlinx.coroutines.aj.h(this.f29336b, null);
    }

    public final ch d() {
        return this.f29338d;
    }

    public final void e(h.g.a.l lVar, h.g.a.l lVar2, h.g.a.l lVar3, h.g.a.l lVar4, h.g.a.l lVar5, h.g.a.l lVar6, h.g.a.l lVar7, h.g.a.l lVar8, h.g.a.l lVar9) {
        h.g.b.x.f(lVar, "onAdClick");
        h.g.b.x.f(lVar2, "onExternalPoiClick");
        h.g.b.x.f(lVar3, "onAlertClick");
        h.g.b.x.f(lVar4, "onWazerClick");
        h.g.b.x.f(lVar5, "onPoiClick");
        h.g.b.x.f(lVar6, "onParkingClick");
        h.g.b.x.f(lVar7, "onUserLocationClick");
        h.g.b.x.f(lVar8, "onLongPress");
        h.g.b.x.f(lVar9, "onFallthroughClick");
        if (this.f29337c) {
            return;
        }
        this.f29337c = true;
        kotlinx.coroutines.af afVar = this.f29336b;
        kotlinx.coroutines.aj.z(afVar, null, null, new m(this, lVar8, (h.c.e) null, 7, (short[]) null), 3);
        kotlinx.coroutines.aj.z(afVar, null, null, new m(this, lVar, (h.c.e) null, 8, (int[]) null), 3);
        kotlinx.coroutines.aj.z(afVar, null, null, new m(this, lVar2, (h.c.e) null, 5, (byte[]) null), 3);
        kotlinx.coroutines.aj.z(afVar, null, null, new m(this, lVar3, (h.c.e) null, 4), 3);
        kotlinx.coroutines.aj.z(afVar, null, null, new m(this, lVar4, (h.c.e) null, 12, (char[][]) null), 3);
        kotlinx.coroutines.aj.z(afVar, null, null, new m(this, lVar5, (h.c.e) null, 10, (float[]) null), 3);
        kotlinx.coroutines.aj.z(afVar, null, null, new m(this, lVar6, (h.c.e) null, 9, (boolean[]) null), 3);
        kotlinx.coroutines.aj.z(afVar, null, null, new m(this, lVar7, (h.c.e) null, 11, (byte[][]) null), 3);
        kotlinx.coroutines.aj.z(afVar, null, null, new m(this, lVar9, (h.c.e) null, 6, (char[]) null), 3);
    }

    public final void f(com.waze.an.c.q qVar) {
        h.g.b.x.f(qVar, "overlay");
        this.f29335a.q(qVar);
    }

    public final void g(com.waze.ap.b.o oVar) {
        h.g.b.x.f(oVar, "state");
        this.f29335a.r(oVar, true);
    }
}
