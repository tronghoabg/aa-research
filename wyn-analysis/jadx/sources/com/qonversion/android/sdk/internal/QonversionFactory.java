package com.qonversion.android.sdk.internal;

import android.app.Application;
import android.os.Handler;
import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.PendingPurchasesParams;
import com.android.billingclient.api.PurchasesUpdatedListener;
import com.qonversion.android.sdk.internal.billing.BillingClientHolder;
import com.qonversion.android.sdk.internal.billing.BillingClientWrapper;
import com.qonversion.android.sdk.internal.billing.LegacyBillingClientWrapper;
import com.qonversion.android.sdk.internal.billing.QonversionBillingService;
import com.qonversion.android.sdk.internal.logger.Logger;
import com.qonversion.android.sdk.internal.provider.AppStateProvider;
import com.qonversion.android.sdk.internal.repository.QRepository;
import com.qonversion.android.sdk.internal.services.QUserInfoService;
import com.qonversion.android.sdk.internal.storage.LaunchResultCacheWrapper;
import com.qonversion.android.sdk.internal.storage.PurchasesCache;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0003J\b\u0010\u000b\u001a\u00020\fH\u0002J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\fH\u0002J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u000f\u001a\u00020\fH\u0002JN\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006+"}, d2 = {"Lcom/qonversion/android/sdk/internal/QonversionFactory;", "", "context", "Landroid/app/Application;", "logger", "Lcom/qonversion/android/sdk/internal/logger/Logger;", "(Landroid/app/Application;Lcom/qonversion/android/sdk/internal/logger/Logger;)V", "createBillingClient", "Lcom/android/billingclient/api/BillingClient;", "listener", "Lcom/android/billingclient/api/PurchasesUpdatedListener;", "createBillingClientHolder", "Lcom/qonversion/android/sdk/internal/billing/BillingClientHolder;", "createBillingClientWrapper", "Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper;", "billingClientHolder", "createBillingService", "Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;", "Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$PurchasesListener;", "isAnalyticsMode", "", "createLegacyBillingClientWrapper", "Lcom/qonversion/android/sdk/internal/billing/LegacyBillingClientWrapper;", "createProductCenterManager", "Lcom/qonversion/android/sdk/internal/QProductCenterManager;", "repository", "Lcom/qonversion/android/sdk/internal/repository/QRepository;", "purchasesCache", "Lcom/qonversion/android/sdk/internal/storage/PurchasesCache;", "handledPurchasesCache", "Lcom/qonversion/android/sdk/internal/QHandledPurchasesCache;", "launchResultCacheWrapper", "Lcom/qonversion/android/sdk/internal/storage/LaunchResultCacheWrapper;", "userInfoService", "Lcom/qonversion/android/sdk/internal/services/QUserInfoService;", "identityManager", "Lcom/qonversion/android/sdk/internal/QIdentityManager;", "config", "Lcom/qonversion/android/sdk/internal/InternalConfig;", "appStateProvider", "Lcom/qonversion/android/sdk/internal/provider/AppStateProvider;", "remoteConfigManager", "Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class QonversionFactory {

    @NotNull
    private final Application context;

    @NotNull
    private final Logger logger;

    public QonversionFactory(@NotNull Application context, @NotNull Logger logger) {
        AbstractC3340k.e(context, "context");
        AbstractC3340k.e(logger, "logger");
        this.context = context;
        this.logger = logger;
    }

    private final BillingClient createBillingClient(PurchasesUpdatedListener listener) {
        BillingClient.Builder builderNewBuilder = BillingClient.newBuilder(this.context);
        AbstractC3340k.d(builderNewBuilder, "newBuilder(...)");
        builderNewBuilder.enablePendingPurchases(PendingPurchasesParams.newBuilder().enableOneTimeProducts().enablePrepaidPlans().build());
        builderNewBuilder.setListener(listener);
        BillingClient billingClientBuild = builderNewBuilder.build();
        AbstractC3340k.d(billingClientBuild, "build(...)");
        return billingClientBuild;
    }

    private final BillingClientHolder createBillingClientHolder() {
        BillingClientHolder billingClientHolder = new BillingClientHolder(new Handler(this.context.getMainLooper()), this.logger);
        billingClientHolder.setBillingClient(createBillingClient(billingClientHolder));
        return billingClientHolder;
    }

    private final BillingClientWrapper createBillingClientWrapper(BillingClientHolder billingClientHolder) {
        return new BillingClientWrapper(billingClientHolder, this.logger);
    }

    private final QonversionBillingService createBillingService(QonversionBillingService.PurchasesListener listener, boolean isAnalyticsMode) {
        BillingClientHolder billingClientHolderCreateBillingClientHolder = createBillingClientHolder();
        return new QonversionBillingService(new Handler(this.context.getMainLooper()), listener, this.logger, isAnalyticsMode, billingClientHolderCreateBillingClientHolder, createBillingClientWrapper(billingClientHolderCreateBillingClientHolder), createLegacyBillingClientWrapper(billingClientHolderCreateBillingClientHolder));
    }

    private final LegacyBillingClientWrapper createLegacyBillingClientWrapper(BillingClientHolder billingClientHolder) {
        return new LegacyBillingClientWrapper(billingClientHolder, this.logger);
    }

    @NotNull
    public final QProductCenterManager createProductCenterManager(@NotNull QRepository repository, @NotNull PurchasesCache purchasesCache, @NotNull QHandledPurchasesCache handledPurchasesCache, @NotNull LaunchResultCacheWrapper launchResultCacheWrapper, @NotNull QUserInfoService userInfoService, @NotNull QIdentityManager identityManager, @NotNull InternalConfig config, @NotNull AppStateProvider appStateProvider, @NotNull QRemoteConfigManager remoteConfigManager) {
        AbstractC3340k.e(repository, "repository");
        AbstractC3340k.e(purchasesCache, "purchasesCache");
        AbstractC3340k.e(handledPurchasesCache, "handledPurchasesCache");
        AbstractC3340k.e(launchResultCacheWrapper, "launchResultCacheWrapper");
        AbstractC3340k.e(userInfoService, "userInfoService");
        AbstractC3340k.e(identityManager, "identityManager");
        AbstractC3340k.e(config, "config");
        AbstractC3340k.e(appStateProvider, "appStateProvider");
        AbstractC3340k.e(remoteConfigManager, "remoteConfigManager");
        QProductCenterManager qProductCenterManager = new QProductCenterManager(this.context, repository, this.logger, purchasesCache, handledPurchasesCache, launchResultCacheWrapper, userInfoService, identityManager, config, appStateProvider, remoteConfigManager);
        qProductCenterManager.setBillingService(createBillingService(qProductCenterManager, config.isAnalyticsMode()));
        return qProductCenterManager;
    }
}
