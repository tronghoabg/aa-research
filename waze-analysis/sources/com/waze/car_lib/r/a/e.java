package com.waze.car_lib.r.a;

import com.waze.c.d.q;
import com.waze.c.d.t;
import h.ab;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class e extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f20885a;

    e(h.c.e eVar) {
        super(2, eVar);
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        e eVar2 = new e(eVar);
        eVar2.f20885a = obj;
        return eVar2;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((e) create((t) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        return Boolean.valueOf(!x.n(((t) this.f20885a).b(), q.f18383a));
    }
}
