package defpackage;

import android.content.Context;
import android.os.Process;

/* loaded from: classes.dex */
public final class rds implements zge {
    final /* synthetic */ rdm a;
    final /* synthetic */ int b;
    final /* synthetic */ qsz c;

    public rds(qsz qszVar, rdm rdmVar, int i) {
        this.a = rdmVar;
        this.b = i;
        this.c = qszVar;
    }

    @Override // defpackage.zge
    public final void a(Throwable th) {
        if (rrd.e("CAR.TOKEN", 4)) {
            zjc zjcVar = zjc.a;
            rrd.d(4, "CAR.TOKEN", null, "Failed to connect %s using %s (cx attempt %s)", new zjd(zjcVar, this), new zjd(zjcVar, this.a), new zjd(zjcVar, Integer.valueOf(this.b)));
        }
    }

    @Override // defpackage.zge
    public final /* synthetic */ void b(Object obj) {
        if (rrd.e("CAR.TOKEN", 4)) {
            zjc zjcVar = zjc.a;
            rrd.d(4, "CAR.TOKEN", null, "Successfully connected %s using %s (cx attempt %s)", new zjd(zjcVar, this), new zjd(zjcVar, this.a), new zjd(zjcVar, Integer.valueOf(this.b)));
        }
        qsz qszVar = this.c;
        if (!qszVar.b()) {
            rrd.d(5, "CAR.TOKEN", null, "Reached connection callbacks, but token not currently connected!", new Object[0]);
            return;
        }
        new sss(qszVar.e).post(new nwg(qszVar, 14));
        this.a.F(qszVar.d);
        Context context = qszVar.a;
        if (qszVar.g == 1) {
            rrd.d(4, "CAR.TOKEN", null, "Token caller not specified, so skipping telemetry logging. Process: %s", rbe.c(context, Process.myPid()));
            return;
        }
        abnp abnpVarN = ywz.a.n();
        abnpVarN.t();
        ywz ywzVar = (ywz) abnpVarN.b;
        ywzVar.b |= 1;
        ywzVar.c = 1;
        abnpVarN.t();
        ywz ywzVar2 = (ywz) abnpVarN.b;
        ywzVar2.b = 4 | ywzVar2.b;
        ywzVar2.d = true;
        String strC = rbe.c(context, Process.myPid());
        abnpVarN.t();
        ywz ywzVar3 = (ywz) abnpVarN.b;
        strC.getClass();
        ywzVar3.b |= 16;
        ywzVar3.e = strC;
        ywz ywzVar4 = (ywz) abnpVarN.q();
        abnp abnpVarN2 = yxb.a.n();
        abnpVarN2.t();
        yxb yxbVar = (yxb) abnpVarN2.b;
        ywzVar4.getClass();
        yxbVar.T = ywzVar4;
        yxbVar.c |= 2097152;
        try {
            qszVar.d().m(((yxb) abnpVarN2.q()).h(), yxc.CAR_CLIENT_CONNECTION);
        } catch (qrz unused) {
            rrd.b("CAR.TOKEN", null, "Failed to log connection event.");
        }
    }
}
