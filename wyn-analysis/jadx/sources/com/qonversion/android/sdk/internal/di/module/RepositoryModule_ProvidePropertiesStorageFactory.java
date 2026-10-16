package com.qonversion.android.sdk.internal.di.module;

import com.qonversion.android.sdk.internal.storage.UserPropertiesStorage;
import df.InterfaceC2432a;
import ka.AbstractC3230e0;

/* loaded from: classes4.dex */
public final class RepositoryModule_ProvidePropertiesStorageFactory implements InterfaceC2432a {
    private final RepositoryModule module;

    public RepositoryModule_ProvidePropertiesStorageFactory(RepositoryModule repositoryModule) {
        this.module = repositoryModule;
    }

    public static RepositoryModule_ProvidePropertiesStorageFactory create(RepositoryModule repositoryModule) {
        return new RepositoryModule_ProvidePropertiesStorageFactory(repositoryModule);
    }

    public static UserPropertiesStorage providePropertiesStorage(RepositoryModule repositoryModule) {
        UserPropertiesStorage userPropertiesStorageProvidePropertiesStorage = repositoryModule.providePropertiesStorage();
        AbstractC3230e0.i(userPropertiesStorageProvidePropertiesStorage, "Cannot return null from a non-@Nullable @Provides method");
        return userPropertiesStorageProvidePropertiesStorage;
    }

    @Override // df.InterfaceC2432a
    public UserPropertiesStorage get() {
        return providePropertiesStorage(this.module);
    }
}
