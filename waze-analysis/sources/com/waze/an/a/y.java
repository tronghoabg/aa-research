package com.waze.an.a;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class y extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f14616a;

    /* renamed from: b, reason: collision with root package name */
    private /* synthetic */ Object f14617b;

    y(h.c.e eVar) {
        super(2, eVar);
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        y yVar = new y(eVar);
        yVar.f14617b = obj;
        return yVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((y) create((kotlinx.coroutines.b.l) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f14616a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            this.f14616a = 1;
            if (((kotlinx.coroutines.b.l) this.f14617b).emit(h.a.i.h(), this) == aVar) {
                return aVar;
            }
        }
        return h.ab.f48028a;
    }
}
