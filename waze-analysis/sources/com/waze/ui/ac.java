package com.waze.ui;

import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.MutableState;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ac implements DisposableEffectResult {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ MutableState f41755a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ h.g.a.a f41756b;

    public ac(MutableState mutableState, h.g.a.a aVar) {
        this.f41755a = mutableState;
        this.f41756b = aVar;
    }

    @Override // androidx.compose.runtime.DisposableEffectResult
    public final void dispose() {
        this.f41755a.setValue(false);
        this.f41756b.invoke();
    }
}
