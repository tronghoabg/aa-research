package com.waze.car_lib.r;

import android.content.Context;
import android.location.Location;
import androidx.lifecycle.FlowLiveDataConversions;
import com.waze.R;
import com.waze.car_lib.f.gw;
import com.waze.car_lib.f.hc;
import com.waze.config.ConfigValues;
import com.waze.search.stats.SearchStatsSender$SearchCategoryGroup;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class eh {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.shared_infra.o.a f21524a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.car_lib.n.r f21525b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.car_lib.n.j f21526c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.location.y f21527d;

    /* renamed from: e, reason: collision with root package name */
    private final com.waze.ev.n f21528e;

    /* renamed from: f, reason: collision with root package name */
    private final com.waze.map.b.cj f21529f;

    /* renamed from: g, reason: collision with root package name */
    private final h.g.a.r f21530g;

    /* renamed from: h, reason: collision with root package name */
    private final h.g.a.r f21531h;

    /* renamed from: i, reason: collision with root package name */
    private final com.waze.search.stats.s f21532i;

    /* renamed from: j, reason: collision with root package name */
    private final com.waze.car_lib.c.l f21533j;

    /* renamed from: k, reason: collision with root package name */
    private final com.waze.navigate.dg f21534k;

    /* renamed from: l, reason: collision with root package name */
    private final com.waze.search.b.d f21535l;
    private final com.waze.search.v2.p m;
    private final com.waze.shared_infra.q.j n;
    private final com.waze.shared_infra.q.e o;
    private final com.waze.shared_infra.q.r p;
    private final com.waze.navigate.cj q;
    private final com.waze.z r;
    private boolean s;
    private final kotlinx.coroutines.b.bn t;
    private int u;
    private gw v;
    private final com.waze.car_lib.p.by w;
    private boolean x;

    public eh(com.waze.shared_infra.o.a aVar, com.waze.car_lib.n.r rVar, com.waze.car_lib.n.j jVar, com.waze.location.y yVar, com.waze.ev.n nVar, com.waze.map.b.cj cjVar, h.g.a.r rVar2, h.g.a.r rVar3, com.waze.search.stats.s sVar, com.waze.car_lib.c.l lVar, com.waze.navigate.dg dgVar, com.waze.search.b.d dVar, com.waze.search.v2.p pVar, com.waze.shared_infra.q.j jVar2, com.waze.shared_infra.q.e eVar, com.waze.shared_infra.q.r rVar4, com.waze.navigate.cj cjVar2, com.waze.z zVar) {
        h.g.b.x.f(aVar, "stringProvider");
        h.g.b.x.f(rVar, "searchController");
        h.g.b.x.f(jVar, "searchCategories");
        h.g.b.x.f(yVar, "locationEventManager");
        h.g.b.x.f(nVar, "evRepository");
        h.g.b.x.f(cjVar, "mapViewControllerFactory");
        h.g.b.x.f(rVar2, "searchResultNumberIconBitmapFactory");
        h.g.b.x.f(rVar3, "searchResultNumberPinBitmapFactory");
        h.g.b.x.f(sVar, "searchStatsSender");
        h.g.b.x.f(lVar, "searchAnalyticsSender");
        h.g.b.x.f(dgVar, "navigationInfo");
        h.g.b.x.f(dVar, "venueProductsSource");
        h.g.b.x.f(pVar, "config");
        h.g.b.x.f(jVar2, "dateFormat");
        h.g.b.x.f(eVar, "clock");
        h.g.b.x.f(rVar4, "timeUtil");
        h.g.b.x.f(cjVar2, "etaStateInterface");
        h.g.b.x.f(zVar, "appType");
        this.f21524a = aVar;
        this.f21525b = rVar;
        this.f21526c = jVar;
        this.f21527d = yVar;
        this.f21528e = nVar;
        this.f21529f = cjVar;
        this.f21530g = rVar2;
        this.f21531h = rVar3;
        this.f21532i = sVar;
        this.f21533j = lVar;
        this.f21534k = dgVar;
        this.f21535l = dVar;
        this.m = pVar;
        this.n = jVar2;
        this.o = eVar;
        this.p = rVar4;
        this.q = cjVar2;
        this.r = zVar;
        this.t = kotlinx.coroutines.b.ck.b(new com.waze.car_lib.p.bz("", false));
        this.u = -1;
        this.w = new com.waze.car_lib.p.by("", false, R.drawable.icon_outline_info_30px, R.drawable.icon_outline_close_30px, h.a.i.h(), false);
    }

    public static /* synthetic */ h.ab e(eh ehVar, com.waze.av.d.k kVar, com.waze.car_lib.n.v vVar, int i2, Integer num) {
        boolean z = true;
        ehVar.f21533j.f(kVar, vVar, i2 + 1, num);
        gw gwVar = ehVar.v;
        if (gwVar == null) {
            h.g.b.x.j("coordinatorController");
            gwVar = null;
        }
        h.g.b.x.f(kVar, "searchResult");
        gwVar.H(new hc(com.waze.ad.c.b.e(kVar), kVar, z));
        return h.ab.f48028a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x03f5  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /* JADX WARN: Removed duplicated region for block: B:96:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r12v11, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r3v23, types: [java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:60:0x02cf -> B:61:0x02e1). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ java.lang.Object k(com.waze.car_lib.r.eh r22, com.waze.map.b.ed r23, android.content.Context r24, kotlinx.coroutines.af r25, com.waze.car_lib.r.cr r26, int r27, kotlinx.coroutines.b.bm r28, kotlinx.coroutines.b.k r29, com.waze.car_lib.screens.core.l r30, h.c.e r31) {
        /*
            Method dump skipped, instructions count: 1064
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.car_lib.r.eh.k(com.waze.car_lib.r.eh, com.waze.map.b.ed, android.content.Context, kotlinx.coroutines.af, com.waze.car_lib.r.cr, int, kotlinx.coroutines.b.bm, kotlinx.coroutines.b.k, com.waze.car_lib.screens.core.l, h.c.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:43:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(android.content.Context r30, com.waze.av.d.k r31, int r32, com.waze.car_lib.n.v r33, com.waze.car_lib.screens.core.l r34, h.c.e r35) {
        /*
            Method dump skipped, instructions count: 874
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.car_lib.r.eh.l(android.content.Context, com.waze.av.d.k, int, com.waze.car_lib.n.v, com.waze.car_lib.screens.core.l, h.c.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m(android.content.Context r31, java.util.List r32, boolean r33, h.c.e r34) {
        /*
            Method dump skipped, instructions count: 570
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.car_lib.r.eh.m(android.content.Context, java.util.List, boolean, h.c.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(h.c.e r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.waze.car_lib.r.dy
            if (r0 == 0) goto L13
            r0 = r6
            com.waze.car_lib.r.dy r0 = (com.waze.car_lib.r.dy) r0
            int r1 = r0.f21468c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f21468c = r1
            goto L18
        L13:
            com.waze.car_lib.r.dy r0 = new com.waze.car_lib.r.dy
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f21466a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f21468c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            e.b.c.b(r6)     // Catch: java.lang.Throwable -> L4e
            goto L4a
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            e.b.c.b(r6)
            com.waze.search.b.d r5 = r5.f21535l
            kotlinx.coroutines.CompletableDeferred r6 = kotlinx.coroutines.bo.j()
            com.waze.c.e.a.a r2 = new com.waze.c.e.a.a
            r4 = 9
            r2.<init>(r6, r4)
            r5.a(r2)
            r0.f21468c = r3     // Catch: java.lang.Throwable -> L4e
            java.lang.Object r6 = r6.c(r0)     // Catch: java.lang.Throwable -> L4e
            if (r6 == r1) goto L4d
        L4a:
            java.util.List r6 = (java.util.List) r6     // Catch: java.lang.Throwable -> L4e
            goto L53
        L4d:
            return r1
        L4e:
            r5 = move-exception
            java.lang.Object r6 = e.b.c.a(r5)
        L53:
            java.lang.Throwable r5 = h.m.c(r6)
            if (r5 != 0) goto L5a
            return r6
        L5a:
            java.util.Objects.toString(r5)
            java.lang.String r5 = r5.toString()
            java.lang.String r6 = "Failed to get gas prices: "
            java.lang.String r5 = r6.concat(r5)
            com.waze.shared_infra.i.h.c(r5)
            java.util.List r5 = h.a.i.h()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.car_lib.r.eh.n(h.c.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(com.waze.car_lib.n.v r9, h.c.e r10) {
        /*
            Method dump skipped, instructions count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.car_lib.r.eh.o(com.waze.car_lib.n.v, h.c.e):java.lang.Object");
    }

    private final void p(com.waze.map.b.ed edVar) {
        Location location = (Location) this.f21527d.c().d();
        if (location != null) {
            edVar.a(new com.waze.map.b.bg(new com.waze.map.b.ea(false, new com.waze.map.b.bs(32, 32, 32, 32), 1), new com.waze.map.b.co(h.a.i.d(com.waze.notifications.c.k.l(location)), null, 0.0f, 6), null, false, 4));
        }
    }

    private static final h.k q(com.waze.av.d.k kVar) {
        String strB = kVar.B();
        return (strB == null || strB.length() == 0) ? new h.k(com.waze.search.h.cd.f(kVar.a()), null) : new h.k(kVar.B(), com.waze.search.h.cd.f(kVar.a()));
    }

    public final h.k d(Context context, kotlinx.coroutines.af afVar, gw gwVar, com.waze.car_lib.n.v vVar, int i2, kotlinx.coroutines.b.k kVar, com.waze.car_lib.screens.core.l lVar) {
        h.g.b.x.f(context, "context");
        h.g.b.x.f(afVar, "scope");
        h.g.b.x.f(gwVar, "coordinatorController");
        h.g.b.x.f(vVar, "query");
        h.g.b.x.f(kVar, "focusedItemsFlow");
        h.g.b.x.f(lVar, "screenThrottleCallback");
        Boolean boolB = ConfigValues.CONFIG_VALUE_ND4C_ALGO_TRANSPARENCY_FEATURE_ENABLED.b();
        h.g.b.x.e(boolB, "getValue(...)");
        this.x = boolB.booleanValue();
        kotlinx.coroutines.b.bm bmVarE = kotlinx.coroutines.b.bu.e(1, 0, null, 6);
        this.v = gwVar;
        this.f21525b.d(vVar, afVar);
        com.waze.shared_infra.i.e eVarD = com.waze.shared_infra.i.a.d("SearchResultsViewModel");
        h.g.b.x.e(eVarD, "create(...)");
        com.waze.map.b.ed edVarA = this.f21529f.a(eVarD, com.waze.map.b.ch.f28144a);
        kotlinx.coroutines.aj.z(afVar, null, null, new eb(this, edVarA, context, afVar, i2, bmVarE, kVar, lVar, null), 3);
        kotlinx.coroutines.aj.z(afVar, null, null, new ed(bmVarE, kVar, this, edVarA, (h.c.e) null, 0), 3);
        return new h.k(FlowLiveDataConversions.asLiveData$default(this.t, (h.c.j) null, 0L, 3, (Object) null), edVarA);
    }

    public final void f(boolean z) {
        boolean z2;
        com.waze.car_lib.p.by byVarG;
        this.s = z;
        while (true) {
            kotlinx.coroutines.b.bn bnVar = this.t;
            Object objD = bnVar.d();
            bq bqVar = (bq) bnVar.d();
            if (bqVar instanceof com.waze.car_lib.p.bz) {
                byVarG = com.waze.car_lib.p.bz.a((com.waze.car_lib.p.bz) bqVar, z);
                z2 = z;
            } else {
                if (!(bqVar instanceof com.waze.car_lib.p.by)) {
                    throw new h.i();
                }
                z2 = z;
                byVarG = com.waze.car_lib.p.by.g((com.waze.car_lib.p.by) bqVar, null, false, null, z2, 31);
            }
            if (bnVar.f(objD, byVarG)) {
                return;
            } else {
                z = z2;
            }
        }
    }

    public final void g(List list, int i2, int i3) {
        Integer numValueOf;
        com.waze.av.d.k kVar;
        Iterator it;
        int i4;
        String str;
        com.waze.search.stats.r rVarB;
        com.waze.av.d.j jVarC;
        List listB;
        Object next;
        h.g.b.x.f(list, "items");
        int i5 = this.u + 1;
        if (i3 > i5) {
            int iMax = Math.max(i5, i2);
            Iterator it2 = list.subList(iMax, Math.min(i3, list.size())).iterator();
            int i6 = 0;
            while (it2.hasNext()) {
                Object next2 = it2.next();
                int i7 = i6 + 1;
                if (i6 < 0) {
                    h.a.i.p();
                }
                com.waze.car_lib.p.bw bwVar = (com.waze.car_lib.p.bw) next2;
                int i8 = i6 + iMax;
                int i9 = i8 + 1;
                bq bqVarO = bwVar.o();
                com.waze.car_lib.p.bt btVar = bqVarO instanceof com.waze.car_lib.p.bt ? (com.waze.car_lib.p.bt) bqVarO : null;
                if (btVar != null) {
                    Iterator it3 = btVar.b().iterator();
                    int iA = 0;
                    while (it3.hasNext()) {
                        iA += ((com.waze.car_lib.p.bu) it3.next()).a();
                    }
                    numValueOf = Integer.valueOf(iA);
                } else {
                    numValueOf = null;
                }
                Object objD = this.f21525b.b().d();
                com.waze.car_lib.n.n nVar = objD instanceof com.waze.car_lib.n.n ? (com.waze.car_lib.n.n) objD : null;
                if (nVar == null || (listB = nVar.b()) == null) {
                    kVar = null;
                } else {
                    Iterator it4 = listB.iterator();
                    while (true) {
                        if (!it4.hasNext()) {
                            next = null;
                            break;
                        } else {
                            next = it4.next();
                            if (h.g.b.x.n(((com.waze.av.d.k) next).A(), bwVar.n())) {
                                break;
                            }
                        }
                    }
                    kVar = (com.waze.av.d.k) next;
                }
                com.waze.search.stats.s sVar = this.f21532i;
                String strJ = com.waze.car_lib.o.ae.j(bwVar.c());
                SearchStatsSender$SearchCategoryGroup searchStatsSender$SearchCategoryGroupL = com.waze.c.c.e.l(bwVar.c());
                com.waze.av.d.k kVar2 = kVar;
                String strN = bwVar.n();
                long jIntValue = bwVar.h() != null ? r14.intValue() : -1L;
                String strC = bwVar.c().c();
                if (kVar2 == null || (jVarC = kVar2.c()) == null) {
                    it = it2;
                    i4 = iMax;
                    str = strC;
                    rVarB = null;
                } else {
                    it = it2;
                    i4 = iMax;
                    str = strC;
                    rVarB = com.waze.search.v2.cv.b(jVarC, kVar2.d(), this.o, kVar2.z(), com.waze.navigate.et.v(this.q));
                }
                sVar.p(i9, strJ, searchStatsSender$SearchCategoryGroupL, strN, jIntValue, str, rVarB, kVar2 != null ? kVar2.i() : null, kVar2 != null ? kVar2.k() : null, null, numValueOf, null, null, null, false, com.b.b.a.u.g(this.r));
                this.u = i8;
                it2 = it;
                i6 = i7;
                iMax = i4;
            }
        }
    }
}
