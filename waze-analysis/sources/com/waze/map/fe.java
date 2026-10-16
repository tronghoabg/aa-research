package com.waze.map;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class fe extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f28925a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f28926b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ gb f28927c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ kotlinx.coroutines.af f28928d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ com.waze.map.canvas.a.e f28929e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ kotlinx.coroutines.b.bn f28930f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    fe(gb gbVar, kotlinx.coroutines.af afVar, com.waze.map.canvas.a.e eVar, kotlinx.coroutines.b.bn bnVar, h.c.e eVar2) {
        super(2, eVar2);
        this.f28927c = gbVar;
        this.f28928d = afVar;
        this.f28929e = eVar;
        this.f28930f = bnVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        fe feVar = new fe(this.f28927c, this.f28928d, this.f28929e, this.f28930f, eVar);
        feVar.f28926b = obj;
        return feVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((fe) create((cr) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f28925a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            cr crVar = (cr) this.f28926b;
            gb gbVar = this.f28927c;
            this.f28925a = 1;
            if (kotlinx.coroutines.b.ai.e(kotlinx.coroutines.b.ai.y(new fd(gbVar.f29139l.a(), crVar)), new fa(gbVar, this.f28928d, this.f28929e, this.f28930f, crVar, null), this) == aVar) {
                return aVar;
            }
        }
        return h.ab.f48028a;
    }
}
