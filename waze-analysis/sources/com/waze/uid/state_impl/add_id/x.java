package com.waze.uid.state_impl.add_id;

import androidx.core.app.NotificationCompat;
import com.waze.uid.FlowType;
import com.waze.uid.UidModel;
import com.waze.uid.c.bb;
import com.waze.uid.c.bm;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class x extends com.waze.uid.e.f {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(com.waze.uid.e.b bVar, com.waze.uid.e.h hVar, com.waze.uid.b.m mVar) {
        super("AddIdVerifyExistingEmail", bVar, hVar, mVar);
        h.g.b.x.f(bVar, "trace");
        h.g.b.x.f(mVar, "controller");
    }

    @Override // com.waze.uid.e.f
    public final void f(com.waze.uid.e.e eVar) {
        super.f(eVar);
        com.waze.uid.b.m mVar = this.f44485c;
        mVar.k(mVar.a().e(new bb(bm.r, eVar)));
    }

    @Override // com.waze.uid.e.f
    public final boolean h(com.waze.uid.e.e eVar) {
        return eVar == com.waze.uid.e.e.f44481a && ((UidModel) this.f44485c.b()).getFlowType() == FlowType.EDIT_ID && com.waze.uid.d.q.f44463a.a().a().g();
    }

    @Override // com.waze.uid.e.f, com.waze.uid.b.h
    public final void o(com.waze.tide.s sVar) {
        h.g.b.x.f(sVar, NotificationCompat.CATEGORY_EVENT);
        if (!(sVar instanceof com.waze.uid.state_impl.b.c)) {
            super.o(sVar);
        } else {
            ((UidModel) this.f44485c.b()).getEmailParameters().setVerificationToken(((com.waze.uid.state_impl.b.c) sVar).a());
            k();
        }
    }
}
