package com.qonversion.android.sdk.internal.di.module;

import df.InterfaceC2432a;
import hb.K;
import ka.AbstractC3230e0;

/* loaded from: classes4.dex */
public final class NetworkModule_ProvideMoshiFactory implements InterfaceC2432a {
    private final NetworkModule module;

    public NetworkModule_ProvideMoshiFactory(NetworkModule networkModule) {
        this.module = networkModule;
    }

    public static NetworkModule_ProvideMoshiFactory create(NetworkModule networkModule) {
        return new NetworkModule_ProvideMoshiFactory(networkModule);
    }

    public static K provideMoshi(NetworkModule networkModule) throws SecurityException {
        K kProvideMoshi = networkModule.provideMoshi();
        AbstractC3230e0.i(kProvideMoshi, "Cannot return null from a non-@Nullable @Provides method");
        return kProvideMoshi;
    }

    @Override // df.InterfaceC2432a
    public K get() {
        return provideMoshi(this.module);
    }
}
