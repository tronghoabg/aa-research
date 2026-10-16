package com.qonversion.android.sdk.internal.di.module;

import com.qonversion.android.sdk.automations.internal.AutomationsEventMapper;
import com.qonversion.android.sdk.internal.logger.Logger;
import df.InterfaceC2432a;
import ka.AbstractC3230e0;

/* loaded from: classes4.dex */
public final class ManagersModule_ProvideAutomationsEventMapperFactory implements InterfaceC2432a {
    private final InterfaceC2432a loggerProvider;
    private final ManagersModule module;

    public ManagersModule_ProvideAutomationsEventMapperFactory(ManagersModule managersModule, InterfaceC2432a interfaceC2432a) {
        this.module = managersModule;
        this.loggerProvider = interfaceC2432a;
    }

    public static ManagersModule_ProvideAutomationsEventMapperFactory create(ManagersModule managersModule, InterfaceC2432a interfaceC2432a) {
        return new ManagersModule_ProvideAutomationsEventMapperFactory(managersModule, interfaceC2432a);
    }

    public static AutomationsEventMapper provideAutomationsEventMapper(ManagersModule managersModule, Logger logger) {
        AutomationsEventMapper automationsEventMapperProvideAutomationsEventMapper = managersModule.provideAutomationsEventMapper(logger);
        AbstractC3230e0.i(automationsEventMapperProvideAutomationsEventMapper, "Cannot return null from a non-@Nullable @Provides method");
        return automationsEventMapperProvideAutomationsEventMapper;
    }

    @Override // df.InterfaceC2432a
    public AutomationsEventMapper get() {
        return provideAutomationsEventMapper(this.module, (Logger) this.loggerProvider.get());
    }
}
