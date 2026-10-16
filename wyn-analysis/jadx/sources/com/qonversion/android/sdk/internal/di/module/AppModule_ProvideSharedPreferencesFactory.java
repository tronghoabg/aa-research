package com.qonversion.android.sdk.internal.di.module;

import android.app.Application;
import android.content.SharedPreferences;
import df.InterfaceC2432a;
import ka.AbstractC3230e0;

/* loaded from: classes4.dex */
public final class AppModule_ProvideSharedPreferencesFactory implements InterfaceC2432a {
    private final InterfaceC2432a contextProvider;
    private final AppModule module;

    public AppModule_ProvideSharedPreferencesFactory(AppModule appModule, InterfaceC2432a interfaceC2432a) {
        this.module = appModule;
        this.contextProvider = interfaceC2432a;
    }

    public static AppModule_ProvideSharedPreferencesFactory create(AppModule appModule, InterfaceC2432a interfaceC2432a) {
        return new AppModule_ProvideSharedPreferencesFactory(appModule, interfaceC2432a);
    }

    public static SharedPreferences provideSharedPreferences(AppModule appModule, Application application) {
        SharedPreferences sharedPreferencesProvideSharedPreferences = appModule.provideSharedPreferences(application);
        AbstractC3230e0.i(sharedPreferencesProvideSharedPreferences, "Cannot return null from a non-@Nullable @Provides method");
        return sharedPreferencesProvideSharedPreferences;
    }

    @Override // df.InterfaceC2432a
    public SharedPreferences get() {
        return provideSharedPreferences(this.module, (Application) this.contextProvider.get());
    }
}
