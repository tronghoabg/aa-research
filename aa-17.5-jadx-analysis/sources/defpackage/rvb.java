package defpackage;

import android.os.Bundle;
import android.util.Pair;
import android.util.SparseArray;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.io.PrintWriter;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class rvb extends ruq {
    public static final /* synthetic */ int b = 0;
    private static final ypf c = ols.R("CAR.GAL.SENSOR");
    private static final int i = 32770;
    private static final int j = 32769;
    private static final int k = 32771;
    private static final int q = 32772;
    public volatile boolean a;
    private final ruz d;
    private volatile boolean e;
    private final Semaphore f;
    private final SparseArray g;
    private final int h;

    public rvb(xnx xnxVar, ruz ruzVar, rut rutVar, int i2) {
        super(7, ruzVar, rutVar, 3);
        this.e = false;
        this.f = new Semaphore(0);
        SparseArray sparseArray = new SparseArray();
        this.g = sparseArray;
        this.d = ruzVar;
        this.h = i2;
        synchronized (sparseArray) {
            for (xnw xnwVar : xnxVar.d) {
                SparseArray sparseArray2 = this.g;
                xny xnyVarB = xny.b(xnwVar.b);
                if (xnyVarB == null) {
                    xnyVarB = xny.SENSOR_LOCATION;
                }
                sparseArray2.put(xnyVarB.A, new rva());
            }
        }
    }

    private final void q(xny xnyVar, abow abowVar) {
        SparseArray sparseArray = this.g;
        synchronized (sparseArray) {
            rva rvaVar = (rva) sparseArray.get(xnyVar.A);
            if (rvaVar != null) {
                rvaVar.a = abowVar;
            }
        }
        this.d.i(xnyVar, abowVar);
    }

    @Override // defpackage.ruq
    protected final void d(int i2, ByteBuffer byteBuffer) throws abon {
        xns xnsVar;
        int i3 = i;
        if (i3 == 0) {
            throw null;
        }
        if (i2 == i3) {
            xnv xnvVar = (xnv) abnv.w(xnv.a, byteBuffer);
            if (xnvVar != null) {
                ypf ypfVar = c;
                ypfVar.l().ai(8359).u("handleSensorResponse");
                if (this.h == 2) {
                    ypfVar.l().ai(8361).u("Not handling sensor response for readonly sensors endpoint.");
                    return;
                }
                xkr xkrVarB = xkr.b(xnvVar.b);
                if (xkrVarB == null) {
                    xkrVarB = xkr.STATUS_UNSOLICITED_MESSAGE;
                }
                if (xkr.STATUS_SUCCESS.equals(xkrVarB)) {
                    this.e = true;
                } else {
                    ypfVar.h().ai(8360).y("SensorResponse with error %s", xkrVarB);
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
            if (i2 != i5 || (xnsVar = (xns) abnv.w(xns.a, byteBuffer)) == null) {
                return;
            }
            yop yopVarAi = c.h().ai(8358);
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
        xnr xnrVar = (xnr) abnv.w(xnr.a, byteBuffer);
        if (xnrVar != null) {
            Iterator<E> it = xnrVar.b.iterator();
            while (it.hasNext()) {
                q(xny.SENSOR_LOCATION, (abow) it.next());
            }
            Iterator<E> it2 = xnrVar.c.iterator();
            while (it2.hasNext()) {
                q(xny.SENSOR_COMPASS, (abow) it2.next());
            }
            Iterator<E> it3 = xnrVar.d.iterator();
            while (it3.hasNext()) {
                q(xny.SENSOR_SPEED, (abow) it3.next());
            }
            Iterator<E> it4 = xnrVar.e.iterator();
            while (it4.hasNext()) {
                q(xny.SENSOR_RPM, (abow) it4.next());
            }
            Iterator<E> it5 = xnrVar.f.iterator();
            while (it5.hasNext()) {
                q(xny.SENSOR_ODOMETER, (abow) it5.next());
            }
            Iterator<E> it6 = xnrVar.g.iterator();
            while (it6.hasNext()) {
                q(xny.SENSOR_FUEL, (abow) it6.next());
            }
            Iterator<E> it7 = xnrVar.h.iterator();
            while (it7.hasNext()) {
                q(xny.SENSOR_PARKING_BRAKE, (abow) it7.next());
            }
            Iterator<E> it8 = xnrVar.i.iterator();
            while (it8.hasNext()) {
                q(xny.SENSOR_GEAR, (abow) it8.next());
            }
            Iterator<E> it9 = xnrVar.k.iterator();
            while (it9.hasNext()) {
                q(xny.SENSOR_NIGHT_MODE, (abow) it9.next());
            }
            Iterator<E> it10 = xnrVar.l.iterator();
            while (it10.hasNext()) {
                q(xny.SENSOR_ENVIRONMENT_DATA, (abow) it10.next());
            }
            Iterator<E> it11 = xnrVar.m.iterator();
            while (it11.hasNext()) {
                q(xny.SENSOR_HVAC_DATA, (abow) it11.next());
            }
            Iterator<E> it12 = xnrVar.n.iterator();
            while (it12.hasNext()) {
                q(xny.SENSOR_DRIVING_STATUS_DATA, (abow) it12.next());
            }
            Iterator<E> it13 = xnrVar.t.iterator();
            while (it13.hasNext()) {
                q(xny.SENSOR_ACCELEROMETER_DATA, (abow) it13.next());
            }
            Iterator<E> it14 = xnrVar.u.iterator();
            while (it14.hasNext()) {
                q(xny.SENSOR_GYROSCOPE_DATA, (abow) it14.next());
            }
            Iterator<E> it15 = xnrVar.v.iterator();
            while (it15.hasNext()) {
                q(xny.SENSOR_GPS_SATELLITE_DATA, (abow) it15.next());
            }
            Iterator<E> it16 = xnrVar.o.iterator();
            while (it16.hasNext()) {
                q(xny.SENSOR_DEAD_RECKONING_DATA, (abow) it16.next());
            }
            Iterator<E> it17 = xnrVar.q.iterator();
            while (it17.hasNext()) {
                q(xny.SENSOR_DOOR_DATA, (abow) it17.next());
            }
            Iterator<E> it18 = xnrVar.r.iterator();
            while (it18.hasNext()) {
                q(xny.SENSOR_LIGHT_DATA, (abow) it18.next());
            }
            Iterator<E> it19 = xnrVar.p.iterator();
            while (it19.hasNext()) {
                q(xny.SENSOR_PASSENGER_DATA, (abow) it19.next());
            }
            Iterator<E> it20 = xnrVar.s.iterator();
            while (it20.hasNext()) {
                q(xny.SENSOR_TIRE_PRESSURE_DATA, (abow) it20.next());
            }
            Iterator<E> it21 = xnrVar.j.iterator();
            while (it21.hasNext()) {
                q(xny.SENSOR_OBDII_DIAGNOSTIC_CODE, (abow) it21.next());
            }
            Iterator<E> it22 = xnrVar.w.iterator();
            while (it22.hasNext()) {
                q(xny.SENSOR_TOLL_CARD, (abow) it22.next());
            }
        }
    }

    public final abow i(int i2) {
        abow abowVar;
        SparseArray sparseArray = this.g;
        synchronized (sparseArray) {
            rva rvaVar = (rva) sparseArray.get(i2);
            abowVar = rvaVar != null ? rvaVar.a : null;
        }
        return abowVar;
    }

    public final void j(PrintWriter printWriter) {
        String strConcat;
        printWriter.println("last events for sensors");
        try {
            SparseArray sparseArray = this.g;
            int size = sparseArray.size();
            for (int i2 = 0; i2 < size; i2++) {
                int iKeyAt = sparseArray.keyAt(i2);
                rva rvaVar = (rva) sparseArray.get(iKeyAt);
                if (rvaVar != null && rvaVar.a != null) {
                    printWriter.println("  sensor: " + iKeyAt + " rate: " + rvaVar.b);
                    if (iKeyAt != 1 && iKeyAt != 128 && iKeyAt != 21) {
                        abow abowVar = rvaVar.a;
                        abowVar.getClass();
                        if (abowVar instanceof xlt) {
                            strConcat = "Night mode: " + ((xlt) abowVar).c;
                        } else if (abowVar instanceof xjf) {
                            strConcat = "Driving status: " + ((xjf) abowVar).b;
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

    @ResultIgnorabilityUnspecified
    public final synchronized boolean k(xny xnyVar, long j2) {
        rva rvaVar;
        if (!this.a) {
            c.h().l(1, TimeUnit.MINUTES).ai(8370).u("sendSensorRequest on closed channel");
            return false;
        }
        if (this.l) {
            c.h().l(1, TimeUnit.MINUTES).ai(8369).u("sendSensorRequest on quitting channel");
            return false;
        }
        SparseArray sparseArray = this.g;
        synchronized (sparseArray) {
            rvaVar = (rva) sparseArray.get(xnyVar.A);
        }
        if (rvaVar == null) {
            return false;
        }
        if (rvaVar.b == j2) {
            return true;
        }
        if (this.h == 2) {
            c.l().ai(8368).u("Not sending sensor request for readonly sensors endpoint.");
            rvaVar.b = j2;
            if (j2 == -1) {
                rvaVar.a = null;
            }
            return true;
        }
        Semaphore semaphore = this.f;
        if (semaphore.availablePermits() != 0) {
            c.h().ai(8367).u("sendSensorRequest wait semaphore available, SensorResponse came later?");
            semaphore.drainPermits();
        }
        ypf ypfVar = c;
        ypfVar.l().ai(8362).u("sendSensorRequest");
        abnp abnpVarN = xnu.a.n();
        abnpVarN.t();
        xnu xnuVar = (xnu) abnpVarN.b;
        xnuVar.c = xnyVar.A;
        xnuVar.b |= 1;
        abnpVarN.t();
        xnu xnuVar2 = (xnu) abnpVarN.b;
        xnuVar2.b = 2 | xnuVar2.b;
        xnuVar2.d = j2;
        xnu xnuVar3 = (xnu) abnpVarN.q();
        int i2 = j;
        if (i2 == 0) {
            throw null;
        }
        super.o(i2, xnuVar3, true);
        try {
            if (!semaphore.tryAcquire(2000L, TimeUnit.MILLISECONDS)) {
                ypfVar.g().ai(8363).u("sendSensorRequest timed-out");
                return false;
            }
            ypfVar.l().ai(8366).y("sendSensorRequest returned %b", Boolean.valueOf(this.e));
            rvaVar.b = j2;
            if (j2 == -1) {
                rvaVar.a = null;
            }
            return this.e;
        } catch (InterruptedException unused) {
            return false;
        }
    }

    public final int[] l() {
        int[] iArr;
        SparseArray sparseArray = this.g;
        synchronized (sparseArray) {
            iArr = new int[sparseArray.size()];
            for (int i2 = 0; i2 < sparseArray.size(); i2++) {
                iArr[i2] = sparseArray.keyAt(i2);
            }
        }
        return iArr;
    }

    @Override // defpackage.ruq, defpackage.rsq
    public final void u(int i2) {
        this.d.j();
        this.a = false;
        SparseArray sparseArray = this.g;
        synchronized (sparseArray) {
            sparseArray.clear();
        }
    }

    @Override // defpackage.ruq, defpackage.rsq
    public final void v() {
        this.a = true;
        super.v();
    }

    @Override // defpackage.ruq
    public final void w(Bundle bundle) {
        if (!this.a) {
            throw new IllegalStateException("Can't suspend SensorsEndPoint");
        }
        if (this.f.availablePermits() != 0) {
            c.h().ai(8357).u("sendSensorRequest wait semaphore available, SensorResponse came later?");
        }
        SparseArray sparseArray = this.g;
        synchronized (sparseArray) {
            ArrayList arrayList = new ArrayList(sparseArray.size());
            for (int i2 = 0; i2 < sparseArray.size(); i2++) {
                rva rvaVar = (rva) sparseArray.valueAt(i2);
                abow abowVar = rvaVar.a;
                arrayList.add(Pair.create(Integer.valueOf(sparseArray.keyAt(i2)), Pair.create(abowVar != null ? abowVar.h() : null, Long.valueOf(rvaVar.b))));
            }
            ypf ypfVar = ruw.a;
            bundle.putBinder("sensor_records", new ruc(arrayList));
        }
    }

    @Override // defpackage.rsp
    public final void e(int i2) {
    }
}
