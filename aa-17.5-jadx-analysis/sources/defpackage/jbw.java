package defpackage;

import android.util.SparseArray;
import java.io.PrintWriter;
import java.nio.ByteBuffer;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class jbw extends jbj {
    private static final ypf b = ols.R("CAR.GAL.SENSOR");
    private static final int g = 32770;
    private static final int h = 32769;
    private static final int i = 32771;
    private static final int j = 32772;
    public volatile boolean a;
    private final jbv c;
    private volatile boolean d;
    private final Semaphore e;
    private final SparseArray f;

    public jbw(xnx xnxVar, jbv jbvVar, jbn jbnVar) {
        super(7, jbvVar, jbnVar, 3);
        this.d = false;
        this.e = new Semaphore(0);
        SparseArray sparseArray = new SparseArray();
        this.f = sparseArray;
        this.c = jbvVar;
        synchronized (sparseArray) {
            for (xnw xnwVar : xnxVar.d) {
                SparseArray sparseArray2 = this.f;
                xny xnyVarB = xny.b(xnwVar.b);
                if (xnyVarB == null) {
                    xnyVarB = xny.SENSOR_LOCATION;
                }
                sparseArray2.put(xnyVarB.A, new rva());
            }
        }
    }

    public static abow i(xny xnyVar, byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        xnyVar.getClass();
        try {
            switch (xnyVar) {
                case SENSOR_LOCATION:
                    return (xkh) abnv.B(xkh.a, bArr, abnj.a());
                case SENSOR_COMPASS:
                    return (xit) abnv.B(xit.a, bArr, abnj.a());
                case SENSOR_SPEED:
                    return (xog) abnv.B(xog.a, bArr, abnj.a());
                case SENSOR_RPM:
                    return (xnq) abnv.B(xnq.a, bArr, abnj.a());
                case SENSOR_ODOMETER:
                    return (xlu) abnv.B(xlu.a, bArr, abnj.a());
                case SENSOR_FUEL:
                    return (xjj) abnv.B(xjj.a, bArr, abnj.a());
                case SENSOR_PARKING_BRAKE:
                    return (xly) abnv.B(xly.a, bArr, abnj.a());
                case SENSOR_GEAR:
                    return (xjl) abnv.x(xjl.a, bArr);
                case SENSOR_OBDII_DIAGNOSTIC_CODE:
                    return (xjb) abnv.B(xjb.a, bArr, abnj.a());
                case SENSOR_NIGHT_MODE:
                    return (xlt) abnv.B(xlt.a, bArr, abnj.a());
                case SENSOR_ENVIRONMENT_DATA:
                    return (xjg) abnv.B(xjg.a, bArr, abnj.a());
                case SENSOR_HVAC_DATA:
                    return (xjr) abnv.B(xjr.a, bArr, abnj.a());
                case SENSOR_DRIVING_STATUS_DATA:
                    return (xjf) abnv.B(xjf.a, bArr, abnj.a());
                case SENSOR_DEAD_RECKONING_DATA:
                    return (xja) abnv.B(xja.a, bArr, abnj.a());
                case SENSOR_PASSENGER_DATA:
                    return (xlz) abnv.B(xlz.a, bArr, abnj.a());
                case SENSOR_DOOR_DATA:
                    return (xjd) abnv.B(xjd.a, bArr, abnj.a());
                case SENSOR_LIGHT_DATA:
                    return (xkg) abnv.x(xkg.a, bArr);
                case SENSOR_TIRE_PRESSURE_DATA:
                    return (xoj) abnv.B(xoj.a, bArr, abnj.a());
                case SENSOR_ACCELEROMETER_DATA:
                    return (xgy) abnv.B(xgy.a, bArr, abnj.a());
                case SENSOR_GYROSCOPE_DATA:
                    return (xjp) abnv.B(xjp.a, bArr, abnj.a());
                case SENSOR_GPS_SATELLITE_DATA:
                    return (xjo) abnv.x(xjo.a, bArr);
                case SENSOR_TOLL_CARD:
                    return (xok) abnv.B(xok.a, bArr, abnj.a());
                case SENSOR_VEHICLE_ENERGY_MODEL_DATA:
                    return (xgu) abnv.B(xgu.a, bArr, abnj.a());
                case SENSOR_TRAILER_DATA:
                    return (xon) abnv.B(xon.a, bArr, abnj.a());
                case SENSOR_RAW_VEHICLE_ENERGY_MODEL:
                    return (xnk) abnv.B(xnk.a, bArr, abnj.a());
                case SENSOR_RAW_EV_TRIP_SETTINGS:
                    return (xni) abnv.B(xni.a, bArr, abnj.a());
                default:
                    throw new IllegalArgumentException("Invalid type " + xnyVar.name());
            }
        } catch (abon e) {
            throw new RuntimeException("Invalid bytes", e);
        }
    }

    private final void u(xny xnyVar, abow abowVar) {
        SparseArray sparseArray = this.f;
        synchronized (sparseArray) {
            rva rvaVar = (rva) sparseArray.get(xnyVar.A);
            if (rvaVar != null) {
                rvaVar.a = abowVar;
            }
        }
        this.c.j(xnyVar, abowVar);
    }

    @Override // defpackage.jbj, defpackage.iyz
    public final void P(int i2) {
        this.c.k();
        this.a = false;
        SparseArray sparseArray = this.f;
        synchronized (sparseArray) {
            sparseArray.clear();
        }
    }

    @Override // defpackage.jbj, defpackage.iyz
    public final void Q() {
        this.a = true;
        super.Q();
    }

    @Override // defpackage.jbj
    public final void a(int i2, ByteBuffer byteBuffer) throws abon {
        int i3 = g;
        if (i3 == 0) {
            throw null;
        }
        if (i2 == i3) {
            abnv abnvVarC = abnv.C(xnv.a, abmw.O(byteBuffer), abnj.a);
            abnv.U(abnvVarC);
            abnv.U(abnvVarC);
            xnv xnvVar = (xnv) abnvVarC;
            if (xnvVar != null) {
                ypf ypfVar = b;
                ypfVar.l().ai(1816).u("handleSensorResponse");
                xkr xkrVarB = xkr.b(xnvVar.b);
                if (xkrVarB == null) {
                    xkrVarB = xkr.STATUS_UNSOLICITED_MESSAGE;
                }
                if (xkr.STATUS_SUCCESS.equals(xkrVarB)) {
                    this.d = true;
                } else {
                    ypfVar.h().ai(1817).y("SensorResponse with error %s", xkrVarB);
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
                abnv abnvVarC2 = abnv.C(xns.a, abmw.O(byteBuffer), abnj.a);
                abnv.U(abnvVarC2);
                abnv.U(abnvVarC2);
                xns xnsVar = (xns) abnvVarC2;
                if (xnsVar != null) {
                    yop yopVarAi = b.h().ai(1815);
                    xny xnyVarB = xny.b(xnsVar.b);
                    if (xnyVarB == null) {
                        xnyVarB = xny.SENSOR_LOCATION;
                    }
                    xnt xntVarB = xnt.b(xnsVar.c);
                    if (xntVarB == null) {
                        xntVarB = xnt.SENSOR_OK;
                    }
                    yopVarAi.M("sensor error, sensor:%s error code:%s", xnyVarB, xntVarB);
                    return;
                }
                return;
            }
            return;
        }
        abnv abnvVarC3 = abnv.C(xnr.a, abmw.O(byteBuffer), abnj.a);
        abnv.U(abnvVarC3);
        abnv.U(abnvVarC3);
        xnr xnrVar = (xnr) abnvVarC3;
        if (xnrVar != null) {
            Iterator<E> it = xnrVar.b.iterator();
            while (it.hasNext()) {
                u(xny.SENSOR_LOCATION, (abow) it.next());
            }
            Iterator<E> it2 = xnrVar.c.iterator();
            while (it2.hasNext()) {
                u(xny.SENSOR_COMPASS, (abow) it2.next());
            }
            Iterator<E> it3 = xnrVar.d.iterator();
            while (it3.hasNext()) {
                u(xny.SENSOR_SPEED, (abow) it3.next());
            }
            Iterator<E> it4 = xnrVar.e.iterator();
            while (it4.hasNext()) {
                u(xny.SENSOR_RPM, (abow) it4.next());
            }
            Iterator<E> it5 = xnrVar.f.iterator();
            while (it5.hasNext()) {
                u(xny.SENSOR_ODOMETER, (abow) it5.next());
            }
            Iterator<E> it6 = xnrVar.g.iterator();
            while (it6.hasNext()) {
                u(xny.SENSOR_FUEL, (abow) it6.next());
            }
            Iterator<E> it7 = xnrVar.h.iterator();
            while (it7.hasNext()) {
                u(xny.SENSOR_PARKING_BRAKE, (abow) it7.next());
            }
            Iterator<E> it8 = xnrVar.i.iterator();
            while (it8.hasNext()) {
                u(xny.SENSOR_GEAR, (abow) it8.next());
            }
            Iterator<E> it9 = xnrVar.k.iterator();
            while (it9.hasNext()) {
                u(xny.SENSOR_NIGHT_MODE, (abow) it9.next());
            }
            Iterator<E> it10 = xnrVar.l.iterator();
            while (it10.hasNext()) {
                u(xny.SENSOR_ENVIRONMENT_DATA, (abow) it10.next());
            }
            Iterator<E> it11 = xnrVar.m.iterator();
            while (it11.hasNext()) {
                u(xny.SENSOR_HVAC_DATA, (abow) it11.next());
            }
            Iterator<E> it12 = xnrVar.n.iterator();
            while (it12.hasNext()) {
                u(xny.SENSOR_DRIVING_STATUS_DATA, (abow) it12.next());
            }
            Iterator<E> it13 = xnrVar.t.iterator();
            while (it13.hasNext()) {
                u(xny.SENSOR_ACCELEROMETER_DATA, (abow) it13.next());
            }
            Iterator<E> it14 = xnrVar.u.iterator();
            while (it14.hasNext()) {
                u(xny.SENSOR_GYROSCOPE_DATA, (abow) it14.next());
            }
            Iterator<E> it15 = xnrVar.v.iterator();
            while (it15.hasNext()) {
                u(xny.SENSOR_GPS_SATELLITE_DATA, (abow) it15.next());
            }
            Iterator<E> it16 = xnrVar.o.iterator();
            while (it16.hasNext()) {
                u(xny.SENSOR_DEAD_RECKONING_DATA, (abow) it16.next());
            }
            Iterator<E> it17 = xnrVar.q.iterator();
            while (it17.hasNext()) {
                u(xny.SENSOR_DOOR_DATA, (abow) it17.next());
            }
            Iterator<E> it18 = xnrVar.r.iterator();
            while (it18.hasNext()) {
                u(xny.SENSOR_LIGHT_DATA, (abow) it18.next());
            }
            Iterator<E> it19 = xnrVar.p.iterator();
            while (it19.hasNext()) {
                u(xny.SENSOR_PASSENGER_DATA, (abow) it19.next());
            }
            Iterator<E> it20 = xnrVar.s.iterator();
            while (it20.hasNext()) {
                u(xny.SENSOR_TIRE_PRESSURE_DATA, (abow) it20.next());
            }
            Iterator<E> it21 = xnrVar.j.iterator();
            while (it21.hasNext()) {
                u(xny.SENSOR_OBDII_DIAGNOSTIC_CODE, (abow) it21.next());
            }
            Iterator<E> it22 = xnrVar.w.iterator();
            while (it22.hasNext()) {
                u(xny.SENSOR_TOLL_CARD, (abow) it22.next());
            }
            Iterator<E> it23 = xnrVar.x.iterator();
            while (it23.hasNext()) {
                u(xny.SENSOR_VEHICLE_ENERGY_MODEL_DATA, (abow) it23.next());
            }
            Iterator<E> it24 = xnrVar.y.iterator();
            while (it24.hasNext()) {
                u(xny.SENSOR_TRAILER_DATA, (abow) it24.next());
            }
            Iterator<E> it25 = xnrVar.z.iterator();
            while (it25.hasNext()) {
                u(xny.SENSOR_RAW_VEHICLE_ENERGY_MODEL, (abow) it25.next());
            }
            Iterator<E> it26 = xnrVar.A.iterator();
            while (it26.hasNext()) {
                u(xny.SENSOR_RAW_EV_TRIP_SETTINGS, (abow) it26.next());
            }
        }
    }

    public final abow h(int i2) {
        abow abowVar;
        SparseArray sparseArray = this.f;
        synchronized (sparseArray) {
            rva rvaVar = (rva) sparseArray.get(i2);
            abowVar = rvaVar != null ? rvaVar.a : null;
        }
        return abowVar;
    }

    public final void r(PrintWriter printWriter) {
        String strConcat;
        String str;
        printWriter.println("last events for sensors");
        try {
            SparseArray sparseArray = this.f;
            int size = sparseArray.size();
            for (int i2 = 0; i2 < size; i2++) {
                int iKeyAt = sparseArray.keyAt(i2);
                rva rvaVar = (rva) sparseArray.get(iKeyAt);
                if (rvaVar != null && rvaVar.a != null) {
                    xny xnyVarB = xny.b(iKeyAt);
                    String strName = xnyVarB != null ? xnyVarB.name() : String.valueOf(iKeyAt);
                    printWriter.println("  sensor: " + strName + " rate: " + rvaVar.b);
                    if (iKeyAt != 1 && iKeyAt != 128 && iKeyAt != 21) {
                        abow abowVar = rvaVar.a;
                        abowVar.getClass();
                        if (abowVar instanceof xlt) {
                            strConcat = "Night mode: " + ((xlt) abowVar).c;
                        } else if (abowVar instanceof xjf) {
                            strConcat = "Driving status: " + ((xjf) abowVar).b;
                        } else if (abowVar instanceof xgu) {
                            xgu xguVar = (xgu) abowVar;
                            if ((1 & xguVar.b) != 0) {
                                xgv xgvVar = xguVar.c;
                                if (xgvVar == null) {
                                    xgvVar = xgv.a;
                                }
                                StringBuilder sb = new StringBuilder("VehicleEnergyModelData: ");
                                if ((xgvVar.b & 2) != 0) {
                                    sb.append("battery_level_wh: ");
                                    xgt xgtVar = xgvVar.c;
                                    if (xgtVar == null) {
                                        xgtVar = xgt.a;
                                    }
                                    sb.append(xgtVar.b);
                                    sb.append(" ");
                                }
                                if ((xgvVar.b & 4) != 0) {
                                    sb.append("battery_capacity_wh: ");
                                    xgt xgtVar2 = xgvVar.d;
                                    if (xgtVar2 == null) {
                                        xgtVar2 = xgt.a;
                                    }
                                    sb.append(xgtVar2.b);
                                    sb.append(" ");
                                }
                                sb.append("hvac_status: ");
                                int iAq = a.aq(xgvVar.e);
                                if (iAq != 0) {
                                    if (iAq == 2) {
                                        str = "UNKNOWN_HVAC_STATUS";
                                    } else if (iAq == 3) {
                                        str = "OFF_HVAC_STATUS";
                                    } else if (iAq == 4) {
                                        str = "ON_HVAC_STATUS";
                                    }
                                    sb.append(str);
                                    sb.append(" external_temp_celsius: ");
                                    sb.append(xgvVar.f);
                                    sb.append(" battery_temp_celsius: ");
                                    sb.append(xgvVar.g);
                                    strConcat = sb.toString();
                                }
                                str = "UNRECOGNIZED";
                                sb.append(str);
                                sb.append(" external_temp_celsius: ");
                                sb.append(xgvVar.f);
                                sb.append(" battery_temp_celsius: ");
                                sb.append(xgvVar.g);
                                strConcat = sb.toString();
                            } else {
                                strConcat = "VehicleEnergyModelData: (no vehicle info)";
                            }
                        } else {
                            strConcat = "Message: ".concat(String.valueOf(abowVar.toString().trim()));
                        }
                        printWriter.println(a.bz(strConcat, "    "));
                    }
                }
            }
        } catch (ConcurrentModificationException unused) {
            printWriter.println("concurrent modification happened");
        }
    }

    public final synchronized boolean s(xny xnyVar, long j2) {
        rva rvaVar;
        if (!this.a) {
            b.h().l(1, TimeUnit.MINUTES).ai(1825).u("sendSensorRequest on closed channel");
            return false;
        }
        if (this.t) {
            b.h().l(1, TimeUnit.MINUTES).ai(1824).u("sendSensorRequest on quitting channel");
            return false;
        }
        SparseArray sparseArray = this.f;
        synchronized (sparseArray) {
            rvaVar = (rva) sparseArray.get(xnyVar.A);
        }
        if (rvaVar == null) {
            return false;
        }
        if (rvaVar.b == j2) {
            return true;
        }
        Semaphore semaphore = this.e;
        if (semaphore.availablePermits() != 0) {
            b.h().ai(1822).u("sendSensorRequest wait semaphore available, SensorResponse came later?");
            semaphore.drainPermits();
        }
        ypf ypfVar = b;
        ypfVar.l().ai(1819).u("sendSensorRequest");
        abnp abnpVarN = xnu.a.n();
        abnpVarN.t();
        xnu xnuVar = (xnu) abnpVarN.b;
        xnuVar.c = xnyVar.A;
        xnuVar.b |= 1;
        abnpVarN.t();
        xnu xnuVar2 = (xnu) abnpVarN.b;
        xnuVar2.b |= 2;
        xnuVar2.d = j2;
        xnu xnuVar3 = (xnu) abnpVarN.q();
        int i2 = h;
        if (i2 == 0) {
            throw null;
        }
        k(i2, xnuVar3);
        try {
            if (!semaphore.tryAcquire(2000L, TimeUnit.MILLISECONDS)) {
                ypfVar.g().ai(1820).u("sendSensorRequest timed-out");
                return false;
            }
            ypfVar.l().ai(1821).y("sendSensorRequest returned %b", Boolean.valueOf(this.d));
            rvaVar.b = j2;
            if (j2 == -1) {
                rvaVar.a = null;
            }
            return this.d;
        } catch (InterruptedException unused) {
            return false;
        }
    }

    public final int[] t() {
        int[] iArr;
        SparseArray sparseArray = this.f;
        synchronized (sparseArray) {
            iArr = new int[sparseArray.size()];
            for (int i2 = 0; i2 < sparseArray.size(); i2++) {
                iArr[i2] = sparseArray.keyAt(i2);
            }
        }
        return iArr;
    }

    @Override // defpackage.iyx
    public final void b(int i2) {
    }
}
