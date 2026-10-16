package com.qonversion.android.sdk.internal.dto.config;

import com.qonversion.android.sdk.BuildConfig;
import com.qonversion.android.sdk.dto.QEnvironment;
import com.qonversion.android.sdk.dto.QLaunchMode;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import wg.b;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003¢\u0006\u0002\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\nHÆ\u0003J\t\u0010\u001d\u001a\u00020\nHÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003JQ\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\u0003HÆ\u0001J\u0013\u0010 \u001a\u00020\n2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0011\u0010\u000b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010¨\u0006%"}, d2 = {"Lcom/qonversion/android/sdk/internal/dto/config/PrimaryConfig;", "", "projectKey", "", "launchMode", "Lcom/qonversion/android/sdk/dto/QLaunchMode;", "environment", "Lcom/qonversion/android/sdk/dto/QEnvironment;", "proxyUrl", "isKidsMode", "", "sendFbAttribution", "sdkVersion", "(Ljava/lang/String;Lcom/qonversion/android/sdk/dto/QLaunchMode;Lcom/qonversion/android/sdk/dto/QEnvironment;Ljava/lang/String;ZZLjava/lang/String;)V", "getEnvironment", "()Lcom/qonversion/android/sdk/dto/QEnvironment;", "()Z", "getLaunchMode", "()Lcom/qonversion/android/sdk/dto/QLaunchMode;", "getProjectKey", "()Ljava/lang/String;", "getProxyUrl", "getSdkVersion", "getSendFbAttribution", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class PrimaryConfig {

    @NotNull
    private final QEnvironment environment;
    private final boolean isKidsMode;

    @NotNull
    private final QLaunchMode launchMode;

    @NotNull
    private final String projectKey;

    @Nullable
    private final String proxyUrl;

    @NotNull
    private final String sdkVersion;
    private final boolean sendFbAttribution;

    public PrimaryConfig(@NotNull String projectKey, @NotNull QLaunchMode launchMode, @NotNull QEnvironment environment, @Nullable String str, boolean z2, boolean z10, @NotNull String sdkVersion) {
        AbstractC3340k.e(projectKey, "projectKey");
        AbstractC3340k.e(launchMode, "launchMode");
        AbstractC3340k.e(environment, "environment");
        AbstractC3340k.e(sdkVersion, "sdkVersion");
        this.projectKey = projectKey;
        this.launchMode = launchMode;
        this.environment = environment;
        this.proxyUrl = str;
        this.isKidsMode = z2;
        this.sendFbAttribution = z10;
        this.sdkVersion = sdkVersion;
    }

    public static /* synthetic */ PrimaryConfig copy$default(PrimaryConfig primaryConfig, String str, QLaunchMode qLaunchMode, QEnvironment qEnvironment, String str2, boolean z2, boolean z10, String str3, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            str = primaryConfig.projectKey;
        }
        if ((i5 & 2) != 0) {
            qLaunchMode = primaryConfig.launchMode;
        }
        if ((i5 & 4) != 0) {
            qEnvironment = primaryConfig.environment;
        }
        if ((i5 & 8) != 0) {
            str2 = primaryConfig.proxyUrl;
        }
        if ((i5 & 16) != 0) {
            z2 = primaryConfig.isKidsMode;
        }
        if ((i5 & 32) != 0) {
            z10 = primaryConfig.sendFbAttribution;
        }
        if ((i5 & 64) != 0) {
            str3 = primaryConfig.sdkVersion;
        }
        boolean z11 = z10;
        String str4 = str3;
        boolean z12 = z2;
        QEnvironment qEnvironment2 = qEnvironment;
        return primaryConfig.copy(str, qLaunchMode, qEnvironment2, str2, z12, z11, str4);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getProjectKey() {
        return this.projectKey;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final QLaunchMode getLaunchMode() {
        return this.launchMode;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final QEnvironment getEnvironment() {
        return this.environment;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final String getProxyUrl() {
        return this.proxyUrl;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsKidsMode() {
        return this.isKidsMode;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getSendFbAttribution() {
        return this.sendFbAttribution;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final String getSdkVersion() {
        return this.sdkVersion;
    }

    @NotNull
    public final PrimaryConfig copy(@NotNull String projectKey, @NotNull QLaunchMode launchMode, @NotNull QEnvironment environment, @Nullable String proxyUrl, boolean isKidsMode, boolean sendFbAttribution, @NotNull String sdkVersion) {
        AbstractC3340k.e(projectKey, "projectKey");
        AbstractC3340k.e(launchMode, "launchMode");
        AbstractC3340k.e(environment, "environment");
        AbstractC3340k.e(sdkVersion, "sdkVersion");
        return new PrimaryConfig(projectKey, launchMode, environment, proxyUrl, isKidsMode, sendFbAttribution, sdkVersion);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PrimaryConfig)) {
            return false;
        }
        PrimaryConfig primaryConfig = (PrimaryConfig) other;
        return AbstractC3340k.a(this.projectKey, primaryConfig.projectKey) && this.launchMode == primaryConfig.launchMode && this.environment == primaryConfig.environment && AbstractC3340k.a(this.proxyUrl, primaryConfig.proxyUrl) && this.isKidsMode == primaryConfig.isKidsMode && this.sendFbAttribution == primaryConfig.sendFbAttribution && AbstractC3340k.a(this.sdkVersion, primaryConfig.sdkVersion);
    }

    @NotNull
    public final QEnvironment getEnvironment() {
        return this.environment;
    }

    @NotNull
    public final QLaunchMode getLaunchMode() {
        return this.launchMode;
    }

    @NotNull
    public final String getProjectKey() {
        return this.projectKey;
    }

    @Nullable
    public final String getProxyUrl() {
        return this.proxyUrl;
    }

    @NotNull
    public final String getSdkVersion() {
        return this.sdkVersion;
    }

    public final boolean getSendFbAttribution() {
        return this.sendFbAttribution;
    }

    public int hashCode() {
        int iHashCode = (this.environment.hashCode() + ((this.launchMode.hashCode() + (this.projectKey.hashCode() * 31)) * 31)) * 31;
        String str = this.proxyUrl;
        return this.sdkVersion.hashCode() + ((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + (this.isKidsMode ? 1231 : 1237)) * 31) + (this.sendFbAttribution ? 1231 : 1237)) * 31);
    }

    public final boolean isKidsMode() {
        return this.isKidsMode;
    }

    @NotNull
    public String toString() {
        String str = this.projectKey;
        QLaunchMode qLaunchMode = this.launchMode;
        QEnvironment qEnvironment = this.environment;
        String str2 = this.proxyUrl;
        boolean z2 = this.isKidsMode;
        boolean z10 = this.sendFbAttribution;
        String str3 = this.sdkVersion;
        StringBuilder sb2 = new StringBuilder("PrimaryConfig(projectKey=");
        sb2.append(str);
        sb2.append(", launchMode=");
        sb2.append(qLaunchMode);
        sb2.append(", environment=");
        sb2.append(qEnvironment);
        sb2.append(", proxyUrl=");
        sb2.append(str2);
        sb2.append(", isKidsMode=");
        sb2.append(z2);
        sb2.append(", sendFbAttribution=");
        sb2.append(z10);
        sb2.append(", sdkVersion=");
        return b.c(sb2, str3, ")");
    }

    public /* synthetic */ PrimaryConfig(String str, QLaunchMode qLaunchMode, QEnvironment qEnvironment, String str2, boolean z2, boolean z10, String str3, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, qLaunchMode, qEnvironment, (i5 & 8) != 0 ? null : str2, (i5 & 16) != 0 ? false : z2, (i5 & 32) != 0 ? true : z10, (i5 & 64) != 0 ? BuildConfig.VERSION_NAME : str3);
    }
}
