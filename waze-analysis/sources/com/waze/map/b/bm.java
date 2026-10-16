package com.waze.map.b;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class bm implements bk {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.shared_infra.q.e f28088a;

    public bm(com.waze.shared_infra.q.e eVar) {
        h.g.b.x.f(eVar, "clock");
        this.f28088a = eVar;
    }

    @Override // com.waze.map.b.bk
    public final bl a(kotlinx.coroutines.b.k kVar) {
        h.g.b.x.f(kVar, "eventsFlow");
        return new br(this.f28088a, kVar);
    }
}
