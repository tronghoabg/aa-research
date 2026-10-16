package com.waze.search.f;

import androidx.compose.runtime.DisposableEffectResult;
import h.g.b.aq;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class n implements DisposableEffectResult {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ aq f35737a;

    public n(aq aqVar) {
        this.f35737a = aqVar;
    }

    @Override // androidx.compose.runtime.DisposableEffectResult
    public final void dispose() {
        com.waze.shared_infra.s.d dVar = (com.waze.shared_infra.s.d) this.f35737a.f48105a;
        if (dVar != null) {
            dVar.a();
        }
    }
}
