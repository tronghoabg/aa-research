package com.qonversion.android.sdk.internal.di.module;

import android.app.Application;
import com.qonversion.android.sdk.automations.internal.ActivityProvider;
import com.qonversion.android.sdk.automations.internal.AutomationsEventMapper;
import com.qonversion.android.sdk.automations.internal.QAutomationsManager;
import com.qonversion.android.sdk.internal.repository.QRepository;
import df.InterfaceC2432a;
import ka.AbstractC3230e0;

/* loaded from: classes4.dex */
public final class ManagersModule_ProvideAutomationsManagerFactory implements InterfaceC2432a {
    private final InterfaceC2432a activityProvider;
    private final InterfaceC2432a appContextProvider;
    private final InterfaceC2432a eventMapperProvider;
    private final ManagersModule module;
    private final InterfaceC2432a repositoryProvider;

    public ManagersModule_ProvideAutomationsManagerFactory(ManagersModule managersModule, InterfaceC2432a interfaceC2432a, InterfaceC2432a interfaceC2432a2, InterfaceC2432a interfaceC2432a3, InterfaceC2432a interfaceC2432a4) {
        this.module = managersModule;
        this.repositoryProvider = interfaceC2432a;
        this.eventMapperProvider = interfaceC2432a2;
        this.appContextProvider = interfaceC2432a3;
        this.activityProvider = interfaceC2432a4;
    }

    public static ManagersModule_ProvideAutomationsManagerFactory create(ManagersModule managersModule, InterfaceC2432a interfaceC2432a, InterfaceC2432a interfaceC2432a2, InterfaceC2432a interfaceC2432a3, InterfaceC2432a interfaceC2432a4) {
        return new ManagersModule_ProvideAutomationsManagerFactory(managersModule, interfaceC2432a, interfaceC2432a2, interfaceC2432a3, interfaceC2432a4);
    }

    public static QAutomationsManager provideAutomationsManager(ManagersModule managersModule, QRepository qRepository, AutomationsEventMapper automationsEventMapper, Application application, ActivityProvider activityProvider) {
        QAutomationsManager qAutomationsManagerProvideAutomationsManager = managersModule.provideAutomationsManager(qRepository, automationsEventMapper, application, activityProvider);
        AbstractC3230e0.i(qAutomationsManagerProvideAutomationsManager, "Cannot return null from a non-@Nullable @Provides method");
        return qAutomationsManagerProvideAutomationsManager;
    }

    @Override // df.InterfaceC2432a
    public QAutomationsManager get() {
        return provideAutomationsManager(this.module, (QRepository) this.repositoryProvider.get(), (AutomationsEventMapper) this.eventMapperProvider.get(), (Application) this.appContextProvider.get(), (ActivityProvider) this.activityProvider.get());
    }
}
