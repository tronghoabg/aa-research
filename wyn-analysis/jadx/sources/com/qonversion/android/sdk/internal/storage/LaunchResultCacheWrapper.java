package com.qonversion.android.sdk.internal.storage;

import Fe.c;
import com.qonversion.android.sdk.dto.QFallbackObject;
import com.qonversion.android.sdk.dto.offerings.QOfferings;
import com.qonversion.android.sdk.dto.products.QProduct;
import com.qonversion.android.sdk.internal.ExtensionsKt;
import com.qonversion.android.sdk.internal.UtilsKt;
import com.qonversion.android.sdk.internal.dto.QLaunchResult;
import com.qonversion.android.sdk.internal.dto.QPermission;
import com.qonversion.android.sdk.internal.provider.CacheConfigProvider;
import com.qonversion.android.sdk.internal.services.QFallbacksService;
import ef.InterfaceC2525i;
import hb.K;
import hb.P;
import hb.r;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0011\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0016\u001a\u00020\u00152\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000fH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u001cH\u0002¢\u0006\u0004\b \u0010!J\u001b\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000f¢\u0006\u0004\b\"\u0010\u0013J\r\u0010#\u001a\u00020\u0015¢\u0006\u0004\b#\u0010$J\r\u0010%\u001a\u00020\u0015¢\u0006\u0004\b%\u0010$J\u001b\u0010'\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020&\u0018\u00010\u000f¢\u0006\u0004\b'\u0010\u0013J!\u0010)\u001a\u0016\u0012\u0004\u0012\u00020\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100(\u0018\u00010\u000f¢\u0006\u0004\b)\u0010\u0013J\u000f\u0010+\u001a\u0004\u0018\u00010*¢\u0006\u0004\b+\u0010,J\u0015\u0010.\u001a\u00020\u00152\u0006\u0010-\u001a\u00020\f¢\u0006\u0004\b.\u0010/J!\u00100\u001a\u00020\u00152\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000f¢\u0006\u0004\b0\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00101R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00102R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00103R\u001a\u00105\u001a\b\u0012\u0004\u0012\u00020\f048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u001d\u0010<\u001a\u0004\u0018\u0001078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R&\u0010=\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000f048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u00106R(\u0010?\u001a\u0004\u0018\u00010\f2\b\u0010>\u001a\u0004\u0018\u00010\f8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010\u000eR$\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010B¨\u0006C"}, d2 = {"Lcom/qonversion/android/sdk/internal/storage/LaunchResultCacheWrapper;", "", "Lhb/K;", "moshi", "Lcom/qonversion/android/sdk/internal/storage/SharedPreferencesCache;", "cache", "Lcom/qonversion/android/sdk/internal/provider/CacheConfigProvider;", "cacheConfigProvider", "Lcom/qonversion/android/sdk/internal/services/QFallbacksService;", "fallbacksService", "<init>", "(Lhb/K;Lcom/qonversion/android/sdk/internal/storage/SharedPreferencesCache;Lcom/qonversion/android/sdk/internal/provider/CacheConfigProvider;Lcom/qonversion/android/sdk/internal/services/QFallbacksService;)V", "Lcom/qonversion/android/sdk/internal/dto/QLaunchResult;", "getLaunchResult", "()Lcom/qonversion/android/sdk/internal/dto/QLaunchResult;", "", "", "Lcom/qonversion/android/sdk/internal/dto/QPermission;", "getPermissions", "()Ljava/util/Map;", "permissions", "Lef/C;", "savePermissions", "(Ljava/util/Map;)V", "", "isPermissionsCacheOutdated", "()Z", "timeKey", "", "lifetimeSec", "isCacheOutdated", "(Ljava/lang/String;J)Z", "getCurrentTimeInSec", "()J", "getActualPermissions", "resetSessionCache", "()V", "clearPermissionsCache", "Lcom/qonversion/android/sdk/dto/products/QProduct;", "getActualProducts", "", "getProductPermissions", "Lcom/qonversion/android/sdk/dto/offerings/QOfferings;", "getActualOfferings", "()Lcom/qonversion/android/sdk/dto/offerings/QOfferings;", "launchResult", "save", "(Lcom/qonversion/android/sdk/internal/dto/QLaunchResult;)V", "updatePermissions", "Lcom/qonversion/android/sdk/internal/storage/SharedPreferencesCache;", "Lcom/qonversion/android/sdk/internal/provider/CacheConfigProvider;", "Lcom/qonversion/android/sdk/internal/services/QFallbacksService;", "Lhb/r;", "launchResultAdapter", "Lhb/r;", "Lcom/qonversion/android/sdk/dto/QFallbackObject;", "fallbackData$delegate", "Lef/i;", "getFallbackData", "()Lcom/qonversion/android/sdk/dto/QFallbackObject;", "fallbackData", "permissionsAdapter", "<set-?>", "sessionLaunchResult", "Lcom/qonversion/android/sdk/internal/dto/QLaunchResult;", "getSessionLaunchResult", "Ljava/util/Map;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class LaunchResultCacheWrapper {

    @NotNull
    private final SharedPreferencesCache cache;

    @NotNull
    private final CacheConfigProvider cacheConfigProvider;

    /* renamed from: fallbackData$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC2525i fallbackData;

    @NotNull
    private final QFallbacksService fallbacksService;

    @NotNull
    private final r launchResultAdapter;

    @Nullable
    private Map<String, QPermission> permissions;

    @NotNull
    private final r permissionsAdapter;

    @Nullable
    private QLaunchResult sessionLaunchResult;

    public LaunchResultCacheWrapper(@NotNull K moshi, @NotNull SharedPreferencesCache cache, @NotNull CacheConfigProvider cacheConfigProvider, @NotNull QFallbacksService fallbacksService) {
        AbstractC3340k.e(moshi, "moshi");
        AbstractC3340k.e(cache, "cache");
        AbstractC3340k.e(cacheConfigProvider, "cacheConfigProvider");
        AbstractC3340k.e(fallbacksService, "fallbacksService");
        this.cache = cache;
        this.cacheConfigProvider = cacheConfigProvider;
        this.fallbacksService = fallbacksService;
        this.launchResultAdapter = moshi.a(QLaunchResult.class);
        this.fallbackData = c.z(new LaunchResultCacheWrapper$fallbackData$2(this));
        r rVarB = moshi.b(P.f(Map.class, String.class, QPermission.class));
        AbstractC3340k.d(rVarB, "adapter(...)");
        this.permissionsAdapter = rVarB;
    }

    private final long getCurrentTimeInSec() {
        return ExtensionsKt.milliSecondsToSeconds(System.currentTimeMillis());
    }

    private final QFallbackObject getFallbackData() {
        return (QFallbackObject) this.fallbackData.getValue();
    }

    private final QLaunchResult getLaunchResult() {
        QLaunchResult qLaunchResult = this.sessionLaunchResult;
        return qLaunchResult == null ? (QLaunchResult) this.cache.getObject("launchResult", this.launchResultAdapter) : qLaunchResult;
    }

    private final Map<String, QPermission> getPermissions() {
        if (this.permissions == null) {
            this.permissions = (Map) this.cache.getObject("last_loaded_permissions", this.permissionsAdapter);
        }
        return this.permissions;
    }

    private final boolean isCacheOutdated(String timeKey, long lifetimeSec) {
        return getCurrentTimeInSec() - this.cache.getLong(timeKey, 0L) >= lifetimeSec;
    }

    private final boolean isPermissionsCacheOutdated() {
        return isCacheOutdated("permissions_timestamp", UtilsKt.getDaysToSeconds(this.cacheConfigProvider.getCacheConfig().getEntitlementsCacheLifetime().getDays()));
    }

    private final void savePermissions(Map<String, QPermission> permissions) {
        this.permissions = permissions;
        this.cache.putObject("last_loaded_permissions", permissions, this.permissionsAdapter);
        this.cache.putLong("permissions_timestamp", getCurrentTimeInSec());
    }

    public final void clearPermissionsCache() {
        this.permissions = null;
        this.cache.remove("last_loaded_permissions");
    }

    @Nullable
    public final QOfferings getActualOfferings() {
        QOfferings offerings;
        QLaunchResult launchResult = getLaunchResult();
        if (launchResult != null && (offerings = launchResult.getOfferings()) != null) {
            return offerings;
        }
        QFallbackObject fallbackData = getFallbackData();
        if (fallbackData != null) {
            return fallbackData.getOfferings();
        }
        return null;
    }

    @Nullable
    public final Map<String, QPermission> getActualPermissions() {
        Map<String, QPermission> map = this.permissions;
        if (map != null) {
            return map;
        }
        if (isPermissionsCacheOutdated()) {
            return null;
        }
        return getPermissions();
    }

    @Nullable
    public final Map<String, QProduct> getActualProducts() {
        Map<String, QProduct> products;
        QLaunchResult launchResult = getLaunchResult();
        if (launchResult != null && (products = launchResult.getProducts()) != null) {
            return products;
        }
        QFallbackObject fallbackData = getFallbackData();
        if (fallbackData != null) {
            return fallbackData.getProducts();
        }
        return null;
    }

    @Nullable
    public final Map<String, List<String>> getProductPermissions() {
        Map<String, List<String>> productPermissions$sdk_release;
        QLaunchResult launchResult = getLaunchResult();
        if (launchResult != null && (productPermissions$sdk_release = launchResult.getProductPermissions$sdk_release()) != null) {
            return productPermissions$sdk_release;
        }
        QFallbackObject fallbackData = getFallbackData();
        if (fallbackData != null) {
            return fallbackData.getProductPermissions();
        }
        return null;
    }

    @Nullable
    public final QLaunchResult getSessionLaunchResult() {
        return this.sessionLaunchResult;
    }

    public final void resetSessionCache() {
        this.sessionLaunchResult = null;
        this.permissions = null;
    }

    public final void save(@NotNull QLaunchResult launchResult) {
        AbstractC3340k.e(launchResult, "launchResult");
        this.sessionLaunchResult = launchResult;
        this.cache.putObject("launchResult", launchResult, this.launchResultAdapter);
        this.cache.putLong("timestamp", getCurrentTimeInSec());
        this.permissions = launchResult.getPermissions$sdk_release();
        savePermissions(launchResult.getPermissions$sdk_release());
    }

    public final void updatePermissions(@NotNull Map<String, QPermission> permissions) {
        AbstractC3340k.e(permissions, "permissions");
        savePermissions(permissions);
    }
}
