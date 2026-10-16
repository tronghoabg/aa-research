package com.qonversion.android.sdk.internal.di.module;

import android.app.Application;
import android.content.SharedPreferences;
import com.qonversion.android.sdk.internal.InternalConfig;
import com.qonversion.android.sdk.internal.di.scope.ApplicationScope;
import com.qonversion.android.sdk.internal.logger.ConsoleLogger;
import com.qonversion.android.sdk.internal.logger.Logger;
import com.qonversion.android.sdk.internal.provider.AppStateProvider;
import com.qonversion.android.sdk.internal.services.QFallbacksService;
import com.qonversion.android.sdk.internal.storage.LaunchResultCacheWrapper;
import com.qonversion.android.sdk.internal.storage.PurchasesCache;
import com.qonversion.android.sdk.internal.storage.SharedPreferencesCache;
import hb.K;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0014\u001a\u00020\u0015H\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ'\u0010$\u001a\u00020#2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u00152\u0006\u0010\"\u001a\u00020!H\u0007¢\u0006\u0004\b$\u0010%J'\u0010'\u001a\u00020!2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010&\u001a\u00020\u0018H\u0007¢\u0006\u0004\b'\u0010(R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010)R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010*R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010+¨\u0006,"}, d2 = {"Lcom/qonversion/android/sdk/internal/di/module/AppModule;", "", "Landroid/app/Application;", "application", "Lcom/qonversion/android/sdk/internal/InternalConfig;", "internalConfig", "Lcom/qonversion/android/sdk/internal/provider/AppStateProvider;", "appStateProvider", "<init>", "(Landroid/app/Application;Lcom/qonversion/android/sdk/internal/InternalConfig;Lcom/qonversion/android/sdk/internal/provider/AppStateProvider;)V", "provideApplication", "()Landroid/app/Application;", "provideConfig", "()Lcom/qonversion/android/sdk/internal/InternalConfig;", "provideAppStateProvider", "()Lcom/qonversion/android/sdk/internal/provider/AppStateProvider;", "context", "Landroid/content/SharedPreferences;", "provideSharedPreferences", "(Landroid/app/Application;)Landroid/content/SharedPreferences;", "sharedPreferences", "Lcom/qonversion/android/sdk/internal/storage/SharedPreferencesCache;", "provideSharedPreferencesCache", "(Landroid/content/SharedPreferences;)Lcom/qonversion/android/sdk/internal/storage/SharedPreferencesCache;", "Lcom/qonversion/android/sdk/internal/logger/Logger;", "provideLogger", "()Lcom/qonversion/android/sdk/internal/logger/Logger;", "Lcom/qonversion/android/sdk/internal/storage/PurchasesCache;", "providePurchasesCache", "(Lcom/qonversion/android/sdk/internal/storage/SharedPreferencesCache;)Lcom/qonversion/android/sdk/internal/storage/PurchasesCache;", "Lhb/K;", "moshi", "sharedPreferencesCache", "Lcom/qonversion/android/sdk/internal/services/QFallbacksService;", "fallbacksService", "Lcom/qonversion/android/sdk/internal/storage/LaunchResultCacheWrapper;", "provideLaunchResultCacheWrapper", "(Lhb/K;Lcom/qonversion/android/sdk/internal/storage/SharedPreferencesCache;Lcom/qonversion/android/sdk/internal/services/QFallbacksService;)Lcom/qonversion/android/sdk/internal/storage/LaunchResultCacheWrapper;", "logger", "provideFallbackService", "(Landroid/app/Application;Lhb/K;Lcom/qonversion/android/sdk/internal/logger/Logger;)Lcom/qonversion/android/sdk/internal/services/QFallbacksService;", "Landroid/app/Application;", "Lcom/qonversion/android/sdk/internal/InternalConfig;", "Lcom/qonversion/android/sdk/internal/provider/AppStateProvider;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AppModule {

    @NotNull
    private final AppStateProvider appStateProvider;

    @NotNull
    private final Application application;

    @NotNull
    private final InternalConfig internalConfig;

    public AppModule(@NotNull Application application, @NotNull InternalConfig internalConfig, @NotNull AppStateProvider appStateProvider) {
        AbstractC3340k.e(application, "application");
        AbstractC3340k.e(internalConfig, "internalConfig");
        AbstractC3340k.e(appStateProvider, "appStateProvider");
        this.application = application;
        this.internalConfig = internalConfig;
        this.appStateProvider = appStateProvider;
    }

    @ApplicationScope
    @NotNull
    /* renamed from: provideAppStateProvider, reason: from getter */
    public final AppStateProvider getAppStateProvider() {
        return this.appStateProvider;
    }

    @ApplicationScope
    @NotNull
    /* renamed from: provideApplication, reason: from getter */
    public final Application getApplication() {
        return this.application;
    }

    @ApplicationScope
    @NotNull
    /* renamed from: provideConfig, reason: from getter */
    public final InternalConfig getInternalConfig() {
        return this.internalConfig;
    }

    @ApplicationScope
    @NotNull
    public final QFallbacksService provideFallbackService(@NotNull Application context, @NotNull K moshi, @NotNull Logger logger) {
        AbstractC3340k.e(context, "context");
        AbstractC3340k.e(moshi, "moshi");
        AbstractC3340k.e(logger, "logger");
        return new QFallbacksService(context, this.internalConfig, moshi, logger);
    }

    @ApplicationScope
    @NotNull
    public final LaunchResultCacheWrapper provideLaunchResultCacheWrapper(@NotNull K moshi, @NotNull SharedPreferencesCache sharedPreferencesCache, @NotNull QFallbacksService fallbacksService) {
        AbstractC3340k.e(moshi, "moshi");
        AbstractC3340k.e(sharedPreferencesCache, "sharedPreferencesCache");
        AbstractC3340k.e(fallbacksService, "fallbacksService");
        return new LaunchResultCacheWrapper(moshi, sharedPreferencesCache, this.internalConfig, fallbacksService);
    }

    @ApplicationScope
    @NotNull
    public final Logger provideLogger() {
        return new ConsoleLogger();
    }

    @ApplicationScope
    @NotNull
    public final PurchasesCache providePurchasesCache(@NotNull SharedPreferencesCache sharedPreferences) {
        AbstractC3340k.e(sharedPreferences, "sharedPreferences");
        return new PurchasesCache(sharedPreferences);
    }

    @ApplicationScope
    @NotNull
    public final SharedPreferences provideSharedPreferences(@NotNull Application context) {
        AbstractC3340k.e(context, "context");
        SharedPreferences sharedPreferences = context.getSharedPreferences(context.getPackageName() + "_preferences", 0);
        AbstractC3340k.d(sharedPreferences, "getDefaultSharedPreferences(...)");
        return sharedPreferences;
    }

    @ApplicationScope
    @NotNull
    public final SharedPreferencesCache provideSharedPreferencesCache(@NotNull SharedPreferences sharedPreferences) {
        AbstractC3340k.e(sharedPreferences, "sharedPreferences");
        return new SharedPreferencesCache(sharedPreferences);
    }
}
