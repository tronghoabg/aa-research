package com.vungle.ads.internal;

import com.vungle.ads.internal.network.VungleApiClient;
import com.vungle.ads.internal.persistence.FilePreferences;

/* loaded from: classes5.dex */
public final class f2 extends w1 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ServiceLocator f33004b;

    public f2(ServiceLocator serviceLocator) {
        this.f33004b = serviceLocator;
    }

    @Override // com.vungle.ads.internal.w1
    public final Object a() {
        ServiceLocator serviceLocator = this.f33004b;
        return new VungleApiClient(serviceLocator.f32913a, (com.vungle.ads.internal.platform.f) serviceLocator.a(com.vungle.ads.internal.platform.f.class), (FilePreferences) this.f33004b.a(FilePreferences.class));
    }
}
