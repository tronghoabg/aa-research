package com.waze.car_lib.r;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ao {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.settings.g.a.a f20964a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.settings.g.b.a f20965b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.shared_infra.o.a f20966c;

    public ao(com.waze.settings.g.a.a aVar, com.waze.settings.g.b.a aVar2, com.waze.shared_infra.o.a aVar3) {
        h.g.b.x.f(aVar, "dataSource");
        h.g.b.x.f(aVar2, "statsSender");
        h.g.b.x.f(aVar3, "stringProvider");
        this.f20964a = aVar;
        this.f20965b = aVar2;
        this.f20966c = aVar3;
    }

    public final an a(com.waze.car_lib.f.co coVar) {
        h.g.b.x.f(coVar, "controller");
        return new an(coVar, this.f20964a, this.f20965b, this.f20966c);
    }
}
