package com.waze;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class cj extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f22421a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f22422b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ co f22423c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    cj(co coVar, h.c.e eVar) {
        super(2, eVar);
        this.f22423c = coVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        cj cjVar = new cj(this.f22423c, eVar);
        cjVar.f22422b = obj;
        return cjVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((cj) create((com.waze.install.w) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f22421a == 0) {
            e.b.c.b(obj);
            if (h.g.b.x.n((com.waze.install.w) this.f22422b, com.waze.install.v.f24796a)) {
                this.f22421a = 1;
                if (com.waze.install.ah.a(this) == aVar) {
                    return aVar;
                }
            }
            return h.ab.f48028a;
        }
        e.b.c.b(obj);
        co.c(this.f22423c);
        return h.ab.f48028a;
    }
}
