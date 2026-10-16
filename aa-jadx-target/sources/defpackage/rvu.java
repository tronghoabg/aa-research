package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class rvu extends defpackage.rvj {
    public static final /* synthetic */ int b = 0;
    private static final defpackage.yqk c = defpackage.omv.n("CAR.GAL.SENSOR");
    private static final int i = 32770;
    private static final int j = 32769;
    private static final int k = 32771;
    private static final int q = 32772;
    public volatile boolean a;
    private final defpackage.rvs d;
    private volatile boolean e;
    private final java.util.concurrent.Semaphore f;
    private final android.util.SparseArray g;
    private final int h;

    public rvu(defpackage.xoy xoyVar, defpackage.rvs rvsVar, defpackage.rvm rvmVar, int i2) {
        super(7, rvsVar, rvmVar, 3);
        this.e = false;
        this.f = new java.util.concurrent.Semaphore(0);
        android.util.SparseArray sparseArray = new android.util.SparseArray();
        this.g = sparseArray;
        this.d = rvsVar;
        this.h = i2;
        synchronized (sparseArray) {
            for (defpackage.xox xoxVar : xoyVar.d) {
                android.util.SparseArray sparseArray2 = this.g;
                defpackage.xoz xozVarB = defpackage.xoz.b(xoxVar.b);
                if (xozVarB == null) {
                    xozVarB = defpackage.xoz.SENSOR_LOCATION;
                }
                sparseArray2.put(xozVarB.A, new defpackage.rvt());
            }
        }
    }

    private final void q(defpackage.xoz xozVar, defpackage.abpy abpyVar) {
        android.util.SparseArray sparseArray = this.g;
        synchronized (sparseArray) {
            defpackage.rvt rvtVar = (defpackage.rvt) sparseArray.get(xozVar.A);
            if (rvtVar != null) {
                rvtVar.a = abpyVar;
            }
        }
        this.d.i(xozVar, abpyVar);
    }

    @Override // defpackage.rvj
    protected final void d(int i2, java.nio.ByteBuffer byteBuffer) throws defpackage.abpp {
        xot xotVarW;
        int i3 = i;
        if (i3 == 0) {
            throw null;
        }
        if (i2 == i3) {
            defpackage.xow xowVar = (defpackage.xow) defpackage.abox.w(defpackage.xow.a, byteBuffer);
            if (xowVar != null) {
                defpackage.yqk yqkVar = c;
                yqkVar.l().ai(8384).u("handleSensorResponse");
                if (this.h == 2) {
                    yqkVar.l().ai(8386).u("Not handling sensor response for readonly sensors endpoint.");
                    return;
                }
                defpackage.xls xlsVarB = defpackage.xls.b(xowVar.b);
                if (xlsVarB == null) {
                    xlsVarB = defpackage.xls.STATUS_UNSOLICITED_MESSAGE;
                }
                if (defpackage.xls.STATUS_SUCCESS.equals(xlsVarB)) {
                    this.e = true;
                } else {
                    yqkVar.h().ai(8385).y("SensorResponse with error %s", xlsVarB);
                    this.e = false;
                }
                this.f.release();
                return;
            }
            return;
        }
        int i4 = k;
        if (i4 == 0) {
            throw null;
        }
        if (i2 != i4) {
            int i5 = q;
            if (i5 == 0) {
                throw null;
            }
            if (i2 != i5 || (xotVarW = defpackage.abox.w(xot.a, byteBuffer)) == null) {
                return;
            }
            defpackage.ypu ypuVarAi = c.h().ai(8383);
            defpackage.xoz xozVarB = defpackage.xoz.b(xotVarW.b);
            if (xozVarB == null) {
                xozVarB = defpackage.xoz.SENSOR_LOCATION;
            }
            xou xouVarB = xou.b(xotVarW.c);
            if (xouVarB == null) {
                xouVarB = xou.a;
            }
            ypuVarAi.M("sensor error, sensor:%s error code:%s", xozVarB, xouVarB);
            return;
        }
        xos xosVarW = defpackage.abox.w(xos.a, byteBuffer);
        if (xosVarW != null) {
            java.util.Iterator<E> it = xosVarW.b.iterator();
            while (it.hasNext()) {
                q(defpackage.xoz.SENSOR_LOCATION, (defpackage.abpy) it.next());
            }
            java.util.Iterator<E> it2 = xosVarW.c.iterator();
            while (it2.hasNext()) {
                q(defpackage.xoz.SENSOR_COMPASS, (defpackage.abpy) it2.next());
            }
            java.util.Iterator<E> it3 = xosVarW.d.iterator();
            while (it3.hasNext()) {
                q(defpackage.xoz.SENSOR_SPEED, (defpackage.abpy) it3.next());
            }
            java.util.Iterator<E> it4 = xosVarW.e.iterator();
            while (it4.hasNext()) {
                q(defpackage.xoz.SENSOR_RPM, (defpackage.abpy) it4.next());
            }
            java.util.Iterator<E> it5 = xosVarW.f.iterator();
            while (it5.hasNext()) {
                q(defpackage.xoz.SENSOR_ODOMETER, (defpackage.abpy) it5.next());
            }
            java.util.Iterator<E> it6 = xosVarW.g.iterator();
            while (it6.hasNext()) {
                q(defpackage.xoz.SENSOR_FUEL, (defpackage.abpy) it6.next());
            }
            java.util.Iterator<E> it7 = xosVarW.h.iterator();
            while (it7.hasNext()) {
                q(defpackage.xoz.SENSOR_PARKING_BRAKE, (defpackage.abpy) it7.next());
            }
            java.util.Iterator<E> it8 = xosVarW.i.iterator();
            while (it8.hasNext()) {
                q(defpackage.xoz.SENSOR_GEAR, (defpackage.abpy) it8.next());
            }
            java.util.Iterator<E> it9 = xosVarW.k.iterator();
            while (it9.hasNext()) {
                q(defpackage.xoz.SENSOR_NIGHT_MODE, (defpackage.abpy) it9.next());
            }
            java.util.Iterator<E> it10 = xosVarW.l.iterator();
            while (it10.hasNext()) {
                q(defpackage.xoz.SENSOR_ENVIRONMENT_DATA, (defpackage.abpy) it10.next());
            }
            java.util.Iterator<E> it11 = xosVarW.m.iterator();
            while (it11.hasNext()) {
                q(defpackage.xoz.SENSOR_HVAC_DATA, (defpackage.abpy) it11.next());
            }
            java.util.Iterator<E> it12 = xosVarW.n.iterator();
            while (it12.hasNext()) {
                q(defpackage.xoz.SENSOR_DRIVING_STATUS_DATA, (defpackage.abpy) it12.next());
            }
            java.util.Iterator<E> it13 = xosVarW.t.iterator();
            while (it13.hasNext()) {
                q(defpackage.xoz.SENSOR_ACCELEROMETER_DATA, (defpackage.abpy) it13.next());
            }
            java.util.Iterator<E> it14 = xosVarW.u.iterator();
            while (it14.hasNext()) {
                q(defpackage.xoz.SENSOR_GYROSCOPE_DATA, (defpackage.abpy) it14.next());
            }
            java.util.Iterator<E> it15 = xosVarW.v.iterator();
            while (it15.hasNext()) {
                q(defpackage.xoz.SENSOR_GPS_SATELLITE_DATA, (defpackage.abpy) it15.next());
            }
            java.util.Iterator<E> it16 = xosVarW.o.iterator();
            while (it16.hasNext()) {
                q(defpackage.xoz.SENSOR_DEAD_RECKONING_DATA, (defpackage.abpy) it16.next());
            }
            java.util.Iterator<E> it17 = xosVarW.q.iterator();
            while (it17.hasNext()) {
                q(defpackage.xoz.SENSOR_DOOR_DATA, (defpackage.abpy) it17.next());
            }
            java.util.Iterator<E> it18 = xosVarW.r.iterator();
            while (it18.hasNext()) {
                q(defpackage.xoz.SENSOR_LIGHT_DATA, (defpackage.abpy) it18.next());
            }
            java.util.Iterator<E> it19 = xosVarW.p.iterator();
            while (it19.hasNext()) {
                q(defpackage.xoz.SENSOR_PASSENGER_DATA, (defpackage.abpy) it19.next());
            }
            java.util.Iterator<E> it20 = xosVarW.s.iterator();
            while (it20.hasNext()) {
                q(defpackage.xoz.SENSOR_TIRE_PRESSURE_DATA, (defpackage.abpy) it20.next());
            }
            java.util.Iterator<E> it21 = xosVarW.j.iterator();
            while (it21.hasNext()) {
                q(defpackage.xoz.SENSOR_OBDII_DIAGNOSTIC_CODE, (defpackage.abpy) it21.next());
            }
            java.util.Iterator<E> it22 = xosVarW.w.iterator();
            while (it22.hasNext()) {
                q(defpackage.xoz.SENSOR_TOLL_CARD, (defpackage.abpy) it22.next());
            }
        }
    }

    public final defpackage.abpy i(int i2) {
        defpackage.abpy abpyVar;
        android.util.SparseArray sparseArray = this.g;
        synchronized (sparseArray) {
            defpackage.rvt rvtVar = (defpackage.rvt) sparseArray.get(i2);
            abpyVar = rvtVar != null ? rvtVar.a : null;
        }
        return abpyVar;
    }

    public final void j(java.io.PrintWriter printWriter) {
        java.lang.String strConcat;
        printWriter.println("last events for sensors");
        try {
            android.util.SparseArray sparseArray = this.g;
            int size = sparseArray.size();
            for (int i2 = 0; i2 < size; i2++) {
                int iKeyAt = sparseArray.keyAt(i2);
                defpackage.rvt rvtVar = (defpackage.rvt) sparseArray.get(iKeyAt);
                if (rvtVar != null && rvtVar.a != null) {
                    printWriter.println("  sensor: " + iKeyAt + " rate: " + rvtVar.b);
                    if (iKeyAt != 1 && iKeyAt != 128 && iKeyAt != 21) {
                        xmu xmuVar = rvtVar.a;
                        xmuVar.getClass();
                        if (xmuVar instanceof xmu) {
                            strConcat = "Night mode: " + xmuVar.c;
                        } else if (xmuVar instanceof xkg) {
                            strConcat = "Driving status: " + ((xkg) xmuVar).b;
                        } else {
                            strConcat = "Message: ".concat(java.lang.String.valueOf(xmuVar.toString().trim()));
                        }
                        printWriter.println(defpackage.a.bA(strConcat, "    "));
                    }
                }
            }
        } catch (java.util.ConcurrentModificationException unused) {
            printWriter.println("concurrent modification happened");
        }
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final synchronized boolean k(defpackage.xoz xozVar, long j2) {
        defpackage.rvt rvtVar;
        if (!this.a) {
            c.h().l(1, java.util.concurrent.TimeUnit.MINUTES).ai(8395).u("sendSensorRequest on closed channel");
            return false;
        }
        if (this.l) {
            c.h().l(1, java.util.concurrent.TimeUnit.MINUTES).ai(8394).u("sendSensorRequest on quitting channel");
            return false;
        }
        android.util.SparseArray sparseArray = this.g;
        synchronized (sparseArray) {
            rvtVar = (defpackage.rvt) sparseArray.get(xozVar.A);
        }
        if (rvtVar == null) {
            return false;
        }
        if (rvtVar.b == j2) {
            return true;
        }
        if (this.h == 2) {
            c.l().ai(8393).u("Not sending sensor request for readonly sensors endpoint.");
            rvtVar.b = j2;
            if (j2 == -1) {
                rvtVar.a = null;
            }
            return true;
        }
        java.util.concurrent.Semaphore semaphore = this.f;
        if (semaphore.availablePermits() != 0) {
            c.h().ai(8392).u("sendSensorRequest wait semaphore available, SensorResponse came later?");
            semaphore.drainPermits();
        }
        defpackage.yqk yqkVar = c;
        yqkVar.l().ai(8387).u("sendSensorRequest");
        defpackage.abor aborVarN = defpackage.xov.a.n();
        aborVarN.t();
        defpackage.xov xovVar = (defpackage.xov) aborVarN.b;
        xovVar.c = xozVar.A;
        xovVar.b |= 1;
        aborVarN.t();
        defpackage.xov xovVar2 = (defpackage.xov) aborVarN.b;
        xovVar2.b = 2 | xovVar2.b;
        xovVar2.d = j2;
        defpackage.xov xovVar3 = (defpackage.xov) aborVarN.q();
        int i2 = j;
        if (i2 == 0) {
            throw null;
        }
        super.o(i2, xovVar3, true);
        try {
            if (!semaphore.tryAcquire(2000L, java.util.concurrent.TimeUnit.MILLISECONDS)) {
                yqkVar.g().ai(8388).u("sendSensorRequest timed-out");
                return false;
            }
            yqkVar.l().ai(8391).y("sendSensorRequest returned %b", java.lang.Boolean.valueOf(this.e));
            rvtVar.b = j2;
            if (j2 == -1) {
                rvtVar.a = null;
            }
            return this.e;
        } catch (java.lang.InterruptedException unused) {
            return false;
        }
    }

    public final int[] l() {
        int[] iArr;
        android.util.SparseArray sparseArray = this.g;
        synchronized (sparseArray) {
            iArr = new int[sparseArray.size()];
            for (int i2 = 0; i2 < sparseArray.size(); i2++) {
                iArr[i2] = sparseArray.keyAt(i2);
            }
        }
        return iArr;
    }

    @Override // defpackage.rvj, defpackage.rtk
    public final void u(int i2) {
        this.d.j();
        this.a = false;
        android.util.SparseArray sparseArray = this.g;
        synchronized (sparseArray) {
            sparseArray.clear();
        }
    }

    @Override // defpackage.rvj, defpackage.rtk
    public final void v() {
        this.a = true;
        super.v();
    }

    @Override // defpackage.rvj
    public final void w(android.os.Bundle bundle) {
        if (!this.a) {
            throw new java.lang.IllegalStateException("Can't suspend SensorsEndPoint");
        }
        if (this.f.availablePermits() != 0) {
            c.h().ai(8382).u("sendSensorRequest wait semaphore available, SensorResponse came later?");
        }
        android.util.SparseArray sparseArray = this.g;
        synchronized (sparseArray) {
            java.util.ArrayList arrayList = new java.util.ArrayList(sparseArray.size());
            for (int i2 = 0; i2 < sparseArray.size(); i2++) {
                defpackage.rvt rvtVar = (defpackage.rvt) sparseArray.valueAt(i2);
                defpackage.abpy abpyVar = rvtVar.a;
                arrayList.add(android.util.Pair.create(java.lang.Integer.valueOf(sparseArray.keyAt(i2)), android.util.Pair.create(abpyVar != null ? abpyVar.h() : null, java.lang.Long.valueOf(rvtVar.b))));
            }
            defpackage.yqk yqkVar = defpackage.rvp.a;
            bundle.putBinder("sensor_records", new ruv(arrayList));
        }
    }

    @Override // defpackage.rtj
    public final void e(int i2) {
    }
}
