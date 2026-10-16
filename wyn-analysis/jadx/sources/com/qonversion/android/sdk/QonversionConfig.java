package com.qonversion.android.sdk;

import Bf.k;
import Bf.r;
import R8.v;
import android.app.Application;
import android.content.Context;
import android.util.Log;
import com.qonversion.android.sdk.dto.QEnvironment;
import com.qonversion.android.sdk.dto.QLaunchMode;
import com.qonversion.android.sdk.dto.entitlements.QEntitlementsCacheLifetime;
import com.qonversion.android.sdk.internal.ExtensionsKt;
import com.qonversion.android.sdk.internal.dto.config.CacheConfig;
import com.qonversion.android.sdk.internal.dto.config.PrimaryConfig;
import com.qonversion.android.sdk.listeners.QEntitlementsUpdateListener;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001:\u0001\u0013B)\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nR\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0006\u001a\u00020\u0007X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\b\u001a\u0004\u0018\u00010\tX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lcom/qonversion/android/sdk/QonversionConfig;", "", "application", "Landroid/app/Application;", "primaryConfig", "Lcom/qonversion/android/sdk/internal/dto/config/PrimaryConfig;", "cacheConfig", "Lcom/qonversion/android/sdk/internal/dto/config/CacheConfig;", "entitlementsUpdateListener", "Lcom/qonversion/android/sdk/listeners/QEntitlementsUpdateListener;", "(Landroid/app/Application;Lcom/qonversion/android/sdk/internal/dto/config/PrimaryConfig;Lcom/qonversion/android/sdk/internal/dto/config/CacheConfig;Lcom/qonversion/android/sdk/listeners/QEntitlementsUpdateListener;)V", "getApplication$sdk_release", "()Landroid/app/Application;", "getCacheConfig$sdk_release", "()Lcom/qonversion/android/sdk/internal/dto/config/CacheConfig;", "getEntitlementsUpdateListener$sdk_release", "()Lcom/qonversion/android/sdk/listeners/QEntitlementsUpdateListener;", "getPrimaryConfig$sdk_release", "()Lcom/qonversion/android/sdk/internal/dto/config/PrimaryConfig;", "Builder", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class QonversionConfig {

    @NotNull
    private final Application application;

    @NotNull
    private final CacheConfig cacheConfig;

    @Nullable
    private final QEntitlementsUpdateListener entitlementsUpdateListener;

    @NotNull
    private final PrimaryConfig primaryConfig;

    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0006\u00100\u001a\u000201J\u0006\u00102\u001a\u00020\u0000J\u0006\u00103\u001a\u00020\u0000J\u000e\u00104\u001a\u00020\u00002\u0006\u00105\u001a\u00020\nJ\u000e\u00106\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u00107\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0016J\u0010\u00108\u001a\u00020\u00002\b\b\u0001\u00109\u001a\u00020\u001cJ\u000e\u0010:\u001a\u00020\u00002\u0006\u0010;\u001a\u00020\u0005R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u00020\nX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0016X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010\u001b\u001a\u0004\u0018\u00010\u001c8\u0000@\u0000X\u0081\u000e¢\u0006\u0010\n\u0002\u0010!\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010\"\u001a\u00020#X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010(\u001a\u0004\u0018\u00010\u0005X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u001a\u0010-\u001a\u00020#X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010%\"\u0004\b/\u0010'¨\u0006<"}, d2 = {"Lcom/qonversion/android/sdk/QonversionConfig$Builder;", "", "context", "Landroid/content/Context;", "projectKey", "", "launchMode", "Lcom/qonversion/android/sdk/dto/QLaunchMode;", "(Landroid/content/Context;Ljava/lang/String;Lcom/qonversion/android/sdk/dto/QLaunchMode;)V", "entitlementsCacheLifetime", "Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;", "getEntitlementsCacheLifetime$sdk_release", "()Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;", "setEntitlementsCacheLifetime$sdk_release", "(Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;)V", "entitlementsUpdateListener", "Lcom/qonversion/android/sdk/listeners/QEntitlementsUpdateListener;", "getEntitlementsUpdateListener$sdk_release", "()Lcom/qonversion/android/sdk/listeners/QEntitlementsUpdateListener;", "setEntitlementsUpdateListener$sdk_release", "(Lcom/qonversion/android/sdk/listeners/QEntitlementsUpdateListener;)V", "environment", "Lcom/qonversion/android/sdk/dto/QEnvironment;", "getEnvironment$sdk_release", "()Lcom/qonversion/android/sdk/dto/QEnvironment;", "setEnvironment$sdk_release", "(Lcom/qonversion/android/sdk/dto/QEnvironment;)V", "fallbackFileIdentifier", "", "getFallbackFileIdentifier$sdk_release", "()Ljava/lang/Integer;", "setFallbackFileIdentifier$sdk_release", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "isKidsMode", "", "isKidsMode$sdk_release", "()Z", "setKidsMode$sdk_release", "(Z)V", "proxyUrl", "getProxyUrl$sdk_release", "()Ljava/lang/String;", "setProxyUrl$sdk_release", "(Ljava/lang/String;)V", "sendFbAttribution", "getSendFbAttribution$sdk_release", "setSendFbAttribution$sdk_release", "build", "Lcom/qonversion/android/sdk/QonversionConfig;", "disableFacebookAttribution", "enableKidsMode", "setEntitlementsCacheLifetime", "lifetime", "setEntitlementsUpdateListener", "setEnvironment", "setFallbackFileIdentifier", "id", "setProxyURL", "url", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Builder {

        @NotNull
        private final Context context;

        @NotNull
        private QEntitlementsCacheLifetime entitlementsCacheLifetime;

        @Nullable
        private QEntitlementsUpdateListener entitlementsUpdateListener;

        @NotNull
        private QEnvironment environment;

        @Nullable
        private Integer fallbackFileIdentifier;
        private boolean isKidsMode;

        @NotNull
        private final QLaunchMode launchMode;

        @NotNull
        private final String projectKey;

        @Nullable
        private String proxyUrl;
        private boolean sendFbAttribution;

        public Builder(@NotNull Context context, @NotNull String projectKey, @NotNull QLaunchMode launchMode) {
            AbstractC3340k.e(context, "context");
            AbstractC3340k.e(projectKey, "projectKey");
            AbstractC3340k.e(launchMode, "launchMode");
            this.context = context;
            this.projectKey = projectKey;
            this.launchMode = launchMode;
            this.environment = QEnvironment.Production;
            this.entitlementsCacheLifetime = QEntitlementsCacheLifetime.Month;
            this.sendFbAttribution = true;
        }

        @NotNull
        public final QonversionConfig build() {
            if (k.y0(this.projectKey)) {
                throw new IllegalStateException("Project key is empty");
            }
            if (this.environment == QEnvironment.Production && ExtensionsKt.isDebuggable(this.context)) {
                Log.w("Qonversion", "Environment level is set to Production for debug build.");
            } else if (this.environment == QEnvironment.Sandbox && !ExtensionsKt.isDebuggable(this.context)) {
                Log.w("Qonversion", "Environment level is set to Sandbox for release build.");
            }
            return new QonversionConfig(ExtensionsKt.getApplication(this.context), new PrimaryConfig(this.projectKey, this.launchMode, this.environment, this.proxyUrl, this.isKidsMode, this.sendFbAttribution, null, 64, null), new CacheConfig(this.entitlementsCacheLifetime, this.fallbackFileIdentifier), this.entitlementsUpdateListener);
        }

        @NotNull
        public final Builder disableFacebookAttribution() {
            this.sendFbAttribution = false;
            return this;
        }

        @NotNull
        public final Builder enableKidsMode() {
            this.isKidsMode = true;
            return this;
        }

        @NotNull
        /* renamed from: getEntitlementsCacheLifetime$sdk_release, reason: from getter */
        public final QEntitlementsCacheLifetime getEntitlementsCacheLifetime() {
            return this.entitlementsCacheLifetime;
        }

        @Nullable
        /* renamed from: getEntitlementsUpdateListener$sdk_release, reason: from getter */
        public final QEntitlementsUpdateListener getEntitlementsUpdateListener() {
            return this.entitlementsUpdateListener;
        }

        @NotNull
        /* renamed from: getEnvironment$sdk_release, reason: from getter */
        public final QEnvironment getEnvironment() {
            return this.environment;
        }

        @Nullable
        /* renamed from: getFallbackFileIdentifier$sdk_release, reason: from getter */
        public final Integer getFallbackFileIdentifier() {
            return this.fallbackFileIdentifier;
        }

        @Nullable
        /* renamed from: getProxyUrl$sdk_release, reason: from getter */
        public final String getProxyUrl() {
            return this.proxyUrl;
        }

        /* renamed from: getSendFbAttribution$sdk_release, reason: from getter */
        public final boolean getSendFbAttribution() {
            return this.sendFbAttribution;
        }

        /* renamed from: isKidsMode$sdk_release, reason: from getter */
        public final boolean getIsKidsMode() {
            return this.isKidsMode;
        }

        @NotNull
        public final Builder setEntitlementsCacheLifetime(@NotNull QEntitlementsCacheLifetime lifetime) {
            AbstractC3340k.e(lifetime, "lifetime");
            this.entitlementsCacheLifetime = lifetime;
            return this;
        }

        public final void setEntitlementsCacheLifetime$sdk_release(@NotNull QEntitlementsCacheLifetime qEntitlementsCacheLifetime) {
            AbstractC3340k.e(qEntitlementsCacheLifetime, "<set-?>");
            this.entitlementsCacheLifetime = qEntitlementsCacheLifetime;
        }

        @NotNull
        public final Builder setEntitlementsUpdateListener(@NotNull QEntitlementsUpdateListener entitlementsUpdateListener) {
            AbstractC3340k.e(entitlementsUpdateListener, "entitlementsUpdateListener");
            this.entitlementsUpdateListener = entitlementsUpdateListener;
            return this;
        }

        public final void setEntitlementsUpdateListener$sdk_release(@Nullable QEntitlementsUpdateListener qEntitlementsUpdateListener) {
            this.entitlementsUpdateListener = qEntitlementsUpdateListener;
        }

        @NotNull
        public final Builder setEnvironment(@NotNull QEnvironment environment) {
            AbstractC3340k.e(environment, "environment");
            this.environment = environment;
            return this;
        }

        public final void setEnvironment$sdk_release(@NotNull QEnvironment qEnvironment) {
            AbstractC3340k.e(qEnvironment, "<set-?>");
            this.environment = qEnvironment;
        }

        @NotNull
        public final Builder setFallbackFileIdentifier(int id2) {
            this.fallbackFileIdentifier = Integer.valueOf(id2);
            return this;
        }

        public final void setFallbackFileIdentifier$sdk_release(@Nullable Integer num) {
            this.fallbackFileIdentifier = num;
        }

        public final void setKidsMode$sdk_release(boolean z2) {
            this.isKidsMode = z2;
        }

        @NotNull
        public final Builder setProxyURL(@NotNull String url) {
            AbstractC3340k.e(url, "url");
            this.proxyUrl = url;
            if (!r.k0(url, "http://", false) && !r.k0(url, "https://", false)) {
                this.proxyUrl = v.f("https://", this.proxyUrl);
            }
            if (!r.b0(url, "/", false)) {
                this.proxyUrl = N0.a.f(this.proxyUrl, "/");
            }
            return this;
        }

        public final void setProxyUrl$sdk_release(@Nullable String str) {
            this.proxyUrl = str;
        }

        public final void setSendFbAttribution$sdk_release(boolean z2) {
            this.sendFbAttribution = z2;
        }
    }

    public QonversionConfig(@NotNull Application application, @NotNull PrimaryConfig primaryConfig, @NotNull CacheConfig cacheConfig, @Nullable QEntitlementsUpdateListener qEntitlementsUpdateListener) {
        AbstractC3340k.e(application, "application");
        AbstractC3340k.e(primaryConfig, "primaryConfig");
        AbstractC3340k.e(cacheConfig, "cacheConfig");
        this.application = application;
        this.primaryConfig = primaryConfig;
        this.cacheConfig = cacheConfig;
        this.entitlementsUpdateListener = qEntitlementsUpdateListener;
    }

    @NotNull
    /* renamed from: getApplication$sdk_release, reason: from getter */
    public final Application getApplication() {
        return this.application;
    }

    @NotNull
    /* renamed from: getCacheConfig$sdk_release, reason: from getter */
    public final CacheConfig getCacheConfig() {
        return this.cacheConfig;
    }

    @Nullable
    /* renamed from: getEntitlementsUpdateListener$sdk_release, reason: from getter */
    public final QEntitlementsUpdateListener getEntitlementsUpdateListener() {
        return this.entitlementsUpdateListener;
    }

    @NotNull
    /* renamed from: getPrimaryConfig$sdk_release, reason: from getter */
    public final PrimaryConfig getPrimaryConfig() {
        return this.primaryConfig;
    }
}
