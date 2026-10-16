package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.collection.ArraySet;
import com.google.android.gms.common.api.Status;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class ah implements Handler.Callback {

    /* renamed from: e, reason: collision with root package name */
    private static ah f4739e;

    /* renamed from: i, reason: collision with root package name */
    private com.google.android.gms.common.internal.bi f4743i;

    /* renamed from: j, reason: collision with root package name */
    private com.google.android.gms.common.internal.r f4744j;

    /* renamed from: k, reason: collision with root package name */
    private final Context f4745k;

    /* renamed from: l, reason: collision with root package name */
    private final com.google.android.gms.common.h f4746l;
    private final Handler s;
    private volatile boolean t;
    private com.google.android.gms.common.internal.b.k u;
    private com.google.android.gms.common.internal.b.i v;
    private volatile com.airbnb.lottie.e.d w;
    private final android.support.v4.app.aw x;

    /* renamed from: a, reason: collision with root package name */
    public static final Status f4735a = new Status(4, "Sign-out occurred while this API call was in progress.");

    /* renamed from: b, reason: collision with root package name */
    private static final Status f4736b = new Status(4, "The user must be signed in to make this API call.");

    /* renamed from: c, reason: collision with root package name */
    private static final Object f4737c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private static final Object f4738d = new Object();

    /* renamed from: f, reason: collision with root package name */
    private static volatile boolean f4740f = false;

    /* renamed from: g, reason: collision with root package name */
    private long f4741g = 10000;

    /* renamed from: h, reason: collision with root package name */
    private boolean f4742h = false;
    private final AtomicInteger m = new AtomicInteger(1);
    private final AtomicInteger n = new AtomicInteger(0);
    private final Map o = new ConcurrentHashMap(5, 0.75f, 1);
    private v p = null;
    private final Set q = new ArraySet();
    private final Set r = new ArraySet();

    private ah(Context context, Looper looper, com.google.android.gms.common.h hVar) {
        this.t = true;
        this.f4745k = context;
        com.waze.native_managers.j jVar = new com.waze.native_managers.j(looper, this);
        this.s = jVar;
        this.f4746l = hVar;
        this.x = new android.support.v4.app.aw(hVar);
        if (com.google.android.gms.common.util.b.a(context)) {
            this.t = false;
        }
        jVar.sendMessage(jVar.obtainMessage(6));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Status G(i iVar, com.google.android.gms.common.d dVar) {
        return new Status(dVar, "API: " + iVar.a() + " is not available on this device. Connection failed with: " + String.valueOf(dVar));
    }

    private final ad H(com.google.android.gms.common.api.q qVar) {
        Map map = this.o;
        i iVarJ = qVar.j();
        ad adVar = (ad) map.get(iVarJ);
        if (adVar == null) {
            adVar = new ad(this, qVar);
            map.put(iVarJ, adVar);
        }
        if (adVar.y()) {
            this.r.add(iVarJ);
        }
        adVar.o();
        return adVar;
    }

    private final void I() {
        com.google.android.gms.common.internal.bi biVar = this.f4743i;
        if (biVar != null) {
            if (biVar.a() > 0 || z()) {
                L().a(biVar);
            }
            this.f4743i = null;
        }
    }

    private final void J() {
        com.google.android.gms.common.internal.r rVar = this.f4744j;
        if (rVar != null) {
            Context context = this.f4745k;
            com.google.android.gms.common.internal.b.i iVar = this.v;
            if (iVar == null) {
                iVar = new com.google.android.gms.common.internal.b.i(context);
                this.v = iVar;
            }
            bm bmVar = new bm();
            bmVar.e(com.google.android.gms.e.a.f5204c);
            bmVar.d();
            bmVar.c(new com.google.android.gms.auth.a.b.a.c(rVar, 5));
            iVar.n(bmVar.b());
            this.f4744j = null;
        }
    }

    private final void K(com.google.android.gms.o.w wVar, int i2, com.google.android.gms.common.api.q qVar) {
        aw awVarB;
        if (i2 == 0 || (awVarB = aw.b(this, i2, qVar.j())) == null) {
            return;
        }
        com.google.android.gms.o.t tVarA = wVar.a();
        Handler handler = this.s;
        Objects.requireNonNull(handler);
        tVarA.n(new y(handler, 1), awVarB);
    }

    private final com.google.android.gms.common.internal.b.k L() {
        com.google.android.gms.common.internal.b.k kVar = this.u;
        if (kVar != null) {
            return kVar;
        }
        com.google.android.gms.common.internal.b.k kVar2 = new com.google.android.gms.common.internal.b.k(this.f4745k, com.google.android.gms.common.internal.bk.f5039a);
        this.u = kVar2;
        return kVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.airbnb.lottie.e.d M() {
        com.airbnb.lottie.e.d dVar;
        com.airbnb.lottie.e.d dVar2 = this.w;
        if (dVar2 != null) {
            return dVar2;
        }
        synchronized (f4738d) {
            dVar = this.w;
            if (dVar == null) {
                dVar = new com.airbnb.lottie.e.d();
                this.w = dVar;
            }
        }
        return dVar;
    }

    public static ah k(Context context) {
        ah ahVar;
        synchronized (f4737c) {
            ahVar = f4739e;
            if (ahVar == null) {
                Looper looper = com.google.android.gms.common.internal.aj.a().getLooper();
                boolean zA = com.google.android.gms.common.internal.ah.a(context.getPackageName());
                f4740f = zA;
                ah ahVar2 = new ah(context.getApplicationContext(), looper, com.google.android.gms.common.h.b());
                if (zA) {
                    com.google.android.gms.common.internal.ad.ac(com.google.android.gms.common.internal.af.b(ahVar2.f4745k));
                }
                f4739e = ahVar2;
                ahVar = ahVar2;
            }
        }
        return ahVar;
    }

    public static void w() {
        synchronized (f4737c) {
            ah ahVar = f4739e;
            if (ahVar != null) {
                ahVar.n.incrementAndGet();
                Handler handler = ahVar.s;
                handler.sendMessageAtFrontOfQueue(handler.obtainMessage(10));
            }
        }
    }

    final boolean A(com.google.android.gms.common.d dVar, int i2) {
        com.google.android.gms.common.h hVar = this.f4746l;
        if (hVar.d(dVar.a())) {
            return hVar.e(this.f4745k, dVar, i2);
        }
        Log.w("GoogleApiManager", "Not showing notification since connectionResult is not user-facing: ".concat(String.valueOf(String.valueOf(dVar))));
        return false;
    }

    public final void C(com.google.android.gms.common.api.q qVar, l lVar) {
        ba baVar = new ba(new d(lVar), this.n.get(), qVar);
        Handler handler = this.s;
        handler.sendMessage(handler.obtainMessage(4, baVar));
    }

    public final void D(com.google.android.gms.common.api.q qVar, int i2, bn bnVar, com.google.android.gms.o.w wVar) {
        K(wVar, bnVar.a(), qVar);
        ba baVar = new ba(new f(i2, bnVar, wVar), this.n.get(), qVar);
        Handler handler = this.s;
        handler.sendMessage(handler.obtainMessage(4, baVar));
    }

    public final int a() {
        return this.m.getAndIncrement();
    }

    public final Handler e() {
        return this.s;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0048  */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean handleMessage(android.os.Message r9) {
        /*
            Method dump skipped, instructions count: 792
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.ah.handleMessage(android.os.Message):boolean");
    }

    final ad j(i iVar) {
        return (ad) this.o.get(iVar);
    }

    public final com.google.android.gms.o.t l(com.google.android.gms.common.api.q qVar, bb bbVar, bq bqVar, Runnable runnable) {
        com.google.android.gms.o.w wVar = new com.google.android.gms.o.w();
        K(wVar, 0, qVar);
        ba baVar = new ba(new e(new be((Object) bbVar, (Object) bqVar, (Object) runnable), wVar), this.n.get(), qVar);
        Handler handler = this.s;
        handler.sendMessage(handler.obtainMessage(8, baVar));
        return wVar.a();
    }

    final void p(int i2, String str, int i3) {
        bo boVar = new bo(i2, str, i3);
        Handler handler = this.s;
        handler.sendMessage(handler.obtainMessage(21, boVar));
    }

    final void q(com.google.android.gms.common.internal.az azVar, int i2, long j2, int i3) {
        ax axVar = new ax(azVar, i2, j2, i3);
        Handler handler = this.s;
        handler.sendMessage(handler.obtainMessage(18, axVar));
    }

    public final void r(com.google.android.gms.common.d dVar, int i2) {
        if (A(dVar, i2)) {
            return;
        }
        Handler handler = this.s;
        handler.sendMessage(handler.obtainMessage(5, i2, 0, dVar));
    }

    public final void s() {
        Handler handler = this.s;
        handler.sendMessage(handler.obtainMessage(3));
    }

    public final void t(com.google.android.gms.common.api.q qVar) {
        Handler handler = this.s;
        handler.sendMessage(handler.obtainMessage(7, qVar));
    }

    public final void u(v vVar) {
        synchronized (f4737c) {
            if (this.p != vVar) {
                this.p = vVar;
                this.q.clear();
            }
            this.q.addAll(vVar.i());
        }
    }

    final void v(int i2) {
        M().c(i2);
    }

    final void x(v vVar) {
        synchronized (f4737c) {
            if (this.p == vVar) {
                this.p = null;
                this.q.clear();
            }
        }
    }

    final boolean z() {
        if (this.f4742h) {
            return false;
        }
        com.google.android.gms.common.internal.bg bgVarB = com.google.android.gms.common.internal.bf.a().b();
        if (bgVarB != null && !bgVarB.d()) {
            return false;
        }
        int iS = this.x.s(203400000);
        return iS == -1 || iS == 0;
    }
}
