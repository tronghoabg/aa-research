package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class lji implements defpackage.qsy {
    public final /* synthetic */ java.lang.Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ lji(java.lang.Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r14v7, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v24, types: [java.lang.Object, rai] */
    /* JADX WARN: Type inference failed for: r1v29, types: [java.lang.Object, rai] */
    /* JADX WARN: Type inference failed for: r1v38, types: [java.lang.Object, xfr] */
    @Override // defpackage.qsy
    public final void d(int i, long j, float[] fArr, byte[] bArr) {
        boolean z;
        switch (this.b) {
            case defpackage.abnt.b /* 0 */:
                if (i == 11) {
                    java.lang.Object obj = this.a;
                    byte b = bArr[0];
                    boolean z2 = (b & 8) == 0;
                    defpackage.ljj ljjVar = (defpackage.ljj) obj;
                    if (z2 != ljjVar.d) {
                        ljjVar.d = z2;
                        java.util.Iterator it = ljjVar.b.iterator();
                        while (it.hasNext()) {
                            ((defpackage.liv) it.next()).a(ljjVar.d);
                        }
                    }
                    z = (b & 2) == 0;
                    if (ljjVar.c != z) {
                        ljjVar.c = z;
                        java.util.Iterator it2 = ljjVar.a.iterator();
                        while (it2.hasNext()) {
                            ((defpackage.lix) it2.next()).a(ljjVar.c);
                        }
                    }
                    break;
                }
                break;
            case 1:
                int length = fArr.length;
                int length2 = bArr.length;
                com.google.android.gms.car.CarSensorEvent carSensorEvent = new com.google.android.gms.car.CarSensorEvent(i, j, length, length2);
                java.lang.System.arraycopy(fArr, 0, carSensorEvent.d, 0, length);
                java.lang.System.arraycopy(bArr, 0, carSensorEvent.e, 0, length2);
                ((defpackage.ljf) this.a).c(carSensorEvent.b(null));
                break;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                if (i == 7) {
                    java.lang.Object obj2 = this.a;
                    byte b2 = bArr[0];
                    defpackage.aecq aecqVar = (defpackage.aecq) obj2;
                    if (aecqVar.a != b2) {
                        aecqVar.a = b2;
                        java.util.Iterator it3 = aecqVar.c.iterator();
                        while (it3.hasNext()) {
                            ((defpackage.liw) it3.next()).a(b2);
                        }
                    }
                    break;
                }
                break;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                if (i == 2) {
                    ((defpackage.ljg) this.a).g(java.lang.Float.valueOf(fArr[0]), j);
                }
                break;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                fArr.getClass();
                bArr.getClass();
                com.google.android.gms.car.CarSensorEvent carSensorEventR = defpackage.mvm.r(i, j, fArr, bArr);
                if (i == 22) {
                    java.lang.Object obj3 = this.a;
                    usc uscVarI = carSensorEventR.i();
                    defpackage.nfq.a.l().y("toll card status update %s", uscVarI);
                    ((defpackage.eqp) obj3).m(java.lang.Boolean.valueOf(uscVarI.a));
                }
                break;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                int length3 = fArr.length;
                int length4 = bArr.length;
                com.google.android.gms.car.CarSensorEvent carSensorEvent2 = new com.google.android.gms.car.CarSensorEvent(i, j, length3, length4);
                java.lang.System.arraycopy(fArr, 0, carSensorEvent2.d, 0, length3);
                java.lang.System.arraycopy(bArr, 0, carSensorEvent2.e, 0, length4);
                if (i == 11) {
                    ttc ttcVarG = carSensorEvent2.g();
                    defpackage.yqm yqmVar = com.google.android.gearhead.appdecor.AppDecorService.a;
                    ((defpackage.yqj) yqmVar.l().ai((char) 7045)).y("onSensorChanged drivingStatus: %d", java.lang.Byte.valueOf(ttcVarG.a));
                    if (defpackage.acpy.e()) {
                        ttcVarG.a = (byte) (ttcVarG.a | 2);
                        ((defpackage.yqj) yqmVar.l().ai((char) 7046)).u("Overriding driving status data!");
                    }
                    com.google.android.gearhead.appdecor.AppDecorService appDecorService = (com.google.android.gearhead.appdecor.AppDecorService) this.a;
                    appDecorService.l = ttcVarG;
                    java.util.Iterator it4 = appDecorService.e.iterator();
                    while (it4.hasNext()) {
                        try {
                            ((defpackage.iko) it4.next()).a.a(ttcVarG.a);
                        } catch (android.os.RemoteException unused) {
                        }
                    }
                } else if (i != 22) {
                    defpackage.rox.o("ADU.AppDecorService", "unexpected sensor update for sensor: %d", java.lang.Integer.valueOf(i));
                } else {
                    usc uscVarI2 = carSensorEvent2.i();
                    ((defpackage.yqj) com.google.android.gearhead.appdecor.AppDecorService.a.l().ai((char) 7047)).y("toll card status update %s", uscVarI2);
                    com.google.android.gearhead.appdecor.AppDecorService appDecorService2 = (com.google.android.gearhead.appdecor.AppDecorService) this.a;
                    appDecorService2.m = uscVarI2;
                    java.util.Iterator it5 = appDecorService2.e.iterator();
                    while (it5.hasNext()) {
                        try {
                            ((defpackage.iko) it5.next()).a.b(uscVarI2.a);
                        } catch (android.os.RemoteException unused2) {
                        }
                    }
                }
                break;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                if (i == 11) {
                    java.lang.Object obj4 = this.a;
                    z = (bArr[0] & 2) != 0;
                    xdy xdyVar = (xdy) obj4;
                    if (xdyVar.c != z) {
                        xdyVar.c = z;
                        xdyVar.d();
                    }
                    break;
                }
                break;
            default:
                com.google.android.gms.car.CarSensorEvent carSensorEvent3 = new com.google.android.gms.car.CarSensorEvent(i, j, fArr.length, bArr.length);
                for (int i2 = 0; i2 < fArr.length; i2++) {
                    carSensorEvent3.d[i2] = fArr[i2];
                }
                for (int i3 = 0; i3 < bArr.length; i3++) {
                    carSensorEvent3.e[i3] = bArr[i3];
                }
                ttc ttcVarG2 = carSensorEvent3.g();
                com.google.android.projection.gearhead.service.CarSystemUiControllerService carSystemUiControllerService = ((xfu) this.a).a;
                carSystemUiControllerService.g = ttcVarG2;
                try {
                    java.util.Iterator it6 = carSystemUiControllerService.b.iterator();
                    while (it6.hasNext()) {
                        ((xfv) it6.next()).a.e(ttcVarG2.a);
                    }
                } catch (android.os.RemoteException unused3) {
                    return;
                }
                break;
        }
    }

    public lji(java.lang.Object obj, int i, byte[] bArr) {
        this.b = i;
        this.a = obj;
    }
}
