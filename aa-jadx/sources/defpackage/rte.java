package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class rte extends defpackage.qxg implements defpackage.rtf {
    public static final defpackage.yqk a = defpackage.omv.n("CAR.GAL.GAL");
    public defpackage.rtd e;
    public final java.lang.Object b = new java.lang.Object();
    public final android.util.SparseArray c = new android.util.SparseArray();
    public final android.util.SparseArray d = new android.util.SparseArray();
    public final com.google.android.gms.car.CarGalMessage f = new com.google.android.gms.car.CarGalMessage();
    public final android.util.SparseIntArray g = new android.util.SparseIntArray();

    private final void i(defpackage.rtd rtdVar) {
        int i = 0;
        int i2 = 0;
        boolean zEquals = false;
        while (true) {
            android.util.SparseArray sparseArray = this.c;
            if (i2 >= sparseArray.size()) {
                break;
            }
            zEquals |= ((android.util.ArrayMap) sparseArray.valueAt(i2)).containsKey(rtdVar);
            i2++;
        }
        while (true) {
            android.util.SparseArray sparseArray2 = this.d;
            if (i >= sparseArray2.size()) {
                break;
            }
            zEquals |= ((android.util.ArrayMap) sparseArray2.valueAt(i)).containsKey(rtdVar);
            i++;
        }
        defpackage.rtd rtdVar2 = this.e;
        if (rtdVar2 != null) {
            zEquals |= rtdVar2.equals(rtdVar);
        }
        if (zEquals) {
            return;
        }
        rtdVar.a();
    }

    private final defpackage.rtd j(defpackage.qxe qxeVar) {
        android.os.IBinder iBinderAsBinder = qxeVar.asBinder();
        int i = 0;
        int i2 = 0;
        while (true) {
            android.util.SparseArray sparseArray = this.c;
            if (i2 < sparseArray.size()) {
                for (defpackage.rtd rtdVar : ((android.util.ArrayMap) sparseArray.valueAt(i2)).keySet()) {
                    if (rtdVar.b(iBinderAsBinder)) {
                        return rtdVar;
                    }
                }
                i2++;
            } else {
                while (true) {
                    android.util.SparseArray sparseArray2 = this.d;
                    if (i >= sparseArray2.size()) {
                        defpackage.rtd rtdVar2 = this.e;
                        if (rtdVar2 == null || !rtdVar2.b(iBinderAsBinder)) {
                            return null;
                        }
                        return this.e;
                    }
                    for (defpackage.rtd rtdVar3 : ((android.util.ArrayMap) sparseArray2.valueAt(i)).keySet()) {
                        if (rtdVar3.b(iBinderAsBinder)) {
                            return rtdVar3;
                        }
                    }
                    i++;
                }
            }
        }
    }

    private final void k(android.util.SparseArray sparseArray, defpackage.qxe qxeVar, int i) {
        defpackage.rtd rtdVarJ = j(qxeVar);
        if (rtdVarJ == null) {
            try {
                rtdVarJ = new defpackage.rtd(this, qxeVar);
                qxeVar.asBinder().linkToDeath(rtdVarJ, 0);
            } catch (android.os.RemoteException e) {
                a.l().p(e).ai(8268).u("Cannot add listener. Client has already died.");
                return;
            }
        }
        android.util.ArrayMap arrayMap = (android.util.ArrayMap) sparseArray.get(i);
        if (arrayMap == null) {
            arrayMap = new android.util.ArrayMap();
            sparseArray.put(i, arrayMap);
        }
        arrayMap.put(rtdVarJ, null);
        a.l().ai(8267).B("Registered GAL message listener, serviceType=%d, count=%d", i, arrayMap.size());
    }

    private final void l(android.util.SparseArray sparseArray, defpackage.qxe qxeVar, int i) {
        android.util.ArrayMap arrayMap;
        defpackage.rtd rtdVarJ = j(qxeVar);
        if (rtdVarJ == null || (arrayMap = (android.util.ArrayMap) sparseArray.get(i)) == null) {
            return;
        }
        arrayMap.remove(rtdVarJ);
        a.l().ai(8270).B("Removed GAL message listener, serviceType=%d, count=%d", i, arrayMap.size());
        i(rtdVarJ);
    }

    @Override // defpackage.rtf
    public final void a(int i, int i2) {
        if (i2 == 0) {
            a.h().ai(8272).B("Ignore mapping channelId %d -> serviceType %d", i, 0);
        } else {
            a.f().ai(8271).B("Update channel map channelId %d -> serviceType %d", i, i2);
            this.g.put(i, i2);
        }
    }

    @Override // defpackage.qxh
    public final void b(defpackage.qxe qxeVar) {
        synchronized (this.b) {
            defpackage.rtd rtdVarJ = j(qxeVar);
            if (rtdVarJ == null) {
                try {
                    rtdVarJ = new defpackage.rtd(this, qxeVar);
                    qxeVar.asBinder().linkToDeath(rtdVarJ, 0);
                    this.e = rtdVarJ;
                    a.l().ai(8265).u("Registered connection event listener.");
                } catch (android.os.RemoteException e) {
                    a.l().p(e).ai(8266).u("Cannot register listener. Client has already died.");
                }
            } else {
                this.e = rtdVarJ;
                a.l().ai(8265).u("Registered connection event listener.");
            }
            throw th;
        }
    }

    @Override // defpackage.qxh
    public final void c(defpackage.qxe qxeVar, int i) {
        synchronized (this.b) {
            k(this.d, qxeVar, i);
        }
    }

    @Override // defpackage.qxh
    public final void d(defpackage.qxe qxeVar, int i) {
        synchronized (this.b) {
            k(this.c, qxeVar, i);
        }
    }

    @Override // defpackage.qxh
    public final void f(defpackage.qxe qxeVar) {
        synchronized (this.b) {
            defpackage.rtd rtdVarJ = j(qxeVar);
            if (rtdVarJ != null) {
                this.e = null;
                i(rtdVarJ);
                a.l().ai(8269).u("Removed connection event listener.");
            }
        }
    }

    @Override // defpackage.qxh
    public final void g(defpackage.qxe qxeVar, int i) {
        synchronized (this.b) {
            l(this.d, qxeVar, i);
        }
    }

    @Override // defpackage.qxh
    public final void h(defpackage.qxe qxeVar, int i) {
        synchronized (this.b) {
            l(this.c, qxeVar, i);
        }
    }
}
