package com.waze.nav_connect.a;

import h.ab;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class g extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f30722a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ k f30723b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    g(k kVar, h.c.e eVar) {
        super(2, eVar);
        this.f30723b = kVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        g gVar = new g(this.f30723b, eVar);
        gVar.f30722a = obj;
        return gVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((g) create((h.k) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        h.k kVar = (h.k) this.f30722a;
        com.waze.map.isolated.k kVar2 = (com.waze.map.isolated.k) kVar.a();
        Object obj2 = (com.waze.map.isolated.k) kVar.b();
        if (kVar2 instanceof m) {
            if (!(obj2 instanceof m)) {
                x.d(obj2, "null cannot be cast to non-null type com.waze.nav_connect.data.HasExternalTripToken");
                k.e(this.f30723b, ((c) obj2).b());
            }
        } else if (obj2 instanceof m) {
            this.f30723b.f30738e = null;
        }
        return ab.f48028a;
    }
}
