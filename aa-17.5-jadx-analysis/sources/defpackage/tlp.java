package defpackage;

import android.content.Intent;
import androidx.car.app.SessionInfo;

/* loaded from: classes3.dex */
public final class tlp extends qz {
    final /* synthetic */ SessionInfo c;
    final /* synthetic */ tlq d;

    public tlp(SessionInfo sessionInfo, tlq tlqVar) {
        this.c = sessionInfo;
        this.d = tlqVar;
    }

    @Override // defpackage.qz
    public final qw b(Intent intent) {
        intent.getClass();
        String sessionId = this.c.getSessionId();
        sessionId.getClass();
        ((ynz) tlq.c.f().ai(9084)).y("Creating remote screen %s", sessionId);
        tlm tlmVarE = this.d.e(sessionId, this);
        tlo tloVar = new tlo(tlmVarE, a());
        eqc eqcVar = tloVar.b;
        eqcVar.c(new tln());
        eqcVar.c(tlmVarE);
        ahnc.d(dty.f(tloVar), null, 0, new bqi(this, tlmVarE, tloVar, (afck) null, 17), 3);
        return tloVar;
    }
}
