package com.waze.trip_overview;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class cy extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f41313a;

    cy(h.c.e eVar) {
        super(2, eVar);
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        cy cyVar = new cy(eVar);
        cyVar.f41313a = obj;
        return cyVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((cy) create((com.waze.resume_drive.a) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        return Boolean.valueOf(((com.waze.resume_drive.a) this.f41313a) instanceof com.waze.bn.e);
    }
}
