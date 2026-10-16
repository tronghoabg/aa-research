package defpackage;

import android.os.Build;
import com.google.android.gms.car.CarInfo;
import com.google.android.gms.carsetup.CarSetupServiceImpl;
import java.io.IOException;

/* loaded from: classes.dex */
public final /* synthetic */ class rsv implements Runnable {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ rsv(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // java.lang.Runnable
    public final void run() throws IOException {
        int i = 0;
        switch (this.b) {
            case 0:
                ruw ruwVar = (ruw) ((wyd) this.a).a;
                rus rusVar = ruwVar.f;
                if (rusVar != null) {
                    int i2 = ruwVar.e - 1;
                    ruwVar.e = i2;
                    if (i2 != 0) {
                        ruw.a.l().ai(8344).w("%d services remaining", i2);
                        return;
                    } else {
                        ruwVar.f = null;
                        rusVar.a();
                        return;
                    }
                }
                return;
            case 1:
                ((rqb) this.a).c();
                return;
            case 2:
                ((rvq) this.a).b();
                return;
            case 3:
                ((rvx) this.a).d.v();
                return;
            case 4:
                rxu rxuVar = (rxu) this.a;
                whk whkVar = rxuVar.g;
                if (whkVar != null) {
                    whkVar.a(!rxuVar.f);
                }
                if (rxuVar.f) {
                    return;
                }
                rxu.a.f().ai(8521).u("Detected charge only");
                ols.L(rxuVar.b, "com.google.android.gms.car.USB_ISSUE_FOUND", rrz.a, null);
                rxuVar.e = true;
                return;
            case 5:
                ((rxy) this.a).g(false);
                return;
            case 6:
                if (Build.VERSION.SDK_INT >= 30) {
                    return;
                }
                Object obj = this.a;
                adbr adbrVar = adbr.a;
                if (adbrVar.gu().q()) {
                    ((rxy) obj).i();
                    return;
                } else {
                    ((rxy) obj).g(adbrVar.gu().p());
                    return;
                }
            case 7:
                ((rxy) this.a).g(false);
                return;
            case 8:
                rxy rxyVar = (rxy) this.a;
                yfy yfyVar = rxyVar.d;
                if (!yfyVar.containsKey(rxyVar.g)) {
                    rxy.a.h().ai(8523).y("timeout handler ran for unexpected stage: %s", rxyVar.g);
                    return;
                }
                rxx rxxVar = (rxx) yfyVar.get(rxyVar.g);
                yop yopVarAi = rxy.a.f().ai(8533);
                rxw rxwVar = rxyVar.g;
                Long lValueOf = Long.valueOf(rxxVar.a());
                rrz rrzVar = rxxVar.a;
                yopVarAi.R("timed out at stage %s after %d milliseconds, publishing %s", rxwVar, lValueOf, rrzVar);
                ols.L(rxyVar.f, "com.google.android.gms.car.USB_ISSUE_FOUND", rrzVar, null);
                rxxVar.c.run();
                return;
            case 9:
                ((rys) this.a).f();
                return;
            case 10:
                Object obj2 = this.a;
                synchronized (((ryz) obj2).b) {
                    if (((ryz) obj2).d > 1) {
                        ryz.a.h().ai(8568).C("%d USB disconnections occurred within the last %dms, this could be due to a bad cable.", ((ryz) obj2).d, ((ryz) obj2).e);
                    }
                    ryx ryxVar = ((ryz) obj2).c;
                    if (ryxVar == null) {
                        ryz.a.h().ai(8567).x("No USB state changes occurred within %dms, the system might be under pressure or a head unit application crash.", ((ryz) obj2).e);
                    } else if (ryxVar.c) {
                        ryz.a.h().ai(8566).O("USB cable is still connected, this could signify a bad cable or a crash on the head unit. (isConfigured=%b, usbDisconnections=%d)", ryxVar.b, ((ryz) obj2).d);
                    } else {
                        ryz.a.l().ai(8565).u("USB cable is no longer connected, this is likely a normal projection exit.");
                    }
                    ((ryz) obj2).g();
                }
                return;
            case 11:
                CarSetupServiceImpl.a.f().ai(8638).u("quit handler thread");
                CarSetupServiceImpl carSetupServiceImpl = (CarSetupServiceImpl) this.a;
                carSetupServiceImpl.u.quitSafely();
                carSetupServiceImpl.u = null;
                return;
            case 12:
                Object obj3 = this.a;
                sat satVar = (sat) obj3;
                if (satVar.a.compareAndSet(false, true)) {
                    CarSetupServiceImpl.a.f().ai(8603).u("Car setup no longer needed");
                    try {
                        ((sat) obj3).h.close();
                    } catch (IOException unused) {
                    }
                    satVar.c.removeCallbacks(satVar.b);
                    satVar.d.c();
                    satVar.n.b();
                    return;
                }
                return;
            case 13:
                sat satVar2 = (sat) this.a;
                shi shiVar = (shi) satVar2.n;
                shiVar.e.post(new sha(shiVar, satVar2.l, satVar2.i, i));
                return;
            case 14:
                sax saxVar = (sax) this.a;
                if (!saxVar.a) {
                    CarSetupServiceImpl carSetupServiceImpl2 = saxVar.b;
                    carSetupServiceImpl2.q = Boolean.FALSE;
                    carSetupServiceImpl2.k();
                    ols.K(carSetupServiceImpl2, "com.google.android.gms.car.CAR_SETUP_SERVICE", rrq.k.ordinal(), null);
                    return;
                }
                CarSetupServiceImpl carSetupServiceImpl3 = saxVar.b;
                carSetupServiceImpl3.q = Boolean.TRUE;
                if (!carSetupServiceImpl3.c.d()) {
                    ols.K(carSetupServiceImpl3, "com.google.android.gms.car.CAR_SETUP_SERVICE", rrq.j.ordinal(), null);
                    return;
                } else {
                    ols.K(carSetupServiceImpl3, "com.google.android.gms.car.CAR_SETUP_SERVICE", rrq.i.ordinal(), null);
                    carSetupServiceImpl3.d.i();
                    return;
                }
            case 15:
                ypf ypfVar = ruw.a;
                rur rurVar = new rur();
                sgs sgsVar = (sgs) this.a;
                sgx sgxVar = sgsVar.h;
                rurVar.c = sgxVar.b;
                rurVar.p = 2;
                rurVar.a = sgsVar.e;
                rurVar.e = new sgt();
                rurVar.k = sgsVar.d;
                rurVar.d = sgxVar.e;
                CarInfo carInfo = sgxVar.f;
                if (carInfo != null) {
                    rurVar.o = new rtx(carInfo.e, carInfo.f);
                }
                sgsVar.g = new ruw(rurVar);
                wyd wydVar = sgxVar.h;
                ruw ruwVar2 = sgsVar.g;
                ypf ypfVar2 = qsr.a;
                ((qsr) wydVar.a).d.post(new jpx(wydVar, ruwVar2, 5));
                return;
            case 16:
                ((rwl) this.a).a.h.g(true);
                return;
            case 17:
                ypf ypfVar3 = qsr.a;
                Object obj4 = ((wyd) this.a).a;
                ((qsr) obj4).d.post(new nwg(obj4, 7));
                return;
            case 18:
                shi shiVar2 = (shi) this.a;
                shh shhVar = shiVar2.i;
                shhVar.a();
                shhVar.b.addAll(shiVar2.f);
                shiVar2.f();
                return;
            case 19:
                shi shiVar3 = (shi) this.a;
                shh shhVar2 = shiVar3.i;
                if (shhVar2.a) {
                    shiVar3.b.unbindService(shiVar3.h);
                    shhVar2.a();
                    return;
                }
                return;
            default:
                Object obj5 = this.a;
                sat satVar3 = (sat) obj5;
                if (satVar3.o) {
                    satVar3.c.post(new rzy(obj5, 3));
                    return;
                } else {
                    satVar3.c.post(satVar3.b);
                    return;
                }
        }
    }

    public rsv(Object obj, int i, byte[] bArr) {
        this.b = i;
        this.a = obj;
    }
}
