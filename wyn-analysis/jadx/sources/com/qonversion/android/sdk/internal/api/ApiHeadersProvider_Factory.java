package com.qonversion.android.sdk.internal.api;

import com.qonversion.android.sdk.internal.EnvironmentProvider;
import com.qonversion.android.sdk.internal.InternalConfig;
import com.qonversion.android.sdk.internal.storage.SharedPreferencesCache;
import df.InterfaceC2432a;

/* loaded from: classes4.dex */
public final class ApiHeadersProvider_Factory implements InterfaceC2432a {
    private final InterfaceC2432a configProvider;
    private final InterfaceC2432a environmentProvider;
    private final InterfaceC2432a sharedPreferencesCacheProvider;

    public ApiHeadersProvider_Factory(InterfaceC2432a interfaceC2432a, InterfaceC2432a interfaceC2432a2, InterfaceC2432a interfaceC2432a3) {
        this.configProvider = interfaceC2432a;
        this.sharedPreferencesCacheProvider = interfaceC2432a2;
        this.environmentProvider = interfaceC2432a3;
    }

    public static ApiHeadersProvider_Factory create(InterfaceC2432a interfaceC2432a, InterfaceC2432a interfaceC2432a2, InterfaceC2432a interfaceC2432a3) {
        return new ApiHeadersProvider_Factory(interfaceC2432a, interfaceC2432a2, interfaceC2432a3);
    }

    public static ApiHeadersProvider newInstance(InternalConfig internalConfig, SharedPreferencesCache sharedPreferencesCache, EnvironmentProvider environmentProvider) {
        return new ApiHeadersProvider(internalConfig, sharedPreferencesCache, environmentProvider);
    }

    @Override // df.InterfaceC2432a
    public ApiHeadersProvider get() {
        return new ApiHeadersProvider((InternalConfig) this.configProvider.get(), (SharedPreferencesCache) this.sharedPreferencesCacheProvider.get(), (EnvironmentProvider) this.environmentProvider.get());
    }
}
