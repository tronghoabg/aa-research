package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class rbv extends defpackage.rce {
    public rbv(defpackage.rbw rbwVar) {
        super(rbwVar, android.os.Looper.getMainLooper());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Handler
    public final void handleMessage(android.os.Message message) {
        java.lang.Object[] objArr = 0;
        if (defpackage.omv.c("CAR.CLIENT.PLS", 2)) {
            defpackage.rrx.d(2, "CAR.CLIENT.PLS", null, "Handling message: %s", message);
        }
        defpackage.rbw rbwVar = (defpackage.rbw) v();
        if (rbwVar == null) {
            defpackage.rrx.d(6, "CAR.CLIENT.PLS", null, "Dropping message %s", message);
            return;
        }
        int i = message.what;
        if (i == 0) {
            android.util.Pair pair = (android.util.Pair) message.obj;
            defpackage.rar rarVar = (defpackage.rar) pair.first;
            defpackage.rex rexVar = new defpackage.rex((defpackage.qvl) pair.second, new defpackage.ren(rbwVar));
            defpackage.rei reiVar = new defpackage.rei(rexVar, android.os.Looper.getMainLooper());
            defpackage.rbu rbuVar = new defpackage.rbu(reiVar, rexVar);
            defpackage.reh rehVar = rbwVar.b;
            if (rehVar != null) {
                ((defpackage.rex) rehVar).e(false);
            }
            rbwVar.c = rbuVar;
            rbwVar.b = rexVar;
            rbwVar.f = new defpackage.kwv((defpackage.qsh) rbuVar);
            try {
                if (reiVar.N("car_force_logging")) {
                    defpackage.omv.a = true;
                }
            } catch (defpackage.qst e) {
                defpackage.rrx.b("CAR.CLIENT.PLS", e, "Failed to read loggable key");
            }
            if (defpackage.omv.c("CAR.CLIENT.PLS", 3)) {
                boolean z = defpackage.rrx.a;
                defpackage.rrx.d(3, "CAR.CLIENT.PLS", null, "Projection start", new java.lang.Object[0]);
            }
            defpackage.ysr.bk(rbwVar.f != null, "configure() must be called before onProjectionStartNew!");
            android.os.Bundle bundle = new android.os.Bundle();
            defpackage.qsh qshVar = rbwVar.c;
            qshVar.getClass();
            rbwVar.g(bundle, qshVar);
            try {
                rarVar.f(1, bundle);
                defpackage.qsh qshVar2 = rbwVar.c;
                qshVar2.getClass();
                rbwVar.c(qshVar2);
                return;
            } catch (android.os.RemoteException unused) {
                return;
            }
        }
        if (i == 1) {
            rbwVar.a();
            return;
        }
        if (i == 2) {
            android.util.Pair pair2 = (android.util.Pair) message.obj;
            android.os.Bundle bundle2 = (android.os.Bundle) pair2.first;
            defpackage.rar rarVar2 = (defpackage.rar) pair2.second;
            if (defpackage.omv.c("CAR.CLIENT.PLS", 3)) {
                boolean z2 = defpackage.rrx.a;
                defpackage.rrx.d(3, "CAR.CLIENT.PLS", null, "Preflight start", new java.lang.Object[0]);
            }
            defpackage.ysr.bk(rbwVar.f != null, "configure() must be called before onAuthorizationStart!");
            rbwVar.j(rbwVar.c, bundle2, new defpackage.ntl(rarVar2));
            return;
        }
        if (i != 3) {
            if (i != 4) {
                defpackage.rrx.d(5, "CAR.CLIENT.PLS", null, "Unknown message %s", message);
                return;
            } else {
                rbwVar.b((defpackage.rar) message.obj);
                return;
            }
        }
        defpackage.rar rarVar3 = (defpackage.rar) message.obj;
        if (defpackage.omv.c("CAR.CLIENT.PLS", 3)) {
            boolean z3 = defpackage.rrx.a;
            defpackage.rrx.d(3, "CAR.CLIENT.PLS", null, "Projection ready", new java.lang.Object[0]);
        }
        rbwVar.d = new defpackage.rbt((java.lang.Object) rbwVar, (java.lang.Object) rarVar3, (int) (objArr == true ? 1 : 0));
        rbwVar.e = false;
        try {
            rarVar3.asBinder().linkToDeath(rbwVar.d, 0);
            rbwVar.f();
        } catch (android.os.RemoteException unused2) {
            defpackage.rrx.d(5, "CAR.CLIENT.PLS", null, "Couldn't link to death!", new java.lang.Object[0]);
            rbwVar.h();
            rbwVar.a();
        }
    }
}
