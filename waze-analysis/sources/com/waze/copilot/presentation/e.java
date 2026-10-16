package com.waze.copilot.presentation;

import androidx.compose.runtime.DisposableEffectResult;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class e implements DisposableEffectResult {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.waze.shared_infra.s.d f23114a;

    public e(com.waze.shared_infra.s.d dVar) {
        this.f23114a = dVar;
    }

    @Override // androidx.compose.runtime.DisposableEffectResult
    public final void dispose() {
        com.waze.shared_infra.s.d dVar = this.f23114a;
        if (dVar != null) {
            dVar.a();
        }
    }
}
