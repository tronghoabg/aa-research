package com.waze.reports_v2.presentation;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class ad extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f34769a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ah f34770b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ad(ah ahVar, h.c.e eVar) {
        super(2, eVar);
        this.f34770b = ahVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        return new ad(this.f34770b, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ad) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f34769a == 0) {
            e.b.c.b(obj);
            ah ahVar = this.f34770b;
            this.f34769a = 1;
            if (ahVar.f34780d.a().collect(new ac(ahVar), this) == aVar) {
                return aVar;
            }
        } else {
            e.b.c.b(obj);
        }
        throw new h.e();
    }
}
