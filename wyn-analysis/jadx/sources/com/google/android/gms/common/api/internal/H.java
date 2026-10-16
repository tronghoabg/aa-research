package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseIntArray;
import ba.C1521a;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.AbstractC1732v;
import com.google.android.gms.common.internal.C1720i;
import com.google.android.gms.common.internal.C1733w;
import com.google.android.gms.internal.base.zau;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import x.C4412e;

/* loaded from: classes3.dex */
public final class H implements com.google.android.gms.common.api.m, com.google.android.gms.common.api.n {

    /* renamed from: b, reason: collision with root package name */
    public final com.google.android.gms.common.api.g f26455b;

    /* renamed from: c, reason: collision with root package name */
    public final C1688b f26456c;

    /* renamed from: d, reason: collision with root package name */
    public final D f26457d;

    /* renamed from: g, reason: collision with root package name */
    public final int f26460g;

    /* renamed from: h, reason: collision with root package name */
    public final U f26461h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f26462i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C1695i f26465m;

    /* renamed from: a, reason: collision with root package name */
    public final LinkedList f26454a = new LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public final HashSet f26458e = new HashSet();

    /* renamed from: f, reason: collision with root package name */
    public final HashMap f26459f = new HashMap();

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f26463j = new ArrayList();
    public d7.b k = null;

    /* renamed from: l, reason: collision with root package name */
    public int f26464l = 0;

    public H(C1695i c1695i, com.google.android.gms.common.api.l lVar) {
        this.f26465m = c1695i;
        com.google.android.gms.common.api.g gVarZab = lVar.zab(c1695i.f26543n.getLooper(), this);
        this.f26455b = gVarZab;
        this.f26456c = lVar.getApiKey();
        this.f26457d = new D();
        this.f26460g = lVar.zaa();
        if (!gVarZab.requiresSignIn()) {
            this.f26461h = null;
        } else {
            this.f26461h = lVar.zac(c1695i.f26535e, c1695i.f26543n);
        }
    }

    public final void a(d7.b bVar) {
        HashSet hashSet = this.f26458e;
        Iterator it = hashSet.iterator();
        if (!it.hasNext()) {
            hashSet.clear();
        } else {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (AbstractC1732v.m(bVar, d7.b.f34113f)) {
                this.f26455b.getEndpointPackageName();
            }
            throw null;
        }
    }

    public final void b(Status status) {
        AbstractC1732v.d(this.f26465m.f26543n);
        c(status, null, false);
    }

    public final void c(Status status, RuntimeException runtimeException, boolean z2) {
        AbstractC1732v.d(this.f26465m.f26543n);
        if ((status == null) == (runtimeException == null)) {
            throw new IllegalArgumentException("Status XOR exception should be null");
        }
        Iterator it = this.f26454a.iterator();
        while (it.hasNext()) {
            c0 c0Var = (c0) it.next();
            if (!z2 || c0Var.f26512a == 2) {
                if (status != null) {
                    c0Var.a(status);
                } else {
                    c0Var.b(runtimeException);
                }
                it.remove();
            }
        }
    }

    public final void d() {
        LinkedList linkedList = this.f26454a;
        ArrayList arrayList = new ArrayList(linkedList);
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            c0 c0Var = (c0) arrayList.get(i5);
            if (!this.f26455b.isConnected()) {
                return;
            }
            if (h(c0Var)) {
                linkedList.remove(c0Var);
            }
        }
    }

    public final void e() {
        com.google.android.gms.common.api.g gVar = this.f26455b;
        C1695i c1695i = this.f26465m;
        AbstractC1732v.d(c1695i.f26543n);
        this.k = null;
        a(d7.b.f34113f);
        if (this.f26462i) {
            zau zauVar = c1695i.f26543n;
            C1688b c1688b = this.f26456c;
            zauVar.removeMessages(11, c1688b);
            c1695i.f26543n.removeMessages(9, c1688b);
            this.f26462i = false;
        }
        Iterator it = this.f26459f.values().iterator();
        while (it.hasNext()) {
            AbstractC1706u abstractC1706u = ((P) it.next()).f26481a;
            try {
                ((InterfaceC1708w) ((S) abstractC1706u).f26485d.f7076c).accept(gVar, new TaskCompletionSource());
            } catch (DeadObjectException unused) {
                onConnectionSuspended(3);
                gVar.disconnect("DeadObjectException thrown while calling register listener method.");
            } catch (RemoteException unused2) {
                it.remove();
            }
        }
        d();
        g();
    }

    public final void f(int i5) {
        C1695i c1695i = this.f26465m;
        AbstractC1732v.d(c1695i.f26543n);
        this.k = null;
        this.f26462i = true;
        String lastDisconnectMessage = this.f26455b.getLastDisconnectMessage();
        D d3 = this.f26457d;
        d3.getClass();
        StringBuilder sb2 = new StringBuilder("The connection to Google Play services was lost");
        if (i5 == 1) {
            sb2.append(" due to service disconnection.");
        } else if (i5 == 3) {
            sb2.append(" due to dead object exception.");
        }
        if (lastDisconnectMessage != null) {
            sb2.append(" Last reason for disconnect: ");
            sb2.append(lastDisconnectMessage);
        }
        d3.a(new Status(20, sb2.toString(), null, null), true);
        zau zauVar = c1695i.f26543n;
        C1688b c1688b = this.f26456c;
        zauVar.sendMessageDelayed(Message.obtain(zauVar, 9, c1688b), 5000L);
        zau zauVar2 = c1695i.f26543n;
        zauVar2.sendMessageDelayed(Message.obtain(zauVar2, 11, c1688b), UnityAdsConstants.Timeout.INIT_TIMEOUT_MS);
        ((SparseIntArray) c1695i.f26537g.f19414b).clear();
        Iterator it = this.f26459f.values().iterator();
        while (it.hasNext()) {
            ((P) it.next()).f26483c.run();
        }
    }

    public final void g() {
        C1695i c1695i = this.f26465m;
        zau zauVar = c1695i.f26543n;
        C1688b c1688b = this.f26456c;
        zauVar.removeMessages(12, c1688b);
        zau zauVar2 = c1695i.f26543n;
        zauVar2.sendMessageDelayed(zauVar2.obtainMessage(12, c1688b), c1695i.f26531a);
    }

    public final boolean h(c0 c0Var) {
        if (c0Var instanceof L) {
            L l10 = (L) c0Var;
            d7.d[] dVarArrG = l10.g(this);
            d7.d dVar = null;
            if (dVarArrG != null && dVarArrG.length != 0) {
                d7.d[] availableFeatures = this.f26455b.getAvailableFeatures();
                if (availableFeatures == null) {
                    availableFeatures = new d7.d[0];
                }
                C4412e c4412e = new C4412e(availableFeatures.length);
                for (d7.d dVar2 : availableFeatures) {
                    c4412e.put(dVar2.f34122a, Long.valueOf(dVar2.V()));
                }
                for (d7.d dVar3 : dVarArrG) {
                    Long l11 = (Long) c4412e.get(dVar3.f34122a);
                    if (l11 == null || l11.longValue() < dVar3.V()) {
                        dVar = dVar3;
                        break;
                    }
                }
            }
            if (dVar != null) {
                Log.w("GoogleApiManager", this.f26455b.getClass().getName() + " could not execute call because it requires feature (" + dVar.f34122a + ", " + dVar.V() + ").");
                if (!this.f26465m.f26544o || !l10.f(this)) {
                    l10.b(new com.google.android.gms.common.api.x(dVar));
                    return true;
                }
                I i5 = new I(this.f26456c, dVar);
                int iIndexOf = this.f26463j.indexOf(i5);
                if (iIndexOf >= 0) {
                    I i10 = (I) this.f26463j.get(iIndexOf);
                    this.f26465m.f26543n.removeMessages(15, i10);
                    zau zauVar = this.f26465m.f26543n;
                    zauVar.sendMessageDelayed(Message.obtain(zauVar, 15, i10), 5000L);
                    return false;
                }
                this.f26463j.add(i5);
                zau zauVar2 = this.f26465m.f26543n;
                zauVar2.sendMessageDelayed(Message.obtain(zauVar2, 15, i5), 5000L);
                zau zauVar3 = this.f26465m.f26543n;
                zauVar3.sendMessageDelayed(Message.obtain(zauVar3, 16, i5), UnityAdsConstants.Timeout.INIT_TIMEOUT_MS);
                d7.b bVar = new d7.b(2, null, null);
                if (i(bVar)) {
                    return false;
                }
                this.f26465m.d(bVar, this.f26460g);
                return false;
            }
            com.google.android.gms.common.api.g gVar = this.f26455b;
            c0Var.d(this.f26457d, gVar.requiresSignIn());
            try {
                c0Var.c(this);
                return true;
            } catch (DeadObjectException unused) {
                onConnectionSuspended(1);
                gVar.disconnect("DeadObjectException thrown while running ApiCallRunner.");
            }
        } else {
            com.google.android.gms.common.api.g gVar2 = this.f26455b;
            c0Var.d(this.f26457d, gVar2.requiresSignIn());
            try {
                c0Var.c(this);
                return true;
            } catch (DeadObjectException unused2) {
                onConnectionSuspended(1);
                gVar2.disconnect("DeadObjectException thrown while running ApiCallRunner.");
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0040, code lost:
    
        if (r6.get() == null) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean i(d7.b r6) {
        /*
            r5 = this;
            java.lang.Object r0 = com.google.android.gms.common.api.internal.C1695i.f26529r
            monitor-enter(r0)
            com.google.android.gms.common.api.internal.i r1 = r5.f26465m     // Catch: java.lang.Throwable -> L45
            com.google.android.gms.common.api.internal.E r2 = r1.k     // Catch: java.lang.Throwable -> L45
            if (r2 == 0) goto L47
            x.f r1 = r1.f26541l     // Catch: java.lang.Throwable -> L45
            com.google.android.gms.common.api.internal.b r2 = r5.f26456c     // Catch: java.lang.Throwable -> L45
            boolean r1 = r1.contains(r2)     // Catch: java.lang.Throwable -> L45
            if (r1 == 0) goto L47
            com.google.android.gms.common.api.internal.i r1 = r5.f26465m     // Catch: java.lang.Throwable -> L45
            com.google.android.gms.common.api.internal.E r1 = r1.k     // Catch: java.lang.Throwable -> L45
            int r2 = r5.f26460g     // Catch: java.lang.Throwable -> L45
            r1.getClass()     // Catch: java.lang.Throwable -> L45
            com.google.android.gms.common.api.internal.d0 r3 = new com.google.android.gms.common.api.internal.d0     // Catch: java.lang.Throwable -> L45
            r3.<init>(r6, r2)     // Catch: java.lang.Throwable -> L45
        L21:
            java.util.concurrent.atomic.AtomicReference r6 = r1.f26446b     // Catch: java.lang.Throwable -> L45
        L23:
            r2 = 0
            boolean r2 = r6.compareAndSet(r2, r3)     // Catch: java.lang.Throwable -> L45
            if (r2 == 0) goto L36
            com.google.android.gms.internal.base.zau r6 = r1.f26447c     // Catch: java.lang.Throwable -> L45
            com.google.android.gms.common.api.internal.e0 r2 = new com.google.android.gms.common.api.internal.e0     // Catch: java.lang.Throwable -> L45
            r4 = 0
            r2.<init>(r4, r1, r3)     // Catch: java.lang.Throwable -> L45
            r6.post(r2)     // Catch: java.lang.Throwable -> L45
            goto L42
        L36:
            java.lang.Object r2 = r6.get()     // Catch: java.lang.Throwable -> L45
            if (r2 == 0) goto L23
            java.lang.Object r6 = r6.get()     // Catch: java.lang.Throwable -> L45
            if (r6 == 0) goto L21
        L42:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L45
            r6 = 1
            return r6
        L45:
            r6 = move-exception
            goto L4a
        L47:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L45
            r6 = 0
            return r6
        L4a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L45
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.H.i(d7.b):boolean");
    }

    public final boolean j(boolean z2) {
        AbstractC1732v.d(this.f26465m.f26543n);
        com.google.android.gms.common.api.g gVar = this.f26455b;
        if (!gVar.isConnected() || !this.f26459f.isEmpty()) {
            return false;
        }
        D d3 = this.f26457d;
        if (((Map) d3.f26443a).isEmpty() && ((Map) d3.f26444b).isEmpty()) {
            gVar.disconnect("Timing out service connection.");
            return true;
        }
        if (!z2) {
            return false;
        }
        g();
        return false;
    }

    public final void k() {
        C1695i c1695i = this.f26465m;
        AbstractC1732v.d(c1695i.f26543n);
        com.google.android.gms.common.api.g gVar = this.f26455b;
        if (gVar.isConnected() || gVar.isConnecting()) {
            return;
        }
        try {
            C1521a c1521a = c1695i.f26537g;
            Context context = c1695i.f26535e;
            c1521a.getClass();
            AbstractC1732v.i(context);
            int iD = 0;
            if (gVar.requiresGooglePlayServices()) {
                int minApkVersion = gVar.getMinApkVersion();
                SparseIntArray sparseIntArray = (SparseIntArray) c1521a.f19414b;
                int i5 = sparseIntArray.get(minApkVersion, -1);
                if (i5 != -1) {
                    iD = i5;
                } else {
                    int i10 = 0;
                    while (true) {
                        if (i10 >= sparseIntArray.size()) {
                            iD = -1;
                            break;
                        }
                        int iKeyAt = sparseIntArray.keyAt(i10);
                        if (iKeyAt > minApkVersion && sparseIntArray.get(iKeyAt) == 0) {
                            break;
                        } else {
                            i10++;
                        }
                    }
                    if (iD == -1) {
                        iD = ((d7.e) c1521a.f19415c).d(context, minApkVersion);
                    }
                    sparseIntArray.put(minApkVersion, iD);
                }
            }
            if (iD != 0) {
                d7.b bVar = new d7.b(iD, null, null);
                Log.w("GoogleApiManager", "The service for " + gVar.getClass().getName() + " is not available: " + bVar.toString());
                m(bVar, null);
                return;
            }
            F6.r rVar = new F6.r(c1695i, gVar, this.f26456c);
            if (gVar.requiresSignIn()) {
                U u10 = this.f26461h;
                AbstractC1732v.i(u10);
                F7.a aVar = u10.f26493f;
                if (aVar != null) {
                    aVar.disconnect();
                }
                Integer numValueOf = Integer.valueOf(System.identityHashCode(u10));
                C1720i c1720i = u10.f26492e;
                c1720i.f26651g = numValueOf;
                Handler handler = u10.f26489b;
                u10.f26493f = (F7.a) u10.f26490c.buildClient(u10.f26488a, handler.getLooper(), c1720i, (Object) c1720i.f26650f, (com.google.android.gms.common.api.m) u10, (com.google.android.gms.common.api.n) u10);
                u10.f26494g = rVar;
                Set set = u10.f26491d;
                if (set == null || set.isEmpty()) {
                    handler.post(new A7.V(u10, 28));
                } else {
                    F7.a aVar2 = u10.f26493f;
                    aVar2.getClass();
                    aVar2.connect(new C1733w(aVar2));
                }
            }
            try {
                gVar.connect(rVar);
            } catch (SecurityException e7) {
                m(new d7.b(10, null, null), e7);
            }
        } catch (IllegalStateException e10) {
            m(new d7.b(10, null, null), e10);
        }
    }

    public final void l(c0 c0Var) {
        AbstractC1732v.d(this.f26465m.f26543n);
        boolean zIsConnected = this.f26455b.isConnected();
        LinkedList linkedList = this.f26454a;
        if (zIsConnected) {
            if (h(c0Var)) {
                g();
                return;
            } else {
                linkedList.add(c0Var);
                return;
            }
        }
        linkedList.add(c0Var);
        d7.b bVar = this.k;
        if (bVar == null || bVar.f34115b == 0 || bVar.f34116c == null) {
            k();
        } else {
            m(bVar, null);
        }
    }

    public final void m(d7.b bVar, RuntimeException runtimeException) {
        F7.a aVar;
        AbstractC1732v.d(this.f26465m.f26543n);
        U u10 = this.f26461h;
        if (u10 != null && (aVar = u10.f26493f) != null) {
            aVar.disconnect();
        }
        AbstractC1732v.d(this.f26465m.f26543n);
        this.k = null;
        ((SparseIntArray) this.f26465m.f26537g.f19414b).clear();
        a(bVar);
        if ((this.f26455b instanceof g7.c) && bVar.f34115b != 24) {
            C1695i c1695i = this.f26465m;
            c1695i.f26532b = true;
            zau zauVar = c1695i.f26543n;
            zauVar.sendMessageDelayed(zauVar.obtainMessage(19), 300000L);
        }
        if (bVar.f34115b == 4) {
            b(C1695i.f26528q);
            return;
        }
        if (this.f26454a.isEmpty()) {
            this.k = bVar;
            return;
        }
        if (runtimeException != null) {
            AbstractC1732v.d(this.f26465m.f26543n);
            c(null, runtimeException, false);
            return;
        }
        if (!this.f26465m.f26544o) {
            b(C1695i.e(this.f26456c, bVar));
            return;
        }
        c(C1695i.e(this.f26456c, bVar), null, true);
        if (this.f26454a.isEmpty() || i(bVar) || this.f26465m.d(bVar, this.f26460g)) {
            return;
        }
        if (bVar.f34115b == 18) {
            this.f26462i = true;
        }
        if (!this.f26462i) {
            b(C1695i.e(this.f26456c, bVar));
            return;
        }
        C1695i c1695i2 = this.f26465m;
        C1688b c1688b = this.f26456c;
        zau zauVar2 = c1695i2.f26543n;
        zauVar2.sendMessageDelayed(Message.obtain(zauVar2, 9, c1688b), 5000L);
    }

    public final void n(d7.b bVar) {
        AbstractC1732v.d(this.f26465m.f26543n);
        com.google.android.gms.common.api.g gVar = this.f26455b;
        gVar.disconnect("onSignInFailed for " + gVar.getClass().getName() + " with " + String.valueOf(bVar));
        m(bVar, null);
    }

    public final void o() {
        AbstractC1732v.d(this.f26465m.f26543n);
        Status status = C1695i.f26527p;
        b(status);
        this.f26457d.a(status, false);
        for (C1701o c1701o : (C1701o[]) this.f26459f.keySet().toArray(new C1701o[0])) {
            l(new a0(c1701o, new TaskCompletionSource()));
        }
        a(new d7.b(4, null, null));
        com.google.android.gms.common.api.g gVar = this.f26455b;
        if (gVar.isConnected()) {
            gVar.onUserSignOut(new ad.L(this, 2));
        }
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC1694h
    public final void onConnected() {
        Looper looperMyLooper = Looper.myLooper();
        C1695i c1695i = this.f26465m;
        if (looperMyLooper == c1695i.f26543n.getLooper()) {
            e();
        } else {
            c1695i.f26543n.post(new A7.V(this, 26));
        }
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC1704s
    public final void onConnectionFailed(d7.b bVar) {
        m(bVar, null);
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC1694h
    public final void onConnectionSuspended(int i5) {
        Looper looperMyLooper = Looper.myLooper();
        C1695i c1695i = this.f26465m;
        if (looperMyLooper == c1695i.f26543n.getLooper()) {
            f(i5);
        } else {
            c1695i.f26543n.post(new R3.c(this, i5, 1));
        }
    }
}
