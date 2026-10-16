package com.waze.search.v2;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class ex extends h.c.b.a.g implements h.g.a.l {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ fi f36476a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ com.waze.av.c.c f36477b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ boolean f36478c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ex(fi fiVar, com.waze.av.c.c cVar, boolean z, h.c.e eVar) {
        super(1, eVar);
        this.f36476a = fiVar;
        this.f36477b = cVar;
        this.f36478c = z;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(h.c.e<?> eVar) {
        return new ex(this.f36476a, this.f36477b, this.f36478c, eVar);
    }

    @Override // h.g.a.l
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return ((ex) create((h.c.e) obj)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        this.f36476a.aa(new aw(this.f36477b.b(), this.f36478c));
        return h.ab.f48028a;
    }
}
