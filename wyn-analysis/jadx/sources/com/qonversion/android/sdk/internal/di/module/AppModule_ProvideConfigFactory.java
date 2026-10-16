package com.qonversion.android.sdk.internal.di.module;

import com.qonversion.android.sdk.internal.InternalConfig;
import df.InterfaceC2432a;
import ka.AbstractC3230e0;

/* loaded from: classes4.dex */
public final class AppModule_ProvideConfigFactory implements InterfaceC2432a {
    private final AppModule module;

    public AppModule_ProvideConfigFactory(AppModule appModule) {
        this.module = appModule;
    }

    public static AppModule_ProvideConfigFactory create(AppModule appModule) {
        return new AppModule_ProvideConfigFactory(appModule);
    }

    public static InternalConfig provideConfig(AppModule appModule) {
        InternalConfig internalConfig = appModule.getInternalConfig();
        AbstractC3230e0.i(internalConfig, "Cannot return null from a non-@Nullable @Provides method");
        return internalConfig;
    }

    @Override // df.InterfaceC2432a
    public InternalConfig get() {
        return provideConfig(this.module);
    }
}
