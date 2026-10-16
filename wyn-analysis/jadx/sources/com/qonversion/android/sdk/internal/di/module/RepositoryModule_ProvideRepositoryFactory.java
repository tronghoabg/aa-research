package com.qonversion.android.sdk.internal.di.module;

import com.qonversion.android.sdk.internal.EnvironmentProvider;
import com.qonversion.android.sdk.internal.IncrementalDelayCalculator;
import com.qonversion.android.sdk.internal.InternalConfig;
import com.qonversion.android.sdk.internal.api.ApiErrorMapper;
import com.qonversion.android.sdk.internal.api.RateLimiter;
import com.qonversion.android.sdk.internal.logger.Logger;
import com.qonversion.android.sdk.internal.repository.QRepository;
import df.InterfaceC2432a;
import ka.AbstractC3230e0;
import zg.T;

/* loaded from: classes4.dex */
public final class RepositoryModule_ProvideRepositoryFactory implements InterfaceC2432a {
    private final InterfaceC2432a apiErrorMapperProvider;
    private final InterfaceC2432a configProvider;
    private final InterfaceC2432a delayCalculatorProvider;
    private final InterfaceC2432a environmentProvider;
    private final InterfaceC2432a loggerProvider;
    private final RepositoryModule module;
    private final InterfaceC2432a rateLimiterProvider;
    private final InterfaceC2432a retrofitProvider;

    public RepositoryModule_ProvideRepositoryFactory(RepositoryModule repositoryModule, InterfaceC2432a interfaceC2432a, InterfaceC2432a interfaceC2432a2, InterfaceC2432a interfaceC2432a3, InterfaceC2432a interfaceC2432a4, InterfaceC2432a interfaceC2432a5, InterfaceC2432a interfaceC2432a6, InterfaceC2432a interfaceC2432a7) {
        this.module = repositoryModule;
        this.retrofitProvider = interfaceC2432a;
        this.environmentProvider = interfaceC2432a2;
        this.configProvider = interfaceC2432a3;
        this.loggerProvider = interfaceC2432a4;
        this.apiErrorMapperProvider = interfaceC2432a5;
        this.delayCalculatorProvider = interfaceC2432a6;
        this.rateLimiterProvider = interfaceC2432a7;
    }

    public static RepositoryModule_ProvideRepositoryFactory create(RepositoryModule repositoryModule, InterfaceC2432a interfaceC2432a, InterfaceC2432a interfaceC2432a2, InterfaceC2432a interfaceC2432a3, InterfaceC2432a interfaceC2432a4, InterfaceC2432a interfaceC2432a5, InterfaceC2432a interfaceC2432a6, InterfaceC2432a interfaceC2432a7) {
        return new RepositoryModule_ProvideRepositoryFactory(repositoryModule, interfaceC2432a, interfaceC2432a2, interfaceC2432a3, interfaceC2432a4, interfaceC2432a5, interfaceC2432a6, interfaceC2432a7);
    }

    public static QRepository provideRepository(RepositoryModule repositoryModule, T t10, EnvironmentProvider environmentProvider, InternalConfig internalConfig, Logger logger, ApiErrorMapper apiErrorMapper, IncrementalDelayCalculator incrementalDelayCalculator, RateLimiter rateLimiter) {
        QRepository qRepositoryProvideRepository = repositoryModule.provideRepository(t10, environmentProvider, internalConfig, logger, apiErrorMapper, incrementalDelayCalculator, rateLimiter);
        AbstractC3230e0.i(qRepositoryProvideRepository, "Cannot return null from a non-@Nullable @Provides method");
        return qRepositoryProvideRepository;
    }

    @Override // df.InterfaceC2432a
    public QRepository get() {
        return provideRepository(this.module, (T) this.retrofitProvider.get(), (EnvironmentProvider) this.environmentProvider.get(), (InternalConfig) this.configProvider.get(), (Logger) this.loggerProvider.get(), (ApiErrorMapper) this.apiErrorMapperProvider.get(), (IncrementalDelayCalculator) this.delayCalculatorProvider.get(), (RateLimiter) this.rateLimiterProvider.get());
    }
}
