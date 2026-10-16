package com.waze.network.d;

import e.a.cq;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class q implements e.a.l {

    /* renamed from: a, reason: collision with root package name */
    private final r f32217a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f32218b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f32219c;

    public q(r rVar, boolean z, com.waze.shared_infra.i.e eVar) {
        x.f(rVar, "grpcMetadataProvider");
        x.f(eVar, "logger");
        this.f32217a = rVar;
        this.f32218b = z;
        this.f32219c = eVar;
    }

    @Override // e.a.l
    public final e.a.k b(cq cqVar, e.a.h hVar, e.a.i iVar) {
        x.f(cqVar, "method");
        x.f(iVar, "next");
        return new p(this, iVar.a(cqVar, hVar));
    }
}
