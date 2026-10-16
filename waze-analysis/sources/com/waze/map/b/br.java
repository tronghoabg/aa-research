package com.waze.map.b;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class br implements bl {

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.shared_infra.q.e f28103b;

    /* renamed from: c, reason: collision with root package name */
    private final kotlinx.coroutines.b.k f28104c;

    public br(com.waze.shared_infra.q.e eVar, kotlinx.coroutines.b.k kVar) {
        h.g.b.x.f(eVar, "clock");
        h.g.b.x.f(kVar, "eventsFlow");
        this.f28103b = eVar;
        this.f28104c = kVar;
    }

    @Override // com.waze.map.b.bl
    public final Object a(Class cls, long j2, h.g.a.l lVar, h.g.a.a aVar, h.c.e eVar) {
        Object objCollect = new bq(this.f28104c, cls).collect(new bn(cls, this, new h.g.b.ap(), j2, lVar, new h.g.b.am(), aVar), eVar);
        return objCollect == h.c.a.a.f48038a ? objCollect : h.ab.f48028a;
    }
}
