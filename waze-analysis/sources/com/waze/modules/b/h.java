package com.waze.modules.b;

import com.waze.network.d.q;
import com.waze.network.d.r;
import com.waze.network.d.t;
import e.a.dt;
import e.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    private final e.a.i f29825a;

    /* renamed from: b, reason: collision with root package name */
    private final e.a.i f29826b;

    public h(d dVar, r rVar, l lVar, e.a.e eVar, com.waze.shared_infra.i.e eVar2) {
        x.f(dVar, "transportProvider");
        x.f(rVar, "grpcMetadataProvider");
        x.f(lVar, "retryInterceptor");
        x.f(eVar, "callCredentials");
        x.f(eVar2, "logger");
        this.f29825a = dt.r(dVar.b(), new t(eVar2), new q(rVar, true, eVar2), lVar);
        this.f29826b = new g(this, eVar);
    }

    public final e.a.i b() {
        return this.f29826b;
    }
}
