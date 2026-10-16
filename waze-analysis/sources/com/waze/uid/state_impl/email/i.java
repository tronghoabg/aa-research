package com.waze.uid.state_impl.email;

import com.waze.sharedui.api.AuthParameters;
import com.waze.sharedui.api.EmailConsent;
import com.waze.uid.FlowType;
import com.waze.uid.UidModel;
import com.waze.uid.c.bb;
import com.waze.uid.c.bm;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class i extends com.waze.uid.e.f {
    i(com.waze.uid.e.b bVar, com.waze.uid.e.h hVar, com.waze.uid.b.m mVar) {
        super("LoginExistingAccountState", bVar, hVar, mVar);
    }

    @Override // com.waze.uid.e.f
    public final void f(com.waze.uid.e.e eVar) {
        super.f(eVar);
        com.waze.uid.b.m mVar = this.f44485c;
        mVar.k(mVar.a().e(new bb(bm.f44290k, eVar)));
        com.waze.sharedui.api.r rVar = com.waze.sharedui.api.t.f38827b;
        AuthParameters authParameters = ((UidModel) mVar.b()).getAuthParameters();
        EmailConsent consent = ((UidModel) mVar.b()).getEmailParameters().getConsent();
        FlowType flowType = ((UidModel) mVar.b()).getFlowType();
        FlowType flowType2 = FlowType.MAIN;
        rVar.g(authParameters, consent, flowType == flowType2, new h(this));
    }
}
