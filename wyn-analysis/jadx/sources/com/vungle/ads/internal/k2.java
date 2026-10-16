package com.vungle.ads.internal;

import com.vungle.ads.internal.persistence.FilePreferences;
import com.vungle.ads.internal.util.PathProvider;

/* loaded from: classes5.dex */
public final class k2 extends w1 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ServiceLocator f33032b;

    public k2(ServiceLocator serviceLocator) {
        this.f33032b = serviceLocator;
    }

    @Override // com.vungle.ads.internal.w1
    public final Object a() {
        return FilePreferences.f33485d.a(((com.vungle.ads.internal.executor.d) ((com.vungle.ads.internal.executor.a) this.f33032b.a(com.vungle.ads.internal.executor.a.class))).f32980a, (PathProvider) this.f33032b.a(PathProvider.class), "settings_vungle");
    }
}
