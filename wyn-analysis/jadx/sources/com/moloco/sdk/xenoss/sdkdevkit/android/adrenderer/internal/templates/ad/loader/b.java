package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.loader;

import Ef.H;
import Hf.k0;
import Hf.v0;
import Hf.x0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.h;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.i;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes4.dex */
public final class b implements h {

    /* renamed from: a, reason: collision with root package name */
    public final String f30586a;

    /* renamed from: b, reason: collision with root package name */
    public final Kd.a f30587b;

    /* renamed from: c, reason: collision with root package name */
    public final i f30588c;

    /* renamed from: d, reason: collision with root package name */
    public final x0 f30589d;

    /* renamed from: e, reason: collision with root package name */
    public final x0 f30590e;

    public b(String adm, Kd.a scope, i webView) {
        AbstractC3340k.e(adm, "adm");
        AbstractC3340k.e(scope, "scope");
        AbstractC3340k.e(webView, "webView");
        this.f30586a = adm;
        this.f30587b = scope;
        this.f30588c = webView;
        x0 x0VarC = k0.c(Boolean.FALSE);
        this.f30589d = x0VarC;
        this.f30590e = x0VarC;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.h
    public final void a(long j8, g gVar) {
        H.D(this.f30587b, null, new a(this, j8, gVar, null), 3);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.h
    public final v0 isLoaded() {
        return this.f30590e;
    }
}
