package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import android.content.Context;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.fullscreen.FullscreenWebviewActivity;
import ef.C2532p;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.AbstractC3340k;
import p7.AbstractC3772b;

/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.x, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2138x implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.o {

    /* renamed from: a, reason: collision with root package name */
    public final Context f32343a;

    /* renamed from: b, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.v f32344b;

    /* renamed from: c, reason: collision with root package name */
    public final com.moloco.sdk.acm.recorder.c f32345c;

    /* renamed from: d, reason: collision with root package name */
    public final Kd.a f32346d;

    /* renamed from: e, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.e f32347e;

    /* renamed from: f, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.c f32348f;

    /* renamed from: g, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.e f32349g;

    /* renamed from: h, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.e f32350h;

    /* renamed from: i, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.c f32351i;

    /* renamed from: j, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l f32352j;
    public final Hf.x0 k;

    /* renamed from: l, reason: collision with root package name */
    public final C2532p f32353l;

    /* renamed from: m, reason: collision with root package name */
    public final Hf.x0 f32354m;

    public C2138x(Context context, String adm, com.moloco.sdk.internal.services.B b5, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.v vVar, G0 g02, com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.n persistentHttpRequest, com.moloco.sdk.acm.recorder.c cVar, boolean z2) {
        AbstractC3340k.e(adm, "adm");
        AbstractC3340k.e(persistentHttpRequest, "persistentHttpRequest");
        this.f32343a = context;
        this.f32344b = vVar;
        this.f32345c = cVar;
        Lf.e eVar = Ef.S.f3698a;
        Kd.a aVarC = Ef.H.c(Jf.n.f6132a);
        this.f32346d = aVarC;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.e eVar2 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.e(1, aVarC);
        this.f32347e = eVar2;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.l lVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.l(1, aVarC);
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.c cVar2 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.c(b5, aVarC);
        this.f32348f = cVar2;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.l lVar2 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.l(0, aVarC);
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.e eVar3 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.e(2, aVarC);
        this.f32349g = eVar3;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.e eVar4 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.e(0, aVarC);
        this.f32350h = eVar4;
        this.f32351i = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.c(context, adm, ff.m.P0(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a[]{eVar2, cVar2, lVar, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.a(cVar, 0), new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.a(g02, 1), new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.i(persistentHttpRequest), lVar2, eVar3, eVar4}), cVar2, lVar, lVar2, cVar, z2);
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l lVarA = y0.a(adm);
        MolocoLogger.debug$default(MolocoLogger.INSTANCE, "TemplateFullscreenAd", "Template ad resolved creativeType: " + lVarA, false, 4, null);
        this.f32352j = lVarA;
        Boolean bool = Boolean.FALSE;
        this.k = Hf.k0.c(bool);
        this.f32353l = Fe.c.z(new Af.q(this, 17));
        this.f32354m = Hf.k0.c(bool);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.h
    public final void a(long j8, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g gVar) {
        this.f32351i.a(j8, gVar);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.n
    public final void destroy() {
        MolocoLogger.info$default(MolocoLogger.INSTANCE, "TemplateFullscreenAd", "destroy called", null, false, 12, null);
        this.f32351i.destroy();
        WeakReference weakReference = FullscreenWebviewActivity.f30710d;
        AbstractC3772b.c();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.m
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l getCreativeType() {
        return this.f32352j;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.h
    public final Hf.v0 isLoaded() {
        return this.f32351i.f30581h.f30590e;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.o
    public final Hf.v0 k() {
        return this.f32354m;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.f
    public final Hf.v0 l() {
        return (Hf.v0) this.f32353l.getValue();
    }
}
