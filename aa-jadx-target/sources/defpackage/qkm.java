package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class qkm implements defpackage.mkl {
    final /* synthetic */ defpackage.qko a;

    public qkm(defpackage.qko qkoVar) {
        this.a = qkoVar;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: rlo */
    /* JADX WARN: Type inference failed for: r0v31, types: [java.lang.Object, qwn] */
    /* JADX WARN: Type inference failed for: r0v33, types: [java.lang.Object, qwn] */
    @Override // defpackage.mkl
    public final void a(defpackage.mkh mkhVar) throws rlo, android.os.RemoteException {
        defpackage.qkn qknVar;
        com.google.android.gms.car.CarInfo carInfo;
        java.lang.String str;
        java.lang.String strH;
        java.lang.String strI;
        defpackage.qko qkoVar = this.a;
        try {
            ((defpackage.yqj) defpackage.qko.a.l().ai(7437)).u("Notifying shared service of start");
            qkoVar.b = mkhVar;
            try {
                defpackage.mkp.a.g();
                defpackage.rov rovVarJ = defpackage.oml.j(defpackage.kit.b().e());
                if (defpackage.omv.c("CAR.BT", 3)) {
                    defpackage.rrx.a("CAR.BT", null, "getCarBluetoothEndpointAddress");
                }
                try {
                    strH = rovVarJ.a.h();
                } catch (android.os.RemoteException | java.lang.IllegalStateException e) {
                    rovVarJ.a(e);
                    strH = null;
                }
                if (defpackage.omv.c("CAR.BT", 3)) {
                    defpackage.rrx.a("CAR.BT", null, "getStartingCarBluetoothAddress");
                }
                try {
                    strI = rovVarJ.a.i();
                } catch (android.os.RemoteException | java.lang.IllegalStateException e2) {
                    rovVarJ.a(e2);
                    strI = null;
                }
                qknVar = new defpackage.qkn(strH, strI);
            } catch (defpackage.qst | defpackage.qsu e3) {
                ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) defpackage.qko.a.h()).p(e3)).ai((char) 7434)).u("Error getting car bluetooth connection manager.");
                qknVar = new defpackage.qkn(null, null);
            }
            defpackage.mkh mkhVar2 = qkoVar.b;
            android.os.IBinder iBinder = qkoVar.c;
            com.google.android.gms.car.CarInfo carInfoB = defpackage.kiv.a().b();
            if (carInfoB == null) {
                try {
                    defpackage.mkp.a.f();
                    carInfoB = defpackage.ooa.d(defpackage.kit.b().e());
                    carInfo = carInfoB;
                } catch (defpackage.qst e4) {
                    ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) defpackage.qko.a.h()).p(e4)).ai((char) 7435)).u("Failed to get car info.");
                    carInfo = null;
                }
            } else {
                carInfo = carInfoB;
            }
            java.lang.String str2 = qknVar.a;
            java.lang.String str3 = qknVar.b;
            java.lang.String strC = defpackage.kiv.a().c();
            if (strC == null) {
                try {
                    defpackage.mkp.a.f();
                    strC = java.lang.String.valueOf(defpackage.ooa.c(defpackage.kit.b().e()));
                    str = strC;
                } catch (defpackage.qst e5) {
                    ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) defpackage.qko.a.h()).p(e5)).ai((char) 7436)).u("Error getting car connection type.");
                    str = null;
                }
            } else {
                str = strC;
            }
            mkhVar2.f(new com.google.android.apps.auto.components.car.info.StartingProcessInfo(iBinder, carInfo, str2, str3, str));
        } catch (android.os.RemoteException e6) {
            ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) defpackage.qko.a.h()).p(e6)).ai((char) 7438)).u("Error calling startingProcess()");
            qkoVar.b = null;
        }
    }

    @Override // defpackage.mkl
    public final void b() {
        ((defpackage.yqj) defpackage.qko.a.l().ai((char) 7439)).u("Service disconnected");
        this.a.b = null;
    }
}
