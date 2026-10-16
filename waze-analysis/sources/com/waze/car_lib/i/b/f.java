package com.waze.car_lib.i.b;

import com.waze.an.a.a.bd;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class f extends h.c.b.a.g implements h.g.a.q {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f19988a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f19989b;

    f(h.c.e eVar) {
        super(3, eVar);
    }

    @Override // h.g.a.q
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        f fVar = new f((h.c.e) obj3);
        fVar.f19988a = (s) obj;
        fVar.f19989b = (bd) obj2;
        return fVar.invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        return new h.k((s) this.f19988a, (bd) this.f19989b);
    }
}
