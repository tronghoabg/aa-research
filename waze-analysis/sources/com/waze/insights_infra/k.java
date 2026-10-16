package com.waze.insights_infra;

import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    private final kotlinx.coroutines.b.k f24713a;

    public k(InsightsInfraNativeManager insightsInfraNativeManager) {
        x.f(insightsInfraNativeManager, "insightInfraNativeManager");
        this.f24713a = insightsInfraNativeManager.getSegmentInsightUpdates();
    }

    public final kotlinx.coroutines.b.k a() {
        return this.f24713a;
    }
}
