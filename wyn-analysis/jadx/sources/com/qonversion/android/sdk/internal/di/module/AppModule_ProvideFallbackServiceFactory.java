package com.qonversion.android.sdk.internal.di.module;

import android.app.Application;
import com.qonversion.android.sdk.internal.logger.Logger;
import com.qonversion.android.sdk.internal.services.QFallbacksService;
import df.InterfaceC2432a;
import hb.K;
import ka.AbstractC3230e0;

/* loaded from: classes4.dex */
public final class AppModule_ProvideFallbackServiceFactory implements InterfaceC2432a {
    private final InterfaceC2432a contextProvider;
    private final InterfaceC2432a loggerProvider;
    private final AppModule module;
    private final InterfaceC2432a moshiProvider;

    public AppModule_ProvideFallbackServiceFactory(AppModule appModule, InterfaceC2432a interfaceC2432a, InterfaceC2432a interfaceC2432a2, InterfaceC2432a interfaceC2432a3) {
        this.module = appModule;
        this.contextProvider = interfaceC2432a;
        this.moshiProvider = interfaceC2432a2;
        this.loggerProvider = interfaceC2432a3;
    }

    public static AppModule_ProvideFallbackServiceFactory create(AppModule appModule, InterfaceC2432a interfaceC2432a, InterfaceC2432a interfaceC2432a2, InterfaceC2432a interfaceC2432a3) {
        return new AppModule_ProvideFallbackServiceFactory(appModule, interfaceC2432a, interfaceC2432a2, interfaceC2432a3);
    }

    public static QFallbacksService provideFallbackService(AppModule appModule, Application application, K k, Logger logger) {
        QFallbacksService qFallbacksServiceProvideFallbackService = appModule.provideFallbackService(application, k, logger);
        AbstractC3230e0.i(qFallbacksServiceProvideFallbackService, "Cannot return null from a non-@Nullable @Provides method");
        return qFallbacksServiceProvideFallbackService;
    }

    @Override // df.InterfaceC2432a
    public QFallbacksService get() {
        return provideFallbackService(this.module, (Application) this.contextProvider.get(), (K) this.moshiProvider.get(), (Logger) this.loggerProvider.get());
    }
}
