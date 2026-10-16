package com.qonversion.android.sdk.internal.di.module;

import com.qonversion.android.sdk.internal.storage.PurchasesCache;
import com.qonversion.android.sdk.internal.storage.SharedPreferencesCache;
import df.InterfaceC2432a;
import ka.AbstractC3230e0;

/* loaded from: classes4.dex */
public final class AppModule_ProvidePurchasesCacheFactory implements InterfaceC2432a {
    private final AppModule module;
    private final InterfaceC2432a sharedPreferencesProvider;

    public AppModule_ProvidePurchasesCacheFactory(AppModule appModule, InterfaceC2432a interfaceC2432a) {
        this.module = appModule;
        this.sharedPreferencesProvider = interfaceC2432a;
    }

    public static AppModule_ProvidePurchasesCacheFactory create(AppModule appModule, InterfaceC2432a interfaceC2432a) {
        return new AppModule_ProvidePurchasesCacheFactory(appModule, interfaceC2432a);
    }

    public static PurchasesCache providePurchasesCache(AppModule appModule, SharedPreferencesCache sharedPreferencesCache) {
        PurchasesCache purchasesCacheProvidePurchasesCache = appModule.providePurchasesCache(sharedPreferencesCache);
        AbstractC3230e0.i(purchasesCacheProvidePurchasesCache, "Cannot return null from a non-@Nullable @Provides method");
        return purchasesCacheProvidePurchasesCache;
    }

    @Override // df.InterfaceC2432a
    public PurchasesCache get() {
        return providePurchasesCache(this.module, (SharedPreferencesCache) this.sharedPreferencesProvider.get());
    }
}
