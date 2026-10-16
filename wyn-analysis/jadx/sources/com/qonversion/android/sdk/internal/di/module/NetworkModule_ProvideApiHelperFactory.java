package com.qonversion.android.sdk.internal.di.module;

import com.qonversion.android.sdk.internal.InternalConfig;
import com.qonversion.android.sdk.internal.api.ApiHelper;
import df.InterfaceC2432a;
import ka.AbstractC3230e0;

/* loaded from: classes4.dex */
public final class NetworkModule_ProvideApiHelperFactory implements InterfaceC2432a {
    private final InterfaceC2432a internalConfigProvider;
    private final NetworkModule module;

    public NetworkModule_ProvideApiHelperFactory(NetworkModule networkModule, InterfaceC2432a interfaceC2432a) {
        this.module = networkModule;
        this.internalConfigProvider = interfaceC2432a;
    }

    public static NetworkModule_ProvideApiHelperFactory create(NetworkModule networkModule, InterfaceC2432a interfaceC2432a) {
        return new NetworkModule_ProvideApiHelperFactory(networkModule, interfaceC2432a);
    }

    public static ApiHelper provideApiHelper(NetworkModule networkModule, InternalConfig internalConfig) {
        ApiHelper apiHelperProvideApiHelper = networkModule.provideApiHelper(internalConfig);
        AbstractC3230e0.i(apiHelperProvideApiHelper, "Cannot return null from a non-@Nullable @Provides method");
        return apiHelperProvideApiHelper;
    }

    @Override // df.InterfaceC2432a
    public ApiHelper get() {
        return provideApiHelper(this.module, (InternalConfig) this.internalConfigProvider.get());
    }
}
