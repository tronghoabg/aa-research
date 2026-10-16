package com.qonversion.android.sdk.internal.api;

import Bf.r;
import R8.v;
import android.os.Build;
import com.qonversion.android.sdk.internal.EnvironmentProvider;
import com.qonversion.android.sdk.internal.InternalConfig;
import com.qonversion.android.sdk.internal.storage.SharedPreferencesCache;
import ef.C2527k;
import ff.AbstractC2640A;
import j$.util.DesugarCollections;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.Headers;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\t\b\u0000\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fJ\u001c\u0010\u000e\u001a\u0016\u0012\u0004\u0012\u00020\n\u0012\f\u0012\n \u0010*\u0004\u0018\u00010\n0\n0\u000fH\u0002J\u0010\u0010\u0011\u001a\n \u0010*\u0004\u0018\u00010\n0\nH\u0002J\u0006\u0010\u0012\u001a\u00020\nJ\u0006\u0010\u0013\u001a\u00020\nJ\u0006\u0010\u0014\u001a\u00020\nJ\u0006\u0010\u0015\u001a\u00020\nJ\u0006\u0010\u0016\u001a\u00020\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/qonversion/android/sdk/internal/api/ApiHeadersProvider;", "", "config", "Lcom/qonversion/android/sdk/internal/InternalConfig;", "sharedPreferencesCache", "Lcom/qonversion/android/sdk/internal/storage/SharedPreferencesCache;", "environmentProvider", "Lcom/qonversion/android/sdk/internal/EnvironmentProvider;", "(Lcom/qonversion/android/sdk/internal/InternalConfig;Lcom/qonversion/android/sdk/internal/storage/SharedPreferencesCache;Lcom/qonversion/android/sdk/internal/EnvironmentProvider;)V", "projectKey", "", "getHeaders", "Lokhttp3/Headers;", "specificHeaders", "getHeadersMap", "", "kotlin.jvm.PlatformType", "getLocale", "getPlatform", "getPlatformVersion", "getProjectKey", "getSource", "getSourceVersion", "Companion", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ApiHeadersProvider {

    @NotNull
    public static final String ANDROID_PLATFORM = "android";

    @NotNull
    public static final String APP_VERSION = "app-version";

    @NotNull
    public static final String AUTHORIZATION = "Authorization";

    @NotNull
    public static final String CONTENT_TYPE = "Content-Type";

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String DEBUG_MODE_KEY = "test_";

    @NotNull
    public static final String PLATFORM = "Platform";

    @NotNull
    public static final String PLATFORM_VERSION = "Platform-Version";

    @NotNull
    public static final String PREFS_SOURCE_KEY = "com.qonversion.keys.source";

    @NotNull
    public static final String PREFS_SOURCE_VERSION_KEY = "com.qonversion.keys.sourceVersion";

    @NotNull
    public static final String SOURCE = "Source";

    @NotNull
    public static final String SOURCE_VERSION = "Source-Version";

    @NotNull
    public static final String UID = "User-Id";

    @NotNull
    public static final String USER_LOCALE = "User-Locale";

    @NotNull
    private final InternalConfig config;

    @NotNull
    private final EnvironmentProvider environmentProvider;

    @NotNull
    private final String projectKey;

    @NotNull
    private final SharedPreferencesCache sharedPreferencesCache;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/qonversion/android/sdk/internal/api/ApiHeadersProvider$Companion;", "", "()V", "ANDROID_PLATFORM", "", "APP_VERSION", "AUTHORIZATION", "CONTENT_TYPE", "DEBUG_MODE_KEY", "PLATFORM", "PLATFORM_VERSION", "PREFS_SOURCE_KEY", "PREFS_SOURCE_VERSION_KEY", "SOURCE", "SOURCE_VERSION", "UID", "USER_LOCALE", "getBearer", "projectKey", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String getBearer(@NotNull String projectKey) {
            AbstractC3340k.e(projectKey, "projectKey");
            return "Bearer ".concat(projectKey);
        }

        private Companion() {
        }
    }

    public ApiHeadersProvider(@NotNull InternalConfig config, @NotNull SharedPreferencesCache sharedPreferencesCache, @NotNull EnvironmentProvider environmentProvider) {
        AbstractC3340k.e(config, "config");
        AbstractC3340k.e(sharedPreferencesCache, "sharedPreferencesCache");
        AbstractC3340k.e(environmentProvider, "environmentProvider");
        this.config = config;
        this.sharedPreferencesCache = sharedPreferencesCache;
        this.environmentProvider = environmentProvider;
        this.projectKey = config.isSandbox() ? v.f(DEBUG_MODE_KEY, config.getPrimaryConfig().getProjectKey()) : config.getPrimaryConfig().getProjectKey();
    }

    private final Map<String, String> getHeadersMap() {
        return AbstractC2640A.R(new C2527k("Content-Type", "application/json"), new C2527k(AUTHORIZATION, INSTANCE.getBearer(getProjectKey())), new C2527k(APP_VERSION, this.environmentProvider.getVersionName()), new C2527k(USER_LOCALE, getLocale()), new C2527k(SOURCE, getSource()), new C2527k(SOURCE_VERSION, getSourceVersion()), new C2527k(PLATFORM, getPlatform()), new C2527k(PLATFORM_VERSION, getPlatformVersion()), new C2527k(UID, this.config.getUid()));
    }

    private final String getLocale() {
        return Locale.getDefault().getLanguage();
    }

    @NotNull
    public final Headers getHeaders(@NotNull Headers specificHeaders) {
        AbstractC3340k.e(specificHeaders, "specificHeaders");
        Headers.Builder builder = new Headers.Builder();
        for (Map.Entry<String, String> entry : getHeadersMap().entrySet()) {
            builder.a(entry.getKey(), entry.getValue());
        }
        r.d0();
        TreeSet treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
        int size = specificHeaders.size();
        for (int i5 = 0; i5 < size; i5++) {
            treeSet.add(specificHeaders.c(i5));
        }
        Set<String> setUnmodifiableSet = DesugarCollections.unmodifiableSet(treeSet);
        AbstractC3340k.d(setUnmodifiableSet, "unmodifiableSet(result)");
        for (String str : setUnmodifiableSet) {
            String strA = specificHeaders.a(str);
            if (strA != null) {
                builder.a(str, strA);
            }
        }
        return builder.d();
    }

    @NotNull
    public final String getPlatform() {
        return "android";
    }

    @NotNull
    public final String getPlatformVersion() {
        String RELEASE = Build.VERSION.RELEASE;
        AbstractC3340k.d(RELEASE, "RELEASE");
        return RELEASE;
    }

    @NotNull
    public final String getProjectKey() {
        return this.projectKey;
    }

    @NotNull
    public final String getSource() {
        String string = this.sharedPreferencesCache.getString(PREFS_SOURCE_KEY, null);
        return string == null ? "android" : string;
    }

    @NotNull
    public final String getSourceVersion() {
        String string = this.sharedPreferencesCache.getString(PREFS_SOURCE_VERSION_KEY, null);
        return string == null ? this.config.getPrimaryConfig().getSdkVersion() : string;
    }
}
