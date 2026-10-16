package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ild extends defpackage.qzc implements defpackage.jcc, defpackage.jbv {
    public static final defpackage.yqm a = defpackage.yqm.c("CAR.SENSOR");
    public static final java.util.Map b = new j$.util.concurrent.ConcurrentHashMap(21);
    private static final com.google.android.gms.car.CarSensorEvent n;
    public final defpackage.yhx c;
    public final boolean d;
    public final java.util.concurrent.locks.ReentrantLock e;
    public final java.util.LinkedList f;
    public java.util.List g;
    public java.util.List h;
    public defpackage.ilr i;
    public final defpackage.jfo j;
    public final defpackage.ilc k;
    public final defpackage.zfw l;
    public final defpackage.ldx m;
    private final android.util.SparseArray o;
    private int p;
    private final defpackage.jfe q;
    private final defpackage.jez r;
    private final android.content.Context s;
    private final defpackage.ilj t;
    private final com.google.android.gms.car.CarInfo u;
    private defpackage.xoy v;

    static {
        com.google.android.gms.car.CarSensorEvent carSensorEvent = new com.google.android.gms.car.CarSensorEvent(11, android.os.SystemClock.elapsedRealtimeNanos(), 0, 1);
        n = carSensorEvent;
        carSensorEvent.e[0] = 31;
    }

    public ild(defpackage.jfe jfeVar, defpackage.jez jezVar, defpackage.jfo jfoVar, android.content.Context context, defpackage.ilj iljVar, com.google.android.gms.car.CarInfo carInfo, defpackage.jli jliVar) {
        defpackage.zfv zfvVar = defpackage.zfv.INSTANCE;
        this.e = new java.util.concurrent.locks.ReentrantLock();
        this.f = new java.util.LinkedList();
        this.o = new android.util.SparseArray();
        this.k = new defpackage.ilc(this);
        this.q = jfeVar;
        this.r = jezVar;
        this.j = jfoVar;
        this.s = context;
        this.t = iljVar;
        this.u = carInfo;
        this.l = zfvVar;
        this.d = !jliVar.c(context);
        this.c = defpackage.yhx.n(defpackage.acpm.a.fF().c().b);
        this.m = new defpackage.ldx((byte[]) null, (byte[]) null);
    }

    static int f(int i, int i2) {
        if (i == i2) {
            return 0;
        }
        if (i == 0) {
            return 1;
        }
        if (i2 == 0) {
            return -1;
        }
        return java.lang.Integer.compare(i, i2);
    }

    private final defpackage.ila u(defpackage.qzg qzgVar) {
        java.util.LinkedList<defpackage.ila> linkedList = this.f;
        android.os.IBinder iBinderAsBinder = qzgVar.asBinder();
        for (defpackage.ila ilaVar : linkedList) {
            if (ilaVar.a.asBinder() == iBinderAsBinder) {
                return ilaVar;
            }
        }
        return null;
    }

    private final void v() {
        this.r.c();
        if (this.k.c()) {
            return;
        }
        ((defpackage.yqj) ((defpackage.yqj) a.h()).ai((char) 200)).u("Sensors endpoint is not opened, throwing CarNotConnectedException");
        throw new java.lang.IllegalStateException("CarNotConnected");
    }

    private final boolean w(int i) {
        java.lang.String strA;
        if (!defpackage.jew.b(i)) {
            this.q.al();
        }
        if (android.os.Binder.getCallingUid() == android.os.Process.myUid() || (strA = defpackage.jew.a(i)) == null) {
            return true;
        }
        int iA = defpackage.ill.a(this.s, strA);
        if (iA == -2) {
            ((defpackage.yqj) ((defpackage.yqj) a.h()).ai((char) 201)).y("PERMISSION_DENIED_IGNORE in client for permission: %s", defpackage.jew.a(i));
            return false;
        }
        if (iA != -1) {
            return true;
        }
        throw new java.lang.SecurityException("client does not have permission:" + defpackage.jew.a(i) + " pid:" + android.os.Binder.getCallingPid() + " uid:" + android.os.Binder.getCallingUid());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    private final boolean x(int i, int i2) {
        defpackage.ilc ilcVar = this.k;
        if (!ilcVar.c()) {
            ((defpackage.yqj) ((defpackage.yqj) a.h()).ai((char) 218)).u("Sensor channel not available.");
            return false;
        }
        if (true != defpackage.jew.a.contains(java.lang.Integer.valueOf(i))) {
            i2 = 0;
        }
        defpackage.ygw ygwVarB = defpackage.jex.b(i);
        int size = ygwVarB.size();
        boolean zD = false;
        for (int i3 = 0; i3 < size; i3++) {
            zD |= ilcVar.d((defpackage.xoz) ygwVarB.get(i3), i2);
        }
        if (zD) {
            return true;
        }
        ((defpackage.yqj) ((defpackage.yqj) a.h()).ai((char) 217)).u("requestSensorStart failed");
        return false;
    }

    @Override // defpackage.jbv
    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final defpackage.izd a(defpackage.xpa xpaVar) {
        java.lang.String str;
        int i = 2;
        if ((xpaVar.b & 2) == 0) {
            if (this.g == null) {
                int i2 = defpackage.ygw.d;
                this.g = defpackage.ymx.a;
            }
            if (this.h != null) {
                return null;
            }
            int i3 = defpackage.ygw.d;
            this.h = defpackage.ymx.a;
            return null;
        }
        defpackage.xoy xoyVar = xpaVar.d;
        if (xoyVar == null) {
            xoyVar = defpackage.xoy.c;
        }
        this.v = xoyVar;
        defpackage.xoy xoyVar2 = xpaVar.d;
        if (xoyVar2 == null) {
            xoyVar2 = defpackage.xoy.c;
        }
        this.p = xoyVar2.e;
        this.g = new defpackage.abph(this.v.f, defpackage.xoy.a);
        this.h = new defpackage.abph(this.v.g, defpackage.xoy.b);
        defpackage.yqm yqmVar = a;
        ((defpackage.yqj) yqmVar.l().ai(211)).y("Car reported fuel types are: %s", this.g);
        ((defpackage.yqj) yqmVar.l().ai(212)).y("Car reported connector types are: %s", this.h);
        com.google.android.gms.car.CarInfo carInfo = this.u;
        if (carInfo == null) {
            this.j.e(defpackage.zbe.CAR_FUEL_TYPE, defpackage.zbd.Kx);
            ((defpackage.yqj) yqmVar.l().ai((char) 207)).u("Car info is null, can't set fuel type overrides");
            return this;
        }
        boolean z = this.g.isEmpty() || this.g.contains(defpackage.xkl.FUEL_TYPE_UNKNOWN);
        ((defpackage.yqj) yqmVar.l().ai((char) 203)).y("shouldShowEvSettings=%s", java.lang.Boolean.valueOf(z));
        if (this.g.size() == 1 && this.g.contains(defpackage.xkl.FUEL_TYPE_ELECTRIC)) {
            this.j.e(defpackage.zbe.CAR_FUEL_TYPE, defpackage.zbd.Ku);
        } else if (this.g.isEmpty() || this.g.contains(defpackage.xkl.FUEL_TYPE_UNKNOWN)) {
            this.j.e(defpackage.zbe.CAR_FUEL_TYPE, defpackage.zbd.Kv);
        }
        java.lang.String str2 = carInfo.a;
        java.lang.String str3 = carInfo.b;
        java.lang.String str4 = carInfo.c;
        defpackage.ilj iljVar = this.t;
        iljVar.f(str2, str3, str4, "car_ev_settings_enabled", z);
        if (defpackage.jfz.d(str2, str3, str4, null, null, (defpackage.yhx) defpackage.tht.d(new defpackage.ilz(14), defpackage.acrl.a.fF().a()).collect(defpackage.yds.b)) && !iljVar.j(java.lang.String.format("%s_%s_%s_%s", str2, str3, str4, "car_ev_features_enabled"))) {
            ((defpackage.yqj) yqmVar.l().ai(206)).R("Car in allowlist, overriding to EV. Make: %s, model: %s, Year: %s", str2, str3, str4);
            iljVar.f(str2, str3, str4, "car_ev_features_enabled", true);
            this.j.e(defpackage.zbe.CAR_FUEL_TYPE, defpackage.zbd.Ks);
        }
        if (iljVar.p(str2, str3, str4, "car_ev_features_enabled") && z) {
            ((defpackage.yqj) yqmVar.l().ai((char) 204)).u("setting fuel type to FUEL_TYPE_ELECTRIC");
            int i4 = defpackage.ygw.d;
            java.lang.Object[] objArr = {defpackage.xkl.FUEL_TYPE_ELECTRIC};
            defpackage.ysr.B(objArr, 1);
            this.g = new defpackage.ymx(objArr, 1);
            this.j.e(defpackage.zbe.CAR_FUEL_TYPE, defpackage.zbd.Kt);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            defpackage.xki[] xkiVarArrValues = defpackage.xki.values();
            int length = xkiVarArrValues.length;
            int i5 = 0;
            while (i5 < length) {
                defpackage.xki xkiVar = xkiVarArrValues[i5];
                int iOrdinal = xkiVar.ordinal();
                if (iOrdinal == 1) {
                    str = "car_ev_connector_type_1";
                } else if (iOrdinal == i) {
                    str = "car_ev_connector_type_2";
                } else if (iOrdinal == 4) {
                    str = "car_ev_connector_type_combo_1";
                } else if (iOrdinal != 5) {
                    str = iOrdinal != 9 ? "" : "car_ev_connector_type_gbt";
                } else {
                    str = "car_ev_connector_type_combo_2";
                }
                if (iljVar.p(str2, str3, str4, str)) {
                    arrayList.add(0, xkiVar);
                    ((defpackage.yqj) yqmVar.l().ai((char) 205)).y("adding connector type %s to list", xkiVar);
                }
                i5++;
                i = 2;
            }
            if (!arrayList.isEmpty()) {
                this.h = arrayList;
            }
        }
        if (this.g.size() == 1 && this.g.contains(defpackage.xkl.FUEL_TYPE_ELECTRIC)) {
            this.j.e(defpackage.zbe.CAR_FUEL_TYPE, defpackage.zbd.Kw);
        }
        return this;
    }

    @Override // defpackage.izd
    public final defpackage.jbq b(defpackage.jbu jbuVar) {
        return new defpackage.jcd(this.v, this, jbuVar);
    }

    @Override // defpackage.izd
    public final defpackage.jdc c() {
        return defpackage.tna.aR();
    }

    @Override // defpackage.izd
    public final defpackage.jdc d() {
        return defpackage.tna.aR();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.qzd
    public final void fl(int i, defpackage.qzg qzgVar) {
        int iIntValue;
        boolean z;
        defpackage.ilc ilcVar = this.k;
        if (!ilcVar.c()) {
            ((defpackage.yqj) a.l().ai((char) 227)).u("unregister while sensor not available");
            return;
        }
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.e;
        reentrantLock.lock();
        try {
            if (java.util.Arrays.binarySearch(ilcVar.e(), i) < 0) {
                ((defpackage.yqj) a.l().ai(226)).u("unregister for unsupported sensor");
            } else {
                defpackage.ila ilaVarU = u(qzgVar);
                if (ilaVarU == null) {
                    ((defpackage.yqj) a.l().ai(225)).u("unregister for not existing client");
                } else {
                    ilaVarU.c(i);
                    if (ilaVarU.b.size() == 0) {
                        ilaVarU.b();
                        this.f.remove(ilaVarU);
                    }
                    android.util.SparseArray sparseArray = this.o;
                    defpackage.imz imzVar = (defpackage.imz) sparseArray.get(i);
                    if (imzVar != null) {
                        java.lang.Object obj = imzVar.b;
                        ((java.util.LinkedList) obj).remove(ilaVarU);
                        boolean z2 = true;
                        if (imzVar.a() == 0) {
                            sparseArray.remove(i);
                            iIntValue = 0;
                            z = false;
                        } else {
                            java.util.Iterator it = ((java.util.LinkedList) obj).iterator();
                            java.lang.Integer num = null;
                            while (it.hasNext()) {
                                java.lang.Integer num2 = (java.lang.Integer) ((defpackage.ila) it.next()).b.get(java.lang.Integer.valueOf(i));
                                if (num2 != null) {
                                    if (num != null) {
                                        if (defpackage.acpm.g()) {
                                            if (f(num.intValue(), num2.intValue()) < 0) {
                                            }
                                        } else if (num2.intValue() < num.intValue()) {
                                        }
                                    }
                                    num = num2;
                                }
                            }
                            if (num == null) {
                                num = 3;
                            }
                            if (imzVar.a != num.intValue()) {
                                iIntValue = num.intValue();
                                imzVar.a = iIntValue;
                                z = true;
                                z2 = false;
                            } else {
                                iIntValue = 0;
                                z = false;
                                z2 = false;
                            }
                        }
                        defpackage.yqm yqmVar = a;
                        ((defpackage.yqj) yqmVar.l().ai(223)).u("unregister succeeded");
                        this.e.unlock();
                        if (!z2) {
                            if (z) {
                                x(i, iIntValue);
                                return;
                            }
                            return;
                        }
                        ((defpackage.yqj) yqmVar.l().ai(219)).w("stopSensor %d", i);
                        defpackage.ilc ilcVar2 = this.k;
                        if (!ilcVar2.c()) {
                            ((defpackage.yqj) ((defpackage.yqj) yqmVar.h()).ai((char) 222)).u("Sensor channel not available.");
                            return;
                        }
                        ((defpackage.yqj) yqmVar.l().ai(220)).w("stopSensor requestStop %d", i);
                        defpackage.ygw ygwVarB = defpackage.jex.b(i);
                        int size = ygwVarB.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            if (!ilcVar2.d((defpackage.xoz) ygwVarB.get(i2), -1L)) {
                                ((defpackage.yqj) ((defpackage.yqj) yqmVar.h()).ai((char) 221)).u("Couldn't send sensor rate request when stopping sensor");
                            }
                        }
                        return;
                    }
                    ((defpackage.yqj) a.l().ai(224)).u("unregister for non-active sensor");
                }
            }
            reentrantLock.unlock();
        } catch (java.lang.Throwable th) {
            this.e.unlock();
            throw th;
        }
    }

    @Override // defpackage.qzd
    public final int g() {
        defpackage.gjz.g(this.q);
        return this.p;
    }

    @Override // defpackage.qzd
    public final com.google.android.gms.car.CarSensorEvent h(int i) {
        v();
        if (w(i)) {
            return i(i);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final com.google.android.gms.car.CarSensorEvent i(int i) {
        defpackage.ygw ygwVarB = defpackage.jex.b(i);
        int size = ygwVarB.size();
        com.google.android.gms.car.CarSensorEvent carSensorEvent = null;
        for (int i2 = 0; i2 < size; i2++) {
            defpackage.abpy abpyVarA = this.k.a((defpackage.xoz) ygwVarB.get(i2));
            if (abpyVarA != null) {
                com.google.android.gms.car.CarSensorEvent carSensorEventF = fyq.f(i, abpyVarA);
                if (carSensorEvent == null || carSensorEventF.c > carSensorEvent.c) {
                    carSensorEvent = carSensorEventF;
                }
            }
        }
        if (carSensorEvent != null) {
            return carSensorEvent;
        }
        if (i == 11) {
            return n;
        }
        return null;
    }

    @Override // defpackage.jcc
    public final void j(defpackage.xoz xozVar, defpackage.abpy abpyVar) {
        int iA = defpackage.jex.a(xozVar.A);
        this.e.lock();
        try {
            defpackage.imz imzVar = (defpackage.imz) this.o.get(iA);
            if (imzVar != null) {
                this.m.p(iA);
                com.google.android.gms.car.CarSensorEvent carSensorEventF = fyq.f(iA, abpyVar);
                java.util.Map map = b;
                synchronized (map) {
                    ((defpackage.yfd) j$.util.Map.-EL.computeIfAbsent(map, java.lang.Integer.valueOf(iA), new defpackage.ikc(7))).add(carSensorEventF);
                }
                java.util.Iterator it = ((java.util.LinkedList) imzVar.b).iterator();
                while (it.hasNext()) {
                    ((defpackage.ila) it.next()).a(carSensorEventF);
                }
            } else {
                ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) a.h()).l(1, java.util.concurrent.TimeUnit.MINUTES)).ai(209)).w("sensor event while no listener, sensor:%d", iA);
            }
            this.e.unlock();
        } catch (java.lang.Throwable th) {
            this.e.unlock();
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.jcc
    public final void k() {
        if (this.k.c()) {
            defpackage.ilr ilrVar = this.i;
            if (ilrVar != null) {
                ilrVar.e.i(ilrVar.g);
                if (ilrVar.d != null) {
                    ilrVar.f.removeCallbacksAndMessages(null);
                    defpackage.ygw ygwVar = defpackage.ilr.b;
                    int i = ((defpackage.ymx) ygwVar).c;
                    for (int i2 = 0; i2 < i; i2++) {
                        ilrVar.d.fl(((java.lang.Integer) ygwVar.get(i2)).intValue(), ilrVar);
                    }
                }
            }
            try {
                this.e.tryLock(1000L, java.util.concurrent.TimeUnit.MILLISECONDS);
                android.util.SparseArray sparseArray = this.o;
                int size = sparseArray.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    }
                    java.lang.Object obj = ((defpackage.imz) sparseArray.valueAt(size)).b;
                    java.util.Iterator it = ((java.util.LinkedList) obj).iterator();
                    while (it.hasNext()) {
                        ((defpackage.ila) it.next()).b();
                    }
                    ((java.util.LinkedList) obj).clear();
                }
                sparseArray.clear();
                this.f.clear();
            } catch (java.lang.InterruptedException unused) {
            } catch (java.lang.Throwable th) {
                java.util.concurrent.locks.ReentrantLock reentrantLock = this.e;
                if (reentrantLock.isHeldByCurrentThread()) {
                    reentrantLock.unlock();
                }
                throw th;
            }
            java.util.concurrent.locks.ReentrantLock reentrantLock2 = this.e;
            if (reentrantLock2.isHeldByCurrentThread()) {
                reentrantLock2.unlock();
            }
        }
    }

    @Override // defpackage.izd
    public final void m(java.io.PrintWriter printWriter) {
        int i;
        defpackage.ilc ilcVar = this.k;
        printWriter.println("supported sensors:".concat(java.lang.String.valueOf(java.util.Arrays.toString(ilcVar.c))));
        java.util.Iterator it = b.entrySet().iterator();
        while (true) {
            i = 0;
            if (!it.hasNext()) {
                break;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            printWriter.println("sensor type: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(entry.getKey()))));
            java.util.ArrayList arrayList = new java.util.ArrayList((java.util.Collection) entry.getValue());
            int size = arrayList.size();
            while (i < size) {
                printWriter.println(java.lang.String.valueOf(java.lang.String.valueOf((com.google.android.gms.car.CarSensorEvent) arrayList.get(i))).concat("\n"));
                i++;
            }
        }
        if (ilcVar.a != null) {
            ilcVar.a.r(printWriter);
        } else if (ilcVar.b != null) {
            printWriter.println("Proxy sensor endpoint");
        } else {
            printWriter.println("No sensor endpoint");
        }
        printWriter.println("clients");
        try {
            for (defpackage.ila ilaVar : this.f) {
                if (ilaVar != null) {
                    try {
                        printWriter.println("binder:" + java.lang.String.valueOf(ilaVar.a) + " active sensors:" + java.util.Arrays.toString(ilaVar.d()));
                    } catch (java.util.ConcurrentModificationException unused) {
                        printWriter.println("concurrent modification happened");
                    }
                } else {
                    printWriter.println("null client");
                }
            }
        } catch (java.util.ConcurrentModificationException unused2) {
            printWriter.println("concurrent modification happened");
        }
        printWriter.println("sensor listeners");
        try {
            android.util.SparseArray sparseArray = this.o;
            int size2 = sparseArray.size();
            while (i < size2) {
                int iKeyAt = sparseArray.keyAt(i);
                defpackage.imz imzVar = (defpackage.imz) sparseArray.get(iKeyAt);
                if (imzVar != null) {
                    printWriter.println(defpackage.a.bq(imzVar.a, imzVar.a(), iKeyAt, " Sensor:", " num client:", " rate:"));
                }
                i++;
            }
        } catch (java.util.ConcurrentModificationException unused3) {
            printWriter.println("concurrent modification happened");
        }
        printWriter.println("fuel types: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(this.g))));
    }

    public final boolean n() {
        return this.k.c();
    }

    @Override // defpackage.qzd
    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final boolean o(int i, int i2, defpackage.qzg qzgVar) {
        java.lang.Integer numValueOf;
        boolean z;
        v();
        if (!w(i)) {
            return false;
        }
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.e;
        reentrantLock.lock();
        try {
            if (java.util.Arrays.binarySearch(this.k.e(), i) < 0) {
                ((defpackage.yqj) ((defpackage.yqj) a.f()).ai(215)).w("Requested sensor %d not supported", i);
                reentrantLock.unlock();
                return false;
            }
            ((defpackage.yqj) a.l().ai(213)).D("registerOrUpdateSensorListener %d %s", i, qzgVar);
            defpackage.ila ilaVarU = u(qzgVar);
            defpackage.imz imzVar = (defpackage.imz) this.o.get(i);
            if (ilaVarU == null) {
                ilaVarU = new defpackage.ila(this, qzgVar);
                try {
                    qzgVar.asBinder().linkToDeath(ilaVarU, 0);
                    this.f.add(ilaVarU);
                } catch (android.os.RemoteException unused) {
                    ((defpackage.yqj) ((defpackage.yqj) a.f()).ai(214)).u("Adding listener failed.");
                    this.e.unlock();
                    return false;
                }
            }
            com.google.android.gms.car.CarSensorEvent carSensorEventI = i(i);
            if (carSensorEventI != null) {
                ilaVarU.a(carSensorEventI);
            }
            if (imzVar == null) {
                imzVar = new defpackage.imz(i2);
                this.o.put(i, imzVar);
                numValueOf = null;
                z = true;
            } else {
                numValueOf = java.lang.Integer.valueOf(imzVar.a);
                z = false;
            }
            ((java.util.LinkedList) imzVar.b).add(ilaVarU);
            if (defpackage.acpm.a.fF().e()) {
                if (f(imzVar.a, i2) < 0) {
                    imzVar.a = i2;
                    z = true;
                }
            } else if (imzVar.a > i2) {
                imzVar.a = i2;
                z = true;
            }
            java.util.Map map = ilaVarU.b;
            java.lang.Integer numValueOf2 = java.lang.Integer.valueOf(i);
            map.put(numValueOf2, java.lang.Integer.valueOf(i2));
            ilaVarU.c.put(numValueOf2, new defpackage.ini(i2));
            java.util.concurrent.locks.ReentrantLock reentrantLock2 = this.e;
            reentrantLock2.unlock();
            if (!z || x(i, i2)) {
                return true;
            }
            reentrantLock2.lock();
            try {
                ilaVarU.c(i);
                if (numValueOf != null) {
                    imzVar.a = numValueOf.intValue();
                } else {
                    this.o.remove(i);
                }
                return false;
            } finally {
                this.e.unlock();
            }
        } catch (java.lang.Throwable th) {
            this.e.unlock();
            throw th;
        }
    }

    @Override // defpackage.qzd
    public final int[] p() {
        defpackage.gjz.g(this.q);
        java.util.List list = this.h;
        list.getClass();
        if (list.isEmpty()) {
            return null;
        }
        return defpackage.ysr.bJ(this.h);
    }

    @Override // defpackage.izd
    public final void q() {
        throw null;
    }

    @Override // defpackage.izd
    public final void r(defpackage.jbq jbqVar) {
        defpackage.ilc ilcVar = this.k;
        defpackage.jcd jcdVar = (defpackage.jcd) jbqVar;
        ilcVar.a = jcdVar;
        ilcVar.b(ilcVar.a.t());
        synchronized (ilcVar) {
            ilcVar.a = jcdVar;
            ilcVar.b = null;
            ilcVar.d = false;
            ilcVar.notifyAll();
        }
        this.i.c(this);
    }

    @Override // defpackage.qzd
    public final int[] s() {
        defpackage.gjz.g(this.q);
        java.util.List list = this.g;
        list.getClass();
        if (list.isEmpty()) {
            return null;
        }
        return defpackage.ysr.bJ(this.g);
    }

    @Override // defpackage.qzd
    public final int[] t() {
        v();
        int[] iArrE = this.k.e();
        ((defpackage.yqj) a.l().ai((char) 202)).y("Supported sensors: %s", java.util.Arrays.toString(iArrE));
        if (this.q.bt()) {
            return iArrE;
        }
        int i = 0;
        for (int i2 : iArrE) {
            if (defpackage.jew.b(i2)) {
                i++;
            }
        }
        int[] iArr = new int[i];
        int i3 = 0;
        for (int i4 : iArrE) {
            if (defpackage.jew.b(i4)) {
                iArr[i3] = i4;
                i3++;
            }
        }
        return iArr;
    }
}
