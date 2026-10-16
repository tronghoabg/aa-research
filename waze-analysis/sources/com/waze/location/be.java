package com.waze.location;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class be extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f25340a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ o f25341b;

    /* renamed from: c, reason: collision with root package name */
    private /* synthetic */ Object f25342c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    be(o oVar, h.c.e eVar) {
        super(2, eVar);
        this.f25341b = oVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        be beVar = new be(this.f25341b, eVar);
        beVar.f25342c = obj;
        return beVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((be) create((kotlinx.coroutines.a.ad) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f25340a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            kotlinx.coroutines.a.ad adVar = (kotlinx.coroutines.a.ad) this.f25342c;
            o oVar = this.f25341b;
            com.google.android.libraries.phenotype.client.stable.x xVar = new com.google.android.libraries.phenotype.client.stable.x(oVar, adVar, 17);
            oVar.registerLocListener(xVar);
            this.f25340a = 1;
            if (kotlinx.coroutines.a.ab.a(adVar, new com.waze.car_lib.b.k(oVar, xVar, 4), this) == aVar) {
                return aVar;
            }
        }
        return h.ab.f48028a;
    }
}
