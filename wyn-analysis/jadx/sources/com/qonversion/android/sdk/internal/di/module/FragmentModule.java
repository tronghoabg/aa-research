package com.qonversion.android.sdk.internal.di.module;

import com.qonversion.android.sdk.automations.internal.macros.ScreenProcessor;
import com.qonversion.android.sdk.automations.mvp.ScreenContract;
import com.qonversion.android.sdk.internal.di.scope.ActivityScope;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0007J\b\u0010\u0007\u001a\u00020\u0003H\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/qonversion/android/sdk/internal/di/module/FragmentModule;", "", "view", "Lcom/qonversion/android/sdk/automations/mvp/ScreenContract$View;", "(Lcom/qonversion/android/sdk/automations/mvp/ScreenContract$View;)V", "provideScreenProcessor", "Lcom/qonversion/android/sdk/automations/internal/macros/ScreenProcessor;", "provideScreenView", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class FragmentModule {

    @NotNull
    private final ScreenContract.View view;

    public FragmentModule(@NotNull ScreenContract.View view) {
        AbstractC3340k.e(view, "view");
        this.view = view;
    }

    @ActivityScope
    @NotNull
    public final ScreenProcessor provideScreenProcessor() {
        return new ScreenProcessor();
    }

    @ActivityScope
    @NotNull
    /* renamed from: provideScreenView, reason: from getter */
    public final ScreenContract.View getView() {
        return this.view;
    }
}
