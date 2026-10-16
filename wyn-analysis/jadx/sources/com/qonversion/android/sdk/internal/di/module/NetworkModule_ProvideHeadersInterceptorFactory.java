package com.qonversion.android.sdk.internal.di.module;

import com.qonversion.android.sdk.internal.InternalConfig;
import com.qonversion.android.sdk.internal.api.ApiHeadersProvider;
import com.qonversion.android.sdk.internal.api.ApiHelper;
import com.qonversion.android.sdk.internal.api.NetworkInterceptor;
import df.InterfaceC2432a;
import ka.AbstractC3230e0;

/* loaded from: classes4.dex */
public final class NetworkModule_ProvideHeadersInterceptorFactory implements InterfaceC2432a {
    private final InterfaceC2432a apiHeadersProvider;
    private final InterfaceC2432a apiHelperProvider;
    private final InterfaceC2432a configProvider;
    private final NetworkModule module;

    public NetworkModule_ProvideHeadersInterceptorFactory(NetworkModule networkModule, InterfaceC2432a interfaceC2432a, InterfaceC2432a interfaceC2432a2, InterfaceC2432a interfaceC2432a3) {
        this.module = networkModule;
        this.apiHeadersProvider = interfaceC2432a;
        this.configProvider = interfaceC2432a2;
        this.apiHelperProvider = interfaceC2432a3;
    }

    public static NetworkModule_ProvideHeadersInterceptorFactory create(NetworkModule networkModule, InterfaceC2432a interfaceC2432a, InterfaceC2432a interfaceC2432a2, InterfaceC2432a interfaceC2432a3) {
        return new NetworkModule_ProvideHeadersInterceptorFactory(networkModule, interfaceC2432a, interfaceC2432a2, interfaceC2432a3);
    }

    public static NetworkInterceptor provideHeadersInterceptor(NetworkModule networkModule, ApiHeadersProvider apiHeadersProvider, InternalConfig internalConfig, ApiHelper apiHelper) {
        NetworkInterceptor networkInterceptorProvideHeadersInterceptor = networkModule.provideHeadersInterceptor(apiHeadersProvider, internalConfig, apiHelper);
        AbstractC3230e0.i(networkInterceptorProvideHeadersInterceptor, "Cannot return null from a non-@Nullable @Provides method");
        return networkInterceptorProvideHeadersInterceptor;
    }

    @Override // df.InterfaceC2432a
    public NetworkInterceptor get() {
        return provideHeadersInterceptor(this.module, (ApiHeadersProvider) this.apiHeadersProvider.get(), (InternalConfig) this.configProvider.get(), (ApiHelper) this.apiHelperProvider.get());
    }
}
