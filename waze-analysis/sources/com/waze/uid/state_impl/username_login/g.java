package com.waze.uid.state_impl.username_login;

import com.waze.sharedui.api.t;
import com.waze.uid.UidModel;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class g extends com.waze.uid.e.a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.waze.uid.e.b bVar, com.waze.uid.e.h hVar, com.waze.uid.b.m mVar) {
        super("checkIfUserExists", bVar, hVar, mVar);
        x.f(bVar, "trace");
        x.f(mVar, "controller");
    }

    @Override // com.waze.uid.e.f
    public final void f(com.waze.uid.e.e eVar) {
        super.f(eVar);
        t.f38827b.d(((UidModel) this.f44485c.b()).getAuthParameters(), new l(com.waze.uid.e.f.i(), this, 1));
    }

    @Override // com.waze.uid.e.f
    public final boolean h(com.waze.uid.e.e eVar) {
        return eVar == com.waze.uid.e.e.f44481a && !((UidModel) this.f44485c.b()).getEmailParameters().getContinuedAsGuest();
    }
}
