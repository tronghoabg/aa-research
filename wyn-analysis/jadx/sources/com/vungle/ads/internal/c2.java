package com.vungle.ads.internal;

import com.vungle.ads.internal.network.VungleApiClient;
import com.vungle.ads.internal.util.PathProvider;

/* loaded from: classes5.dex */
public final class c2 extends w1 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ServiceLocator f32935b;

    public c2(ServiceLocator serviceLocator) {
        this.f32935b = serviceLocator;
    }

    @Override // com.vungle.ads.internal.w1
    public final Object a() {
        return new com.vungle.ads.internal.network.r((VungleApiClient) this.f32935b.a(VungleApiClient.class), ((com.vungle.ads.internal.executor.d) ((com.vungle.ads.internal.executor.a) this.f32935b.a(com.vungle.ads.internal.executor.a.class))).f32980a, ((com.vungle.ads.internal.executor.d) ((com.vungle.ads.internal.executor.a) this.f32935b.a(com.vungle.ads.internal.executor.a.class))).f32982c, (PathProvider) this.f32935b.a(PathProvider.class), (com.vungle.ads.internal.signals.j) this.f32935b.a(com.vungle.ads.internal.signals.j.class));
    }
}
