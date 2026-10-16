package com.moloco.sdk.internal.services;

import android.content.Context;

/* loaded from: classes4.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final Context f29707a;

    /* renamed from: b, reason: collision with root package name */
    public final com.moloco.sdk.acm.recorder.c f29708b;

    public l(Context context, com.moloco.sdk.acm.recorder.c cVar) {
        this.f29707a = context;
        this.f29708b = cVar;
    }

    public final void a(String str) {
        com.moloco.sdk.internal.client_metrics_data.a[] aVarArr = com.moloco.sdk.internal.client_metrics_data.a.f28494b;
        com.moloco.sdk.acm.h hVar = new com.moloco.sdk.acm.h("webview_not_available");
        com.moloco.sdk.internal.client_metrics_data.b[] bVarArr = com.moloco.sdk.internal.client_metrics_data.b.f28496a;
        hVar.a("reason", str);
        this.f29708b.a(hVar);
    }
}
