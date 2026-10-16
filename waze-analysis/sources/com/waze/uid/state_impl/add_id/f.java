package com.waze.uid.state_impl.add_id;

import com.waze.uid.UidModel;
import com.waze.uid.c.bb;
import com.waze.uid.c.bc;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class f extends com.waze.uid.e.f {
    f(com.waze.uid.e.b bVar, com.waze.uid.e.h hVar, com.waze.uid.b.m mVar) {
        super("WarnChooseAccountAgainState", bVar, hVar, mVar);
    }

    @Override // com.waze.uid.e.f
    public final void f(com.waze.uid.e.e eVar) {
        super.f(eVar);
        com.waze.uid.stats.s sVarC = com.waze.uid.d.q.b().c();
        com.waze.uid.b.m mVar = this.f44485c;
        sVarC.i(((UidModel) mVar.b()).getFlowContext().getOnboardingContext());
        bb bbVarQ = mVar.q();
        UidModel uidModel = (UidModel) mVar.b();
        uidModel.getAddIdParameters().shouldExitApp = uidModel.getInstallParameters().didChooseExistingAccount;
        if (bbVarQ instanceof bb) {
            mVar.k(mVar.a().e(bbVarQ.a(uidModel.getAddIdParameters().shouldExitApp ? bc.f44251g : bc.f44250f)));
        } else {
            com.waze.shared_infra.i.h.k("UidEventsController", "unexpected UI state");
        }
    }

    @Override // com.waze.uid.e.f
    public final boolean h(com.waze.uid.e.e eVar) {
        return a.a.h(eVar);
    }

    @Override // com.waze.uid.e.f, com.waze.uid.b.h
    public final void o(com.waze.tide.s sVar) {
        if (!(sVar instanceof com.waze.uid.b.f)) {
            if (!(sVar instanceof com.waze.uid.b.c)) {
                super.o(sVar);
                return;
            } else {
                com.waze.uid.d.q.b().c().h(((UidModel) this.f44485c.b()).getFlowContext().getOnboardingContext(), com.waze.uid.stats.e.f44733a);
                j();
                return;
            }
        }
        com.waze.uid.stats.s sVarC = com.waze.uid.d.q.b().c();
        com.waze.uid.b.m mVar = this.f44485c;
        sVarC.h(((UidModel) mVar.b()).getFlowContext().getOnboardingContext(), com.waze.uid.stats.e.f44734b);
        bb bbVarQ = mVar.q();
        if (bbVarQ instanceof bb) {
            mVar.k(mVar.a().e(bbVarQ.a(null)));
        } else {
            com.waze.shared_infra.i.h.k("UidEventsController", "unexpected UI state");
        }
        k();
    }
}
