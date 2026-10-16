package com.waze.z.a.d;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class ae extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ g f45914a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ h.g.a.a f45915b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ae(g gVar, h.g.a.a aVar, h.c.e eVar) {
        super(2, eVar);
        this.f45914a = gVar;
        this.f45915b = aVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        return new ae(this.f45914a, this.f45915b, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ae) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        this.f45914a.b(this.f45915b);
        return h.ab.f48028a;
    }
}
