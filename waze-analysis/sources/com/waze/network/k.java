package com.waze.network;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class k implements com.waze.network.d.n {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.ao f32398a;

    public k(com.waze.ao aoVar) {
        h.g.b.x.f(aoVar, "carManager");
        this.f32398a = aoVar;
    }

    @Override // com.waze.network.d.n
    public final com.waze.network.d.m a() {
        return this.f32398a.a().d() instanceof com.waze.ak ? com.waze.network.d.m.f32212a : com.waze.network.d.m.f32213b;
    }
}
