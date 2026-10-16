package com.waze.map.main;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class bd extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ bm f29363a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ bc f29364b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bd(bm bmVar, bc bcVar, h.c.e eVar) {
        super(2, eVar);
        this.f29363a = bmVar;
        this.f29364b = bcVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        return new bd(this.f29363a, this.f29364b, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((bd) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        bm.A(this.f29363a, ((az) this.f29364b).a());
        return h.ab.f48028a;
    }
}
