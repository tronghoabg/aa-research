package defpackage;

import android.content.Context;
import android.os.Binder;
import android.os.IBinder;
import android.os.Process;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.SparseArray;
import android.util.SparseIntArray;
import com.google.android.gms.car.CarSensorEvent;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public final class qsj extends qyg implements ruz, ruu {
    public static final ypf a = ols.R("CAR.SENSOR");
    private static final SparseIntArray f;
    private static final CarSensorEvent g;
    public qtf d;
    private int i;
    private List j;
    private List k;
    private final rwb l;
    private final Context m;
    private xnx n;
    private final wyd p;
    public final ReentrantLock b = new ReentrantLock();
    public final LinkedList c = new LinkedList();
    private final SparseArray h = new SparseArray();
    public final qsi e = new qsi();
    private final int o = 2;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(xny.values().length);
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
        CarSensorEvent carSensorEvent = new CarSensorEvent(11, SystemClock.elapsedRealtimeNanos(), 0, 1);
        g = carSensorEvent;
        carSensorEvent.e[0] = 31;
    }

    public qsj(wyd wydVar, rwb rwbVar, Context context) {
        this.p = wydVar;
        this.l = rwbVar;
        this.m = context;
    }

    public static int c(int i) {
        SparseIntArray sparseIntArray = f;
        int iIndexOfValue = sparseIntArray.indexOfValue(i);
        if (iIndexOfValue >= 0) {
            return sparseIntArray.keyAt(iIndexOfValue);
        }
        return 0;
    }

    private static CarSensorEvent n(int i, abow abowVar) {
        switch (i) {
            case 1:
                return roc.u((xit) abowVar);
            case 2:
                return roc.I((xog) abowVar);
            case 3:
                CarSensorEvent carSensorEvent = new CarSensorEvent(3, SystemClock.elapsedRealtimeNanos(), 1, 0);
                carSensorEvent.d[0] = ((xnq) abowVar).b * 0.001f;
                return carSensorEvent;
            case 4:
                return roc.G((xlu) abowVar);
            case 5:
                return roc.z((xjj) abowVar);
            case 6:
                CarSensorEvent carSensorEvent2 = new CarSensorEvent(6, SystemClock.elapsedRealtimeNanos(), 0, 1);
                carSensorEvent2.e[0] = ((xly) abowVar).b;
                return carSensorEvent2;
            case 7:
                CarSensorEvent carSensorEvent3 = new CarSensorEvent(7, SystemClock.elapsedRealtimeNanos(), 0, 1);
                byte[] bArr = carSensorEvent3.e;
                int iD = wox.D(((xjl) abowVar).b);
                if (iD == 0) {
                    iD = 1;
                }
                bArr[0] = (byte) (iD - 1);
                return carSensorEvent3;
            case 8:
                return roc.w((xjb) abowVar);
            case 9:
                return roc.F((xlt) abowVar);
            case 10:
                return roc.E((xkh) abowVar);
            case 11:
                CarSensorEvent carSensorEvent4 = new CarSensorEvent(11, SystemClock.elapsedRealtimeNanos(), 0, 1);
                carSensorEvent4.e[0] = (byte) ((xjf) abowVar).b;
                return carSensorEvent4;
            case 12:
                return roc.y((xjg) abowVar);
            case 13:
                return roc.C((xjr) abowVar);
            case 14:
                return roc.t((xgy) abowVar);
            case 15:
                return roc.v((xja) abowVar);
            case 16:
                return roc.x((xjd) abowVar);
            case 17:
                return roc.A((xjo) abowVar);
            case 18:
                return roc.B((xjp) abowVar);
            case 19:
                return roc.D((xkg) abowVar);
            case 20:
                return roc.H((xlz) abowVar);
            case 21:
                return roc.J((xoj) abowVar);
            case 22:
                CarSensorEvent carSensorEvent5 = new CarSensorEvent(22, SystemClock.elapsedRealtimeNanos(), 0, 1);
                carSensorEvent5.e[0] = ((xok) abowVar).b;
                return carSensorEvent5;
            case 23:
                return new CarSensorEvent(23, SystemClock.elapsedRealtimeNanos(), new float[0], ((xgu) abowVar).h());
            case 24:
                return new CarSensorEvent(24, SystemClock.elapsedRealtimeNanos(), new float[0], ((xon) abowVar).h());
            default:
                throw new IllegalArgumentException(a.bp(i, "Invalid type "));
        }
    }

    private final qsg q(qyk qykVar) {
        LinkedList linkedList = this.c;
        IBinder iBinderAsBinder = qykVar.asBinder();
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            qsg qsgVar = (qsg) it.next();
            if (qsgVar.a.asBinder() == iBinderAsBinder) {
                return qsgVar;
            }
        }
        return null;
    }

    private static xny r(int i) {
        int i2 = f.get(i, -1);
        if (i2 == -1) {
            throw new RuntimeException("Unknown sensor type.");
        }
        xny xnyVarB = xny.b(i2);
        xnyVarB.getClass();
        return xnyVarB;
    }

    private final void u() {
        this.l.c();
        if (this.e.a()) {
            return;
        }
        a.h().ai(7806).u("Sensors endpoint is not opened, throwing CarNotConnectedException");
        throw new IllegalStateException("CarNotConnected");
    }

    private final boolean v(int i) {
        String strW;
        if (Binder.getCallingUid() == Process.myUid() || (strW = w(i)) == null) {
            return true;
        }
        Context context = this.m;
        ypf ypfVar = qsu.a;
        yop yopVarAi = ypfVar.l().ai(7894);
        boolean z = qsu.b;
        yopVarAi.y("Compare pid: %b", Boolean.valueOf(z));
        ypfVar.l().ai(7895).B("Calling pid: %d\nProcess pid: %d", Binder.getCallingPid(), Process.myPid());
        if (z && Binder.getCallingPid() == Process.myPid()) {
            ypfVar.h().ai(7896).u("Caller is self, permission denied");
        } else {
            int iA = qsu.a(context, strW);
            if (iA == -2) {
                a.h().ai(7807).y("PERMISSION_DENIED_IGNORE in client for permission: %s", w(i));
                return false;
            }
            if (iA != -1) {
                return true;
            }
        }
        throw new SecurityException("client does not have permission:" + w(i) + " pid:" + Binder.getCallingPid() + " uid:" + Binder.getCallingUid());
    }

    private static final String w(int i) {
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

    @ResultIgnorabilityUnspecified
    private final boolean x(int i) {
        qsi qsiVar = this.e;
        if (!qsiVar.a()) {
            a.h().ai(7816).u("Sensor channel not available.");
            return false;
        }
        if (qsiVar.b(r(i), 0L)) {
            return true;
        }
        a.h().ai(7815).u("requestSensorStart failed");
        return false;
    }

    @Override // defpackage.ruu
    @ResultIgnorabilityUnspecified
    public final rso a(xnz xnzVar) {
        if ((xnzVar.b & 2) == 0) {
            return null;
        }
        xnx xnxVar = xnzVar.d;
        if (xnxVar == null) {
            xnxVar = xnx.c;
        }
        this.n = xnxVar;
        xnx xnxVar2 = xnzVar.d;
        if (xnxVar2 == null) {
            xnxVar2 = xnx.c;
        }
        this.i = xnxVar2.e;
        this.j = new abof(this.n.f, xnx.a);
        this.k = new abof(this.n.g, xnx.b);
        return this;
    }

    @Override // defpackage.rso
    public final ruq b(rut rutVar) {
        return new rvb(this.n, this, rutVar, this.o);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.car.CarSensorEvent d(int r4) {
        /*
            r3 = this;
            xny r0 = r(r4)
            qsi r3 = r3.e
            r1 = 0
            rvb r2 = r3.a     // Catch: android.os.RemoteException -> L14
            if (r2 == 0) goto L12
            int r3 = r0.A     // Catch: android.os.RemoteException -> L14
            abow r3 = r2.i(r3)     // Catch: android.os.RemoteException -> L14
            goto L15
        L12:
            rwp r3 = r3.b     // Catch: android.os.RemoteException -> L14
        L14:
            r3 = r1
        L15:
            if (r3 == 0) goto L1c
            com.google.android.gms.car.CarSensorEvent r3 = n(r4, r3)
            return r3
        L1c:
            r3 = 11
            if (r4 != r3) goto L23
            com.google.android.gms.car.CarSensorEvent r3 = defpackage.qsj.g
            return r3
        L23:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qsj.d(int):com.google.android.gms.car.CarSensorEvent");
    }

    @Override // defpackage.qyh
    public final int g() {
        this.p.j();
        return this.i;
    }

    @Override // defpackage.qyh
    public final void gd(int i, qyk qykVar) {
        qsi qsiVar = this.e;
        if (!qsiVar.a()) {
            a.l().ai(7825).u("unregister while sensor not available");
            return;
        }
        ReentrantLock reentrantLock = this.b;
        reentrantLock.lock();
        try {
            if (Arrays.binarySearch(qsiVar.c(), i) < 0) {
                a.l().ai(7824).u("unregister for unsupported sensor");
            } else {
                qsg qsgVarQ = q(qykVar);
                if (qsgVarQ == null) {
                    a.l().ai(7823).u("unregister for not existing client");
                } else {
                    qsgVarQ.c(i);
                    if (qsgVarQ.b.size() == 0) {
                        qsgVarQ.b();
                        this.c.remove(qsgVarQ);
                    }
                    SparseArray sparseArray = this.h;
                    ajju ajjuVar = (ajju) sparseArray.get(i);
                    if (ajjuVar == null) {
                        a.l().ai(7822).u("unregister for non-active sensor");
                    } else {
                        qsh qshVarH = ajjuVar.h(qsgVarQ);
                        if (qshVarH != null) {
                            Object obj = ajjuVar.b;
                            ((LinkedList) obj).remove(qshVarH);
                            boolean z = true;
                            boolean z2 = false;
                            if (ajjuVar.g() == 0) {
                                sparseArray.remove(i);
                            } else {
                                Iterator it = ((LinkedList) obj).iterator();
                                int i2 = 3;
                                while (it.hasNext()) {
                                    int i3 = ((qsh) it.next()).b;
                                    if (i3 < i2) {
                                        i2 = i3;
                                    }
                                }
                                if (ajjuVar.a != i2) {
                                    ajjuVar.a = i2;
                                    z2 = true;
                                    z = false;
                                } else {
                                    z = false;
                                }
                            }
                            ypf ypfVar = a;
                            ypfVar.l().ai(7820).u("unregister succeeded");
                            if (!z) {
                                if (z2) {
                                    x(i);
                                    return;
                                }
                                return;
                            }
                            ypfVar.l().ai(7817).w("stopSensor %d", i);
                            qsi qsiVar2 = this.e;
                            if (!qsiVar2.a()) {
                                ypfVar.h().ai(7819).u("Sensor channel not available.");
                                return;
                            } else {
                                ypfVar.l().ai(7818).w("stopSensor requestStop %d", i);
                                qsiVar2.b(r(i), -1L);
                                return;
                            }
                        }
                        a.l().ai(7821).u("unregister for not registered sensor");
                    }
                }
            }
            reentrantLock.unlock();
        } finally {
            this.b.unlock();
        }
    }

    @Override // defpackage.rso
    public final void gl(PrintWriter printWriter) {
        qsi qsiVar = this.e;
        printWriter.println("supported sensors:".concat(String.valueOf(Arrays.toString(qsiVar.c))));
        if (qsiVar.a != null) {
            qsiVar.a.j(printWriter);
        } else {
            rwp rwpVar = qsiVar.b;
            printWriter.println("No sensor endpoint");
        }
        printWriter.println("clients");
        try {
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                qsg qsgVar = (qsg) it.next();
                if (qsgVar != null) {
                    try {
                        printWriter.println("binder:" + String.valueOf(qsgVar.a) + " active sensors:" + Arrays.toString(qsgVar.d()));
                    } catch (ConcurrentModificationException unused) {
                        printWriter.println("concurrent modification happened");
                    }
                } else {
                    printWriter.println("null client");
                }
            }
        } catch (ConcurrentModificationException unused2) {
            printWriter.println("concurrent modification happened");
        }
        printWriter.println("sensor listeners");
        try {
            SparseArray sparseArray = this.h;
            int size = sparseArray.size();
            for (int i = 0; i < size; i++) {
                int iKeyAt = sparseArray.keyAt(i);
                ajju ajjuVar = (ajju) sparseArray.get(iKeyAt);
                if (ajjuVar != null) {
                    printWriter.println(a.br(ajjuVar.a, ajjuVar.g(), iKeyAt, " Sensor:", " num client:", " rate:"));
                }
            }
        } catch (ConcurrentModificationException unused3) {
            printWriter.println("concurrent modification happened");
        }
        printWriter.println("fuel types: ".concat(String.valueOf(String.valueOf(this.j))));
    }

    @Override // defpackage.qyh
    public final CarSensorEvent h(int i) {
        u();
        if (v(i)) {
            return d(i);
        }
        return null;
    }

    @Override // defpackage.ruz
    public final void i(xny xnyVar, abow abowVar) {
        int iC = c(xnyVar.A);
        this.b.lock();
        try {
            ajju ajjuVar = (ajju) this.h.get(iC);
            if (ajjuVar != null) {
                CarSensorEvent carSensorEventN = n(iC, abowVar);
                Iterator it = ((LinkedList) ajjuVar.b).iterator();
                while (it.hasNext()) {
                    ((qsh) it.next()).a.a(carSensorEventN);
                }
            } else {
                a.h().l(1, TimeUnit.MINUTES).ai(7809).w("sensor event while no listener, sensor:%d", iC);
            }
        } finally {
            this.b.unlock();
        }
    }

    @Override // defpackage.ruz
    public final void j() {
        if (this.e.a()) {
            qtf qtfVar = this.d;
            if (qtfVar != null && qtfVar.c != null) {
                qtfVar.d();
                int[] iArr = qtf.b;
                int length = iArr.length;
                for (int i = 0; i < 4; i++) {
                    qtfVar.c.gd(iArr[i], qtfVar);
                }
                qtfVar.c.gd(10, qtfVar);
            }
            try {
                this.b.tryLock(1000L, TimeUnit.MILLISECONDS);
                SparseArray sparseArray = this.h;
                int size = sparseArray.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    }
                    Object obj = ((ajju) sparseArray.valueAt(size)).b;
                    Iterator it = ((LinkedList) obj).iterator();
                    while (it.hasNext()) {
                        ((qsh) it.next()).a.b();
                    }
                    ((LinkedList) obj).clear();
                }
                sparseArray.clear();
                this.c.clear();
            } catch (InterruptedException unused) {
            } catch (Throwable th) {
                ReentrantLock reentrantLock = this.b;
                if (reentrantLock.isHeldByCurrentThread()) {
                    reentrantLock.unlock();
                }
                throw th;
            }
            ReentrantLock reentrantLock2 = this.b;
            if (reentrantLock2.isHeldByCurrentThread()) {
                reentrantLock2.unlock();
            }
        }
    }

    @Override // defpackage.rso
    public final void k() {
        throw null;
    }

    @Override // defpackage.rso
    public final void l(ruq ruqVar) {
        qsi qsiVar = this.e;
        rvb rvbVar = (rvb) ruqVar;
        qsiVar.a = rvbVar;
        int[] iArrL = qsiVar.a.l();
        qsiVar.d = true;
        int length = iArrL.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            if (iArrL[i] == 13) {
                qsiVar.d = false;
                break;
            }
            i++;
        }
        if (qsiVar.d) {
            a.f().ai(7805).u("No driving status, always restricted");
        }
        qsiVar.c = new int[iArrL.length + (qsiVar.d ? 1 : 0)];
        for (int i2 = 0; i2 < iArrL.length; i2++) {
            qsiVar.c[i2] = c(iArrL[i2]);
        }
        if (qsiVar.d) {
            qsiVar.c[r1.length - 1] = 11;
        }
        Arrays.sort(qsiVar.c);
        synchronized (qsiVar) {
            qsiVar.a = rvbVar;
            qsiVar.b = null;
            qsiVar.notifyAll();
        }
        this.d.f(this);
    }

    public final boolean m() {
        return this.e.a();
    }

    @Override // defpackage.qyh
    @ResultIgnorabilityUnspecified
    public final boolean o(int i, int i2, qyk qykVar) {
        ReentrantLock reentrantLock;
        Integer numValueOf;
        qsh qshVarH;
        boolean z;
        u();
        if (!v(i)) {
            return false;
        }
        ReentrantLock reentrantLock2 = this.b;
        reentrantLock2.lock();
        try {
            if (Arrays.binarySearch(this.e.c(), i) < 0) {
                a.f().ai(7813).w("Requested sensor %d not supported", i);
                reentrantLock2.unlock();
                return false;
            }
            a.l().ai(7811).D("registerOrUpdateSensorListener %d %s", i, qykVar);
            qsg qsgVarQ = q(qykVar);
            ajju ajjuVar = (ajju) this.h.get(i);
            if (qsgVarQ == null) {
                qsgVarQ = new qsg(this, qykVar);
                qykVar.asBinder().linkToDeath(qsgVarQ, 0);
                this.c.add(qsgVarQ);
            }
            CarSensorEvent carSensorEventD = d(i);
            if (carSensorEventD != null) {
                qsgVarQ.a(carSensorEventD);
            }
            if (ajjuVar == null) {
                ajjuVar = new ajju(i2);
                this.h.put(i, ajjuVar);
                qshVarH = null;
                z = true;
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(ajjuVar.a);
                qshVarH = ajjuVar.h(qsgVarQ);
                z = false;
            }
            if (qshVarH == null) {
                ((LinkedList) ajjuVar.b).add(new qsh(qsgVarQ, i2));
            } else {
                qshVarH.b = i2;
            }
            if (ajjuVar.a > i2) {
                ajjuVar.a = i2;
                z = true;
            }
            qsgVarQ.b.put(i, true);
            if (!z || x(i)) {
                return true;
            }
            reentrantLock.lock();
            try {
                qsgVarQ.c(i);
                if (numValueOf != null) {
                    ajjuVar.a = numValueOf.intValue();
                } else {
                    this.h.remove(i);
                }
                return false;
            } finally {
            }
        } catch (RemoteException unused) {
            a.f().ai(7812).u("Adding listener failed.");
            return false;
        } finally {
        }
    }

    @Override // defpackage.qyh
    public final int[] p() {
        this.p.j();
        if (this.k.isEmpty()) {
            return null;
        }
        return woy.dO(this.k);
    }

    @Override // defpackage.qyh
    public final int[] s() {
        this.p.j();
        if (this.j.isEmpty()) {
            return null;
        }
        return woy.dO(this.j);
    }

    @Override // defpackage.qyh
    public final int[] t() {
        u();
        return this.e.c();
    }
}
