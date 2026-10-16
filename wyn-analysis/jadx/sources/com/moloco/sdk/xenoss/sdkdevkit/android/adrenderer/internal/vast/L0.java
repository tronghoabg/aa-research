package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast;

import java.util.List;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes4.dex */
public final class L0 {

    /* renamed from: a, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.n f31236a;

    /* renamed from: b, reason: collision with root package name */
    public final Kd.a f31237b;

    public L0(com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.n persistentHttpRequest) {
        AbstractC3340k.e(persistentHttpRequest, "persistentHttpRequest");
        this.f31236a = persistentHttpRequest;
        this.f31237b = Ef.H.c(Ef.S.f3698a);
    }

    public final void a(List urls, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.E e7, Integer num, String str) {
        AbstractC3340k.e(urls, "urls");
        ff.v vVar = ff.v.f35432a;
        if (urls.isEmpty()) {
            return;
        }
        Ef.H.D(this.f31237b, null, new K0(urls, null, null, this, vVar, e7, num, str, null), 3);
    }
}
