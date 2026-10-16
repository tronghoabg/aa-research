package com.qonversion.android.sdk.internal.di.component;

import Tb.a;
import com.qonversion.android.sdk.automations.internal.ActivityProvider_Factory;
import com.qonversion.android.sdk.automations.internal.QAutomationsManager;
import com.qonversion.android.sdk.internal.InternalConfig;
import com.qonversion.android.sdk.internal.QHandledPurchasesCache;
import com.qonversion.android.sdk.internal.QIdentityManager;
import com.qonversion.android.sdk.internal.QRemoteConfigManager;
import com.qonversion.android.sdk.internal.QUserPropertiesManager;
import com.qonversion.android.sdk.internal.api.ApiHeadersProvider;
import com.qonversion.android.sdk.internal.di.module.AppModule;
import com.qonversion.android.sdk.internal.di.module.AppModule_ProvideAppStateProviderFactory;
import com.qonversion.android.sdk.internal.di.module.AppModule_ProvideApplicationFactory;
import com.qonversion.android.sdk.internal.di.module.AppModule_ProvideConfigFactory;
import com.qonversion.android.sdk.internal.di.module.AppModule_ProvideFallbackServiceFactory;
import com.qonversion.android.sdk.internal.di.module.AppModule_ProvideLaunchResultCacheWrapperFactory;
import com.qonversion.android.sdk.internal.di.module.AppModule_ProvideLoggerFactory;
import com.qonversion.android.sdk.internal.di.module.AppModule_ProvidePurchasesCacheFactory;
import com.qonversion.android.sdk.internal.di.module.AppModule_ProvideSharedPreferencesCacheFactory;
import com.qonversion.android.sdk.internal.di.module.AppModule_ProvideSharedPreferencesFactory;
import com.qonversion.android.sdk.internal.di.module.ManagersModule;
import com.qonversion.android.sdk.internal.di.module.ManagersModule_ProvideAutomationsEventMapperFactory;
import com.qonversion.android.sdk.internal.di.module.ManagersModule_ProvideAutomationsManagerFactory;
import com.qonversion.android.sdk.internal.di.module.ManagersModule_ProvideIdentityManagerFactory;
import com.qonversion.android.sdk.internal.di.module.ManagersModule_ProvideIncrementalDelayCalculatorFactory;
import com.qonversion.android.sdk.internal.di.module.ManagersModule_ProvideUserPropertiesManagerFactory;
import com.qonversion.android.sdk.internal.di.module.NetworkModule;
import com.qonversion.android.sdk.internal.di.module.NetworkModule_ProvideApiHelperFactory;
import com.qonversion.android.sdk.internal.di.module.NetworkModule_ProvideHeadersInterceptorFactory;
import com.qonversion.android.sdk.internal.di.module.NetworkModule_ProvideMoshiFactory;
import com.qonversion.android.sdk.internal.di.module.NetworkModule_ProvideOkHttpClientFactory;
import com.qonversion.android.sdk.internal.di.module.NetworkModule_ProvideRateLimiterFactory;
import com.qonversion.android.sdk.internal.di.module.NetworkModule_ProvideRetrofitFactory;
import com.qonversion.android.sdk.internal.di.module.RepositoryModule;
import com.qonversion.android.sdk.internal.di.module.RepositoryModule_ProvideApiErrorMapperFactory;
import com.qonversion.android.sdk.internal.di.module.RepositoryModule_ProvideEnvironmentFactory;
import com.qonversion.android.sdk.internal.di.module.RepositoryModule_ProvideHeadersProviderFactory;
import com.qonversion.android.sdk.internal.di.module.RepositoryModule_ProvidePropertiesStorageFactory;
import com.qonversion.android.sdk.internal.di.module.RepositoryModule_ProvideQonversionRepositoryFactory;
import com.qonversion.android.sdk.internal.di.module.RepositoryModule_ProvideRepositoryFactory;
import com.qonversion.android.sdk.internal.di.module.RepositoryModule_ProvideTokenStorageFactory;
import com.qonversion.android.sdk.internal.di.module.ServicesModule;
import com.qonversion.android.sdk.internal.di.module.ServicesModule_ProvideUserInfoServiceFactory;
import com.qonversion.android.sdk.internal.logger.QExceptionManager;
import com.qonversion.android.sdk.internal.provider.AppStateProvider;
import com.qonversion.android.sdk.internal.repository.DefaultRepository;
import com.qonversion.android.sdk.internal.repository.QRepository;
import com.qonversion.android.sdk.internal.services.QFallbacksService;
import com.qonversion.android.sdk.internal.services.QRemoteConfigService;
import com.qonversion.android.sdk.internal.services.QUserInfoService;
import com.qonversion.android.sdk.internal.storage.LaunchResultCacheWrapper;
import com.qonversion.android.sdk.internal.storage.PurchasesCache;
import com.qonversion.android.sdk.internal.storage.SharedPreferencesCache;
import df.InterfaceC2432a;
import hb.K;
import ka.AbstractC3230e0;

/* loaded from: classes4.dex */
public final class DaggerAppComponent implements AppComponent {
    private InterfaceC2432a activityProvider;
    private InterfaceC2432a provideApiErrorMapperProvider;
    private InterfaceC2432a provideApiHelperProvider;
    private InterfaceC2432a provideAppStateProvider;
    private InterfaceC2432a provideApplicationProvider;
    private InterfaceC2432a provideAutomationsEventMapperProvider;
    private InterfaceC2432a provideAutomationsManagerProvider;
    private InterfaceC2432a provideConfigProvider;
    private InterfaceC2432a provideEnvironmentProvider;
    private InterfaceC2432a provideFallbackServiceProvider;
    private InterfaceC2432a provideHeadersInterceptorProvider;
    private InterfaceC2432a provideHeadersProvider;
    private InterfaceC2432a provideIdentityManagerProvider;
    private InterfaceC2432a provideIncrementalDelayCalculatorProvider;
    private InterfaceC2432a provideLaunchResultCacheWrapperProvider;
    private InterfaceC2432a provideLoggerProvider;
    private InterfaceC2432a provideMoshiProvider;
    private InterfaceC2432a provideOkHttpClientProvider;
    private InterfaceC2432a providePropertiesStorageProvider;
    private InterfaceC2432a providePurchasesCacheProvider;
    private InterfaceC2432a provideQonversionRepositoryProvider;
    private InterfaceC2432a provideRateLimiterProvider;
    private InterfaceC2432a provideRepositoryProvider;
    private InterfaceC2432a provideRetrofitProvider;
    private InterfaceC2432a provideSharedPreferencesCacheProvider;
    private InterfaceC2432a provideSharedPreferencesProvider;
    private InterfaceC2432a provideTokenStorageProvider;
    private InterfaceC2432a provideUserInfoServiceProvider;
    private InterfaceC2432a provideUserPropertiesManagerProvider;

    public static final class Builder {
        private AppModule appModule;
        private ManagersModule managersModule;
        private NetworkModule networkModule;
        private RepositoryModule repositoryModule;
        private ServicesModule servicesModule;

        public /* synthetic */ Builder(int i5) {
            this();
        }

        public Builder appModule(AppModule appModule) {
            appModule.getClass();
            this.appModule = appModule;
            return this;
        }

        public AppComponent build() {
            AbstractC3230e0.h(AppModule.class, this.appModule);
            if (this.repositoryModule == null) {
                this.repositoryModule = new RepositoryModule();
            }
            if (this.networkModule == null) {
                this.networkModule = new NetworkModule();
            }
            if (this.managersModule == null) {
                this.managersModule = new ManagersModule();
            }
            if (this.servicesModule == null) {
                this.servicesModule = new ServicesModule();
            }
            return new DaggerAppComponent(this.appModule, this.repositoryModule, this.networkModule, this.managersModule, this.servicesModule, 0);
        }

        public Builder managersModule(ManagersModule managersModule) {
            managersModule.getClass();
            this.managersModule = managersModule;
            return this;
        }

        public Builder networkModule(NetworkModule networkModule) {
            networkModule.getClass();
            this.networkModule = networkModule;
            return this;
        }

        public Builder repositoryModule(RepositoryModule repositoryModule) {
            repositoryModule.getClass();
            this.repositoryModule = repositoryModule;
            return this;
        }

        public Builder servicesModule(ServicesModule servicesModule) {
            servicesModule.getClass();
            this.servicesModule = servicesModule;
            return this;
        }

        private Builder() {
        }
    }

    public /* synthetic */ DaggerAppComponent(AppModule appModule, RepositoryModule repositoryModule, NetworkModule networkModule, ManagersModule managersModule, ServicesModule servicesModule, int i5) {
        this(appModule, repositoryModule, networkModule, managersModule, servicesModule);
    }

    public static Builder builder() {
        return new Builder(0);
    }

    private QRemoteConfigService getQRemoteConfigService() {
        return new QRemoteConfigService((QRepository) this.provideRepositoryProvider.get());
    }

    private void initialize(AppModule appModule, RepositoryModule repositoryModule, NetworkModule networkModule, ManagersModule managersModule, ServicesModule servicesModule) {
        this.provideApplicationProvider = a.a(AppModule_ProvideApplicationFactory.create(appModule));
        this.provideConfigProvider = a.a(AppModule_ProvideConfigFactory.create(appModule));
        InterfaceC2432a interfaceC2432aA = a.a(AppModule_ProvideSharedPreferencesFactory.create(appModule, this.provideApplicationProvider));
        this.provideSharedPreferencesProvider = interfaceC2432aA;
        this.provideSharedPreferencesCacheProvider = a.a(AppModule_ProvideSharedPreferencesCacheFactory.create(appModule, interfaceC2432aA));
        InterfaceC2432a interfaceC2432aA2 = a.a(RepositoryModule_ProvideEnvironmentFactory.create(repositoryModule, this.provideApplicationProvider));
        this.provideEnvironmentProvider = interfaceC2432aA2;
        this.provideHeadersProvider = a.a(RepositoryModule_ProvideHeadersProviderFactory.create(repositoryModule, this.provideConfigProvider, this.provideSharedPreferencesCacheProvider, interfaceC2432aA2));
        InterfaceC2432a interfaceC2432aA3 = a.a(NetworkModule_ProvideApiHelperFactory.create(networkModule, this.provideConfigProvider));
        this.provideApiHelperProvider = interfaceC2432aA3;
        InterfaceC2432a interfaceC2432aA4 = a.a(NetworkModule_ProvideHeadersInterceptorFactory.create(networkModule, this.provideHeadersProvider, this.provideConfigProvider, interfaceC2432aA3));
        this.provideHeadersInterceptorProvider = interfaceC2432aA4;
        this.provideOkHttpClientProvider = a.a(NetworkModule_ProvideOkHttpClientFactory.create(networkModule, this.provideApplicationProvider, interfaceC2432aA4));
        InterfaceC2432a interfaceC2432aA5 = a.a(NetworkModule_ProvideMoshiFactory.create(networkModule));
        this.provideMoshiProvider = interfaceC2432aA5;
        this.provideRetrofitProvider = a.a(NetworkModule_ProvideRetrofitFactory.create(networkModule, this.provideOkHttpClientProvider, interfaceC2432aA5, this.provideConfigProvider));
        this.provideLoggerProvider = a.a(AppModule_ProvideLoggerFactory.create(appModule));
        this.provideApiErrorMapperProvider = a.a(RepositoryModule_ProvideApiErrorMapperFactory.create(repositoryModule, this.provideApiHelperProvider));
        this.provideIncrementalDelayCalculatorProvider = a.a(ManagersModule_ProvideIncrementalDelayCalculatorFactory.create(managersModule));
        InterfaceC2432a interfaceC2432aA6 = a.a(NetworkModule_ProvideRateLimiterFactory.create(networkModule));
        this.provideRateLimiterProvider = interfaceC2432aA6;
        this.provideRepositoryProvider = a.a(RepositoryModule_ProvideRepositoryFactory.create(repositoryModule, this.provideRetrofitProvider, this.provideEnvironmentProvider, this.provideConfigProvider, this.provideLoggerProvider, this.provideApiErrorMapperProvider, this.provideIncrementalDelayCalculatorProvider, interfaceC2432aA6));
        this.provideQonversionRepositoryProvider = a.a(RepositoryModule_ProvideQonversionRepositoryFactory.create(repositoryModule, this.provideRetrofitProvider, this.provideEnvironmentProvider, this.provideConfigProvider, this.provideLoggerProvider, this.provideApiErrorMapperProvider, this.provideIncrementalDelayCalculatorProvider));
        this.providePurchasesCacheProvider = a.a(AppModule_ProvidePurchasesCacheFactory.create(appModule, this.provideSharedPreferencesCacheProvider));
        InterfaceC2432a interfaceC2432aA7 = a.a(AppModule_ProvideFallbackServiceFactory.create(appModule, this.provideApplicationProvider, this.provideMoshiProvider, this.provideLoggerProvider));
        this.provideFallbackServiceProvider = interfaceC2432aA7;
        this.provideLaunchResultCacheWrapperProvider = a.a(AppModule_ProvideLaunchResultCacheWrapperFactory.create(appModule, this.provideMoshiProvider, this.provideSharedPreferencesCacheProvider, interfaceC2432aA7));
        this.provideAutomationsEventMapperProvider = a.a(ManagersModule_ProvideAutomationsEventMapperFactory.create(managersModule, this.provideLoggerProvider));
        ActivityProvider_Factory activityProvider_FactoryCreate = ActivityProvider_Factory.create(this.provideApplicationProvider);
        this.activityProvider = activityProvider_FactoryCreate;
        this.provideAutomationsManagerProvider = a.a(ManagersModule_ProvideAutomationsManagerFactory.create(managersModule, this.provideRepositoryProvider, this.provideAutomationsEventMapperProvider, this.provideApplicationProvider, activityProvider_FactoryCreate));
        InterfaceC2432a interfaceC2432aA8 = a.a(RepositoryModule_ProvideTokenStorageFactory.create(repositoryModule, this.provideSharedPreferencesProvider));
        this.provideTokenStorageProvider = interfaceC2432aA8;
        InterfaceC2432a interfaceC2432aA9 = a.a(ServicesModule_ProvideUserInfoServiceFactory.create(servicesModule, this.provideSharedPreferencesCacheProvider, interfaceC2432aA8));
        this.provideUserInfoServiceProvider = interfaceC2432aA9;
        this.provideIdentityManagerProvider = a.a(ManagersModule_ProvideIdentityManagerFactory.create(managersModule, this.provideRepositoryProvider, interfaceC2432aA9));
        this.providePropertiesStorageProvider = a.a(RepositoryModule_ProvidePropertiesStorageFactory.create(repositoryModule));
        InterfaceC2432a interfaceC2432aA10 = a.a(AppModule_ProvideAppStateProviderFactory.create(appModule));
        this.provideAppStateProvider = interfaceC2432aA10;
        this.provideUserPropertiesManagerProvider = a.a(ManagersModule_ProvideUserPropertiesManagerFactory.create(managersModule, this.provideApplicationProvider, this.provideRepositoryProvider, this.providePropertiesStorageProvider, this.provideIncrementalDelayCalculatorProvider, interfaceC2432aA10, this.provideLoggerProvider));
    }

    @Override // com.qonversion.android.sdk.internal.di.component.AppComponent
    public AppStateProvider appStateProvider() {
        return (AppStateProvider) this.provideAppStateProvider.get();
    }

    @Override // com.qonversion.android.sdk.internal.di.component.AppComponent
    public QAutomationsManager automationsManager() {
        return (QAutomationsManager) this.provideAutomationsManagerProvider.get();
    }

    @Override // com.qonversion.android.sdk.internal.di.component.AppComponent
    public QExceptionManager exceptionManager() {
        return new QExceptionManager((QRepository) this.provideRepositoryProvider.get(), (InternalConfig) this.provideConfigProvider.get(), (ApiHeadersProvider) this.provideHeadersProvider.get(), (K) this.provideMoshiProvider.get());
    }

    @Override // com.qonversion.android.sdk.internal.di.component.AppComponent
    public QFallbacksService fallbacksService() {
        return (QFallbacksService) this.provideFallbackServiceProvider.get();
    }

    @Override // com.qonversion.android.sdk.internal.di.component.AppComponent
    public QHandledPurchasesCache handledPurchasesCache() {
        return new QHandledPurchasesCache();
    }

    @Override // com.qonversion.android.sdk.internal.di.component.AppComponent
    public QIdentityManager identityManager() {
        return (QIdentityManager) this.provideIdentityManagerProvider.get();
    }

    @Override // com.qonversion.android.sdk.internal.di.component.AppComponent
    public InternalConfig internalConfig() {
        return (InternalConfig) this.provideConfigProvider.get();
    }

    @Override // com.qonversion.android.sdk.internal.di.component.AppComponent
    public LaunchResultCacheWrapper launchResultCacheWrapper() {
        return (LaunchResultCacheWrapper) this.provideLaunchResultCacheWrapperProvider.get();
    }

    @Override // com.qonversion.android.sdk.internal.di.component.AppComponent
    public PurchasesCache purchasesCache() {
        return (PurchasesCache) this.providePurchasesCacheProvider.get();
    }

    @Override // com.qonversion.android.sdk.internal.di.component.AppComponent
    public DefaultRepository qonversionRepository() {
        return (DefaultRepository) this.provideQonversionRepositoryProvider.get();
    }

    @Override // com.qonversion.android.sdk.internal.di.component.AppComponent
    public QRemoteConfigManager remoteConfigManager() {
        return new QRemoteConfigManager(getQRemoteConfigService(), (QFallbacksService) this.provideFallbackServiceProvider.get());
    }

    @Override // com.qonversion.android.sdk.internal.di.component.AppComponent
    public QRepository repository() {
        return (QRepository) this.provideRepositoryProvider.get();
    }

    @Override // com.qonversion.android.sdk.internal.di.component.AppComponent
    public SharedPreferencesCache sharedPreferencesCache() {
        return (SharedPreferencesCache) this.provideSharedPreferencesCacheProvider.get();
    }

    @Override // com.qonversion.android.sdk.internal.di.component.AppComponent
    public QUserInfoService userInfoService() {
        return (QUserInfoService) this.provideUserInfoServiceProvider.get();
    }

    @Override // com.qonversion.android.sdk.internal.di.component.AppComponent
    public QUserPropertiesManager userPropertiesManager() {
        return (QUserPropertiesManager) this.provideUserPropertiesManagerProvider.get();
    }

    private DaggerAppComponent(AppModule appModule, RepositoryModule repositoryModule, NetworkModule networkModule, ManagersModule managersModule, ServicesModule servicesModule) {
        initialize(appModule, repositoryModule, networkModule, managersModule, servicesModule);
    }
}
