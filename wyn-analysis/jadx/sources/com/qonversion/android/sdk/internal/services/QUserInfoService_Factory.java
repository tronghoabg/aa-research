package com.qonversion.android.sdk.internal.services;

import com.qonversion.android.sdk.internal.storage.Cache;
import com.qonversion.android.sdk.internal.storage.TokenStorage;
import df.InterfaceC2432a;

/* loaded from: classes4.dex */
public final class QUserInfoService_Factory implements InterfaceC2432a {
    private final InterfaceC2432a preferencesProvider;
    private final InterfaceC2432a tokenStorageProvider;

    public QUserInfoService_Factory(InterfaceC2432a interfaceC2432a, InterfaceC2432a interfaceC2432a2) {
        this.preferencesProvider = interfaceC2432a;
        this.tokenStorageProvider = interfaceC2432a2;
    }

    public static QUserInfoService_Factory create(InterfaceC2432a interfaceC2432a, InterfaceC2432a interfaceC2432a2) {
        return new QUserInfoService_Factory(interfaceC2432a, interfaceC2432a2);
    }

    public static QUserInfoService newInstance(Cache cache, TokenStorage tokenStorage) {
        return new QUserInfoService(cache, tokenStorage);
    }

    @Override // df.InterfaceC2432a
    public QUserInfoService get() {
        return new QUserInfoService((Cache) this.preferencesProvider.get(), (TokenStorage) this.tokenStorageProvider.get());
    }
}
