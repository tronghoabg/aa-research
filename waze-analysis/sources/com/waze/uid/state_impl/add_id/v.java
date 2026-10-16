package com.waze.uid.state_impl.add_id;

import com.waze.uid.FlowType;
import com.waze.uid.UidModel;
import com.waze.uid.c.bb;
import com.waze.uid.c.bm;
import com.waze.uid.state_impl.util.InstallParameters;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class v extends com.waze.uid.e.f {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(com.waze.uid.e.b bVar, com.waze.uid.e.h hVar, com.waze.uid.b.m mVar) {
        super("AddIdStartState", bVar, hVar, mVar);
        h.g.b.x.f(mVar, "controller");
    }

    @Override // com.waze.uid.e.f
    public final void f(com.waze.uid.e.e eVar) {
        h.g.b.x.f(eVar, "dir");
        super.f(eVar);
        if (eVar != com.waze.uid.e.e.f44481a) {
            this.f44485c.o(new com.waze.uid.b.a());
            return;
        }
        com.waze.uid.b.m mVar = this.f44485c;
        mVar.k(mVar.a().e(new bb(bm.f44280a)));
        ((UidModel) mVar.b()).getAddIdParameters().addEmailToExistingAccount = !com.waze.uid.d.q.f44463a.a().f44467e.t();
        if (((UidModel) mVar.b()).getFlowType() == FlowType.EDIT_ID) {
            ((UidModel) mVar.b()).getInstallParameters().result = InstallParameters.Result.EDIT_ID;
        }
        mVar.l(((UidModel) mVar.b()).getRequestCode());
        k();
    }
}
