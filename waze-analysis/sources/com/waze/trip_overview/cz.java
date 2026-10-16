package com.waze.trip_overview;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class cz extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f41314a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ de f41315b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    cz(de deVar, h.c.e eVar) {
        super(2, eVar);
        this.f41315b = deVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        return new cz(this.f41315b, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((cz) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f41314a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            this.f41314a = 1;
            if (kotlinx.coroutines.aj.q(100L, this) == aVar) {
                return aVar;
            }
        }
        this.f41315b.N(cr.f41304a);
        return h.ab.f48028a;
    }
}
