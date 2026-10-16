package com.qonversion.android.sdk.internal.api;

import com.qonversion.android.sdk.internal.InternalConfig;
import df.InterfaceC2432a;

/* loaded from: classes4.dex */
public final class NetworkInterceptor_Factory implements InterfaceC2432a {
    private final InterfaceC2432a apiHelperProvider;
    private final InterfaceC2432a configProvider;
    private final InterfaceC2432a headersProvider;

    public NetworkInterceptor_Factory(InterfaceC2432a interfaceC2432a, InterfaceC2432a interfaceC2432a2, InterfaceC2432a interfaceC2432a3) {
        this.headersProvider = interfaceC2432a;
        this.apiHelperProvider = interfaceC2432a2;
        this.configProvider = interfaceC2432a3;
    }

    public static NetworkInterceptor_Factory create(InterfaceC2432a interfaceC2432a, InterfaceC2432a interfaceC2432a2, InterfaceC2432a interfaceC2432a3) {
        return new NetworkInterceptor_Factory(interfaceC2432a, interfaceC2432a2, interfaceC2432a3);
    }

    public static NetworkInterceptor newInstance(ApiHeadersProvider apiHeadersProvider, ApiHelper apiHelper, InternalConfig internalConfig) {
        return new NetworkInterceptor(apiHeadersProvider, apiHelper, internalConfig);
    }

    @Override // df.InterfaceC2432a
    public NetworkInterceptor get() {
        return new NetworkInterceptor((ApiHeadersProvider) this.headersProvider.get(), (ApiHelper) this.apiHelperProvider.get(), (InternalConfig) this.configProvider.get());
    }
}
