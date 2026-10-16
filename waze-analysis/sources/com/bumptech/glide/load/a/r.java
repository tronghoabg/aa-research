package com.bumptech.glide.load.a;

import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import androidx.core.util.Pools;
import com.google.android.gms.common.api.internal.be;
import com.waze.mg$$ExternalSyntheticApiModelOutline0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class r implements Runnable, Comparable, k, com.bumptech.glide.g.a.f {

    /* renamed from: a, reason: collision with root package name */
    public static final com.bumptech.glide.load.r f3160a = com.bumptech.glide.load.r.b("glide_thread_priority_override");
    private volatile boolean A;
    private boolean B;
    private int C;
    private int D;
    private int E;
    private final ad F;
    private ak G;

    /* renamed from: e, reason: collision with root package name */
    private final Pools.Pool f3164e;

    /* renamed from: h, reason: collision with root package name */
    private com.bumptech.glide.m f3167h;

    /* renamed from: i, reason: collision with root package name */
    private com.bumptech.glide.load.o f3168i;

    /* renamed from: j, reason: collision with root package name */
    private com.bumptech.glide.p f3169j;

    /* renamed from: k, reason: collision with root package name */
    private am f3170k;

    /* renamed from: l, reason: collision with root package name */
    private int f3171l;
    private int m;
    private y n;
    private com.bumptech.glide.load.s o;
    private int p;
    private long q;
    private com.bumptech.glide.o r;
    private Supplier s;
    private Thread t;
    private com.bumptech.glide.load.o u;
    private com.bumptech.glide.load.o v;
    private Object w;
    private com.bumptech.glide.load.data.e x;
    private volatile l y;
    private volatile boolean z;

    /* renamed from: b, reason: collision with root package name */
    private final m f3161b = new m();

    /* renamed from: c, reason: collision with root package name */
    private final List f3162c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    private final com.bumptech.glide.g.a.i f3163d = com.bumptech.glide.g.a.i.a();

    /* renamed from: f, reason: collision with root package name */
    private final o f3165f = new o();

    /* renamed from: g, reason: collision with root package name */
    private final p f3166g = new p();

    r(ad adVar, Pools.Pool pool) {
        this.F = adVar;
        this.f3164e = pool;
    }

    private final l j() {
        int i2 = this.C;
        int i3 = i2 - 1;
        if (i2 == 0) {
            throw null;
        }
        if (i3 == 1) {
            return new ax(this.f3161b, this);
        }
        if (i3 == 2) {
            m mVar = this.f3161b;
            return new h(mVar.o(), mVar, this);
        }
        if (i3 == 3) {
            return new bc(this.f3161b, this);
        }
        if (i3 == 5) {
            return null;
        }
        throw new IllegalStateException("Unrecognized stage: ".concat(q.a(i2)));
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00f4 A[Catch: all -> 0x0110, TRY_LEAVE, TryCatch #0 {all -> 0x0110, blocks: (B:23:0x008a, B:25:0x00a1, B:29:0x00a9, B:31:0x00b3, B:36:0x00be, B:37:0x00d0, B:39:0x00eb, B:41:0x00f4, B:45:0x010c, B:46:0x010f, B:38:0x00da), top: B:79:0x008a, outer: #5, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x017b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void k() throws java.lang.SecurityException, java.lang.IllegalArgumentException {
        /*
            Method dump skipped, instructions count: 383
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.a.r.k():void");
    }

    private final void l(String str, long j2, String str2) {
        double dA = com.bumptech.glide.g.k.a(j2);
        String strValueOf = String.valueOf(this.f3170k);
        String strConcat = str2 != null ? ", ".concat(str2) : "";
        Log.v("DecodeJob", str + " in " + dA + ", load key: " + strValueOf + strConcat + ", thread: " + Thread.currentThread().getName());
    }

    private final void m() throws SecurityException, IllegalArgumentException {
        if (this.r.b(com.bumptech.glide.h.class)) {
            o();
        }
        q();
        aq aqVar = new aq("Failed to load resource", new ArrayList(this.f3162c));
        ak akVar = this.G;
        synchronized (akVar) {
            akVar.f3009b = aqVar;
        }
        akVar.e();
        if (this.f3166g.c()) {
            n();
        }
    }

    private final void n() {
        this.f3166g.a();
        this.f3165f.a();
        this.f3161b.s();
        this.z = false;
        this.f3167h = null;
        this.f3168i = null;
        this.o = null;
        this.f3169j = null;
        this.f3170k = null;
        this.G = null;
        this.C = 0;
        this.y = null;
        this.t = null;
        this.u = null;
        this.w = null;
        this.E = 0;
        this.x = null;
        this.q = 0L;
        this.A = false;
        this.f3162c.clear();
        this.f3164e.release(this);
    }

    private final void o() throws SecurityException, IllegalArgumentException {
        if (!this.r.b(com.bumptech.glide.h.class)) {
            throw new IllegalStateException("OverrideGlideThreadPriority experiment is not enabled.");
        }
        Supplier supplier = this.s;
        if (supplier == null || supplier.get() == null) {
            return;
        }
        try {
            Process.setThreadPriority(Process.myTid(), 9);
        } catch (IllegalArgumentException | SecurityException e2) {
            this.s = null;
            if (Log.isLoggable("DecodeJob", 2)) {
                Log.v("DecodeJob", "Failed to set thread priority; using default priority for any subsequent jobs.", e2);
            }
        }
    }

    private final void p() throws SecurityException, IllegalArgumentException {
        this.t = Thread.currentThread();
        int i2 = com.bumptech.glide.g.k.f2906a;
        this.q = SystemClock.elapsedRealtimeNanos();
        boolean zC = false;
        while (!this.A && this.y != null && !(zC = this.y.c())) {
            this.C = r(this.C);
            this.y = j();
            if (this.C == 4) {
                s(2);
                return;
            }
        }
        if ((this.C == 6 || this.A) && !zC) {
            m();
        }
    }

    private final void q() {
        this.f3163d.c();
        if (this.z) {
            List list = this.f3162c;
            throw new IllegalStateException("Already notified", list.isEmpty() ? null : (Throwable) list.get(list.size() - 1));
        }
        this.z = true;
    }

    private final int r(int i2) {
        if (i2 == 0) {
            throw null;
        }
        int i3 = i2 - 1;
        if (i3 == 0) {
            if (this.n.b()) {
                return 2;
            }
            return r(2);
        }
        if (i3 == 1) {
            if (this.n.a()) {
                return 3;
            }
            return r(3);
        }
        if (i3 == 2) {
            return 4;
        }
        if (i3 == 3 || i3 == 5) {
            return 6;
        }
        throw new IllegalArgumentException("Unrecognized stage: ".concat(q.a(i2)));
    }

    private final void s(int i2) {
        this.D = i2;
        this.G.g(this);
    }

    @Override // com.bumptech.glide.load.a.k
    public final void b() {
        s(2);
    }

    @Override // com.bumptech.glide.g.a.f
    public final com.bumptech.glide.g.a.i bl() {
        return this.f3163d;
    }

    public final void c() {
        this.A = true;
        l lVar = this.y;
        if (lVar != null) {
            lVar.a();
        }
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        r rVar = (r) obj;
        int iCompareTo = this.f3169j.compareTo(rVar.f3169j);
        return iCompareTo == 0 ? this.p - rVar.p : iCompareTo;
    }

    @Override // com.bumptech.glide.load.a.k
    public final void d(com.bumptech.glide.load.o oVar, Exception exc, com.bumptech.glide.load.data.e eVar, int i2) throws SecurityException, IllegalArgumentException {
        eVar.d();
        aq aqVar = new aq("Fetching data failed", Collections.singletonList(exc));
        aqVar.b(oVar, i2, eVar.a());
        this.f3162c.add(aqVar);
        if (Thread.currentThread() != this.t) {
            s(2);
        } else {
            p();
        }
    }

    @Override // com.bumptech.glide.load.a.k
    public final void e(com.bumptech.glide.load.o oVar, Object obj, com.bumptech.glide.load.data.e eVar, int i2, com.bumptech.glide.load.o oVar2) throws SecurityException, IllegalArgumentException {
        this.u = oVar;
        this.w = obj;
        this.x = eVar;
        this.E = i2;
        this.v = oVar2;
        this.B = oVar != this.f3161b.o().get(0);
        if (Thread.currentThread() == this.t) {
            k();
        } else {
            s(3);
        }
    }

    final boolean f() {
        int iR = r(1);
        return iR == 2 || iR == 3;
    }

    /* JADX WARN: Type inference failed for: r11v2, types: [com.bumptech.glide.load.o, java.lang.Object] */
    final aw g(int i2, aw awVar) {
        aw awVarB;
        com.bumptech.glide.load.w wVar;
        int iB;
        Class<?> cls = awVar.c().getClass();
        com.bumptech.glide.load.v vVarG = null;
        if (i2 != 4) {
            com.bumptech.glide.load.w wVarH = this.f3161b.h(cls);
            wVar = wVarH;
            awVarB = wVarH.b(this.f3167h, awVar, this.f3171l, this.m);
        } else {
            awVarB = awVar;
            wVar = null;
        }
        if (!awVar.equals(awVarB)) {
            awVar.e();
        }
        m mVar = this.f3161b;
        if (mVar.u(awVarB)) {
            vVarG = mVar.g(awVarB);
            iB = vVarG.b();
        } else {
            iB = 3;
        }
        com.bumptech.glide.load.v vVar = vVarG;
        com.bumptech.glide.load.o oVar = this.u;
        List listP = mVar.p();
        int size = listP.size();
        boolean z = false;
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                break;
            }
            if (((be) listP.get(i3)).f4792c.equals(oVar)) {
                z = true;
                break;
            }
            i3++;
        }
        if (!this.n.d(!z, i2, iB)) {
            return awVarB;
        }
        if (vVar == null) {
            throw new com.bumptech.glide.t(awVarB.c().getClass());
        }
        com.bumptech.glide.load.o ayVar = iB + (-1) != 0 ? new ay(mVar.w(), this.u, this.f3168i, this.f3171l, this.m, wVar, cls, this.o) : new i(this.u, this.f3168i);
        av avVarD = av.d(awVarB);
        this.f3165f.b(ayVar, vVar, avVarD);
        return avVarD;
    }

    final void h(com.bumptech.glide.m mVar, Object obj, am amVar, com.bumptech.glide.load.o oVar, int i2, int i3, Class cls, Class cls2, com.bumptech.glide.p pVar, y yVar, Map map, boolean z, boolean z2, com.bumptech.glide.load.s sVar, ak akVar, int i4) {
        this.f3161b.x(mVar, obj, oVar, i2, i3, yVar, cls, cls2, pVar, sVar, map, z, z2, this.F);
        this.f3167h = mVar;
        this.f3168i = oVar;
        this.f3169j = pVar;
        this.f3170k = amVar;
        this.f3171l = i2;
        this.m = i3;
        this.n = yVar;
        this.o = sVar;
        this.G = akVar;
        this.p = i4;
        this.D = 1;
        this.r = mVar.b();
        this.s = mg$$ExternalSyntheticApiModelOutline0.m28521m(sVar.b(f3160a));
    }

    final void i() {
        if (this.f3166g.d()) {
            n();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.bumptech.glide.load.data.e eVar = this.x;
        try {
            try {
                if (this.A) {
                    m();
                } else {
                    int i2 = this.D;
                    int i3 = i2 - 1;
                    if (i2 == 0) {
                        throw null;
                    }
                    if (i3 == 0) {
                        this.C = r(1);
                        this.y = j();
                        p();
                    } else if (i3 == 1) {
                        p();
                    } else {
                        if (i3 != 2) {
                            throw new IllegalStateException("Unrecognized run reason: ".concat(i2 != 1 ? i2 != 2 ? "DECODE_DATA" : "SWITCH_TO_SOURCE_SERVICE" : "INITIALIZE"));
                        }
                        k();
                    }
                }
            } finally {
                if (eVar != null) {
                    eVar.d();
                }
            }
        } catch (g e2) {
            throw e2;
        } catch (Throwable th) {
            if (Log.isLoggable("DecodeJob", 3)) {
                Log.d("DecodeJob", "DecodeJob threw unexpectedly, isCancelled: " + this.A + ", stage: " + q.a(this.C), th);
            }
            if (this.C != 5) {
                this.f3162c.add(th);
                m();
            }
            if (!this.A) {
                throw th;
            }
            throw th;
        }
    }
}
