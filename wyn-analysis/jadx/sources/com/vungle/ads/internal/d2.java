package com.vungle.ads.internal;

import com.vungle.ads.internal.util.PathProvider;

/* loaded from: classes5.dex */
public final class d2 extends w1 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ServiceLocator f32939b;

    public d2(ServiceLocator serviceLocator) {
        this.f32939b = serviceLocator;
    }

    @Override // com.vungle.ads.internal.w1
    public final Object a() {
        ServiceLocator serviceLocator = this.f32939b;
        return new com.vungle.ads.internal.task.p(serviceLocator.f32913a, (PathProvider) serviceLocator.a(PathProvider.class));
    }
}
