package com.waze.inbox;

import h.ab;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class v extends h.c.b.a.g implements h.g.a.q {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ long f24687a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f24688b;

    v(h.c.e eVar) {
        super(3, eVar);
    }

    @Override // h.g.a.q
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        long jLongValue = ((Number) obj).longValue();
        v vVar = new v((h.c.e) obj3);
        vVar.f24687a = jLongValue;
        vVar.f24688b = (l) obj2;
        return vVar.invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        long j2 = this.f24687a;
        l lVar = (l) this.f24688b;
        com.waze.bi.k kVar = com.waze.bi.k.f16817a;
        long jB = lVar.b();
        boolean z = false;
        if (lVar.b() > j2 && lVar.a() > 0) {
            z = true;
        }
        return new com.waze.bi.f(kVar, jB, z);
    }
}
