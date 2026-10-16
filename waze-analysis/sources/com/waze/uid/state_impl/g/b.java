package com.waze.uid.state_impl.g;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class b extends com.waze.uid.e.g {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(com.waze.uid.e.b bVar, com.waze.uid.e.h hVar, com.waze.uid.b.m mVar, com.waze.b.u uVar, com.waze.b.o oVar) {
        super("GetStartedContainerState", bVar, hVar, mVar);
        h.g.b.x.f(bVar, "trace");
        h.g.b.x.f(mVar, "controller");
        h.g.b.x.f(uVar, "ageRestrictionRepository");
        h.g.b.x.f(oVar, "ageRestrictionApi");
        b bVar2 = this;
        g(new com.waze.uid.state_impl.d.a(this.f44486d, bVar2, mVar), new f(this.f44486d, bVar2, mVar), new com.waze.uid.state_impl.d.d(this.f44486d, bVar2, mVar, uVar, oVar));
    }

    @Override // com.waze.uid.e.f
    public final boolean h(com.waze.uid.e.e eVar) {
        return true;
    }
}
