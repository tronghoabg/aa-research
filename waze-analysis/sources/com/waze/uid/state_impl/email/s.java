package com.waze.uid.state_impl.email;

import androidx.core.app.NotificationCompat;
import com.waze.R;
import com.waze.sharedui.api.PinCodeStatus;
import com.waze.uid.UidModel;
import com.waze.uid.c.bb;
import com.waze.uid.c.bm;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class s extends com.waze.uid.e.f implements com.waze.uid.b.h {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(com.waze.uid.e.b bVar, com.waze.uid.e.h hVar, com.waze.uid.b.m mVar) {
        super("PinErrorState", bVar, hVar, mVar);
        h.g.b.x.f(bVar, "trace");
        h.g.b.x.f(mVar, "controller");
    }

    static final h.ab a(s sVar) {
        sVar.k();
        return h.ab.f48028a;
    }

    static final h.ab b(s sVar) {
        com.waze.uid.b.m mVar = sVar.f44485c;
        mVar.k(mVar.a().b(null));
        return h.ab.f48028a;
    }

    @Override // com.waze.uid.e.f
    public final void f(com.waze.uid.e.e eVar) {
        super.f(eVar);
        com.waze.uid.b.m mVar = this.f44485c;
        mVar.k(mVar.a().e(new bb(bm.f44289j, null)));
    }

    @Override // com.waze.uid.e.f, com.waze.uid.b.h
    public final void o(com.waze.tide.s sVar) {
        h.g.b.x.f(sVar, NotificationCompat.CATEGORY_EVENT);
        if (sVar instanceof aa) {
            com.waze.uid.b.m mVar = this.f44485c;
            if (((UidModel) mVar.b()).getEmailParameters().getPinCodeToken().length() <= 0) {
                mVar.k(mVar.a().e(new bb(bm.f44289j, null)));
                return;
            } else {
                mVar.w(new com.waze.uid.b.v(R.string.VERIFY_EMAIL_SENT_MSG, R.drawable.toast_check, null));
                k();
                return;
            }
        }
        if (!(sVar instanceof v)) {
            if (!(sVar instanceof com.waze.uid.b.c)) {
                super.o(sVar);
                return;
            } else {
                ((UidModel) this.f44485c.b()).getEmailParameters().setPinCodeStatus(PinCodeStatus.UNKNOWN);
                j();
                return;
            }
        }
        com.waze.uid.b.m mVar2 = this.f44485c;
        mVar2.k(mVar2.a().b(new com.waze.uid.b.n((byte[]) null)));
        com.waze.uid.d.c cVar = com.waze.uid.d.q.f44463a.a().f44464b;
        com.waze.uid.e.d dVarB = mVar2.b();
        h.g.b.x.e(dVarB, "<get-model>(...)");
        bm bmVar = bm.f44289j;
        h.g.b.x.e(mVar2, "controller");
        cVar.b((UidModel) dVarB, com.waze.ui.v.f.l(bmVar, mVar2, null, new n(this, 2), new n(this, 3)));
    }
}
