package com.waze.bw.a.b;

import h.ab;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class r extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ v f17603a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    r(v vVar, h.c.e eVar) {
        super(2, eVar);
        this.f17603a = vVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        return new r(this.f17603a, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((r) create((com.waze.bw.b.a.o) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        this.f17603a.f17622h.h();
        return ab.f48028a;
    }
}
