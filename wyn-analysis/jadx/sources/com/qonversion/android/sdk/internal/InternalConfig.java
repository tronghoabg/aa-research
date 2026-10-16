package com.qonversion.android.sdk.internal;

import com.qonversion.android.sdk.QonversionConfig;
import com.qonversion.android.sdk.dto.QEnvironment;
import com.qonversion.android.sdk.dto.QLaunchMode;
import com.qonversion.android.sdk.internal.dto.config.CacheConfig;
import com.qonversion.android.sdk.internal.dto.config.PrimaryConfig;
import com.qonversion.android.sdk.internal.provider.CacheConfigProvider;
import com.qonversion.android.sdk.internal.provider.EntitlementsUpdateListenerProvider;
import com.qonversion.android.sdk.internal.provider.PrimaryConfigProvider;
import com.qonversion.android.sdk.internal.provider.UidProvider;
import com.qonversion.android.sdk.listeners.QEntitlementsUpdateListener;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\f\b\u0000\u0018\u0000 12\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u00011B\u000f\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bB\u001f\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0002\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u000b\u001a\u00020\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR*\u0010 \u001a\u0004\u0018\u00010\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f8F@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u0011\u0010%\u001a\u00020&8F¢\u0006\u0006\u001a\u0004\b%\u0010'R\u0014\u0010(\u001a\u00020&8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010'R\u001a\u0010\t\u001a\u00020\nX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R&\u0010-\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u00118V@VX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u0013\"\u0004\b/\u00100¨\u00062"}, d2 = {"Lcom/qonversion/android/sdk/internal/InternalConfig;", "Lcom/qonversion/android/sdk/internal/provider/EnvironmentProvider;", "Lcom/qonversion/android/sdk/internal/provider/PrimaryConfigProvider;", "Lcom/qonversion/android/sdk/internal/provider/CacheConfigProvider;", "Lcom/qonversion/android/sdk/internal/provider/UidProvider;", "Lcom/qonversion/android/sdk/internal/provider/EntitlementsUpdateListenerProvider;", "qonversionConfig", "Lcom/qonversion/android/sdk/QonversionConfig;", "(Lcom/qonversion/android/sdk/QonversionConfig;)V", "primaryConfig", "Lcom/qonversion/android/sdk/internal/dto/config/PrimaryConfig;", "cacheConfig", "Lcom/qonversion/android/sdk/internal/dto/config/CacheConfig;", "entitlementsUpdateListener", "Lcom/qonversion/android/sdk/listeners/QEntitlementsUpdateListener;", "(Lcom/qonversion/android/sdk/internal/dto/config/PrimaryConfig;Lcom/qonversion/android/sdk/internal/dto/config/CacheConfig;Lcom/qonversion/android/sdk/listeners/QEntitlementsUpdateListener;)V", "apiUrl", "", "getApiUrl", "()Ljava/lang/String;", "getCacheConfig", "()Lcom/qonversion/android/sdk/internal/dto/config/CacheConfig;", "getEntitlementsUpdateListener", "()Lcom/qonversion/android/sdk/listeners/QEntitlementsUpdateListener;", "setEntitlementsUpdateListener", "(Lcom/qonversion/android/sdk/listeners/QEntitlementsUpdateListener;)V", "environment", "Lcom/qonversion/android/sdk/dto/QEnvironment;", "getEnvironment", "()Lcom/qonversion/android/sdk/dto/QEnvironment;", "<set-?>", "Lcom/qonversion/android/sdk/internal/HttpError;", "fatalError", "getFatalError", "()Lcom/qonversion/android/sdk/internal/HttpError;", "setFatalError", "(Lcom/qonversion/android/sdk/internal/HttpError;)V", "isAnalyticsMode", "", "()Z", "isSandbox", "getPrimaryConfig", "()Lcom/qonversion/android/sdk/internal/dto/config/PrimaryConfig;", "setPrimaryConfig", "(Lcom/qonversion/android/sdk/internal/dto/config/PrimaryConfig;)V", "uid", "getUid", "setUid", "(Ljava/lang/String;)V", "Companion", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class InternalConfig implements com.qonversion.android.sdk.internal.provider.EnvironmentProvider, PrimaryConfigProvider, CacheConfigProvider, UidProvider, EntitlementsUpdateListenerProvider {

    @NotNull
    private static final String BASE_URL = "https://api.qonversion.io/";

    @NotNull
    private final CacheConfig cacheConfig;

    @Nullable
    private QEntitlementsUpdateListener entitlementsUpdateListener;

    @Nullable
    private volatile HttpError fatalError;

    @NotNull
    private PrimaryConfig primaryConfig;

    @NotNull
    private volatile String uid;

    public InternalConfig(@NotNull PrimaryConfig primaryConfig, @NotNull CacheConfig cacheConfig, @Nullable QEntitlementsUpdateListener qEntitlementsUpdateListener) {
        AbstractC3340k.e(primaryConfig, "primaryConfig");
        AbstractC3340k.e(cacheConfig, "cacheConfig");
        this.primaryConfig = primaryConfig;
        this.cacheConfig = cacheConfig;
        this.entitlementsUpdateListener = qEntitlementsUpdateListener;
        this.uid = "";
    }

    @Override // com.qonversion.android.sdk.internal.provider.EnvironmentProvider
    @NotNull
    public String getApiUrl() {
        String proxyUrl = getPrimaryConfig().getProxyUrl();
        return proxyUrl == null ? BASE_URL : proxyUrl;
    }

    @Override // com.qonversion.android.sdk.internal.provider.CacheConfigProvider
    @NotNull
    public CacheConfig getCacheConfig() {
        return this.cacheConfig;
    }

    @Override // com.qonversion.android.sdk.internal.provider.EntitlementsUpdateListenerProvider
    @Nullable
    public QEntitlementsUpdateListener getEntitlementsUpdateListener() {
        return this.entitlementsUpdateListener;
    }

    @Override // com.qonversion.android.sdk.internal.provider.EnvironmentProvider
    @NotNull
    public QEnvironment getEnvironment() {
        return getPrimaryConfig().getEnvironment();
    }

    @Nullable
    public final synchronized HttpError getFatalError() {
        return this.fatalError;
    }

    @Override // com.qonversion.android.sdk.internal.provider.PrimaryConfigProvider
    @NotNull
    public PrimaryConfig getPrimaryConfig() {
        return this.primaryConfig;
    }

    @Override // com.qonversion.android.sdk.internal.provider.UidProvider
    @NotNull
    public synchronized String getUid() {
        return this.uid;
    }

    public final boolean isAnalyticsMode() {
        return getPrimaryConfig().getLaunchMode() == QLaunchMode.Analytics;
    }

    @Override // com.qonversion.android.sdk.internal.provider.EnvironmentProvider
    public boolean isSandbox() {
        return getEnvironment() == QEnvironment.Sandbox;
    }

    public void setEntitlementsUpdateListener(@Nullable QEntitlementsUpdateListener qEntitlementsUpdateListener) {
        this.entitlementsUpdateListener = qEntitlementsUpdateListener;
    }

    public final synchronized void setFatalError(@Nullable HttpError httpError) {
        this.fatalError = httpError;
    }

    public void setPrimaryConfig(@NotNull PrimaryConfig primaryConfig) {
        AbstractC3340k.e(primaryConfig, "<set-?>");
        this.primaryConfig = primaryConfig;
    }

    public synchronized void setUid(@NotNull String str) {
        AbstractC3340k.e(str, "<set-?>");
        this.uid = str;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InternalConfig(@NotNull QonversionConfig qonversionConfig) {
        this(qonversionConfig.getPrimaryConfig(), qonversionConfig.getCacheConfig(), qonversionConfig.getEntitlementsUpdateListener());
        AbstractC3340k.e(qonversionConfig, "qonversionConfig");
    }
}
