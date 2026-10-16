package com.vungle.ads.internal;

import android.view.View;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Map;

/* loaded from: classes5.dex */
public final class m1 implements c1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r1 f33079a;

    public m1(r1 r1Var) {
        this.f33079a = r1Var;
    }

    @Override // com.vungle.ads.internal.c1
    public final void onImpression(View view) throws Throwable {
        boolean z2 = com.vungle.ads.internal.util.u.f33874a;
        com.vungle.ads.internal.util.t.a("NativeAdInternal", "ImpressionTracker checked the native ad view become visible.");
        r1 r1Var = this.f33079a;
        r1Var.getClass();
        r1.a(r1Var, "checkpoint.0");
        r1Var.a(11, (Map) null);
        r1 r1Var2 = this.f33079a;
        long j8 = r1Var2.f33603r.get() ? 3L : 2L;
        AnalyticsClient analyticsClient = AnalyticsClient.INSTANCE;
        m2 m2Var = new m2(Sdk.SDKMetric.SDKMetricType.AD_VISIBILITY);
        m2Var.f33080c = Long.valueOf(j8);
        AnalyticsClient.a(analyticsClient, m2Var, r1Var2.f33625m, 4);
        com.vungle.ads.internal.util.t.a("NativeAdInternal", "Log metric AD_VISIBILITY: " + j8);
    }

    @Override // com.vungle.ads.internal.c1
    public final void onViewInvisible(View view) throws Throwable {
        if (this.f33079a.f33603r.getAndSet(true)) {
            return;
        }
        boolean z2 = com.vungle.ads.internal.util.u.f33874a;
        com.vungle.ads.internal.util.t.a("NativeAdInternal", "ImpressionTracker checked the native ad view invisible on play, log AD_VISIBILITY_INVISIBLE.");
        AnalyticsClient analyticsClient = AnalyticsClient.INSTANCE;
        m2 m2Var = new m2(Sdk.SDKMetric.SDKMetricType.AD_VISIBILITY);
        m2Var.f33080c = 1L;
        AnalyticsClient.a(analyticsClient, m2Var, this.f33079a.f33625m, 4);
    }
}
