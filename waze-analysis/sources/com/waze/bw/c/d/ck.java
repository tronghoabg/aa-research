package com.waze.bw.c.d;

import androidx.compose.runtime.DisposableEffectResult;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ck implements DisposableEffectResult {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ LifecycleOwner f18036a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ LifecycleEventObserver f18037b;

    public ck(LifecycleOwner lifecycleOwner, LifecycleEventObserver lifecycleEventObserver) {
        this.f18036a = lifecycleOwner;
        this.f18037b = lifecycleEventObserver;
    }

    @Override // androidx.compose.runtime.DisposableEffectResult
    public final void dispose() {
        this.f18036a.getLifecycle().removeObserver(this.f18037b);
    }
}
