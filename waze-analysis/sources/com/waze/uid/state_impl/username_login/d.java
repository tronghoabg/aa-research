package com.waze.uid.state_impl.username_login;

import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class d extends com.waze.uid.e.g implements org.a.d.a.a {

    /* renamed from: f, reason: collision with root package name */
    private final h.f f44705f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(h.g.a.q qVar, com.waze.uid.e.b bVar, com.waze.uid.e.h hVar, com.waze.uid.b.m mVar) {
        super("AuthUserContainer", bVar, hVar, mVar);
        x.f(qVar, "createAuthState");
        x.f(bVar, "trace");
        x.f(mVar, "controller");
        h.f fVarB = h.g.b(h.h.f48130a, new h((org.a.d.a.a) this, 1));
        this.f44705f = fVarB;
        d dVar = this;
        g((com.waze.uid.e.f) qVar.invoke(bVar, this, mVar), new g(bVar, dVar, mVar), new n(bVar, dVar, mVar, (com.waze.sharedui.api.d) fVarB.getValue()));
    }

    @Override // org.a.d.a.a
    public final /* synthetic */ org.a.d.a getKoin() {
        return org.a.b.b.d.e();
    }
}
