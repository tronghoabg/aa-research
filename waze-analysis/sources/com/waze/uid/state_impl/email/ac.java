package com.waze.uid.state_impl.email;

import androidx.core.app.NotificationCompat;
import com.waze.R;
import com.waze.uid.FlowType;
import com.waze.uid.UidModel;
import com.waze.uid.c.bb;
import com.waze.uid.c.bm;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ac extends com.waze.uid.e.f implements com.waze.uid.b.h {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ac(com.waze.uid.e.b bVar, com.waze.uid.e.h hVar, com.waze.uid.b.m mVar) {
        super("VerifyEmailState", bVar, hVar, mVar);
        h.g.b.x.f(bVar, "trace");
        h.g.b.x.f(mVar, "controller");
    }

    static final h.ab a(ac acVar) {
        acVar.k();
        return h.ab.f48028a;
    }

    static final h.ab b(ac acVar) {
        com.waze.uid.b.m mVar = acVar.f44485c;
        mVar.k(mVar.a().b(null));
        return h.ab.f48028a;
    }

    @Override // com.waze.uid.e.f
    public final void f(com.waze.uid.e.e eVar) {
        super.f(eVar);
        com.waze.uid.e.e eVar2 = com.waze.uid.e.e.f44481a;
        if (eVar == eVar2) {
            com.waze.uid.b.m mVar = this.f44485c;
            if (((UidModel) mVar.b()).getFlowType() != FlowType.EDIT_ID) {
                EmailParameters emailParameters = ((UidModel) mVar.b()).getEmailParameters();
                String strE = com.waze.sharedui.profile.b.a().e();
                if (strE == null) {
                    strE = "";
                }
                emailParameters.setEmailAddress(strE);
            }
        }
        if (eVar == eVar2 && ((UidModel) this.f44485c.b()).getAuthParameters().getToken().length() > 0) {
            k();
            return;
        }
        com.waze.uid.b.m mVar2 = this.f44485c;
        mVar2.k(mVar2.a().e(new bb(bm.f44286g, null, eVar)));
        ((UidModel) mVar2.b()).getEmailParameters().setContinuedAsGuest(false);
    }

    @Override // com.waze.uid.e.f
    public final boolean h(com.waze.uid.e.e eVar) {
        return eVar == null || eVar.ordinal() != 0 || ((UidModel) this.f44485c.b()).getEmailParameters().getPinCodeToken().length() == 0;
    }

    @Override // com.waze.uid.e.f, com.waze.uid.b.h
    public final void o(com.waze.tide.s sVar) {
        h.g.b.x.f(sVar, NotificationCompat.CATEGORY_EVENT);
        if (!(sVar instanceof z)) {
            if (!(sVar instanceof com.waze.uid.b.c)) {
                super.o(sVar);
                return;
            } else {
                ((UidModel) this.f44485c.b()).getEmailParameters().setPinCodeToken("");
                j();
                return;
            }
        }
        com.waze.uid.b.m mVar = this.f44485c;
        z zVar = (z) sVar;
        ((UidModel) mVar.b()).getEmailParameters().setEmailAddress(zVar.b());
        ((UidModel) mVar.b()).getEmailParameters().setConsent(zVar.a());
        mVar.k(mVar.a().b(new com.waze.uid.b.n((byte[]) null)));
        int i2 = com.waze.sharedui.b.d.f38836a;
        com.waze.sharedui.b.c.a().reportAuditEvent(com.waze.uid.a.a.f44033a.a(zVar.a().getConfigString()));
        com.waze.uid.d.c cVar = com.waze.uid.d.q.f44463a.a().f44464b;
        com.waze.uid.e.d dVarB = mVar.b();
        h.g.b.x.e(dVarB, "<get-model>(...)");
        bm bmVar = bm.f44286g;
        h.g.b.x.e(mVar, "controller");
        cVar.b((UidModel) dVarB, com.waze.ui.v.f.l(bmVar, mVar, new com.waze.uid.b.v(R.string.NO_CONNECTION_ERROR, R.drawable.toast_error, null), new n(this, 4), new n(this, 5)));
    }
}
