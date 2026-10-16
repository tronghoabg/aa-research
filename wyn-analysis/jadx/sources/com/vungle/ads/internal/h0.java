package com.vungle.ads.internal;

import android.os.Handler;
import com.vungle.ads.VungleError;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes5.dex */
public final class h0 implements com.vungle.ads.internal.presenter.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i0 f33016a;

    public h0(i0 i0Var) {
        this.f33016a = i0Var;
    }

    @Override // com.vungle.ads.internal.presenter.b
    public final void onAdClick(String str) throws Throwable {
        Handler handler = com.vungle.ads.internal.util.y.f33878a;
        com.vungle.ads.internal.util.y.a(new b0(this.f33016a));
        this.f33016a.getDisplayToClickMetric().d();
        AnalyticsClient analyticsClient = AnalyticsClient.INSTANCE;
        t1 displayToClickMetric = this.f33016a.getDisplayToClickMetric();
        analyticsClient.a(displayToClickMetric, this.f33016a.getLogEntry(), displayToClickMetric.f33018b);
    }

    @Override // com.vungle.ads.internal.presenter.b
    public final void onAdEnd(String str) throws Throwable {
        Handler handler = com.vungle.ads.internal.util.y.f33878a;
        com.vungle.ads.internal.util.y.a(new c0(this.f33016a));
        this.f33016a.getShowToCloseMetric().d();
        AnalyticsClient analyticsClient = AnalyticsClient.INSTANCE;
        t1 showToCloseMetric = this.f33016a.getShowToCloseMetric();
        analyticsClient.a(showToCloseMetric, this.f33016a.getLogEntry(), showToCloseMetric.f33018b);
    }

    @Override // com.vungle.ads.internal.presenter.b
    public final void onAdImpression(String str) throws Throwable {
        Handler handler = com.vungle.ads.internal.util.y.f33878a;
        com.vungle.ads.internal.util.y.a(new d0(this.f33016a));
        this.f33016a.getPresentToDisplayMetric().d();
        AnalyticsClient analyticsClient = AnalyticsClient.INSTANCE;
        t1 presentToDisplayMetric = this.f33016a.getPresentToDisplayMetric();
        analyticsClient.a(presentToDisplayMetric, this.f33016a.getLogEntry(), presentToDisplayMetric.f33018b);
        this.f33016a.getDisplayToClickMetric().e();
    }

    @Override // com.vungle.ads.internal.presenter.b
    public final void onAdLeftApplication(String str) throws Throwable {
        Handler handler = com.vungle.ads.internal.util.y.f33878a;
        com.vungle.ads.internal.util.y.a(new e0(this.f33016a));
        AnalyticsClient.a(AnalyticsClient.INSTANCE, this.f33016a.getLeaveApplicationMetric(), this.f33016a.getLogEntry(), 4);
    }

    @Override // com.vungle.ads.internal.presenter.b
    public final void onAdRewarded(String str) {
    }

    @Override // com.vungle.ads.internal.presenter.b
    public final void onAdStart(String str) throws Throwable {
        com.vungle.ads.internal.signals.j signalManager$vungle_ads_release = this.f33016a.getSignalManager$vungle_ads_release();
        synchronized (signalManager$vungle_ads_release) {
            signalManager$vungle_ads_release.f33664h.f33645f++;
        }
        this.f33016a.getAdInternal$vungle_ads_release().f33624l.d();
        AnalyticsClient analyticsClient = AnalyticsClient.INSTANCE;
        t1 t1Var = this.f33016a.getAdInternal$vungle_ads_release().f33624l;
        analyticsClient.a(t1Var, this.f33016a.getLogEntry(), t1Var.f33018b);
        this.f33016a.getPresentToDisplayMetric().e();
        Handler handler = com.vungle.ads.internal.util.y.f33878a;
        com.vungle.ads.internal.util.y.a(new f0(this.f33016a));
    }

    @Override // com.vungle.ads.internal.presenter.b
    public final void onFailure(VungleError error) throws Throwable {
        AbstractC3340k.e(error, "error");
        Handler handler = com.vungle.ads.internal.util.y.f33878a;
        com.vungle.ads.internal.util.y.a(new g0(this.f33016a, error));
        this.f33016a.getShowToFailMetric().d();
        AnalyticsClient.INSTANCE.a(this.f33016a.getShowToFailMetric(), this.f33016a.getLogEntry(), error.getCode() + '-' + error.getErrorMessage());
    }
}
