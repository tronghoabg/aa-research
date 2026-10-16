package com.waze.reports_v2.presentation;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class cy extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f34994a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ cz f34995b;

    /* renamed from: c, reason: collision with root package name */
    private /* synthetic */ Object f34996c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    cy(cz czVar, h.c.e eVar) {
        super(2, eVar);
        this.f34995b = czVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        cy cyVar = new cy(this.f34995b, eVar);
        cyVar.f34996c = obj;
        return cyVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((cy) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        kotlinx.coroutines.af afVar;
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f34994a != 0) {
            afVar = (kotlinx.coroutines.af) this.f34996c;
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            kotlinx.coroutines.af afVar2 = (kotlinx.coroutines.af) this.f34996c;
            this.f34996c = afVar2;
            this.f34994a = 1;
            if (kotlinx.coroutines.aj.q(com.waze.settings.h.c.g(db.c()), this) == aVar) {
                return aVar;
            }
            afVar = afVar2;
        }
        if (kotlinx.coroutines.aj.j(afVar)) {
            cz.s(this.f34995b, true);
        }
        return h.ab.f48028a;
    }
}
