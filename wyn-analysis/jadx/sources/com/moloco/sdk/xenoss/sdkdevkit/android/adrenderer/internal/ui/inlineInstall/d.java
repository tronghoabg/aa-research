package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall;

import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.G0;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes4.dex */
public final class d implements k {

    /* renamed from: a, reason: collision with root package name */
    public final X8.c f30887a;

    /* renamed from: b, reason: collision with root package name */
    public final G0 f30888b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f30889c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f30890d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f30891e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f30892f;

    /* renamed from: g, reason: collision with root package name */
    public final String f30893g;

    /* renamed from: h, reason: collision with root package name */
    public final String f30894h;

    /* renamed from: i, reason: collision with root package name */
    public final com.moloco.sdk.acm.recorder.c f30895i;

    public d(X8.c cVar, G0 g02, boolean z2, boolean z10, boolean z11, boolean z12, String str, String str2, com.moloco.sdk.acm.recorder.c cVar2) {
        this.f30887a = cVar;
        this.f30888b = g02;
        this.f30889c = z2;
        this.f30890d = z10;
        this.f30891e = z11;
        this.f30892f = z12;
        this.f30893g = str;
        this.f30894h = str2;
        this.f30895i = cVar2;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.k
    public final void a(String url) {
        AbstractC3340k.e(url, "url");
        G0 g02 = this.f30888b;
        if (!this.f30889c) {
            g02.a(url);
            return;
        }
        X8.c cVar = this.f30887a;
        c cVar2 = (c) cVar.f16187d;
        if (cVar2 == null || !cVar2.f30885a) {
            g02.a(url);
            return;
        }
        com.moloco.sdk.acm.recorder.c cVar3 = (com.moloco.sdk.acm.recorder.c) cVar.f16189f;
        if (cVar3 != null) {
            com.moloco.sdk.internal.client_metrics_data.a[] aVarArr = com.moloco.sdk.internal.client_metrics_data.a.f28494b;
            com.moloco.sdk.acm.h hVar = new com.moloco.sdk.acm.h("store_launch_started");
            com.moloco.sdk.internal.client_metrics_data.b[] bVarArr = com.moloco.sdk.internal.client_metrics_data.b.f28496a;
            hVar.a("step", "android_inline");
            cVar3.a(hVar);
        }
        cVar.a(g02, url, new e(cVar, 1));
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.k
    public final void d(String str) {
        G0 g02 = this.f30888b;
        boolean z2 = this.f30891e;
        boolean z10 = this.f30892f;
        if (z2 && !z10) {
            this.f30887a.b(str, g02);
            return;
        }
        if (z10) {
            String str2 = this.f30893g;
            if (str2 != null) {
                str = str2;
            }
            if (str != null) {
                g02.a(str);
                com.moloco.sdk.acm.recorder.c cVar = this.f30895i;
                if (cVar != null) {
                    com.moloco.sdk.internal.client_metrics_data.a[] aVarArr = com.moloco.sdk.internal.client_metrics_data.a.f28494b;
                    com.moloco.sdk.acm.h hVar = new com.moloco.sdk.acm.h("store_launch_complete");
                    com.moloco.sdk.internal.client_metrics_data.b[] bVarArr = com.moloco.sdk.internal.client_metrics_data.b.f28496a;
                    hVar.a("result", "auto_fullsheet_shown_skip");
                    cVar.a(hVar);
                }
                String str3 = this.f30894h;
                if (str3 != null) {
                    com.moloco.sdk.service_locator.j.b().a(str3);
                }
            }
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.k
    public final void f(String str) {
        G0 g02 = this.f30888b;
        boolean z2 = this.f30890d;
        boolean z10 = this.f30892f;
        if (z2 && !z10) {
            this.f30887a.b(str, g02);
            return;
        }
        if (z10) {
            String str2 = this.f30893g;
            if (str2 != null) {
                str = str2;
            }
            if (str != null) {
                g02.a(str);
                com.moloco.sdk.acm.recorder.c cVar = this.f30895i;
                if (cVar != null) {
                    com.moloco.sdk.internal.client_metrics_data.a[] aVarArr = com.moloco.sdk.internal.client_metrics_data.a.f28494b;
                    com.moloco.sdk.acm.h hVar = new com.moloco.sdk.acm.h("store_launch_complete");
                    com.moloco.sdk.internal.client_metrics_data.b[] bVarArr = com.moloco.sdk.internal.client_metrics_data.b.f28496a;
                    hVar.a("result", "auto_fullsheet_shown_complete");
                    cVar.a(hVar);
                }
                String str3 = this.f30894h;
                if (str3 != null) {
                    com.moloco.sdk.service_locator.j.b().a(str3);
                }
            }
        }
    }
}
