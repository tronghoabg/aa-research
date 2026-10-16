package defpackage;

import android.os.RemoteException;
import com.google.android.gearhead.appdecor.AppDecorService;
import com.google.android.gms.car.CarSensorEvent;
import com.google.android.projection.gearhead.service.CarSystemUiControllerService;
import java.util.Iterator;

/* loaded from: classes.dex */
public final /* synthetic */ class ljb implements qse {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ ljb(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r14v7, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v24, types: [java.lang.Object, qzm] */
    /* JADX WARN: Type inference failed for: r1v29, types: [java.lang.Object, qzm] */
    /* JADX WARN: Type inference failed for: r1v38, types: [java.lang.Object, xer] */
    @Override // defpackage.qse
    public final void d(int i, long j, float[] fArr, byte[] bArr) {
        boolean z;
        switch (this.b) {
            case 0:
                if (i == 11) {
                    Object obj = this.a;
                    byte b = bArr[0];
                    boolean z2 = (b & 8) == 0;
                    ljc ljcVar = (ljc) obj;
                    if (z2 != ljcVar.d) {
                        ljcVar.d = z2;
                        Iterator it = ljcVar.b.iterator();
                        while (it.hasNext()) {
                            ((lio) it.next()).a(ljcVar.d);
                        }
                    }
                    z = (b & 2) == 0;
                    if (ljcVar.c != z) {
                        ljcVar.c = z;
                        Iterator it2 = ljcVar.a.iterator();
                        while (it2.hasNext()) {
                            ((liq) it2.next()).a(ljcVar.c);
                        }
                        break;
                    }
                }
                break;
            case 1:
                int length = fArr.length;
                int length2 = bArr.length;
                CarSensorEvent carSensorEvent = new CarSensorEvent(i, j, length, length2);
                System.arraycopy(fArr, 0, carSensorEvent.d, 0, length);
                System.arraycopy(bArr, 0, carSensorEvent.e, 0, length2);
                ((liy) this.a).c(carSensorEvent.b(null));
                break;
            case 2:
                if (i == 7) {
                    Object obj2 = this.a;
                    byte b2 = bArr[0];
                    aebq aebqVar = (aebq) obj2;
                    if (aebqVar.a != b2) {
                        aebqVar.a = b2;
                        Iterator it3 = aebqVar.c.iterator();
                        while (it3.hasNext()) {
                            ((lip) it3.next()).a(b2);
                        }
                        break;
                    }
                }
                break;
            case 3:
                if (i == 2) {
                    ((liz) this.a).g(Float.valueOf(fArr[0]), j);
                    break;
                }
                break;
            case 4:
                fArr.getClass();
                bArr.getClass();
                CarSensorEvent carSensorEventR = mva.r(i, j, fArr, bArr);
                if (i == 22) {
                    Object obj3 = this.a;
                    urf urfVarI = carSensorEventR.i();
                    ney.a.l().y("toll card status update %s", urfVarI);
                    ((eqj) obj3).m(Boolean.valueOf(urfVarI.a));
                    break;
                }
                break;
            case 5:
                int length3 = fArr.length;
                int length4 = bArr.length;
                CarSensorEvent carSensorEvent2 = new CarSensorEvent(i, j, length3, length4);
                System.arraycopy(fArr, 0, carSensorEvent2.d, 0, length3);
                System.arraycopy(bArr, 0, carSensorEvent2.e, 0, length4);
                if (i != 11) {
                    if (i != 22) {
                        tss.q("ADU.AppDecorService", "unexpected sensor update for sensor: %d", Integer.valueOf(i));
                        break;
                    } else {
                        urf urfVarI2 = carSensorEvent2.i();
                        ((ype) AppDecorService.a.l().ai((char) 7022)).y("toll card status update %s", urfVarI2);
                        AppDecorService appDecorService = (AppDecorService) this.a;
                        appDecorService.m = urfVarI2;
                        Iterator it4 = appDecorService.e.iterator();
                        while (it4.hasNext()) {
                            try {
                                ((ikf) it4.next()).a.b(urfVarI2.a);
                            } catch (RemoteException unused) {
                            }
                        }
                        break;
                    }
                } else {
                    tse tseVarG = carSensorEvent2.g();
                    yph yphVar = AppDecorService.a;
                    ((ype) yphVar.l().ai((char) 7020)).y("onSensorChanged drivingStatus: %d", Byte.valueOf(tseVarG.a));
                    if (acow.e()) {
                        tseVarG.a = (byte) (tseVarG.a | 2);
                        ((ype) yphVar.l().ai((char) 7021)).u("Overriding driving status data!");
                    }
                    AppDecorService appDecorService2 = (AppDecorService) this.a;
                    appDecorService2.l = tseVarG;
                    Iterator it5 = appDecorService2.e.iterator();
                    while (it5.hasNext()) {
                        try {
                            ((ikf) it5.next()).a.a(tseVarG.a);
                        } catch (RemoteException unused2) {
                        }
                    }
                    break;
                }
            case 6:
                if (i == 11) {
                    Object obj4 = this.a;
                    z = (bArr[0] & 2) != 0;
                    xdc xdcVar = (xdc) obj4;
                    if (xdcVar.c != z) {
                        xdcVar.c = z;
                        xdcVar.d();
                        break;
                    }
                }
                break;
            default:
                CarSensorEvent carSensorEvent3 = new CarSensorEvent(i, j, fArr.length, bArr.length);
                for (int i2 = 0; i2 < fArr.length; i2++) {
                    carSensorEvent3.d[i2] = fArr[i2];
                }
                for (int i3 = 0; i3 < bArr.length; i3++) {
                    carSensorEvent3.e[i3] = bArr[i3];
                }
                tse tseVarG2 = carSensorEvent3.g();
                CarSystemUiControllerService carSystemUiControllerService = ((xeu) this.a).a;
                carSystemUiControllerService.g = tseVarG2;
                try {
                    Iterator it6 = carSystemUiControllerService.b.iterator();
                    while (it6.hasNext()) {
                        ((xev) it6.next()).a.e(tseVarG2.a);
                    }
                    break;
                } catch (RemoteException unused3) {
                    return;
                }
        }
    }

    public ljb(Object obj, int i, byte[] bArr) {
        this.b = i;
        this.a = obj;
    }
}
