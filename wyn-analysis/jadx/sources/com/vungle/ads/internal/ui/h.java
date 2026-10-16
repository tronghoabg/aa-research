package com.vungle.ads.internal.ui;

import com.vungle.ads.internal.AnalyticsClient;
import com.vungle.ads.internal.model.r3;
import com.vungle.ads.internal.protos.Sdk;
import ef.InterfaceC2525i;

/* loaded from: classes5.dex */
public final class h implements com.vungle.ads.internal.ui.view.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l f33725a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC2525i f33726b;

    public h(l lVar, InterfaceC2525i interfaceC2525i) {
        this.f33725a = lVar;
        this.f33726b = interfaceC2525i;
    }

    @Override // com.vungle.ads.internal.ui.view.f
    public final void close() {
        com.vungle.ads.internal.presenter.r rVar = this.f33725a.f33732a;
        Long l10 = (rVar == null || rVar.f33549j) ? null : 1L;
        if (l10 != null) {
            AnalyticsClient.a(AnalyticsClient.INSTANCE, Sdk.SDKMetric.SDKMetricType.AD_CLOSED_BEFORE_IMPRESSION, l10.longValue(), this.f33725a.f33736e, null, 8);
        }
        r3 r3Var = this.f33725a.f33733b;
        if (r3Var != null) {
            l.a(this.f33726b).b(r3Var);
        }
        this.f33725a.finish();
    }
}
