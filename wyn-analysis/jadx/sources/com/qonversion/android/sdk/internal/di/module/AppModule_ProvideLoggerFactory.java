package com.qonversion.android.sdk.internal.di.module;

import com.qonversion.android.sdk.internal.logger.Logger;
import df.InterfaceC2432a;
import ka.AbstractC3230e0;

/* loaded from: classes4.dex */
public final class AppModule_ProvideLoggerFactory implements InterfaceC2432a {
    private final AppModule module;

    public AppModule_ProvideLoggerFactory(AppModule appModule) {
        this.module = appModule;
    }

    public static AppModule_ProvideLoggerFactory create(AppModule appModule) {
        return new AppModule_ProvideLoggerFactory(appModule);
    }

    public static Logger provideLogger(AppModule appModule) {
        Logger loggerProvideLogger = appModule.provideLogger();
        AbstractC3230e0.i(loggerProvideLogger, "Cannot return null from a non-@Nullable @Provides method");
        return loggerProvideLogger;
    }

    @Override // df.InterfaceC2432a
    public Logger get() {
        return provideLogger(this.module);
    }
}
