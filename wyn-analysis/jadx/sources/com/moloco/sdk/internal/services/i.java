package com.moloco.sdk.internal.services;

import android.content.Context;

/* loaded from: classes4.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final Context f29625a;

    public i(Context context) {
        this.f29625a = context;
    }

    public final h a() {
        Context context = this.f29625a;
        com.moloco.sdk.common_adapter_internal.a aVarA = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.p(context, 0).a();
        float f10 = context.getResources().getDisplayMetrics().xdpi;
        float f11 = context.getResources().getDisplayMetrics().ydpi;
        return new h(aVarA.f28476a, aVarA.f28478c, aVarA.f28477b, aVarA.f28479d, aVarA.f28481f, aVarA.f28480e, f10, f11);
    }
}
