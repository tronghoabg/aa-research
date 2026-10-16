package defpackage;

import android.content.Context;
import android.os.Binder;
import android.os.IBinder;
import android.os.Process;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.SparseArray;
import com.google.android.gms.car.CarInfo;
import com.google.android.gms.car.CarSensorEvent;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import j$.util.Map;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public final class ikt extends qyg implements jbv, jbo {
    public static final yph a = yph.c("CAR.SENSOR");
    public static final Map b = new ConcurrentHashMap(21);
    private static final CarSensorEvent n;
    public final ygr c;
    public final boolean d;
    public final ReentrantLock e;
    public final LinkedList f;
    public List g;
    public List h;
    public ilh i;
    public final jfg j;
    public final iks k;
    public final zeq l;
    public final lds m;
    private final SparseArray o;
    private int p;
    private final jew q;
    private final jer r;
    private final Context s;
    private final ikz t;
    private final CarInfo u;
    private xnx v;

    static {
        CarSensorEvent carSensorEvent = new CarSensorEvent(11, SystemClock.elapsedRealtimeNanos(), 0, 1);
        n = carSensorEvent;
        carSensorEvent.e[0] = 31;
    }

    public ikt(jew jewVar, jer jerVar, jfg jfgVar, Context context, ikz ikzVar, CarInfo carInfo, jla jlaVar) {
        zep zepVar = zep.a;
        this.e = new ReentrantLock();
        this.f = new LinkedList();
        this.o = new SparseArray();
        this.k = new iks(this);
        this.q = jewVar;
        this.r = jerVar;
        this.j = jfgVar;
        this.s = context;
        this.t = ikzVar;
        this.u = carInfo;
        this.l = zepVar;
        this.d = !jlaVar.c(context);
        this.c = ygr.n(acok.a.gu().c().b);
        this.m = new lds((short[]) null);
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
        return Integer.compare(i, i2);
    }

    private final ikq u(qyk qykVar) {
        LinkedList linkedList = this.f;
        IBinder iBinderAsBinder = qykVar.asBinder();
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            ikq ikqVar = (ikq) it.next();
            if (ikqVar.a.asBinder() == iBinderAsBinder) {
                return ikqVar;
            }
        }
        return null;
    }

    private final void v() {
        this.r.c();
        if (this.k.c()) {
            return;
        }
        ((ype) ((ype) a.h()).ai((char) 200)).u("Sensors endpoint is not opened, throwing CarNotConnectedException");
        throw new IllegalStateException("CarNotConnected");
    }

    private final boolean w(int i) {
        String strA;
        if (!jeo.b(i)) {
            this.q.al();
        }
        if (Binder.getCallingUid() == Process.myUid() || (strA = jeo.a(i)) == null) {
            return true;
        }
        int iA = ilb.a(this.s, strA);
        if (iA == -2) {
            ((ype) ((ype) a.h()).ai((char) 201)).y("PERMISSION_DENIED_IGNORE in client for permission: %s", jeo.a(i));
            return false;
        }
        if (iA != -1) {
            return true;
        }
        throw new SecurityException("client does not have permission:" + jeo.a(i) + " pid:" + Binder.getCallingPid() + " uid:" + Binder.getCallingUid());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ResultIgnorabilityUnspecified
    private final boolean x(int i, int i2) {
        iks iksVar = this.k;
        if (!iksVar.c()) {
            ((ype) ((ype) a.h()).ai((char) 218)).u("Sensor channel not available.");
            return false;
        }
        if (true != jeo.a.contains(Integer.valueOf(i))) {
            i2 = 0;
        }
        yfq yfqVarB = jep.b(i);
        int size = yfqVarB.size();
        boolean zD = false;
        for (int i3 = 0; i3 < size; i3++) {
            zD |= iksVar.d((xny) yfqVarB.get(i3), i2);
        }
        if (zD) {
            return true;
        }
        ((ype) ((ype) a.h()).ai((char) 217)).u("requestSensorStart failed");
        return false;
    }

    @Override // defpackage.jbo
    @ResultIgnorabilityUnspecified
    public final iyw a(xnz xnzVar) {
        int i = 2;
        if ((xnzVar.b & 2) == 0) {
            if (this.g == null) {
                int i2 = yfq.d;
                this.g = yls.a;
            }
            if (this.h != null) {
                return null;
            }
            int i3 = yfq.d;
            this.h = yls.a;
            return null;
        }
        xnx xnxVar = xnzVar.d;
        if (xnxVar == null) {
            xnxVar = xnx.c;
        }
        this.v = xnxVar;
        xnx xnxVar2 = xnzVar.d;
        if (xnxVar2 == null) {
            xnxVar2 = xnx.c;
        }
        this.p = xnxVar2.e;
        this.g = new abof(this.v.f, xnx.a);
        this.h = new abof(this.v.g, xnx.b);
        yph yphVar = a;
        ((ype) yphVar.l().ai(211)).y("Car reported fuel types are: %s", this.g);
        ((ype) yphVar.l().ai(212)).y("Car reported connector types are: %s", this.h);
        CarInfo carInfo = this.u;
        if (carInfo == null) {
            this.j.e(yzz.CAR_FUEL_TYPE, yzy.Kt);
            ((ype) yphVar.l().ai((char) 207)).u("Car info is null, can't set fuel type overrides");
            return this;
        }
        boolean z = this.g.isEmpty() || this.g.contains(xjk.FUEL_TYPE_UNKNOWN);
        ((ype) yphVar.l().ai((char) 203)).y("shouldShowEvSettings=%s", Boolean.valueOf(z));
        if (this.g.size() == 1 && this.g.contains(xjk.FUEL_TYPE_ELECTRIC)) {
            this.j.e(yzz.CAR_FUEL_TYPE, yzy.Kq);
        } else if (this.g.isEmpty() || this.g.contains(xjk.FUEL_TYPE_UNKNOWN)) {
            this.j.e(yzz.CAR_FUEL_TYPE, yzy.Kr);
        }
        String str = carInfo.a;
        String str2 = carInfo.b;
        String str3 = carInfo.c;
        ikz ikzVar = this.t;
        ikzVar.f(str, str2, str3, "car_ev_settings_enabled", z);
        if (jfr.d(str, str2, str3, null, null, (ygr) tgx.d(new ilq(15), acqj.a.gu().a()).collect(ycm.b)) && !ikzVar.j(String.format("%s_%s_%s_%s", str, str2, str3, "car_ev_features_enabled"))) {
            ((ype) yphVar.l().ai(206)).R("Car in allowlist, overriding to EV. Make: %s, model: %s, Year: %s", str, str2, str3);
            ikzVar.f(str, str2, str3, "car_ev_features_enabled", true);
            this.j.e(yzz.CAR_FUEL_TYPE, yzy.Ko);
        }
        if (ikzVar.p(str, str2, str3, "car_ev_features_enabled") && z) {
            ((ype) yphVar.l().ai((char) 204)).u("setting fuel type to FUEL_TYPE_ELECTRIC");
            int i4 = yfq.d;
            Object[] objArr = {xjk.FUEL_TYPE_ELECTRIC};
            yrm.B(objArr, 1);
            this.g = new yls(objArr, 1);
            this.j.e(yzz.CAR_FUEL_TYPE, yzy.Kp);
            ArrayList arrayList = new ArrayList();
            xjh[] xjhVarArrValues = xjh.values();
            int length = xjhVarArrValues.length;
            int i5 = 0;
            while (i5 < length) {
                xjh xjhVar = xjhVarArrValues[i5];
                int iOrdinal = xjhVar.ordinal();
                if (ikzVar.p(str, str2, str3, iOrdinal != 1 ? iOrdinal != i ? iOrdinal != 4 ? iOrdinal != 5 ? iOrdinal != 9 ? "" : "car_ev_connector_type_gbt" : "car_ev_connector_type_combo_2" : "car_ev_connector_type_combo_1" : "car_ev_connector_type_2" : "car_ev_connector_type_1")) {
                    arrayList.add(0, xjhVar);
                    ((ype) yphVar.l().ai((char) 205)).y("adding connector type %s to list", xjhVar);
                }
                i5++;
                i = 2;
            }
            if (!arrayList.isEmpty()) {
                this.h = arrayList;
            }
        }
        if (this.g.size() == 1 && this.g.contains(xjk.FUEL_TYPE_ELECTRIC)) {
            this.j.e(yzz.CAR_FUEL_TYPE, yzy.Ks);
        }
        return this;
    }

    @Override // defpackage.iyw
    public final jbj b(jbn jbnVar) {
        return new jbw(this.v, this, jbnVar);
    }

    @Override // defpackage.iyw
    public final jcv c() {
        return roc.aH();
    }

    @Override // defpackage.iyw
    public final jcv d() {
        return roc.aH();
    }

    @Override // defpackage.qyh
    public final int g() {
        dlz.H(this.q);
        return this.p;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.qyh
    public final void gd(int i, qyk qykVar) {
        int iIntValue;
        boolean z;
        iks iksVar = this.k;
        if (!iksVar.c()) {
            ((ype) a.l().ai((char) 227)).u("unregister while sensor not available");
            return;
        }
        ReentrantLock reentrantLock = this.e;
        reentrantLock.lock();
        try {
            if (Arrays.binarySearch(iksVar.e(), i) < 0) {
                ((ype) a.l().ai(226)).u("unregister for unsupported sensor");
            } else {
                ikq ikqVarU = u(qykVar);
                if (ikqVarU == null) {
                    ((ype) a.l().ai(225)).u("unregister for not existing client");
                } else {
                    ikqVarU.c(i);
                    if (ikqVarU.b.size() == 0) {
                        ikqVarU.b();
                        this.f.remove(ikqVarU);
                    }
                    SparseArray sparseArray = this.o;
                    imr imrVar = (imr) sparseArray.get(i);
                    if (imrVar != null) {
                        Object obj = imrVar.b;
                        ((LinkedList) obj).remove(ikqVarU);
                        boolean z2 = true;
                        if (imrVar.a() == 0) {
                            sparseArray.remove(i);
                            iIntValue = 0;
                            z = false;
                        } else {
                            Iterator it = ((LinkedList) obj).iterator();
                            Integer num = null;
                            while (it.hasNext()) {
                                Integer num2 = (Integer) ((ikq) it.next()).b.get(Integer.valueOf(i));
                                if (num2 != null) {
                                    if (num != null) {
                                        if (acok.a.gu().e()) {
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
                            if (imrVar.a != num.intValue()) {
                                iIntValue = num.intValue();
                                imrVar.a = iIntValue;
                                z = true;
                                z2 = false;
                            } else {
                                iIntValue = 0;
                                z = false;
                                z2 = false;
                            }
                        }
                        yph yphVar = a;
                        ((ype) yphVar.l().ai(223)).u("unregister succeeded");
                        if (!z2) {
                            if (z) {
                                x(i, iIntValue);
                                return;
                            }
                            return;
                        }
                        ((ype) yphVar.l().ai(219)).w("stopSensor %d", i);
                        iks iksVar2 = this.k;
                        if (!iksVar2.c()) {
                            ((ype) ((ype) yphVar.h()).ai((char) 222)).u("Sensor channel not available.");
                            return;
                        }
                        ((ype) yphVar.l().ai(220)).w("stopSensor requestStop %d", i);
                        yfq yfqVarB = jep.b(i);
                        int size = yfqVarB.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            if (!iksVar2.d((xny) yfqVarB.get(i2), -1L)) {
                                ((ype) ((ype) yphVar.h()).ai((char) 221)).u("Couldn't send sensor rate request when stopping sensor");
                            }
                        }
                        return;
                    }
                    ((ype) a.l().ai(224)).u("unregister for non-active sensor");
                }
            }
            reentrantLock.unlock();
        } finally {
            this.e.unlock();
        }
    }

    @Override // defpackage.qyh
    public final CarSensorEvent h(int i) {
        v();
        if (w(i)) {
            return i(i);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final CarSensorEvent i(int i) {
        yfq yfqVarB = jep.b(i);
        int size = yfqVarB.size();
        CarSensorEvent carSensorEvent = null;
        for (int i2 = 0; i2 < size; i2++) {
            abow abowVarA = this.k.a((xny) yfqVarB.get(i2));
            if (abowVarA != null) {
                CarSensorEvent carSensorEventG = fyh.g(i, abowVarA);
                if (carSensorEvent == null || carSensorEventG.c > carSensorEvent.c) {
                    carSensorEvent = carSensorEventG;
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

    @Override // defpackage.jbv
    public final void j(xny xnyVar, abow abowVar) {
        int iA = jep.a(xnyVar.A);
        this.e.lock();
        try {
            imr imrVar = (imr) this.o.get(iA);
            if (imrVar != null) {
                this.m.I(iA);
                CarSensorEvent carSensorEventG = fyh.g(iA, abowVar);
                Map map = b;
                synchronized (map) {
                    ((ydx) Map.EL.computeIfAbsent(map, Integer.valueOf(iA), new ijt(7))).add(carSensorEventG);
                }
                Iterator it = ((LinkedList) imrVar.b).iterator();
                while (it.hasNext()) {
                    ((ikq) it.next()).a(carSensorEventG);
                }
            } else {
                ((ype) ((ype) ((ype) a.h()).l(1, TimeUnit.MINUTES)).ai(209)).w("sensor event while no listener, sensor:%d", iA);
            }
        } finally {
            this.e.unlock();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.jbv
    public final void k() {
        if (this.k.c()) {
            ilh ilhVar = this.i;
            if (ilhVar != null) {
                ilhVar.e.i(ilhVar.g);
                if (ilhVar.d != null) {
                    ilhVar.f.removeCallbacksAndMessages(null);
                    yfq yfqVar = ilh.b;
                    int i = ((yls) yfqVar).c;
                    for (int i2 = 0; i2 < i; i2++) {
                        ilhVar.d.gd(((Integer) yfqVar.get(i2)).intValue(), ilhVar);
                    }
                }
            }
            try {
                this.e.tryLock(1000L, TimeUnit.MILLISECONDS);
                SparseArray sparseArray = this.o;
                int size = sparseArray.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    }
                    Object obj = ((imr) sparseArray.valueAt(size)).b;
                    Iterator it = ((LinkedList) obj).iterator();
                    while (it.hasNext()) {
                        ((ikq) it.next()).b();
                    }
                    ((LinkedList) obj).clear();
                }
                sparseArray.clear();
                this.f.clear();
            } catch (InterruptedException unused) {
            } catch (Throwable th) {
                ReentrantLock reentrantLock = this.e;
                if (reentrantLock.isHeldByCurrentThread()) {
                    reentrantLock.unlock();
                }
                throw th;
            }
            ReentrantLock reentrantLock2 = this.e;
            if (reentrantLock2.isHeldByCurrentThread()) {
                reentrantLock2.unlock();
            }
        }
    }

    @Override // defpackage.iyw
    public final void m(PrintWriter printWriter) {
        int i;
        iks iksVar = this.k;
        printWriter.println("supported sensors:".concat(String.valueOf(Arrays.toString(iksVar.c))));
        Iterator it = b.entrySet().iterator();
        while (true) {
            i = 0;
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            printWriter.println("sensor type: ".concat(String.valueOf(String.valueOf(entry.getKey()))));
            ArrayList arrayList = new ArrayList((Collection) entry.getValue());
            int size = arrayList.size();
            while (i < size) {
                printWriter.println(String.valueOf(String.valueOf((CarSensorEvent) arrayList.get(i))).concat("\n"));
                i++;
            }
        }
        if (iksVar.a != null) {
            iksVar.a.r(printWriter);
        } else if (iksVar.b != null) {
            printWriter.println("Proxy sensor endpoint");
        } else {
            printWriter.println("No sensor endpoint");
        }
        printWriter.println("clients");
        try {
            Iterator it2 = this.f.iterator();
            while (it2.hasNext()) {
                ikq ikqVar = (ikq) it2.next();
                if (ikqVar != null) {
                    try {
                        printWriter.println("binder:" + String.valueOf(ikqVar.a) + " active sensors:" + Arrays.toString(ikqVar.d()));
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
            SparseArray sparseArray = this.o;
            int size2 = sparseArray.size();
            while (i < size2) {
                int iKeyAt = sparseArray.keyAt(i);
                imr imrVar = (imr) sparseArray.get(iKeyAt);
                if (imrVar != null) {
                    printWriter.println(a.br(imrVar.a, imrVar.a(), iKeyAt, " Sensor:", " num client:", " rate:"));
                }
                i++;
            }
        } catch (ConcurrentModificationException unused3) {
            printWriter.println("concurrent modification happened");
        }
        printWriter.println("fuel types: ".concat(String.valueOf(String.valueOf(this.g))));
    }

    public final boolean n() {
        return this.k.c();
    }

    @Override // defpackage.qyh
    @ResultIgnorabilityUnspecified
    public final boolean o(int i, int i2, qyk qykVar) {
        ReentrantLock reentrantLock;
        Integer numValueOf;
        boolean z;
        v();
        if (!w(i)) {
            return false;
        }
        ReentrantLock reentrantLock2 = this.e;
        reentrantLock2.lock();
        try {
            if (Arrays.binarySearch(this.k.e(), i) < 0) {
                ((ype) ((ype) a.f()).ai(215)).w("Requested sensor %d not supported", i);
                reentrantLock2.unlock();
                return false;
            }
            ((ype) a.l().ai(213)).D("registerOrUpdateSensorListener %d %s", i, qykVar);
            ikq ikqVarU = u(qykVar);
            imr imrVar = (imr) this.o.get(i);
            if (ikqVarU == null) {
                ikqVarU = new ikq(this, qykVar);
                qykVar.asBinder().linkToDeath(ikqVarU, 0);
                this.f.add(ikqVarU);
            }
            CarSensorEvent carSensorEventI = i(i);
            if (carSensorEventI != null) {
                ikqVarU.a(carSensorEventI);
            }
            if (imrVar == null) {
                imrVar = new imr(i2);
                this.o.put(i, imrVar);
                numValueOf = null;
                z = true;
            } else {
                numValueOf = Integer.valueOf(imrVar.a);
                z = false;
            }
            ((LinkedList) imrVar.b).add(ikqVarU);
            if (acok.a.gu().e()) {
                if (f(imrVar.a, i2) < 0) {
                    imrVar.a = i2;
                    z = true;
                }
            } else if (imrVar.a > i2) {
                imrVar.a = i2;
                z = true;
            }
            java.util.Map map = ikqVarU.b;
            Integer numValueOf2 = Integer.valueOf(i);
            map.put(numValueOf2, Integer.valueOf(i2));
            ikqVarU.c.put(numValueOf2, new inb(i2));
            if (!z || x(i, i2)) {
                return true;
            }
            reentrantLock.lock();
            try {
                ikqVarU.c(i);
                if (numValueOf != null) {
                    imrVar.a = numValueOf.intValue();
                } else {
                    this.o.remove(i);
                }
                return false;
            } finally {
            }
        } catch (RemoteException unused) {
            ((ype) ((ype) a.f()).ai(214)).u("Adding listener failed.");
            return false;
        } finally {
        }
    }

    @Override // defpackage.qyh
    public final int[] p() {
        dlz.H(this.q);
        List list = this.h;
        list.getClass();
        if (list.isEmpty()) {
            return null;
        }
        return woy.dO(this.h);
    }

    @Override // defpackage.iyw
    public final void q() {
        throw null;
    }

    @Override // defpackage.iyw
    public final void r(jbj jbjVar) {
        iks iksVar = this.k;
        jbw jbwVar = (jbw) jbjVar;
        iksVar.a = jbwVar;
        iksVar.b(iksVar.a.t());
        synchronized (iksVar) {
            iksVar.a = jbwVar;
            iksVar.b = null;
            iksVar.d = false;
            iksVar.notifyAll();
        }
        this.i.c(this);
    }

    @Override // defpackage.qyh
    public final int[] s() {
        dlz.H(this.q);
        List list = this.g;
        list.getClass();
        if (list.isEmpty()) {
            return null;
        }
        return woy.dO(this.g);
    }

    @Override // defpackage.qyh
    public final int[] t() {
        v();
        int[] iArrE = this.k.e();
        ((ype) a.l().ai((char) 202)).y("Supported sensors: %s", Arrays.toString(iArrE));
        if (this.q.bt()) {
            return iArrE;
        }
        int i = 0;
        for (int i2 : iArrE) {
            if (jeo.b(i2)) {
                i++;
            }
        }
        int[] iArr = new int[i];
        int i3 = 0;
        for (int i4 : iArrE) {
            if (jeo.b(i4)) {
                iArr[i3] = i4;
                i3++;
            }
        }
        return iArr;
    }
}
