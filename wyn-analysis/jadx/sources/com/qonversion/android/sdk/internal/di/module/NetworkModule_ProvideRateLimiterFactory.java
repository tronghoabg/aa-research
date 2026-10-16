package com.qonversion.android.sdk.internal.di.module;

import com.qonversion.android.sdk.internal.api.RateLimiter;
import df.InterfaceC2432a;
import ka.AbstractC3230e0;

/* loaded from: classes4.dex */
public final class NetworkModule_ProvideRateLimiterFactory implements InterfaceC2432a {
    private final NetworkModule module;

    public NetworkModule_ProvideRateLimiterFactory(NetworkModule networkModule) {
        this.module = networkModule;
    }

    public static NetworkModule_ProvideRateLimiterFactory create(NetworkModule networkModule) {
        return new NetworkModule_ProvideRateLimiterFactory(networkModule);
    }

    public static RateLimiter provideRateLimiter(NetworkModule networkModule) {
        RateLimiter rateLimiterProvideRateLimiter = networkModule.provideRateLimiter();
        AbstractC3230e0.i(rateLimiterProvideRateLimiter, "Cannot return null from a non-@Nullable @Provides method");
        return rateLimiterProvideRateLimiter;
    }

    @Override // df.InterfaceC2432a
    public RateLimiter get() {
        return provideRateLimiter(this.module);
    }
}
