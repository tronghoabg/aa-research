package com.waze.utils.a;

import androidx.compose.runtime.DisposableEffectResult;
import com.waze.shared_infra.s.d;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class b implements DisposableEffectResult {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ d f44825a;

    public b(d dVar) {
        this.f44825a = dVar;
    }

    @Override // androidx.compose.runtime.DisposableEffectResult
    public final void dispose() {
        this.f44825a.a();
    }
}
