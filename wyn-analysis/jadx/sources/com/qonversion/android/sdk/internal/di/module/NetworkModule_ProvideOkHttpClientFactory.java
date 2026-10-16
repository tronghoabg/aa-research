package com.qonversion.android.sdk.internal.di.module;

import android.app.Application;
import com.qonversion.android.sdk.internal.api.NetworkInterceptor;
import df.InterfaceC2432a;
import ka.AbstractC3230e0;
import okhttp3.OkHttpClient;

/* loaded from: classes4.dex */
public final class NetworkModule_ProvideOkHttpClientFactory implements InterfaceC2432a {
    private final InterfaceC2432a contextProvider;
    private final InterfaceC2432a interceptorProvider;
    private final NetworkModule module;

    public NetworkModule_ProvideOkHttpClientFactory(NetworkModule networkModule, InterfaceC2432a interfaceC2432a, InterfaceC2432a interfaceC2432a2) {
        this.module = networkModule;
        this.contextProvider = interfaceC2432a;
        this.interceptorProvider = interfaceC2432a2;
    }

    public static NetworkModule_ProvideOkHttpClientFactory create(NetworkModule networkModule, InterfaceC2432a interfaceC2432a, InterfaceC2432a interfaceC2432a2) {
        return new NetworkModule_ProvideOkHttpClientFactory(networkModule, interfaceC2432a, interfaceC2432a2);
    }

    public static OkHttpClient provideOkHttpClient(NetworkModule networkModule, Application application, NetworkInterceptor networkInterceptor) {
        OkHttpClient okHttpClientProvideOkHttpClient = networkModule.provideOkHttpClient(application, networkInterceptor);
        AbstractC3230e0.i(okHttpClientProvideOkHttpClient, "Cannot return null from a non-@Nullable @Provides method");
        return okHttpClientProvideOkHttpClient;
    }

    @Override // df.InterfaceC2432a
    public OkHttpClient get() {
        return provideOkHttpClient(this.module, (Application) this.contextProvider.get(), (NetworkInterceptor) this.interceptorProvider.get());
    }
}
