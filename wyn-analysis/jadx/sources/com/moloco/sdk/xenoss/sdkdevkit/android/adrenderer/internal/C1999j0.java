package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import android.content.Context;
import com.moloco.sdk.internal.C1880b;
import com.moloco.sdk.internal.ortb.model.C1906u;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.j0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1999j0 extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e {

    /* renamed from: g, reason: collision with root package name */
    public final Context f30199g;

    /* renamed from: h, reason: collision with root package name */
    public final C1906u f30200h;

    /* renamed from: i, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.k f30201i;

    /* renamed from: j, reason: collision with root package name */
    public final G0 f30202j;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.t k;

    /* renamed from: l, reason: collision with root package name */
    public final C1880b f30203l;

    /* renamed from: m, reason: collision with root package name */
    public final Kd.a f30204m;

    /* renamed from: n, reason: collision with root package name */
    public final com.moloco.sdk.internal.services.B f30205n;

    /* renamed from: o, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.s f30206o;

    /* renamed from: p, reason: collision with root package name */
    public final String f30207p;

    /* renamed from: q, reason: collision with root package name */
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l f30208q;

    /* renamed from: r, reason: collision with root package name */
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.j f30209r;

    /* renamed from: s, reason: collision with root package name */
    public J f30210s;

    /* renamed from: t, reason: collision with root package name */
    public R0 f30211t;

    /* renamed from: u, reason: collision with root package name */
    public C2002l f30212u;

    /* renamed from: v, reason: collision with root package name */
    public final C1995h0 f30213v;

    /* renamed from: w, reason: collision with root package name */
    public final Hf.x0 f30214w;

    /* renamed from: x, reason: collision with root package name */
    public final Hf.e0 f30215x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1999j0(Context context, com.moloco.sdk.internal.services.events.c customUserEventBuilderService, C1906u c1906u, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.k kVar, G0 externalLinkHandler, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.t watermark, C1880b viewLifecycleOwner, Kd.a aVar, com.moloco.sdk.internal.services.B clickthroughService, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.s buttonTracker) {
        super(context, aVar);
        AbstractC3340k.e(context, "context");
        AbstractC3340k.e(customUserEventBuilderService, "customUserEventBuilderService");
        AbstractC3340k.e(externalLinkHandler, "externalLinkHandler");
        AbstractC3340k.e(watermark, "watermark");
        AbstractC3340k.e(viewLifecycleOwner, "viewLifecycleOwner");
        AbstractC3340k.e(clickthroughService, "clickthroughService");
        AbstractC3340k.e(buttonTracker, "buttonTracker");
        this.f30199g = context;
        this.f30200h = c1906u;
        this.f30201i = kVar;
        this.f30202j = externalLinkHandler;
        this.k = watermark;
        this.f30203l = viewLifecycleOwner;
        this.f30204m = aVar;
        this.f30205n = clickthroughService;
        this.f30206o = buttonTracker;
        this.f30207p = "AggregatedBanner";
        setTag("MolocoAggregatedBannerView");
        this.f30208q = null;
        this.f30213v = new C1995h0(this, customUserEventBuilderService);
        Hf.x0 x0VarC = Hf.k0.c(Boolean.FALSE);
        this.f30214w = x0VarC;
        this.f30215x = new Hf.e0(x0VarC);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e getBannerImpl() {
        J j8 = this.f30210s;
        if (j8 != null) {
            return j8;
        }
        R0 r02 = this.f30211t;
        return r02 == null ? this.f30212u : r02;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e
    public final void b() {
        setAdView(getBannerImpl());
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.n
    public final void destroy() {
        Ef.H.D(this.f30204m, null, new C1997i0(this, null), 3);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e
    @NotNull
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.h getAdLoader() {
        return this.f30213v;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.m
    @Nullable
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l getCreativeType() {
        return this.f30208q;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.f
    public final Hf.v0 l() {
        return this.f30215x;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e
    @Nullable
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.j getAdShowListener() {
        return this.f30209r;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e
    public void setAdShowListener(@Nullable com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.j jVar) {
        this.f30209r = jVar;
        J j8 = this.f30210s;
        if (j8 != null) {
            j8.setAdShowListener(jVar);
            return;
        }
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e eVar = this.f30211t;
        if (eVar == null) {
            eVar = this.f30212u;
        }
        if (eVar != null) {
            eVar.setAdShowListener(jVar);
        }
    }
}
