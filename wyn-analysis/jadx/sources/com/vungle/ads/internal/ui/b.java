package com.vungle.ads.internal.ui;

import com.vungle.ads.internal.AnalyticsClient;
import com.vungle.ads.internal.protos.Sdk;

/* loaded from: classes5.dex */
public final class b extends com.vungle.ads.internal.util.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l f33717a;

    public b(l lVar) {
        this.f33717a = lVar;
    }

    @Override // com.vungle.ads.internal.util.b
    public final void a() {
        com.vungle.ads.internal.presenter.r rVar = this.f33717a.f33732a;
        Long l10 = (rVar == null || rVar.f33549j) ? null : 1L;
        boolean z2 = com.vungle.ads.internal.util.u.f33874a;
        com.vungle.ads.internal.util.t.a("AdActivity", "App is in background, status: " + l10);
        if (l10 != null) {
            AnalyticsClient.a(AnalyticsClient.INSTANCE, Sdk.SDKMetric.SDKMetricType.AD_BACKGROUND_BEFORE_IMPRESSION, l10.longValue(), this.f33717a.f33736e, null, 8);
        }
    }

    @Override // com.vungle.ads.internal.util.b
    public final void b() {
    }
}
