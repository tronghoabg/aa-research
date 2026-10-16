package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class jcd extends defpackage.jbq {
    private static final defpackage.yqk b = defpackage.omv.n("CAR.GAL.SENSOR");
    private static final int g = 32770;
    private static final int h = 32769;
    private static final int i = 32771;
    private static final int j = 32772;
    public volatile boolean a;
    private final defpackage.jcc c;
    private volatile boolean d;
    private final java.util.concurrent.Semaphore e;
    private final android.util.SparseArray f;

    public jcd(defpackage.xoy xoyVar, defpackage.jcc jccVar, defpackage.jbu jbuVar) {
        super(7, jccVar, jbuVar, 3);
        this.d = false;
        this.e = new java.util.concurrent.Semaphore(0);
        android.util.SparseArray sparseArray = new android.util.SparseArray();
        this.f = sparseArray;
        this.c = jccVar;
        synchronized (sparseArray) {
            for (defpackage.xox xoxVar : xoyVar.d) {
                android.util.SparseArray sparseArray2 = this.f;
                defpackage.xoz xozVarB = defpackage.xoz.b(xoxVar.b);
                if (xozVarB == null) {
                    xozVarB = defpackage.xoz.SENSOR_LOCATION;
                }
                sparseArray2.put(xozVarB.A, new defpackage.rvt());
            }
        }
    }

    public static defpackage.abpy i(defpackage.xoz xozVar, byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        xozVar.getClass();
        try {
            switch (xozVar.ordinal()) {
                case defpackage.abnt.b /* 0 */:
                    return defpackage.abox.B(xli.a, bArr, defpackage.abol.a());
                case 1:
                    return defpackage.abox.B(xju.a, bArr, defpackage.abol.a());
                case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                    return defpackage.abox.B(xph.a, bArr, defpackage.abol.a());
                case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                    return defpackage.abox.B(xor.a, bArr, defpackage.abol.a());
                case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                    return defpackage.abox.B(xmv.a, bArr, defpackage.abol.a());
                case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                    return defpackage.abox.B(xkk.a, bArr, defpackage.abol.a());
                case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                    return defpackage.abox.B(xmz.a, bArr, defpackage.abol.a());
                case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                    return defpackage.abox.x(xkm.a, bArr);
                case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                    return defpackage.abox.B(xkc.a, bArr, defpackage.abol.a());
                case 9:
                    return defpackage.abox.B(xmu.a, bArr, defpackage.abol.a());
                case 10:
                    return defpackage.abox.B(xkh.a, bArr, defpackage.abol.a());
                case 11:
                    return defpackage.abox.B(xks.a, bArr, defpackage.abol.a());
                case 12:
                    return defpackage.abox.B(xkg.a, bArr, defpackage.abol.a());
                case 13:
                    return defpackage.abox.B(xkb.a, bArr, defpackage.abol.a());
                case 14:
                    return defpackage.abox.B(xna.a, bArr, defpackage.abol.a());
                case 15:
                    return defpackage.abox.B(xke.a, bArr, defpackage.abol.a());
                case 16:
                    return defpackage.abox.x(xlh.a, bArr);
                case 17:
                    return defpackage.abox.B(xpk.a, bArr, defpackage.abol.a());
                case 18:
                    return defpackage.abox.B(xhz.a, bArr, defpackage.abol.a());
                case 19:
                    return defpackage.abox.B(xkq.a, bArr, defpackage.abol.a());
                case 20:
                    return defpackage.abox.x(xkp.a, bArr);
                case 21:
                    return defpackage.abox.B(xpl.a, bArr, defpackage.abol.a());
                case 22:
                    return defpackage.abox.B(xhv.a, bArr, defpackage.abol.a());
                case 23:
                    return defpackage.abox.B(xpo.a, bArr, defpackage.abol.a());
                case 24:
                    return defpackage.abox.B(xol.a, bArr, defpackage.abol.a());
                case 25:
                    return defpackage.abox.B(xoj.a, bArr, defpackage.abol.a());
                default:
                    throw new java.lang.IllegalArgumentException("Invalid type " + xozVar.name());
            }
        } catch (defpackage.abpp e) {
            throw new java.lang.RuntimeException("Invalid bytes", e);
        }
    }

    private final void u(defpackage.xoz xozVar, defpackage.abpy abpyVar) {
        android.util.SparseArray sparseArray = this.f;
        synchronized (sparseArray) {
            defpackage.rvt rvtVar = (defpackage.rvt) sparseArray.get(xozVar.A);
            if (rvtVar != null) {
                rvtVar.a = abpyVar;
            }
        }
        this.c.j(xozVar, abpyVar);
    }

    @Override // defpackage.jbq, defpackage.izg
    public final void P(int i2) {
        this.c.k();
        this.a = false;
        android.util.SparseArray sparseArray = this.f;
        synchronized (sparseArray) {
            sparseArray.clear();
        }
    }

    @Override // defpackage.jbq, defpackage.izg
    public final void Q() {
        this.a = true;
        super.Q();
    }

    @Override // defpackage.jbq
    public final void a(int i2, java.nio.ByteBuffer byteBuffer) throws defpackage.abpp {
        int i3 = g;
        if (i3 == 0) {
            throw null;
        }
        if (i2 == i3) {
            defpackage.abox aboxVarC = defpackage.abox.C(defpackage.xow.a, defpackage.abny.M(byteBuffer), defpackage.abol.a);
            defpackage.abox.U(aboxVarC);
            defpackage.abox.U(aboxVarC);
            defpackage.xow xowVar = (defpackage.xow) aboxVarC;
            if (xowVar != null) {
                defpackage.yqk yqkVar = b;
                yqkVar.l().ai(1816).u("handleSensorResponse");
                defpackage.xls xlsVarB = defpackage.xls.b(xowVar.b);
                if (xlsVarB == null) {
                    xlsVarB = defpackage.xls.STATUS_UNSOLICITED_MESSAGE;
                }
                if (defpackage.xls.STATUS_SUCCESS.equals(xlsVarB)) {
                    this.d = true;
                } else {
                    yqkVar.h().ai(1817).y("SensorResponse with error %s", xlsVarB);
                    this.d = false;
                }
                this.e.release();
                return;
            }
            return;
        }
        int i4 = i;
        if (i4 == 0) {
            throw null;
        }
        if (i2 != i4) {
            int i5 = j;
            if (i5 == 0) {
                throw null;
            }
            if (i2 == i5) {
                xot xotVarC = defpackage.abox.C(xot.a, defpackage.abny.M(byteBuffer), defpackage.abol.a);
                defpackage.abox.U(xotVarC);
                defpackage.abox.U(xotVarC);
                xot xotVar = xotVarC;
                if (xotVar != null) {
                    defpackage.ypu ypuVarAi = b.h().ai(1815);
                    defpackage.xoz xozVarB = defpackage.xoz.b(xotVar.b);
                    if (xozVarB == null) {
                        xozVarB = defpackage.xoz.SENSOR_LOCATION;
                    }
                    xou xouVarB = xou.b(xotVar.c);
                    if (xouVarB == null) {
                        xouVarB = xou.a;
                    }
                    ypuVarAi.M("sensor error, sensor:%s error code:%s", xozVarB, xouVarB);
                    return;
                }
                return;
            }
            return;
        }
        xos xosVarC = defpackage.abox.C(xos.a, defpackage.abny.M(byteBuffer), defpackage.abol.a);
        defpackage.abox.U(xosVarC);
        defpackage.abox.U(xosVarC);
        xos xosVar = xosVarC;
        if (xosVar != null) {
            java.util.Iterator<E> it = xosVar.b.iterator();
            while (it.hasNext()) {
                u(defpackage.xoz.SENSOR_LOCATION, (defpackage.abpy) it.next());
            }
            java.util.Iterator<E> it2 = xosVar.c.iterator();
            while (it2.hasNext()) {
                u(defpackage.xoz.SENSOR_COMPASS, (defpackage.abpy) it2.next());
            }
            java.util.Iterator<E> it3 = xosVar.d.iterator();
            while (it3.hasNext()) {
                u(defpackage.xoz.SENSOR_SPEED, (defpackage.abpy) it3.next());
            }
            java.util.Iterator<E> it4 = xosVar.e.iterator();
            while (it4.hasNext()) {
                u(defpackage.xoz.SENSOR_RPM, (defpackage.abpy) it4.next());
            }
            java.util.Iterator<E> it5 = xosVar.f.iterator();
            while (it5.hasNext()) {
                u(defpackage.xoz.SENSOR_ODOMETER, (defpackage.abpy) it5.next());
            }
            java.util.Iterator<E> it6 = xosVar.g.iterator();
            while (it6.hasNext()) {
                u(defpackage.xoz.SENSOR_FUEL, (defpackage.abpy) it6.next());
            }
            java.util.Iterator<E> it7 = xosVar.h.iterator();
            while (it7.hasNext()) {
                u(defpackage.xoz.SENSOR_PARKING_BRAKE, (defpackage.abpy) it7.next());
            }
            java.util.Iterator<E> it8 = xosVar.i.iterator();
            while (it8.hasNext()) {
                u(defpackage.xoz.SENSOR_GEAR, (defpackage.abpy) it8.next());
            }
            java.util.Iterator<E> it9 = xosVar.k.iterator();
            while (it9.hasNext()) {
                u(defpackage.xoz.SENSOR_NIGHT_MODE, (defpackage.abpy) it9.next());
            }
            java.util.Iterator<E> it10 = xosVar.l.iterator();
            while (it10.hasNext()) {
                u(defpackage.xoz.SENSOR_ENVIRONMENT_DATA, (defpackage.abpy) it10.next());
            }
            java.util.Iterator<E> it11 = xosVar.m.iterator();
            while (it11.hasNext()) {
                u(defpackage.xoz.SENSOR_HVAC_DATA, (defpackage.abpy) it11.next());
            }
            java.util.Iterator<E> it12 = xosVar.n.iterator();
            while (it12.hasNext()) {
                u(defpackage.xoz.SENSOR_DRIVING_STATUS_DATA, (defpackage.abpy) it12.next());
            }
            java.util.Iterator<E> it13 = xosVar.t.iterator();
            while (it13.hasNext()) {
                u(defpackage.xoz.SENSOR_ACCELEROMETER_DATA, (defpackage.abpy) it13.next());
            }
            java.util.Iterator<E> it14 = xosVar.u.iterator();
            while (it14.hasNext()) {
                u(defpackage.xoz.SENSOR_GYROSCOPE_DATA, (defpackage.abpy) it14.next());
            }
            java.util.Iterator<E> it15 = xosVar.v.iterator();
            while (it15.hasNext()) {
                u(defpackage.xoz.SENSOR_GPS_SATELLITE_DATA, (defpackage.abpy) it15.next());
            }
            java.util.Iterator<E> it16 = xosVar.o.iterator();
            while (it16.hasNext()) {
                u(defpackage.xoz.SENSOR_DEAD_RECKONING_DATA, (defpackage.abpy) it16.next());
            }
            java.util.Iterator<E> it17 = xosVar.q.iterator();
            while (it17.hasNext()) {
                u(defpackage.xoz.SENSOR_DOOR_DATA, (defpackage.abpy) it17.next());
            }
            java.util.Iterator<E> it18 = xosVar.r.iterator();
            while (it18.hasNext()) {
                u(defpackage.xoz.SENSOR_LIGHT_DATA, (defpackage.abpy) it18.next());
            }
            java.util.Iterator<E> it19 = xosVar.p.iterator();
            while (it19.hasNext()) {
                u(defpackage.xoz.SENSOR_PASSENGER_DATA, (defpackage.abpy) it19.next());
            }
            java.util.Iterator<E> it20 = xosVar.s.iterator();
            while (it20.hasNext()) {
                u(defpackage.xoz.SENSOR_TIRE_PRESSURE_DATA, (defpackage.abpy) it20.next());
            }
            java.util.Iterator<E> it21 = xosVar.j.iterator();
            while (it21.hasNext()) {
                u(defpackage.xoz.SENSOR_OBDII_DIAGNOSTIC_CODE, (defpackage.abpy) it21.next());
            }
            java.util.Iterator<E> it22 = xosVar.w.iterator();
            while (it22.hasNext()) {
                u(defpackage.xoz.SENSOR_TOLL_CARD, (defpackage.abpy) it22.next());
            }
            java.util.Iterator<E> it23 = xosVar.x.iterator();
            while (it23.hasNext()) {
                u(defpackage.xoz.SENSOR_VEHICLE_ENERGY_MODEL_DATA, (defpackage.abpy) it23.next());
            }
            java.util.Iterator<E> it24 = xosVar.y.iterator();
            while (it24.hasNext()) {
                u(defpackage.xoz.SENSOR_TRAILER_DATA, (defpackage.abpy) it24.next());
            }
            java.util.Iterator<E> it25 = xosVar.z.iterator();
            while (it25.hasNext()) {
                u(defpackage.xoz.SENSOR_RAW_VEHICLE_ENERGY_MODEL, (defpackage.abpy) it25.next());
            }
            java.util.Iterator<E> it26 = xosVar.A.iterator();
            while (it26.hasNext()) {
                u(defpackage.xoz.SENSOR_RAW_EV_TRIP_SETTINGS, (defpackage.abpy) it26.next());
            }
        }
    }

    public final defpackage.abpy h(int i2) {
        defpackage.abpy abpyVar;
        android.util.SparseArray sparseArray = this.f;
        synchronized (sparseArray) {
            defpackage.rvt rvtVar = (defpackage.rvt) sparseArray.get(i2);
            abpyVar = rvtVar != null ? rvtVar.a : null;
        }
        return abpyVar;
    }

    public final void r(java.io.PrintWriter printWriter) {
        java.lang.String strConcat;
        java.lang.String str;
        printWriter.println("last events for sensors");
        try {
            android.util.SparseArray sparseArray = this.f;
            int size = sparseArray.size();
            for (int i2 = 0; i2 < size; i2++) {
                int iKeyAt = sparseArray.keyAt(i2);
                defpackage.rvt rvtVar = (defpackage.rvt) sparseArray.get(iKeyAt);
                if (rvtVar != null && rvtVar.a != null) {
                    defpackage.xoz xozVarB = defpackage.xoz.b(iKeyAt);
                    java.lang.String strName = xozVarB != null ? xozVarB.name() : java.lang.String.valueOf(iKeyAt);
                    printWriter.println("  sensor: " + strName + " rate: " + rvtVar.b);
                    if (iKeyAt != 1 && iKeyAt != 128 && iKeyAt != 21) {
                        xmu xmuVar = rvtVar.a;
                        xmuVar.getClass();
                        if (xmuVar instanceof xmu) {
                            strConcat = "Night mode: " + xmuVar.c;
                        } else if (xmuVar instanceof xkg) {
                            strConcat = "Driving status: " + ((xkg) xmuVar).b;
                        } else if (xmuVar instanceof xhv) {
                            xhv xhvVar = (xhv) xmuVar;
                            if ((1 & xhvVar.b) != 0) {
                                xhw xhwVar = xhvVar.c;
                                if (xhwVar == null) {
                                    xhwVar = xhw.a;
                                }
                                java.lang.StringBuilder sb = new java.lang.StringBuilder("VehicleEnergyModelData: ");
                                if ((xhwVar.b & 2) != 0) {
                                    sb.append("battery_level_wh: ");
                                    xhu xhuVar = xhwVar.c;
                                    if (xhuVar == null) {
                                        xhuVar = xhu.a;
                                    }
                                    sb.append(xhuVar.b);
                                    sb.append(" ");
                                }
                                if ((xhwVar.b & 4) != 0) {
                                    sb.append("battery_capacity_wh: ");
                                    xhu xhuVar2 = xhwVar.d;
                                    if (xhuVar2 == null) {
                                        xhuVar2 = xhu.a;
                                    }
                                    sb.append(xhuVar2.b);
                                    sb.append(" ");
                                }
                                sb.append("hvac_status: ");
                                int iAp = defpackage.a.ap(xhwVar.e);
                                if (iAp != 0) {
                                    if (iAp == 2) {
                                        str = "UNKNOWN_HVAC_STATUS";
                                    } else if (iAp == 3) {
                                        str = "OFF_HVAC_STATUS";
                                    } else if (iAp == 4) {
                                        str = "ON_HVAC_STATUS";
                                    }
                                    sb.append(str);
                                    sb.append(" external_temp_celsius: ");
                                    sb.append(xhwVar.f);
                                    sb.append(" battery_temp_celsius: ");
                                    sb.append(xhwVar.g);
                                    strConcat = sb.toString();
                                }
                                str = "UNRECOGNIZED";
                                sb.append(str);
                                sb.append(" external_temp_celsius: ");
                                sb.append(xhwVar.f);
                                sb.append(" battery_temp_celsius: ");
                                sb.append(xhwVar.g);
                                strConcat = sb.toString();
                            } else {
                                strConcat = "VehicleEnergyModelData: (no vehicle info)";
                            }
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

    public final synchronized boolean s(defpackage.xoz xozVar, long j2) {
        defpackage.rvt rvtVar;
        if (!this.a) {
            b.h().l(1, java.util.concurrent.TimeUnit.MINUTES).ai(1825).u("sendSensorRequest on closed channel");
            return false;
        }
        if (this.t) {
            b.h().l(1, java.util.concurrent.TimeUnit.MINUTES).ai(1824).u("sendSensorRequest on quitting channel");
            return false;
        }
        android.util.SparseArray sparseArray = this.f;
        synchronized (sparseArray) {
            rvtVar = (defpackage.rvt) sparseArray.get(xozVar.A);
        }
        if (rvtVar == null) {
            return false;
        }
        if (rvtVar.b == j2) {
            return true;
        }
        java.util.concurrent.Semaphore semaphore = this.e;
        if (semaphore.availablePermits() != 0) {
            b.h().ai(1822).u("sendSensorRequest wait semaphore available, SensorResponse came later?");
            semaphore.drainPermits();
        }
        defpackage.yqk yqkVar = b;
        yqkVar.l().ai(1819).u("sendSensorRequest");
        defpackage.abor aborVarN = defpackage.xov.a.n();
        aborVarN.t();
        defpackage.xov xovVar = (defpackage.xov) aborVarN.b;
        xovVar.c = xozVar.A;
        xovVar.b |= 1;
        aborVarN.t();
        defpackage.xov xovVar2 = (defpackage.xov) aborVarN.b;
        xovVar2.b |= 2;
        xovVar2.d = j2;
        defpackage.xov xovVar3 = (defpackage.xov) aborVarN.q();
        int i2 = h;
        if (i2 == 0) {
            throw null;
        }
        k(i2, xovVar3);
        try {
            if (!semaphore.tryAcquire(2000L, java.util.concurrent.TimeUnit.MILLISECONDS)) {
                yqkVar.g().ai(1820).u("sendSensorRequest timed-out");
                return false;
            }
            yqkVar.l().ai(1821).y("sendSensorRequest returned %b", java.lang.Boolean.valueOf(this.d));
            rvtVar.b = j2;
            if (j2 == -1) {
                rvtVar.a = null;
            }
            return this.d;
        } catch (java.lang.InterruptedException unused) {
            return false;
        }
    }

    public final int[] t() {
        int[] iArr;
        android.util.SparseArray sparseArray = this.f;
        synchronized (sparseArray) {
            iArr = new int[sparseArray.size()];
            for (int i2 = 0; i2 < sparseArray.size(); i2++) {
                iArr[i2] = sparseArray.keyAt(i2);
            }
        }
        return iArr;
    }

    @Override // defpackage.ize
    public final void b(int i2) {
    }
}
