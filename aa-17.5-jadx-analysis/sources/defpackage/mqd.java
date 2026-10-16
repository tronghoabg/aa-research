package defpackage;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import androidx.car.app.SessionInfo;
import com.google.android.apps.auto.components.system.applauncher.LauncherCarAppService;

/* loaded from: classes2.dex */
public final class mqd extends jsf {
    private static final yph q = yph.c("GH.AppLauncherActivity");

    private final void V(Intent intent) {
        l(intent, mpl.b(new ComponentName(getBaseContext(), (Class<?>) LauncherCarAppService.class)));
    }

    @Override // defpackage.jsf, defpackage.jrh, defpackage.ouv, defpackage.qru, defpackage.qrq, defpackage.qqh
    public final void a(Bundle bundle) {
        ((ype) q.l().ai((char) 5181)).u("onCreate");
        super.a(bundle);
        if (acxy.w()) {
            nfy.a().c(ngb.g);
        }
        kwv kwvVarH = kfl.h();
        abnp abnpVarN = osw.a.n();
        osv osvVar = osv.GEARHEAD_LAUNCHER_SHOWN;
        abnpVarN.t();
        osw oswVar = (osw) abnpVarN.b;
        oswVar.c = osvVar.C;
        oswVar.b |= 1;
        kwvVarH.v((osw) abnpVarN.q());
    }

    @Override // defpackage.jsf
    public final SessionInfo b() {
        return SessionInfo.DEFAULT_SESSION_INFO;
    }

    @Override // defpackage.jsf, defpackage.qrq, defpackage.qqh
    public final void e(Intent intent) {
        V(intent);
        super.e(intent);
    }

    @Override // defpackage.qqh
    public final Intent q() {
        Intent intentQ = super.q();
        V(intentQ);
        return intentQ;
    }
}
