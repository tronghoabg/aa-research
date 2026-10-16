package com.waze.perf.tracer;

import androidx.autofill.HintConstants;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class c implements g {
    public c(com.google.firebase.perf.d dVar) {
        x.f(dVar, "firebasePerformance");
    }

    @Override // com.waze.perf.tracer.g
    public final f a(String str) {
        x.f(str, HintConstants.AUTOFILL_HINT_NAME);
        return new b(str);
    }
}
