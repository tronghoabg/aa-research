package com.waze.uid.state_impl.e;

import com.waze.uid.FlowType;
import com.waze.uid.UidModel;
import com.waze.uid.b.m;
import com.waze.uid.d.p;
import com.waze.uid.d.q;
import com.waze.uid.e.d;
import com.waze.uid.e.e;
import com.waze.uid.e.f;
import com.waze.uid.e.h;
import com.waze.uid.state_impl.util.InstallParameters;
import com.waze.uid.stats.UidStatsSender$OnboardingContext;
import h.g.b.x;
import kotlinx.coroutines.aj;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class c extends f {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.waze.uid.e.b bVar, h hVar, m mVar) {
        super("AuthCompleteStatState", bVar, hVar, mVar);
        x.f(mVar, "controller");
    }

    @Override // com.waze.uid.e.f
    public final void f(e eVar) {
        com.waze.uid.stats.m mVar;
        InstallParameters installParameters;
        super.f(eVar);
        m mVar2 = this.f44485c;
        String community = ((UidModel) mVar2.b()).getAuthParameters().getCommunity();
        UidStatsSender$OnboardingContext onboardingContext = ((UidModel) mVar2.b()).getFlowContext().getOnboardingContext();
        long startFlowNanoTime = ((UidModel) mVar2.b()).getStartFlowNanoTime();
        if (((UidModel) mVar2.b()).getInstallParameters().isExistingUser()) {
            mVar = com.waze.uid.stats.m.f44766b;
        } else {
            d dVarB = mVar2.b();
            x.e(dVarB, "<get-model>(...)");
            mVar = com.waze.ui.r.a.d.d.f((UidModel) dVarB) ? com.waze.uid.stats.m.f44765a : com.waze.uid.stats.m.f44767c;
        }
        String str = community;
        if (str.length() > 0) {
            aj.z(q.f44463a.a().d(), null, null, new a(onboardingContext, ((UidModel) mVar2.b()).getInstallParameters().isExistingUser() ? com.waze.uid.stats.d.f44730a : com.waze.uid.stats.d.f44731b, null), 3);
        }
        boolean didFindRecoveryCredentials = ((UidModel) mVar2.b()).getLoginParameters().getDidFindRecoveryCredentials();
        UidModel uidModel = (UidModel) mVar2.b();
        boolean z = true;
        boolean z2 = ((uidModel == null || (installParameters = uidModel.getInstallParameters()) == null) ? null : installParameters.result) == InstallParameters.Result.RECOVERY;
        boolean zIsExistingUser = ((UidModel) mVar2.b()).getInstallParameters().isExistingUser();
        if (str.length() <= 0 && ((UidModel) mVar2.b()).getFlowType() == FlowType.MAIN) {
            if (z2) {
            }
            k();
        }
        z = z2;
        p pVar = q.f44463a;
        pVar.a().c().v(onboardingContext, mVar, startFlowNanoTime);
        aj.z(pVar.a().d(), null, null, new b(onboardingContext, community, startFlowNanoTime, zIsExistingUser, z, didFindRecoveryCredentials, null), 3);
        k();
    }

    @Override // com.waze.uid.e.f
    public final boolean h(e eVar) {
        return a.a.h(eVar);
    }
}
