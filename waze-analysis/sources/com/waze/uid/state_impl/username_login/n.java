package com.waze.uid.state_impl.username_login;

import com.waze.uid.UidModel;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class n extends com.waze.uid.e.a {

    /* renamed from: f, reason: collision with root package name */
    private final com.waze.sharedui.api.d f44713f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(com.waze.uid.e.b bVar, com.waze.uid.e.h hVar, com.waze.uid.b.m mVar, com.waze.sharedui.api.d dVar) {
        super("RegisterConnectOrTryAgainState", bVar, hVar, mVar);
        x.f(bVar, "trace");
        x.f(mVar, "controller");
        x.f(dVar, "authParametersRepository");
        this.f44713f = dVar;
    }

    @Override // com.waze.uid.e.f
    public final void f(com.waze.uid.e.e eVar) {
        super.f(eVar);
        com.waze.uid.b.m mVar = this.f44485c;
        if (((UidModel) mVar.b()).getLoginParameters().getExistingProfile() != null) {
            a(new com.waze.uid.state_impl.email.k(this.f44486d, this.f44484b, mVar));
            return;
        }
        com.waze.uid.e.b bVar = this.f44486d;
        x.e(bVar, "trace");
        com.waze.uid.e.h hVar = this.f44484b;
        x.e(mVar, "controller");
        a(new c(bVar, hVar, mVar, this.f44713f));
    }

    @Override // com.waze.uid.e.f
    public final boolean h(com.waze.uid.e.e eVar) {
        return !((UidModel) this.f44485c.b()).getEmailParameters().getContinuedAsGuest();
    }
}
