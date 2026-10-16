package com.vungle.ads.internal;

import com.vungle.ads.BaseFullscreenAd;
import com.vungle.ads.VungleError;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes5.dex */
public final class a1 extends com.vungle.ads.internal.presenter.c {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b1 f32920b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(BaseFullscreenAd.AnonymousClass2 anonymousClass2, b1 b1Var) {
        super(anonymousClass2);
        this.f32920b = b1Var;
    }

    @Override // com.vungle.ads.internal.presenter.b
    public final void onAdEnd(String str) {
        this.f32920b.a(h.f33013f);
        this.f33507a.onAdEnd(str);
    }

    @Override // com.vungle.ads.internal.presenter.b
    public final void onAdImpression(String str) {
        this.f32920b.a(h.f33012e);
        this.f33507a.onAdImpression(str);
    }

    @Override // com.vungle.ads.internal.presenter.b
    public final void onAdStart(String str) throws Throwable {
        this.f32920b.a(h.f33011d);
        this.f32920b.f33624l.d();
        AnalyticsClient analyticsClient = AnalyticsClient.INSTANCE;
        b1 b1Var = this.f32920b;
        t1 t1Var = b1Var.f33624l;
        analyticsClient.a(t1Var, b1Var.f33625m, t1Var.f33018b);
        this.f33507a.onAdStart(str);
    }

    @Override // com.vungle.ads.internal.presenter.c, com.vungle.ads.internal.presenter.b
    public final void onFailure(VungleError error) {
        AbstractC3340k.e(error, "error");
        this.f32920b.a(h.f33014g);
        super.onFailure(error);
    }
}
