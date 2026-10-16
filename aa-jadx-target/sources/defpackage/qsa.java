package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class qsa extends defpackage.qwm implements defpackage.rta, defpackage.rhi, defpackage.rvn {
    public static final defpackage.yqk a = defpackage.omv.n("CAR.BT.SVC");
    private static final defpackage.xiq[] u = {defpackage.xiq.BLUETOOTH_PAIRING_NUMERIC_COMPARISON, defpackage.xiq.BLUETOOTH_PAIRING_PIN};
    public int b;
    public defpackage.xiq c;
    public defpackage.rib d;
    public defpackage.rhn e;
    public defpackage.rtb g;
    public rhq h;
    public java.lang.String j;
    public final com.google.android.gms.car.bluetooth.data.CarBluetoothData k;
    public final boolean l;
    public final defpackage.qrx m;
    public final android.content.Context n;
    public final defpackage.rxs o;
    public final defpackage.rwv p;
    public final defpackage.ris q;
    public final defpackage.rwu r;
    public final defpackage.wyz t;
    private java.lang.String v;
    private defpackage.xiq[] w;
    public final java.util.List f = new java.util.LinkedList();
    public boolean i = false;
    public volatile boolean s = false;

    public qsa(android.content.Context context, defpackage.rxs rxsVar, defpackage.rwv rwvVar, defpackage.ris risVar, defpackage.wyz wyzVar, defpackage.rwu rwuVar, com.google.android.gms.car.bluetooth.data.CarBluetoothData carBluetoothData, boolean z) {
        if (android.os.Build.VERSION.SDK_INT >= 34 && defpackage.acve.g()) {
            context = axd$.ExternalSyntheticApiModelOutline0.m(context, 0);
        }
        this.n = context;
        this.o = rxsVar;
        this.p = rwvVar;
        this.q = risVar;
        this.t = wyzVar;
        this.r = rwuVar;
        this.k = carBluetoothData;
        this.l = z;
        this.b = -6;
        this.m = new defpackage.qrx(this, context);
    }

    protected static final defpackage.rhf x(android.content.Context context) {
        if (android.os.Build.VERSION.SDK_INT >= 34 && defpackage.acve.g()) {
            context = axd$.ExternalSyntheticApiModelOutline0.m(context, 0);
        }
        return defpackage.rhf.a(context);
    }

    private final void y() {
        this.b = -1;
        this.c = defpackage.xiq.BLUETOOTH_PAIRING_UNAVAILABLE;
        this.d = null;
        defpackage.rhn rhnVarD = d(android.os.Looper.getMainLooper(), null, this);
        this.e = rhnVarD;
        rhnVarD.c(defpackage.rhj.EVENT_SKIP_REQUESTED);
    }

    private final boolean z(java.util.concurrent.Callable callable) {
        a.l().ai(7729).y("doBinderTask. task=%s", callable);
        return ((java.lang.Boolean) defpackage.rbz.b(new defpackage.qrw(this, callable, 0))).booleanValue();
    }

    /* JADX WARN: Code duplicated, block: B:104:0x02e7  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.rvn
    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final defpackage.rti a(defpackage.xpa xpaVar) {
        defpackage.yqk yqkVar = a;
        yqkVar.l().ai(7747).u("CarBluetoothService onServiceDiscovery");
        if ((xpaVar.b & 32) == 0) {
            yqkVar.f().ai(7754).u("No bluetooth service available.");
            return null;
        }
        defpackage.xiu xiuVar = xpaVar.h;
        if (xiuVar == null) {
            xiuVar = defpackage.xiu.b;
        }
        java.lang.String str = xiuVar.c;
        int i = 0;
        int i2 = 1;
        if (android.bluetooth.BluetoothAdapter.checkBluetoothAddress(str)) {
            this.j = str;
            j$.util.Optional optionalOfNullable = j$.util.Optional.ofNullable(this.k);
            if (true == optionalOfNullable.isPresent() && ((com.google.android.gms.car.bluetooth.data.CarBluetoothData) optionalOfNullable.get()).b()) {
                optionalOfNullable = j$.util.Optional.empty();
            }
            if (true == optionalOfNullable.isPresent()) {
                optionalOfNullable = j$.util.Optional.ofNullable(((com.google.android.gms.car.bluetooth.data.CarBluetoothData) optionalOfNullable.get()).a());
            }
            if (true == optionalOfNullable.isPresent()) {
                optionalOfNullable = j$.util.Optional.ofNullable(((android.bluetooth.BluetoothDevice) optionalOfNullable.get()).getAddress());
            }
            defpackage.qru qruVar = new defpackage.qru(str, 0);
            if (true == optionalOfNullable.isPresent()) {
                optionalOfNullable = j$.util.Optional.ofNullable(java.lang.Boolean.valueOf(!((java.lang.String) optionalOfNullable.get()).equals(qruVar.a)));
            }
            if (((java.lang.Boolean) optionalOfNullable.orElse(java.lang.Boolean.FALSE)).booleanValue()) {
                defpackage.omv.i(this.n, defpackage.yyn.ANDROID_AUTO_NOT_SUPPORTED_DONGLE_DETECTED);
            }
        }
        if (defpackage.acoo.a.fF().b()) {
            this.o.d(defpackage.zbe.BLUETOOTH, defpackage.zbd.qD);
            yqkVar.h().ai(7753).u("Not starting BT service since disable flag is set!");
            return null;
        }
        this.s = false;
        defpackage.xiu xiuVar2 = xpaVar.h;
        java.lang.String str2 = (xiuVar2 == null ? defpackage.xiu.b : xiuVar2).c;
        if (xiuVar2 == null) {
            xiuVar2 = defpackage.xiu.b;
        }
        defpackage.xiq[] xiqVarArr = (defpackage.xiq[]) new defpackage.abph(xiuVar2.d, defpackage.xiu.a).toArray(new defpackage.xiq[0]);
        yqkVar.l().ai(7748).y("CarBluetoothService. car address=%s", str2);
        if (android.text.TextUtils.isEmpty(str2)) {
            this.o.d(defpackage.zbe.BLUETOOTH, defpackage.zbd.qE);
            yqkVar.h().ai(7752).u("Bluetooth address is empty");
            y();
            return this;
        }
        if ("SKIP_THIS_BLUETOOTH".equals(str2)) {
            this.o.d(defpackage.zbe.BLUETOOTH, defpackage.zbd.qF);
            yqkVar.l().ai(7751).u("Special car Bluetooth address that should be skipped");
            y();
            return this;
        }
        defpackage.xiq xiqVar = defpackage.xiq.BLUETOOTH_PAIRING_UNAVAILABLE;
        defpackage.xiq[] xiqVarArr2 = u;
        int length = xiqVarArr2.length;
        defpackage.xiq xiqVar2 = xiqVar;
        for (int i3 = 0; i3 < 2; i3++) {
            defpackage.xiq xiqVar3 = xiqVarArr2[i3];
            for (defpackage.xiq xiqVar4 : xiqVarArr) {
                if (xiqVar4 == xiqVar3) {
                    yqkVar.l().ai(7750).y("Bluetooth pairing method chosen: %s", xiqVar4);
                    xiqVar2 = xiqVar4;
                    break;
                }
            }
        }
        this.c = xiqVar2;
        if (this.t.g() != 2 && this.c == xiqVar) {
            this.o.d(defpackage.zbe.BLUETOOTH, defpackage.zbd.qH);
            yqkVar.l().ai(7749).u("No supported pairing method");
            this.b = -4;
            this.d = null;
            defpackage.rhn rhnVarD = d(android.os.Looper.getMainLooper(), null, this);
            this.e = rhnVarD;
            rhnVarD.c(defpackage.rhj.EVENT_SERVICE_INITIALIZATION_FAILED);
            return this;
        }
        defpackage.rib ribVar = new defpackage.rib(this.n, str2, new defpackage.wyz(this, null));
        this.d = ribVar;
        int i4 = ribVar.n;
        if (i4 == -3) {
            this.b = -5;
            this.o.d(defpackage.zbe.BLUETOOTH, defpackage.zbd.qK);
        } else if (i4 == -2) {
            this.b = -3;
            this.o.d(defpackage.zbe.BLUETOOTH, defpackage.zbd.qJ);
        } else if (i4 != 0) {
            this.b = -2;
            this.o.d(defpackage.zbe.BLUETOOTH, defpackage.zbd.qL);
        } else {
            this.b = 0;
            this.o.d(defpackage.zbe.BLUETOOTH, defpackage.zbd.qI);
        }
        if (this.b != 0) {
            defpackage.rhn rhnVarD2 = d(android.os.Looper.getMainLooper(), null, this);
            this.e = rhnVarD2;
            rhnVarD2.c(defpackage.rhj.EVENT_SERVICE_INITIALIZATION_FAILED);
            return this;
        }
        defpackage.rhn rhnVarD3 = d(android.os.Looper.getMainLooper(), this.d, this);
        this.e = rhnVarD3;
        rhnVarD3.c(defpackage.rhj.EVENT_SERVICE_INITIALIZED);
        this.v = str2;
        this.w = xiqVarArr;
        defpackage.qrx qrxVar = this.m;
        defpackage.qsa qsaVar = qrxVar.e;
        defpackage.ygw ygwVarO = defpackage.ygw.o(defpackage.acyx.a.fF().g().b);
        if (!ygwVarO.isEmpty()) {
            com.google.android.gms.carsetup.CarInfoInternal carInfoInternal = new com.google.android.gms.carsetup.CarInfoInternal(qsaVar.p.l(), null, false, 0L, 0L, null, null, null, null, 0, null, 0, 0, 0, false, false, 0L, false, null, 0, null);
            if (ygwVarO.isEmpty()) {
                yqkVar.f().ai(7708).u("disabling A2dp via profile disabler");
                android.content.Context context = qsaVar.n;
                qrxVar.c = new defpackage.rhe(x(context), qsaVar.h());
                defpackage.rhe rheVar = qrxVar.c;
                defpackage.rhe.a.l().ai(8043).u("start");
                rheVar.b.f(context, new defpackage.rhd(rheVar), 2);
                qrxVar.b = null;
            } else {
                int size = ygwVarO.size();
                boolean z = false;
                int i5 = 0;
                while (i < size) {
                    defpackage.rsb rsbVar = (defpackage.rsb) ygwVarO.get(i);
                    int i6 = (rsbVar.equals(defpackage.rsb.a) ? 1 : 0) ^ i2;
                    if ((rsbVar.b & i2) != 0) {
                        i6 &= rsbVar.c.equalsIgnoreCase(carInfoInternal.a.a) ? 1 : 0;
                    }
                    if ((rsbVar.b & 2) != 0) {
                        i6 &= rsbVar.d.equalsIgnoreCase(carInfoInternal.a.b) ? 1 : 0;
                    }
                    if ((rsbVar.b & 8) != 0) {
                        i6 &= rsbVar.f.equalsIgnoreCase(carInfoInternal.a.j) ? 1 : 0;
                    }
                    if ((rsbVar.b & 4) != 0) {
                        i6 &= rsbVar.e.equals(carInfoInternal.a.c) ? 1 : 0;
                    }
                    if ((rsbVar.b & 32) != 0) {
                        i6 &= rsbVar.h.equalsIgnoreCase(carInfoInternal.a.i) ? 1 : 0;
                    }
                    if (!rsbVar.g) {
                        i5 |= i6;
                        z = true;
                    } else if (i6 == 0) {
                    }
                    i++;
                    i2 = 1;
                }
                if (!z || i5 != 0) {
                    yqkVar.f().ai(7708).u("disabling A2dp via profile disabler");
                    android.content.Context context2 = qsaVar.n;
                    qrxVar.c = new defpackage.rhe(x(context2), qsaVar.h());
                    defpackage.rhe rheVar2 = qrxVar.c;
                    defpackage.rhe.a.l().ai(8043).u("start");
                    rheVar2.b.f(context2, new defpackage.rhd(rheVar2), 2);
                    qrxVar.b = null;
                }
            }
        }
        qrxVar.b();
        return this;
    }

    @Override // defpackage.rti
    public final defpackage.rvj b(defpackage.rvm rvmVar) {
        return new defpackage.rtb(this, rvmVar);
    }

    @Override // defpackage.qwn
    public final int c() {
        a.l().ai(7732).u("getInitializationStatus");
        return ((java.lang.Integer) defpackage.rbz.b(new defpackage.qnn(this, 3))).intValue();
    }

    protected final defpackage.rhn d(android.os.Looper looper, defpackage.rib ribVar, defpackage.rhi rhiVar) {
        defpackage.rxs rxsVar = this.o;
        return new defpackage.rhn(looper, ribVar, rhiVar, this.t, this.q, rxsVar, new defpackage.rho(rxsVar, ribVar));
    }

    @Override // defpackage.rti
    public final void ft(java.io.PrintWriter printWriter) {
        throw null;
    }

    @Override // defpackage.qwn
    public final java.lang.String g() {
        if (android.os.Build.VERSION.SDK_INT < 30) {
            return this.v;
        }
        a.l().ai(7730).u("getCarBluetoothAddress");
        return (java.lang.String) defpackage.rbz.b(new defpackage.fma(this, 13));
    }

    @Override // defpackage.qwn
    public final java.lang.String h() {
        a.l().ai(7731).u("getCarBluetoothEndpointAddress");
        return (java.lang.String) defpackage.rbz.a(android.os.Looper.getMainLooper(), new defpackage.imt(this, 2));
    }

    @Override // defpackage.qwn
    public final java.lang.String i() {
        a.l().ai(7733).u("getStartingCarBluetoothAddress");
        return (java.lang.String) defpackage.rbz.b(new defpackage.fma(this, 12));
    }

    public final void j() {
        if (this.b != 0) {
            throw new java.lang.IllegalStateException("Service not initialized");
        }
    }

    @Override // defpackage.rti
    public final void k() {
        throw null;
    }

    @Override // defpackage.rti
    public final void l(defpackage.rvj rvjVar) {
        a.l().ai(7745).u("onEndPointReady");
        new defpackage.stq(android.os.Looper.getMainLooper()).post(new defpackage.kfq(this, rvjVar, 3, (char[]) null));
    }

    public final void m(qry qryVar) {
        defpackage.yqk yqkVar = a;
        yqkVar.l().ai(7725).y("deliverEventToClients. callbackinvoker=%s", qryVar);
        if (this.b != 0) {
            yqkVar.g().ai(7728).u("deliverEventToClients: Service not initialized");
            return;
        }
        if (this.g == null) {
            yqkVar.g().ai(7727).u("deliverEventToClients: Channel not established yet");
            return;
        }
        if (this.i) {
            return;
        }
        java.util.Iterator it = this.f.iterator();
        while (it.hasNext()) {
            defpackage.qrz qrzVar = (defpackage.qrz) it.next();
            try {
                qryVar.a(qrzVar.a);
            } catch (android.os.RemoteException e) {
                a.g().p(e).ai(7726).y("Exception in deliverEventToClients. clientCallbackInvoker=%s", qryVar);
                qrzVar.a();
                it.remove();
            }
        }
    }

    @Override // defpackage.qwn
    public final void n() {
        this.m.b();
    }

    public final void o(java.lang.Runnable runnable) {
        a.l().ai(7734).y("handleIncomingMessage. handler=%s", runnable);
        defpackage.rbz.h(new defpackage.qnf(this, runnable, 5));
    }

    public final void p(java.lang.String str) {
        j$.util.Optional optionalOfNullable = j$.util.Optional.ofNullable(x(this.n));
        miv mivVar = new miv(str, 12);
        if (true == optionalOfNullable.isPresent()) {
            optionalOfNullable = j$.util.Optional.ofNullable(((defpackage.rhf) optionalOfNullable.get()).b((java.lang.String) mivVar.a));
        }
        if (true != optionalOfNullable.isPresent()) {
            return;
        }
        defpackage.rhg rhgVar = (defpackage.rhg) optionalOfNullable.get();
        a.f().ai(7742).y("setting device metadata for %s", rhgVar.b());
        rhgVar.a.setMetadata(17, "Carkit".getBytes());
    }

    @Override // defpackage.qwn
    public final boolean q() {
        a.l().ai(7737).u("isEnabled");
        defpackage.rib ribVar = this.d;
        ribVar.getClass();
        return z(new defpackage.fma(ribVar, 14));
    }

    @Override // defpackage.qwn
    public final boolean r() {
        a.l().ai(7738).u("isHfpConnected");
        return z(new defpackage.fma(this, 16));
    }

    @Override // defpackage.qwn
    public final boolean s() {
        a.l().ai(7739).u("isHfpConnecting");
        return z(new defpackage.fma(this, 17));
    }

    @Override // defpackage.qwn
    public final boolean t() {
        a.l().ai(7740).u("isPaired");
        defpackage.rib ribVar = this.d;
        ribVar.getClass();
        return z(new defpackage.fma(ribVar, 15));
    }

    @Override // defpackage.qwn
    public final boolean u() {
        a.l().ai(7741).u("isPairing");
        defpackage.rib ribVar = this.d;
        ribVar.getClass();
        return z(new defpackage.fma(ribVar, 18));
    }

    @Override // defpackage.qwn
    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final boolean v(qwq qwqVar) {
        a.l().ai(7757).y("registerClient. client=%s", qwqVar.asBinder());
        return ((java.lang.Boolean) defpackage.rbz.b(new defpackage.qrw(this, qwqVar, 1))).booleanValue();
    }

    @Override // defpackage.qwn
    public final int[] w() {
        return defpackage.ysr.bK(this.w);
    }
}
