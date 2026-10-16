package com.waze.perf.tracer;

import androidx.autofill.HintConstants;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class e implements g {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f33073a;

    public e(com.waze.shared_infra.i.e eVar) {
        x.f(eVar, "logger");
        this.f33073a = eVar;
    }

    @Override // com.waze.perf.tracer.g
    public final f a(String str) {
        x.f(str, HintConstants.AUTOFILL_HINT_NAME);
        return new d(this, str);
    }

    public final com.waze.shared_infra.i.e b() {
        return this.f33073a;
    }
}
