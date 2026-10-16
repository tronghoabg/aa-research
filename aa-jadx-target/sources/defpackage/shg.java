package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class shg {
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ shg(java.lang.Object obj, java.lang.Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public final void a() {
        java.lang.Object obj = this.a;
        java.lang.Object obj2 = this.b;
        synchronized (com.google.android.gms.carsetup.setup.UsbConnectionHelper.TrackedParcelFileDescriptor.d) {
            if (((java.util.concurrent.atomic.AtomicBoolean) obj).compareAndSet(false, true) && com.google.android.gms.carsetup.setup.UsbConnectionHelper.TrackedParcelFileDescriptor.b.decrementAndGet() == 0) {
                defpackage.shi shiVar = com.google.android.gms.carsetup.setup.UsbConnectionHelper.TrackedParcelFileDescriptor.e;
                shiVar.getClass();
                com.google.android.gms.carsetup.setup.UsbConnectionHelper.TrackedParcelFileDescriptor.e = null;
                com.google.android.gms.carsetup.setup.UsbConnectionHelper.TrackedParcelFileDescriptor.c.incrementAndGet();
                android.os.Handler handler = com.google.android.gms.carsetup.setup.UsbConnectionHelper.TrackedParcelFileDescriptor.g;
                handler.getClass();
                handler.postDelayed(new defpackage.kfq(obj2, shiVar, 11, (byte[]) null), 10000L);
            }
        }
    }

    public final defpackage.rkt b() throws android.os.RemoteException {
        defpackage.qvl qvlVarC = ((defpackage.ref) this.a).C();
        java.lang.Object obj = this.b;
        if (defpackage.omv.c("CAR.CLIENT", 3)) {
            defpackage.rrx.d(3, "CAR.CLIENT", null, "Multi-display client enabled. Get ICarDisplay for: %s", new defpackage.zkf(defpackage.zke.a, obj));
        }
        defpackage.rkt rktVarE = qvlVarC.S().e((com.google.android.gms.car.display.CarDisplayId) obj);
        rktVarE.getClass();
        return rktVarE;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
    public final void c(com.google.android.gms.car.display.CarDisplay carDisplay) throws wfo {
        ((defpackage.yqj) defpackage.ntf.a.l().ai((char) 5417)).y("%s changed", carDisplay);
        defpackage.wfp.c();
        java.lang.Object obj = this.b;
        com.google.android.gms.car.display.CarDisplayId carDisplayId = carDisplay.a;
        defpackage.ntb ntbVar = ((defpackage.ntf) obj).b;
        if (j$.util.Objects.equals(ntbVar.o, carDisplayId)) {
            java.lang.String str = carDisplay.g;
            java.util.UUID uuid = ntbVar.p;
            uuid.getClass();
            if (j$.util.Objects.equals(str, uuid.toString())) {
                ((defpackage.yqj) defpackage.ntb.a.l().ai(5407)).y("onCarDisplayChanged called with already existing configurationId: %s, ignoring", ntbVar.p);
            } else {
                defpackage.kgu.d(new mjf(ntbVar, carDisplay, (defpackage.qsh) this.a, 4), "GH.DisplayLayout", defpackage.zbe.DISPLAY_LAYOUT, defpackage.zbd.rL, "Car not connected during display change", new java.lang.Object[0]);
            }
        }
    }

    public /* synthetic */ shg(java.lang.Object obj, java.lang.Object obj2, byte[] bArr) {
        this.b = obj;
        this.a = obj2;
    }
}
