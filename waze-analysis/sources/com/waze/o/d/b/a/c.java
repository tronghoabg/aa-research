package com.waze.o.d.b.a;

import com.waze.o.b.b.k;
import com.waze.t.c.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class c implements b {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.o.c.c.c f32875a;

    /* renamed from: b, reason: collision with root package name */
    private final l f32876b;

    public c(com.waze.o.c.c.c cVar, l lVar) {
        x.f(cVar, "companinioControllerFactory");
        x.f(lVar, "conversationPermissionStateHolder");
        this.f32875a = cVar;
        this.f32876b = lVar;
    }

    @Override // com.waze.o.d.b.a.b
    public final d a() {
        k kVarB = this.f32875a.b();
        return kVarB != null ? new d(kVarB, this.f32876b) : null;
    }
}
