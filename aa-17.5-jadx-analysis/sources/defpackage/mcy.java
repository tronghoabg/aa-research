package defpackage;

import android.content.ComponentName;
import android.content.Intent;
import com.google.android.gms.car.display.CarDisplayId;
import com.google.android.gms.car.display.CarRegionId;
import java.util.Map;

/* loaded from: classes.dex */
public final class mcy implements eqn {
    final /* synthetic */ mda a;

    public mcy(mda mdaVar) {
        this.a = mdaVar;
    }

    @Override // defpackage.eqn
    public final /* bridge */ /* synthetic */ void eS(Object obj) {
        mcx mcxVar = (mcx) obj;
        mcxVar.getClass();
        if (mcxVar.a == null || mcxVar.c) {
            return;
        }
        for (Map.Entry entry : mcxVar.b.entrySet()) {
            CarRegionId carRegionId = (CarRegionId) entry.getKey();
            mqc mqcVar = (mqc) entry.getValue();
            if (mqcVar.c && lxw.E().b(carRegionId)) {
                nsr nsrVarC = nsr.c();
                CarDisplayId carDisplayId = carRegionId.h;
                nso nsoVarA = nsrVarC.a(carDisplayId);
                if (CarDisplayId.b(carDisplayId) && nsoVarA.K()) {
                    mda.c.l().y("Stopping %s. Showing dashboard instead", mqcVar.a());
                    nrq.b().a().i();
                } else {
                    mpm.c();
                    ComponentName componentNameA = mpm.a(carDisplayId, nsoVarA.q, nsoVarA.k(carRegionId));
                    componentNameA.getClass();
                    mda.c.l().M("Stopping %s. Starting %s instead", mqcVar.a(), componentNameA);
                    mpe mpeVarA = mpe.a();
                    Intent intentA = mpl.b(componentNameA).a();
                    qql qqlVar = new qql();
                    qqlVar.e = carRegionId;
                    mpeVarA.k(intentA, qqlVar);
                }
                this.a.b(nsoVarA.k(carRegionId));
                ohs ohsVarJ = ebf.j();
                rrb rrbVarH = rrc.h(yxy.GEARHEAD, yzz.PARKED_APP, yzy.LL);
                rrbVarH.p(mqcVar.a());
                ohsVarJ.F(rrbVarH.l());
            }
        }
    }
}
