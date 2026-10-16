package com.qonversion.android.sdk.internal.di.module;

import com.qonversion.android.sdk.internal.InternalConfig;
import df.InterfaceC2432a;
import hb.K;
import java.io.EOFException;
import ka.AbstractC3230e0;
import okhttp3.OkHttpClient;
import zg.T;

/* loaded from: classes4.dex */
public final class NetworkModule_ProvideRetrofitFactory implements InterfaceC2432a {
    private final InterfaceC2432a clientProvider;
    private final InterfaceC2432a internalConfigProvider;
    private final NetworkModule module;
    private final InterfaceC2432a moshiProvider;

    public NetworkModule_ProvideRetrofitFactory(NetworkModule networkModule, InterfaceC2432a interfaceC2432a, InterfaceC2432a interfaceC2432a2, InterfaceC2432a interfaceC2432a3) {
        this.module = networkModule;
        this.clientProvider = interfaceC2432a;
        this.moshiProvider = interfaceC2432a2;
        this.internalConfigProvider = interfaceC2432a3;
    }

    public static NetworkModule_ProvideRetrofitFactory create(NetworkModule networkModule, InterfaceC2432a interfaceC2432a, InterfaceC2432a interfaceC2432a2, InterfaceC2432a interfaceC2432a3) {
        return new NetworkModule_ProvideRetrofitFactory(networkModule, interfaceC2432a, interfaceC2432a2, interfaceC2432a3);
    }

    public static T provideRetrofit(NetworkModule networkModule, OkHttpClient okHttpClient, K k, InternalConfig internalConfig) throws NumberFormatException, EOFException {
        T tProvideRetrofit = networkModule.provideRetrofit(okHttpClient, k, internalConfig);
        AbstractC3230e0.i(tProvideRetrofit, "Cannot return null from a non-@Nullable @Provides method");
        return tProvideRetrofit;
    }

    @Override // df.InterfaceC2432a
    public T get() {
        return provideRetrofit(this.module, (OkHttpClient) this.clientProvider.get(), (K) this.moshiProvider.get(), (InternalConfig) this.internalConfigProvider.get());
    }
}
