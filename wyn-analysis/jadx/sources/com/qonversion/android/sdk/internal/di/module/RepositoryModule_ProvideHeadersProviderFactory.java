package com.qonversion.android.sdk.internal.di.module;

import com.qonversion.android.sdk.internal.EnvironmentProvider;
import com.qonversion.android.sdk.internal.InternalConfig;
import com.qonversion.android.sdk.internal.api.ApiHeadersProvider;
import com.qonversion.android.sdk.internal.storage.SharedPreferencesCache;
import df.InterfaceC2432a;
import ka.AbstractC3230e0;

/* loaded from: classes4.dex */
public final class RepositoryModule_ProvideHeadersProviderFactory implements InterfaceC2432a {
    private final InterfaceC2432a configProvider;
    private final InterfaceC2432a environmentProvider;
    private final RepositoryModule module;
    private final InterfaceC2432a sharedPreferencesCacheProvider;

    public RepositoryModule_ProvideHeadersProviderFactory(RepositoryModule repositoryModule, InterfaceC2432a interfaceC2432a, InterfaceC2432a interfaceC2432a2, InterfaceC2432a interfaceC2432a3) {
        this.module = repositoryModule;
        this.configProvider = interfaceC2432a;
        this.sharedPreferencesCacheProvider = interfaceC2432a2;
        this.environmentProvider = interfaceC2432a3;
    }

    public static RepositoryModule_ProvideHeadersProviderFactory create(RepositoryModule repositoryModule, InterfaceC2432a interfaceC2432a, InterfaceC2432a interfaceC2432a2, InterfaceC2432a interfaceC2432a3) {
        return new RepositoryModule_ProvideHeadersProviderFactory(repositoryModule, interfaceC2432a, interfaceC2432a2, interfaceC2432a3);
    }

    public static ApiHeadersProvider provideHeadersProvider(RepositoryModule repositoryModule, InternalConfig internalConfig, SharedPreferencesCache sharedPreferencesCache, EnvironmentProvider environmentProvider) {
        ApiHeadersProvider apiHeadersProviderProvideHeadersProvider = repositoryModule.provideHeadersProvider(internalConfig, sharedPreferencesCache, environmentProvider);
        AbstractC3230e0.i(apiHeadersProviderProvideHeadersProvider, "Cannot return null from a non-@Nullable @Provides method");
        return apiHeadersProviderProvideHeadersProvider;
    }

    @Override // df.InterfaceC2432a
    public ApiHeadersProvider get() {
        return provideHeadersProvider(this.module, (InternalConfig) this.configProvider.get(), (SharedPreferencesCache) this.sharedPreferencesCacheProvider.get(), (EnvironmentProvider) this.environmentProvider.get());
    }
}
