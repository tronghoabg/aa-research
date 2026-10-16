package com.waze.uid.state_impl.g;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class a extends com.waze.uid.e.g {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(com.waze.uid.e.b bVar, com.waze.uid.e.h hVar, com.waze.uid.b.m mVar, com.waze.b.u uVar, com.waze.b.o oVar) {
        super("EulaContainerState", bVar, hVar, mVar);
        h.g.b.x.f(bVar, "trace");
        h.g.b.x.f(mVar, "controller");
        h.g.b.x.f(uVar, "ageRestrictionRepository");
        h.g.b.x.f(oVar, "ageRestrictionApi");
        a aVar = this;
        com.waze.uid.e.b bVar2 = this.f44486d;
        h.g.b.x.e(bVar2, "trace");
        g(new m(this.f44486d, aVar, mVar), new q(this.f44486d, aVar, mVar, uVar), new b(bVar2, aVar, mVar, uVar, oVar));
    }
}
