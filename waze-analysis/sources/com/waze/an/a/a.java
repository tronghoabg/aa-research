package com.waze.an.a;

import com.waze.an.a.a.bg;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class a implements AutoCloseable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ ac f14323a;

    public a(com.waze.an.a.a.b bVar, bg bgVar) {
        h.g.b.x.f(bVar, "alertInsightsSource");
        h.g.b.x.f(bgVar, "streetNameInsightSource");
        this.f14323a = new ac(h.a.i.i(bVar, bgVar));
    }

    public final kotlinx.coroutines.b.k a() {
        return this.f14323a.a();
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f14323a.close();
    }
}
