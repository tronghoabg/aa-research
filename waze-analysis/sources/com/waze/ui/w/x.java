package com.waze.ui.w;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class x extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f43797a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ c f43798b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    x(c cVar, h.c.e eVar) {
        super(2, eVar);
        this.f43798b = cVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        return new x(this.f43798b, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((x) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f43797a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            this.f43797a = 1;
            if (this.f43798b.e(this) == aVar) {
                return aVar;
            }
        }
        return h.ab.f48028a;
    }
}
