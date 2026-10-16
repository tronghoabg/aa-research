package com.waze.insights_infra;

import h.ab;
import h.g.a.l;
import h.g.b.u;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final /* synthetic */ class e extends u implements l {
    e(Object obj) {
        super(1, obj, InsightsInfraNativeManager.class, "setConfigResponse", "setConfigResponse(Lcom/waze/insightsserving/proto/GetInsightConfigurationsResponse;)V", 0);
    }

    @Override // h.g.a.l
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        ((InsightsInfraNativeManager) this.receiver).setConfigResponse((com.waze.ap.b.d) obj);
        return ab.f48028a;
    }
}
