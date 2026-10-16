package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad;

import Af.q;
import Bf.g;
import Ef.H;
import Ef.S;
import Hf.k0;
import Hf.v0;
import Hf.x0;
import K3.r;
import Lf.e;
import X2.j;
import ac.C1346a;
import android.content.Context;
import ba.C1521a;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.f;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.h;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.B;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.D;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.G;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.creative.mraid.d;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.l;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.i;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.n;
import ef.C2532p;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes4.dex */
public final class c implements h, f, n {

    /* renamed from: a, reason: collision with root package name */
    public final Kd.a f30574a;

    /* renamed from: b, reason: collision with root package name */
    public final com.bumptech.glide.f f30575b;

    /* renamed from: c, reason: collision with root package name */
    public final i f30576c;

    /* renamed from: d, reason: collision with root package name */
    public final C1521a f30577d;

    /* renamed from: e, reason: collision with root package name */
    public final C2532p f30578e;

    /* renamed from: f, reason: collision with root package name */
    public final x0 f30579f;

    /* renamed from: g, reason: collision with root package name */
    public final C2532p f30580g;

    /* renamed from: h, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.loader.b f30581h;

    public c(Context context, String adm, Set set, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.c cVar, l lVar, l lVar2, com.moloco.sdk.acm.recorder.c cVar2, boolean z2) {
        AbstractC3340k.e(adm, "adm");
        e eVar = S.f3698a;
        this.f30574a = H.c(Jf.n.f6132a);
        G9.e eVar2 = new G9.e(set, cVar2);
        i iVar = new i(context, lVar, lVar2, cVar2, z2);
        iVar.addJavascriptInterface(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.a(eVar2), "AndroidTemplateBridge");
        com.bumptech.glide.f fVar = new com.bumptech.glide.f();
        fVar.f24230a = context;
        fVar.f24231b = iVar;
        fVar.f24232c = cVar;
        e eVar3 = S.f3698a;
        Kd.a aVarC = H.c(Jf.n.f6132a);
        fVar.f24233d = aVarC;
        fVar.f24234e = new C1346a(iVar, 3);
        fVar.f24235f = new d(context, fVar);
        fVar.f24236g = G.f30350b;
        fVar.f24237h = new r(iVar, context, aVarC);
        x0 x0VarC = k0.c(new B(true, D.f30343d));
        fVar.f24238i = x0VarC;
        fVar.f24239j = x0VarC;
        this.f30575b = fVar;
        iVar.addJavascriptInterface((d) fVar.f24235f, "AndroidMraid");
        this.f30576c = iVar;
        this.f30577d = new C1521a((Object) iVar, false, (Object) cVar2, 6);
        C2532p c2532pZ = Fe.c.z(new g(8, adm, this));
        this.f30578e = c2532pZ;
        this.f30579f = k0.c(Boolean.FALSE);
        this.f30580g = Fe.c.z(new q(this, 20));
        this.f30581h = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.loader.b) c2532pZ.getValue();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.h
    public final void a(long j8, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g gVar) {
        ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.loader.b) this.f30578e.getValue()).a(j8, new j(12, this, gVar));
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.n
    public final void destroy() {
        MolocoLogger.info$default(MolocoLogger.INSTANCE, "WebviewAd", "Ad destroy called", null, false, 12, null);
        Boolean bool = Boolean.FALSE;
        x0 x0Var = this.f30579f;
        x0Var.getClass();
        x0Var.k(null, bool);
        ((i) this.f30575b.f24231b).removeJavascriptInterface("AndroidMraid");
        this.f30576c.destroy();
        H.j(this.f30574a, null);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.h
    public final v0 isLoaded() {
        return this.f30581h.f30590e;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.f
    public final v0 l() {
        return (v0) this.f30580g.getValue();
    }
}
