package com.waze.settings.a.a.b;

import androidx.compose.runtime.DisposableEffectResult;
import h.g.b.aq;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class c implements DisposableEffectResult {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ aq f36726a;

    public c(aq aqVar) {
        this.f36726a = aqVar;
    }

    @Override // androidx.compose.runtime.DisposableEffectResult
    public final void dispose() {
        com.waze.shared_infra.s.d dVar = (com.waze.shared_infra.s.d) this.f36726a.f48105a;
        if (dVar != null) {
            dVar.a();
        }
    }
}
