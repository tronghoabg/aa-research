package defpackage;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.apps.auto.components.car.info.StartingProcessInfo;
import com.google.android.gms.car.CarInfo;

/* loaded from: classes.dex */
final class qjq implements mke {
    final /* synthetic */ qjs a;

    public qjq(qjs qjsVar) {
        this.a = qjsVar;
    }

    /* JADX WARN: Type inference failed for: r0v31, types: [java.lang.Object, qvr] */
    /* JADX WARN: Type inference failed for: r0v33, types: [java.lang.Object, qvr] */
    @Override // defpackage.mke
    public final void a(mka mkaVar) throws RemoteException {
        qjr qjrVar;
        CarInfo carInfo;
        String str;
        String strH;
        String strI;
        qjs qjsVar = this.a;
        try {
            ((ype) qjs.a.l().ai(7412)).u("Notifying shared service of start");
            qjsVar.b = mkaVar;
            try {
                mki.a.g();
                roa roaVarJ = ols.j(kio.b().e());
                if (omc.c("CAR.BT", 3)) {
                    rrd.a("CAR.BT", null, "getCarBluetoothEndpointAddress");
                }
                try {
                    strH = roaVarJ.a.h();
                } catch (RemoteException | IllegalStateException e) {
                    roaVarJ.a(e);
                    strH = null;
                }
                if (omc.c("CAR.BT", 3)) {
                    rrd.a("CAR.BT", null, "getStartingCarBluetoothAddress");
                }
                try {
                    strI = roaVarJ.a.i();
                } catch (RemoteException | IllegalStateException e2) {
                    roaVarJ.a(e2);
                    strI = null;
                }
                qjrVar = new qjr(strH, strI);
            } catch (qrz | qsa e3) {
                ((ype) ((ype) ((ype) qjs.a.h()).p(e3)).ai((char) 7409)).u("Error getting car bluetooth connection manager.");
                qjrVar = new qjr(null, null);
            }
            mka mkaVar2 = qjsVar.b;
            IBinder iBinder = qjsVar.c;
            CarInfo carInfoB = kiq.a().b();
            if (carInfoB == null) {
                try {
                    mki.a.f();
                    carInfoB = oni.d(kio.b().e());
                    carInfo = carInfoB;
                } catch (qrz e4) {
                    ((ype) ((ype) ((ype) qjs.a.h()).p(e4)).ai((char) 7410)).u("Failed to get car info.");
                    carInfo = null;
                }
            } else {
                carInfo = carInfoB;
            }
            String str2 = qjrVar.a;
            String str3 = qjrVar.b;
            String strC = kiq.a().c();
            if (strC == null) {
                try {
                    mki.a.f();
                    strC = String.valueOf(oni.c(kio.b().e()));
                    str = strC;
                } catch (qrz e5) {
                    ((ype) ((ype) ((ype) qjs.a.h()).p(e5)).ai((char) 7411)).u("Error getting car connection type.");
                    str = null;
                }
            } else {
                str = strC;
            }
            mkaVar2.f(new StartingProcessInfo(iBinder, carInfo, str2, str3, str));
        } catch (RemoteException e6) {
            ((ype) ((ype) ((ype) qjs.a.h()).p(e6)).ai((char) 7413)).u("Error calling startingProcess()");
            qjsVar.b = null;
        }
    }

    @Override // defpackage.mke
    public final void b() {
        ((ype) qjs.a.l().ai((char) 7414)).u("Service disconnected");
        this.a.b = null;
    }
}
