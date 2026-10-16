package vd;

import ba.C1521a;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import md.AbstractC3537e;
import md.AbstractC3556y;
import md.C3533a;
import md.C3534b;
import md.C3552u;
import md.L;
import md.O;
import md.P;
import md.k0;
import md.n0;
import od.Y1;
import pb.RunnableC3790a;

/* loaded from: classes5.dex */
public final class r extends O {

    /* renamed from: n, reason: collision with root package name */
    public static final C3533a f47216n = new C3533a("addressTrackerKey");

    /* renamed from: f, reason: collision with root package name */
    public final S1.n f47217f;

    /* renamed from: g, reason: collision with root package name */
    public final n0 f47218g;

    /* renamed from: h, reason: collision with root package name */
    public final C4342e f47219h;

    /* renamed from: i, reason: collision with root package name */
    public final Y1 f47220i;

    /* renamed from: j, reason: collision with root package name */
    public final ScheduledExecutorService f47221j;
    public C1521a k;

    /* renamed from: l, reason: collision with root package name */
    public Long f47222l;

    /* renamed from: m, reason: collision with root package name */
    public final AbstractC3537e f47223m;

    public r(AbstractC3556y abstractC3556y) {
        Y1 y12 = Y1.f41850b;
        AbstractC3537e abstractC3537eD = abstractC3556y.d();
        this.f47223m = abstractC3537eD;
        this.f47219h = new C4342e(new C4341d(this, abstractC3556y));
        this.f47217f = new S1.n();
        n0 n0VarG = abstractC3556y.g();
        Fe.e.t(n0VarG, "syncContext");
        this.f47218g = n0VarG;
        ScheduledExecutorService scheduledExecutorServiceE = abstractC3556y.e();
        Fe.e.t(scheduledExecutorServiceE, "timeService");
        this.f47221j = scheduledExecutorServiceE;
        this.f47220i = y12;
        abstractC3537eD.g(1, "OutlierDetection lb created.");
    }

    public static boolean g(List list) {
        Iterator it = list.iterator();
        int size = 0;
        while (it.hasNext()) {
            size += ((C3552u) it.next()).f40728a.size();
            if (size > 1) {
                return false;
            }
        }
        return true;
    }

    public static ArrayList h(S1.n nVar, int i5) {
        ArrayList arrayList = new ArrayList();
        for (k kVar : nVar.values()) {
            if (kVar.c() >= i5) {
                arrayList.add(kVar);
            }
        }
        return arrayList;
    }

    @Override // md.O
    public final k0 a(L l10) {
        AbstractC3537e abstractC3537e = this.f47223m;
        abstractC3537e.h(1, "Received resolution result: {0}", l10);
        m mVar = (m) l10.f40590c;
        ArrayList arrayList = new ArrayList();
        Iterator it = l10.f40588a.iterator();
        while (it.hasNext()) {
            arrayList.addAll(((C3552u) it.next()).f40728a);
        }
        S1.n nVar = this.f47217f;
        nVar.keySet().retainAll(arrayList);
        Iterator it2 = ((HashMap) nVar.f10890b).values().iterator();
        while (it2.hasNext()) {
            ((k) it2.next()).f47188a = mVar;
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            SocketAddress socketAddress = (SocketAddress) it3.next();
            HashMap map = (HashMap) nVar.f10890b;
            if (!map.containsKey(socketAddress)) {
                map.put(socketAddress, new k(mVar));
            }
        }
        P p10 = mVar.f47203g.f41795a;
        C4342e c4342e = this.f47219h;
        c4342e.i(p10);
        if (mVar.f47201e == null && mVar.f47202f == null) {
            C1521a c1521a = this.k;
            if (c1521a != null) {
                c1521a.j();
                this.f47222l = null;
                for (k kVar : ((HashMap) nVar.f10890b).values()) {
                    if (kVar.d()) {
                        kVar.e();
                    }
                    kVar.f47192e = 0;
                }
            }
        } else {
            Long l11 = this.f47222l;
            Long l12 = mVar.f47197a;
            Long lValueOf = l11 == null ? l12 : Long.valueOf(Math.max(0L, l12.longValue() - (this.f47220i.d() - this.f47222l.longValue())));
            C1521a c1521a2 = this.k;
            if (c1521a2 != null) {
                c1521a2.j();
                for (k kVar2 : ((HashMap) nVar.f10890b).values()) {
                    t6.q qVar = kVar2.f47189b;
                    ((AtomicLong) qVar.f45906a).set(0L);
                    ((AtomicLong) qVar.f45907b).set(0L);
                    t6.q qVar2 = kVar2.f47190c;
                    ((AtomicLong) qVar2.f45906a).set(0L);
                    ((AtomicLong) qVar2.f45907b).set(0L);
                }
            }
            RunnableC3790a runnableC3790a = new RunnableC3790a(this, mVar, abstractC3537e, 7);
            long jLongValue = lValueOf.longValue();
            long jLongValue2 = l12.longValue();
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            n0 n0Var = this.f47218g;
            n0Var.getClass();
            N6.w wVar = new N6.w(runnableC3790a);
            this.k = new C1521a(wVar, this.f47221j.scheduleWithFixedDelay(new W9.w(n0Var, wVar, runnableC3790a, jLongValue2), jLongValue, jLongValue2, timeUnit));
        }
        C3534b c3534b = C3534b.f40612b;
        c4342e.d(new L(l10.f40588a, l10.f40589b, mVar.f47203g.f41796b));
        return k0.f40674e;
    }

    @Override // md.O
    public final void c(k0 k0Var) {
        this.f47219h.c(k0Var);
    }

    @Override // md.O
    public final void f() {
        this.f47219h.f();
    }
}
