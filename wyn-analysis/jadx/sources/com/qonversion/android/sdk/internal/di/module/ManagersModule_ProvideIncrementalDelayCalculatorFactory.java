package com.qonversion.android.sdk.internal.di.module;

import com.qonversion.android.sdk.internal.IncrementalDelayCalculator;
import df.InterfaceC2432a;
import ka.AbstractC3230e0;

/* loaded from: classes4.dex */
public final class ManagersModule_ProvideIncrementalDelayCalculatorFactory implements InterfaceC2432a {
    private final ManagersModule module;

    public ManagersModule_ProvideIncrementalDelayCalculatorFactory(ManagersModule managersModule) {
        this.module = managersModule;
    }

    public static ManagersModule_ProvideIncrementalDelayCalculatorFactory create(ManagersModule managersModule) {
        return new ManagersModule_ProvideIncrementalDelayCalculatorFactory(managersModule);
    }

    public static IncrementalDelayCalculator provideIncrementalDelayCalculator(ManagersModule managersModule) {
        IncrementalDelayCalculator incrementalDelayCalculatorProvideIncrementalDelayCalculator = managersModule.provideIncrementalDelayCalculator();
        AbstractC3230e0.i(incrementalDelayCalculatorProvideIncrementalDelayCalculator, "Cannot return null from a non-@Nullable @Provides method");
        return incrementalDelayCalculatorProvideIncrementalDelayCalculator;
    }

    @Override // df.InterfaceC2432a
    public IncrementalDelayCalculator get() {
        return provideIncrementalDelayCalculator(this.module);
    }
}
