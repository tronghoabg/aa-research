package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid;

import Hf.C0605o;
import Hf.e0;
import Hf.j0;
import Hf.k0;
import Hf.n0;
import Hf.v0;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes4.dex */
public final class t implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.n, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.g {

    /* renamed from: a, reason: collision with root package name */
    public final tf.a f30447a;

    /* renamed from: b, reason: collision with root package name */
    public final Kd.a f30448b;

    /* renamed from: c, reason: collision with root package name */
    public final O f30449c;

    /* renamed from: d, reason: collision with root package name */
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.k f30450d;

    /* renamed from: e, reason: collision with root package name */
    public final E4.n f30451e;

    /* renamed from: f, reason: collision with root package name */
    public final j0 f30452f;

    /* renamed from: g, reason: collision with root package name */
    public final j0 f30453g;

    /* renamed from: h, reason: collision with root package name */
    public final e0 f30454h;

    public t(S8.d dVar, Kd.a scope, O webView, j0 mraidJsCommands) {
        AbstractC3340k.e(scope, "scope");
        AbstractC3340k.e(webView, "webView");
        AbstractC3340k.e(mraidJsCommands, "mraidJsCommands");
        this.f30447a = dVar;
        this.f30448b = scope;
        this.f30449c = webView;
        this.f30450d = null;
        this.f30451e = new E4.n(0, scope);
        j0 j0VarB = k0.b(0, 0, 7);
        this.f30452f = j0VarB;
        this.f30453g = j0VarB;
        this.f30454h = k0.x(new C0605o(mraidJsCommands, 2), scope, n0.f5168a, null);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.n
    public final void destroy() {
        this.f30447a.invoke();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.g
    public final v0 l() {
        return (e0) this.f30451e.f2940d;
    }
}
