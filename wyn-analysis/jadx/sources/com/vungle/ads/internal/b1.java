package com.vungle.ads.internal;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import com.vungle.ads.AdNotLoadedCantPlay;
import com.vungle.ads.BaseFullscreenAd;
import com.vungle.ads.VungleAdSize;
import com.vungle.ads.VungleError;
import com.vungle.ads.internal.model.i3;
import com.vungle.ads.internal.protos.Sdk;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes5.dex */
public abstract class b1 extends s {

    /* renamed from: q, reason: collision with root package name */
    public WeakReference f32922q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(Context context) {
        super(context);
        AbstractC3340k.e(context, "context");
    }

    @Override // com.vungle.ads.internal.s
    public final boolean a(VungleAdSize vungleAdSize) {
        return true;
    }

    @Override // com.vungle.ads.internal.s
    public final VungleAdSize b() {
        return null;
    }

    public com.vungle.ads.internal.presenter.z m() {
        return null;
    }

    public final void a(Context context, BaseFullscreenAd.AnonymousClass2 adPlayCallback) {
        com.vungle.ads.internal.util.s sVarE;
        Long lA;
        Long lA2;
        AbstractC3340k.e(adPlayCallback, "adPlayCallback");
        com.vungle.ads.internal.util.s sVarE2 = e();
        if ((sVarE2 != null && (lA2 = sVarE2.a()) != null && lA2.longValue() == 3) || ((sVarE = e()) != null && (lA = sVarE.a()) != null && lA.longValue() == 4)) {
            l();
        }
        g().e();
        this.f32922q = context != null ? new WeakReference(context) : null;
        VungleError vungleErrorA = a(true);
        if (vungleErrorA != null) {
            adPlayCallback.onFailure(vungleErrorA);
            if (a(vungleErrorA.getCode())) {
                a(h.f33014g);
                return;
            }
            return;
        }
        com.vungle.ads.internal.model.h0 h0VarC = c();
        i3 i3VarF = f();
        if (h0VarC != null && i3VarF != null) {
            a1 a1Var = new a1(adPlayCallback, this);
            a();
            Handler handler = com.vungle.ads.internal.util.y.f33878a;
            com.vungle.ads.internal.util.y.a(new z0(this, a1Var, h0VarC, i3VarF));
            return;
        }
        adPlayCallback.onFailure(new AdNotLoadedCantPlay("Ad or Placement is null: pl=" + i3VarF + " adv=" + h0VarC).setLogEntry$vungle_ads_release(e()).logError$vungle_ads_release());
    }

    public static final void a(b1 b1Var, a1 a1Var, com.vungle.ads.internal.model.h0 h0Var, i3 i3Var) {
        Context contextD;
        WeakReference weakReference = b1Var.f32922q;
        if (weakReference == null || (contextD = (Context) weakReference.get()) == null) {
            contextD = b1Var.d();
        }
        AbstractC3340k.d(contextD, "playContext?.get() ?: context");
        com.vungle.ads.internal.presenter.a aVar = new com.vungle.ads.internal.presenter.a(a1Var, i3Var);
        y0 y0Var = new y0(h0Var, i3Var, b1Var.m());
        y0 y0Var2 = com.vungle.ads.internal.ui.l.f33730h;
        com.vungle.ads.internal.ui.a.a(y0Var);
        com.vungle.ads.internal.ui.a.a(aVar);
        Intent intentA = com.vungle.ads.internal.ui.a.a(contextD, i3Var.b(), h0Var.h());
        com.vungle.ads.internal.util.d dVar = com.vungle.ads.internal.util.d.f33838f;
        if (!com.vungle.ads.internal.util.a.a()) {
            boolean z2 = com.vungle.ads.internal.util.u.f33874a;
            com.vungle.ads.internal.util.t.a("FullscreenAdInternal", "The ad activity is in background on play, log AD_VISIBILITY_INVISIBLE.");
            intentA.putExtra("ad_invisible_logged", true);
            AnalyticsClient analyticsClient = AnalyticsClient.INSTANCE;
            m2 m2Var = new m2(Sdk.SDKMetric.SDKMetricType.AD_VISIBILITY);
            m2Var.a((Long) 1L);
            AnalyticsClient.a(analyticsClient, m2Var, b1Var.e(), 4);
        }
        b1Var.g().d();
        AnalyticsClient.a(AnalyticsClient.INSTANCE, b1Var.g(), b1Var.e());
        b1Var.h().e();
        com.vungle.ads.internal.util.a.a(contextD, null, intentA, null);
    }
}
