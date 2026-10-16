package defpackage;

import android.content.Intent;
import androidx.car.app.SessionInfo;

/* loaded from: classes2.dex */
public final class meb extends jsf {
    private final void V(Intent intent) {
        mqb mqbVarD = lvl.D(this);
        mqc mqcVarA = ogb.a.a().a();
        mqb mqbVar = mqcVarA != null ? mqcVarA.a : null;
        if (mqbVar != null) {
            mqbVarD = mqbVar;
        }
        jsf.l(intent, mqbVarD);
    }

    @Override // defpackage.jsf
    protected final SessionInfo b() {
        SessionInfo sessionInfo = SessionInfo.DEFAULT_SESSION_INFO;
        sessionInfo.getClass();
        return sessionInfo;
    }

    @Override // defpackage.jsf, defpackage.qrq, defpackage.qqh
    public final void e(Intent intent) {
        if (intent != null) {
            V(intent);
        } else {
            intent = null;
        }
        super.e(intent);
    }

    @Override // defpackage.qqh
    public final Intent q() {
        Intent intentQ = super.q();
        intentQ.getClass();
        V(intentQ);
        return intentQ;
    }
}
