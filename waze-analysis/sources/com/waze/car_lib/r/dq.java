package com.waze.car_lib.r;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class dq {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.shared_infra.o.a f21421a;

    /* renamed from: b, reason: collision with root package name */
    private final h.g.a.a f21422b;

    public dq(com.waze.shared_infra.o.a aVar, h.g.a.a aVar2) {
        h.g.b.x.f(aVar, "stringProvider");
        h.g.b.x.f(aVar2, "isGuestSignupEnabled");
        this.f21421a = aVar;
        this.f21422b = aVar2;
    }

    public final dp a(com.waze.car_lib.f.cw cwVar) {
        h.g.b.x.f(cwVar, "coordinatorController");
        return new dp(this.f21421a, this.f21422b, cwVar);
    }
}
