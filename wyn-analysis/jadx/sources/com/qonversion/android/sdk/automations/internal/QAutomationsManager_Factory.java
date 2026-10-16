package com.qonversion.android.sdk.automations.internal;

import android.app.Application;
import com.qonversion.android.sdk.internal.repository.QRepository;
import df.InterfaceC2432a;

/* loaded from: classes4.dex */
public final class QAutomationsManager_Factory implements InterfaceC2432a {
    private final InterfaceC2432a activityProvider;
    private final InterfaceC2432a appContextProvider;
    private final InterfaceC2432a eventMapperProvider;
    private final InterfaceC2432a repositoryProvider;

    public QAutomationsManager_Factory(InterfaceC2432a interfaceC2432a, InterfaceC2432a interfaceC2432a2, InterfaceC2432a interfaceC2432a3, InterfaceC2432a interfaceC2432a4) {
        this.repositoryProvider = interfaceC2432a;
        this.eventMapperProvider = interfaceC2432a2;
        this.appContextProvider = interfaceC2432a3;
        this.activityProvider = interfaceC2432a4;
    }

    public static QAutomationsManager_Factory create(InterfaceC2432a interfaceC2432a, InterfaceC2432a interfaceC2432a2, InterfaceC2432a interfaceC2432a3, InterfaceC2432a interfaceC2432a4) {
        return new QAutomationsManager_Factory(interfaceC2432a, interfaceC2432a2, interfaceC2432a3, interfaceC2432a4);
    }

    public static QAutomationsManager newInstance(QRepository qRepository, AutomationsEventMapper automationsEventMapper, Application application, ActivityProvider activityProvider) {
        return new QAutomationsManager(qRepository, automationsEventMapper, application, activityProvider);
    }

    @Override // df.InterfaceC2432a
    public QAutomationsManager get() {
        return new QAutomationsManager((QRepository) this.repositoryProvider.get(), (AutomationsEventMapper) this.eventMapperProvider.get(), (Application) this.appContextProvider.get(), (ActivityProvider) this.activityProvider.get());
    }
}
