package com.qonversion.android.sdk.internal;

import Va.M6;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.InterfaceC1457v;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\f¨\u0006\r"}, d2 = {"Lcom/qonversion/android/sdk/internal/AppLifecycleHandler;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "Lcom/qonversion/android/sdk/internal/LifecycleDelegate;", "lifecycleDelegate", "<init>", "(Lcom/qonversion/android/sdk/internal/LifecycleDelegate;)V", "Landroidx/lifecycle/v;", "owner", "Lef/C;", "onStart", "(Landroidx/lifecycle/v;)V", "onStop", "Lcom/qonversion/android/sdk/internal/LifecycleDelegate;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AppLifecycleHandler implements DefaultLifecycleObserver {

    @NotNull
    private final LifecycleDelegate lifecycleDelegate;

    public AppLifecycleHandler(@NotNull LifecycleDelegate lifecycleDelegate) {
        AbstractC3340k.e(lifecycleDelegate, "lifecycleDelegate");
        this.lifecycleDelegate = lifecycleDelegate;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* bridge */ /* synthetic */ void onCreate(@NotNull InterfaceC1457v interfaceC1457v) {
        M6.c(interfaceC1457v);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onDestroy(@NotNull InterfaceC1457v owner) {
        AbstractC3340k.e(owner, "owner");
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onPause(@NotNull InterfaceC1457v owner) {
        AbstractC3340k.e(owner, "owner");
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* bridge */ /* synthetic */ void onResume(@NotNull InterfaceC1457v interfaceC1457v) {
        M6.d(interfaceC1457v);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStart(@NotNull InterfaceC1457v owner) {
        AbstractC3340k.e(owner, "owner");
        this.lifecycleDelegate.onAppForeground();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStop(@NotNull InterfaceC1457v owner) {
        AbstractC3340k.e(owner, "owner");
        this.lifecycleDelegate.onAppBackground();
    }
}
