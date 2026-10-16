package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class qtd extends defpackage.qzc implements defpackage.rvs, defpackage.rvn {
    public static final defpackage.yqk a = defpackage.omv.n("CAR.SENSOR");
    private static final android.util.SparseIntArray f;
    private static final com.google.android.gms.car.CarSensorEvent g;
    public defpackage.qub d;
    private int i;
    private java.util.List j;
    private java.util.List k;
    private final defpackage.rwu l;
    private final android.content.Context m;
    private defpackage.xoy n;
    private final defpackage.wyz p;
    public final java.util.concurrent.locks.ReentrantLock b = new java.util.concurrent.locks.ReentrantLock();
    public final java.util.LinkedList c = new java.util.LinkedList();
    private final android.util.SparseArray h = new android.util.SparseArray();
    public final defpackage.qtc e = new defpackage.qtc();
    private final int o = 2;

    static {
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray(defpackage.xoz.values().length);
        f = sparseIntArray;
        sparseIntArray.put(10, 1);
        sparseIntArray.put(1, 2);
        sparseIntArray.put(2, 3);
        sparseIntArray.put(3, 4);
        sparseIntArray.put(4, 5);
        sparseIntArray.put(5, 6);
        sparseIntArray.put(6, 7);
        sparseIntArray.put(7, 8);
        sparseIntArray.put(8, 9);
        sparseIntArray.put(9, 10);
        sparseIntArray.put(12, 11);
        sparseIntArray.put(13, 12);
        sparseIntArray.put(11, 13);
        sparseIntArray.put(14, 19);
        sparseIntArray.put(15, 14);
        sparseIntArray.put(16, 16);
        sparseIntArray.put(17, 21);
        sparseIntArray.put(18, 20);
        sparseIntArray.put(19, 17);
        sparseIntArray.put(20, 15);
        sparseIntArray.put(21, 18);
        sparseIntArray.put(22, 22);
        sparseIntArray.put(23, 23);
        sparseIntArray.put(24, 24);
        com.google.android.gms.car.CarSensorEvent carSensorEvent = new com.google.android.gms.car.CarSensorEvent(11, android.os.SystemClock.elapsedRealtimeNanos(), 0, 1);
        g = carSensorEvent;
        carSensorEvent.e[0] = 31;
    }

    public qtd(defpackage.wyz wyzVar, defpackage.rwu rwuVar, android.content.Context context) {
        this.p = wyzVar;
        this.l = rwuVar;
        this.m = context;
    }

    public static int c(int i) {
        android.util.SparseIntArray sparseIntArray = f;
        int iIndexOfValue = sparseIntArray.indexOfValue(i);
        if (iIndexOfValue >= 0) {
            return sparseIntArray.keyAt(iIndexOfValue);
        }
        return 0;
    }

    private static com.google.android.gms.car.CarSensorEvent n(int i, defpackage.abpy abpyVar) {
        switch (i) {
            case 1:
                return defpackage.tna.E((xju) abpyVar);
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                return defpackage.tna.S((xph) abpyVar);
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                com.google.android.gms.car.CarSensorEvent carSensorEvent = new com.google.android.gms.car.CarSensorEvent(3, android.os.SystemClock.elapsedRealtimeNanos(), 1, 0);
                carSensorEvent.d[0] = ((xor) abpyVar).b * 0.001f;
                return carSensorEvent;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                return defpackage.tna.Q((xmv) abpyVar);
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                return defpackage.tna.J((xkk) abpyVar);
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                com.google.android.gms.car.CarSensorEvent carSensorEvent2 = new com.google.android.gms.car.CarSensorEvent(6, android.os.SystemClock.elapsedRealtimeNanos(), 0, 1);
                carSensorEvent2.e[0] = ((xmz) abpyVar).b;
                return carSensorEvent2;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                com.google.android.gms.car.CarSensorEvent carSensorEvent3 = new com.google.android.gms.car.CarSensorEvent(7, android.os.SystemClock.elapsedRealtimeNanos(), 0, 1);
                byte[] bArr = carSensorEvent3.e;
                int iZ = defpackage.wqn.z(((xkm) abpyVar).b);
                if (iZ == 0) {
                    iZ = 1;
                }
                bArr[0] = (byte) (iZ - 1);
                return carSensorEvent3;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                return defpackage.tna.G((xkc) abpyVar);
            case 9:
                return defpackage.tna.P((xmu) abpyVar);
            case 10:
                return defpackage.tna.O((xli) abpyVar);
            case 11:
                com.google.android.gms.car.CarSensorEvent carSensorEvent4 = new com.google.android.gms.car.CarSensorEvent(11, android.os.SystemClock.elapsedRealtimeNanos(), 0, 1);
                carSensorEvent4.e[0] = (byte) ((xkg) abpyVar).b;
                return carSensorEvent4;
            case 12:
                return defpackage.tna.I((xkh) abpyVar);
            case 13:
                return defpackage.tna.M((xks) abpyVar);
            case 14:
                return defpackage.tna.D((xhz) abpyVar);
            case 15:
                return defpackage.tna.F((xkb) abpyVar);
            case 16:
                return defpackage.tna.H((xke) abpyVar);
            case 17:
                return defpackage.tna.K((xkp) abpyVar);
            case 18:
                return defpackage.tna.L((xkq) abpyVar);
            case 19:
                return defpackage.tna.N((xlh) abpyVar);
            case 20:
                return defpackage.tna.R((xna) abpyVar);
            case 21:
                return defpackage.tna.T((xpk) abpyVar);
            case 22:
                com.google.android.gms.car.CarSensorEvent carSensorEvent5 = new com.google.android.gms.car.CarSensorEvent(22, android.os.SystemClock.elapsedRealtimeNanos(), 0, 1);
                carSensorEvent5.e[0] = ((xpl) abpyVar).b;
                return carSensorEvent5;
            case 23:
                return new com.google.android.gms.car.CarSensorEvent(23, android.os.SystemClock.elapsedRealtimeNanos(), new float[0], ((xhv) abpyVar).h());
            case 24:
                return new com.google.android.gms.car.CarSensorEvent(24, android.os.SystemClock.elapsedRealtimeNanos(), new float[0], ((xpo) abpyVar).h());
            default:
                throw new java.lang.IllegalArgumentException(defpackage.a.bo(i, "Invalid type "));
        }
    }

    private final qta q(defpackage.qzg qzgVar) {
        java.util.LinkedList<qta> linkedList = this.c;
        android.os.IBinder iBinderAsBinder = qzgVar.asBinder();
        for (qta qtaVar : linkedList) {
            if (qtaVar.a.asBinder() == iBinderAsBinder) {
                return qtaVar;
            }
        }
        return null;
    }

    private static defpackage.xoz r(int i) {
        int i2 = f.get(i, -1);
        if (i2 == -1) {
            throw new java.lang.RuntimeException("Unknown sensor type.");
        }
        defpackage.xoz xozVarB = defpackage.xoz.b(i2);
        xozVarB.getClass();
        return xozVarB;
    }

    private final void u() {
        this.l.c();
        if (this.e.a()) {
            return;
        }
        a.h().ai(7831).u("Sensors endpoint is not opened, throwing CarNotConnectedException");
        throw new java.lang.IllegalStateException("CarNotConnected");
    }

    private final boolean v(int i) {
        java.lang.String strW;
        if (android.os.Binder.getCallingUid() == android.os.Process.myUid() || (strW = w(i)) == null) {
            return true;
        }
        android.content.Context context = this.m;
        defpackage.yqk yqkVar = defpackage.qtq.a;
        defpackage.ypu ypuVarAi = yqkVar.l().ai(7919);
        boolean z = defpackage.qtq.b;
        ypuVarAi.y("Compare pid: %b", java.lang.Boolean.valueOf(z));
        yqkVar.l().ai(7920).B("Calling pid: %d\nProcess pid: %d", android.os.Binder.getCallingPid(), android.os.Process.myPid());
        if (z && android.os.Binder.getCallingPid() == android.os.Process.myPid()) {
            yqkVar.h().ai(7921).u("Caller is self, permission denied");
        } else {
            int iA = defpackage.qtq.a(context, strW);
            if (iA == -2) {
                a.h().ai(7832).y("PERMISSION_DENIED_IGNORE in client for permission: %s", w(i));
                return false;
            }
            if (iA != -1) {
                return true;
            }
        }
        throw new java.lang.SecurityException("client does not have permission:" + w(i) + " pid:" + android.os.Binder.getCallingPid() + " uid:" + android.os.Binder.getCallingUid());
    }

    private static final java.lang.String w(int i) {
        if (i == 2) {
            return "com.google.android.gms.permission.CAR_SPEED";
        }
        if (i == 10) {
            return "android.permission.ACCESS_FINE_LOCATION";
        }
        if (i == 4) {
            return "com.google.android.gms.permission.CAR_MILEAGE";
        }
        if (i != 5) {
            return null;
        }
        return "com.google.android.gms.permission.CAR_FUEL";
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    private final boolean x(int i) {
        defpackage.qtc qtcVar = this.e;
        if (!qtcVar.a()) {
            a.h().ai(7841).u("Sensor channel not available.");
            return false;
        }
        if (qtcVar.b(r(i), 0L)) {
            return true;
        }
        a.h().ai(7840).u("requestSensorStart failed");
        return false;
    }

    @Override // defpackage.rvn
    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final defpackage.rti a(defpackage.xpa xpaVar) {
        if ((xpaVar.b & 2) == 0) {
            return null;
        }
        defpackage.xoy xoyVar = xpaVar.d;
        if (xoyVar == null) {
            xoyVar = defpackage.xoy.c;
        }
        this.n = xoyVar;
        defpackage.xoy xoyVar2 = xpaVar.d;
        if (xoyVar2 == null) {
            xoyVar2 = defpackage.xoy.c;
        }
        this.i = xoyVar2.e;
        this.j = new defpackage.abph(this.n.f, defpackage.xoy.a);
        this.k = new defpackage.abph(this.n.g, defpackage.xoy.b);
        return this;
    }

    @Override // defpackage.rti
    public final defpackage.rvj b(defpackage.rvm rvmVar) {
        return new defpackage.rvu(this.n, this, rvmVar, this.o);
    }

    public final com.google.android.gms.car.CarSensorEvent d(int i) {
        defpackage.abpy abpyVarI;
        defpackage.xoz xozVarR = r(i);
        defpackage.qtc qtcVar = this.e;
        try {
            defpackage.rvu rvuVar = qtcVar.a;
            if (rvuVar != null) {
                abpyVarI = rvuVar.i(xozVarR.A);
            } else {
                defpackage.rxi rxiVar = qtcVar.b;
                abpyVarI = null;
            }
        } catch (android.os.RemoteException unused) {
        }
        if (abpyVarI != null) {
            return n(i, abpyVarI);
        }
        if (i == 11) {
            return g;
        }
        return null;
    }

    @Override // defpackage.qzd
    public final void fl(int i, defpackage.qzg qzgVar) {
        defpackage.qtc qtcVar = this.e;
        if (!qtcVar.a()) {
            a.l().ai(7850).u("unregister while sensor not available");
            return;
        }
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.b;
        reentrantLock.lock();
        try {
            if (java.util.Arrays.binarySearch(qtcVar.c(), i) < 0) {
                a.l().ai(7849).u("unregister for unsupported sensor");
            } else {
                qta qtaVarQ = q(qzgVar);
                if (qtaVarQ == null) {
                    a.l().ai(7848).u("unregister for not existing client");
                } else {
                    qtaVarQ.c(i);
                    if (qtaVarQ.b.size() == 0) {
                        qtaVarQ.b();
                        this.c.remove(qtaVarQ);
                    }
                    android.util.SparseArray sparseArray = this.h;
                    ajku ajkuVar = (ajku) sparseArray.get(i);
                    if (ajkuVar == null) {
                        a.l().ai(7847).u("unregister for non-active sensor");
                    } else {
                        qtb qtbVarH = ajkuVar.h(qtaVarQ);
                        if (qtbVarH != null) {
                            java.lang.Object obj = ajkuVar.b;
                            ((java.util.LinkedList) obj).remove(qtbVarH);
                            boolean z = true;
                            boolean z2 = false;
                            if (ajkuVar.g() == 0) {
                                sparseArray.remove(i);
                            } else {
                                java.util.Iterator it = ((java.util.LinkedList) obj).iterator();
                                int i2 = 3;
                                while (it.hasNext()) {
                                    int i3 = ((qtb) it.next()).b;
                                    if (i3 < i2) {
                                        i2 = i3;
                                    }
                                }
                                if (ajkuVar.a != i2) {
                                    ajkuVar.a = i2;
                                    z2 = true;
                                    z = false;
                                } else {
                                    z = false;
                                }
                            }
                            defpackage.yqk yqkVar = a;
                            yqkVar.l().ai(7845).u("unregister succeeded");
                            this.b.unlock();
                            if (!z) {
                                if (z2) {
                                    x(i);
                                    return;
                                }
                                return;
                            }
                            yqkVar.l().ai(7842).w("stopSensor %d", i);
                            defpackage.qtc qtcVar2 = this.e;
                            if (!qtcVar2.a()) {
                                yqkVar.h().ai(7844).u("Sensor channel not available.");
                                return;
                            } else {
                                yqkVar.l().ai(7843).w("stopSensor requestStop %d", i);
                                qtcVar2.b(r(i), -1L);
                                return;
                            }
                        }
                        a.l().ai(7846).u("unregister for not registered sensor");
                    }
                }
            }
            reentrantLock.unlock();
        } catch (java.lang.Throwable th) {
            this.b.unlock();
            throw th;
        }
    }

    @Override // defpackage.rti
    public final void ft(java.io.PrintWriter printWriter) {
        defpackage.qtc qtcVar = this.e;
        printWriter.println("supported sensors:".concat(java.lang.String.valueOf(java.util.Arrays.toString(qtcVar.c))));
        if (qtcVar.a != null) {
            qtcVar.a.j(printWriter);
        } else {
            defpackage.rxi rxiVar = qtcVar.b;
            printWriter.println("No sensor endpoint");
        }
        printWriter.println("clients");
        try {
            for (qta qtaVar : this.c) {
                if (qtaVar != null) {
                    try {
                        printWriter.println("binder:" + java.lang.String.valueOf(qtaVar.a) + " active sensors:" + java.util.Arrays.toString(qtaVar.d()));
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
            android.util.SparseArray sparseArray = this.h;
            int size = sparseArray.size();
            for (int i = 0; i < size; i++) {
                int iKeyAt = sparseArray.keyAt(i);
                ajku ajkuVar = (ajku) sparseArray.get(iKeyAt);
                if (ajkuVar != null) {
                    printWriter.println(defpackage.a.bq(ajkuVar.a, ajkuVar.g(), iKeyAt, " Sensor:", " num client:", " rate:"));
                }
            }
        } catch (java.util.ConcurrentModificationException unused3) {
            printWriter.println("concurrent modification happened");
        }
        printWriter.println("fuel types: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(this.j))));
    }

    @Override // defpackage.qzd
    public final int g() {
        this.p.i();
        return this.i;
    }

    @Override // defpackage.qzd
    public final com.google.android.gms.car.CarSensorEvent h(int i) {
        u();
        if (v(i)) {
            return d(i);
        }
        return null;
    }

    @Override // defpackage.rvs
    public final void i(defpackage.xoz xozVar, defpackage.abpy abpyVar) {
        int iC = c(xozVar.A);
        this.b.lock();
        try {
            ajku ajkuVar = (ajku) this.h.get(iC);
            if (ajkuVar != null) {
                com.google.android.gms.car.CarSensorEvent carSensorEventN = n(iC, abpyVar);
                java.util.Iterator it = ((java.util.LinkedList) ajkuVar.b).iterator();
                while (it.hasNext()) {
                    ((qtb) it.next()).a.a(carSensorEventN);
                }
            } else {
                a.h().l(1, java.util.concurrent.TimeUnit.MINUTES).ai(7834).w("sensor event while no listener, sensor:%d", iC);
            }
        } finally {
            this.b.unlock();
        }
    }

    @Override // defpackage.rvs
    public final void j() {
        if (this.e.a()) {
            defpackage.qub qubVar = this.d;
            if (qubVar != null && qubVar.c != null) {
                qubVar.d();
                int[] iArr = defpackage.qub.b;
                int length = iArr.length;
                for (int i = 0; i < 4; i++) {
                    qubVar.c.fl(iArr[i], qubVar);
                }
                qubVar.c.fl(10, qubVar);
            }
            try {
                this.b.tryLock(1000L, java.util.concurrent.TimeUnit.MILLISECONDS);
                android.util.SparseArray sparseArray = this.h;
                int size = sparseArray.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    }
                    java.lang.Object obj = ((ajku) sparseArray.valueAt(size)).b;
                    java.util.Iterator it = ((java.util.LinkedList) obj).iterator();
                    while (it.hasNext()) {
                        ((qtb) it.next()).a.b();
                    }
                    ((java.util.LinkedList) obj).clear();
                }
                sparseArray.clear();
                this.c.clear();
            } catch (java.lang.InterruptedException unused) {
            } catch (java.lang.Throwable th) {
                java.util.concurrent.locks.ReentrantLock reentrantLock = this.b;
                if (reentrantLock.isHeldByCurrentThread()) {
                    reentrantLock.unlock();
                }
                throw th;
            }
            java.util.concurrent.locks.ReentrantLock reentrantLock2 = this.b;
            if (reentrantLock2.isHeldByCurrentThread()) {
                reentrantLock2.unlock();
            }
        }
    }

    @Override // defpackage.rti
    public final void k() {
        throw null;
    }

    @Override // defpackage.rti
    public final void l(defpackage.rvj rvjVar) {
        defpackage.qtc qtcVar = this.e;
        defpackage.rvu rvuVar = (defpackage.rvu) rvjVar;
        qtcVar.a = rvuVar;
        int[] iArrL = qtcVar.a.l();
        qtcVar.d = true;
        for (int i : iArrL) {
            if (i == 13) {
                qtcVar.d = false;
                break;
            }
        }
        if (qtcVar.d) {
            a.f().ai(7830).u("No driving status, always restricted");
        }
        qtcVar.c = new int[iArrL.length + (qtcVar.d ? 1 : 0)];
        for (int i2 = 0; i2 < iArrL.length; i2++) {
            qtcVar.c[i2] = c(iArrL[i2]);
        }
        if (qtcVar.d) {
            int[] iArr = qtcVar.c;
            iArr[iArr.length - 1] = 11;
        }
        java.util.Arrays.sort(qtcVar.c);
        synchronized (qtcVar) {
            qtcVar.a = rvuVar;
            qtcVar.b = null;
            qtcVar.notifyAll();
        }
        this.d.f(this);
    }

    public final boolean m() {
        return this.e.a();
    }

    @Override // defpackage.qzd
    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final boolean o(int i, int i2, defpackage.qzg qzgVar) {
        java.lang.Integer numValueOf;
        qtb qtbVarH;
        boolean z;
        u();
        if (!v(i)) {
            return false;
        }
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.b;
        reentrantLock.lock();
        try {
            if (java.util.Arrays.binarySearch(this.e.c(), i) < 0) {
                a.f().ai(7838).w("Requested sensor %d not supported", i);
                reentrantLock.unlock();
                return false;
            }
            a.l().ai(7836).D("registerOrUpdateSensorListener %d %s", i, qzgVar);
            qta qtaVarQ = q(qzgVar);
            ajku ajkuVar = (ajku) this.h.get(i);
            if (qtaVarQ == null) {
                qtaVarQ = new qta(this, qzgVar);
                try {
                    qzgVar.asBinder().linkToDeath(qtaVarQ, 0);
                    this.c.add(qtaVarQ);
                } catch (android.os.RemoteException unused) {
                    a.f().ai(7837).u("Adding listener failed.");
                    this.b.unlock();
                    return false;
                }
            }
            com.google.android.gms.car.CarSensorEvent carSensorEventD = d(i);
            if (carSensorEventD != null) {
                qtaVarQ.a(carSensorEventD);
            }
            if (ajkuVar == null) {
                ajkuVar = new ajku(i2);
                this.h.put(i, ajkuVar);
                qtbVarH = null;
                z = true;
                numValueOf = null;
            } else {
                numValueOf = java.lang.Integer.valueOf(ajkuVar.a);
                qtbVarH = ajkuVar.h(qtaVarQ);
                z = false;
            }
            if (qtbVarH == null) {
                ((java.util.LinkedList) ajkuVar.b).add(new qtb(qtaVarQ, i2));
            } else {
                qtbVarH.b = i2;
            }
            if (ajkuVar.a > i2) {
                ajkuVar.a = i2;
                z = true;
            }
            qtaVarQ.b.put(i, true);
            java.util.concurrent.locks.ReentrantLock reentrantLock2 = this.b;
            reentrantLock2.unlock();
            if (!z || x(i)) {
                return true;
            }
            reentrantLock2.lock();
            try {
                qtaVarQ.c(i);
                if (numValueOf != null) {
                    ajkuVar.a = numValueOf.intValue();
                } else {
                    this.h.remove(i);
                }
                return false;
            } finally {
                this.b.unlock();
            }
        } catch (java.lang.Throwable th) {
            this.b.unlock();
            throw th;
        }
    }

    @Override // defpackage.qzd
    public final int[] p() {
        this.p.i();
        if (this.k.isEmpty()) {
            return null;
        }
        return defpackage.ysr.bJ(this.k);
    }

    @Override // defpackage.qzd
    public final int[] s() {
        this.p.i();
        if (this.j.isEmpty()) {
            return null;
        }
        return defpackage.ysr.bJ(this.j);
    }

    @Override // defpackage.qzd
    public final int[] t() {
        u();
        return this.e.c();
    }
}
