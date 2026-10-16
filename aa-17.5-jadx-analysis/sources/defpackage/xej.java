package defpackage;

import android.app.ActivityManager;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class xej extends jrh implements rzz {
    private static final yph b = yph.c("GH.OEMExitActivity");
    sab a;

    private final void l() {
        if (ActivityManager.isUserAMonkey()) {
            mpx.d();
            kio.b().e();
            mpe.a().i(new Intent());
            return;
        }
        ebf.j().f(rrc.h(yxy.GEARHEAD, yzz.EXIT_APP, yzy.lk));
        qqi qqiVar = this.e;
        qqo qqoVar = ((qqm) (qqiVar != null ? ((rnw) qqiVar).f : null)).a;
        try {
            qxy qxyVar = ((rnw) qqoVar).i;
            if (qxyVar != null) {
                qxyVar.w();
            }
        } catch (RemoteException unused) {
            rbe.h(((rnw) qqoVar).d);
        }
    }

    @Override // defpackage.jrh, defpackage.ouv, defpackage.qru, defpackage.qrq, defpackage.qqh
    public final void a(Bundle bundle) {
        super.a(bundle);
        try {
            mki.a.g();
            this.a = ols.u(kio.b().e());
        } catch (qrz | qsa e) {
            tss.r("GH.OEMExitActivity", e, "Could not get car window manager", new Object[0]);
        }
        this.a.e(this);
        l();
    }

    @Override // defpackage.qrq, defpackage.qqh
    public final void e(Intent intent) {
        super.e(intent);
        l();
    }

    @Override // defpackage.rzz
    public final void i(boolean z) {
        ((ype) b.l().ai((char) 10162)).y("onVideoFocusChanged: hasVideoFocus %b", Boolean.valueOf(z));
        if (z) {
            ebf.j().f(rrc.h(yxy.GEARHEAD, yzz.EXIT_APP, yzy.ll));
            this.a.h(this);
        }
    }
}
