package com.waze.network.d;

import e.a.cq;
import h.ab;
import h.g.b.x;
import kotlinx.coroutines.aj;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class e implements e.a.l {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.authentication.i f32187a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f32188b;

    public e(com.waze.authentication.i iVar, com.waze.shared_infra.i.e eVar) {
        x.f(iVar, "authenticationRepository");
        x.f(eVar, "logger");
        this.f32187a = iVar;
        this.f32188b = eVar;
    }

    static final ab c(com.waze.authentication.a aVar, e eVar) {
        if (aVar != null) {
            eVar.f32188b.e("About to revoke access token");
            aj.t(h.c.k.f48060a, new j(eVar, aVar, (h.c.e) null, 1));
        }
        return ab.f48028a;
    }

    @Override // e.a.l
    public final e.a.k b(cq cqVar, e.a.h hVar, e.a.i iVar) {
        x.f(cqVar, "method");
        x.f(iVar, "next");
        final com.waze.authentication.a aVar = (com.waze.authentication.a) this.f32187a.d().d();
        return new c(cqVar, hVar, iVar, this.f32188b, new h.g.a.a() { // from class: com.waze.network.d.d
            @Override // h.g.a.a
            public final Object invoke() {
                return e.c(aVar, this);
            }
        });
    }
}
