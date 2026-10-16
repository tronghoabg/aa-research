package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class joq implements android.os.IBinder.DeathRecipient, defpackage.jnp, defpackage.jal {
    public static final defpackage.yqm a = defpackage.yqm.c("GH.CarConnSession");
    public final android.content.Context b;
    public final long c;
    public final int d;
    public final android.os.Handler e;
    public final defpackage.imi f;
    public final defpackage.xzi h;
    public final defpackage.jle i;
    public final jqn j;
    public final com.google.android.gms.car.bluetooth.data.CarBluetoothData k;
    public volatile defpackage.jbw l;
    public volatile com.google.android.gms.carsetup.CarInfoInternal m;
    public volatile java.lang.String n;
    public volatile long o;
    public volatile int p;
    public volatile int q;
    public volatile defpackage.xpc r;
    public volatile defpackage.xpc s;
    public final java.util.List t;
    public volatile boolean u;
    public final j$.time.Duration v;
    public boolean w;
    public final boolean x;
    public final defpackage.jpb y;
    public volatile defpackage.skd z;
    private final java.util.concurrent.atomic.AtomicBoolean A = new java.util.concurrent.atomic.AtomicBoolean();
    public final java.util.List g = new java.util.ArrayList();

    public joq(android.content.Context context, long j, j$.time.Duration duration, int i, android.os.Handler handler, defpackage.jpb jpbVar, defpackage.imi imiVar, jqn jqnVar, com.google.android.gms.car.bluetooth.data.CarBluetoothData carBluetoothData) {
        boolean z;
        defpackage.xpc xpcVar = defpackage.xpc.a;
        this.r = xpcVar;
        this.s = xpcVar;
        this.t = new java.util.ArrayList();
        boolean z2 = false;
        this.u = false;
        this.w = false;
        this.b = context;
        this.c = j;
        this.v = duration;
        this.d = i;
        this.e = handler;
        this.y = jpbVar;
        this.f = imiVar;
        this.j = jqnVar;
        defpackage.xzi xziVarAQ = defpackage.ysr.aQ(new defpackage.ilu(context, 17));
        this.h = xziVarAQ;
        if (!defpackage.acsj.a.fF().d()) {
        }
        this.k = carBluetoothData;
        defpackage.jfo jfoVar = imiVar.O;
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            z = true;
        } else {
            try {
                z = hh$.ExternalSyntheticApiModelOutline0.m(context.getPackageManager().getPackageInfo("com.google.android.gms", 0)) >= 221512000;
                if (!z) {
                    jfoVar.e(defpackage.zbe.AUDIO_SERVICE_MIGRATION, defpackage.zbd.yl);
                }
            } catch (android.content.pm.PackageManager.NameNotFoundException e) {
                jfoVar.e(defpackage.zbe.AUDIO_SERVICE_MIGRATION, defpackage.zbd.yj);
                ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) a.h()).p(e)).ai((char) 2471)).u("Unable to determine GMS Core version, so audio service migration will not be available.");
                z = false;
            }
        }
        if (z) {
            this.e.post(new defpackage.aq(this, jfoVar, 18));
        }
        boolean z3 = android.os.Build.VERSION.SDK_INT >= 30;
        defpackage.yqj yqjVar = (defpackage.yqj) ((defpackage.yqj) a.f()).ai(2476);
        java.lang.Boolean boolValueOf = java.lang.Boolean.valueOf(z);
        defpackage.zke zkeVar = defpackage.zke.a;
        yqjVar.M("canCarServiceLiteHandleMigration %s; isMigrationFlagEnabled %s", new defpackage.zkf(zkeVar, boolValueOf), new defpackage.zkf(zkeVar, java.lang.Boolean.valueOf(z3)));
        if (z && z3) {
            z2 = true;
        }
        if (!z2) {
            jfoVar.e(defpackage.zbe.AUDIO_SERVICE_MIGRATION, defpackage.zbd.yn);
        }
        this.x = z2;
        this.i = new defpackage.jle(context);
    }

    static void f(defpackage.jbw jbwVar, java.lang.Iterable iterable, java.util.Map map) {
        defpackage.rsi rsiVar;
        java.util.Iterator it = iterable.iterator();
        while (it.hasNext()) {
            java.lang.Integer num = (java.lang.Integer) it.next();
            int iIntValue = num.intValue();
            if (map.containsKey(num)) {
                rsiVar = (defpackage.rsi) map.get(num);
                rsiVar.getClass();
            } else {
                ((defpackage.yqj) ((defpackage.yqj) a.h()).ai((char) 2467)).w("No service type found for id: %d", iIntValue);
                rsiVar = defpackage.rsi.UNKNOWN;
            }
            ((defpackage.yqj) ((defpackage.yqj) a.f()).ai(2468)).D("Create proxy end points for %d with service type: %s", iIntValue, rsiVar);
            jbwVar.a(new defpackage.jea(iIntValue, rsiVar));
        }
    }

    public static void i(com.google.android.gms.carsetup.CarInfoInternal carInfoInternal, defpackage.imi imiVar) {
        defpackage.jfg jfgVarA = defpackage.jfg.a(imiVar.Y("driver_position_setting_key", defpackage.jfg.d.name()));
        com.google.android.gms.car.CarInfo carInfo = carInfoInternal.a;
        ((defpackage.yqj) a.l().ai((char) 2482)).M("maybeOverrideDriverPosition: carInfoPosition=%s, driverPositionSetting=%s", defpackage.xkf.b(carInfo.h), jfgVarA);
        int iOrdinal = jfgVarA.ordinal();
        if (iOrdinal == 1) {
            carInfo.h = 0;
        } else {
            if (iOrdinal != 2) {
                return;
            }
            carInfo.h = 1;
        }
    }

    public static void j(android.content.SharedPreferences sharedPreferences, android.os.Bundle bundle, java.lang.String str) {
        if (sharedPreferences.contains(str)) {
            bundle.putBoolean(str, sharedPreferences.getBoolean(str, false));
        }
    }

    public static void k(android.content.SharedPreferences sharedPreferences, android.os.Bundle bundle, java.lang.String str) {
        if (sharedPreferences.contains(str)) {
            bundle.putString(str, sharedPreferences.getString(str, null));
        }
    }

    @Override // defpackage.jnp
    public final void a(xiw xiwVar) {
        c();
        e();
        ((defpackage.yqj) ((defpackage.yqj) a.f()).ai(2490)).w("Sending bye-bye request with reason %d", xiwVar == null ? 0 : xiwVar.i);
        this.l.f(xiwVar);
    }

    @Override // defpackage.jbu
    public final void aF(defpackage.zaj zajVar, defpackage.zak zakVar, java.lang.String str) {
        this.e.post(new defpackage.ye((java.lang.Object) this, zajVar, zakVar, str, 11));
    }

    @Override // defpackage.jnp
    public final void b() {
        m(defpackage.zaj.UNKNOWN_CODE, defpackage.zak.UNKNOWN_DETAIL);
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        ((defpackage.yqj) ((defpackage.yqj) a.h()).ai((char) 2466)).u("Startup callback binder died, tearing down connection session.");
        this.e.post(new defpackage.jmy(this, 3, null));
    }

    public final void c() {
        if (this.e.getLooper() != android.os.Looper.myLooper()) {
            throw new java.lang.IllegalStateException();
        }
    }

    public final void d() {
        e();
        if (!this.u) {
            throw new java.lang.IllegalStateException();
        }
    }

    public final void e() {
        this.l.getClass();
        this.z.getClass();
    }

    public final void g(boolean z, xiw xiwVar) {
        for (defpackage.rxr rxrVar : this.g) {
            if (z) {
                try {
                    rxrVar.d(xiwVar.i);
                } catch (android.os.RemoteException e) {
                    ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) a.h()).p(e)).ai((char) 2470)).u("Can't callback to startup service client");
                }
            } else {
                rxrVar.b(xiwVar.i);
            }
        }
    }

    public final void h(com.google.android.gms.carsetup.CarInfoInternal carInfoInternal, defpackage.xpc xpcVar) {
        if (defpackage.acxh.a.fF().a()) {
            if (defpackage.actb.a.fF().h()) {
                java.util.Iterator<E> it = xpcVar.c.iterator();
                while (it.hasNext()) {
                    if ((((defpackage.xpa) it.next()).b & 16384) != 0) {
                        return;
                    }
                }
            }
            com.google.android.gms.car.CarInfo carInfo = carInfoInternal.a;
            ((defpackage.yqj) a.l().ai((char) 2481)).y("Override car provided position to RHD: carInfoPosition=%s", defpackage.xkf.b(carInfo.h));
            carInfo.h = 1;
            defpackage.imi imiVar = this.f;
            imiVar.O.b(defpackage.rrw.h(defpackage.yzd.CAR_SERVICE, defpackage.zbe.CAR_SERVICE, defpackage.zbd.Cq).l());
        }
    }

    public final void l(int i) {
        jlh jlhVar = new jlh();
        jlhVar.a = this.d;
        jlhVar.b = i;
        jlhVar.c = new android.content.Intent();
        jlhVar.a(this.b);
        a(xiw.d);
    }

    public final void m(defpackage.zaj zajVar, defpackage.zak zakVar) {
        c();
        e();
        ((defpackage.yqj) ((defpackage.yqj) a.f()).ai((char) 2501)).u("Tearing down");
        this.r = defpackage.xpc.a;
        this.t.clear();
        defpackage.iml.a.a = false;
        c();
        java.util.List list = this.g;
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            ((defpackage.rxr) it.next()).asBinder().unlinkToDeath(this, 0);
        }
        list.clear();
        if (this.A.compareAndSet(false, true)) {
            this.f.a(com.google.android.gms.car.diagnostics.CriticalError.a(zajVar, zakVar));
        }
        this.l.e();
        this.l.b();
        this.f.ag = null;
        defpackage.jpb jpbVar = this.y;
        jpbVar.c.d.post(new defpackage.jmy(jpbVar, 10, null));
        this.w = true;
    }

    public final boolean n(defpackage.rxr rxrVar) {
        c();
        try {
            rxrVar.asBinder().linkToDeath(this, 0);
            this.g.add(rxrVar);
            return true;
        } catch (android.os.RemoteException e) {
            ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) a.h()).p(e)).ai((char) 2488)).u("Failed to register startup callback.");
            return false;
        }
    }
}
