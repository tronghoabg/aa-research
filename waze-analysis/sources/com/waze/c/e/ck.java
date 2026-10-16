package com.waze.c.e;

import androidx.compose.runtime.DisposableEffectResult;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ck implements DisposableEffectResult {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.waze.sharedui.d.b f18659a;

    public ck(com.waze.sharedui.d.b bVar) {
        this.f18659a = bVar;
    }

    @Override // androidx.compose.runtime.DisposableEffectResult
    public final void dispose() {
        this.f18659a.cancel();
    }
}
