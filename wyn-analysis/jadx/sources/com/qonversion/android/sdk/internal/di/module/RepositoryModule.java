package com.qonversion.android.sdk.internal.di.module;

import android.app.Application;
import android.content.SharedPreferences;
import com.qonversion.android.sdk.internal.EnvironmentProvider;
import com.qonversion.android.sdk.internal.IncrementalDelayCalculator;
import com.qonversion.android.sdk.internal.InternalConfig;
import com.qonversion.android.sdk.internal.api.Api;
import com.qonversion.android.sdk.internal.api.ApiErrorMapper;
import com.qonversion.android.sdk.internal.api.ApiHeadersProvider;
import com.qonversion.android.sdk.internal.api.ApiHelper;
import com.qonversion.android.sdk.internal.api.RateLimiter;
import com.qonversion.android.sdk.internal.di.scope.ApplicationScope;
import com.qonversion.android.sdk.internal.logger.Logger;
import com.qonversion.android.sdk.internal.repository.DefaultRepository;
import com.qonversion.android.sdk.internal.repository.QRepository;
import com.qonversion.android.sdk.internal.repository.RepositoryWithRateLimits;
import com.qonversion.android.sdk.internal.storage.SharedPreferencesCache;
import com.qonversion.android.sdk.internal.storage.TokenStorage;
import com.qonversion.android.sdk.internal.storage.UserPropertiesStorage;
import java.lang.reflect.Proxy;
import java.util.ArrayDeque;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;
import zg.S;
import zg.T;

@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003JG\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J?\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0018H\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020\u00062\u0006\u0010!\u001a\u00020 H\u0007¢\u0006\u0004\b\"\u0010#J'\u0010'\u001a\u00020&2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010%\u001a\u00020$2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b'\u0010(J\u0017\u0010+\u001a\u00020\f2\u0006\u0010*\u001a\u00020)H\u0007¢\u0006\u0004\b+\u0010,¨\u0006-"}, d2 = {"Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule;", "", "<init>", "()V", "Lzg/T;", "retrofit", "Lcom/qonversion/android/sdk/internal/EnvironmentProvider;", "environmentProvider", "Lcom/qonversion/android/sdk/internal/InternalConfig;", "config", "Lcom/qonversion/android/sdk/internal/logger/Logger;", "logger", "Lcom/qonversion/android/sdk/internal/api/ApiErrorMapper;", "apiErrorMapper", "Lcom/qonversion/android/sdk/internal/IncrementalDelayCalculator;", "delayCalculator", "Lcom/qonversion/android/sdk/internal/api/RateLimiter;", "rateLimiter", "Lcom/qonversion/android/sdk/internal/repository/QRepository;", "provideRepository", "(Lzg/T;Lcom/qonversion/android/sdk/internal/EnvironmentProvider;Lcom/qonversion/android/sdk/internal/InternalConfig;Lcom/qonversion/android/sdk/internal/logger/Logger;Lcom/qonversion/android/sdk/internal/api/ApiErrorMapper;Lcom/qonversion/android/sdk/internal/IncrementalDelayCalculator;Lcom/qonversion/android/sdk/internal/api/RateLimiter;)Lcom/qonversion/android/sdk/internal/repository/QRepository;", "Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;", "provideQonversionRepository", "(Lzg/T;Lcom/qonversion/android/sdk/internal/EnvironmentProvider;Lcom/qonversion/android/sdk/internal/InternalConfig;Lcom/qonversion/android/sdk/internal/logger/Logger;Lcom/qonversion/android/sdk/internal/api/ApiErrorMapper;Lcom/qonversion/android/sdk/internal/IncrementalDelayCalculator;)Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;", "Landroid/content/SharedPreferences;", "preferences", "Lcom/qonversion/android/sdk/internal/storage/TokenStorage;", "provideTokenStorage", "(Landroid/content/SharedPreferences;)Lcom/qonversion/android/sdk/internal/storage/TokenStorage;", "Lcom/qonversion/android/sdk/internal/storage/UserPropertiesStorage;", "providePropertiesStorage", "()Lcom/qonversion/android/sdk/internal/storage/UserPropertiesStorage;", "Landroid/app/Application;", "context", "provideEnvironment", "(Landroid/app/Application;)Lcom/qonversion/android/sdk/internal/EnvironmentProvider;", "Lcom/qonversion/android/sdk/internal/storage/SharedPreferencesCache;", "sharedPreferencesCache", "Lcom/qonversion/android/sdk/internal/api/ApiHeadersProvider;", "provideHeadersProvider", "(Lcom/qonversion/android/sdk/internal/InternalConfig;Lcom/qonversion/android/sdk/internal/storage/SharedPreferencesCache;Lcom/qonversion/android/sdk/internal/EnvironmentProvider;)Lcom/qonversion/android/sdk/internal/api/ApiHeadersProvider;", "Lcom/qonversion/android/sdk/internal/api/ApiHelper;", "apiHelper", "provideApiErrorMapper", "(Lcom/qonversion/android/sdk/internal/api/ApiHelper;)Lcom/qonversion/android/sdk/internal/api/ApiErrorMapper;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class RepositoryModule {
    @ApplicationScope
    @NotNull
    public final ApiErrorMapper provideApiErrorMapper(@NotNull ApiHelper apiHelper) {
        AbstractC3340k.e(apiHelper, "apiHelper");
        return new ApiErrorMapper(apiHelper);
    }

    @ApplicationScope
    @NotNull
    public final EnvironmentProvider provideEnvironment(@NotNull Application context) {
        AbstractC3340k.e(context, "context");
        return new EnvironmentProvider(context);
    }

    @ApplicationScope
    @NotNull
    public final ApiHeadersProvider provideHeadersProvider(@NotNull InternalConfig config, @NotNull SharedPreferencesCache sharedPreferencesCache, @NotNull EnvironmentProvider environmentProvider) {
        AbstractC3340k.e(config, "config");
        AbstractC3340k.e(sharedPreferencesCache, "sharedPreferencesCache");
        AbstractC3340k.e(environmentProvider, "environmentProvider");
        return new ApiHeadersProvider(config, sharedPreferencesCache, environmentProvider);
    }

    @ApplicationScope
    @NotNull
    public final UserPropertiesStorage providePropertiesStorage() {
        return new UserPropertiesStorage();
    }

    @ApplicationScope
    @NotNull
    public final DefaultRepository provideQonversionRepository(@NotNull T retrofit, @NotNull EnvironmentProvider environmentProvider, @NotNull InternalConfig config, @NotNull Logger logger, @NotNull ApiErrorMapper apiErrorMapper, @NotNull IncrementalDelayCalculator delayCalculator) throws IllegalArgumentException {
        AbstractC3340k.e(retrofit, "retrofit");
        AbstractC3340k.e(environmentProvider, "environmentProvider");
        AbstractC3340k.e(config, "config");
        AbstractC3340k.e(logger, "logger");
        AbstractC3340k.e(apiErrorMapper, "apiErrorMapper");
        AbstractC3340k.e(delayCalculator, "delayCalculator");
        if (!Api.class.isInterface()) {
            throw new IllegalArgumentException("API declarations must be interfaces.");
        }
        ArrayDeque arrayDeque = new ArrayDeque(1);
        arrayDeque.add(Api.class);
        while (!arrayDeque.isEmpty()) {
            Class cls = (Class) arrayDeque.removeFirst();
            if (cls.getTypeParameters().length != 0) {
                StringBuilder sb2 = new StringBuilder("Type parameters are unsupported on ");
                sb2.append(cls.getName());
                if (cls != Api.class) {
                    sb2.append(" which is an interface of ");
                    sb2.append(Api.class.getName());
                }
                throw new IllegalArgumentException(sb2.toString());
            }
            Collections.addAll(arrayDeque, cls.getInterfaces());
        }
        Object objNewProxyInstance = Proxy.newProxyInstance(Api.class.getClassLoader(), new Class[]{Api.class}, new S(retrofit));
        AbstractC3340k.d(objNewProxyInstance, "create(...)");
        return new DefaultRepository((Api) objNewProxyInstance, environmentProvider, config, logger, apiErrorMapper, delayCalculator);
    }

    @ApplicationScope
    @NotNull
    public final QRepository provideRepository(@NotNull T retrofit, @NotNull EnvironmentProvider environmentProvider, @NotNull InternalConfig config, @NotNull Logger logger, @NotNull ApiErrorMapper apiErrorMapper, @NotNull IncrementalDelayCalculator delayCalculator, @NotNull RateLimiter rateLimiter) {
        AbstractC3340k.e(retrofit, "retrofit");
        AbstractC3340k.e(environmentProvider, "environmentProvider");
        AbstractC3340k.e(config, "config");
        AbstractC3340k.e(logger, "logger");
        AbstractC3340k.e(apiErrorMapper, "apiErrorMapper");
        AbstractC3340k.e(delayCalculator, "delayCalculator");
        AbstractC3340k.e(rateLimiter, "rateLimiter");
        return new RepositoryWithRateLimits(provideQonversionRepository(retrofit, environmentProvider, config, logger, apiErrorMapper, delayCalculator), rateLimiter);
    }

    @ApplicationScope
    @NotNull
    public final TokenStorage provideTokenStorage(@NotNull SharedPreferences preferences) {
        AbstractC3340k.e(preferences, "preferences");
        return new TokenStorage(preferences);
    }
}
