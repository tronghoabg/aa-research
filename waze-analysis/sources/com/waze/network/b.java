package com.waze.network;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class b extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ c f31915a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    b(c cVar, h.c.e eVar) {
        super(2, eVar);
        this.f31915a = cVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        return new b(this.f31915a, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((b) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        c cVar = this.f31915a;
        return Boolean.valueOf(cVar.f32171b.a(c.a(cVar)));
    }
}
