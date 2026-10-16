package com.waze.bw.c.c;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class aj extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ am f17789a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    aj(am amVar, h.c.e eVar) {
        super(2, eVar);
        this.f17789a = amVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        return new aj(this.f17789a, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((aj) create((com.waze.bw.b.a.o) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        this.f17789a.q.h();
        return h.ab.f48028a;
    }
}
