package com.waze.uid.state_impl.add_id;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class w extends com.waze.uid.e.g {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(com.waze.uid.e.b bVar, com.waze.uid.b.m mVar, com.waze.b.u uVar, com.waze.b.o oVar) {
        super("AddIdFlowStatesContainer", bVar, null, mVar);
        com.waze.shared_infra.o.a aVarA = com.waze.shared_infra.o.b.a();
        h.g.b.x.f(bVar, "trace");
        h.g.b.x.f(mVar, "controller");
        h.g.b.x.f(uVar, "ageRestrictionRepository");
        h.g.b.x.f(oVar, "ageRestrictionApi");
        h.g.b.x.f(aVarA, "stringProvider");
        w wVar = this;
        g(new ad(bVar, wVar, mVar), new v(bVar, wVar, mVar), new w(bVar, wVar, mVar, uVar, oVar, aVarA), new u(bVar, wVar, mVar), new o(bVar, wVar, mVar), new q(bVar, wVar, mVar), new r(bVar, wVar, mVar), new com.waze.uid.state_impl.e.c(bVar, wVar, mVar), new s(bVar, wVar, mVar));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(com.waze.uid.e.b bVar, com.waze.uid.e.h hVar, com.waze.uid.b.m mVar, com.waze.b.u uVar, com.waze.b.o oVar, com.waze.shared_infra.o.a aVar) {
        super("AddIdStatesContainer", bVar, hVar, mVar);
        h.g.b.x.f(bVar, "trace");
        h.g.b.x.f(mVar, "controller");
        h.g.b.x.f(uVar, "ageRestrictionRepository");
        h.g.b.x.f(oVar, "ageRestrictionApi");
        h.g.b.x.f(aVar, "stringProvider");
        w wVar = this;
        g(new x(bVar, wVar, mVar), new p(bVar, wVar, mVar), new com.waze.uid.state_impl.b.a(bVar, wVar, uVar, oVar, mVar), new com.waze.uid.state_impl.b.p(bVar, wVar, mVar), new j(bVar, wVar, mVar, aVar));
    }
}
