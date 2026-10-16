package com.qonversion.android.sdk.internal.di.module;

import android.app.Application;
import com.qonversion.android.sdk.internal.EnvironmentProvider;
import df.InterfaceC2432a;
import ka.AbstractC3230e0;

/* loaded from: classes4.dex */
public final class RepositoryModule_ProvideEnvironmentFactory implements InterfaceC2432a {
    private final InterfaceC2432a contextProvider;
    private final RepositoryModule module;

    public RepositoryModule_ProvideEnvironmentFactory(RepositoryModule repositoryModule, InterfaceC2432a interfaceC2432a) {
        this.module = repositoryModule;
        this.contextProvider = interfaceC2432a;
    }

    public static RepositoryModule_ProvideEnvironmentFactory create(RepositoryModule repositoryModule, InterfaceC2432a interfaceC2432a) {
        return new RepositoryModule_ProvideEnvironmentFactory(repositoryModule, interfaceC2432a);
    }

    public static EnvironmentProvider provideEnvironment(RepositoryModule repositoryModule, Application application) {
        EnvironmentProvider environmentProviderProvideEnvironment = repositoryModule.provideEnvironment(application);
        AbstractC3230e0.i(environmentProviderProvideEnvironment, "Cannot return null from a non-@Nullable @Provides method");
        return environmentProviderProvideEnvironment;
    }

    @Override // df.InterfaceC2432a
    public EnvironmentProvider get() {
        return provideEnvironment(this.module, (Application) this.contextProvider.get());
    }
}
