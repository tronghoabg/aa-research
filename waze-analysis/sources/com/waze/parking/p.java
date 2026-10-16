package com.waze.parking;

import androidx.compose.runtime.DisposableEffectResult;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class p implements DisposableEffectResult {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.waze.ab.v f32984a;

    public p(com.waze.ab.v vVar) {
        this.f32984a = vVar;
    }

    @Override // androidx.compose.runtime.DisposableEffectResult
    public final void dispose() {
        this.f32984a.dismiss();
    }
}
