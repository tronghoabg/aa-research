package defpackage;

import android.content.Intent;
import androidx.car.app.SessionInfo;
import com.google.android.apps.auto.components.messaging.template.MessagingCarAppService;

/* loaded from: classes2.dex */
public final class lyc extends qz {
    final /* synthetic */ SessionInfo c;
    final /* synthetic */ MessagingCarAppService d;

    public lyc(SessionInfo sessionInfo, MessagingCarAppService messagingCarAppService) {
        this.c = sessionInfo;
        this.d = messagingCarAppService;
    }

    @Override // defpackage.qz
    public final qw b(Intent intent) {
        thj thjVar;
        intent.getClass();
        lxw.c();
        SessionInfo sessionInfo = this.c;
        luh luhVarB = lxw.b(sessionInfo.getSessionId());
        if (mcd.A().r(this.d.getApplicationContext(), sessionInfo.getSessionId())) {
            lxr.e();
            lxr.g(yzz.MESSAGING_APP, yzy.nt, luhVarB.e().a);
            qn qnVarA = a();
            int i = lxx.a;
            thn thnVar = new thn(new lpx(luhVarB, 19));
            String packageName = luhVarB.e().a.getPackageName();
            packageName.getClass();
            thjVar = new thj(qnVarA, thnVar, new hgf((Object) packageName, (Object) qnVarA, (Object) luhVarB, 16, (byte[]) null), (byte[]) null);
        } else {
            qn qnVarA2 = a();
            String packageName2 = luhVarB.e().a.getPackageName();
            packageName2.getClass();
            luj lujVarE = luhVarB.e();
            int i2 = lxx.a;
            thjVar = new thj(qnVarA2, packageName2, new lxz(lujVarE, 1), new lpx(luhVarB, 20));
        }
        thjVar.b.c(new lyi(luhVarB.e()));
        return thjVar;
    }
}
