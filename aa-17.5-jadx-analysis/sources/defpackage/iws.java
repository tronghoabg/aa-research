package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.os.Binder;
import android.os.IBinder;
import android.os.RemoteException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

/* loaded from: classes.dex */
public final class iws extends qwz implements izp {
    public static final /* synthetic */ int g = 0;
    private static final yph h = yph.c("CAR.MSG");
    private static final int[][] i = {new int[]{131073}, new int[]{327681}, new int[]{65537}};
    public izt b;
    private final jet j;
    private final jew k;
    private final Context l;
    private final ixt n;
    public final Object a = new Object();
    public final iwr[] c = new iwr[3];
    public final LinkedList d = new LinkedList();
    private final HashMap m = new HashMap();
    public boolean e = false;
    public boolean f = false;

    public iws(jet jetVar, jew jewVar, Context context) {
        this.j = jetVar;
        this.k = jewVar;
        this.l = context;
        this.n = new ixt(context);
    }

    public static final int n(int i2, int i3) throws IllegalArgumentException {
        s(i2);
        int[] iArr = i[i2];
        if (i3 < 0 || i3 >= iArr.length) {
            throw new IllegalArgumentException(a.bo(i2, i3, "wrong key ", " for given category "));
        }
        return iArr[i3];
    }

    private final iwr o(qxd qxdVar, int i2) {
        iwr iwrVar;
        synchronized (this.a) {
            iwr iwrVarP = p(qxdVar);
            iwrVar = this.c[i2];
            if (iwrVar == null) {
                throw new IllegalStateException("not owned");
            }
            if (iwrVar != iwrVarP) {
                throw new IllegalStateException("not owned");
            }
        }
        return iwrVar;
    }

    private final iwr p(qxd qxdVar) {
        iwr iwrVarA = a(qxdVar);
        if (iwrVarA != null) {
            return iwrVarA;
        }
        throw new IllegalStateException("not registered");
    }

    private final void q() {
        this.n.c();
    }

    private final void r(int i2, int i3, int i4, iwr iwrVar) throws IllegalArgumentException {
        Integer numValueOf = Integer.valueOf(i2);
        if (i2 == 0) {
            if (i3 == 0) {
                if (i4 != 1 && i4 != 2) {
                    throw new IllegalArgumentException("Unknown value, category:" + i2 + " key:0 value:" + i4);
                }
                ((ype) ((ype) h.f()).ai(1498)).R("sending voice session message to car, category:%d key:%d value:%d", numValueOf, 0, Integer.valueOf(i4));
                Object obj = this.a;
                boolean z = i4 == 1;
                synchronized (obj) {
                    this.f = z;
                    izt iztVar = this.b;
                    iztVar.getClass();
                    iztVar.f(wpq.z(i4));
                }
                return;
            }
            return;
        }
        if (i2 == 1 && i3 == 0) {
            if (i4 != 1) {
                if (i4 != 0) {
                    throw new IllegalArgumentException("Unknown value, category:" + i2 + " key:0 value:" + i4);
                }
                q();
                synchronized (this.a) {
                    Object obj2 = this.b;
                    obj2.getClass();
                    abnp abnpVarN = xkx.a.n();
                    xky xkyVar = xky.NAV_FOCUS_NATIVE;
                    abnpVarN.t();
                    xkx xkxVar = (xkx) abnpVarN.b;
                    xkxVar.c = xkyVar.c;
                    xkxVar.b |= 1;
                    ((jbj) obj2).k(13, (xkx) abnpVarN.q());
                    this.e = false;
                }
                return;
            }
            if (iwrVar != null) {
                jet jetVar = this.j;
                int i5 = iwrVar.b;
                iob iobVarN = ((ima) jetVar).n();
                ComponentName componentNameB = iobVarN != null ? iobVarN.b(i5) : null;
                if (componentNameB != null) {
                    this.n.d(componentNameB);
                }
            }
            synchronized (this.a) {
                Object obj3 = this.b;
                obj3.getClass();
                izu.a.l().ai(1701).u("requesting navigation focus");
                abnp abnpVarN2 = xkx.a.n();
                xky xkyVar2 = xky.NAV_FOCUS_PROJECTED;
                abnpVarN2.t();
                xkx xkxVar2 = (xkx) abnpVarN2.b;
                xkxVar2.c = xkyVar2.c;
                xkxVar2.b |= 1;
                ((jbj) obj3).k(13, (xkx) abnpVarN2.q());
                this.e = true;
            }
        }
    }

    private static final void s(int i2) throws IllegalArgumentException {
        if (i2 >= 0) {
            int length = i.length;
            if (i2 < 3) {
                return;
            }
        }
        throw new IllegalArgumentException(a.bp(i2, "wrong category "));
    }

    private static final long t(int i2, int i3) {
        return i3 | (i2 << 32);
    }

    public final iwr a(qxd qxdVar) {
        IBinder iBinderAsBinder = qxdVar.asBinder();
        synchronized (this.a) {
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                iwr iwrVar = (iwr) it.next();
                if (iwrVar.a.asBinder() == iBinderAsBinder) {
                    return iwrVar;
                }
            }
            return null;
        }
    }

    @Override // defpackage.izp
    public final void b(boolean z) {
        m(1, z ? 1 : 0);
        if (z) {
            return;
        }
        q();
    }

    @Override // defpackage.qxa
    public final void c(qxd qxdVar) {
        this.k.aj();
        synchronized (this.a) {
            if (a(qxdVar) != null) {
                throw new IllegalStateException("already registered");
            }
            iwr iwrVar = new iwr(this, qxdVar);
            try {
                qxdVar.asBinder().linkToDeath(iwrVar, 0);
                iwrVar.b = Binder.getCallingPid();
                iwrVar.c = Binder.getCallingUid();
                this.d.add(iwrVar);
            } catch (RemoteException unused) {
                ((ype) ((ype) h.h()).ai(1495)).u("client already dead?");
            }
        }
    }

    @Override // defpackage.qxa
    public final void d(qxd qxdVar) {
        this.k.aj();
        Object obj = this.a;
        iwr iwrVarP = p(qxdVar);
        synchronized (obj) {
            int i2 = 0;
            while (true) {
                iwr[] iwrVarArr = this.c;
                int length = iwrVarArr.length;
                if (i2 < 3) {
                    if (iwrVarArr[i2] == iwrVarP) {
                        iwrVarArr[i2] = null;
                    }
                    i2++;
                }
            }
        }
    }

    @Override // defpackage.qxa
    public final void f(qxd qxdVar, int i2) throws IllegalArgumentException {
        this.k.aj();
        s(i2);
        Object obj = this.a;
        iwr iwrVarP = p(qxdVar);
        synchronized (obj) {
            iwr[] iwrVarArr = this.c;
            if (iwrVarArr[i2] == iwrVarP) {
                iwrVarArr[i2] = null;
            } else {
                ((ype) ((ype) h.h()).ai(1496)).u("Tried to release unowned category");
            }
        }
    }

    public final void g(iwr iwrVar) {
        synchronized (this.a) {
            this.d.remove(iwrVar);
            int i2 = 0;
            while (true) {
                iwr[] iwrVarArr = this.c;
                int length = iwrVarArr.length;
                if (i2 < 3) {
                    if (iwrVarArr[i2] == iwrVar) {
                        iwrVarArr[i2] = null;
                        h(i2);
                    }
                    i2++;
                }
            }
        }
        iwrVar.a();
    }

    public final void h(int i2) throws IllegalArgumentException {
        if (i2 == 0) {
            if (this.f) {
                this.f = false;
                r(i2, 0, 2, null);
                return;
            }
            return;
        }
        if (i2 == 1 && this.e) {
            this.e = false;
            r(i2, 0, 0, null);
        }
    }

    @Override // defpackage.qxa
    public final void i(qxd qxdVar, int i2, int i3, int i4) throws IllegalArgumentException {
        this.k.aj();
        int iN = n(i2, i3);
        if ((393216 & iN) == 0) {
            throw new IllegalArgumentException("not writable, category:" + i2 + " key:" + i3 + " keytype:" + Integer.toHexString(iN));
        }
        if ((iN & 1) != 0) {
            r(i2, i3, i4, o(qxdVar, i2));
            return;
        }
        throw new IllegalArgumentException("not int type, category:" + i2 + " key:" + i3 + " keytype:" + Integer.toHexString(iN));
    }

    @Override // defpackage.qxa
    public final void j(qxd qxdVar) {
        synchronized (this.a) {
            iwr iwrVarA = a(qxdVar);
            if (iwrVarA != null) {
                g(iwrVarA);
            }
        }
    }

    @Override // defpackage.qxa
    public final boolean k(qxd qxdVar, int i2) throws IllegalArgumentException {
        iwr iwrVar;
        boolean z;
        jew jewVar = this.k;
        jewVar.aj();
        s(i2);
        iwr iwrVarP = p(qxdVar);
        if (!jewVar.bt() && i2 != 1) {
            throw new SecurityException("Disallowed category");
        }
        synchronized (this.a) {
            iwr[] iwrVarArr = this.c;
            iwrVar = iwrVarArr[i2];
            z = false;
            if (iwrVar == null) {
                iwrVarArr[i2] = iwrVarP;
            } else if (iwrVar != iwrVarP) {
                jet jetVar = this.j;
                int callingPid = Binder.getCallingPid();
                iob iobVarN = ((ima) jetVar).n();
                if ((iobVarN == null || !iobVarN.ao(callingPid)) && (!jetVar.bu(Binder.getCallingPid()) || jetVar.bu(iwrVar.b))) {
                    throw new IllegalStateException("already taken by " + Arrays.toString(this.l.getPackageManager().getPackagesForUid(iwrVarP.c)));
                }
                iwrVarArr[i2] = iwrVarP;
                z = true;
            }
        }
        if (z) {
            iwrVar.getClass();
            try {
                iwrVar.a.f(i2);
            } catch (RemoteException unused) {
                g(iwrVar);
            }
            synchronized (this.a) {
                h(i2);
            }
        }
        return true;
    }

    @Override // defpackage.qxa
    public final int[] l(qxd qxdVar, int i2, int i3) throws IllegalArgumentException {
        Integer num;
        this.k.aj();
        int iN = n(i2, i3);
        if ((65536 & iN) == 0) {
            throw new IllegalArgumentException("not readable, category:" + i2 + " key:" + i3 + " keytype:" + Integer.toHexString(iN));
        }
        if ((iN & 1) != 0) {
            o(qxdVar, i2);
            synchronized (this.a) {
                num = (Integer) this.m.get(Long.valueOf(t(i2, i3)));
            }
            if (num != null) {
                return new int[]{num.intValue()};
            }
            return null;
        }
        throw new IllegalArgumentException("not int type, category:" + i2 + " key:" + i3 + " keytype:" + Integer.toHexString(iN));
    }

    public final void m(int i2, int i3) {
        iwr iwrVar;
        Integer numValueOf;
        synchronized (this.a) {
            iwrVar = this.c[i2];
            HashMap map = this.m;
            Long lValueOf = Long.valueOf(t(i2, 0));
            numValueOf = Integer.valueOf(i3);
            map.put(lValueOf, numValueOf);
        }
        if (iwrVar == null) {
            ((ype) ((ype) h.f()).ai(1494)).R("No receiver for message from car, category:%d key:%d value:%d", Integer.valueOf(i2), 0, numValueOf);
            return;
        }
        try {
            ((ype) h.l().ai(1493)).R("Notify message from car, category:%d key:%d value:%d", Integer.valueOf(i2), 0, numValueOf);
            iwrVar.a.e(i2, 0, i3);
        } catch (RemoteException unused) {
            g(iwrVar);
        }
    }
}
