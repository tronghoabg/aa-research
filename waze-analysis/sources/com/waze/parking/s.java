package com.waze.parking;

import com.waze.map.b.ai;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    private final Object f32989a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f32990b;

    public s(com.waze.config.b bVar, com.waze.config.c cVar) {
        h.g.b.x.f(bVar, "isAlertersEnabledConfig");
        h.g.b.x.f(cVar, "alerterTimeoutSecondsConfig");
        this.f32990b = bVar;
        this.f32989a = cVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.waze.map.b.ai, java.lang.Object] */
    public final ai a() {
        return this.f32990b;
    }

    public final com.waze.shared_infra.h.c b() {
        return (com.waze.shared_infra.h.c) this.f32989a;
    }

    public final int c() {
        return (int) ((com.waze.config.c) this.f32989a).b().longValue();
    }

    public final boolean d() {
        Boolean boolB = ((com.waze.config.b) this.f32990b).b();
        h.g.b.x.e(boolB, "getValue(...)");
        return boolB.booleanValue();
    }

    public s(com.waze.shared_infra.h.c cVar, ai aiVar) {
        h.g.b.x.f(cVar, "originalParking");
        this.f32989a = cVar;
        this.f32990b = aiVar;
    }
}
