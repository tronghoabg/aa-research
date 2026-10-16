package com.waze.bn;

import h.ab;
import h.g.a.p;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class g extends h.c.b.a.g implements p {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f17155a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ j f17156b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    g(j jVar, h.c.e eVar) {
        super(2, eVar);
        this.f17156b = jVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        g gVar = new g(this.f17156b, eVar);
        gVar.f17155a = obj;
        return gVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((g) create((com.waze.sharedui.e.c) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        j.f(this.f17156b, ((com.waze.sharedui.e.c) this.f17155a).b());
        return ab.f48028a;
    }
}
