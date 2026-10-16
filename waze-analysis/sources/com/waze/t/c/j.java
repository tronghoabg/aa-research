package com.waze.t.c;

import androidx.compose.runtime.DisposableEffectResult;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class j implements DisposableEffectResult {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ LifecycleOwner f40862a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ LifecycleEventObserver f40863b;

    public j(LifecycleOwner lifecycleOwner, LifecycleEventObserver lifecycleEventObserver) {
        this.f40862a = lifecycleOwner;
        this.f40863b = lifecycleEventObserver;
    }

    @Override // androidx.compose.runtime.DisposableEffectResult
    public final void dispose() {
        this.f40862a.getLifecycle().removeObserver(this.f40863b);
    }
}
