package defpackage;

import android.os.IBinder;
import android.os.RemoteException;
import android.util.ArrayMap;
import android.util.SparseArray;
import android.util.SparseIntArray;
import com.google.android.gms.car.CarGalMessage;

/* loaded from: classes2.dex */
public final class rsk extends qwk implements rsl {
    public static final ypf a = ols.R("CAR.GAL.GAL");
    public rsj e;
    public final Object b = new Object();
    public final SparseArray c = new SparseArray();
    public final SparseArray d = new SparseArray();
    public final CarGalMessage f = new CarGalMessage();
    public final SparseIntArray g = new SparseIntArray();

    private final void i(rsj rsjVar) {
        int i = 0;
        int i2 = 0;
        boolean zEquals = false;
        while (true) {
            SparseArray sparseArray = this.c;
            if (i2 >= sparseArray.size()) {
                break;
            }
            zEquals |= ((ArrayMap) sparseArray.valueAt(i2)).containsKey(rsjVar);
            i2++;
        }
        while (true) {
            SparseArray sparseArray2 = this.d;
            if (i >= sparseArray2.size()) {
                break;
            }
            zEquals |= ((ArrayMap) sparseArray2.valueAt(i)).containsKey(rsjVar);
            i++;
        }
        rsj rsjVar2 = this.e;
        if (rsjVar2 != null) {
            zEquals |= rsjVar2.equals(rsjVar);
        }
        if (zEquals) {
            return;
        }
        rsjVar.a();
    }

    private final rsj j(qwi qwiVar) {
        IBinder iBinderAsBinder = qwiVar.asBinder();
        int i = 0;
        int i2 = 0;
        while (true) {
            SparseArray sparseArray = this.c;
            if (i2 < sparseArray.size()) {
                for (rsj rsjVar : ((ArrayMap) sparseArray.valueAt(i2)).keySet()) {
                    if (rsjVar.b(iBinderAsBinder)) {
                        return rsjVar;
                    }
                }
                i2++;
            } else {
                while (true) {
                    SparseArray sparseArray2 = this.d;
                    if (i >= sparseArray2.size()) {
                        rsj rsjVar2 = this.e;
                        if (rsjVar2 == null || !rsjVar2.b(iBinderAsBinder)) {
                            return null;
                        }
                        return this.e;
                    }
                    for (rsj rsjVar3 : ((ArrayMap) sparseArray2.valueAt(i)).keySet()) {
                        if (rsjVar3.b(iBinderAsBinder)) {
                            return rsjVar3;
                        }
                    }
                    i++;
                }
            }
        }
    }

    private final void k(SparseArray sparseArray, qwi qwiVar, int i) throws RemoteException {
        rsj rsjVarJ = j(qwiVar);
        if (rsjVarJ == null) {
            try {
                rsjVarJ = new rsj(this, qwiVar);
                qwiVar.asBinder().linkToDeath(rsjVarJ, 0);
            } catch (RemoteException e) {
                a.l().p(e).ai(8243).u("Cannot add listener. Client has already died.");
                return;
            }
        }
        ArrayMap arrayMap = (ArrayMap) sparseArray.get(i);
        if (arrayMap == null) {
            arrayMap = new ArrayMap();
            sparseArray.put(i, arrayMap);
        }
        arrayMap.put(rsjVarJ, null);
        a.l().ai(8242).B("Registered GAL message listener, serviceType=%d, count=%d", i, arrayMap.size());
    }

    private final void l(SparseArray sparseArray, qwi qwiVar, int i) {
        ArrayMap arrayMap;
        rsj rsjVarJ = j(qwiVar);
        if (rsjVarJ == null || (arrayMap = (ArrayMap) sparseArray.get(i)) == null) {
            return;
        }
        arrayMap.remove(rsjVarJ);
        a.l().ai(8245).B("Removed GAL message listener, serviceType=%d, count=%d", i, arrayMap.size());
        i(rsjVarJ);
    }

    @Override // defpackage.rsl
    public final void a(int i, int i2) {
        if (i2 == 0) {
            a.h().ai(8247).B("Ignore mapping channelId %d -> serviceType %d", i, 0);
        } else {
            a.f().ai(8246).B("Update channel map channelId %d -> serviceType %d", i, i2);
            this.g.put(i, i2);
        }
    }

    @Override // defpackage.qwl
    public final void b(qwi qwiVar) {
        synchronized (this.b) {
            rsj rsjVarJ = j(qwiVar);
            if (rsjVarJ == null) {
                try {
                    rsjVarJ = new rsj(this, qwiVar);
                    qwiVar.asBinder().linkToDeath(rsjVarJ, 0);
                    this.e = rsjVarJ;
                    a.l().ai(8240).u("Registered connection event listener.");
                } catch (RemoteException e) {
                    a.l().p(e).ai(8241).u("Cannot register listener. Client has already died.");
                }
            } else {
                this.e = rsjVarJ;
                a.l().ai(8240).u("Registered connection event listener.");
            }
        }
    }

    @Override // defpackage.qwl
    public final void c(qwi qwiVar, int i) {
        synchronized (this.b) {
            k(this.d, qwiVar, i);
        }
    }

    @Override // defpackage.qwl
    public final void d(qwi qwiVar, int i) {
        synchronized (this.b) {
            k(this.c, qwiVar, i);
        }
    }

    @Override // defpackage.qwl
    public final void f(qwi qwiVar) {
        synchronized (this.b) {
            rsj rsjVarJ = j(qwiVar);
            if (rsjVarJ != null) {
                this.e = null;
                i(rsjVarJ);
                a.l().ai(8244).u("Removed connection event listener.");
            }
        }
    }

    @Override // defpackage.qwl
    public final void g(qwi qwiVar, int i) {
        synchronized (this.b) {
            l(this.d, qwiVar, i);
        }
    }

    @Override // defpackage.qwl
    public final void h(qwi qwiVar, int i) {
        synchronized (this.b) {
            l(this.c, qwiVar, i);
        }
    }
}
