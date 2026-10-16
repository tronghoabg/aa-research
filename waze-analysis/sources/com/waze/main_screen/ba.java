package com.waze.main_screen;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class ba extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f25897a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ be f25898b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ba(be beVar, h.c.e eVar) {
        super(2, eVar);
        this.f25898b = beVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        ba baVar = new ba(this.f25898b, eVar);
        baVar.f25897a = obj;
        return baVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ba) create((com.waze.realtime_report_feedback.c) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        if (!h.g.b.x.n((com.waze.realtime_report_feedback.c) this.f25897a, com.waze.nav_connect.b.i.f30802a)) {
            throw new h.i();
        }
        com.waze.nav_connect.b.af afVarM = this.f25898b.m();
        if (afVarM != null) {
            afVarM.l();
        }
        return h.ab.f48028a;
    }
}
