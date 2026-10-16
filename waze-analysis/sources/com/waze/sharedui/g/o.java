package com.waze.sharedui.g;

import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import h.g.b.x;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class o implements DefaultLifecycleObserver {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.waze.sharedui.d.a.d f38989a;

    o(p pVar, com.waze.sharedui.d.a.d dVar) {
        this.f38989a = dVar;
        Objects.requireNonNull(pVar);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
        x.f(lifecycleOwner, "owner");
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onDestroy(LifecycleOwner lifecycleOwner) {
        x.f(lifecycleOwner, "owner");
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onPause(LifecycleOwner lifecycleOwner) {
        com.waze.sharedui.d.a.d dVar = this.f38989a;
        if (dVar.isShowing()) {
            dVar.cancel();
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onResume(LifecycleOwner lifecycleOwner) {
        x.f(lifecycleOwner, "owner");
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onStart(LifecycleOwner lifecycleOwner) {
        x.f(lifecycleOwner, "owner");
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onStop(LifecycleOwner lifecycleOwner) {
        x.f(lifecycleOwner, "owner");
    }
}
