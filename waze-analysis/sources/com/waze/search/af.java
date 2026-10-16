package com.waze.search;

import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.State;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class af implements DisposableEffectResult {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ int f35504a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ State f35505b;

    public af(int i2, State state) {
        this.f35504a = i2;
        this.f35505b = state;
    }

    @Override // androidx.compose.runtime.DisposableEffectResult
    public final void dispose() {
        ai.p(this.f35505b).invoke(com.waze.z.a.ae.f45619a, Integer.valueOf(this.f35504a));
    }
}
