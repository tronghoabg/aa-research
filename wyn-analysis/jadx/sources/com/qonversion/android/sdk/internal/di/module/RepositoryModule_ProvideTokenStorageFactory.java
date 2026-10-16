package com.qonversion.android.sdk.internal.di.module;

import android.content.SharedPreferences;
import com.qonversion.android.sdk.internal.storage.TokenStorage;
import df.InterfaceC2432a;
import ka.AbstractC3230e0;

/* loaded from: classes4.dex */
public final class RepositoryModule_ProvideTokenStorageFactory implements InterfaceC2432a {
    private final RepositoryModule module;
    private final InterfaceC2432a preferencesProvider;

    public RepositoryModule_ProvideTokenStorageFactory(RepositoryModule repositoryModule, InterfaceC2432a interfaceC2432a) {
        this.module = repositoryModule;
        this.preferencesProvider = interfaceC2432a;
    }

    public static RepositoryModule_ProvideTokenStorageFactory create(RepositoryModule repositoryModule, InterfaceC2432a interfaceC2432a) {
        return new RepositoryModule_ProvideTokenStorageFactory(repositoryModule, interfaceC2432a);
    }

    public static TokenStorage provideTokenStorage(RepositoryModule repositoryModule, SharedPreferences sharedPreferences) {
        TokenStorage tokenStorageProvideTokenStorage = repositoryModule.provideTokenStorage(sharedPreferences);
        AbstractC3230e0.i(tokenStorageProvideTokenStorage, "Cannot return null from a non-@Nullable @Provides method");
        return tokenStorageProvideTokenStorage;
    }

    @Override // df.InterfaceC2432a
    public TokenStorage get() {
        return provideTokenStorage(this.module, (SharedPreferences) this.preferencesProvider.get());
    }
}
