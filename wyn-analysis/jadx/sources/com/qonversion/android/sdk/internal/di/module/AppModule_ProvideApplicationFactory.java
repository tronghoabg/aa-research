package com.qonversion.android.sdk.internal.di.module;

import android.app.Application;
import df.InterfaceC2432a;
import ka.AbstractC3230e0;

/* loaded from: classes4.dex */
public final class AppModule_ProvideApplicationFactory implements InterfaceC2432a {
    private final AppModule module;

    public AppModule_ProvideApplicationFactory(AppModule appModule) {
        this.module = appModule;
    }

    public static AppModule_ProvideApplicationFactory create(AppModule appModule) {
        return new AppModule_ProvideApplicationFactory(appModule);
    }

    public static Application provideApplication(AppModule appModule) {
        Application application = appModule.getApplication();
        AbstractC3230e0.i(application, "Cannot return null from a non-@Nullable @Provides method");
        return application;
    }

    @Override // df.InterfaceC2432a
    public Application get() {
        return provideApplication(this.module);
    }
}
