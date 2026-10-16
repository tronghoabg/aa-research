package com.waze.uid.state_impl.username_login;

import com.waze.uid.UidModel;
import com.waze.uid.state_impl.username_login.LoginParameters;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class j extends com.waze.uid.e.i {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(com.waze.uid.e.b bVar, com.waze.uid.e.h hVar, com.waze.uid.b.m mVar) {
        super(bVar, hVar, mVar);
        x.f(bVar, "trace");
        x.f(mVar, "controller");
        c(LoginParameters.LOGIN_OPTION.USERNAME, new m(bVar, hVar, mVar));
        c(LoginParameters.LOGIN_OPTION.EMAIL, new d(new com.waze.ui.g(20), bVar, hVar, mVar));
        c(LoginParameters.LOGIN_OPTION.GOOGLE, new d(new com.waze.ui.g.n(1), bVar, hVar, mVar));
    }

    @Override // com.waze.uid.e.i
    public final /* bridge */ /* synthetic */ Object b() {
        return ((UidModel) this.f44485c.b()).getLoginParameters().getLoginOption();
    }
}
