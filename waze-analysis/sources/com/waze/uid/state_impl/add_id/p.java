package com.waze.uid.state_impl.add_id;

import androidx.core.app.NotificationCompat;
import com.waze.sharedui.api.AuthParameters;
import com.waze.uid.FlowContext;
import com.waze.uid.FlowType;
import com.waze.uid.UidModel;
import com.waze.uid.c.bb;
import com.waze.uid.c.bc;
import com.waze.uid.c.bm;
import com.waze.uid.state_impl.util.InstallParameters;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class p extends com.waze.uid.e.f {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(com.waze.uid.e.b bVar, com.waze.uid.e.h hVar, com.waze.uid.b.m mVar) {
        super("AddIdChooseCommunity", bVar, hVar, mVar);
        h.g.b.x.f(bVar, "trace");
        h.g.b.x.f(mVar, "controller");
    }

    @Override // com.waze.uid.e.f
    public final void f(com.waze.uid.e.e eVar) {
        super.f(eVar);
        com.waze.uid.b.m mVar = this.f44485c;
        FlowContext flowContext = ((UidModel) mVar.b()).getFlowContext();
        if (eVar == com.waze.uid.e.e.f44481a && ((UidModel) mVar.b()).getAuthParameters().getUseDataForSignUp()) {
            if (h.g.b.x.n(((UidModel) mVar.b()).getAuthParameters().getCommunity(), InstallParameters.Community.EMAIL.apiName)) {
                ((UidModel) mVar.b()).getInstallParameters().community = InstallParameters.Community.EMAIL;
                ((UidModel) mVar.b()).setAuthParameters(AuthParameters.copy$default(((UidModel) mVar.b()).getAuthParameters(), null, null, null, false, 7, null));
                k();
                return;
            } else if (h.g.b.x.n(((UidModel) mVar.b()).getAuthParameters().getCommunity(), InstallParameters.Community.GOOGLE.apiName)) {
                ((UidModel) mVar.b()).getInstallParameters().community = InstallParameters.Community.GOOGLE;
                ((UidModel) mVar.b()).setAuthParameters(AuthParameters.copy$default(((UidModel) mVar.b()).getAuthParameters(), null, null, null, false, 7, null));
                k();
                return;
            }
        }
        com.waze.uid.d.p pVar = com.waze.uid.d.q.f44463a;
        if (pVar.a().a().f() && flowContext == FlowContext.WAZE_ONBOARDING) {
            ((UidModel) mVar.b()).getInstallParameters().community = null;
            k();
            return;
        }
        if (eVar == com.waze.uid.e.e.f44482b) {
            ((UidModel) mVar.b()).getInstallParameters().community = null;
        }
        FlowType flowType = ((UidModel) mVar.b()).getFlowType();
        if (pVar.a().a().h() && flowType == FlowType.ADD_ID && flowContext == FlowContext.WAZE_ONBOARDING) {
            mVar.k(mVar.a().e(new bb(bm.f44285f, null, null, false)));
        } else {
            mVar.k(mVar.a().e(new bb(bm.f44280a, (flowType == FlowType.ADD_ID && flowContext == FlowContext.WAZE_ONBOARDING) ? pVar.a().a().e() ? bc.f44255k : bc.f44254j : flowType == FlowType.EDIT_ID ? bc.f44253i : ((UidModel) mVar.b()).getAddIdParameters().addEmailToExistingAccount ? bc.f44248d : bc.f44249e, null, false)));
        }
    }

    @Override // com.waze.uid.e.f
    public final boolean h(com.waze.uid.e.e eVar) {
        if (eVar == null || eVar.ordinal() != 0) {
            return true;
        }
        com.waze.uid.e.d dVarB = this.f44485c.b();
        h.g.b.x.e(dVarB, "<get-model>(...)");
        return com.waze.ui.r.a.d.d.f((UidModel) dVarB);
    }

    @Override // com.waze.uid.e.f, com.waze.uid.b.h
    public final void o(com.waze.tide.s sVar) {
        h.g.b.x.f(sVar, NotificationCompat.CATEGORY_EVENT);
        if (sVar instanceof com.waze.uid.state_impl.b.b) {
            ((UidModel) this.f44485c.b()).getInstallParameters().community = ((com.waze.uid.state_impl.b.b) sVar).a();
            k();
        } else {
            if (!(sVar instanceof com.waze.uid.b.c)) {
                super.o(sVar);
                return;
            }
            com.waze.uid.b.m mVar = this.f44485c;
            if (((UidModel) mVar.b()).getFlowContext() != FlowContext.WAZE_ONBOARDING) {
                super.o(sVar);
            } else {
                ((UidModel) mVar.b()).getInstallParameters().community = null;
                k();
            }
        }
    }
}
