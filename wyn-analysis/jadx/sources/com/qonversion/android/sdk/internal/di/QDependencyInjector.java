package com.qonversion.android.sdk.internal.di;

import android.app.Application;
import com.qonversion.android.sdk.internal.InternalConfig;
import com.qonversion.android.sdk.internal.di.component.AppComponent;
import com.qonversion.android.sdk.internal.di.component.DaggerAppComponent;
import com.qonversion.android.sdk.internal.di.module.AppModule;
import com.qonversion.android.sdk.internal.di.module.ManagersModule;
import com.qonversion.android.sdk.internal.di.module.RepositoryModule;
import com.qonversion.android.sdk.internal.provider.AppStateProvider;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J%\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0000¢\u0006\u0002\b\u000fR\u001e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@BX\u0080.¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/qonversion/android/sdk/internal/di/QDependencyInjector;", "", "()V", "<set-?>", "Lcom/qonversion/android/sdk/internal/di/component/AppComponent;", "appComponent", "getAppComponent$sdk_release", "()Lcom/qonversion/android/sdk/internal/di/component/AppComponent;", "buildAppComponent", "context", "Landroid/app/Application;", "internalConfig", "Lcom/qonversion/android/sdk/internal/InternalConfig;", "appStateProvider", "Lcom/qonversion/android/sdk/internal/provider/AppStateProvider;", "buildAppComponent$sdk_release", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class QDependencyInjector {

    @NotNull
    public static final QDependencyInjector INSTANCE = new QDependencyInjector();
    private static AppComponent appComponent;

    private QDependencyInjector() {
    }

    @NotNull
    public final AppComponent buildAppComponent$sdk_release(@NotNull Application context, @NotNull InternalConfig internalConfig, @NotNull AppStateProvider appStateProvider) {
        AbstractC3340k.e(context, "context");
        AbstractC3340k.e(internalConfig, "internalConfig");
        AbstractC3340k.e(appStateProvider, "appStateProvider");
        AppComponent appComponentBuild = DaggerAppComponent.builder().appModule(new AppModule(context, internalConfig, appStateProvider)).repositoryModule(new RepositoryModule()).managersModule(new ManagersModule()).build();
        AbstractC3340k.d(appComponentBuild, "build(...)");
        appComponent = appComponentBuild;
        return getAppComponent$sdk_release();
    }

    @NotNull
    public final AppComponent getAppComponent$sdk_release() {
        AppComponent appComponent2 = appComponent;
        if (appComponent2 != null) {
            return appComponent2;
        }
        AbstractC3340k.m("appComponent");
        throw null;
    }
}
