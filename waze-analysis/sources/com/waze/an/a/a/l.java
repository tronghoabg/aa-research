package com.waze.an.a.a;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class l extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f14488a;

    /* renamed from: b, reason: collision with root package name */
    private /* synthetic */ Object f14489b;

    l(h.c.e eVar) {
        super(2, eVar);
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        l lVar = new l(eVar);
        lVar.f14489b = obj;
        return lVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((l) create((kotlinx.coroutines.b.l) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f14488a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            this.f14488a = 1;
            if (((kotlinx.coroutines.b.l) this.f14489b).emit(h.a.i.h(), this) == aVar) {
                return aVar;
            }
        }
        return h.ab.f48028a;
    }
}
