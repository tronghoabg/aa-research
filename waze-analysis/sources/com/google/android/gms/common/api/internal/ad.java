package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.api.Status;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class ad implements com.google.android.gms.common.api.r, com.google.android.gms.common.api.s {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ah f4713a;

    /* renamed from: b, reason: collision with root package name */
    private final Queue f4714b;

    /* renamed from: c, reason: collision with root package name */
    private final com.google.android.gms.common.api.h f4715c;

    /* renamed from: d, reason: collision with root package name */
    private final i f4716d;

    /* renamed from: e, reason: collision with root package name */
    private final u f4717e;

    /* renamed from: f, reason: collision with root package name */
    private final Set f4718f;

    /* renamed from: g, reason: collision with root package name */
    private final Map f4719g;

    /* renamed from: h, reason: collision with root package name */
    private final int f4720h;

    /* renamed from: i, reason: collision with root package name */
    private final bj f4721i;

    /* renamed from: j, reason: collision with root package name */
    private volatile com.google.android.gms.common.internal.v f4722j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f4723k;

    /* renamed from: l, reason: collision with root package name */
    private final List f4724l;
    private com.google.android.gms.common.d m;
    private int n;

    public ad(ah ahVar, com.google.android.gms.common.api.q qVar) {
        Objects.requireNonNull(ahVar);
        this.f4713a = ahVar;
        this.f4714b = new LinkedList();
        this.f4718f = new HashSet();
        this.f4719g = new HashMap();
        this.f4724l = new ArrayList();
        this.m = null;
        this.n = 0;
        com.google.android.gms.common.api.h hVarH = qVar.h(ahVar.s.getLooper(), this);
        this.f4715c = hVarH;
        this.f4716d = qVar.j();
        this.f4717e = new u();
        this.f4720h = qVar.e();
        if (hVarH.q()) {
            this.f4721i = qVar.l(ahVar.f4745k, ahVar.s);
        } else {
            this.f4721i = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final com.google.android.gms.common.f A(com.google.android.gms.common.f[] fVarArr) {
        if (fVarArr != null) {
            com.google.android.gms.common.f[] fVarArrR = this.f4715c.r();
            if (fVarArrR == null) {
                fVarArrR = new com.google.android.gms.common.f[0];
            }
            ArrayMap arrayMap = new ArrayMap(fVarArrR.length);
            for (com.google.android.gms.common.f fVar : fVarArrR) {
                arrayMap.put(fVar.b(), Long.valueOf(fVar.a()));
            }
            for (com.google.android.gms.common.f fVar2 : fVarArr) {
                Long l2 = (Long) arrayMap.get(fVar2.b());
                if (l2 == null || l2.longValue() < fVar2.a()) {
                    return fVar2;
                }
            }
        }
        return null;
    }

    private final Status B(com.google.android.gms.common.d dVar) {
        return ah.G(this.f4716d, dVar);
    }

    private final void C(com.google.android.gms.common.d dVar) {
        Set set = this.f4718f;
        Iterator it = set.iterator();
        if (!it.hasNext()) {
            set.clear();
            return;
        }
        if (Objects.equals(dVar, com.google.android.gms.common.d.f4926a)) {
            this.f4715c.s();
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void D(Status status) {
        av.e(this.f4713a.s);
        E(status, null, false);
    }

    private final void E(Status status, Exception exc, boolean z) {
        av.e(this.f4713a.s);
        if ((status == null) == (exc == null)) {
            throw new IllegalArgumentException("Status XOR exception should be null");
        }
        Iterator it = this.f4714b.iterator();
        while (it.hasNext()) {
            h hVar = (h) it.next();
            if (!z || hVar.f4828c == 2) {
                if (status != null) {
                    hVar.f(status);
                } else {
                    hVar.g(exc);
                }
                it.remove();
            }
        }
    }

    private final void F() {
        Queue queue = this.f4714b;
        ArrayList arrayList = new ArrayList(queue);
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            h hVar = (h) arrayList.get(i2);
            if (!this.f4715c.o()) {
                return;
            }
            if (L(hVar)) {
                queue.remove(hVar);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void G(Bundle bundle) {
        n();
        C(com.google.android.gms.common.d.f4926a);
        K();
        if (bundle == null || !bundle.containsKey("com.google.android.gms.common.internal.CONNECTION_THROTTLING_CONFIG")) {
            this.f4722j = null;
        } else {
            byte[] byteArray = bundle.getByteArray("com.google.android.gms.common.internal.CONNECTION_THROTTLING_CONFIG");
            this.f4722j = byteArray != null ? (com.google.android.gms.common.internal.v) a.a.R(byteArray, com.google.android.gms.common.internal.v.CREATOR) : null;
        }
        Iterator it = this.f4719g.values().iterator();
        while (it.hasNext()) {
            Object obj = ((be) it.next()).f4790a;
            if (A(((bb) obj).d()) != null) {
                it.remove();
            } else {
                try {
                    ((bb) obj).e(this.f4715c, new com.google.android.gms.o.w());
                } catch (DeadObjectException unused) {
                    b(3);
                    this.f4715c.m("DeadObjectException thrown while calling register listener method.");
                } catch (RemoteException e2) {
                    e = e2;
                    Log.e("GoogleApiManager", "Failed to register listener on re-connection.", e);
                    it.remove();
                } catch (RuntimeException e3) {
                    e = e3;
                    Log.e("GoogleApiManager", "Failed to register listener on re-connection.", e);
                    it.remove();
                }
            }
        }
        F();
        I();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void H(int i2) {
        n();
        this.f4723k = true;
        this.f4717e.e(i2, this.f4715c.j());
        ah ahVar = this.f4713a;
        Handler handler = ahVar.s;
        Handler handler2 = ahVar.s;
        i iVar = this.f4716d;
        handler.sendMessageDelayed(Message.obtain(handler2, 9, iVar), 5000L);
        ahVar.s.sendMessageDelayed(Message.obtain(ahVar.s, 11, iVar), 120000L);
        ahVar.x.r();
        Iterator it = this.f4719g.values().iterator();
        while (it.hasNext()) {
            Object obj = ((be) it.next()).f4792c;
        }
    }

    private final void I() {
        i iVar = this.f4716d;
        ah ahVar = this.f4713a;
        ahVar.s.removeMessages(12, iVar);
        ahVar.s.sendMessageDelayed(ahVar.s.obtainMessage(12, iVar), ahVar.f4741g);
    }

    private final void J(h hVar) {
        hVar.i(this.f4717e, y());
        try {
            hVar.h(this);
        } catch (DeadObjectException unused) {
            b(1);
            this.f4715c.m("DeadObjectException thrown while running ApiCallRunner.");
        }
    }

    private final void K() {
        if (this.f4723k) {
            ah ahVar = this.f4713a;
            i iVar = this.f4716d;
            ahVar.s.removeMessages(11, iVar);
            ahVar.s.removeMessages(9, iVar);
            this.f4723k = false;
        }
    }

    private final boolean L(h hVar) {
        N(hVar);
        if (!(hVar instanceof a)) {
            J(hVar);
            return true;
        }
        a aVar = (a) hVar;
        com.google.android.gms.common.f fVarA = A(aVar.d(this));
        if (fVarA == null) {
            J(hVar);
            return true;
        }
        Log.w("GoogleApiManager", this.f4715c.getClass().getName() + " could not execute call because it requires feature (" + fVarA.b() + ", " + fVarA.a() + ").");
        ah ahVar = this.f4713a;
        if (!ahVar.t || !aVar.c(this)) {
            aVar.g(new com.google.android.gms.common.api.ac(fVarA));
            return true;
        }
        int iA = aVar.a(this);
        ae aeVar = new ae(this.f4716d, fVarA);
        List list = this.f4724l;
        int iIndexOf = list.indexOf(aeVar);
        if (iIndexOf >= 0) {
            ae aeVar2 = (ae) list.get(iIndexOf);
            ahVar.s.removeMessages(15, aeVar2);
            ahVar.s.sendMessageDelayed(Message.obtain(ahVar.s, 15, aeVar2), 5000L);
            return false;
        }
        list.add(aeVar);
        ahVar.s.sendMessageDelayed(Message.obtain(ahVar.s, 15, aeVar), 5000L);
        ahVar.s.sendMessageDelayed(Message.obtain(ahVar.s, 16, aeVar), 120000L);
        com.google.android.gms.common.d dVar = new com.google.android.gms.common.d(2, null, null, Integer.valueOf(iA));
        if (M(dVar)) {
            Log.w("GoogleApiManager", "A dialog should be displayed for missing feature: " + fVarA.b() + ", version: " + fVarA.a());
            return false;
        }
        if (!ahVar.A(dVar, this.f4720h)) {
            return false;
        }
        Log.w("GoogleApiManager", "Notification displayed for missing feature: " + fVarA.b() + ", version: " + fVarA.a());
        return false;
    }

    private final boolean M(com.google.android.gms.common.d dVar) {
        synchronized (ah.f4737c) {
            ah ahVar = this.f4713a;
            if (ahVar.p == null || !ahVar.q.contains(this.f4716d)) {
                return false;
            }
            ahVar.p.c(dVar, this.f4720h);
            return true;
        }
    }

    private final void N(h hVar) {
        com.google.android.gms.common.internal.v vVar;
        a aVar;
        int iA;
        if (hVar.m() || hVar.l() || (vVar = this.f4722j) == null || !(hVar instanceof a) || (iA = (aVar = (a) hVar).a(this)) == 0) {
            return;
        }
        ah ahVar = this.f4713a;
        int iB = ahVar.M().b(iA, vVar);
        if (iB == Integer.MIN_VALUE) {
            hVar.k(true);
            Handler handler = ahVar.s;
            Objects.requireNonNull(handler);
            aVar.b(new y(handler, 0), new z(this, aVar, iA, 0));
            return;
        }
        Log.i("GoogleApiManager", "Call throttled for method key: " + iA + " with limit: " + iB);
        ahVar.p(iA, ahVar.f4745k.getPackageName(), iB);
        hVar.n();
    }

    static /* bridge */ /* synthetic */ void l(ad adVar, ae aeVar) {
        if (adVar.f4724l.contains(aeVar) && !adVar.f4723k) {
            if (adVar.f4715c.o()) {
                adVar.F();
            } else {
                adVar.o();
            }
        }
    }

    static /* bridge */ /* synthetic */ void m(ad adVar, ae aeVar) {
        int i2;
        com.google.android.gms.common.f[] fVarArrD;
        if (adVar.f4724l.remove(aeVar)) {
            ah ahVar = adVar.f4713a;
            ahVar.s.removeMessages(15, aeVar);
            ahVar.s.removeMessages(16, aeVar);
            com.google.android.gms.common.f fVar = aeVar.f4726b;
            Queue queue = adVar.f4714b;
            ArrayList arrayList = new ArrayList(queue.size());
            Iterator it = queue.iterator();
            while (true) {
                i2 = 0;
                if (!it.hasNext()) {
                    break;
                }
                h hVar = (h) it.next();
                if ((hVar instanceof a) && (fVarArrD = ((a) hVar).d(adVar)) != null) {
                    while (true) {
                        if (i2 >= fVarArrD.length) {
                            break;
                        }
                        if (Objects.equals(fVarArrD[i2], fVar)) {
                            arrayList.add(hVar);
                            break;
                        }
                        i2++;
                    }
                }
            }
            int size = arrayList.size();
            while (i2 < size) {
                h hVar2 = (h) arrayList.get(i2);
                queue.remove(hVar2);
                hVar2.g(new com.google.android.gms.common.api.ac(fVar));
                i2++;
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.r
    public final void a(Bundle bundle) {
        ah ahVar = this.f4713a;
        if (Looper.myLooper() == ahVar.s.getLooper()) {
            G(bundle);
        } else {
            ahVar.s.post(new bh(this, bundle, 1));
        }
    }

    @Override // com.google.android.gms.common.api.internal.r
    public final void b(int i2) {
        ah ahVar = this.f4713a;
        if (Looper.myLooper() == ahVar.s.getLooper()) {
            H(i2);
        } else {
            ahVar.s.post(new aa(this, i2));
        }
    }

    public final int c() {
        return this.f4720h;
    }

    final int d() {
        return this.n;
    }

    public final com.google.android.gms.common.api.h f() {
        return this.f4715c;
    }

    public final Map h() {
        return this.f4719g;
    }

    public final void n() {
        av.e(this.f4713a.s);
        this.m = null;
    }

    public final void o() {
        ah ahVar = this.f4713a;
        av.e(ahVar.s);
        com.google.android.gms.common.api.h hVar = this.f4715c;
        if (hVar.o() || hVar.p()) {
            return;
        }
        try {
            int iQ = ahVar.x.q(ahVar.f4745k, hVar);
            if (iQ != 0) {
                com.google.android.gms.common.d dVar = new com.google.android.gms.common.d(iQ, null);
                Log.w("GoogleApiManager", "The service for " + hVar.getClass().getName() + " is not available: " + dVar.toString());
                r(dVar);
                return;
            }
            ah ahVar2 = this.f4713a;
            com.google.android.gms.common.api.h hVar2 = this.f4715c;
            ag agVar = new ag(ahVar2, hVar2, this.f4716d);
            if (hVar2.q()) {
                bj bjVar = this.f4721i;
                av.m(bjVar);
                bjVar.f(agVar);
            }
            try {
                hVar2.l(agVar);
            } catch (SecurityException e2) {
                s(new com.google.android.gms.common.d(10), e2);
            }
        } catch (IllegalStateException e3) {
            s(new com.google.android.gms.common.d(10), e3);
        }
    }

    public final void p(h hVar) {
        av.e(this.f4713a.s);
        N(hVar);
        if (this.f4715c.o()) {
            if (L(hVar)) {
                I();
                return;
            } else {
                this.f4714b.add(hVar);
                return;
            }
        }
        this.f4714b.add(hVar);
        com.google.android.gms.common.d dVar = this.m;
        if (dVar == null || !dVar.f()) {
            o();
        } else {
            r(dVar);
        }
    }

    final void q() {
        this.n++;
    }

    @Override // com.google.android.gms.common.api.internal.az
    public final void r(com.google.android.gms.common.d dVar) {
        s(dVar, null);
    }

    public final void s(com.google.android.gms.common.d dVar, Exception exc) {
        ah ahVar = this.f4713a;
        av.e(ahVar.s);
        bj bjVar = this.f4721i;
        if (bjVar != null) {
            bjVar.g();
        }
        n();
        ahVar.x.r();
        C(dVar);
        if ((this.f4715c instanceof com.google.android.gms.common.internal.b.l) && dVar.a() != 24) {
            ahVar.f4742h = true;
            ahVar.s.sendMessageDelayed(ahVar.s.obtainMessage(19), 300000L);
        }
        if (dVar.a() == 4) {
            D(ah.f4736b);
            return;
        }
        if (dVar.a() == 25) {
            D(B(dVar));
            return;
        }
        Queue queue = this.f4714b;
        if (queue.isEmpty()) {
            this.m = dVar;
            return;
        }
        if (exc != null) {
            av.e(ahVar.s);
            E(null, exc, false);
            return;
        }
        if (!ahVar.t) {
            D(B(dVar));
            return;
        }
        E(B(dVar), null, true);
        if (queue.isEmpty() || M(dVar) || ahVar.A(dVar, this.f4720h)) {
            return;
        }
        if (dVar.a() == 18) {
            this.f4723k = true;
        }
        if (!this.f4723k) {
            D(B(dVar));
        } else {
            ahVar.s.sendMessageDelayed(Message.obtain(ahVar.s, 9, this.f4716d), 5000L);
        }
    }

    public final void t(com.google.android.gms.common.d dVar) {
        av.e(this.f4713a.s);
        com.google.android.gms.common.api.h hVar = this.f4715c;
        hVar.m("onSignInFailed for " + hVar.getClass().getName() + " with " + String.valueOf(dVar));
        r(dVar);
    }

    public final void u() {
        av.e(this.f4713a.s);
        if (this.f4723k) {
            o();
        }
    }

    public final void v() {
        av.e(this.f4713a.s);
        D(ah.f4735a);
        this.f4717e.f();
        for (as asVar : (as[]) this.f4719g.keySet().toArray(new as[0])) {
            p(new g(asVar, new com.google.android.gms.o.w()));
        }
        C(new com.google.android.gms.common.d(4));
        com.google.android.gms.common.api.h hVar = this.f4715c;
        if (hVar.o()) {
            hVar.n(new ac(this));
        }
    }

    public final void w() {
        ah ahVar = this.f4713a;
        av.e(ahVar.s);
        if (this.f4723k) {
            K();
            D(ahVar.f4746l.l(ahVar.f4745k) == 18 ? new Status(21, "Connection timed out waiting for Google Play services update to complete.") : new Status(22, "API failed to connect while resuming due to an unknown error."));
            this.f4715c.m("Timing out connection while resuming.");
        }
    }

    public final boolean y() {
        return this.f4715c.q();
    }

    public final void z() {
        av.e(this.f4713a.s);
        com.google.android.gms.common.api.h hVar = this.f4715c;
        if (hVar.o() && this.f4719g.isEmpty()) {
            if (this.f4717e.g()) {
                I();
            } else {
                hVar.m("Timing out service connection.");
            }
        }
    }
}
