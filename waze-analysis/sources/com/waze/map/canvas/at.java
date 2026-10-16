package com.waze.map.canvas;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class at extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f28557a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ MainCanvasDelegatorImpl f28558b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ bi f28559c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ com.waze.shared_infra.n.c f28560d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    at(MainCanvasDelegatorImpl mainCanvasDelegatorImpl, com.waze.shared_infra.n.c cVar, bi biVar, h.c.e eVar) {
        super(2, eVar);
        this.f28558b = mainCanvasDelegatorImpl;
        this.f28560d = cVar;
        this.f28559c = biVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        return new at(this.f28558b, this.f28560d, this.f28559c, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((at) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f28557a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            MainCanvasDelegatorImpl mainCanvasDelegatorImpl = this.f28558b;
            com.waze.shared_infra.n.c cVar = this.f28560d;
            mainCanvasDelegatorImpl.a().a("canceling swap from canvasId, state(" + cVar.e().d() + ")");
            com.waze.map.b.d dVar = com.waze.map.b.d.f28179e;
            if (!h.a.i.i(dVar, com.waze.map.b.d.f28175a).contains(cVar.e().d())) {
                cVar.g(dVar);
                this.f28557a = 1;
                if (this.f28559c.c(this) == aVar) {
                    return aVar;
                }
            }
        }
        return h.ab.f48028a;
    }
}
