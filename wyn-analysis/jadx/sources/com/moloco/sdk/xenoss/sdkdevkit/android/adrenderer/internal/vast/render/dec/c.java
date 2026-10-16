package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec;

import C6.l;
import Ef.H;
import Ef.S;
import Hf.e0;
import Hf.j0;
import Hf.k0;
import Hf.v0;
import Lf.e;
import R8.C0805a;
import android.content.Context;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.F0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.G0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.k;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.j;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.h;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.z0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.n;
import kotlin.jvm.internal.AbstractC3340k;
import r7.AbstractC3935e;

/* loaded from: classes4.dex */
public final class c implements n, j {

    /* renamed from: a, reason: collision with root package name */
    public final z0 f31969a;

    /* renamed from: b, reason: collision with root package name */
    public final k f31970b;

    /* renamed from: c, reason: collision with root package name */
    public final Kd.a f31971c;

    /* renamed from: d, reason: collision with root package name */
    public final E4.n f31972d;

    /* renamed from: e, reason: collision with root package name */
    public final l f31973e;

    /* renamed from: f, reason: collision with root package name */
    public final j0 f31974f;

    /* renamed from: g, reason: collision with root package name */
    public final j0 f31975g;

    /* renamed from: h, reason: collision with root package name */
    public final String f31976h;

    /* renamed from: i, reason: collision with root package name */
    public final F0 f31977i;

    /* renamed from: j, reason: collision with root package name */
    public final C0805a f31978j;

    public c(z0 dec, h hVar, int i5, Context context, com.moloco.sdk.internal.services.events.c customUserEventBuilderService, G0 externalLinkHandler, k kVar) {
        AbstractC3340k.e(dec, "dec");
        AbstractC3340k.e(context, "context");
        AbstractC3340k.e(customUserEventBuilderService, "customUserEventBuilderService");
        AbstractC3340k.e(externalLinkHandler, "externalLinkHandler");
        this.f31969a = dec;
        this.f31970b = kVar;
        e eVar = S.f3698a;
        Kd.a aVarC = H.c(Jf.n.f6132a);
        this.f31971c = aVarC;
        this.f31972d = new E4.n(i5, aVarC);
        this.f31973e = new l(customUserEventBuilderService, AbstractC3935e.E(dec.f32369c), AbstractC3935e.E(dec.f32370d), AbstractC3935e.E(dec.f32371e));
        j0 j0VarB = k0.b(0, 0, 7);
        this.f31974f = j0VarB;
        this.f31975g = j0VarB;
        this.f31976h = dec.f32367a;
        this.f31977i = new F0(dec.f32372f, dec.f32373g, dec.f32374h, dec.f32375i);
        this.f31978j = new C0805a(hVar != null ? hVar.f31980a : null, hVar != null ? Integer.valueOf(hVar.f31981b) : null, hVar != null ? Integer.valueOf(hVar.f31982c) : null, hVar != null ? hVar.f31983d : null, aVarC, context, customUserEventBuilderService, externalLinkHandler, null, null);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.n
    public final void destroy() {
        H.j(this.f31971c, null);
        this.f31978j.destroy();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.g
    public final v0 l() {
        return (e0) this.f31972d.f2940d;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.j
    public final void reset() {
        this.f31972d.reset();
    }
}
