package com.waze.search.a.b;

import h.ab;
import h.g.a.p;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class d extends h.c.b.a.g implements p {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f35447a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ h f35448b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    d(h hVar, h.c.e eVar) {
        super(2, eVar);
        this.f35448b = hVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        d dVar = new d(this.f35448b, eVar);
        dVar.f35447a = obj;
        return dVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((d) create((com.waze.search.d.a.a.a) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        h.e(this.f35448b, (com.waze.search.d.a.a.a) this.f35447a);
        return ab.f48028a;
    }
}
