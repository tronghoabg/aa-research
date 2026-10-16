package com.waze.o.d.b.b;

import com.waze.o.b.b.k;
import com.waze.t.c.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f32886a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.o.c.c.c f32887b;

    /* renamed from: c, reason: collision with root package name */
    private final l f32888c;

    public d(com.waze.shared_infra.i.e eVar, com.waze.o.c.c.c cVar, l lVar) {
        x.f(eVar, "logger");
        x.f(cVar, "companinioControllerFactory");
        x.f(lVar, "conversationPermissionStateHolder");
        this.f32886a = eVar;
        this.f32887b = cVar;
        this.f32888c = lVar;
    }

    public final h a() {
        k kVarB = this.f32887b.b();
        if (kVarB == null) {
            return null;
        }
        return new h(this.f32886a, kVarB, this.f32888c);
    }
}
