package com.waze.map.b;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class bn implements kotlinx.coroutines.b.l {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Class f28089a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ br f28090b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ h.g.b.ap f28091c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ long f28092d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ h.g.a.l f28093e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ h.g.b.am f28094f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ h.g.a.a f28095g;

    bn(Class cls, br brVar, h.g.b.ap apVar, long j2, h.g.a.l lVar, h.g.b.am amVar, h.g.a.a aVar) {
        this.f28089a = cls;
        this.f28090b = brVar;
        this.f28091c = apVar;
        this.f28092d = j2;
        this.f28093e = lVar;
        this.f28094f = amVar;
        this.f28095g = aVar;
    }

    @Override // kotlinx.coroutines.b.l
    public final /* bridge */ /* synthetic */ Object emit(Object obj, h.c.e eVar) {
        Object obj2 = (com.waze.install.ah) obj;
        if (!h.g.b.x.n(obj2.getClass(), this.f28089a)) {
            h.g.b.am amVar = this.f28094f;
            if (amVar.f48101a) {
                this.f28091c.f48104a = this.f28090b.f28103b.a();
                amVar.f48101a = false;
                this.f28095g.invoke();
            }
        } else if (this.f28090b.f28103b.a() - this.f28091c.f48104a > h.o.a.m(this.f28092d)) {
            h.g.a.l lVar = this.f28093e;
            h.g.b.x.d(obj2, "null cannot be cast to non-null type T of com.waze.map.controller.MapFilteredEventsImpl.observeWithInteractionDebounce");
            lVar.invoke((h) obj2);
            this.f28094f.f48101a = true;
        }
        return h.ab.f48028a;
    }
}
