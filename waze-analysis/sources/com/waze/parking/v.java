package com.waze.parking;

import h.ab;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class v extends h.c.b.a.g implements h.g.a.q {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f32997a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f32998b;

    v(h.c.e eVar) {
        super(3, eVar);
    }

    @Override // h.g.a.q
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        v vVar = new v((h.c.e) obj3);
        vVar.f32997a = (com.waze.sharedui.e.c) obj;
        vVar.f32998b = (com.waze.shared_infra.h.c) obj2;
        return vVar.invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        com.waze.sharedui.e.c cVar = (com.waze.sharedui.e.c) this.f32997a;
        com.waze.shared_infra.h.c cVar2 = (com.waze.shared_infra.h.c) this.f32998b;
        boolean z = false;
        if (cVar2 != null && com.waze.shared_infra.h.b.c(cVar.f(), cVar2) <= 3.0f) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
