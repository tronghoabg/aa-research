package com.waze.bw.a.b;

import com.waze.av.b.aa;
import com.waze.av.b.ah;
import com.waze.av.b.at;
import com.waze.av.b.y;
import h.g.b.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.b.ai;
import kotlinx.coroutines.b.bm;
import kotlinx.coroutines.b.bn;
import kotlinx.coroutines.b.bq;
import kotlinx.coroutines.b.bu;
import kotlinx.coroutines.b.ch;
import kotlinx.coroutines.b.ck;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    private final ah f17615a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.bw.a.a.c f17616b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.bw.b.a.p f17617c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.sharedui.e.g f17618d;

    /* renamed from: e, reason: collision with root package name */
    private final com.waze.shared_infra.q.e f17619e;

    /* renamed from: f, reason: collision with root package name */
    private final com.waze.bn.b f17620f;

    /* renamed from: g, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f17621g;

    /* renamed from: h, reason: collision with root package name */
    private final com.waze.bw.b.b.h f17622h;

    /* renamed from: i, reason: collision with root package name */
    private final com.waze.car_lib.c.i f17623i;

    /* renamed from: j, reason: collision with root package name */
    private final bn f17624j;

    /* renamed from: k, reason: collision with root package name */
    private final ch f17625k;

    /* renamed from: l, reason: collision with root package name */
    private final bm f17626l;
    private final bq m;

    public v(ah ahVar, com.waze.bw.a.a.c cVar, com.waze.bw.b.a.p pVar, com.waze.sharedui.e.g gVar, com.waze.shared_infra.q.e eVar, com.waze.bn.b bVar, com.waze.shared_infra.i.e eVar2, com.waze.bw.b.b.h hVar, com.waze.car_lib.c.i iVar, com.waze.o.c.c.b bVar2) {
        x.f(ahVar, "wazePlaceRepository");
        x.f(cVar, "startStateAutoConfigRepository");
        x.f(pVar, "startStateEtaRepository");
        x.f(gVar, "wazeLocationService");
        x.f(eVar, "wazeClock");
        x.f(bVar, "roamingStateProvider");
        x.f(eVar2, "loggerInterface");
        x.f(hVar, "startStateStatsSender");
        x.f(iVar, "inCarMainScreenStatsReporter");
        x.f(bVar2, "companinioConfig");
        this.f17615a = ahVar;
        this.f17616b = cVar;
        this.f17617c = pVar;
        this.f17618d = gVar;
        this.f17619e = eVar;
        this.f17620f = bVar;
        this.f17621g = eVar2;
        this.f17622h = hVar;
        this.f17623i = iVar;
        Locale locale = Locale.getDefault();
        x.e(locale, "getDefault(...)");
        bn bnVarB = ck.b(new com.waze.bw.a.c.r(locale, false, false, false, h.a.i.h(), h.a.i.h(), false, false, bVar2.d()));
        this.f17624j = bnVarB;
        this.f17625k = ai.U(bnVarB);
        bm bmVarC = bu.c(0, 1, kotlinx.coroutines.a.a.f51272b);
        this.f17626l = bmVarC;
        this.m = ai.S(bmVarC);
    }

    static final com.waze.bw.a.c.e f(v vVar, Map map, h.k kVar) {
        com.waze.bw.a.c.f fVar;
        com.waze.bw.a.c.n nVar;
        com.waze.bw.a.c.i iVar;
        com.waze.bw.a.c.c cVarS;
        com.waze.bw.b.a.j jVarC;
        x.f(kVar, "<destruct>");
        com.waze.av.b.c cVar = (com.waze.av.b.c) kVar.a();
        aa aaVar = (aa) kVar.b();
        com.waze.bw.b.a.f fVar2 = (com.waze.bw.b.a.f) map.get(cVar.c());
        com.waze.bw.a.c.d dVarT = t(aaVar);
        com.waze.bw.a.c.d dVar = null;
        if (dVarT == null) {
            return null;
        }
        if (fVar2 != null) {
            h.o.c cVar2 = h.o.a.f48264a;
            long jP = h.o.a.p(h.o.c.j(vVar.f17619e.a(), h.o.d.f48272c));
            long jP2 = h.o.a.p(vVar.f17616b.b());
            if (fVar2 instanceof com.waze.bw.b.a.d) {
                com.waze.bw.b.a.d dVar2 = (com.waze.bw.b.a.d) fVar2;
                if (jP + jP2 > dVar2.b()) {
                    fVar = new com.waze.bw.a.c.f(h.o.c.j(dVar2.a() - dVar2.b(), h.o.d.f48273d));
                } else {
                    long jB = dVar2.b();
                    h.o.d dVar3 = h.o.d.f48273d;
                    fVar = new com.waze.bw.a.c.g(com.waze.sharedui.utils.b.a(h.o.a.m(h.o.c.j(jB, dVar3))), com.waze.sharedui.utils.b.a(h.o.a.m(h.o.c.j(dVar2.a(), dVar3))));
                }
            } else {
                if (!(fVar2 instanceof com.waze.bw.b.a.e)) {
                    throw new h.i();
                }
                fVar = new com.waze.bw.a.c.f(((com.waze.bw.b.a.e) fVar2).a());
            }
        } else {
            fVar = null;
        }
        if (fVar2 == null || (jVarC = fVar2.c()) == null) {
            nVar = null;
        } else {
            int iOrdinal = jVarC.ordinal();
            if (iOrdinal == 0) {
                nVar = com.waze.bw.a.c.n.f17657a;
            } else if (iOrdinal == 1) {
                nVar = com.waze.bw.a.c.n.f17658b;
            } else {
                if (iOrdinal != 2) {
                    throw new h.i();
                }
                nVar = com.waze.bw.a.c.n.f17659c;
            }
        }
        if (cVar instanceof com.waze.av.b.a) {
            com.waze.av.b.a aVar = (com.waze.av.b.a) cVar;
            iVar = new com.waze.bw.a.c.h(aVar.a(), fVar, aVar.d());
        } else {
            if (!(cVar instanceof com.waze.av.b.b)) {
                throw new h.i();
            }
            com.waze.av.b.b bVar = (com.waze.av.b.b) cVar;
            long jA = bVar.a();
            com.waze.av.a.p pVarE = bVar.e();
            if (pVarE != null && (cVarS = s(pVarE)) != null) {
                dVar = new com.waze.bw.a.c.d(cVarS, null);
            }
            iVar = new com.waze.bw.a.c.i(jA, fVar, dVar);
        }
        return new com.waze.bw.a.c.e(dVarT, iVar, nVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x007f, code lost:
    
        if (r5.a(r7, r2, r0) == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ java.lang.Object i(com.waze.bw.a.b.v r5, java.util.List r6, h.c.e r7) {
        /*
            boolean r0 = r7 instanceof com.waze.bw.a.b.t
            if (r0 == 0) goto L13
            r0 = r7
            com.waze.bw.a.b.t r0 = (com.waze.bw.a.b.t) r0
            int r1 = r0.f17611d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f17611d = r1
            goto L18
        L13:
            com.waze.bw.a.b.t r0 = new com.waze.bw.a.b.t
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f17609b
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f17611d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            e.b.c.b(r7)
            goto L82
        L2a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L32:
            java.lang.Object r6 = r0.f17608a
            java.util.List r6 = (java.util.List) r6
            e.b.c.b(r7)
            goto L4d
        L3a:
            e.b.c.b(r7)
            com.waze.sharedui.e.g r7 = r5.f17618d
            kotlinx.coroutines.b.k r7 = r7.d()
            r0.f17608a = r6
            r0.f17611d = r4
            java.lang.Object r7 = kotlinx.coroutines.b.ai.h(r7, r0)
            if (r7 == r1) goto L85
        L4d:
            com.waze.bw.b.a.p r5 = r5.f17617c
            com.waze.sharedui.e.c r7 = (com.waze.sharedui.e.c) r7
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Collection r2 = (java.util.Collection) r2
            java.util.Iterator r6 = r6.iterator()
        L5e:
            boolean r4 = r6.hasNext()
            if (r4 == 0) goto L74
            java.lang.Object r4 = r6.next()
            com.waze.av.b.aa r4 = (com.waze.av.b.aa) r4
            java.util.List r4 = a.a.I(r4)
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            h.a.i.aD(r2, r4)
            goto L5e
        L74:
            java.util.List r2 = (java.util.List) r2
            r6 = 0
            r0.f17608a = r6
            r0.f17611d = r3
            java.lang.Object r5 = r5.a(r7, r2, r0)
            if (r5 != r1) goto L82
            goto L85
        L82:
            h.ab r5 = h.ab.f48028a
            return r5
        L85:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.bw.a.b.v.i(com.waze.bw.a.b.v, java.util.List, h.c.e):java.lang.Object");
    }

    public static final /* synthetic */ List j(v vVar, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            aa aaVar = (aa) it.next();
            List listD = aaVar.d();
            ArrayList arrayList2 = new ArrayList(h.a.i.q(listD, 10));
            Iterator it2 = listD.iterator();
            while (it2.hasNext()) {
                arrayList2.add(new h.k((y) it2.next(), aaVar));
            }
            h.a.i.aD(arrayList, arrayList2);
        }
        List listAl = h.a.i.al(arrayList, new com.waze.car_lib.r.d.k(8));
        ArrayList arrayList3 = new ArrayList(h.a.i.q(listAl, 10));
        Iterator it3 = listAl.iterator();
        while (it3.hasNext()) {
            arrayList3.add((aa) ((h.k) it3.next()).b());
        }
        com.waze.bw.a.a.c cVar = vVar.f17616b;
        List listAm = h.a.i.am(com.waze.bw.a.c.b.c(arrayList3, cVar.c()), cVar.a());
        ArrayList arrayList4 = new ArrayList();
        Iterator it4 = listAm.iterator();
        while (it4.hasNext()) {
            com.waze.bw.a.c.d dVarT = t((aa) it4.next());
            if (dVarT != null) {
                arrayList4.add(dVarT);
            }
        }
        return arrayList4;
    }

    private final void p(com.waze.modules.navigation.ah ahVar) {
        Object obj;
        this.f17623i.a(com.waze.car_lib.c.g.f19228a, ahVar == com.waze.modules.navigation.ah.y);
        aa aaVarE = at.e(this.f17615a);
        if (aaVarE == null) {
            this.f17621g.a("Invalid State: No home place exists");
            return;
        }
        for (com.waze.av.b.h hVar : aaVarE.c()) {
            if (hVar instanceof com.waze.av.b.e) {
                Iterator it = aaVarE.d().iterator();
                if (it.hasNext()) {
                    Object next = it.next();
                    if (it.hasNext()) {
                        long jA = ((y) next).a();
                        do {
                            Object next2 = it.next();
                            long jA2 = ((y) next2).a();
                            if (jA < jA2) {
                                jA = jA2;
                            }
                            if (jA < jA2) {
                                next = next2;
                            }
                        } while (it.hasNext());
                    }
                    obj = next;
                } else {
                    obj = null;
                }
                this.f17626l.c(new c(com.waze.bw.c.d.v.v(aaVarE, null, null, hVar, (y) obj, 3), ahVar));
                return;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    private final void q(af afVar) {
        aj.z(afVar, null, null, new o(this, (h.c.e) null, 5, (boolean[]) null), 3);
    }

    private final void r(com.waze.modules.navigation.ah ahVar) {
        Object obj;
        this.f17623i.a(com.waze.car_lib.c.g.f19229b, ahVar == com.waze.modules.navigation.ah.y);
        aa aaVarF = at.f(this.f17615a);
        if (aaVarF == null) {
            this.f17621g.a("Invalid State: No work place exists");
            return;
        }
        for (com.waze.av.b.h hVar : aaVarF.c()) {
            if (hVar instanceof com.waze.av.b.g) {
                Iterator it = aaVarF.d().iterator();
                if (it.hasNext()) {
                    Object next = it.next();
                    if (it.hasNext()) {
                        long jA = ((y) next).a();
                        do {
                            Object next2 = it.next();
                            long jA2 = ((y) next2).a();
                            if (jA < jA2) {
                                jA = jA2;
                            }
                            if (jA < jA2) {
                                next = next2;
                            }
                        } while (it.hasNext());
                    }
                    obj = next;
                } else {
                    obj = null;
                }
                this.f17626l.c(new c(com.waze.bw.c.d.v.v(aaVarF, null, null, hVar, (y) obj, 3), ahVar));
                return;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    private static final com.waze.bw.a.c.c s(com.waze.av.a.p pVar) {
        String strE;
        Integer numE = pVar.e();
        com.waze.bw.a.c.o oVar = null;
        if (numE == null) {
            return null;
        }
        int iIntValue = numE.intValue();
        String strB = pVar.b().b();
        String strA = pVar.b().a();
        String strF = pVar.b().f();
        String strC = pVar.b().c();
        String strE2 = pVar.b().e();
        String strG = pVar.b().g();
        if (pVar.c().c() != null && (strE = pVar.c().e()) != null && strE.length() != 0) {
            String strE3 = pVar.c().e();
            if (strE3 == null) {
                strE3 = "";
            }
            oVar = new com.waze.bw.a.c.o(strE3, pVar.c().d());
        }
        return new com.waze.bw.a.c.c(iIntValue, strB, strA, strF, strC, strE2, strG, oVar);
    }

    private static final com.waze.bw.a.c.d t(aa aaVar) {
        com.waze.bw.a.c.c cVarS = s(aaVar.a());
        com.waze.bw.a.c.l lVar = null;
        if (cVarS == null) {
            return null;
        }
        com.waze.av.b.h hVar = (com.waze.av.b.h) h.a.i.R(aaVar.c());
        if (hVar instanceof com.waze.av.b.e) {
            lVar = com.waze.bw.a.c.k.f17653a;
        } else if (hVar instanceof com.waze.av.b.g) {
            lVar = com.waze.bw.a.c.m.f17656a;
        } else if (hVar instanceof com.waze.av.b.f) {
            com.waze.av.b.f fVar = (com.waze.av.b.f) hVar;
            lVar = new com.waze.bw.a.c.l(fVar.a(), fVar.d());
        } else if (hVar != null) {
            throw new h.i();
        }
        return new com.waze.bw.a.c.d(cVarS, lVar);
    }

    public final bq l() {
        return this.m;
    }

    public final ch m() {
        return this.f17625k;
    }

    public final void n(af afVar) {
        x.f(afVar, "coroutineScope");
        aj.z(afVar, null, null, new o(this, (h.c.e) null, 3, (short[]) null), 3);
        aj.z(afVar, null, null, new q(this, afVar, (h.c.e) null, 0), 3);
        aj.z(afVar, null, null, new o(this, (h.c.e) null, 4, (int[]) null), 3);
        aj.z(afVar, null, null, new o(this, (h.c.e) null, 1, (byte[]) null), 3);
        aj.z(afVar, null, null, new o(this, null, 0), 3);
        aj.z(afVar, null, null, new o(this, (h.c.e) null, 2, (char[]) null), 3);
        q(afVar);
        aj.z(afVar, null, null, new o(this, (h.c.e) null, 6, (float[]) null), 3);
        q(afVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x015e  */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void o(com.waze.bw.a.c.b r13) {
        /*
            Method dump skipped, instructions count: 682
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.bw.a.b.v.o(com.waze.bw.a.c.b):void");
    }
}
