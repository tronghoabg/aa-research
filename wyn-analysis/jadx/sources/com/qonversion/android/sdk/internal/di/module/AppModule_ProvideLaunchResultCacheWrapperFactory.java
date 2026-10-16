package com.qonversion.android.sdk.internal.di.module;

import com.qonversion.android.sdk.internal.services.QFallbacksService;
import com.qonversion.android.sdk.internal.storage.LaunchResultCacheWrapper;
import com.qonversion.android.sdk.internal.storage.SharedPreferencesCache;
import df.InterfaceC2432a;
import hb.K;
import ka.AbstractC3230e0;

/* loaded from: classes4.dex */
public final class AppModule_ProvideLaunchResultCacheWrapperFactory implements InterfaceC2432a {
    private final InterfaceC2432a fallbacksServiceProvider;
    private final AppModule module;
    private final InterfaceC2432a moshiProvider;
    private final InterfaceC2432a sharedPreferencesCacheProvider;

    public AppModule_ProvideLaunchResultCacheWrapperFactory(AppModule appModule, InterfaceC2432a interfaceC2432a, InterfaceC2432a interfaceC2432a2, InterfaceC2432a interfaceC2432a3) {
        this.module = appModule;
        this.moshiProvider = interfaceC2432a;
        this.sharedPreferencesCacheProvider = interfaceC2432a2;
        this.fallbacksServiceProvider = interfaceC2432a3;
    }

    public static AppModule_ProvideLaunchResultCacheWrapperFactory create(AppModule appModule, InterfaceC2432a interfaceC2432a, InterfaceC2432a interfaceC2432a2, InterfaceC2432a interfaceC2432a3) {
        return new AppModule_ProvideLaunchResultCacheWrapperFactory(appModule, interfaceC2432a, interfaceC2432a2, interfaceC2432a3);
    }

    public static LaunchResultCacheWrapper provideLaunchResultCacheWrapper(AppModule appModule, K k, SharedPreferencesCache sharedPreferencesCache, QFallbacksService qFallbacksService) {
        LaunchResultCacheWrapper launchResultCacheWrapperProvideLaunchResultCacheWrapper = appModule.provideLaunchResultCacheWrapper(k, sharedPreferencesCache, qFallbacksService);
        AbstractC3230e0.i(launchResultCacheWrapperProvideLaunchResultCacheWrapper, "Cannot return null from a non-@Nullable @Provides method");
        return launchResultCacheWrapperProvideLaunchResultCacheWrapper;
    }

    @Override // df.InterfaceC2432a
    public LaunchResultCacheWrapper get() {
        return provideLaunchResultCacheWrapper(this.module, (K) this.moshiProvider.get(), (SharedPreferencesCache) this.sharedPreferencesCacheProvider.get(), (QFallbacksService) this.fallbacksServiceProvider.get());
    }
}
