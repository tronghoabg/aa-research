package com.qonversion.android.sdk.internal.di.module;

import com.qonversion.android.sdk.internal.services.QUserInfoService;
import com.qonversion.android.sdk.internal.storage.SharedPreferencesCache;
import com.qonversion.android.sdk.internal.storage.TokenStorage;
import df.InterfaceC2432a;
import ka.AbstractC3230e0;

/* loaded from: classes4.dex */
public final class ServicesModule_ProvideUserInfoServiceFactory implements InterfaceC2432a {
    private final InterfaceC2432a cacheStorageProvider;
    private final ServicesModule module;
    private final InterfaceC2432a tokenStorageProvider;

    public ServicesModule_ProvideUserInfoServiceFactory(ServicesModule servicesModule, InterfaceC2432a interfaceC2432a, InterfaceC2432a interfaceC2432a2) {
        this.module = servicesModule;
        this.cacheStorageProvider = interfaceC2432a;
        this.tokenStorageProvider = interfaceC2432a2;
    }

    public static ServicesModule_ProvideUserInfoServiceFactory create(ServicesModule servicesModule, InterfaceC2432a interfaceC2432a, InterfaceC2432a interfaceC2432a2) {
        return new ServicesModule_ProvideUserInfoServiceFactory(servicesModule, interfaceC2432a, interfaceC2432a2);
    }

    public static QUserInfoService provideUserInfoService(ServicesModule servicesModule, SharedPreferencesCache sharedPreferencesCache, TokenStorage tokenStorage) {
        QUserInfoService qUserInfoServiceProvideUserInfoService = servicesModule.provideUserInfoService(sharedPreferencesCache, tokenStorage);
        AbstractC3230e0.i(qUserInfoServiceProvideUserInfoService, "Cannot return null from a non-@Nullable @Provides method");
        return qUserInfoServiceProvideUserInfoService;
    }

    @Override // df.InterfaceC2432a
    public QUserInfoService get() {
        return provideUserInfoService(this.module, (SharedPreferencesCache) this.cacheStorageProvider.get(), (TokenStorage) this.tokenStorageProvider.get());
    }
}
