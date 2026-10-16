package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import android.content.Context;
import android.view.View;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.C2097a;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class J extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e {

    /* renamed from: g, reason: collision with root package name */
    public final Context f29960g;

    /* renamed from: h, reason: collision with root package name */
    public final com.moloco.sdk.internal.services.events.c f29961h;

    /* renamed from: i, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.s f29962i;

    /* renamed from: j, reason: collision with root package name */
    public final G0 f29963j;
    public final Kd.a k;

    /* renamed from: l, reason: collision with root package name */
    public final H f29964l;

    /* renamed from: m, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l f29965m;

    /* renamed from: n, reason: collision with root package name */
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.q f29966n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J(Context context, com.moloco.sdk.internal.services.events.c customUserEventBuilderService, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.s sVar, G0 externalLinkHandler, Kd.a scope, H h10) {
        super(context, scope);
        AbstractC3340k.e(context, "context");
        AbstractC3340k.e(customUserEventBuilderService, "customUserEventBuilderService");
        AbstractC3340k.e(externalLinkHandler, "externalLinkHandler");
        AbstractC3340k.e(scope, "scope");
        this.f29960g = context;
        this.f29961h = customUserEventBuilderService;
        this.f29962i = sVar;
        this.f29963j = externalLinkHandler;
        this.k = scope;
        this.f29964l = h10;
        setTag("MolocoVastBannerView");
        this.f29965m = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l.f32379a;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e
    public final void b() {
        Hf.j0 j0Var;
        com.moloco.sdk.internal.A a5 = getAdLoader().f29950g;
        if (a5 instanceof com.moloco.sdk.internal.y) {
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c cVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c) ((com.moloco.sdk.internal.y) a5).f29793a;
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.r rVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.r) getAdShowListener();
            if (rVar != null) {
                rVar.e(cVar);
                return;
            }
            return;
        }
        if (!(a5 instanceof com.moloco.sdk.internal.z)) {
            throw new E5.Q((byte) 0, 9);
        }
        C2097a c2097a = (C2097a) ((com.moloco.sdk.internal.z) a5).f29794a;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.s sVar = this.f29962i;
        boolean z2 = sVar.f32387a;
        G0 externalLinkHandler = this.f29963j;
        AbstractC3340k.e(externalLinkHandler, "externalLinkHandler");
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.q qVarG = android.support.v4.media.session.b.G(c2097a, externalLinkHandler, this.f29960g, this.f29961h, z2, sVar.f32388b, sVar.f32389c, sVar.f32390d, sVar.f32391e, sVar.f32392f, sVar.f32393g, new a2.v(externalLinkHandler));
        this.f29966n = qVarG;
        try {
            setAdView((View) sVar.f32394h.invoke(this.f29960g, qVarG));
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.q qVar = this.f29966n;
            if (qVar != null && (j0Var = qVar.f31649i) != null) {
                Hf.k0.u(new Hf.Z(j0Var, new I(this, null), 0), this.k);
            }
            qVarG.a();
        } catch (ClassNotFoundException e7) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, "VastBannerView", "Compose dependency not available, cannot render VAST banner ad", e7, false, 8, null);
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.r rVar2 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.r) getAdShowListener();
            if (rVar2 != null) {
                rVar2.e(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.l.f30175e);
            }
        } catch (NoClassDefFoundError e10) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, "VastBannerView", "Compose dependency not available, cannot render VAST banner ad", e10, false, 8, null);
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.r rVar3 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.r) getAdShowListener();
            if (rVar3 != null) {
                rVar3.e(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.l.f30175e);
            }
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.n
    public final void destroy() {
        super.destroy();
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.q qVar = this.f29966n;
        if (qVar != null) {
            qVar.destroy();
        }
        this.f29966n = null;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.m
    @NotNull
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l getCreativeType() {
        return this.f29965m;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e
    @NotNull
    public H getAdLoader() {
        return this.f29964l;
    }
}
