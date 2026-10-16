package com.waze.uid.state_impl.add_id;

import com.waze.uid.UidModel;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class e extends com.waze.uid.e.f {
    e(com.waze.uid.e.b bVar, com.waze.uid.e.h hVar, com.waze.uid.b.m mVar) {
        super("SwitchAccountState", bVar, hVar, mVar);
    }

    @Override // com.waze.uid.e.f
    public final void f(com.waze.uid.e.e eVar) {
        super.f(eVar);
        int i2 = i();
        com.waze.uid.b.m mVar = this.f44485c;
        j.u(mVar, true);
        com.waze.sharedui.api.t.f38827b.i(((UidModel) mVar.b()).getAuthParameters(), ((UidModel) mVar.b()).getEmailParameters().getVerificationToken(), ((UidModel) mVar.b()).getEmailParameters().getConsent(), new b(this, i2, 2));
    }

    @Override // com.waze.uid.e.f
    public final boolean h(com.waze.uid.e.e eVar) {
        return a.a.h(eVar);
    }
}
