package com.waze.uid.state_impl.username_login;

import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.waze.R;
import com.waze.sharedui.api.t;
import com.waze.tide.s;
import com.waze.uid.UidModel;
import com.waze.uid.c.ba;
import com.waze.uid.c.bb;
import com.waze.uid.c.bm;
import com.waze.uid.state_impl.util.InstallParameters;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class m extends com.waze.uid.e.f implements com.waze.uid.b.h {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(com.waze.uid.e.b bVar, com.waze.uid.e.h hVar, com.waze.uid.b.m mVar) {
        super("PasswordLoginState", bVar, hVar, mVar);
        x.f(bVar, "trace");
        x.f(mVar, "controller");
    }

    private final void c() {
        com.waze.uid.b.m mVar = this.f44485c;
        if (TextUtils.isEmpty(((UidModel) mVar.b()).getLoginParameters().getPassword())) {
            mVar.w(new ba(R.string.LOGIN_PASSWORD_EMPTY));
            return;
        }
        mVar.k(mVar.a().e(new bb(bm.n)));
        t.f38827b.b(((UidModel) mVar.b()).getLoginParameters().getUsername(), ((UidModel) mVar.b()).getLoginParameters().getPassword(), new l(com.waze.uid.e.f.i(), this, 0));
    }

    @Override // com.waze.uid.e.f
    public final void f(com.waze.uid.e.e eVar) {
        super.f(eVar);
        com.waze.uid.b.m mVar = this.f44485c;
        mVar.k(mVar.a().e(new bb(bm.n, eVar)));
        if (eVar == com.waze.uid.e.e.f44481a && ((UidModel) mVar.b()).getInstallParameters().result == InstallParameters.Result.AUTOMATION_LOGIN) {
            c();
        }
    }

    @Override // com.waze.uid.e.f, com.waze.uid.b.h
    public final void o(s sVar) {
        x.f(sVar, NotificationCompat.CATEGORY_EVENT);
        if (!(sVar instanceof p)) {
            super.o(sVar);
        } else {
            ((UidModel) this.f44485c.b()).getLoginParameters().setPassword(((p) sVar).a());
            c();
        }
    }
}
