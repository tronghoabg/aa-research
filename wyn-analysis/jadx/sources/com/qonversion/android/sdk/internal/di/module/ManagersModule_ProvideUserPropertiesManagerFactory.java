package com.qonversion.android.sdk.internal.di.module;

import android.app.Application;
import com.qonversion.android.sdk.internal.IncrementalDelayCalculator;
import com.qonversion.android.sdk.internal.QUserPropertiesManager;
import com.qonversion.android.sdk.internal.logger.Logger;
import com.qonversion.android.sdk.internal.provider.AppStateProvider;
import com.qonversion.android.sdk.internal.repository.QRepository;
import com.qonversion.android.sdk.internal.storage.UserPropertiesStorage;
import df.InterfaceC2432a;
import ka.AbstractC3230e0;

/* loaded from: classes4.dex */
public final class ManagersModule_ProvideUserPropertiesManagerFactory implements InterfaceC2432a {
    private final InterfaceC2432a appContextProvider;
    private final InterfaceC2432a appStateProvider;
    private final InterfaceC2432a incrementalDelayCalculatorProvider;
    private final InterfaceC2432a loggerProvider;
    private final ManagersModule module;
    private final InterfaceC2432a propertiesStorageProvider;
    private final InterfaceC2432a repositoryProvider;

    public ManagersModule_ProvideUserPropertiesManagerFactory(ManagersModule managersModule, InterfaceC2432a interfaceC2432a, InterfaceC2432a interfaceC2432a2, InterfaceC2432a interfaceC2432a3, InterfaceC2432a interfaceC2432a4, InterfaceC2432a interfaceC2432a5, InterfaceC2432a interfaceC2432a6) {
        this.module = managersModule;
        this.appContextProvider = interfaceC2432a;
        this.repositoryProvider = interfaceC2432a2;
        this.propertiesStorageProvider = interfaceC2432a3;
        this.incrementalDelayCalculatorProvider = interfaceC2432a4;
        this.appStateProvider = interfaceC2432a5;
        this.loggerProvider = interfaceC2432a6;
    }

    public static ManagersModule_ProvideUserPropertiesManagerFactory create(ManagersModule managersModule, InterfaceC2432a interfaceC2432a, InterfaceC2432a interfaceC2432a2, InterfaceC2432a interfaceC2432a3, InterfaceC2432a interfaceC2432a4, InterfaceC2432a interfaceC2432a5, InterfaceC2432a interfaceC2432a6) {
        return new ManagersModule_ProvideUserPropertiesManagerFactory(managersModule, interfaceC2432a, interfaceC2432a2, interfaceC2432a3, interfaceC2432a4, interfaceC2432a5, interfaceC2432a6);
    }

    public static QUserPropertiesManager provideUserPropertiesManager(ManagersModule managersModule, Application application, QRepository qRepository, UserPropertiesStorage userPropertiesStorage, IncrementalDelayCalculator incrementalDelayCalculator, AppStateProvider appStateProvider, Logger logger) {
        QUserPropertiesManager qUserPropertiesManagerProvideUserPropertiesManager = managersModule.provideUserPropertiesManager(application, qRepository, userPropertiesStorage, incrementalDelayCalculator, appStateProvider, logger);
        AbstractC3230e0.i(qUserPropertiesManagerProvideUserPropertiesManager, "Cannot return null from a non-@Nullable @Provides method");
        return qUserPropertiesManagerProvideUserPropertiesManager;
    }

    @Override // df.InterfaceC2432a
    public QUserPropertiesManager get() {
        return provideUserPropertiesManager(this.module, (Application) this.appContextProvider.get(), (QRepository) this.repositoryProvider.get(), (UserPropertiesStorage) this.propertiesStorageProvider.get(), (IncrementalDelayCalculator) this.incrementalDelayCalculatorProvider.get(), (AppStateProvider) this.appStateProvider.get(), (Logger) this.loggerProvider.get());
    }
}
