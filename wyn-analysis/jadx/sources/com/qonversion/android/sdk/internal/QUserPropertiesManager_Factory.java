package com.qonversion.android.sdk.internal;

import android.app.Application;
import com.qonversion.android.sdk.internal.logger.Logger;
import com.qonversion.android.sdk.internal.provider.AppStateProvider;
import com.qonversion.android.sdk.internal.repository.QRepository;
import com.qonversion.android.sdk.internal.storage.PropertiesStorage;
import df.InterfaceC2432a;

/* loaded from: classes4.dex */
public final class QUserPropertiesManager_Factory implements InterfaceC2432a {
    private final InterfaceC2432a appStateProvider;
    private final InterfaceC2432a contextProvider;
    private final InterfaceC2432a delayCalculatorProvider;
    private final InterfaceC2432a loggerProvider;
    private final InterfaceC2432a propertiesStorageProvider;
    private final InterfaceC2432a repositoryProvider;

    public QUserPropertiesManager_Factory(InterfaceC2432a interfaceC2432a, InterfaceC2432a interfaceC2432a2, InterfaceC2432a interfaceC2432a3, InterfaceC2432a interfaceC2432a4, InterfaceC2432a interfaceC2432a5, InterfaceC2432a interfaceC2432a6) {
        this.contextProvider = interfaceC2432a;
        this.repositoryProvider = interfaceC2432a2;
        this.propertiesStorageProvider = interfaceC2432a3;
        this.delayCalculatorProvider = interfaceC2432a4;
        this.appStateProvider = interfaceC2432a5;
        this.loggerProvider = interfaceC2432a6;
    }

    public static QUserPropertiesManager_Factory create(InterfaceC2432a interfaceC2432a, InterfaceC2432a interfaceC2432a2, InterfaceC2432a interfaceC2432a3, InterfaceC2432a interfaceC2432a4, InterfaceC2432a interfaceC2432a5, InterfaceC2432a interfaceC2432a6) {
        return new QUserPropertiesManager_Factory(interfaceC2432a, interfaceC2432a2, interfaceC2432a3, interfaceC2432a4, interfaceC2432a5, interfaceC2432a6);
    }

    public static QUserPropertiesManager newInstance(Application application, QRepository qRepository, PropertiesStorage propertiesStorage, IncrementalDelayCalculator incrementalDelayCalculator, AppStateProvider appStateProvider, Logger logger) {
        return new QUserPropertiesManager(application, qRepository, propertiesStorage, incrementalDelayCalculator, appStateProvider, logger);
    }

    @Override // df.InterfaceC2432a
    public QUserPropertiesManager get() {
        return new QUserPropertiesManager((Application) this.contextProvider.get(), (QRepository) this.repositoryProvider.get(), (PropertiesStorage) this.propertiesStorageProvider.get(), (IncrementalDelayCalculator) this.delayCalculatorProvider.get(), (AppStateProvider) this.appStateProvider.get(), (Logger) this.loggerProvider.get());
    }
}
