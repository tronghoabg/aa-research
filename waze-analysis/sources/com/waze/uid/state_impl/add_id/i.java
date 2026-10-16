package com.waze.uid.state_impl.add_id;

import com.waze.uid.UidModel;
import com.waze.uid.c.bb;
import com.waze.uid.c.bm;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class i extends com.waze.uid.e.f implements com.waze.uid.b.h {
    i(com.waze.uid.e.b bVar, com.waze.uid.e.h hVar, com.waze.uid.b.m mVar) {
        super("WarnChooseAccountState", bVar, hVar, mVar);
    }

    @Override // com.waze.uid.e.f
    public final void f(com.waze.uid.e.e eVar) {
        super.f(eVar);
        com.waze.uid.stats.s sVarC = com.waze.uid.d.q.b().c();
        com.waze.uid.b.m mVar = this.f44485c;
        sVarC.k(((UidModel) mVar.b()).getFlowContext().getOnboardingContext());
        if (eVar == com.waze.uid.e.e.f44482b) {
            mVar.k(mVar.a().e(new bb(bm.f44291l, eVar)));
        }
    }

    @Override // com.waze.uid.e.f, com.waze.uid.b.h
    public final void o(com.waze.tide.s sVar) {
        com.waze.uid.b.m mVar = this.f44485c;
        UidModel uidModel = (UidModel) mVar.b();
        if (sVar instanceof ab) {
            com.waze.uid.d.q.b().c().j(((UidModel) mVar.b()).getFlowContext().getOnboardingContext(), com.waze.uid.stats.f.f44736a);
            uidModel.getInstallParameters().didChooseExistingAccount = ((ab) sVar).a() == uidModel.getEmailParameters().getExistingProfile().getUserId();
        } else if (sVar instanceof com.waze.uid.b.p) {
            com.waze.uid.d.q.b().c().j(((UidModel) mVar.b()).getFlowContext().getOnboardingContext(), com.waze.uid.stats.f.f44737b);
            k();
        } else if (!(sVar instanceof com.waze.uid.b.c)) {
            super.o(sVar);
        } else {
            uidModel.getEmailParameters().setEmailAddress("");
            j();
        }
    }
}
