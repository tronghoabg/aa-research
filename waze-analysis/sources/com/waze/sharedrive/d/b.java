package com.waze.sharedrive.d;

import com.waze.navigate.dg;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.sharedrive.b.a f38230a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.sharedrive.c.s f38231b;

    /* renamed from: c, reason: collision with root package name */
    private final dg f38232c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.sharedui.e.g f38233d;

    /* renamed from: e, reason: collision with root package name */
    private final com.waze.sharedui.profile.b f38234e;

    /* renamed from: f, reason: collision with root package name */
    private final h.c.j f38235f;

    /* renamed from: g, reason: collision with root package name */
    private final com.waze.location.b.d f38236g;

    /* renamed from: h, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f38237h;

    /* renamed from: i, reason: collision with root package name */
    private final h.f f38238i;

    public b(com.waze.sharedrive.b.a aVar, com.waze.sharedrive.c.s sVar, dg dgVar, com.waze.sharedui.e.g gVar, com.waze.sharedui.profile.b bVar, h.c.j jVar, com.waze.location.b.d dVar, com.waze.shared_infra.i.e eVar) {
        h.g.b.x.f(aVar, "config");
        h.g.b.x.f(sVar, "serviceFactory");
        h.g.b.x.f(dgVar, "navigationInfo");
        h.g.b.x.f(gVar, "locationService");
        h.g.b.x.f(bVar, "profileManager");
        h.g.b.x.f(jVar, "coroutineContext");
        h.g.b.x.f(dVar, "locationProvider");
        h.g.b.x.f(eVar, "logger");
        this.f38230a = aVar;
        this.f38231b = sVar;
        this.f38232c = dgVar;
        this.f38233d = gVar;
        this.f38234e = bVar;
        this.f38235f = jVar;
        this.f38236g = dVar;
        this.f38237h = eVar;
        this.f38238i = h.g.a(new ar(this, 1));
    }

    static final aq b(b bVar) {
        com.waze.sharedrive.b.a aVar = bVar.f38230a;
        if (!aVar.b()) {
            bVar.f38237h.a("ShareDriveController not created: feature disabled.");
            return null;
        }
        com.waze.sharedrive.c.y yVarA = bVar.f38231b.a();
        if (yVarA != null) {
            return new aq(yVarA, aVar, bVar.f38232c, bVar.f38233d, bVar.f38234e, bVar.f38235f, bVar.f38236g, bVar.f38237h);
        }
        bVar.f38237h.g("ShareDriveService not available, cannot create ShareDriveController");
        return null;
    }

    @Override // com.waze.sharedrive.d.a
    public final aq a() {
        return (aq) this.f38238i.getValue();
    }
}
