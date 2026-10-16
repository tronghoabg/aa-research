package com.vungle.ads.internal;

import com.vungle.ads.internal.util.PathProvider;

/* loaded from: classes5.dex */
public final class y1 extends w1 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ServiceLocator f33896b;

    public y1(ServiceLocator serviceLocator) {
        this.f33896b = serviceLocator;
    }

    @Override // com.vungle.ads.internal.w1
    public final Object a() {
        return new PathProvider(this.f33896b.f32913a);
    }
}
