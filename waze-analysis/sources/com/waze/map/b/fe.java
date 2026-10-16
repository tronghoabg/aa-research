package com.waze.map.b;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class fe extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f28326a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ed f28327b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ com.waze.map.bv f28328c;

    /* renamed from: d, reason: collision with root package name */
    private /* synthetic */ Object f28329d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    fe(ed edVar, com.waze.map.bv bvVar, h.c.e eVar) {
        super(2, eVar);
        this.f28327b = edVar;
        this.f28328c = bvVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        fe feVar = new fe(this.f28327b, this.f28328c, eVar);
        feVar.f28329d = obj;
        return feVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((fe) create((kotlinx.coroutines.a.ad) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f28326a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            kotlinx.coroutines.a.ad adVar = (kotlinx.coroutines.a.ad) this.f28329d;
            this.f28326a = 1;
            if (kotlinx.coroutines.a.ab.a(adVar, new com.waze.car_lib.e.e(this.f28327b.c(this.f28328c, new com.waze.car_lib.b.n(adVar, 6)), 10), this) == aVar) {
                return aVar;
            }
        }
        return h.ab.f48028a;
    }
}
