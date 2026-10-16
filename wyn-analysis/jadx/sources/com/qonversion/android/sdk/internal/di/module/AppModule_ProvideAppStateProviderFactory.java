package com.qonversion.android.sdk.internal.di.module;

import com.qonversion.android.sdk.internal.provider.AppStateProvider;
import df.InterfaceC2432a;
import ka.AbstractC3230e0;

/* loaded from: classes4.dex */
public final class AppModule_ProvideAppStateProviderFactory implements InterfaceC2432a {
    private final AppModule module;

    public AppModule_ProvideAppStateProviderFactory(AppModule appModule) {
        this.module = appModule;
    }

    public static AppModule_ProvideAppStateProviderFactory create(AppModule appModule) {
        return new AppModule_ProvideAppStateProviderFactory(appModule);
    }

    public static AppStateProvider provideAppStateProvider(AppModule appModule) {
        AppStateProvider appStateProvider = appModule.getAppStateProvider();
        AbstractC3230e0.i(appStateProvider, "Cannot return null from a non-@Nullable @Provides method");
        return appStateProvider;
    }

    @Override // df.InterfaceC2432a
    public AppStateProvider get() {
        return provideAppStateProvider(this.module);
    }
}
