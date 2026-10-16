package com.waze.stats;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class ah extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ an f40509a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ah(an anVar, h.c.e eVar) {
        super(2, eVar);
        this.f40509a = anVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        return new ah(this.f40509a, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ah) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        this.f40509a.p(true);
        return h.ab.f48028a;
    }
}
