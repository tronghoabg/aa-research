package com.waze.reports;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class af extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f33589a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ com.waze.shared_infra.h.c f33590b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    af(com.waze.shared_infra.h.c cVar, h.c.e eVar) {
        super(2, eVar);
        this.f33590b = cVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        af afVar = new af(this.f33590b, eVar);
        afVar.f33589a = obj;
        return afVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((af) create((com.waze.shared_infra.h.c) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        com.waze.shared_infra.h.c cVar = (com.waze.shared_infra.h.c) this.f33589a;
        boolean z = true;
        if (cVar != null && !h.g.b.x.n(cVar, this.f33590b)) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
