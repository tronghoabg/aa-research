package com.qonversion.android.sdk.internal.dto.config;

import com.qonversion.android.sdk.dto.entitlements.QEntitlementsCacheLifetime;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\nJ$\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, d2 = {"Lcom/qonversion/android/sdk/internal/dto/config/CacheConfig;", "", "entitlementsCacheLifetime", "Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;", "fallbackFileIdentifier", "", "(Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;Ljava/lang/Integer;)V", "getEntitlementsCacheLifetime", "()Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;", "getFallbackFileIdentifier", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "copy", "(Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;Ljava/lang/Integer;)Lcom/qonversion/android/sdk/internal/dto/config/CacheConfig;", "equals", "", "other", "hashCode", "toString", "", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class CacheConfig {

    @NotNull
    private final QEntitlementsCacheLifetime entitlementsCacheLifetime;

    @Nullable
    private final Integer fallbackFileIdentifier;

    public CacheConfig(@NotNull QEntitlementsCacheLifetime entitlementsCacheLifetime, @Nullable Integer num) {
        AbstractC3340k.e(entitlementsCacheLifetime, "entitlementsCacheLifetime");
        this.entitlementsCacheLifetime = entitlementsCacheLifetime;
        this.fallbackFileIdentifier = num;
    }

    public static /* synthetic */ CacheConfig copy$default(CacheConfig cacheConfig, QEntitlementsCacheLifetime qEntitlementsCacheLifetime, Integer num, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            qEntitlementsCacheLifetime = cacheConfig.entitlementsCacheLifetime;
        }
        if ((i5 & 2) != 0) {
            num = cacheConfig.fallbackFileIdentifier;
        }
        return cacheConfig.copy(qEntitlementsCacheLifetime, num);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final QEntitlementsCacheLifetime getEntitlementsCacheLifetime() {
        return this.entitlementsCacheLifetime;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final Integer getFallbackFileIdentifier() {
        return this.fallbackFileIdentifier;
    }

    @NotNull
    public final CacheConfig copy(@NotNull QEntitlementsCacheLifetime entitlementsCacheLifetime, @Nullable Integer fallbackFileIdentifier) {
        AbstractC3340k.e(entitlementsCacheLifetime, "entitlementsCacheLifetime");
        return new CacheConfig(entitlementsCacheLifetime, fallbackFileIdentifier);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CacheConfig)) {
            return false;
        }
        CacheConfig cacheConfig = (CacheConfig) other;
        return this.entitlementsCacheLifetime == cacheConfig.entitlementsCacheLifetime && AbstractC3340k.a(this.fallbackFileIdentifier, cacheConfig.fallbackFileIdentifier);
    }

    @NotNull
    public final QEntitlementsCacheLifetime getEntitlementsCacheLifetime() {
        return this.entitlementsCacheLifetime;
    }

    @Nullable
    public final Integer getFallbackFileIdentifier() {
        return this.fallbackFileIdentifier;
    }

    public int hashCode() {
        int iHashCode = this.entitlementsCacheLifetime.hashCode() * 31;
        Integer num = this.fallbackFileIdentifier;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    @NotNull
    public String toString() {
        return "CacheConfig(entitlementsCacheLifetime=" + this.entitlementsCacheLifetime + ", fallbackFileIdentifier=" + this.fallbackFileIdentifier + ")";
    }
}
