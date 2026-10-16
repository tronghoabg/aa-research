package com.waze.uid.state_impl.username_login;

import com.waze.b.u;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class k extends com.waze.uid.e.g implements com.waze.uid.e.h {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(com.waze.uid.e.b bVar, com.waze.uid.b.m mVar, u uVar) {
        super("UsernameEmailLoginStandAloneContainer", bVar, null, mVar);
        x.f(bVar, "trace");
        x.f(mVar, "controller");
        x.f(uVar, "ageRestrictionRepository");
        k kVar = this;
        g(new o(bVar, kVar, mVar), new k(bVar, kVar, mVar, uVar), new com.waze.uid.state_impl.g.h(this.f44486d, kVar, mVar), new com.waze.uid.state_impl.e.c(this.f44486d, kVar, mVar), new com.waze.uid.state_impl.c.d(this.f44486d, kVar, mVar));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(com.waze.uid.e.b bVar, com.waze.uid.e.h hVar, com.waze.uid.b.m mVar, u uVar) {
        super("UsernameEmailLoginContainer", bVar, hVar, mVar);
        x.f(bVar, "trace");
        x.f(mVar, "controller");
        x.f(uVar, "ageRestrictionRepository");
        k kVar = this;
        g(new f(bVar, kVar, mVar), new com.waze.uid.state_impl.g.m(this.f44486d, kVar, mVar), new com.waze.uid.state_impl.g.q(this.f44486d, kVar, mVar, uVar), new i(bVar, kVar, mVar), new j(bVar, kVar, mVar));
    }
}
