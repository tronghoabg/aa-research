package E4;

import A.AbstractC0213f;
import A.C0230x;
import A7.AbstractC0279p0;
import android.os.Build;
import android.os.SystemClock;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import ka.AbstractC3256n;

/* loaded from: classes.dex */
public final class k implements InterfaceC0438g, Runnable, Comparable, Z4.b {

    /* renamed from: A, reason: collision with root package name */
    public volatile boolean f2899A;

    /* renamed from: B, reason: collision with root package name */
    public int f2900B;

    /* renamed from: C, reason: collision with root package name */
    public int f2901C;

    /* renamed from: D, reason: collision with root package name */
    public int f2902D;

    /* renamed from: d, reason: collision with root package name */
    public final d7.j f2906d;

    /* renamed from: e, reason: collision with root package name */
    public final Dd.c f2907e;

    /* renamed from: h, reason: collision with root package name */
    public com.bumptech.glide.c f2910h;

    /* renamed from: i, reason: collision with root package name */
    public B4.d f2911i;

    /* renamed from: j, reason: collision with root package name */
    public com.bumptech.glide.d f2912j;
    public t k;

    /* renamed from: l, reason: collision with root package name */
    public int f2913l;

    /* renamed from: m, reason: collision with root package name */
    public int f2914m;

    /* renamed from: n, reason: collision with root package name */
    public m f2915n;

    /* renamed from: o, reason: collision with root package name */
    public B4.g f2916o;

    /* renamed from: p, reason: collision with root package name */
    public s f2917p;

    /* renamed from: q, reason: collision with root package name */
    public int f2918q;

    /* renamed from: r, reason: collision with root package name */
    public long f2919r;

    /* renamed from: s, reason: collision with root package name */
    public Object f2920s;

    /* renamed from: t, reason: collision with root package name */
    public Thread f2921t;

    /* renamed from: u, reason: collision with root package name */
    public B4.d f2922u;

    /* renamed from: v, reason: collision with root package name */
    public B4.d f2923v;

    /* renamed from: w, reason: collision with root package name */
    public Object f2924w;

    /* renamed from: x, reason: collision with root package name */
    public C4.e f2925x;

    /* renamed from: y, reason: collision with root package name */
    public volatile h f2926y;

    /* renamed from: z, reason: collision with root package name */
    public volatile boolean f2927z;

    /* renamed from: a, reason: collision with root package name */
    public final i f2903a = new i();

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f2904b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final Z4.e f2905c = new Z4.e();

    /* renamed from: f, reason: collision with root package name */
    public final b7.k f2908f = new b7.k(3, false);

    /* renamed from: g, reason: collision with root package name */
    public final j f2909g = new j();

    public k(d7.j jVar, Dd.c cVar) {
        this.f2906d = jVar;
        this.f2907e = cVar;
    }

    @Override // E4.InterfaceC0438g
    public final void a(B4.d dVar, Object obj, C4.e eVar, int i5, B4.d dVar2) {
        this.f2922u = dVar;
        this.f2924w = obj;
        this.f2925x = eVar;
        this.f2902D = i5;
        this.f2923v = dVar2;
        if (Thread.currentThread() == this.f2921t) {
            f();
            return;
        }
        this.f2901C = 3;
        s sVar = this.f2917p;
        (sVar.f2967m ? sVar.f2964i : sVar.f2963h).execute(this);
    }

    @Override // E4.InterfaceC0438g
    public final void b(B4.d dVar, Exception exc, C4.e eVar, int i5) {
        eVar.a();
        w wVar = new w("Fetching data failed", Collections.singletonList(exc));
        Class clsB = eVar.b();
        wVar.f2996b = dVar;
        wVar.f2997c = i5;
        wVar.f2998d = clsB;
        this.f2904b.add(wVar);
        if (Thread.currentThread() == this.f2921t) {
            p();
            return;
        }
        this.f2901C = 2;
        s sVar = this.f2917p;
        (sVar.f2967m ? sVar.f2964i : sVar.f2963h).execute(this);
    }

    @Override // Z4.b
    public final Z4.e c() {
        return this.f2905c;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        k kVar = (k) obj;
        int iOrdinal = this.f2912j.ordinal() - kVar.f2912j.ordinal();
        return iOrdinal == 0 ? this.f2918q - kVar.f2918q : iOrdinal;
    }

    public final B d(C4.e eVar, Object obj, int i5) {
        if (obj == null) {
            return null;
        }
        try {
            int i10 = Y4.i.f16694b;
            long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            B bE = e(i5, obj);
            if (Log.isLoggable("DecodeJob", 2)) {
                i(jElapsedRealtimeNanos, "Decoded result " + bE, null);
            }
            return bE;
        } finally {
            eVar.a();
        }
    }

    public final B e(int i5, Object obj) {
        C4.g gVarA;
        z zVarC = this.f2903a.c(obj.getClass());
        B4.g gVar = this.f2916o;
        if (Build.VERSION.SDK_INT >= 26) {
            boolean z2 = i5 == 4 || this.f2903a.f2895r;
            B4.f fVar = L4.m.f6910i;
            Boolean bool = (Boolean) gVar.c(fVar);
            if (bool == null || (bool.booleanValue() && !z2)) {
                gVar = new B4.g();
                gVar.f1589b.h(this.f2916o.f1589b);
                gVar.f1589b.put(fVar, Boolean.valueOf(z2));
            }
        }
        B4.g gVar2 = gVar;
        C4.i iVar = (C4.i) this.f2910h.f24220b.f24234e;
        synchronized (iVar) {
            try {
                C4.f fVar2 = (C4.f) ((HashMap) iVar.f1793b).get(obj.getClass());
                if (fVar2 == null) {
                    Iterator it = ((HashMap) iVar.f1793b).values().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        C4.f fVar3 = (C4.f) it.next();
                        if (fVar3.b().isAssignableFrom(obj.getClass())) {
                            fVar2 = fVar3;
                            break;
                        }
                    }
                }
                if (fVar2 == null) {
                    fVar2 = C4.i.f1791c;
                }
                gVarA = fVar2.a(obj);
            } catch (Throwable th) {
                throw th;
            }
        }
        try {
            return zVarC.a(this.f2913l, this.f2914m, new C0230x(this, i5, 2), gVar2, gVarA);
        } finally {
            gVarA.a();
        }
    }

    public final void f() {
        B bD;
        if (Log.isLoggable("DecodeJob", 2)) {
            i(this.f2919r, "Retrieved data", "data: " + this.f2924w + ", cache key: " + this.f2922u + ", fetcher: " + this.f2925x);
        }
        A a5 = null;
        try {
            bD = d(this.f2925x, this.f2924w, this.f2902D);
        } catch (w e7) {
            B4.d dVar = this.f2923v;
            int i5 = this.f2902D;
            e7.f2996b = dVar;
            e7.f2997c = i5;
            e7.f2998d = null;
            this.f2904b.add(e7);
            bD = null;
        }
        if (bD == null) {
            p();
            return;
        }
        int i10 = this.f2902D;
        if (bD instanceof x) {
            ((x) bD).initialize();
        }
        boolean z2 = true;
        if (((A) this.f2908f.f19398d) != null) {
            a5 = (A) A.f2826e.z();
            a5.f2830d = false;
            a5.f2829c = true;
            a5.f2828b = bD;
            bD = a5;
        }
        r();
        s sVar = this.f2917p;
        synchronized (sVar) {
            sVar.f2968n = bD;
            sVar.f2969o = i10;
        }
        sVar.h();
        this.f2900B = 5;
        try {
            b7.k kVar = this.f2908f;
            if (((A) kVar.f19398d) == null) {
                z2 = false;
            }
            if (z2) {
                d7.j jVar = this.f2906d;
                B4.g gVar = this.f2916o;
                kVar.getClass();
                try {
                    jVar.a().f((B4.d) kVar.f19396b, new G9.e((B4.j) kVar.f19397c, (A) kVar.f19398d, gVar, 3));
                    ((A) kVar.f19398d).d();
                } catch (Throwable th) {
                    ((A) kVar.f19398d).d();
                    throw th;
                }
            }
            k();
        } finally {
            if (a5 != null) {
                a5.d();
            }
        }
    }

    public final h g() {
        int iF = AbstractC0213f.f(this.f2900B);
        i iVar = this.f2903a;
        if (iF == 1) {
            return new C(iVar, this);
        }
        if (iF == 2) {
            return new C0436e(iVar.a(), iVar, this);
        }
        if (iF == 3) {
            return new G(iVar, this);
        }
        if (iF == 5) {
            return null;
        }
        throw new IllegalStateException("Unrecognized stage: ".concat(AbstractC0279p0.z(this.f2900B)));
    }

    public final int h(int i5) {
        boolean z2;
        boolean z10;
        int iF = AbstractC0213f.f(i5);
        if (iF == 0) {
            switch (this.f2915n.f2936a) {
                case 0:
                case 1:
                    z2 = false;
                    break;
                default:
                    z2 = true;
                    break;
            }
            if (z2) {
                return 2;
            }
            return h(2);
        }
        if (iF != 1) {
            if (iF == 2) {
                return 4;
            }
            if (iF == 3 || iF == 5) {
                return 6;
            }
            throw new IllegalArgumentException("Unrecognized stage: ".concat(AbstractC0279p0.z(i5)));
        }
        switch (this.f2915n.f2936a) {
            case 0:
                z10 = false;
                break;
            case 1:
            default:
                z10 = true;
                break;
        }
        if (z10) {
            return 3;
        }
        return h(3);
    }

    public final void i(long j8, String str, String str2) {
        StringBuilder sbQ = AbstractC0279p0.q(str, " in ");
        sbQ.append(Y4.i.a(j8));
        sbQ.append(", load key: ");
        sbQ.append(this.k);
        sbQ.append(str2 != null ? ", ".concat(str2) : "");
        sbQ.append(", thread: ");
        sbQ.append(Thread.currentThread().getName());
        Log.v("DecodeJob", sbQ.toString());
    }

    public final void j() {
        r();
        w wVar = new w("Failed to load resource", new ArrayList(this.f2904b));
        s sVar = this.f2917p;
        synchronized (sVar) {
            sVar.f2971q = wVar;
        }
        sVar.g();
        l();
    }

    public final void k() {
        boolean zB;
        j jVar = this.f2909g;
        synchronized (jVar) {
            jVar.f2897b = true;
            zB = jVar.b();
        }
        if (zB) {
            n();
        }
    }

    public final void l() {
        boolean zB;
        j jVar = this.f2909g;
        synchronized (jVar) {
            jVar.f2898c = true;
            zB = jVar.b();
        }
        if (zB) {
            n();
        }
    }

    public final void m() {
        boolean zB;
        j jVar = this.f2909g;
        synchronized (jVar) {
            jVar.f2896a = true;
            zB = jVar.b();
        }
        if (zB) {
            n();
        }
    }

    public final void n() {
        j jVar = this.f2909g;
        synchronized (jVar) {
            jVar.f2897b = false;
            jVar.f2896a = false;
            jVar.f2898c = false;
        }
        b7.k kVar = this.f2908f;
        kVar.f19396b = null;
        kVar.f19397c = null;
        kVar.f19398d = null;
        i iVar = this.f2903a;
        iVar.f2881c = null;
        iVar.f2882d = null;
        iVar.f2891n = null;
        iVar.f2885g = null;
        iVar.k = null;
        iVar.f2887i = null;
        iVar.f2892o = null;
        iVar.f2888j = null;
        iVar.f2893p = null;
        iVar.f2879a.clear();
        iVar.f2889l = false;
        iVar.f2880b.clear();
        iVar.f2890m = false;
        this.f2927z = false;
        this.f2910h = null;
        this.f2911i = null;
        this.f2916o = null;
        this.f2912j = null;
        this.k = null;
        this.f2917p = null;
        this.f2900B = 0;
        this.f2926y = null;
        this.f2921t = null;
        this.f2922u = null;
        this.f2924w = null;
        this.f2902D = 0;
        this.f2925x = null;
        this.f2919r = 0L;
        this.f2899A = false;
        this.f2920s = null;
        this.f2904b.clear();
        this.f2907e.O(this);
    }

    public final void o() {
        this.f2901C = 2;
        s sVar = this.f2917p;
        (sVar.f2967m ? sVar.f2964i : sVar.f2963h).execute(this);
    }

    public final void p() {
        this.f2921t = Thread.currentThread();
        int i5 = Y4.i.f16694b;
        this.f2919r = SystemClock.elapsedRealtimeNanos();
        boolean zD = false;
        while (!this.f2899A && this.f2926y != null && !(zD = this.f2926y.d())) {
            this.f2900B = h(this.f2900B);
            this.f2926y = g();
            if (this.f2900B == 4) {
                o();
                return;
            }
        }
        if ((this.f2900B == 6 || this.f2899A) && !zD) {
            j();
        }
    }

    public final void q() {
        int iF = AbstractC0213f.f(this.f2901C);
        if (iF == 0) {
            this.f2900B = h(1);
            this.f2926y = g();
            p();
        } else if (iF == 1) {
            p();
        } else if (iF == 2) {
            f();
        } else {
            int i5 = this.f2901C;
            throw new IllegalStateException("Unrecognized run reason: ".concat(i5 != 1 ? i5 != 2 ? i5 != 3 ? "null" : "DECODE_DATA" : "SWITCH_TO_SOURCE_SERVICE" : "INITIALIZE"));
        }
    }

    public final void r() {
        this.f2905c.a();
        if (this.f2927z) {
            throw new IllegalStateException("Already notified", this.f2904b.isEmpty() ? null : (Throwable) AbstractC3256n.e(this.f2904b, 1));
        }
        this.f2927z = true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4.e eVar = this.f2925x;
        try {
            try {
                if (this.f2899A) {
                    j();
                    if (eVar != null) {
                        eVar.a();
                        return;
                    }
                    return;
                }
                q();
                if (eVar != null) {
                    eVar.a();
                }
            } catch (Throwable th) {
                if (eVar != null) {
                    eVar.a();
                }
                throw th;
            }
        } catch (C0435d e7) {
            throw e7;
        } catch (Throwable th2) {
            if (Log.isLoggable("DecodeJob", 3)) {
                Log.d("DecodeJob", "DecodeJob threw unexpectedly, isCancelled: " + this.f2899A + ", stage: " + AbstractC0279p0.z(this.f2900B), th2);
            }
            if (this.f2900B != 5) {
                this.f2904b.add(th2);
                j();
            }
            if (!this.f2899A) {
                throw th2;
            }
            throw th2;
        }
    }
}
