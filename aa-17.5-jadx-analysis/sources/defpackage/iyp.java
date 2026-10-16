package defpackage;

import android.os.IBinder;
import android.os.RemoteException;
import android.util.ArrayMap;
import android.util.SparseArray;
import android.util.SparseIntArray;
import com.google.android.gms.car.CarGalMessage;

/* loaded from: classes2.dex */
public final class iyp extends qwk implements iyq {
    public static final ypf a = ols.R("CAR.GAL.GAL");
    public final Object b;
    public final SparseArray c;
    public final SparseArray d;
    public iyo e;
    public final CarGalMessage f;
    public final SparseIntArray g;
    public final qwl h;

    public iyp() {
        this.b = new Object();
        this.c = new SparseArray();
        this.d = new SparseArray();
        this.f = new CarGalMessage();
        this.g = new SparseIntArray();
        this.h = null;
    }

    private final void i(iyo iyoVar) {
        int i = 0;
        int i2 = 0;
        boolean zEquals = false;
        while (true) {
            SparseArray sparseArray = this.c;
            if (i2 >= sparseArray.size()) {
                break;
            }
            zEquals |= ((ArrayMap) sparseArray.valueAt(i2)).containsKey(iyoVar);
            i2++;
        }
        while (true) {
            SparseArray sparseArray2 = this.d;
            if (i >= sparseArray2.size()) {
                break;
            }
            zEquals |= ((ArrayMap) sparseArray2.valueAt(i)).containsKey(iyoVar);
            i++;
        }
        iyo iyoVar2 = this.e;
        if (iyoVar2 != null) {
            zEquals |= iyoVar2.equals(iyoVar);
        }
        if (zEquals) {
            return;
        }
        iyoVar.a();
    }

    private final iyo j(qwi qwiVar) {
        IBinder iBinderAsBinder = qwiVar.asBinder();
        int i = 0;
        int i2 = 0;
        while (true) {
            SparseArray sparseArray = this.c;
            if (i2 < sparseArray.size()) {
                for (iyo iyoVar : ((ArrayMap) sparseArray.valueAt(i2)).keySet()) {
                    if (iyoVar.b(iBinderAsBinder)) {
                        return iyoVar;
                    }
                }
                i2++;
            } else {
                while (true) {
                    SparseArray sparseArray2 = this.d;
                    if (i >= sparseArray2.size()) {
                        iyo iyoVar2 = this.e;
                        if (iyoVar2 == null || !iyoVar2.b(iBinderAsBinder)) {
                            return null;
                        }
                        return this.e;
                    }
                    for (iyo iyoVar3 : ((ArrayMap) sparseArray2.valueAt(i)).keySet()) {
                        if (iyoVar3.b(iBinderAsBinder)) {
                            return iyoVar3;
                        }
                    }
                    i++;
                }
            }
        }
    }

    private final void k(SparseArray sparseArray, qwi qwiVar, int i) throws RemoteException {
        iyo iyoVarJ = j(qwiVar);
        if (iyoVarJ == null) {
            try {
                iyoVarJ = new iyo(this, qwiVar);
                qwiVar.asBinder().linkToDeath(iyoVarJ, 0);
            } catch (RemoteException e) {
                a.l().p(e).ai(1658).u("Cannot add listener. Client has already died.");
                return;
            }
        }
        ArrayMap arrayMap = (ArrayMap) sparseArray.get(i);
        if (arrayMap == null) {
            arrayMap = new ArrayMap();
            sparseArray.put(i, arrayMap);
        }
        arrayMap.put(iyoVarJ, null);
        a.l().ai(1657).B("Registered GAL message listener, serviceType=%d, count=%d", i, arrayMap.size());
    }

    private final void l(SparseArray sparseArray, qwi qwiVar, int i) {
        ArrayMap arrayMap;
        iyo iyoVarJ = j(qwiVar);
        if (iyoVarJ == null || (arrayMap = (ArrayMap) sparseArray.get(i)) == null) {
            return;
        }
        arrayMap.remove(iyoVarJ);
        a.l().ai(1660).B("Removed GAL message listener, serviceType=%d, count=%d", i, arrayMap.size());
        i(iyoVarJ);
    }

    @Override // defpackage.iyq
    public final void a(int i, int i2) {
        if (i2 == 0) {
            a.h().ai(1662).B("Ignore mapping channelId %d -> serviceType %d", i, 0);
        } else {
            a.f().ai(1661).B("Update channel map channelId %d -> serviceType %d", i, i2);
            this.g.put(i, i2);
        }
    }

    @Override // defpackage.qwl
    public final void b(qwi qwiVar) {
        synchronized (this.b) {
            iyo iyoVarJ = j(qwiVar);
            if (iyoVarJ == null) {
                try {
                    iyoVarJ = new iyo(this, qwiVar);
                    qwiVar.asBinder().linkToDeath(iyoVarJ, 0);
                    this.e = iyoVarJ;
                    a.l().ai(1655).u("Registered connection event listener.");
                } catch (RemoteException e) {
                    a.l().p(e).ai(1656).u("Cannot register listener. Client has already died.");
                }
            } else {
                this.e = iyoVarJ;
                a.l().ai(1655).u("Registered connection event listener.");
            }
        }
        qwl qwlVar = this.h;
        if (qwlVar != null) {
            try {
                qwlVar.b(qwiVar);
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // defpackage.qwl
    public final void c(qwi qwiVar, int i) {
        synchronized (this.b) {
            k(this.d, qwiVar, i);
        }
        qwl qwlVar = this.h;
        if (qwlVar != null) {
            try {
                qwlVar.c(qwiVar, i);
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // defpackage.qwl
    public final void d(qwi qwiVar, int i) {
        synchronized (this.b) {
            k(this.c, qwiVar, i);
        }
        qwl qwlVar = this.h;
        if (qwlVar != null) {
            try {
                qwlVar.d(qwiVar, i);
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // defpackage.qwl
    public final void f(qwi qwiVar) {
        synchronized (this.b) {
            iyo iyoVarJ = j(qwiVar);
            if (iyoVarJ != null) {
                this.e = null;
                i(iyoVarJ);
                a.l().ai(1659).u("Removed connection event listener.");
            }
        }
        qwl qwlVar = this.h;
        if (qwlVar != null) {
            try {
                qwlVar.f(qwiVar);
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // defpackage.qwl
    public final void g(qwi qwiVar, int i) {
        synchronized (this.b) {
            l(this.d, qwiVar, i);
        }
        qwl qwlVar = this.h;
        if (qwlVar != null) {
            try {
                qwlVar.g(qwiVar, i);
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // defpackage.qwl
    public final void h(qwi qwiVar, int i) {
        synchronized (this.b) {
            l(this.c, qwiVar, i);
        }
        qwl qwlVar = this.h;
        if (qwlVar != null) {
            try {
                qwlVar.h(qwiVar, i);
            } catch (RemoteException unused) {
            }
        }
    }

    public iyp(qwl qwlVar) {
        this.b = new Object();
        this.c = new SparseArray();
        this.d = new SparseArray();
        this.f = new CarGalMessage();
        this.g = new SparseIntArray();
        this.h = qwlVar;
    }
}
