package com.waze.uid.state_impl.g;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class q extends com.waze.uid.e.c {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.b.u f44693a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(com.waze.uid.e.b bVar, com.waze.uid.e.h hVar, com.waze.uid.b.m mVar, com.waze.b.u uVar) {
        super("StatePrivacyFlowSelect", bVar, hVar, mVar);
        h.g.b.x.f(uVar, "ageRestrictionRepository");
        this.f44693a = uVar;
    }

    @Override // com.waze.uid.e.c
    protected final com.waze.uid.e.f a() {
        return new p(this.f44486d, this.f44484b, this.f44485c, this.f44693a, com.waze.app_nav.hub.service.k.f15395a.a());
    }
}
