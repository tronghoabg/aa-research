package com.waze.search.h;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class bm extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f35835a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ bx f35836b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ com.waze.br.b.w f35837c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bm(com.waze.br.b.w wVar, bx bxVar, h.c.e eVar) {
        super(2, eVar);
        this.f35837c = wVar;
        this.f35836b = bxVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        return new bm(this.f35837c, this.f35836b, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((bm) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f35835a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            this.f35835a = 1;
            if (new bl(this.f35837c.g(), 0).collect(new bv(this.f35836b, 1), this) == aVar) {
                return aVar;
            }
        }
        return h.ab.f48028a;
    }
}
