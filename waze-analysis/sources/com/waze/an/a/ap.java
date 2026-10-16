package com.waze.an.a;

import com.waze.an.a.a.ar;
import com.waze.an.a.a.bb;
import com.waze.an.a.a.bg;
import com.waze.an.a.a.bm;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class ap implements AutoCloseable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ ac f14568a;

    public ap(bm bmVar, ar arVar, bg bgVar, com.waze.an.a.a.f fVar, bb bbVar, com.waze.an.a.a.p pVar) {
        h.g.b.x.f(bmVar, "wazeAsksInsightSource");
        h.g.b.x.f(arVar, "notificationInsightSource");
        h.g.b.x.f(bgVar, "streetNameInsightSource");
        h.g.b.x.f(fVar, "allAlertsInsightSource");
        h.g.b.x.f(bbVar, "segmentInsightsSource");
        h.g.b.x.f(pVar, "insightFTESource");
        this.f14568a = new ac(h.a.i.k(bmVar, arVar, bgVar, fVar, bbVar, pVar));
    }

    public final kotlinx.coroutines.b.k a() {
        return this.f14568a.a();
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f14568a.close();
    }
}
