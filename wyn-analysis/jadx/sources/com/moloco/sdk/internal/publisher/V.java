package com.moloco.sdk.internal.publisher;

import Ef.C0507p0;
import Ef.H0;
import android.content.Context;
import android.view.View;
import com.moloco.sdk.internal.C1880b;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.publisher.AdFormatType;
import com.moloco.sdk.publisher.AdLoad;
import com.moloco.sdk.publisher.Banner;
import com.moloco.sdk.publisher.BannerAdShowListener;
import com.moloco.sdk.publisher.MolocoAdKt;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.G0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.K0;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.Nullable;
import vf.AbstractC4345a;

/* loaded from: classes4.dex */
public final class V extends Banner implements b0 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f28947a;

    /* renamed from: b, reason: collision with root package name */
    public final com.moloco.sdk.internal.services.u f28948b;

    /* renamed from: c, reason: collision with root package name */
    public final com.moloco.sdk.internal.services.events.c f28949c;

    /* renamed from: d, reason: collision with root package name */
    public final String f28950d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f28951e;

    /* renamed from: f, reason: collision with root package name */
    public final G0 f28952f;

    /* renamed from: g, reason: collision with root package name */
    public final E f28953g;

    /* renamed from: h, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.v f28954h;

    /* renamed from: i, reason: collision with root package name */
    public final W1.r f28955i;

    /* renamed from: j, reason: collision with root package name */
    public final C1880b f28956j;
    public final com.moloco.sdk.internal.m k;

    /* renamed from: l, reason: collision with root package name */
    public final com.moloco.sdk.internal.services.B f28957l;

    /* renamed from: m, reason: collision with root package name */
    public final com.moloco.sdk.acm.recorder.c f28958m;

    /* renamed from: n, reason: collision with root package name */
    public final K0 f28959n;

    /* renamed from: o, reason: collision with root package name */
    public final AdFormatType f28960o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f28961p;

    /* renamed from: q, reason: collision with root package name */
    public final com.moloco.sdk.acm.l f28962q;

    /* renamed from: r, reason: collision with root package name */
    public com.moloco.sdk.acm.l f28963r;

    /* renamed from: s, reason: collision with root package name */
    public final Kd.a f28964s;

    /* renamed from: t, reason: collision with root package name */
    public final R0.e f28965t;

    /* renamed from: u, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.s f28966u;

    /* renamed from: v, reason: collision with root package name */
    public Y2.B f28967v;

    /* renamed from: w, reason: collision with root package name */
    public BannerAdShowListener f28968w;

    /* renamed from: x, reason: collision with root package name */
    public final B f28969x;

    /* renamed from: y, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.r f28970y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V(Context context, com.moloco.sdk.internal.services.u uVar, com.moloco.sdk.internal.services.events.c cVar, String adUnitId, boolean z2, G0 g02, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.v vVar, W1.r rVar, C1880b c1880b, com.moloco.sdk.internal.m mVar, com.moloco.sdk.internal.services.B b5, com.moloco.sdk.acm.recorder.c cVar2, K0 k02, AdFormatType adFormatType) {
        super(context);
        E e7 = E.f28913a;
        F f10 = F.f28914a;
        AbstractC3340k.e(adUnitId, "adUnitId");
        AbstractC3340k.e(adFormatType, "adFormatType");
        this.f28947a = context;
        this.f28948b = uVar;
        this.f28949c = cVar;
        this.f28950d = adUnitId;
        this.f28951e = z2;
        this.f28952f = g02;
        this.f28953g = e7;
        this.f28954h = vVar;
        this.f28955i = rVar;
        this.f28956j = c1880b;
        this.k = mVar;
        this.f28957l = b5;
        this.f28958m = cVar2;
        this.f28959n = k02;
        this.f28960o = adFormatType;
        com.moloco.sdk.internal.client_metrics_data.c[] cVarArr = com.moloco.sdk.internal.client_metrics_data.c.f28497b;
        com.moloco.sdk.acm.l lVarC = cVar2.c("ad_create_to_load_ms");
        com.moloco.sdk.internal.client_metrics_data.b[] bVarArr = com.moloco.sdk.internal.client_metrics_data.b.f28496a;
        String lowerCase = adFormatType.name().toLowerCase(Locale.ROOT);
        AbstractC3340k.d(lowerCase, "toLowerCase(...)");
        lVarC.a("ad_type", lowerCase);
        this.f28962q = lVarC;
        Lf.e eVar = Ef.S.f3698a;
        Kd.a aVarC = Ef.H.c(Jf.n.f6132a);
        this.f28964s = aVarC;
        R0.e eVar2 = new R0.e(3);
        eVar2.f10052d = null;
        eVar2.f10053e = null;
        eVar2.f10054f = null;
        eVar2.f10055g = null;
        eVar2.f10050b = false;
        eVar2.f10056h = null;
        eVar2.f10057i = null;
        eVar2.f10051c = false;
        this.f28965t = eVar2;
        this.f28966u = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.s();
        this.f28969x = AbstractC4345a.c(aVarC, new I(this, 0), adUnitId, new C0507p0(1, this, V.class, "recreateXenossAd", "recreateXenossAd(Lcom/moloco/sdk/internal/ortb/model/Bid;)Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/AdLoad;", 0, 1), adFormatType, (com.moloco.sdk.internal.services.l) com.moloco.sdk.service_locator.a.f29830a.getValue(), cVar2, new J(this, 0));
        this.f28970y = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.r) f10.invoke(new U(this));
    }

    public static final String c(V v2) {
        Object parent = v2.getParent();
        while (parent != null) {
            String simpleName = parent.getClass().getSimpleName();
            if (Bf.k.n0(simpleName, "RecyclerView", false) || Bf.k.n0(simpleName, "ScrollView", false) || Bf.k.n0(simpleName, "ListView", false) || Bf.k.n0(simpleName, "ViewPager", false) || Bf.k.n0(simpleName, "HorizontalScrollView", false) || Bf.k.n0(simpleName, "AndroidComposeView", false)) {
                return simpleName;
            }
            View view = parent instanceof View ? (View) parent : null;
            parent = view != null ? view.getParent() : null;
        }
        return "none";
    }

    @Override // com.moloco.sdk.internal.publisher.b0
    public final void a(long j8, long j10) {
        this.f28955i.a(j8, j10);
    }

    public final void b(com.moloco.sdk.internal.r internalError) {
        boolean zBooleanValue;
        Y2.B b5;
        Y2.B b10;
        R0.e eVar = this.f28965t;
        H0 h02 = (H0) eVar.f10055g;
        if (h02 != null) {
            h02.cancel(null);
        }
        eVar.f10055g = null;
        AdFormatType adFormatType = AdFormatType.MREC;
        AdFormatType adFormatType2 = this.f28960o;
        if (adFormatType2 == adFormatType && this.f28961p) {
            MolocoLogger.debug$default(MolocoLogger.INSTANCE, "BannerViewImpl", "MREC : isAdShowing state set from ViewVisibilityTracker (ImpressionViewVisibilityTracker).", false, 4, null);
            zBooleanValue = eVar.f10050b;
        } else {
            MolocoLogger.debug$default(MolocoLogger.INSTANCE, "BannerViewImpl", "Banner: isAdShowing state set from isAdShowing function.", false, 4, null);
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e eVar2 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e) eVar.f10052d;
            zBooleanValue = ((Boolean) ((this.f28951e || eVar2 == null) ? getIsViewShown() : eVar2.l()).getValue()).booleanValue();
        }
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e eVar3 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e) eVar.f10052d;
        if (eVar3 != null) {
            eVar3.destroy();
        }
        eVar.f10052d = null;
        if (internalError != null && (b10 = this.f28967v) != null) {
            b10.getClass();
            AbstractC3340k.e(internalError, "internalError");
            ((C1913b) b10.f16383b).a(internalError);
        }
        if (zBooleanValue && (b5 = this.f28967v) != null) {
            b5.s(MolocoAdKt.createAdInfo$default(this.f28950d, null, null, 6, null));
        }
        eVar.f10053e = null;
        if (adFormatType2 == adFormatType && this.f28961p) {
            eVar.f10050b = false;
        }
        eVar.f10054f = null;
    }

    @Override // com.moloco.sdk.publisher.Destroyable
    public final void destroy() {
        Ef.H.j(this.f28964s, null);
        b(null);
        setAdShowListener(null);
        this.f28967v = null;
    }

    @Override // com.moloco.sdk.publisher.Banner
    @Nullable
    public BannerAdShowListener getAdShowListener() {
        return this.f28968w;
    }

    /* renamed from: getCreateAdObjectDuration-UwyO8pc, reason: not valid java name */
    public long m199getCreateAdObjectDurationUwyO8pc() {
        return this.f28955i.f15032b;
    }

    @Override // com.moloco.sdk.publisher.AdLoad
    public final boolean isLoaded() {
        return this.f28969x.k;
    }

    @Override // com.moloco.sdk.publisher.AdLoad
    public final void load(String bidResponseJson, AdLoad.Listener listener) {
        AbstractC3340k.e(bidResponseJson, "bidResponseJson");
        com.moloco.sdk.acm.recorder.c cVar = this.f28958m;
        cVar.b(this.f28962q);
        com.moloco.sdk.internal.client_metrics_data.c[] cVarArr = com.moloco.sdk.internal.client_metrics_data.c.f28497b;
        this.f28963r = cVar.c("load_to_show_time");
        Ef.H.D(this.f28964s, null, new Q(this, bidResponseJson, listener, null), 3);
    }

    @Override // com.moloco.sdk.publisher.Banner
    public void setAdShowListener(@Nullable BannerAdShowListener bannerAdShowListener) {
        Y2.B b5 = new Y2.B(bannerAdShowListener, this.f28948b, this.f28949c, new J(this, 1), new J(this, 2), this.f28960o, this.f28958m, new J(this, 3));
        this.f28967v = b5;
        this.f28968w = (BannerAdShowListener) b5.f16384c;
    }

    /* renamed from: setCreateAdObjectDuration-LRDsOJo, reason: not valid java name */
    public void m200setCreateAdObjectDurationLRDsOJo(long j8) {
        this.f28955i.f15032b = j8;
    }
}
