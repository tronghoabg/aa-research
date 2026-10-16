package com.qonversion.android.sdk.internal.di.component;

import com.qonversion.android.sdk.automations.internal.QAutomationsManager;
import com.qonversion.android.sdk.internal.InternalConfig;
import com.qonversion.android.sdk.internal.QHandledPurchasesCache;
import com.qonversion.android.sdk.internal.QIdentityManager;
import com.qonversion.android.sdk.internal.QRemoteConfigManager;
import com.qonversion.android.sdk.internal.QUserPropertiesManager;
import com.qonversion.android.sdk.internal.di.scope.ApplicationScope;
import com.qonversion.android.sdk.internal.logger.QExceptionManager;
import com.qonversion.android.sdk.internal.provider.AppStateProvider;
import com.qonversion.android.sdk.internal.repository.DefaultRepository;
import com.qonversion.android.sdk.internal.repository.QRepository;
import com.qonversion.android.sdk.internal.services.QFallbacksService;
import com.qonversion.android.sdk.internal.services.QUserInfoService;
import com.qonversion.android.sdk.internal.storage.LaunchResultCacheWrapper;
import com.qonversion.android.sdk.internal.storage.PurchasesCache;
import com.qonversion.android.sdk.internal.storage.SharedPreferencesCache;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@ApplicationScope
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\ba\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\tH&J\b\u0010\n\u001a\u00020\u000bH&J\b\u0010\f\u001a\u00020\rH&J\b\u0010\u000e\u001a\u00020\u000fH&J\b\u0010\u0010\u001a\u00020\u0011H&J\b\u0010\u0012\u001a\u00020\u0013H&J\b\u0010\u0014\u001a\u00020\u0015H&J\b\u0010\u0016\u001a\u00020\u0017H&J\b\u0010\u0018\u001a\u00020\u0019H&J\b\u0010\u001a\u001a\u00020\u001bH&J\b\u0010\u001c\u001a\u00020\u001dH&J\b\u0010\u001e\u001a\u00020\u001fH&¨\u0006 "}, d2 = {"Lcom/qonversion/android/sdk/internal/di/component/AppComponent;", "", "appStateProvider", "Lcom/qonversion/android/sdk/internal/provider/AppStateProvider;", "automationsManager", "Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;", "exceptionManager", "Lcom/qonversion/android/sdk/internal/logger/QExceptionManager;", "fallbacksService", "Lcom/qonversion/android/sdk/internal/services/QFallbacksService;", "handledPurchasesCache", "Lcom/qonversion/android/sdk/internal/QHandledPurchasesCache;", "identityManager", "Lcom/qonversion/android/sdk/internal/QIdentityManager;", "internalConfig", "Lcom/qonversion/android/sdk/internal/InternalConfig;", "launchResultCacheWrapper", "Lcom/qonversion/android/sdk/internal/storage/LaunchResultCacheWrapper;", "purchasesCache", "Lcom/qonversion/android/sdk/internal/storage/PurchasesCache;", "qonversionRepository", "Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;", "remoteConfigManager", "Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;", "repository", "Lcom/qonversion/android/sdk/internal/repository/QRepository;", "sharedPreferencesCache", "Lcom/qonversion/android/sdk/internal/storage/SharedPreferencesCache;", "userInfoService", "Lcom/qonversion/android/sdk/internal/services/QUserInfoService;", "userPropertiesManager", "Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface AppComponent {
    @NotNull
    AppStateProvider appStateProvider();

    @NotNull
    QAutomationsManager automationsManager();

    @NotNull
    QExceptionManager exceptionManager();

    @NotNull
    QFallbacksService fallbacksService();

    @NotNull
    QHandledPurchasesCache handledPurchasesCache();

    @NotNull
    QIdentityManager identityManager();

    @NotNull
    InternalConfig internalConfig();

    @NotNull
    LaunchResultCacheWrapper launchResultCacheWrapper();

    @NotNull
    PurchasesCache purchasesCache();

    @NotNull
    DefaultRepository qonversionRepository();

    @NotNull
    QRemoteConfigManager remoteConfigManager();

    @NotNull
    QRepository repository();

    @NotNull
    SharedPreferencesCache sharedPreferencesCache();

    @NotNull
    QUserInfoService userInfoService();

    @NotNull
    QUserPropertiesManager userPropertiesManager();
}
