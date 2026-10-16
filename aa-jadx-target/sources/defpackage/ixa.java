package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ixa extends defpackage.qxv implements defpackage.izw {
    public static final /* synthetic */ int g = 0;
    private static final defpackage.yqm h = defpackage.yqm.c("CAR.MSG");
    private static final int[][] i = {new int[]{131073}, new int[]{327681}, new int[]{65537}};
    public defpackage.jaa b;
    private final defpackage.jfb j;
    private final defpackage.jfe k;
    private final android.content.Context l;
    private final defpackage.iyb n;
    public final java.lang.Object a = new java.lang.Object();
    public final defpackage.iwz[] c = new defpackage.iwz[3];
    public final java.util.LinkedList d = new java.util.LinkedList();
    private final java.util.HashMap m = new java.util.HashMap();
    public boolean e = false;
    public boolean f = false;

    public ixa(defpackage.jfb jfbVar, defpackage.jfe jfeVar, android.content.Context context) {
        this.j = jfbVar;
        this.k = jfeVar;
        this.l = context;
        this.n = new defpackage.iyb(context);
    }

    public static final int n(int i2, int i3) throws java.lang.IllegalArgumentException {
        s(i2);
        int[] iArr = i[i2];
        if (i3 < 0 || i3 >= iArr.length) {
            throw new java.lang.IllegalArgumentException(defpackage.a.bn(i2, i3, "wrong key ", " for given category "));
        }
        return iArr[i3];
    }

    private final defpackage.iwz o(qxz qxzVar, int i2) {
        defpackage.iwz iwzVar;
        synchronized (this.a) {
            defpackage.iwz iwzVarP = p(qxzVar);
            iwzVar = this.c[i2];
            if (iwzVar == null) {
                throw new java.lang.IllegalStateException("not owned");
            }
            if (iwzVar != iwzVarP) {
                throw new java.lang.IllegalStateException("not owned");
            }
        }
        return iwzVar;
    }

    private final defpackage.iwz p(qxz qxzVar) {
        defpackage.iwz iwzVarA = a(qxzVar);
        if (iwzVarA != null) {
            return iwzVarA;
        }
        throw new java.lang.IllegalStateException("not registered");
    }

    private final void q() {
        this.n.c();
    }

    private final void r(int i2, int i3, int i4, defpackage.iwz iwzVar) throws java.lang.IllegalArgumentException {
        java.lang.Integer numValueOf = java.lang.Integer.valueOf(i2);
        if (i2 == 0) {
            if (i3 == 0) {
                if (i4 != 1 && i4 != 2) {
                    throw new java.lang.IllegalArgumentException("Unknown value, category:" + i2 + " key:0 value:" + i4);
                }
                ((defpackage.yqj) ((defpackage.yqj) h.f()).ai(1498)).R("sending voice session message to car, category:%d key:%d value:%d", numValueOf, 0, java.lang.Integer.valueOf(i4));
                java.lang.Object obj = this.a;
                boolean z = i4 == 1;
                synchronized (obj) {
                    this.f = z;
                    defpackage.jaa jaaVar = this.b;
                    jaaVar.getClass();
                    jaaVar.f(defpackage.wva.s(i4));
                }
                return;
            }
            return;
        }
        if (i2 == 1 && i3 == 0) {
            if (i4 != 1) {
                if (i4 != 0) {
                    throw new java.lang.IllegalArgumentException("Unknown value, category:" + i2 + " key:0 value:" + i4);
                }
                q();
                synchronized (this.a) {
                    java.lang.Object obj2 = this.b;
                    obj2.getClass();
                    defpackage.abor aborVarN = xly.a.n();
                    xlz xlzVar = xlz.a;
                    aborVarN.t();
                    xly xlyVar = aborVarN.b;
                    xlyVar.c = xlzVar.c;
                    xlyVar.b |= 1;
                    ((defpackage.jbq) obj2).k(13, (xly) aborVarN.q());
                    this.e = false;
                }
                return;
            }
            if (iwzVar != null) {
                defpackage.jfb jfbVar = this.j;
                int i5 = iwzVar.b;
                defpackage.ioh iohVarN = ((defpackage.imi) jfbVar).n();
                android.content.ComponentName componentNameB = iohVarN != null ? iohVarN.b(i5) : null;
                if (componentNameB != null) {
                    this.n.d(componentNameB);
                }
            }
            synchronized (this.a) {
                java.lang.Object obj3 = this.b;
                obj3.getClass();
                defpackage.jab.a.l().ai(1701).u("requesting navigation focus");
                defpackage.abor aborVarN2 = xly.a.n();
                xlz xlzVar2 = xlz.b;
                aborVarN2.t();
                xly xlyVar2 = aborVarN2.b;
                xlyVar2.c = xlzVar2.c;
                xlyVar2.b |= 1;
                ((defpackage.jbq) obj3).k(13, (xly) aborVarN2.q());
                this.e = true;
            }
        }
    }

    private static final void s(int i2) throws java.lang.IllegalArgumentException {
        if (i2 >= 0) {
            int length = i.length;
            if (i2 < 3) {
                return;
            }
        }
        throw new java.lang.IllegalArgumentException(defpackage.a.bo(i2, "wrong category "));
    }

    private static final long t(int i2, int i3) {
        return ((long) i3) | (((long) i2) << 32);
    }

    public final defpackage.iwz a(qxz qxzVar) {
        android.os.IBinder iBinderAsBinder = qxzVar.asBinder();
        synchronized (this.a) {
            for (defpackage.iwz iwzVar : this.d) {
                if (iwzVar.a.asBinder() == iBinderAsBinder) {
                    return iwzVar;
                }
            }
            return null;
        }
    }

    @Override // defpackage.izw
    public final void b(boolean z) {
        m(1, z ? 1 : 0);
        if (z) {
            return;
        }
        q();
    }

    @Override // defpackage.qxw
    public final void c(qxz qxzVar) {
        this.k.aj();
        synchronized (this.a) {
            if (a(qxzVar) != null) {
                throw new java.lang.IllegalStateException("already registered");
            }
            defpackage.iwz iwzVar = new defpackage.iwz(this, qxzVar);
            try {
                qxzVar.asBinder().linkToDeath(iwzVar, 0);
                iwzVar.b = android.os.Binder.getCallingPid();
                iwzVar.c = android.os.Binder.getCallingUid();
                this.d.add(iwzVar);
            } catch (android.os.RemoteException unused) {
                ((defpackage.yqj) ((defpackage.yqj) h.h()).ai(1495)).u("client already dead?");
            }
        }
    }

    @Override // defpackage.qxw
    public final void d(qxz qxzVar) {
        this.k.aj();
        java.lang.Object obj = this.a;
        defpackage.iwz iwzVarP = p(qxzVar);
        synchronized (obj) {
            int i2 = 0;
            while (true) {
                defpackage.iwz[] iwzVarArr = this.c;
                int length = iwzVarArr.length;
                if (i2 < 3) {
                    if (iwzVarArr[i2] == iwzVarP) {
                        iwzVarArr[i2] = null;
                    }
                    i2++;
                }
            }
        }
    }

    @Override // defpackage.qxw
    public final void f(qxz qxzVar, int i2) {
        this.k.aj();
        s(i2);
        java.lang.Object obj = this.a;
        defpackage.iwz iwzVarP = p(qxzVar);
        synchronized (obj) {
            defpackage.iwz[] iwzVarArr = this.c;
            if (iwzVarArr[i2] == iwzVarP) {
                iwzVarArr[i2] = null;
            } else {
                ((defpackage.yqj) ((defpackage.yqj) h.h()).ai(1496)).u("Tried to release unowned category");
            }
        }
    }

    public final void g(defpackage.iwz iwzVar) {
        synchronized (this.a) {
            this.d.remove(iwzVar);
            int i2 = 0;
            while (true) {
                defpackage.iwz[] iwzVarArr = this.c;
                int length = iwzVarArr.length;
                if (i2 < 3) {
                    if (iwzVarArr[i2] == iwzVar) {
                        iwzVarArr[i2] = null;
                        h(i2);
                    }
                    i2++;
                }
            }
        }
        iwzVar.a();
    }

    public final void h(int i2) {
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

    @Override // defpackage.qxw
    public final void i(qxz qxzVar, int i2, int i3, int i4) {
        this.k.aj();
        int iN = n(i2, i3);
        if ((393216 & iN) == 0) {
            throw new java.lang.IllegalArgumentException("not writable, category:" + i2 + " key:" + i3 + " keytype:" + java.lang.Integer.toHexString(iN));
        }
        if ((iN & 1) != 0) {
            r(i2, i3, i4, o(qxzVar, i2));
            return;
        }
        throw new java.lang.IllegalArgumentException("not int type, category:" + i2 + " key:" + i3 + " keytype:" + java.lang.Integer.toHexString(iN));
    }

    @Override // defpackage.qxw
    public final void j(qxz qxzVar) {
        synchronized (this.a) {
            defpackage.iwz iwzVarA = a(qxzVar);
            if (iwzVarA != null) {
                g(iwzVarA);
            }
        }
    }

    @Override // defpackage.qxw
    public final boolean k(qxz qxzVar, int i2) {
        defpackage.iwz iwzVar;
        boolean z;
        defpackage.jfe jfeVar = this.k;
        jfeVar.aj();
        s(i2);
        defpackage.iwz iwzVarP = p(qxzVar);
        if (!jfeVar.bt() && i2 != 1) {
            throw new java.lang.SecurityException("Disallowed category");
        }
        synchronized (this.a) {
            defpackage.iwz[] iwzVarArr = this.c;
            iwzVar = iwzVarArr[i2];
            z = false;
            if (iwzVar == null) {
                iwzVarArr[i2] = iwzVarP;
            } else if (iwzVar != iwzVarP) {
                defpackage.jfb jfbVar = this.j;
                int callingPid = android.os.Binder.getCallingPid();
                defpackage.ioh iohVarN = ((defpackage.imi) jfbVar).n();
                if ((iohVarN == null || !iohVarN.ao(callingPid)) && (!jfbVar.bu(android.os.Binder.getCallingPid()) || jfbVar.bu(iwzVar.b))) {
                    throw new java.lang.IllegalStateException("already taken by " + java.util.Arrays.toString(this.l.getPackageManager().getPackagesForUid(iwzVarP.c)));
                }
                iwzVarArr[i2] = iwzVarP;
                z = true;
            }
        }
        if (z) {
            iwzVar.getClass();
            try {
                iwzVar.a.f(i2);
            } catch (android.os.RemoteException unused) {
                g(iwzVar);
            }
            synchronized (this.a) {
                h(i2);
            }
        }
        return true;
    }

    @Override // defpackage.qxw
    public final int[] l(qxz qxzVar, int i2, int i3) {
        java.lang.Integer num;
        this.k.aj();
        int iN = n(i2, i3);
        if ((65536 & iN) == 0) {
            throw new java.lang.IllegalArgumentException("not readable, category:" + i2 + " key:" + i3 + " keytype:" + java.lang.Integer.toHexString(iN));
        }
        if ((iN & 1) != 0) {
            o(qxzVar, i2);
            synchronized (this.a) {
                num = (java.lang.Integer) this.m.get(java.lang.Long.valueOf(t(i2, i3)));
            }
            if (num != null) {
                return new int[]{num.intValue()};
            }
            return null;
        }
        throw new java.lang.IllegalArgumentException("not int type, category:" + i2 + " key:" + i3 + " keytype:" + java.lang.Integer.toHexString(iN));
    }

    public final void m(int i2, int i3) {
        defpackage.iwz iwzVar;
        java.lang.Integer numValueOf;
        synchronized (this.a) {
            iwzVar = this.c[i2];
            java.util.HashMap map = this.m;
            java.lang.Long lValueOf = java.lang.Long.valueOf(t(i2, 0));
            numValueOf = java.lang.Integer.valueOf(i3);
            map.put(lValueOf, numValueOf);
        }
        if (iwzVar == null) {
            ((defpackage.yqj) ((defpackage.yqj) h.f()).ai(1494)).R("No receiver for message from car, category:%d key:%d value:%d", java.lang.Integer.valueOf(i2), 0, numValueOf);
            return;
        }
        try {
            ((defpackage.yqj) h.l().ai(1493)).R("Notify message from car, category:%d key:%d value:%d", java.lang.Integer.valueOf(i2), 0, numValueOf);
            iwzVar.a.e(i2, 0, i3);
        } catch (android.os.RemoteException unused) {
            g(iwzVar);
        }
    }
}
