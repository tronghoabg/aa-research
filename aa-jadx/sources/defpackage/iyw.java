package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class iyw extends defpackage.qxg implements defpackage.iyx {
    public static final defpackage.yqk a = defpackage.omv.n("CAR.GAL.GAL");
    public final java.lang.Object b;
    public final android.util.SparseArray c;
    public final android.util.SparseArray d;
    public defpackage.iyv e;
    public final com.google.android.gms.car.CarGalMessage f;
    public final android.util.SparseIntArray g;
    public final defpackage.qxh h;

    public iyw() {
        this.b = new java.lang.Object();
        this.c = new android.util.SparseArray();
        this.d = new android.util.SparseArray();
        this.f = new com.google.android.gms.car.CarGalMessage();
        this.g = new android.util.SparseIntArray();
        this.h = null;
    }

    private final void i(defpackage.iyv iyvVar) {
        int i = 0;
        int i2 = 0;
        boolean zEquals = false;
        while (true) {
            android.util.SparseArray sparseArray = this.c;
            if (i2 >= sparseArray.size()) {
                break;
            }
            zEquals |= ((android.util.ArrayMap) sparseArray.valueAt(i2)).containsKey(iyvVar);
            i2++;
        }
        while (true) {
            android.util.SparseArray sparseArray2 = this.d;
            if (i >= sparseArray2.size()) {
                break;
            }
            zEquals |= ((android.util.ArrayMap) sparseArray2.valueAt(i)).containsKey(iyvVar);
            i++;
        }
        defpackage.iyv iyvVar2 = this.e;
        if (iyvVar2 != null) {
            zEquals |= iyvVar2.equals(iyvVar);
        }
        if (zEquals) {
            return;
        }
        iyvVar.a();
    }

    private final defpackage.iyv j(defpackage.qxe qxeVar) {
        android.os.IBinder iBinderAsBinder = qxeVar.asBinder();
        int i = 0;
        int i2 = 0;
        while (true) {
            android.util.SparseArray sparseArray = this.c;
            if (i2 < sparseArray.size()) {
                for (defpackage.iyv iyvVar : ((android.util.ArrayMap) sparseArray.valueAt(i2)).keySet()) {
                    if (iyvVar.b(iBinderAsBinder)) {
                        return iyvVar;
                    }
                }
                i2++;
            } else {
                while (true) {
                    android.util.SparseArray sparseArray2 = this.d;
                    if (i >= sparseArray2.size()) {
                        defpackage.iyv iyvVar2 = this.e;
                        if (iyvVar2 == null || !iyvVar2.b(iBinderAsBinder)) {
                            return null;
                        }
                        return this.e;
                    }
                    for (defpackage.iyv iyvVar3 : ((android.util.ArrayMap) sparseArray2.valueAt(i)).keySet()) {
                        if (iyvVar3.b(iBinderAsBinder)) {
                            return iyvVar3;
                        }
                    }
                    i++;
                }
            }
        }
    }

    private final void k(android.util.SparseArray sparseArray, defpackage.qxe qxeVar, int i) {
        defpackage.iyv iyvVarJ = j(qxeVar);
        if (iyvVarJ == null) {
            try {
                iyvVarJ = new defpackage.iyv(this, qxeVar);
                qxeVar.asBinder().linkToDeath(iyvVarJ, 0);
            } catch (android.os.RemoteException e) {
                a.l().p(e).ai(1658).u("Cannot add listener. Client has already died.");
                return;
            }
        }
        android.util.ArrayMap arrayMap = (android.util.ArrayMap) sparseArray.get(i);
        if (arrayMap == null) {
            arrayMap = new android.util.ArrayMap();
            sparseArray.put(i, arrayMap);
        }
        arrayMap.put(iyvVarJ, null);
        a.l().ai(1657).B("Registered GAL message listener, serviceType=%d, count=%d", i, arrayMap.size());
    }

    private final void l(android.util.SparseArray sparseArray, defpackage.qxe qxeVar, int i) {
        android.util.ArrayMap arrayMap;
        defpackage.iyv iyvVarJ = j(qxeVar);
        if (iyvVarJ == null || (arrayMap = (android.util.ArrayMap) sparseArray.get(i)) == null) {
            return;
        }
        arrayMap.remove(iyvVarJ);
        a.l().ai(1660).B("Removed GAL message listener, serviceType=%d, count=%d", i, arrayMap.size());
        i(iyvVarJ);
    }

    @Override // defpackage.iyx
    public final void a(int i, int i2) {
        if (i2 == 0) {
            a.h().ai(1662).B("Ignore mapping channelId %d -> serviceType %d", i, 0);
        } else {
            a.f().ai(1661).B("Update channel map channelId %d -> serviceType %d", i, i2);
            this.g.put(i, i2);
        }
    }

    @Override // defpackage.qxh
    public final void b(defpackage.qxe qxeVar) {
        synchronized (this.b) {
            defpackage.iyv iyvVarJ = j(qxeVar);
            if (iyvVarJ == null) {
                try {
                    iyvVarJ = new defpackage.iyv(this, qxeVar);
                    qxeVar.asBinder().linkToDeath(iyvVarJ, 0);
                    this.e = iyvVarJ;
                    a.l().ai(1655).u("Registered connection event listener.");
                } catch (android.os.RemoteException e) {
                    a.l().p(e).ai(1656).u("Cannot register listener. Client has already died.");
                }
            } else {
                this.e = iyvVarJ;
                a.l().ai(1655).u("Registered connection event listener.");
            }
            throw th;
        }
        defpackage.qxh qxhVar = this.h;
        if (qxhVar != null) {
            try {
                qxhVar.b(qxeVar);
            } catch (android.os.RemoteException unused) {
            }
        }
    }

    @Override // defpackage.qxh
    public final void c(defpackage.qxe qxeVar, int i) {
        synchronized (this.b) {
            k(this.d, qxeVar, i);
        }
        defpackage.qxh qxhVar = this.h;
        if (qxhVar != null) {
            try {
                qxhVar.c(qxeVar, i);
            } catch (android.os.RemoteException unused) {
            }
        }
    }

    @Override // defpackage.qxh
    public final void d(defpackage.qxe qxeVar, int i) {
        synchronized (this.b) {
            k(this.c, qxeVar, i);
        }
        defpackage.qxh qxhVar = this.h;
        if (qxhVar != null) {
            try {
                qxhVar.d(qxeVar, i);
            } catch (android.os.RemoteException unused) {
            }
        }
    }

    @Override // defpackage.qxh
    public final void f(defpackage.qxe qxeVar) {
        synchronized (this.b) {
            defpackage.iyv iyvVarJ = j(qxeVar);
            if (iyvVarJ != null) {
                this.e = null;
                i(iyvVarJ);
                a.l().ai(1659).u("Removed connection event listener.");
            }
        }
        defpackage.qxh qxhVar = this.h;
        if (qxhVar != null) {
            try {
                qxhVar.f(qxeVar);
            } catch (android.os.RemoteException unused) {
            }
        }
    }

    @Override // defpackage.qxh
    public final void g(defpackage.qxe qxeVar, int i) {
        synchronized (this.b) {
            l(this.d, qxeVar, i);
        }
        defpackage.qxh qxhVar = this.h;
        if (qxhVar != null) {
            try {
                qxhVar.g(qxeVar, i);
            } catch (android.os.RemoteException unused) {
            }
        }
    }

    @Override // defpackage.qxh
    public final void h(defpackage.qxe qxeVar, int i) {
        synchronized (this.b) {
            l(this.c, qxeVar, i);
        }
        defpackage.qxh qxhVar = this.h;
        if (qxhVar != null) {
            try {
                qxhVar.h(qxeVar, i);
            } catch (android.os.RemoteException unused) {
            }
        }
    }

    public iyw(defpackage.qxh qxhVar) {
        this.b = new java.lang.Object();
        this.c = new android.util.SparseArray();
        this.d = new android.util.SparseArray();
        this.f = new com.google.android.gms.car.CarGalMessage();
        this.g = new android.util.SparseIntArray();
        this.h = qxhVar;
    }
}
