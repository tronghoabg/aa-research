package com.waze.map.g;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.google.android.datatransport.runtime.scheduling.a.r;
import com.waze.fw;
import com.waze.map.ai;
import com.waze.map.b.ed;
import com.waze.navigate.fr;
import j$.util.Objects;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    private final Object f29053a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f29054b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f29055c;

    /* renamed from: d, reason: collision with root package name */
    private final Object f29056d;

    /* renamed from: e, reason: collision with root package name */
    private final Object f29057e;

    /* renamed from: f, reason: collision with root package name */
    private final Object f29058f;

    /* renamed from: g, reason: collision with root package name */
    private final Object f29059g;

    /* renamed from: h, reason: collision with root package name */
    private final Object f29060h;

    /* renamed from: i, reason: collision with root package name */
    private final Object f29061i;

    public g(com.waze.map.isolated.k kVar, com.waze.shared_infra.q.e eVar, h hVar, ai aiVar, t tVar, f fVar, com.waze.shared_infra.i.e eVar2, h.c.j jVar, x xVar, fr frVar) {
        h.g.b.x.f(kVar, "stackHolderFactory");
        h.g.b.x.f(eVar, "clock");
        h.g.b.x.f(hVar, "navigationAreaGetter");
        h.g.b.x.f(aiVar, "mapLineResolver");
        h.g.b.x.f(tVar, "northLockHelperFactory");
        h.g.b.x.f(fVar, "config");
        h.g.b.x.f(eVar2, "logger");
        h.g.b.x.f(jVar, "coroutineContext");
        h.g.b.x.f(xVar, "automaticRecenterHelper");
        h.g.b.x.f(frVar, "rerouteDetector");
        this.f29053a = eVar;
        this.f29054b = hVar;
        this.f29055c = aiVar;
        this.f29056d = tVar;
        this.f29057e = fVar;
        this.f29058f = eVar2;
        this.f29059g = jVar;
        this.f29060h = xVar;
        this.f29061i = frVar;
    }

    public static /* synthetic */ void f(final g gVar, final com.google.android.datatransport.runtime.x xVar, final int i2, Runnable runnable) {
        try {
            try {
                Object obj = gVar.f29061i;
                Object obj2 = gVar.f29060h;
                Objects.requireNonNull(obj2);
                ((com.google.android.datatransport.runtime.scheduling.a.r) obj).k(new com.google.android.datatransport.runtime.scheduling.jobscheduling.h(obj2, 0));
                NetworkInfo activeNetworkInfo = ((ConnectivityManager) ((Context) gVar.f29055c).getSystemService("connectivity")).getActiveNetworkInfo();
                if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                    ((com.google.android.datatransport.runtime.scheduling.a.r) obj).k(new com.google.android.datatransport.runtime.b.b() { // from class: com.google.android.datatransport.runtime.scheduling.jobscheduling.i
                        @Override // com.google.android.datatransport.runtime.b.b
                        public final Object a() {
                            ((a) this.f4330c.f29054b).a(xVar, i2 + 1);
                            return null;
                        }
                    });
                } else {
                    gVar.c(xVar, i2);
                }
            } catch (com.google.android.datatransport.runtime.b.a unused) {
                ((com.google.android.datatransport.runtime.scheduling.jobscheduling.a) gVar.f29054b).a(xVar, i2 + 1);
            }
        } finally {
            runnable.run();
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.android.datatransport.runtime.c.a, java.lang.Object] */
    public static /* synthetic */ void i(g gVar, List list, com.google.android.datatransport.runtime.x xVar) {
        com.google.android.datatransport.runtime.scheduling.a.r rVar = (com.google.android.datatransport.runtime.scheduling.a.r) gVar.f29060h;
        rVar.n(list);
        rVar.p(xVar, gVar.f29058f.a());
    }

    public static /* synthetic */ void l(g gVar, Map map) {
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            ((com.google.android.datatransport.runtime.scheduling.a.r) gVar.f29056d).o(((Integer) r0.getValue()).intValue(), com.google.android.datatransport.runtime.a.a.f.INVALID_PAYLOD, (String) ((Map.Entry) it.next()).getKey());
        }
    }

    /* JADX WARN: Type inference failed for: r10v0, types: [h.c.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v0, types: [com.waze.map.g.x, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v0, types: [com.waze.navigate.fr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [com.waze.shared_infra.q.e, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [com.waze.map.g.h, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [com.waze.map.ai, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0, types: [com.waze.map.g.f, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v0, types: [com.waze.shared_infra.i.e, java.lang.Object] */
    public final s a(af afVar, kotlinx.coroutines.b.k kVar, ed edVar) {
        h.g.b.x.f(afVar, "scope");
        h.g.b.x.f(kVar, "userLocationPositionBottomOffsetPx");
        h.g.b.x.f(edVar, "mapController");
        h.g.b.x.f(edVar, "default");
        s sVar = new s(edVar, new com.waze.map.isolated.l(edVar), this.f29053a, this.f29054b, this.f29055c, kVar, (t) this.f29056d, this.f29057e, this.f29058f, this.f29059g, this.f29060h, this.f29061i);
        com.waze.ad.c.b.a(afVar, new com.waze.car_lib.e.e(sVar, 16));
        return sVar;
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final void b(com.google.android.datatransport.runtime.x xVar, int i2, Runnable runnable) {
        this.f29059g.execute(new fw(this, xVar, i2, runnable, 1));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.datatransport.runtime.backends.b, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v12, types: [com.google.android.datatransport.runtime.c.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v13, types: [com.google.android.datatransport.runtime.c.a, java.lang.Object] */
    public final void c(final com.google.android.datatransport.runtime.x xVar, int i2) throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        final long j2;
        int i3;
        com.google.android.datatransport.runtime.backends.e eVarA;
        com.google.android.datatransport.runtime.backends.l lVarA = this.f29057e.a(xVar.e());
        while (true) {
            int i4 = 1;
            com.google.android.datatransport.runtime.scheduling.a.r rVar = (com.google.android.datatransport.runtime.scheduling.a.r) this.f29061i;
            if (!((Boolean) rVar.k(new com.google.android.datatransport.runtime.scheduling.jobscheduling.j(this, xVar, i4))).booleanValue()) {
                j2 = 0;
                break;
            }
            int i5 = 0;
            Iterable<com.google.android.datatransport.runtime.scheduling.a.d> iterable = (Iterable) rVar.k(new com.google.android.datatransport.runtime.scheduling.jobscheduling.j(this, xVar, i5));
            ArrayList arrayList = new ArrayList();
            if (!iterable.iterator().hasNext()) {
                return;
            }
            if (lVarA == null) {
                com.google.android.datatransport.cct.e.b("Uploader", "Unknown backend for %s, deleting event batch for it...", xVar);
                eVarA = com.google.android.datatransport.runtime.backends.e.a();
                i3 = 0;
            } else {
                ArrayList arrayList2 = new ArrayList();
                com.google.android.datatransport.runtime.scheduling.a.d dVar = (com.google.android.datatransport.runtime.scheduling.a.d) iterable.iterator().next();
                String strK = dVar.b().k();
                String strL = dVar.b().l();
                for (com.google.android.datatransport.runtime.scheduling.a.d dVar2 : iterable) {
                    com.google.android.datatransport.runtime.n nVarB = dVar2.b();
                    String strK2 = nVarB.k();
                    int i6 = i5;
                    String strL2 = nVarB.l();
                    if (Objects.equals(strK, strK2) && Objects.equals(strL, strL2)) {
                        arrayList2.add(nVarB);
                        arrayList.add(dVar2);
                    }
                    i5 = i6;
                }
                i3 = i5;
                if (xVar.c()) {
                    Object obj = this.f29056d;
                    Objects.requireNonNull(obj);
                    com.google.android.datatransport.runtime.a.a.b bVar = (com.google.android.datatransport.runtime.a.a.b) rVar.k(new com.google.android.datatransport.runtime.scheduling.jobscheduling.h(obj, i4));
                    ?? r5 = this.f29058f;
                    com.google.android.datatransport.runtime.m mVarB = com.google.android.datatransport.runtime.n.b();
                    mVarB.i(r5.a());
                    mVarB.q(this.f29053a.a());
                    mVarB.p("GDT_CLIENT_METRICS");
                    mVarB.n(strK);
                    mVarB.h(new com.google.android.datatransport.runtime.l(com.google.android.datatransport.a.a("proto"), com.google.android.datatransport.runtime.r.b(bVar)));
                    arrayList2.add(lVarA.a(mVarB.a()));
                }
                com.google.android.datatransport.runtime.backends.c cVar = new com.google.android.datatransport.runtime.backends.c();
                cVar.b(arrayList2);
                cVar.c(xVar.f());
                com.google.android.datatransport.runtime.backends.e eVarB = lVarA.b(cVar.a());
                if (strL != null && eVarB.f() != null) {
                    try {
                        Class<?> cls = Class.forName(strL);
                        if (com.google.android.datatransport.e.class.isAssignableFrom(cls)) {
                            Class<?>[] clsArr = new Class[1];
                            clsArr[i3] = Context.class;
                            Constructor<?> constructor = cls.getConstructor(clsArr);
                            Object[] objArr = new Object[1];
                            objArr[i3] = this.f29055c;
                            com.google.android.datatransport.e eVar = (com.google.android.datatransport.e) constructor.newInstance(objArr);
                            if (eVar != null) {
                                eVar.a();
                            }
                        }
                    } catch (Exception e2) {
                        com.google.android.datatransport.cct.e.d("Uploader", "Could not update pseudonymous id via ".concat(strL), e2);
                    }
                }
                eVarA = eVarB;
            }
            int iG = eVarA.g();
            Object obj2 = this.f29061i;
            int i7 = 2;
            if (iG == 2) {
                ((com.google.android.datatransport.runtime.scheduling.a.r) obj2).k(new com.google.android.datatransport.runtime.scheduling.jobscheduling.k(this, arrayList, xVar, i3));
                ((com.google.android.datatransport.runtime.scheduling.jobscheduling.a) this.f29054b).b(xVar, i2 + 1, true);
                return;
            }
            int i8 = i3;
            com.google.android.datatransport.runtime.scheduling.a.r rVar2 = (com.google.android.datatransport.runtime.scheduling.a.r) obj2;
            rVar2.k(new com.google.android.datatransport.runtime.scheduling.jobscheduling.j(this, arrayList, i7));
            if (eVarA.g() == 1) {
                long jMax = Math.max(0L, eVarA.e());
                if (xVar.c()) {
                    rVar2.k(new com.google.android.datatransport.runtime.scheduling.jobscheduling.h(this, i7));
                }
                j2 = jMax;
            } else if (eVarA.g() == 4) {
                HashMap map = new HashMap();
                int size = arrayList.size();
                for (int i9 = i8; i9 < size; i9++) {
                    String strM = ((com.google.android.datatransport.runtime.scheduling.a.d) arrayList.get(i9)).b().m();
                    if (map.containsKey(strM)) {
                        map.put(strM, Integer.valueOf(((Integer) map.get(strM)).intValue() + 1));
                    } else {
                        map.put(strM, 1);
                    }
                }
                rVar2.k(new com.google.android.datatransport.runtime.scheduling.jobscheduling.j(this, map, 3));
            }
        }
        ((com.google.android.datatransport.runtime.scheduling.a.r) this.f29061i).k(new com.google.android.datatransport.runtime.b.b() { // from class: com.google.android.datatransport.runtime.scheduling.jobscheduling.g
            @Override // com.google.android.datatransport.runtime.b.b
            public final Object a() {
                com.waze.map.g.g gVar = this.f4325c;
                ((r) gVar.f29060h).p(xVar, gVar.f29058f.a() + j2);
                return null;
            }
        });
        if (((com.google.android.datatransport.runtime.scheduling.a.r) this.f29060h).s(xVar)) {
            ((com.google.android.datatransport.runtime.scheduling.jobscheduling.a) this.f29054b).b(xVar, i2, true);
        }
    }

    public g(Context context, com.google.android.datatransport.runtime.backends.b bVar, com.google.android.datatransport.runtime.scheduling.a.r rVar, com.google.android.datatransport.runtime.scheduling.jobscheduling.a aVar, Executor executor, com.google.android.datatransport.runtime.scheduling.a.r rVar2, com.google.android.datatransport.runtime.c.a aVar2, com.google.android.datatransport.runtime.c.a aVar3, com.google.android.datatransport.runtime.scheduling.a.r rVar3) {
        this.f29055c = context;
        this.f29057e = bVar;
        this.f29060h = rVar;
        this.f29054b = aVar;
        this.f29059g = executor;
        this.f29061i = rVar2;
        this.f29058f = aVar2;
        this.f29053a = aVar3;
        this.f29056d = rVar3;
    }
}
