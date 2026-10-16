package com.qonversion.android.sdk.internal.di.module;

import android.content.SharedPreferences;
import com.qonversion.android.sdk.internal.storage.SharedPreferencesCache;
import df.InterfaceC2432a;
import ka.AbstractC3230e0;

/* loaded from: classes4.dex */
public final class AppModule_ProvideSharedPreferencesCacheFactory implements InterfaceC2432a {
    private final AppModule module;
    private final InterfaceC2432a sharedPreferencesProvider;

    public AppModule_ProvideSharedPreferencesCacheFactory(AppModule appModule, InterfaceC2432a interfaceC2432a) {
        this.module = appModule;
        this.sharedPreferencesProvider = interfaceC2432a;
    }

    public static AppModule_ProvideSharedPreferencesCacheFactory create(AppModule appModule, InterfaceC2432a interfaceC2432a) {
        return new AppModule_ProvideSharedPreferencesCacheFactory(appModule, interfaceC2432a);
    }

    public static SharedPreferencesCache provideSharedPreferencesCache(AppModule appModule, SharedPreferences sharedPreferences) {
        SharedPreferencesCache sharedPreferencesCacheProvideSharedPreferencesCache = appModule.provideSharedPreferencesCache(sharedPreferences);
        AbstractC3230e0.i(sharedPreferencesCacheProvideSharedPreferencesCache, "Cannot return null from a non-@Nullable @Provides method");
        return sharedPreferencesCacheProvideSharedPreferencesCache;
    }

    @Override // df.InterfaceC2432a
    public SharedPreferencesCache get() {
        return provideSharedPreferencesCache(this.module, (SharedPreferences) this.sharedPreferencesProvider.get());
    }
}
