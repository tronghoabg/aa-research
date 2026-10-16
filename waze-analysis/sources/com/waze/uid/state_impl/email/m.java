package com.waze.uid.state_impl.email;

import com.waze.uid.UidModel;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class m extends com.waze.uid.e.a {
    public m(com.waze.uid.e.b bVar, com.waze.uid.e.h hVar, com.waze.uid.b.m mVar) {
        super("FindAccountState", bVar, hVar, mVar);
    }

    @Override // com.waze.uid.e.f
    public final void f(com.waze.uid.e.e eVar) {
        super.f(eVar);
        int i2 = i();
        com.waze.uid.b.m mVar = this.f44485c;
        mVar.k(mVar.a().b(com.waze.uid.b.n.a(true)));
        com.waze.sharedui.api.t.f38827b.d(((UidModel) mVar.b()).getAuthParameters(), new j(this, i2, 1));
    }

    @Override // com.waze.uid.e.f
    public final boolean h(com.waze.uid.e.e eVar) {
        return eVar == com.waze.uid.e.e.f44481a && !((UidModel) this.f44485c.b()).getEmailParameters().getContinuedAsGuest();
    }
}
