package com.waze.uid.state_impl.add_id;

import com.waze.sharedui.api.EmailConsent;
import com.waze.uid.UidModel;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class c extends com.waze.uid.e.f {
    c(com.waze.uid.e.b bVar, com.waze.uid.e.h hVar, com.waze.uid.b.m mVar) {
        super("AddIdToAccountState", bVar, hVar, mVar);
    }

    @Override // com.waze.uid.e.f
    public final void f(com.waze.uid.e.e eVar) {
        super.f(eVar);
        int i2 = i();
        com.waze.uid.b.m mVar = this.f44485c;
        EmailConsent consent = ((UidModel) mVar.b()).getEmailParameters().getConsent();
        int i3 = com.waze.sharedui.b.b.f38833a;
        int i4 = com.waze.sharedui.b.d.f38836a;
        com.waze.sharedui.b.c.a().reportAuditEvent(com.waze.uid.a.a.f44034b.a(consent.getConfigString()));
        j.u(mVar, true);
        com.waze.sharedui.api.t.f38827b.c(((UidModel) mVar.b()).getAuthParameters(), ((UidModel) mVar.b()).getEmailParameters().getVerificationToken(), consent, true, new b(this, i2, 0));
    }

    @Override // com.waze.uid.e.f
    public final boolean h(com.waze.uid.e.e eVar) {
        return a.a.h(eVar);
    }
}
