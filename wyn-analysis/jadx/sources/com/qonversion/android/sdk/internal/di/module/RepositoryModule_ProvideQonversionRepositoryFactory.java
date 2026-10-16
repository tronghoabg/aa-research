package com.qonversion.android.sdk.internal.di.module;

import com.qonversion.android.sdk.internal.EnvironmentProvider;
import com.qonversion.android.sdk.internal.IncrementalDelayCalculator;
import com.qonversion.android.sdk.internal.InternalConfig;
import com.qonversion.android.sdk.internal.api.ApiErrorMapper;
import com.qonversion.android.sdk.internal.logger.Logger;
import com.qonversion.android.sdk.internal.repository.DefaultRepository;
import df.InterfaceC2432a;
import ka.AbstractC3230e0;
import zg.T;

/* loaded from: classes4.dex */
public final class RepositoryModule_ProvideQonversionRepositoryFactory implements InterfaceC2432a {
    private final InterfaceC2432a apiErrorMapperProvider;
    private final InterfaceC2432a configProvider;
    private final InterfaceC2432a delayCalculatorProvider;
    private final InterfaceC2432a environmentProvider;
    private final InterfaceC2432a loggerProvider;
    private final RepositoryModule module;
    private final InterfaceC2432a retrofitProvider;

    public RepositoryModule_ProvideQonversionRepositoryFactory(RepositoryModule repositoryModule, InterfaceC2432a interfaceC2432a, InterfaceC2432a interfaceC2432a2, InterfaceC2432a interfaceC2432a3, InterfaceC2432a interfaceC2432a4, InterfaceC2432a interfaceC2432a5, InterfaceC2432a interfaceC2432a6) {
        this.module = repositoryModule;
        this.retrofitProvider = interfaceC2432a;
        this.environmentProvider = interfaceC2432a2;
        this.configProvider = interfaceC2432a3;
        this.loggerProvider = interfaceC2432a4;
        this.apiErrorMapperProvider = interfaceC2432a5;
        this.delayCalculatorProvider = interfaceC2432a6;
    }

    public static RepositoryModule_ProvideQonversionRepositoryFactory create(RepositoryModule repositoryModule, InterfaceC2432a interfaceC2432a, InterfaceC2432a interfaceC2432a2, InterfaceC2432a interfaceC2432a3, InterfaceC2432a interfaceC2432a4, InterfaceC2432a interfaceC2432a5, InterfaceC2432a interfaceC2432a6) {
        return new RepositoryModule_ProvideQonversionRepositoryFactory(repositoryModule, interfaceC2432a, interfaceC2432a2, interfaceC2432a3, interfaceC2432a4, interfaceC2432a5, interfaceC2432a6);
    }

    public static DefaultRepository provideQonversionRepository(RepositoryModule repositoryModule, T t10, EnvironmentProvider environmentProvider, InternalConfig internalConfig, Logger logger, ApiErrorMapper apiErrorMapper, IncrementalDelayCalculator incrementalDelayCalculator) throws IllegalArgumentException {
        DefaultRepository defaultRepositoryProvideQonversionRepository = repositoryModule.provideQonversionRepository(t10, environmentProvider, internalConfig, logger, apiErrorMapper, incrementalDelayCalculator);
        AbstractC3230e0.i(defaultRepositoryProvideQonversionRepository, "Cannot return null from a non-@Nullable @Provides method");
        return defaultRepositoryProvideQonversionRepository;
    }

    @Override // df.InterfaceC2432a
    public DefaultRepository get() {
        return provideQonversionRepository(this.module, (T) this.retrofitProvider.get(), (EnvironmentProvider) this.environmentProvider.get(), (InternalConfig) this.configProvider.get(), (Logger) this.loggerProvider.get(), (ApiErrorMapper) this.apiErrorMapperProvider.get(), (IncrementalDelayCalculator) this.delayCalculatorProvider.get());
    }
}
