package com.waze.uid.state_impl.username_login;

import androidx.core.app.NotificationCompat;
import com.waze.R;
import com.waze.sharedui.api.EmailConsent;
import com.waze.tide.s;
import com.waze.uid.UidModel;
import com.waze.uid.b.v;
import com.waze.uid.c.bb;
import com.waze.uid.c.bm;
import com.waze.uid.state_impl.username_login.LoginParameters;
import com.waze.uid.state_impl.util.InstallParameters;
import h.ab;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class i extends com.waze.uid.e.f implements com.waze.uid.b.h {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(com.waze.uid.e.b bVar, com.waze.uid.e.h hVar, com.waze.uid.b.m mVar) {
        super("InputEmailOrUsername", bVar, hVar, mVar);
        x.f(bVar, "trace");
        x.f(mVar, "controller");
    }

    static final ab a(i iVar) {
        iVar.k();
        return ab.f48028a;
    }

    @Override // com.waze.uid.e.f
    public final void f(com.waze.uid.e.e eVar) {
        super.f(eVar);
        if (eVar == com.waze.uid.e.e.f44482b) {
            com.waze.uid.b.m mVar = this.f44485c;
            ((UidModel) mVar.b()).getInstallParameters().result = null;
            ((UidModel) mVar.b()).getEmailParameters().resetPinCodeDetails();
        }
        com.waze.uid.b.m mVar2 = this.f44485c;
        mVar2.k(mVar2.a().e(new bb(bm.m, eVar)));
    }

    @Override // com.waze.uid.e.f
    public final boolean h(com.waze.uid.e.e eVar) {
        return eVar != com.waze.uid.e.e.f44481a || ((UidModel) this.f44485c.b()).getEmailParameters().getPinCodeToken().length() <= 0;
    }

    @Override // com.waze.uid.e.f
    public final boolean j() {
        com.waze.uid.b.m mVar = this.f44485c;
        ((UidModel) mVar.b()).getEmailParameters().reset();
        ((UidModel) mVar.b()).getLoginParameters().reset();
        return super.j();
    }

    @Override // com.waze.uid.e.f, com.waze.uid.b.h
    public final void o(s sVar) {
        x.f(sVar, NotificationCompat.CATEGORY_EVENT);
        if (!(sVar instanceof q)) {
            if (sVar instanceof a) {
                com.waze.uid.b.m mVar = this.f44485c;
                ((UidModel) mVar.b()).getLoginParameters().setLoginOption(LoginParameters.LOGIN_OPTION.GOOGLE);
                ((UidModel) mVar.b()).getInstallParameters().result = InstallParameters.Result.LOGIN;
                k();
                return;
            }
            if (!(sVar instanceof com.waze.uid.b.c)) {
                super.o(sVar);
                return;
            } else {
                ((UidModel) this.f44485c.b()).getInstallParameters().result = null;
                super.o(sVar);
                return;
            }
        }
        q qVar = (q) sVar;
        String strB = qVar.b();
        int iA = qVar.a();
        if (iA == 0) {
            com.waze.uid.b.m mVar2 = this.f44485c;
            ((UidModel) mVar2.b()).getLoginParameters().setLoginOption(LoginParameters.LOGIN_OPTION.EMAIL);
            ((UidModel) mVar2.b()).getEmailParameters().setEmailAddress(strB);
            ((UidModel) mVar2.b()).getEmailParameters().setConsent(EmailConsent.None);
            com.waze.uid.d.c cVar = com.waze.uid.d.q.f44463a.a().f44464b;
            com.waze.uid.e.d dVarB = mVar2.b();
            x.e(dVarB, "<get-model>(...)");
            bm bmVar = bm.m;
            x.e(mVar2, "controller");
            cVar.b((UidModel) dVarB, com.waze.ui.v.f.l(bmVar, mVar2, new v(R.string.NO_CONNECTION_ERROR, R.drawable.toast_error, null), new h(this, 0), new com.waze.ui.r.a.e.c(13)));
        } else {
            if (iA != 1) {
                throw new RuntimeException("UsernameEmailState wrong type");
            }
            com.waze.uid.b.m mVar3 = this.f44485c;
            ((UidModel) mVar3.b()).getLoginParameters().setLoginOption(LoginParameters.LOGIN_OPTION.USERNAME);
            ((UidModel) mVar3.b()).getLoginParameters().setUsername(strB);
            k();
        }
        ((UidModel) this.f44485c.b()).getInstallParameters().result = InstallParameters.Result.LOGIN;
    }
}
