package com.waze.modules.b;

import com.waze.network.d.q;
import com.waze.network.d.r;
import com.waze.network.d.t;
import e.a.dt;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    private final e.a.i f29827a;

    public i(d dVar, r rVar, com.waze.shared_infra.i.e eVar) {
        x.f(dVar, "transportProvider");
        x.f(rVar, "grpcMetadataProvider");
        x.f(eVar, "logger");
        e.a.i iVarR = dt.r(dVar.b(), new t(eVar), new q(rVar, false, eVar));
        x.e(iVarR, "intercept(...)");
        this.f29827a = iVarR;
    }

    public final e.a.i a() {
        return this.f29827a;
    }
}
