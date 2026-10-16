package com.vungle.ads.internal;

import com.vungle.ads.internal.util.PathProvider;

/* loaded from: classes5.dex */
public final class z1 extends w1 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ServiceLocator f33905b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1(ServiceLocator serviceLocator) {
        super(false);
        this.f33905b = serviceLocator;
    }

    @Override // com.vungle.ads.internal.w1
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final com.vungle.ads.internal.downloader.h a() {
        return new com.vungle.ads.internal.downloader.h(((com.vungle.ads.internal.executor.d) ((com.vungle.ads.internal.executor.a) this.f33905b.a(com.vungle.ads.internal.executor.a.class))).f32985f, (PathProvider) this.f33905b.a(PathProvider.class));
    }
}
