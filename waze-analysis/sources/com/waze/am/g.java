package com.waze.am;

import h.ab;
import h.g.a.p;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class g extends h.c.b.a.g implements p {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f14318a;

    g(h.c.e eVar) {
        super(2, eVar);
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        g gVar = new g(eVar);
        gVar.f14318a = obj;
        return gVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((g) create((b) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        return Boolean.valueOf(((b) this.f14318a).b());
    }
}
