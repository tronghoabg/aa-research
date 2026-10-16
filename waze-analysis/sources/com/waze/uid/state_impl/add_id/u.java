package com.waze.uid.state_impl.add_id;

import androidx.core.app.NotificationCompat;
import com.waze.R;
import com.waze.uid.FlowType;
import com.waze.uid.UidModel;
import com.waze.uid.c.bb;
import com.waze.uid.c.bm;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class u extends com.waze.uid.e.f {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(com.waze.uid.e.b bVar, com.waze.uid.e.h hVar, com.waze.uid.b.m mVar) {
        super("AddIdShowToastState", bVar, hVar, mVar);
        h.g.b.x.f(mVar, "controller");
    }

    @Override // com.waze.uid.e.f
    public final void f(com.waze.uid.e.e eVar) {
        h.g.b.x.f(eVar, "dir");
        super.f(eVar);
        com.waze.uid.b.m mVar = this.f44485c;
        mVar.k(mVar.a().e(new bb(bm.f44281b)));
        mVar.w(new com.waze.uid.b.v(((UidModel) mVar.b()).getFlowType() == FlowType.EDIT_ID ? R.string.EMAIL_UPDATED : ((UidModel) mVar.b()).getAddIdParameters().addEmailToExistingAccount ? R.string.EMAIL_VERIFIED : R.string.ACCOUNT_REGISTERED, R.drawable.toast_check, t.f44596a));
    }

    @Override // com.waze.uid.e.f
    public final boolean h(com.waze.uid.e.e eVar) {
        com.waze.uid.e.d dVarB = this.f44485c.b();
        h.g.b.x.e(dVarB, "<get-model>(...)");
        return !com.waze.ui.r.a.d.d.f((UidModel) dVarB) && eVar == com.waze.uid.e.e.f44481a;
    }

    @Override // com.waze.uid.e.f, com.waze.uid.b.h
    public final void o(com.waze.tide.s sVar) {
        h.g.b.x.f(sVar, NotificationCompat.CATEGORY_EVENT);
        if (sVar instanceof t) {
            k();
            return;
        }
        com.waze.shared_infra.i.h.b("UidEventsController", this.f44487e + ": ignoring event " + sVar);
    }
}
