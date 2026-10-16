package defpackage;

import android.app.UiModeManager;
import android.content.Intent;

/* loaded from: classes.dex */
final class rxv extends rht {
    final /* synthetic */ rxy a;

    public rxv(rxy rxyVar) {
        this.a = rxyVar;
    }

    @Override // defpackage.rht
    public final void a(Intent intent) {
        try {
            rxy rxyVar = this.a;
            String action = intent.getAction();
            if (UiModeManager.ACTION_ENTER_CAR_MODE.equals(action)) {
                rxy.a.l().ai(8527).u("ACTION_ENTER_CAR_MODE");
                rxyVar.h(rxw.e);
                return;
            }
            if (UiModeManager.ACTION_EXIT_CAR_MODE.equals(action)) {
                rxy.a.l().ai(8526).u("ACTION_EXIT_CAR_MODE");
                rxyVar.h(rxw.a);
                return;
            }
            if ("com.google.android.gms.car.PROJECTION_STARTED".equals(action)) {
                rxy.a.l().ai(8525).u("PROJECTION_STARTED");
                rxyVar.h(rxw.e);
                return;
            }
            if ("com.google.android.gms.car.PROJECTION_ENDED".equals(action)) {
                rxy.a.l().ai(8524).u("PROJECTION_ENDED");
                rxyVar.h(rxw.a);
                return;
            }
            if (rxyVar.g == rxw.e) {
                return;
            }
            String action2 = intent.getAction();
            if ("com.google.android.gms.car.FIRST_ACTIVITY".equals(action2)) {
                rrs rrsVar = (rrs) ols.J(intent, rrs.values());
                rxy.a.l().ai(8531).y("FIRST_ACTIVITY_LAUNCHED with reason: %s", rrsVar);
                rxw rxwVar = rxyVar.g;
                rxw rxwVar2 = rxw.d;
                if (rxwVar != rxwVar2) {
                    if (rxy.c.contains(rrsVar)) {
                        rxyVar.h(rxw.a);
                        return;
                    } else {
                        rxyVar.h(rxwVar2);
                        return;
                    }
                }
                return;
            }
            if ("com.google.android.gms.car.FRX".equals(action2)) {
                rxy.a.l().ai(8530).y("FRX %s", (rrx) ols.J(intent, rrx.values()));
                rxyVar.h(rxw.a);
            } else {
                if (!rxy.b.contains(action2)) {
                    rxy.a.h().ai(8528).y("received unexpected intent %s", action2);
                    return;
                }
                rrx rrxVar = (rrx) ols.J(intent, rrx.values());
                rxy.a.l().ai(8529).M("%s %s", action2, rrxVar);
                if (rrxVar == rrx.c) {
                    rxyVar.h(rxw.a);
                }
            }
        } catch (rrt e) {
            rxy.a.h().ai(8522).M("received %s with invalid state: %s", intent.getAction(), e.getMessage());
        }
    }
}
