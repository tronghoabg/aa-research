package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class jqk extends defpackage.rxn {
    public static final defpackage.yqm a = defpackage.yqm.c("GH.CAR");
    public final android.os.Handler c;
    public final defpackage.jnr e;
    public final defpackage.imi f;
    public final android.content.res.Configuration g;
    public final android.content.Context h;
    public final defpackage.jpf i;
    public final defpackage.jqb j;
    public final defpackage.jnt k;
    public volatile boolean l;
    private final defpackage.xzi m;
    public final defpackage.jli b = new defpackage.jll();
    public final java.util.concurrent.CountDownLatch d = new java.util.concurrent.CountDownLatch(1);

    public jqk(android.content.Context context, android.content.res.Configuration configuration, android.os.Handler handler, defpackage.joe joeVar) {
        android.content.Context contextC = defpackage.jfr.c(context);
        this.h = contextC;
        this.g = configuration;
        android.os.Handler handler2 = new android.os.Handler(android.os.Looper.getMainLooper());
        this.c = handler;
        defpackage.xzi xziVarAQ = defpackage.ysr.aQ(new defpackage.ilu(this, 20));
        this.m = xziVarAQ;
        defpackage.yqm yqmVar = a;
        ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 2607)).u("gearheadCarServiceBinder in mainHandler: true");
        defpackage.imi imiVar = new defpackage.imi(new com.google.android.apps.auto.carservice.service.impl.GearheadCarServiceCallbacks(contextC), contextC, defpackage.ilj.a(contextC), xziVarAQ);
        com.google.android.apps.auto.carservice.service.impl.GearheadCarServiceCallbacks.b = imiVar;
        com.google.android.apps.auto.carservice.service.impl.GearheadCarServiceCallbacks.c = imiVar;
        this.f = imiVar;
        defpackage.jqb jqbVar = new defpackage.jqb(handler2, contextC, imiVar);
        this.j = jqbVar;
        this.k = new defpackage.jnt(contextC.getApplicationContext(), jqbVar);
        ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 2612)).u("Using GearheadCarServiceBinder in CarMessageService.");
        new defpackage.ixa(imiVar, imiVar, contextC);
        defpackage.jpc jpcVar = new defpackage.jpc(contextC, handler, handler2, imiVar, jqbVar);
        this.e = jpcVar;
        jqbVar.e = jpcVar;
        this.i = new defpackage.jpf(joeVar, handler, new defpackage.jpa(handler2, 3, null));
        ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 2608)).u("Using Gearhead for projection services. All aboard! 🚀");
    }

    static android.os.ParcelFileDescriptor a(android.os.ParcelFileDescriptor parcelFileDescriptor) {
        try {
            android.os.ParcelFileDescriptor parcelFileDescriptorDup = parcelFileDescriptor.dup();
            try {
                parcelFileDescriptor.close();
                return parcelFileDescriptorDup;
            } catch (java.io.IOException e) {
                ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) a.h()).p(e)).ai((char) 2613)).u("Failed to close original file descriptor.");
                return parcelFileDescriptorDup;
            }
        } catch (java.io.IOException e2) {
            throw new java.lang.IllegalStateException("Failed to duplicate file descriptor.", e2);
        }
    }

    public static boolean q(android.content.res.Configuration configuration) {
        return (configuration.uiMode & 15) == 3;
    }

    private static java.util.Map w(java.util.List list, java.util.List list2) {
        if (list.size() != list2.size()) {
            throw new java.lang.IllegalArgumentException("Service ID and type do not match");
        }
        defpackage.yha yhaVar = new defpackage.yha(4);
        java.util.Iterator it = list.iterator();
        java.util.Iterator it2 = list2.iterator();
        while (it.hasNext() && it2.hasNext()) {
            java.lang.Integer num = (java.lang.Integer) it.next();
            num.intValue();
            int iIntValue = ((java.lang.Integer) it2.next()).intValue();
            defpackage.rsi rsiVarB = defpackage.rsi.b(iIntValue);
            if (rsiVarB == null) {
                ((defpackage.yqj) ((defpackage.yqj) a.h()).ai((char) 2625)).w("Unknown service type: %d", iIntValue);
                rsiVarB = defpackage.rsi.UNKNOWN;
            }
            yhaVar.f(num, rsiVarB);
        }
        return yhaVar.d(true);
    }

    private static java.lang.Object x(defpackage.xzi xziVar) {
        try {
            return xziVar.fF();
        } catch (java.lang.IllegalArgumentException | java.lang.IllegalStateException | java.lang.NullPointerException | java.lang.UnsupportedOperationException e) {
            throw defpackage.jrw.b(a, "getCarService failed", e);
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, qvl] */
    @Override // defpackage.rxo
    public final defpackage.qvl b() {
        defpackage.ysr.bk(this.l, "not initialized");
        return x(new defpackage.kpe(this, 1));
    }

    @Override // defpackage.rxo
    public final defpackage.rxi c(defpackage.rxl rxlVar) {
        defpackage.ysr.bk(this.l, "not initialized");
        this.b.a(this.h);
        try {
            defpackage.jnr jnrVar = this.e;
            defpackage.zif zifVar = new defpackage.zif();
            ((defpackage.jpc) jnrVar).d.post(new jox((defpackage.jpc) jnrVar, zifVar, rxlVar));
            return (defpackage.rxi) zifVar.t(5000L, java.util.concurrent.TimeUnit.MILLISECONDS);
        } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException | java.util.concurrent.TimeoutException e) {
            throw defpackage.jrw.b(a, "Sensor service fetch failed.", e);
        }
    }

    @Override // defpackage.rxo
    public final void d(long j, int i, android.os.Bundle bundle, defpackage.rxr rxrVar) {
        com.google.android.gms.car.bluetooth.data.CarBluetoothData carBluetoothData;
        defpackage.ysr.bk(this.l, "not initialized");
        defpackage.jli jliVar = this.b;
        android.content.Context context = this.h;
        jliVar.a(context);
        defpackage.yqm yqmVar = a;
        ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai(2614)).F("Handoff session %d (connection type: %d)", j, i);
        java.lang.String strP = defpackage.ebq.p(context);
        ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 2615)).u("Projection runs in proxy. Update iCar to the proxy.");
        p();
        defpackage.ysr.bk(this.j.a() == this.f, "Requested to use Gearhead for projection but not configured with local Car Service implementation.");
        if (i == 2) {
            j$.time.Duration durationOfNanos = j$.time.Duration.ofNanos(bundle.getLong("car_handoff_connection_start_time_elapsed_nanos", 0L));
            if (defpackage.adax.a.fF().at()) {
                java.lang.ClassLoader classLoader = com.google.android.gms.car.bluetooth.data.CarBluetoothData.class.getClassLoader();
                classLoader.getClass();
                bundle.setClassLoader(classLoader);
                carBluetoothData = (com.google.android.gms.car.bluetooth.data.CarBluetoothData) bundle.getParcelable("WIFI_STARTING_BLUETOOTH_DEVICE");
            } else {
                carBluetoothData = null;
            }
            java.lang.String string = bundle.getString("PARAM_HOST_ADDRESS");
            int i2 = bundle.getInt("PARAM_SERVICE_PORT", -1);
            android.net.wifi.WifiInfo wifiInfo = (android.net.wifi.WifiInfo) bundle.getParcelable("wifi_info");
            android.net.Network network = (android.net.Network) bundle.getParcelable("PARAM_SERVICE_WIFI_NETWORK");
            boolean z = bundle.getBoolean("WIFI_Q_ENABLED", false);
            string.getClass();
            defpackage.ysr.aY(i2 >= 0, "port cannot be negative");
            ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai(2618)).R("Handling wifi handoff %s:%d (%s)", string, java.lang.Integer.valueOf(i2), wifiInfo);
            this.c.post(new jqh(this, j, new android.os.Handler(android.os.Looper.getMainLooper()), rxrVar, durationOfNanos, strP, carBluetoothData, string, i2, wifiInfo, network, z));
            return;
        }
        java.lang.ClassLoader classLoader2 = com.google.android.gms.carsetup.setup.UsbConnectionHelper.TrackedParcelFileDescriptor.class.getClassLoader();
        if (classLoader2 != null) {
            bundle.setClassLoader(classLoader2);
        }
        com.google.android.gms.carsetup.setup.UsbConnectionHelper.TrackedParcelFileDescriptor trackedParcelFileDescriptorA = com.google.android.gms.carsetup.setup.UsbConnectionHelper.TrackedParcelFileDescriptor.a((android.os.ParcelFileDescriptor) bundle.getParcelable("car_setup.EXTRA_CAR_CONNECTION_FILE_DESCRIPTOR"));
        trackedParcelFileDescriptorA.getClass();
        try {
            android.os.ParcelFileDescriptor parcelFileDescriptorA = a(trackedParcelFileDescriptorA);
            this.c.post(new defpackage.jqd(this, j, j$.time.Duration.ofNanos(bundle.getLong("car_handoff_connection_start_time_elapsed_nanos", 0L)), i, defpackage.kou.n() ? defpackage.juv.j(parcelFileDescriptorA) : defpackage.sqs.aF(parcelFileDescriptorA), rxrVar, strP));
        } catch (java.lang.IllegalStateException e) {
            boolean z2 = trackedParcelFileDescriptorA.l.get();
            if (!z2) {
                java.lang.Throwable cause = e.getCause();
                if (cause instanceof java.io.IOException) {
                    cause = cause.getCause();
                }
                if (!(cause instanceof android.system.ErrnoException) || ((android.system.ErrnoException) cause).errno != android.system.OsConstants.EBADF) {
                    throw new java.lang.IllegalStateException("dup failed, but fd is not closed", e);
                }
            }
            ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) a.h()).p(e)).ai((char) 2616)).u("File descriptor is already closed during handoff. Tearing down.");
            android.content.Context context2 = this.h;
            if (z2) {
                defpackage.omv.i(context2, defpackage.yyn.USB_FD_CLOSED_DURING_STARTUP);
            } else {
                defpackage.omv.i(context2, defpackage.yyn.USB_FD_BAD_DURING_STARTUP);
            }
            try {
                rxrVar.j();
            } catch (android.os.RemoteException e2) {
                ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) a.g()).p(e2)).ai((char) 2617)).u("Unable to tear down during handoff");
            }
        }
    }

    @Override // defpackage.rxo
    @java.lang.Deprecated
    public final void f() {
        defpackage.ysr.bk(this.l, "not initialized");
        this.b.a(this.h);
        ((defpackage.yqj) ((defpackage.yqj) a.h()).ai((char) 2621)).u("Call to deprecated method invalidateDelegateICar.");
    }

    @Override // defpackage.rxo
    public final void g(long j, android.os.ParcelFileDescriptor parcelFileDescriptor, defpackage.rxr rxrVar) {
        defpackage.ysr.bk(this.l, "not initialized");
        defpackage.jli jliVar = this.b;
        android.content.Context context = this.h;
        java.lang.String strP = defpackage.ebq.p(context);
        jliVar.a(context);
        ((defpackage.yqj) ((defpackage.yqj) a.f()).ai(2628)).x("Process handoff of session %d", j);
        this.c.post(new jqc(this, j, defpackage.kou.n() ? defpackage.juv.j(a(parcelFileDescriptor)) : defpackage.sqs.aF(a(parcelFileDescriptor)), rxrVar, strP, 2));
    }

    @Override // defpackage.rxo
    public final void h(long j, defpackage.rxr rxrVar) {
        defpackage.ysr.bk(this.l, "not initialized");
        this.b.a(this.h);
        ((defpackage.yqj) ((defpackage.yqj) a.f()).ai(2629)).x("Resume session %d", j);
        this.c.post(new defpackage.jqi(this, j, rxrVar, 0));
    }

    @Override // defpackage.rxo
    public final void i(long j, int i) {
        defpackage.ysr.bk(this.l, "not initialized");
        this.b.a(this.h);
        ((defpackage.yqj) ((defpackage.yqj) a.f()).ai(2630)).F("Sending bye-bye for session %d with reason %d", j, i);
        this.c.post(new lvt(this, j, i, 1));
    }

    @Override // defpackage.rxo
    public final void j(long j, java.util.List list, java.util.List list2, defpackage.rxf rxfVar) {
        defpackage.ysr.bk(this.l, "not initialized");
        this.b.a(this.h);
        ((defpackage.yqj) ((defpackage.yqj) a.f()).ai(2631)).x("Start additional services %d", j);
        this.c.post(new jqc(this, j, list, w(list, list2), rxfVar, 0));
    }

    @Override // defpackage.rxo
    public final void k(long j, java.util.List list, android.os.ParcelFileDescriptor parcelFileDescriptor, defpackage.rxf rxfVar) {
        defpackage.ysr.bk(this.l, "not initialized");
        this.b.a(this.h);
        ((defpackage.yqj) ((defpackage.yqj) a.f()).ai(2632)).x("Start required services %d", j);
        this.c.post(new jqc(this, j, list, a(parcelFileDescriptor), rxfVar, 3));
    }

    @Override // defpackage.rxo
    public final void l(long j, java.util.List list, java.util.List list2, android.os.ParcelFileDescriptor parcelFileDescriptor, defpackage.rxf rxfVar) {
        defpackage.ysr.bk(this.l, "not initialized");
        this.b.a(this.h);
        ((defpackage.yqj) ((defpackage.yqj) a.f()).ai(2633)).x("Start required services with types %d", j);
        this.c.post(new defpackage.jqj(this, j, list, w(list, list2), a(parcelFileDescriptor), rxfVar));
    }

    @Override // defpackage.rxo
    public final void m(long j) {
        defpackage.ysr.bk(this.l, "not initialized");
        this.b.a(this.h);
        this.c.post(new defpackage.lmg(this, j, 1));
        this.k.a();
        ((defpackage.yqj) ((defpackage.yqj) a.f()).ai(2634)).x("Stopping session: %d", j);
    }

    @Override // defpackage.rxo
    public final void n(long j, android.os.Bundle bundle) {
        defpackage.ysr.bk(this.l, "not initialized");
        this.c.post(new defpackage.jqi(this, bundle, j, 1));
    }

    @Override // defpackage.rxo
    public final void o(boolean z, boolean z2) {
        defpackage.ysr.bk(this.l, "not initialized");
        this.b.a(this.h);
        ((defpackage.yqj) ((defpackage.yqj) a.f()).ai(2636)).Q("updateCarAuthorizationState: proj:%b bt:%b", z, z2);
        defpackage.jpc jpcVar = (defpackage.jpc) this.e;
        jpcVar.e.post(new jot(jpcVar, z, z2, 0));
    }

    public final void p() {
        try {
            this.d.await();
        } catch (java.lang.InterruptedException e) {
            java.lang.Thread.currentThread().interrupt();
            ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) a.h()).p(e)).ai((char) 2637)).u("Interrupted while constructing delegate chain!");
        }
    }

    @Override // defpackage.rxo
    public final boolean r(long j) {
        defpackage.ysr.bk(this.l, "not initialized");
        defpackage.yqm yqmVar = a;
        ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 2622)).u("isInterestedInHandoff - initialized");
        this.b.a(this.h);
        ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai(2623)).x("Interested in handoff %d: true", j);
        return true;
    }

    @Override // defpackage.rxo
    public final boolean s(int i, int i2, android.os.ParcelFileDescriptor parcelFileDescriptor, byte[] bArr) {
        defpackage.ysr.bk(this.l, "not initialized");
        if (i != 0 && i != 1) {
            return false;
        }
        ((defpackage.yqj) ((defpackage.yqj) a.h()).ai((char) 2619)).u("Migration finalized. Ignoring migration attempt but pretending to take it.");
        if (parcelFileDescriptor != null) {
            try {
                parcelFileDescriptor.close();
            } catch (java.io.IOException e) {
                ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) a.h()).p(e)).ai((char) 2620)).u("Unable to close file descriptor.");
            }
        }
        return true;
    }

    @Override // defpackage.rxo
    @java.lang.Deprecated
    public final void t() {
    }

    @Override // defpackage.rxo
    public final void u() {
    }
}
