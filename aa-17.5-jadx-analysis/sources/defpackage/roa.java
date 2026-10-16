package defpackage;

import android.os.Looper;
import android.os.RemoteException;
import android.util.SparseArray;
import android.util.SparseIntArray;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class roa {
    public final Object a;
    public final Object b;

    public roa(ukp ukpVar, int i) {
        this.a = new umr(ukpVar);
        umr umrVar = new umr(ukpVar);
        int iA = ukpVar.a();
        int i2 = ukpVar.g;
        int i3 = i2 <= 0 ? iA : iA >> i2;
        float[] fArr = umrVar.a;
        float f = i3;
        fArr[0] = f;
        fArr[1] = f;
        fArr[2] = iA;
        umr umrVar2 = new umr(ukpVar);
        int iA2 = ukpVar.a();
        int iMax = ukpVar.g - (Math.max(i, 4) - 4);
        int i4 = iMax < 0 ? iA2 << (-iMax) : iA2 >> iMax;
        float[] fArr2 = umrVar2.a;
        float f2 = i4;
        fArr2[0] = f2;
        fArr2[1] = f2;
        fArr2[2] = iA2;
        this.b = umrVar2;
        umr.b(ukpVar, 1.0f);
        umr.b(ukpVar, (float) Math.pow(2.0d, 18 - ukpVar.a));
    }

    private final synchronized void k(int i) {
        Object obj = this.b;
        if (((SparseIntArray) obj).indexOfKey(i) >= 0) {
            ((SparseArray) this.a).delete(((SparseIntArray) obj).get(i));
            ((SparseIntArray) obj).delete(i);
        }
    }

    public final void a(Exception exc) throws qrz {
        if (exc instanceof RemoteException) {
            if (omc.c("CAR.BT", 4)) {
                rrd.d(4, "CAR.BT", exc, "RemoteException from car service: %s", exc.getMessage());
            }
            ((qvt) this.b).a();
            throw new rks((RemoteException) exc);
        }
        if (!(exc instanceof IllegalStateException)) {
            throw new RuntimeException(exc);
        }
        olm.f((IllegalStateException) exc);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    public final void b(Object obj, tzn tznVar) {
        Object objH = ((plb) this.a).h(obj);
        if (objH != null) {
            tznVar.a(objH);
            return;
        }
        ?? r1 = this.b;
        synchronized (r1) {
            Collection arrayList = (Collection) r1.get(obj);
            if (arrayList == null) {
                arrayList = new ArrayList();
                r1.put(obj, arrayList);
            }
            arrayList.add(tznVar);
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Map] */
    public final void c(Object obj, Object obj2) {
        ((plb) this.a).n(obj, obj2);
        ?? r2 = this.b;
        synchronized (r2) {
            if (r2.containsKey(obj)) {
                Iterator it = ((Collection) r2.get(obj)).iterator();
                while (it.hasNext()) {
                    ((tzn) it.next()).a(obj2);
                }
                r2.remove(obj);
            }
        }
    }

    public final synchronized twi d(abcs abcsVar) {
        return (twi) ((SparseArray) this.a).get(System.identityHashCode(abcsVar));
    }

    public final synchronized void e(abcs abcsVar, twi twiVar) {
        ((SparseArray) this.a).put(System.identityHashCode(abcsVar), twiVar);
    }

    public final synchronized void f(abcs abcsVar) {
        int iIdentityHashCode = System.identityHashCode(abcsVar);
        k(iIdentityHashCode);
        ((SparseArray) this.a).delete(iIdentityHashCode);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, tpz] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, tpz] */
    public final synchronized void g(Runnable runnable) {
        for (twj twjVar : this.b) {
            ?? r2 = twjVar.c;
            Object obj = twjVar.b;
            if (r2 != obj) {
                twjVar.c = obj;
                ?? r1 = twjVar.c;
                if (r1 != 0) {
                    r1.i();
                }
                if (r2 != 0) {
                    r2.f();
                }
            }
        }
        if (runnable != null) {
            Object obj2 = this.a;
            ((gjv) obj2).m(runnable);
            ((gjv) obj2).l();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    public final synchronized void h(twj twjVar) {
        this.b.remove(twjVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, tpz] */
    public final synchronized void i(Runnable runnable) {
        for (twj twjVar : this.b) {
            Object obj = twjVar.a;
            ?? r3 = twjVar.b;
            if (obj != r3) {
                if (r3 != 0 && r3 != twjVar.c) {
                    r3.f();
                }
                twjVar.b = twjVar.a;
            }
        }
        sbj sbjVar = new sbj(this, runnable, 16);
        if (uui.b()) {
            sbjVar.run();
            return;
        }
        Object obj2 = this.a;
        ((gjv) obj2).m(sbjVar);
        ((gjv) obj2).l();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    public final twj j() {
        twj twjVar = new twj(this);
        synchronized (this) {
            this.b.add(twjVar);
        }
        return twjVar;
    }

    public roa(tqd tqdVar, too tooVar) {
        this.b = tqdVar;
        this.a = tooVar;
    }

    public roa(byte[] bArr) {
        this.a = "a";
        this.b = "i";
    }

    public roa(byte[] bArr, byte[] bArr2) {
        this.b = "h";
        this.a = "i";
    }

    public roa() {
        this.a = new SparseArray();
        this.b = new SparseIntArray();
    }

    public roa(qvr qvrVar, Looper looper) throws RemoteException {
        if (omc.c("CAR.BT", 3)) {
            rrd.a("CAR.BT", null, "CarBluetoothConnectionManager");
        }
        this.a = qvrVar;
        this.b = new qvt(looper);
        Integer num = (Integer) new ntn((Integer) rox.f(new rdw(this, 7))).i(-2);
        if (num.intValue() != 0) {
            rrd.d(5, "CAR.BT", null, "CarBluetoothConnectionManager initialization error: %d", num);
        }
    }

    public roa(String str, tot totVar) {
        this.a = str;
        this.b = totVar;
    }

    public roa(tzu tzuVar) {
        this.b = new HashMap();
        this.a = tzuVar;
    }

    public roa(gjv gjvVar) {
        new AtomicBoolean(false);
        new ArrayList();
        this.b = new ArrayList();
        this.a = gjvVar;
    }
}
