package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion;

import Ef.H;
import Ef.H0;
import Ef.S;
import Hf.e0;
import Hf.j0;
import Hf.k0;
import Hf.v0;
import Hf.x0;
import android.content.Context;
import android.content.res.Resources;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.G0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.C2102b;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.t;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.n;
import d0.C2384c;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes4.dex */
public final class i implements n, j {

    /* renamed from: a, reason: collision with root package name */
    public final C2102b f31684a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f31685b;

    /* renamed from: c, reason: collision with root package name */
    public final com.moloco.sdk.internal.services.events.c f31686c;

    /* renamed from: d, reason: collision with root package name */
    public final G0 f31687d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f31688e;

    /* renamed from: f, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.k f31689f;

    /* renamed from: g, reason: collision with root package name */
    public final Kd.a f31690g;

    /* renamed from: h, reason: collision with root package name */
    public final E4.n f31691h;

    /* renamed from: i, reason: collision with root package name */
    public com.moloco.sdk.xenoss.sdkdevkit.android.core.services.g f31692i;

    /* renamed from: j, reason: collision with root package name */
    public final C8.i f31693j;
    public final j0 k;

    /* renamed from: l, reason: collision with root package name */
    public final j0 f31694l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f31695m;

    /* renamed from: n, reason: collision with root package name */
    public t f31696n;

    /* renamed from: o, reason: collision with root package name */
    public final x0 f31697o;

    /* renamed from: p, reason: collision with root package name */
    public final x0 f31698p;

    public i(C2102b companion, int i5, Context context, com.moloco.sdk.internal.services.events.c customUserEventBuilderService, G0 externalLinkHandler, boolean z2, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.k kVar) {
        AbstractC3340k.e(companion, "companion");
        AbstractC3340k.e(context, "context");
        AbstractC3340k.e(customUserEventBuilderService, "customUserEventBuilderService");
        AbstractC3340k.e(externalLinkHandler, "externalLinkHandler");
        this.f31684a = companion;
        this.f31685b = context;
        this.f31686c = customUserEventBuilderService;
        this.f31687d = externalLinkHandler;
        this.f31688e = z2;
        this.f31689f = kVar;
        Lf.e eVar = S.f3698a;
        Kd.a aVarC = H.c(Jf.n.f6132a);
        this.f31690g = aVarC;
        this.f31691h = new E4.n(i5, aVarC);
        long j8 = C2384c.f33931b;
        this.f31692i = new com.moloco.sdk.xenoss.sdkdevkit.android.core.services.g(((int) C2384c.b(j8)) / Resources.getSystem().getDisplayMetrics().density, ((int) C2384c.c(j8)) / Resources.getSystem().getDisplayMetrics().density);
        this.f31693j = new C8.i(customUserEventBuilderService, companion.f31669e, companion.f31670f);
        j0 j0VarB = k0.b(0, 0, 7);
        this.k = j0VarB;
        this.f31694l = j0VarB;
        this.f31695m = companion.f31668d != null;
        t tVar = this.f31696n;
        x0 x0VarC = k0.c(tVar != null ? tVar.f32081a : null);
        this.f31697o = x0VarC;
        this.f31698p = x0VarC;
        H.D(aVarC, null, new g(this, null), 3);
    }

    public final H0 a(e eVar) {
        return H.D(this.f31690g, null, new h(this, eVar, null), 3);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.n
    public final void destroy() {
        H.j(this.f31690g, null);
        t tVar = this.f31696n;
        if (tVar != null) {
            tVar.destroy();
        }
        this.f31696n = null;
        this.f31697o.j(null);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.g
    public final v0 l() {
        return (e0) this.f31691h.f2940d;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.j
    public final void reset() {
        this.f31691h.reset();
    }
}
