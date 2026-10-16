package com.waze.app_nav.hub.c;

import h.ab;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class r extends h.c.b.a.g implements h.g.a.q {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f15330a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ boolean f15331b;

    r(h.c.e eVar) {
        super(3, eVar);
    }

    @Override // h.g.a.q
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        r rVar = new r((h.c.e) obj3);
        rVar.f15330a = (a) obj;
        rVar.f15331b = zBooleanValue;
        return rVar.invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        return this.f15331b ? a.f15291a : (a) this.f15330a;
    }
}
