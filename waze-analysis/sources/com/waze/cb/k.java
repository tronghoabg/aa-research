package com.waze.cb;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ h.g.a.a f22092a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ com.waze.shared_infra.q.i f22093b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ h.g.a.a f22094c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ l f22095d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ com.waze.uid.stats.b f22096e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ boolean f22097f;

    k(h.g.a.a aVar, com.waze.shared_infra.q.i iVar, h.g.a.a aVar2, l lVar, com.waze.uid.stats.b bVar, boolean z) {
        this.f22092a = aVar;
        this.f22093b = iVar;
        this.f22094c = aVar2;
        this.f22095d = lVar;
        this.f22096e = bVar;
        this.f22097f = z;
    }

    public final void a() {
        l.c(this.f22095d);
        com.waze.uid.d.q.f44463a.a().c().z(this.f22096e);
    }

    public final boolean b() {
        com.waze.shared_infra.q.i iVar = this.f22093b;
        return com.waze.trip_overview.views.l.c(iVar != null ? com.waze.trip_overview.views.l.b(iVar) : -1);
    }
}
