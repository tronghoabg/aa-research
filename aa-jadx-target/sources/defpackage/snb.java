package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class snb implements defpackage.slx, defpackage.sly {
    public final defpackage.slr b;
    public final defpackage.smo c;
    public java.util.Set f;
    public final int g;
    public boolean h;
    public final /* synthetic */ defpackage.snf l;
    public final defpackage.rkq m;
    private final snw n;
    private volatile com.google.android.gms.common.internal.ConnectionThrottlingConfig o;
    public final java.util.Queue a = new java.util.LinkedList();
    public final java.util.Set d = new java.util.HashSet();
    public final java.util.Map e = new java.util.HashMap();
    public final java.util.List i = new java.util.ArrayList();
    public com.google.android.gms.common.ConnectionResult j = null;
    public int k = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public snb(defpackage.snf snfVar, defpackage.slw slwVar) {
        this.l = snfVar;
        android.os.Looper looper = snfVar.q.getLooper();
        defpackage.som somVarA = slwVar.t().a();
        defpackage.slr slrVarB = ((defpackage.sqs) slwVar.k.a).b(slwVar.b, looper, somVarA, slwVar.e, this, this);
        defpackage.sqw sqwVar = slwVar.d;
        if (sqwVar != null) {
            ((defpackage.sok) slrVarB).k = sqwVar;
        } else {
            java.lang.String str = slwVar.c;
            if (str != null) {
                ((defpackage.sok) slrVarB).j = str;
            }
        }
        this.b = slrVarB;
        this.c = slwVar.f;
        this.m = new defpackage.rkq((byte[]) null, (byte[]) null);
        this.g = slwVar.h;
        if (slrVarB.i()) {
            this.n = new snw(snfVar.g, snfVar.q, slwVar.t().a());
        } else {
            this.n = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final com.google.android.gms.common.Feature r(com.google.android.gms.common.Feature[] featureArr) {
        if (featureArr != null) {
            com.google.android.gms.common.Feature[] featureArrR = this.b.r();
            if (featureArrR == null) {
                featureArrR = new com.google.android.gms.common.Feature[0];
            }
            defpackage.zd zdVar = new defpackage.zd(featureArrR.length);
            for (com.google.android.gms.common.Feature feature : featureArrR) {
                zdVar.put(feature.a, java.lang.Long.valueOf(feature.a()));
            }
            for (int i = 0; i <= 0; i++) {
                com.google.android.gms.common.Feature feature2 = featureArr[i];
                java.lang.Long l = (java.lang.Long) zdVar.get(feature2.a);
                if (l == null || l.longValue() < feature2.a()) {
                    return feature2;
                }
            }
        }
        return null;
    }

    private final com.google.android.gms.common.api.Status s(com.google.android.gms.common.ConnectionResult connectionResult) {
        return defpackage.snf.a(this.c, connectionResult);
    }

    private final void t(com.google.android.gms.common.ConnectionResult connectionResult) {
        java.util.Set set = this.d;
        java.util.Iterator it = set.iterator();
        while (it.hasNext()) {
            ((smp) it.next()).a(this.c, connectionResult, j$.util.Objects.equals(connectionResult, com.google.android.gms.common.ConnectionResult.a) ? this.b.k() : null);
        }
        set.clear();
    }

    private final void u(com.google.android.gms.common.api.Status status, java.lang.Exception exc, boolean z) {
        defpackage.sqs.as(this.l.q);
        if ((status == null) == (exc == null)) {
            throw new java.lang.IllegalArgumentException("Status XOR exception should be null");
        }
        java.util.Iterator it = this.a.iterator();
        while (it.hasNext()) {
            defpackage.smn smnVar = (defpackage.smn) it.next();
            if (!z || smnVar.c == 2) {
                if (status != null) {
                    smnVar.f(status);
                } else {
                    smnVar.g(exc);
                }
                it.remove();
            }
        }
    }

    private final void v(defpackage.smn smnVar) {
        smnVar.i(this.m, q());
        try {
            smnVar.h(this);
        } catch (android.os.DeadObjectException unused) {
            b(1);
            this.b.o("DeadObjectException thrown while running ApiCallRunner.");
        }
    }

    private final boolean w(defpackage.smn smnVar) {
        y(smnVar);
        if (!(smnVar instanceof defpackage.smh)) {
            v(smnVar);
            return true;
        }
        defpackage.smh smhVar = (defpackage.smh) smnVar;
        com.google.android.gms.common.Feature featureR = r(smhVar.d(this));
        if (featureR == null) {
            v(smnVar);
            return true;
        }
        java.lang.String name = this.b.getClass().getName();
        long jA = featureR.a();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(name);
        sb.append(" could not execute call because it requires feature (");
        java.lang.String str = featureR.a;
        sb.append(str);
        sb.append(", ");
        sb.append(jA);
        sb.append(").");
        android.util.Log.w("GoogleApiManager", sb.toString());
        defpackage.snf snfVar = this.l;
        if (!snfVar.r || !smhVar.c(this)) {
            smhVar.g(new defpackage.smg(featureR));
            return true;
        }
        int iA = smhVar.a(this);
        snc sncVar = new snc(this.c, featureR);
        java.util.List list = this.i;
        int iIndexOf = list.indexOf(sncVar);
        if (iIndexOf >= 0) {
            snc sncVar2 = (snc) list.get(iIndexOf);
            android.os.Handler handler = snfVar.q;
            handler.removeMessages(15, sncVar2);
            handler.sendMessageDelayed(android.os.Message.obtain(handler, 15, sncVar2), 5000L);
            return false;
        }
        list.add(sncVar);
        android.os.Handler handler2 = snfVar.q;
        handler2.sendMessageDelayed(android.os.Message.obtain(handler2, 15, sncVar), 5000L);
        handler2.sendMessageDelayed(android.os.Message.obtain(handler2, 16, sncVar), 120000L);
        com.google.android.gms.common.ConnectionResult connectionResult = new com.google.android.gms.common.ConnectionResult(1, 2, null, null, java.lang.Integer.valueOf(iA));
        if (x(connectionResult)) {
            android.util.Log.w("GoogleApiManager", "A dialog should be displayed for missing feature: " + str + ", version: " + featureR.a());
            return false;
        }
        if (!snfVar.h(connectionResult, this.g)) {
            return false;
        }
        android.util.Log.w("GoogleApiManager", "Notification displayed for missing feature: " + str + ", version: " + featureR.a());
        return false;
    }

    private final boolean x(com.google.android.gms.common.ConnectionResult connectionResult) {
        synchronized (defpackage.snf.c) {
            defpackage.snf snfVar = this.l;
            if (snfVar.l == null || !snfVar.m.contains(this.c)) {
                return false;
            }
            smz smzVar = snfVar.l;
            acku ackuVar = new acku(connectionResult, this.g);
            if (defpackage.a.o(((smt) smzVar).b, ackuVar)) {
                ((smt) smzVar).c.post(new rhl(smzVar, ackuVar, 2));
            }
            return true;
        }
    }

    private final void y(defpackage.smn smnVar) {
        com.google.android.gms.common.internal.ConnectionThrottlingConfig connectionThrottlingConfig;
        defpackage.smh smhVar;
        int iA;
        int maxInflight;
        if (smnVar.d || smnVar.e || (connectionThrottlingConfig = this.o) == null || !(smnVar instanceof defpackage.smh) || (iA = (smhVar = (defpackage.smh) smnVar).a(this)) == 0) {
            return;
        }
        defpackage.snf snfVar = this.l;
        android.util.SparseArray sparseArray = connectionThrottlingConfig.a;
        defpackage.erh erhVarJ = snfVar.j();
        com.google.android.gms.libs.throttling.ThrottlingLimits throttlingLimits = (com.google.android.gms.libs.throttling.ThrottlingLimits) sparseArray.get(iA, (com.google.android.gms.libs.throttling.ThrottlingLimits) sparseArray.get(0));
        if (throttlingLimits == null) {
            maxInflight = Integer.MIN_VALUE;
        } else {
            java.lang.Object obj = erhVarJ.a;
            long j = iA;
            int maxInflight2 = throttlingLimits.getMaxInflight();
            if (maxInflight2 > 0) {
                java.lang.Object obj2 = ((ajli) obj).b;
                synchronized (obj2) {
                    long[] jArr = (long[]) ((android.util.LongSparseArray) obj2).get(j);
                    if (jArr != null) {
                        long j2 = jArr[0];
                        long j3 = ((ajli) obj).a + 1;
                        ((ajli) obj).a = j3;
                        jArr[1] = j3;
                        if (j2 < maxInflight2) {
                            jArr[0] = j2 + 1;
                        }
                    } else {
                        if (((android.util.LongSparseArray) obj2).size() >= 2000) {
                            int size = ((android.util.LongSparseArray) obj2).size();
                            long j4 = Long.MAX_VALUE;
                            int i = 0;
                            for (int i2 = 0; i2 < size; i2++) {
                                long j5 = ((long[]) ((android.util.LongSparseArray) obj2).valueAt(i2))[1];
                                if (j5 < j4) {
                                    j4 = j5;
                                }
                                if (j5 < j4) {
                                    i = i2;
                                }
                            }
                            ((android.util.LongSparseArray) obj2).removeAt(i);
                        }
                        long j6 = ((ajli) obj).a + 1;
                        ((ajli) obj).a = j6;
                        ((android.util.LongSparseArray) obj2).put(j, new long[]{1, j6});
                    }
                    maxInflight = Integer.MIN_VALUE;
                }
            }
            maxInflight = throttlingLimits.getMaxInflight();
        }
        if (maxInflight != Integer.MIN_VALUE) {
            android.util.Log.i("GoogleApiManager", defpackage.a.bn(maxInflight, iA, "Call throttled for method key: ", " with limit: "));
            android.os.Handler handler = this.l.q;
            handler.sendMessage(handler.obtainMessage(21, iA, maxInflight));
            smnVar.e = true;
            return;
        }
        smnVar.d = true;
        if (this.f == null) {
            this.f = new java.util.HashSet();
        }
        this.f.add(smhVar);
        defpackage.snf snfVar2 = this.l;
        android.os.Handler handler2 = snfVar2.q;
        handler2.getClass();
        smhVar.b(new defpackage.czu(handler2, 10), new sne(this, snfVar2.j(), smhVar, iA));
    }

    @Override // defpackage.smx
    public final void a(android.os.Bundle bundle) {
        android.os.Looper looperMyLooper = android.os.Looper.myLooper();
        android.os.Handler handler = this.l.q;
        if (looperMyLooper == handler.getLooper()) {
            h(bundle);
        } else {
            handler.post(new sbj(this, bundle, 9));
        }
    }

    @Override // defpackage.smx
    public final void b(int i) {
        android.os.Looper looperMyLooper = android.os.Looper.myLooper();
        android.os.Handler handler = this.l.q;
        if (looperMyLooper == handler.getLooper()) {
            k(i);
        } else {
            handler.post(new defpackage.rhh(this, i, 10));
        }
    }

    public final void c() {
        defpackage.sqs.as(this.l.q);
        this.j = null;
    }

    public final void d() {
        int iL;
        defpackage.snf snfVar = this.l;
        defpackage.sqs.as(snfVar.q);
        defpackage.slr slrVar = this.b;
        if (slrVar.p() || slrVar.q()) {
            return;
        }
        try {
            defpackage.wdm wdmVar = snfVar.s;
            android.content.Context context = snfVar.g;
            if (context == null) {
                throw new java.lang.NullPointerException("null reference");
            }
            if (slrVar == null) {
                throw new java.lang.NullPointerException("null reference");
            }
            int iA = slrVar.a();
            int iE = wdmVar.e(iA);
            if (iE == -1) {
                java.lang.Object obj = wdmVar.b;
                synchronized (obj) {
                    int i = 0;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= ((android.util.SparseIntArray) obj).size()) {
                            i = -1;
                            break;
                        }
                        int iKeyAt = ((android.util.SparseIntArray) obj).keyAt(i2);
                        if (iKeyAt > iA && ((android.util.SparseIntArray) obj).get(iKeyAt) == 0) {
                            break;
                        } else {
                            i2++;
                        }
                    }
                    iL = i == -1 ? ((defpackage.sks) wdmVar.a).l(context, iA) : i;
                    ((android.util.SparseIntArray) obj).put(iA, iL);
                }
                iE = iL;
            }
            if (iE != 0) {
                com.google.android.gms.common.ConnectionResult connectionResult = new com.google.android.gms.common.ConnectionResult(1, iE, null, null, null);
                android.util.Log.w("GoogleApiManager", "The service for " + this.b.getClass().getName() + " is not available: " + connectionResult.toString());
                j(connectionResult, null);
                return;
            }
            defpackage.snf snfVar2 = this.l;
            defpackage.slr slrVar2 = this.b;
            defpackage.snd sndVar = new defpackage.snd(snfVar2, slrVar2, this.c);
            if (slrVar2.i()) {
                snw snwVar = this.n;
                if (snwVar == null) {
                    throw new java.lang.NullPointerException("null reference");
                }
                swh swhVar = snwVar.e;
                if (swhVar != null) {
                    swhVar.y();
                }
                defpackage.som somVar = snwVar.d;
                somVar.h = java.lang.Integer.valueOf(java.lang.System.identityHashCode(snwVar));
                defpackage.sqs sqsVar = snwVar.g;
                android.content.Context context2 = snwVar.a;
                android.os.Handler handler = snwVar.b;
                snwVar.e = sqsVar.b(context2, handler.getLooper(), somVar, somVar.g, snwVar, snwVar);
                snwVar.f = sndVar;
                java.util.Set set = snwVar.c;
                if (set == null || set.isEmpty()) {
                    handler.post(new defpackage.sho(snwVar, 12, null));
                } else {
                    swh swhVar2 = snwVar.e;
                    swhVar2.n(new soh(swhVar2));
                }
            }
            try {
                slrVar2.n(sndVar);
            } catch (java.lang.SecurityException e) {
                j(new com.google.android.gms.common.ConnectionResult(1, 10, null, null, null), e);
            }
        } catch (java.lang.IllegalStateException e2) {
            j(new com.google.android.gms.common.ConnectionResult(1, 10, null, null, null), e2);
        }
    }

    public final void e(defpackage.smn smnVar) {
        defpackage.sqs.as(this.l.q);
        y(smnVar);
        if (this.b.p()) {
            if (w(smnVar)) {
                n();
                return;
            } else {
                this.a.add(smnVar);
                return;
            }
        }
        java.util.Queue queue = this.a;
        if (queue.size() >= 1000) {
            smnVar.f(new com.google.android.gms.common.api.Status(8, "Pending API call limit exceeded", null, null));
            return;
        }
        queue.add(smnVar);
        com.google.android.gms.common.ConnectionResult connectionResult = this.j;
        if (connectionResult == null || !connectionResult.b()) {
            d();
        } else {
            j(connectionResult, null);
        }
    }

    public final void f(com.google.android.gms.common.api.Status status) {
        defpackage.sqs.as(this.l.q);
        u(status, null, false);
    }

    public final void g() {
        java.util.Queue queue = this.a;
        java.util.ArrayList arrayList = new java.util.ArrayList(queue);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            defpackage.smn smnVar = (defpackage.smn) arrayList.get(i);
            if (!this.b.p()) {
                return;
            }
            if (w(smnVar)) {
                queue.remove(smnVar);
            }
        }
    }

    public final void h(android.os.Bundle bundle) {
        c();
        t(com.google.android.gms.common.ConnectionResult.a);
        p();
        if (bundle == null || !bundle.containsKey("com.google.android.gms.common.internal.CONNECTION_THROTTLING_CONFIG")) {
            this.o = null;
        } else {
            byte[] byteArray = bundle.getByteArray("com.google.android.gms.common.internal.CONNECTION_THROTTLING_CONFIG");
            this.o = byteArray != null ? (com.google.android.gms.common.internal.ConnectionThrottlingConfig) defpackage.sqs.l(byteArray, com.google.android.gms.common.internal.ConnectionThrottlingConfig.CREATOR) : null;
        }
        java.util.Iterator it = this.e.values().iterator();
        while (it.hasNext()) {
            java.lang.Object obj = ((rkn) it.next()).b;
            if (r(((snt) obj).b) != null) {
                it.remove();
            } else {
                try {
                    ((snt) obj).b(this.b, new defpackage.lhe((char[]) null));
                } catch (android.os.DeadObjectException unused) {
                    b(3);
                    this.b.o("DeadObjectException thrown while calling register listener method.");
                } catch (android.os.RemoteException e) {
                    e = e;
                    android.util.Log.e("GoogleApiManager", "Failed to register listener on re-connection.", e);
                    it.remove();
                } catch (java.lang.RuntimeException e2) {
                    e = e2;
                    android.util.Log.e("GoogleApiManager", "Failed to register listener on re-connection.", e);
                    it.remove();
                }
            }
        }
        g();
        n();
    }

    @Override // defpackage.snr
    public final void i(com.google.android.gms.common.ConnectionResult connectionResult) {
        j(connectionResult, null);
    }

    public final void j(com.google.android.gms.common.ConnectionResult connectionResult, java.lang.Exception exc) {
        swh swhVar;
        defpackage.snf snfVar = this.l;
        android.os.Handler handler = snfVar.q;
        defpackage.sqs.as(handler);
        snw snwVar = this.n;
        if (snwVar != null && (swhVar = snwVar.e) != null) {
            swhVar.y();
        }
        c();
        snfVar.s.d();
        t(connectionResult);
        if ((this.b instanceof sqc) && connectionResult.c != 24) {
            snfVar.f = true;
            handler.sendMessageDelayed(handler.obtainMessage(19), 300000L);
        }
        int i = connectionResult.c;
        if (i == 4) {
            f(defpackage.snf.b);
            return;
        }
        if (i == 25) {
            f(s(connectionResult));
            return;
        }
        java.util.Queue queue = this.a;
        if (queue.isEmpty()) {
            this.j = connectionResult;
            return;
        }
        if (exc != null) {
            defpackage.sqs.as(handler);
            u(null, exc, false);
            return;
        }
        if (!snfVar.r) {
            f(s(connectionResult));
            return;
        }
        u(s(connectionResult), null, true);
        if (queue.isEmpty() || x(connectionResult) || snfVar.h(connectionResult, this.g)) {
            return;
        }
        if (i == 18) {
            this.h = true;
        }
        if (this.h) {
            handler.sendMessageDelayed(android.os.Message.obtain(handler, 9, this.c), 5000L);
        } else {
            f(s(connectionResult));
        }
    }

    public final void k(int i) {
        c();
        this.h = true;
        defpackage.slr slrVar = this.b;
        java.lang.String strL = slrVar.l();
        java.lang.StringBuilder sb = new java.lang.StringBuilder("The connection to Google Play services was lost");
        if (i == 1) {
            sb.append(" due to service disconnection.");
        } else if (i == 3) {
            sb.append(" due to dead object exception.");
        }
        if (strL != null) {
            sb.append(" Last reason for disconnect: ");
            sb.append(strL);
        }
        this.m.p(true, new com.google.android.gms.common.api.Status(20, sb.toString(), null, null));
        com.google.android.gms.common.api.Status status = new com.google.android.gms.common.api.Status(20, "Connection suspended: ".concat(java.lang.String.valueOf(slrVar.l())), null, null);
        java.util.Set set = this.f;
        if (set != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList(set);
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                defpackage.smh smhVar = (defpackage.smh) arrayList.get(i2);
                smhVar.g(new defpackage.sls(status));
                this.a.remove(smhVar);
            }
        }
        defpackage.snf snfVar = this.l;
        defpackage.smo smoVar = this.c;
        android.os.Handler handler = snfVar.q;
        handler.sendMessageDelayed(android.os.Message.obtain(handler, 9, smoVar), 5000L);
        handler.sendMessageDelayed(android.os.Message.obtain(handler, 11, smoVar), 120000L);
        snfVar.s.d();
        java.util.Iterator it = this.e.values().iterator();
        while (it.hasNext()) {
            java.lang.Object obj = ((rkn) it.next()).a;
        }
    }

    public final void l(com.google.android.gms.common.ConnectionResult connectionResult) {
        defpackage.sqs.as(this.l.q);
        defpackage.slr slrVar = this.b;
        slrVar.o("onSignInFailed for " + slrVar.getClass().getName() + " with " + java.lang.String.valueOf(connectionResult));
        j(connectionResult, null);
    }

    final void m(defpackage.smh smhVar) {
        defpackage.sqs.as(this.l.q);
        java.util.Set set = this.f;
        if (set != null) {
            set.remove(smhVar);
            if (this.f.isEmpty()) {
                this.f = null;
            }
        }
    }

    public final void n() {
        defpackage.snf snfVar = this.l;
        android.os.Handler handler = snfVar.q;
        defpackage.smo smoVar = this.c;
        handler.removeMessages(12, smoVar);
        handler.sendMessageDelayed(handler.obtainMessage(12, smoVar), snfVar.e);
    }

    public final void o() {
        defpackage.sqs.as(this.l.q);
        com.google.android.gms.common.api.Status status = defpackage.snf.a;
        f(status);
        this.m.p(false, status);
        for (snm snmVar : (snm[]) this.e.keySet().toArray(new snm[0])) {
            e(new smm(snmVar, new defpackage.lhe((char[]) null)));
        }
        t(new com.google.android.gms.common.ConnectionResult(1, 4, null, null, null));
        defpackage.slr slrVar = this.b;
        if (slrVar.p()) {
            slrVar.t(new defpackage.xei(this));
        }
    }

    public final void p() {
        if (this.h) {
            defpackage.snf snfVar = this.l;
            defpackage.smo smoVar = this.c;
            android.os.Handler handler = snfVar.q;
            handler.removeMessages(11, smoVar);
            handler.removeMessages(9, smoVar);
            this.h = false;
        }
    }

    public final boolean q() {
        return this.b.i();
    }
}
