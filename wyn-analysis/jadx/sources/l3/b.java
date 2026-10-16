package L3;

import A7.RunnableC0278p;
import J3.r;
import K3.c;
import K3.h;
import K3.j;
import K3.q;
import S3.n;
import S3.p;
import S3.s;
import T3.l;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import b7.k;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import xa.d;

/* loaded from: classes.dex */
public final class b implements h, O3.b, c {

    /* renamed from: j, reason: collision with root package name */
    public static final String f6872j = r.f("GreedyScheduler");

    /* renamed from: a, reason: collision with root package name */
    public final Context f6873a;

    /* renamed from: b, reason: collision with root package name */
    public final q f6874b;

    /* renamed from: c, reason: collision with root package name */
    public final k f6875c;

    /* renamed from: e, reason: collision with root package name */
    public final a f6877e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f6878f;

    /* renamed from: i, reason: collision with root package name */
    public Boolean f6881i;

    /* renamed from: d, reason: collision with root package name */
    public final HashSet f6876d = new HashSet();

    /* renamed from: h, reason: collision with root package name */
    public final s f6880h = new s((byte) 0, 10);

    /* renamed from: g, reason: collision with root package name */
    public final Object f6879g = new Object();

    public b(Context context, J3.b bVar, n nVar, q qVar) {
        this.f6873a = context;
        this.f6874b = qVar;
        this.f6875c = new k(nVar, this);
        this.f6877e = new a(this, bVar.f5548e);
    }

    @Override // K3.h
    public final void a(String str) {
        Runnable runnable;
        Boolean bool = this.f6881i;
        q qVar = this.f6874b;
        if (bool == null) {
            this.f6881i = Boolean.valueOf(l.a(this.f6873a, qVar.f6502b));
        }
        boolean zBooleanValue = this.f6881i.booleanValue();
        String str2 = f6872j;
        if (!zBooleanValue) {
            r.d().e(str2, "Ignoring schedule request in non-main process");
            return;
        }
        if (!this.f6878f) {
            qVar.f6506f.a(this);
            this.f6878f = true;
        }
        r.d().a(str2, "Cancelling work ID " + str);
        a aVar = this.f6877e;
        if (aVar != null && (runnable = (Runnable) aVar.f6871c.remove(str)) != null) {
            ((Handler) aVar.f6870b.f47873b).removeCallbacks(runnable);
        }
        Iterator it = this.f6880h.x(str).iterator();
        while (it.hasNext()) {
            qVar.h((j) it.next());
        }
    }

    @Override // O3.b
    public final void b(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            S3.j jVarS = Fe.c.s((p) it.next());
            r.d().a(f6872j, "Constraints not met: Cancelling work ID " + jVarS);
            j jVarW = this.f6880h.w(jVarS);
            if (jVarW != null) {
                this.f6874b.h(jVarW);
            }
        }
    }

    @Override // K3.h
    public final void c(p... pVarArr) {
        if (this.f6881i == null) {
            this.f6881i = Boolean.valueOf(l.a(this.f6873a, this.f6874b.f6502b));
        }
        if (!this.f6881i.booleanValue()) {
            r.d().e(f6872j, "Ignoring schedule request in a secondary process");
            return;
        }
        if (!this.f6878f) {
            this.f6874b.f6506f.a(this);
            this.f6878f = true;
        }
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (p pVar : pVarArr) {
            if (!this.f6880h.h(Fe.c.s(pVar))) {
                long jA = pVar.a();
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (pVar.f10978b == 1) {
                    if (jCurrentTimeMillis < jA) {
                        a aVar = this.f6877e;
                        if (aVar != null) {
                            HashMap map = aVar.f6871c;
                            Runnable runnable = (Runnable) map.remove(pVar.f10977a);
                            d dVar = aVar.f6870b;
                            if (runnable != null) {
                                ((Handler) dVar.f47873b).removeCallbacks(runnable);
                            }
                            RunnableC0278p runnableC0278p = new RunnableC0278p(29, aVar, pVar);
                            map.put(pVar.f10977a, runnableC0278p);
                            ((Handler) dVar.f47873b).postDelayed(runnableC0278p, pVar.a() - System.currentTimeMillis());
                        }
                    } else if (pVar.b()) {
                        int i5 = Build.VERSION.SDK_INT;
                        J3.d dVar2 = pVar.f10986j;
                        if (dVar2.f5557c) {
                            r.d().a(f6872j, "Ignoring " + pVar + ". Requires device idle.");
                        } else if (i5 < 24 || dVar2.f5562h.isEmpty()) {
                            hashSet.add(pVar);
                            hashSet2.add(pVar.f10977a);
                        } else {
                            r.d().a(f6872j, "Ignoring " + pVar + ". Requires ContentUri triggers.");
                        }
                    } else if (!this.f6880h.h(Fe.c.s(pVar))) {
                        r.d().a(f6872j, "Starting work for " + pVar.f10977a);
                        q qVar = this.f6874b;
                        s sVar = this.f6880h;
                        sVar.getClass();
                        qVar.g(sVar.y(Fe.c.s(pVar)), null);
                    }
                }
            }
        }
        synchronized (this.f6879g) {
            try {
                if (!hashSet.isEmpty()) {
                    r.d().a(f6872j, "Starting tracking for " + TextUtils.join(",", hashSet2));
                    this.f6876d.addAll(hashSet);
                    this.f6875c.F(this.f6876d);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // K3.c
    public final void d(S3.j jVar, boolean z2) {
        this.f6880h.w(jVar);
        synchronized (this.f6879g) {
            try {
                Iterator it = this.f6876d.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    p pVar = (p) it.next();
                    if (Fe.c.s(pVar).equals(jVar)) {
                        r.d().a(f6872j, "Stopping tracking for " + jVar);
                        this.f6876d.remove(pVar);
                        this.f6875c.F(this.f6876d);
                        break;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // K3.h
    public final boolean e() {
        return false;
    }

    @Override // O3.b
    public final void f(List list) {
        Iterator it = ((ArrayList) list).iterator();
        while (it.hasNext()) {
            S3.j jVarS = Fe.c.s((p) it.next());
            s sVar = this.f6880h;
            if (!sVar.h(jVarS)) {
                r.d().a(f6872j, "Constraints met: Scheduling work ID " + jVarS);
                this.f6874b.g(sVar.y(jVarS), null);
            }
        }
    }
}
