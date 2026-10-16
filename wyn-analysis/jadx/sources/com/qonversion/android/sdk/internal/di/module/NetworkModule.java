package com.qonversion.android.sdk.internal.di.module;

import I9.a;
import android.app.Application;
import com.qonversion.android.sdk.internal.InternalConfig;
import com.qonversion.android.sdk.internal.api.ApiHeadersProvider;
import com.qonversion.android.sdk.internal.api.ApiHelper;
import com.qonversion.android.sdk.internal.api.NetworkInterceptor;
import com.qonversion.android.sdk.internal.api.RateLimiter;
import com.qonversion.android.sdk.internal.di.scope.ApplicationScope;
import com.qonversion.android.sdk.internal.dto.QDateAdapter;
import com.qonversion.android.sdk.internal.dto.QEligibilityAdapter;
import com.qonversion.android.sdk.internal.dto.QEligibilityStatusAdapter;
import com.qonversion.android.sdk.internal.dto.QEntitlementGrantTypeAdapter;
import com.qonversion.android.sdk.internal.dto.QEntitlementSourceAdapter;
import com.qonversion.android.sdk.internal.dto.QExperimentGroupTypeAdapter;
import com.qonversion.android.sdk.internal.dto.QOfferingAdapter;
import com.qonversion.android.sdk.internal.dto.QOfferingTagAdapter;
import com.qonversion.android.sdk.internal.dto.QOfferingsAdapter;
import com.qonversion.android.sdk.internal.dto.QPermissionsAdapter;
import com.qonversion.android.sdk.internal.dto.QProductRenewStateAdapter;
import com.qonversion.android.sdk.internal.dto.QProductsAdapter;
import com.qonversion.android.sdk.internal.dto.QRemoteConfigListAdapter;
import com.qonversion.android.sdk.internal.dto.QRemoteConfigurationSourceAssignmentTypeAdapter;
import com.qonversion.android.sdk.internal.dto.QRemoteConfigurationSourceTypeAdapter;
import com.qonversion.android.sdk.internal.dto.QTransactionEnvironmentAdapter;
import com.qonversion.android.sdk.internal.dto.QTransactionOwnershipTypeAdapter;
import com.qonversion.android.sdk.internal.dto.QTransactionTypeAdapter;
import hb.K;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import okhttp3.Cache;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import org.jetbrains.annotations.NotNull;
import zg.C4663b;
import zg.C4669h;
import zg.C4674m;
import zg.C4685y;
import zg.L;
import zg.T;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 !2\u00020\u0001:\u0001!B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u0018H\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u00182\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0007¢\u0006\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Lcom/qonversion/android/sdk/internal/di/module/NetworkModule;", "", "<init>", "()V", "Lokhttp3/OkHttpClient;", "client", "Lhb/K;", "moshi", "Lcom/qonversion/android/sdk/internal/InternalConfig;", "internalConfig", "Lzg/T;", "provideRetrofit", "(Lokhttp3/OkHttpClient;Lhb/K;Lcom/qonversion/android/sdk/internal/InternalConfig;)Lzg/T;", "provideMoshi", "()Lhb/K;", "Landroid/app/Application;", "context", "Lcom/qonversion/android/sdk/internal/api/NetworkInterceptor;", "interceptor", "provideOkHttpClient", "(Landroid/app/Application;Lcom/qonversion/android/sdk/internal/api/NetworkInterceptor;)Lokhttp3/OkHttpClient;", "Lcom/qonversion/android/sdk/internal/api/ApiHeadersProvider;", "apiHeadersProvider", "config", "Lcom/qonversion/android/sdk/internal/api/ApiHelper;", "apiHelper", "provideHeadersInterceptor", "(Lcom/qonversion/android/sdk/internal/api/ApiHeadersProvider;Lcom/qonversion/android/sdk/internal/InternalConfig;Lcom/qonversion/android/sdk/internal/api/ApiHelper;)Lcom/qonversion/android/sdk/internal/api/NetworkInterceptor;", "provideApiHelper", "(Lcom/qonversion/android/sdk/internal/InternalConfig;)Lcom/qonversion/android/sdk/internal/api/ApiHelper;", "Lcom/qonversion/android/sdk/internal/api/RateLimiter;", "provideRateLimiter", "()Lcom/qonversion/android/sdk/internal/api/RateLimiter;", "Companion", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class NetworkModule {
    private static final long CACHE_SIZE = 10485776;
    private static final int MAX_SIMILAR_API_REQUESTS_PER_SECOND = 5;
    private static final long TIMEOUT = 30;

    @ApplicationScope
    @NotNull
    public final ApiHelper provideApiHelper(@NotNull InternalConfig internalConfig) {
        AbstractC3340k.e(internalConfig, "internalConfig");
        return new ApiHelper(internalConfig.getApiUrl());
    }

    @ApplicationScope
    @NotNull
    public final NetworkInterceptor provideHeadersInterceptor(@NotNull ApiHeadersProvider apiHeadersProvider, @NotNull InternalConfig config, @NotNull ApiHelper apiHelper) {
        AbstractC3340k.e(apiHeadersProvider, "apiHeadersProvider");
        AbstractC3340k.e(config, "config");
        AbstractC3340k.e(apiHelper, "apiHelper");
        return new NetworkInterceptor(apiHeadersProvider, apiHelper, config);
    }

    @ApplicationScope
    @NotNull
    public final K provideMoshi() throws SecurityException {
        a aVar = new a(2);
        aVar.a(new QDateAdapter());
        aVar.a(new QProductsAdapter());
        aVar.a(new QPermissionsAdapter());
        aVar.a(new QProductRenewStateAdapter());
        aVar.a(new QEntitlementSourceAdapter());
        aVar.a(new QOfferingsAdapter());
        aVar.a(new QOfferingAdapter());
        aVar.a(new QOfferingTagAdapter());
        aVar.a(new QRemoteConfigListAdapter());
        aVar.a(new QExperimentGroupTypeAdapter());
        aVar.a(new QRemoteConfigurationSourceTypeAdapter());
        aVar.a(new QRemoteConfigurationSourceAssignmentTypeAdapter());
        aVar.a(new QEligibilityStatusAdapter());
        aVar.a(new QEligibilityAdapter());
        aVar.a(new QTransactionOwnershipTypeAdapter());
        aVar.a(new QTransactionTypeAdapter());
        aVar.a(new QTransactionEnvironmentAdapter());
        aVar.a(new QEntitlementGrantTypeAdapter());
        return new K(aVar);
    }

    @ApplicationScope
    @NotNull
    public final OkHttpClient provideOkHttpClient(@NotNull Application context, @NotNull NetworkInterceptor interceptor) {
        AbstractC3340k.e(context, "context");
        AbstractC3340k.e(interceptor, "interceptor");
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        builder.k = new Cache(context.getCacheDir(), CACHE_SIZE);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        builder.b(TIMEOUT, timeUnit);
        builder.a(TIMEOUT, timeUnit);
        builder.f42344c.add(interceptor);
        return new OkHttpClient(builder);
    }

    @ApplicationScope
    @NotNull
    public final RateLimiter provideRateLimiter() {
        return new RateLimiter(5);
    }

    @ApplicationScope
    @NotNull
    public final T provideRetrofit(@NotNull OkHttpClient client, @NotNull K moshi, @NotNull InternalConfig internalConfig) throws NumberFormatException, EOFException {
        AbstractC3340k.e(client, "client");
        AbstractC3340k.e(moshi, "moshi");
        AbstractC3340k.e(internalConfig, "internalConfig");
        L l10 = L.f48544c;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList.add(new Ag.a(moshi));
        String apiUrl = internalConfig.getApiUrl();
        Objects.requireNonNull(apiUrl, "baseUrl == null");
        HttpUrl.k.getClass();
        HttpUrl httpUrlC = HttpUrl.Companion.c(apiUrl);
        ArrayList arrayList3 = httpUrlC.f42278f;
        if (!"".equals(arrayList3.get(arrayList3.size() - 1))) {
            throw new IllegalArgumentException("baseUrl must end in /: " + httpUrlC);
        }
        Executor executorA = l10.a();
        ArrayList arrayList4 = new ArrayList(arrayList2);
        C4674m c4674m = new C4674m(executorA);
        boolean z2 = l10.f48545a;
        arrayList4.addAll(z2 ? Arrays.asList(C4669h.f48624a, c4674m) : Collections.singletonList(c4674m));
        ArrayList arrayList5 = new ArrayList(arrayList.size() + 1 + (z2 ? 1 : 0));
        C4663b c4663b = new C4663b();
        c4663b.f48622a = true;
        arrayList5.add(c4663b);
        arrayList5.addAll(arrayList);
        arrayList5.addAll(z2 ? Collections.singletonList(C4685y.f48656a) : Collections.EMPTY_LIST);
        return new T(client, httpUrlC, DesugarCollections.unmodifiableList(arrayList5), DesugarCollections.unmodifiableList(arrayList4), executorA);
    }
}
