package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class ryp extends defpackage.rip {
    final /* synthetic */ defpackage.rys a;

    public ryp(defpackage.rys rysVar) {
        this.a = rysVar;
    }

    @Override // defpackage.rip
    public final void a(android.content.Intent intent) {
        try {
            defpackage.rys rysVar = this.a;
            java.lang.String action = intent.getAction();
            if (android.app.UiModeManager.ACTION_ENTER_CAR_MODE.equals(action)) {
                defpackage.rys.a.l().ai(8552).u("ACTION_ENTER_CAR_MODE");
                rysVar.h(defpackage.ryq.e);
                return;
            }
            if (android.app.UiModeManager.ACTION_EXIT_CAR_MODE.equals(action)) {
                defpackage.rys.a.l().ai(8551).u("ACTION_EXIT_CAR_MODE");
                rysVar.h(defpackage.ryq.a);
                return;
            }
            if ("com.google.android.gms.car.PROJECTION_STARTED".equals(action)) {
                defpackage.rys.a.l().ai(8550).u("PROJECTION_STARTED");
                rysVar.h(defpackage.ryq.e);
                return;
            }
            if ("com.google.android.gms.car.PROJECTION_ENDED".equals(action)) {
                defpackage.rys.a.l().ai(8549).u("PROJECTION_ENDED");
                rysVar.h(defpackage.ryq.a);
                return;
            }
            if (rysVar.g == defpackage.ryq.e) {
                return;
            }
            java.lang.String action2 = intent.getAction();
            if ("com.google.android.gms.car.FIRST_ACTIVITY".equals(action2)) {
                defpackage.rsm rsmVar = (defpackage.rsm) defpackage.omv.f(intent, defpackage.rsm.values());
                defpackage.rys.a.l().ai(8556).y("FIRST_ACTIVITY_LAUNCHED with reason: %s", rsmVar);
                defpackage.ryq ryqVar = rysVar.g;
                defpackage.ryq ryqVar2 = defpackage.ryq.d;
                if (ryqVar != ryqVar2) {
                    if (defpackage.rys.c.contains(rsmVar)) {
                        rysVar.h(defpackage.ryq.a);
                        return;
                    } else {
                        rysVar.h(ryqVar2);
                        return;
                    }
                }
                return;
            }
            if ("com.google.android.gms.car.FRX".equals(action2)) {
                defpackage.rys.a.l().ai(8555).y("FRX %s", (defpackage.rsr) defpackage.omv.f(intent, defpackage.rsr.values()));
                rysVar.h(defpackage.ryq.a);
            } else {
                if (!defpackage.rys.b.contains(action2)) {
                    defpackage.rys.a.h().ai(8553).y("received unexpected intent %s", action2);
                    return;
                }
                defpackage.rsr rsrVar = (defpackage.rsr) defpackage.omv.f(intent, defpackage.rsr.values());
                defpackage.rys.a.l().ai(8554).M("%s %s", action2, rsrVar);
                if (rsrVar == defpackage.rsr.c) {
                    rysVar.h(defpackage.ryq.a);
                }
            }
        } catch (defpackage.rsn e) {
            defpackage.rys.a.h().ai(8547).M("received %s with invalid state: %s", intent.getAction(), e.getMessage());
        }
    }
}
