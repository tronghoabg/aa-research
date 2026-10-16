package com.waze.uid.state_impl.g;

import androidx.core.app.NotificationCompat;
import com.waze.config.ConfigValues;
import com.waze.ui.w.ai;
import com.waze.uid.UidModel;
import com.waze.uid.state_impl.username_login.LoginParameters;
import com.waze.uid.state_impl.util.InstallParameters;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class v extends com.waze.uid.e.f {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(com.waze.uid.e.b bVar, com.waze.uid.e.h hVar, com.waze.uid.b.m mVar) {
        super("WelcomeState", bVar, hVar, mVar);
        h.g.b.x.c(mVar);
    }

    @Override // com.waze.uid.e.f
    public final void f(com.waze.uid.e.e eVar) {
        h.g.b.x.f(eVar, "dir");
        super.f(eVar);
        com.waze.uid.b.m mVar = this.f44485c;
        mVar.k(mVar.a().e(ai.s(x.f44699a, eVar)));
        if (((UidModel) mVar.b()).getEmailParameters().getPinCodeToken().length() > 0) {
            k();
        }
    }

    @Override // com.waze.uid.e.f
    public final boolean h(com.waze.uid.e.e eVar) {
        InstallParameters installParameters;
        UidModel uidModel = (UidModel) this.f44485c.b();
        InstallParameters.Result result = null;
        if (uidModel != null && (installParameters = uidModel.getInstallParameters()) != null) {
            result = installParameters.result;
        }
        return result != InstallParameters.Result.RECOVERY;
    }

    @Override // com.waze.uid.e.f, com.waze.uid.b.h
    public final void o(com.waze.tide.s sVar) {
        h.g.b.x.f(sVar, NotificationCompat.CATEGORY_EVENT);
        if (sVar instanceof u) {
            ((UidModel) this.f44485c.b()).getInstallParameters().result = InstallParameters.Result.LOGIN;
            k();
            return;
        }
        if (sVar instanceof t) {
            k();
            return;
        }
        if (!(sVar instanceof r)) {
            super.o(sVar);
            return;
        }
        r rVar = (r) sVar;
        com.waze.shared_infra.i.h.j("automation login: username=".concat(String.valueOf(rVar.b())));
        ConfigValues.CONFIG_VALUE_SIGNUP_AUTOMATION_QUICK_LOGIN.d(true);
        com.waze.uid.b.m mVar = this.f44485c;
        ((UidModel) mVar.b()).getInstallParameters().result = InstallParameters.Result.AUTOMATION_LOGIN;
        ((UidModel) mVar.b()).getLoginParameters().setLoginOption(LoginParameters.LOGIN_OPTION.USERNAME);
        ((UidModel) mVar.b()).getLoginParameters().setUsername(rVar.b());
        ((UidModel) mVar.b()).getLoginParameters().setPassword(rVar.a());
        k();
    }
}
