package com.waze.car_lib.r.c.c;

import androidx.core.app.NotificationCompat;
import com.waze.av.b.n;
import com.waze.av.b.y;
import com.waze.bw.b.a.k;
import com.waze.bw.c.d.v;
import com.waze.car_lib.p.ap;
import com.waze.car_lib.p.aq;
import com.waze.car_lib.p.ar;
import com.waze.car_lib.p.as;
import com.waze.car_lib.p.at;
import com.waze.car_lib.p.au;
import com.waze.car_lib.p.av;
import com.waze.car_lib.p.aw;
import com.waze.car_lib.p.ax;
import com.waze.car_lib.p.ay;
import com.waze.car_lib.p.az;
import com.waze.car_lib.p.ba;
import com.waze.car_lib.p.bb;
import com.waze.car_lib.p.bc;
import com.waze.car_lib.p.be;
import com.waze.car_lib.p.bf;
import com.waze.car_lib.p.bg;
import com.waze.car_lib.screens.bd;
import com.waze.main_screen.u.aa;
import com.waze.main_screen.u.ab;
import com.waze.main_screen.u.ae;
import com.waze.main_screen.u.af;
import com.waze.main_screen.u.aj;
import com.waze.main_screen.u.z;
import com.waze.o.ad;
import h.g.b.x;
import java.util.Iterator;
import kotlinx.coroutines.b.ai;
import kotlinx.coroutines.b.bm;
import kotlinx.coroutines.b.bn;
import kotlinx.coroutines.b.bq;
import kotlinx.coroutines.b.bu;
import kotlinx.coroutines.b.ch;
import kotlinx.coroutines.b.ck;
import kotlinx.coroutines.br;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.car_lib.r.c.a.c f21168a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.bn.b f21169b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.car_lib.r.c.b.a f21170c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.shared_infra.q.e f21171d;

    /* renamed from: e, reason: collision with root package name */
    private final com.waze.location.b.d f21172e;

    /* renamed from: f, reason: collision with root package name */
    private final k f21173f;

    /* renamed from: g, reason: collision with root package name */
    private final aj f21174g;

    /* renamed from: h, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f21175h;

    /* renamed from: i, reason: collision with root package name */
    private final af f21176i;

    /* renamed from: j, reason: collision with root package name */
    private final com.waze.shared_infra.o.a f21177j;

    /* renamed from: k, reason: collision with root package name */
    private final bd f21178k;

    /* renamed from: l, reason: collision with root package name */
    private br f21179l;
    private final bn m;
    private final ch n;
    private final bm o;
    private final bq p;

    public i(com.waze.car_lib.r.c.a.c cVar, com.waze.bn.b bVar, com.waze.car_lib.r.c.b.a aVar, com.waze.shared_infra.q.e eVar, com.waze.location.b.d dVar, k kVar, aj ajVar, com.waze.shared_infra.i.e eVar2, af afVar, com.waze.shared_infra.o.a aVar2, bd bdVar) {
        x.f(cVar, "predictionCardAutoConfigRepository");
        x.f(bVar, "roamingProvider");
        x.f(aVar, "getIsRtlLanguageUseCase");
        x.f(eVar, "wazeClock");
        x.f(dVar, "locationProvider");
        x.f(kVar, "routeDurationApi");
        x.f(ajVar, "resumeDriveStateRepository");
        x.f(eVar2, "loggerInterface");
        x.f(afVar, "predictionCardStatsSender");
        x.f(aVar2, "stringProvider");
        x.f(bdVar, "launchParams");
        this.f21168a = cVar;
        this.f21169b = bVar;
        this.f21170c = aVar;
        this.f21171d = eVar;
        this.f21172e = dVar;
        this.f21173f = kVar;
        this.f21174g = ajVar;
        this.f21175h = eVar2;
        this.f21176i = afVar;
        this.f21177j = aVar2;
        this.f21178k = bdVar;
        bn bnVarB = ck.b(bg.f20622a);
        this.m = bnVarB;
        this.n = ai.U(bnVarB);
        bm bmVarC = bu.c(0, 1, kotlinx.coroutines.a.a.f51272b);
        this.o = bmVarC;
        this.p = ai.S(bmVarC);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x008f, code lost:
    
        if (r10 == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ java.lang.Object d(com.waze.car_lib.r.c.c.i r8, com.waze.shared_infra.h.c r9, h.c.e r10) {
        /*
            boolean r0 = r10 instanceof com.waze.car_lib.r.c.c.d
            if (r0 == 0) goto L13
            r0 = r10
            com.waze.car_lib.r.c.c.d r0 = (com.waze.car_lib.r.c.c.d) r0
            int r1 = r0.f21156c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f21156c = r1
            goto L18
        L13:
            com.waze.car_lib.r.c.c.d r0 = new com.waze.car_lib.r.c.c.d
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.f21154a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f21156c
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            e.b.c.b(r10)     // Catch: java.lang.Throwable -> L2b
            goto L92
        L2b:
            r8 = move-exception
            goto L95
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L35:
            com.waze.shared_infra.h.c r9 = r0.f21157d
            r2 = r9
            com.waze.shared_infra.h.c r2 = (com.waze.shared_infra.h.c) r2
            e.b.c.b(r10)
            goto L4e
        L3e:
            e.b.c.b(r10)
            com.waze.location.b.d r10 = r8.f21172e
            r0.f21157d = r9
            r0.f21156c = r4
            java.lang.Object r10 = r10.a(r0)
            if (r10 != r1) goto L4e
            goto L91
        L4e:
            com.waze.location.b.c r10 = (com.waze.location.b.c) r10
            if (r10 != 0) goto L5c
            com.waze.shared_infra.i.e r8 = r8.f21175h
            java.lang.String r9 = "Current location returned null. Not executing ETA request."
            java.lang.CharSequence r9 = (java.lang.CharSequence) r9
            r8.g(r9)
            return r5
        L5c:
            r2 = r8
            com.waze.car_lib.r.c.c.i r2 = (com.waze.car_lib.r.c.c.i) r2     // Catch: java.lang.Throwable -> L2b
            com.waze.bw.b.a.k r8 = r8.f21173f     // Catch: java.lang.Throwable -> L2b
            com.waze.bw.b.a.c r2 = new com.waze.bw.b.a.c     // Catch: java.lang.Throwable -> L2b
            java.lang.String r4 = "id"
            com.waze.bw.b.a.b r6 = new com.waze.bw.b.a.b     // Catch: java.lang.Throwable -> L2b
            com.waze.sharedui.e.c r10 = r10.c()     // Catch: java.lang.Throwable -> L2b
            com.waze.shared_infra.h.c r10 = r10.f()     // Catch: java.lang.Throwable -> L2b
            r6.<init>(r10)     // Catch: java.lang.Throwable -> L2b
            com.waze.bw.b.a.a r10 = new com.waze.bw.b.a.a     // Catch: java.lang.Throwable -> L2b
            com.waze.bw.b.a.b r7 = new com.waze.bw.b.a.b     // Catch: java.lang.Throwable -> L2b
            r7.<init>(r9)     // Catch: java.lang.Throwable -> L2b
            r10.<init>(r7)     // Catch: java.lang.Throwable -> L2b
            com.waze.bw.b.a.i r9 = com.waze.bw.b.a.i.f17695a     // Catch: java.lang.Throwable -> L2b
            com.waze.bw.c.d.v r9 = (com.waze.bw.c.d.v) r9     // Catch: java.lang.Throwable -> L2b
            r2.<init>(r4, r6, r10, r9)     // Catch: java.lang.Throwable -> L2b
            java.util.List r9 = h.a.i.d(r2)     // Catch: java.lang.Throwable -> L2b
            r0.f21157d = r5     // Catch: java.lang.Throwable -> L2b
            r0.f21156c = r3     // Catch: java.lang.Throwable -> L2b
            java.lang.Object r10 = r8.a(r9, r0)     // Catch: java.lang.Throwable -> L2b
            if (r10 != r1) goto L92
        L91:
            return r1
        L92:
            java.util.List r10 = (java.util.List) r10     // Catch: java.lang.Throwable -> L2b
            goto L99
        L95:
            java.lang.Object r10 = e.b.c.a(r8)
        L99:
            java.lang.Throwable r8 = h.m.c(r10)
            if (r8 == 0) goto La3
            java.util.List r10 = h.a.i.h()
        La3:
            java.util.List r10 = (java.util.List) r10
            java.lang.Object r8 = h.a.i.Y(r10)
            boolean r9 = r8 instanceof com.waze.bw.b.a.e
            if (r9 != 0) goto Lae
            return r5
        Lae:
            com.waze.bw.b.a.e r8 = (com.waze.bw.b.a.e) r8
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.car_lib.r.c.c.i.d(com.waze.car_lib.r.c.c.i, com.waze.shared_infra.h.c, h.c.e):java.lang.Object");
    }

    private final com.waze.main_screen.u.a.d k() {
        com.waze.main_screen.u.b bVarA = this.f21178k.a().a();
        com.waze.main_screen.u.b bVar = com.waze.main_screen.u.b.f27685a;
        int iOrdinal = bVarA.ordinal();
        if (iOrdinal == 0) {
            return this.f21168a.a();
        }
        if (iOrdinal == 1) {
            return this.f21168a.b();
        }
        throw new h.i();
    }

    private final n l(com.waze.main_screen.u.a aVar) {
        Object next;
        Iterator it = aVar.b().d().iterator();
        Object obj = null;
        if (it.hasNext()) {
            next = it.next();
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
        } else {
            next = null;
        }
        y yVar = (y) next;
        if (aVar.d() != null) {
            Iterator it2 = aVar.b().b().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next3 = it2.next();
                if (x.n(((com.waze.av.b.c) next3).c(), aVar.d())) {
                    obj = next3;
                    break;
                }
            }
            return v.v(aVar.b(), this.f21177j, (com.waze.av.b.c) obj, null, null, 12);
        }
        if (aVar.c() == null) {
            return v.v(aVar.b(), this.f21177j, null, null, yVar, 6);
        }
        Iterator it3 = aVar.b().c().iterator();
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            Object next4 = it3.next();
            long jA3 = ((com.waze.av.b.h) next4).a();
            Long lC = aVar.c();
            if (lC != null && jA3 == lC.longValue()) {
                obj = next4;
                break;
            }
        }
        return v.v(aVar.b(), this.f21177j, null, (com.waze.av.b.h) obj, yVar, 2);
    }

    private final void m(com.waze.main_screen.u.x xVar) {
        be beVarA;
        au auVarA;
        be beVarA2;
        bn bnVar = this.m;
        Object objD = bnVar.d();
        bf bfVar = objD instanceof bf ? (bf) objD : null;
        boolean z = ((bfVar == null || (beVarA2 = bfVar.a()) == null) ? null : beVarA2.a()) != null;
        Object objD2 = bnVar.d();
        bf bfVar2 = objD2 instanceof bf ? (bf) objD2 : null;
        boolean z2 = (bfVar2 == null || (beVarA = bfVar2.a()) == null || (auVarA = beVarA.a()) == null || !auVarA.c()) ? false : true;
        af afVar = this.f21176i;
        ae aeVarK = a.a.K(k());
        bd bdVar = this.f21178k;
        afVar.a(aeVarK, r(bdVar.a().a()), q(bdVar.a()), p(bdVar.a()), bdVar.a().b().a().d(), z2, z, xVar, bdVar.a().b().a().c().c());
    }

    private final void n(aa aaVar) {
        be beVarA;
        au auVarA;
        be beVarA2;
        bn bnVar = this.m;
        Object objD = bnVar.d();
        bf bfVar = objD instanceof bf ? (bf) objD : null;
        boolean z = ((bfVar == null || (beVarA2 = bfVar.a()) == null) ? null : beVarA2.a()) != null;
        Object objD2 = bnVar.d();
        bf bfVar2 = objD2 instanceof bf ? (bf) objD2 : null;
        boolean z2 = (bfVar2 == null || (beVarA = bfVar2.a()) == null || (auVarA = beVarA.a()) == null || !auVarA.c()) ? false : true;
        af afVar = this.f21176i;
        bd bdVar = this.f21178k;
        afVar.b(r(bdVar.a().a()), q(bdVar.a()), p(bdVar.a()), bdVar.a().b().a().d(), z2, z, aaVar, bdVar.a().b().a().c().c());
    }

    private static final bb o(bd bdVar) {
        com.waze.main_screen.u.b bVarA = bdVar.a().a();
        com.waze.main_screen.u.b bVar = com.waze.main_screen.u.b.f27685a;
        int iOrdinal = bVarA.ordinal();
        if (iOrdinal == 0) {
            return bb.f20609a;
        }
        if (iOrdinal == 1) {
            return bb.f20610b;
        }
        throw new h.i();
    }

    private static final z p(com.waze.main_screen.u.a aVar) {
        com.waze.main_screen.u.b bVarA = aVar.a();
        com.waze.main_screen.u.b bVar = com.waze.main_screen.u.b.f27685a;
        int iOrdinal = bVarA.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return z.f27767d;
            }
            throw new h.i();
        }
        Object obj = null;
        if (aVar.c() != null) {
            Iterator it = aVar.b().c().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                long jA = ((com.waze.av.b.h) next).a();
                Long lC = aVar.c();
                if (lC != null && jA == lC.longValue()) {
                    obj = next;
                    break;
                }
            }
            obj = (com.waze.av.b.h) obj;
        }
        if (obj instanceof com.waze.av.b.e) {
            return z.f27764a;
        }
        if (obj instanceof com.waze.av.b.g) {
            return z.f27765b;
        }
        if (obj instanceof com.waze.av.b.f) {
            return z.f27766c;
        }
        if (obj == null) {
            return z.f27768e;
        }
        throw new h.i();
    }

    private static final ab q(com.waze.main_screen.u.a aVar) {
        Object obj = null;
        if (aVar.d() != null) {
            Iterator it = aVar.b().b().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (x.n(((com.waze.av.b.c) next).c(), aVar.d())) {
                    obj = next;
                    break;
                }
            }
            obj = (com.waze.av.b.c) obj;
        }
        if (obj instanceof com.waze.av.b.a) {
            return ab.f27659b;
        }
        if (obj instanceof com.waze.av.b.b) {
            return ab.f27658a;
        }
        if (obj == null) {
            return ab.f27660c;
        }
        throw new h.i();
    }

    private static final com.waze.main_screen.u.y r(com.waze.main_screen.u.b bVar) {
        com.waze.main_screen.u.b bVar2 = com.waze.main_screen.u.b.f27685a;
        int iOrdinal = bVar.ordinal();
        if (iOrdinal == 0) {
            return com.waze.main_screen.u.y.f27762b;
        }
        if (iOrdinal == 1) {
            return com.waze.main_screen.u.y.f27761a;
        }
        throw new h.i();
    }

    public final bq f() {
        return this.p;
    }

    public final ch g() {
        return this.n;
    }

    public final void h(kotlinx.coroutines.af afVar) {
        com.waze.av.b.h hVar;
        aw awVar;
        com.waze.av.b.c cVar;
        az ayVar;
        Object next;
        Object next2;
        x.f(afVar, "coroutineScope");
        bd bdVar = this.f21178k;
        com.waze.av.a.a aVarB = bdVar.a().b().a().b();
        String strB = aVarB.b();
        String strA = aVarB.a();
        String strF = aVarB.f();
        String strC = aVarB.c();
        String strE = aVarB.e();
        String strG = aVarB.g();
        String strE2 = bdVar.a().b().a().c().e();
        at atVar = new at(strB, strA, strF, strC, strE, strG, strE2 != null ? new com.waze.car_lib.p.bd(strE2) : null);
        if (bdVar.a().c() != null) {
            Iterator it = bdVar.a().b().c().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it.next();
                long jA = ((com.waze.av.b.h) next2).a();
                Long lC = bdVar.a().c();
                if (lC != null && jA == lC.longValue()) {
                    break;
                }
            }
            hVar = (com.waze.av.b.h) next2;
        } else {
            hVar = null;
        }
        if (hVar instanceof com.waze.av.b.e) {
            awVar = av.f20599a;
        } else if (hVar instanceof com.waze.av.b.g) {
            awVar = ax.f20601a;
        } else if (hVar instanceof com.waze.av.b.f) {
            awVar = new aw(((com.waze.av.b.f) hVar).d());
        } else {
            if (hVar != null) {
                throw new h.i();
            }
            awVar = null;
        }
        bc bcVar = new bc(atVar, awVar);
        if (bdVar.a().d() != null) {
            Iterator it2 = bdVar.a().b().b().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it2.next();
                    if (x.n(((com.waze.av.b.c) next).c(), bdVar.a().d())) {
                        break;
                    }
                }
            }
            cVar = (com.waze.av.b.c) next;
        } else {
            cVar = null;
        }
        if (cVar instanceof com.waze.av.b.a) {
            ayVar = new ay(((com.waze.av.b.a) cVar).d());
        } else if (cVar instanceof com.waze.av.b.b) {
            ayVar = ba.f20608a;
        } else {
            if (cVar != null) {
                throw new h.i();
            }
            ayVar = az.f20603a;
        }
        bf bfVar = new bf(new be(bcVar, ayVar, o(bdVar), null), this.f21170c.a());
        bn bnVar = this.m;
        bnVar.e(bfVar);
        this.f21176i.e(a.a.K(k()), r(bdVar.a().a()), q(bdVar.a()), true, p(bdVar.a()), bdVar.a().b().a().d(), false, false, bdVar.a().b().a().c().c());
        com.waze.main_screen.u.a.d dVarK = k();
        if (!x.n(dVarK, com.waze.main_screen.u.a.a.f27651a)) {
            if (dVarK instanceof com.waze.main_screen.u.a.c) {
                Object objD = bnVar.d();
                bf bfVar2 = objD instanceof bf ? (bf) objD : null;
                if (bfVar2 != null) {
                    bnVar.e(bf.i(bfVar2, null, h.o.a.z(((com.waze.main_screen.u.a.c) dVarK).a()), 3));
                }
                this.f21179l = kotlinx.coroutines.aj.z(afVar, null, null, new e(this, null), 3);
            } else {
                if (!(dVarK instanceof com.waze.main_screen.u.a.b)) {
                    throw new h.i();
                }
                this.f21179l = kotlinx.coroutines.aj.z(afVar, null, null, new g(this, dVarK, null), 3);
            }
        }
        if (o(bdVar) == bb.f20609a) {
            kotlinx.coroutines.aj.z(afVar, null, null, new h(this, bdVar, bfVar, null), 3);
        }
    }

    public final void j(ad adVar) {
        Object objD;
        bf bfVarI;
        x.f(adVar, NotificationCompat.CATEGORY_EVENT);
        br brVar = this.f21179l;
        if (brVar != null) {
            brVar.s(null);
        }
        if (this.f21179l != null) {
            this.f21175h.a("Timer is cleared");
        }
        this.f21179l = null;
        bn bnVar = this.m;
        do {
            objD = bnVar.d();
            bfVarI = (com.waze.car_lib.m.c) objD;
            if (bfVarI instanceof bf) {
                bfVarI = bf.i((bf) bfVarI, null, null, 3);
            }
        } while (!bnVar.f(objD, bfVarI));
        if (x.n(adVar, ap.f20585a)) {
            m(com.waze.main_screen.u.x.f27758c);
            n(aa.f27656c);
            if (this.f21178k.a().a() == com.waze.main_screen.u.b.f27686b) {
                this.f21174g.b();
            }
            this.o.c(a.f21142a);
            return;
        }
        if (x.n(adVar, ar.f20587a)) {
            m(com.waze.main_screen.u.x.f27756a);
            n(aa.f27655b);
            this.o.c(new b(l(this.f21178k.a())));
        } else if (x.n(adVar, as.f20588a)) {
            m(com.waze.main_screen.u.x.f27757b);
            this.o.c(new b(l(this.f21178k.a())));
        } else {
            if (!x.n(adVar, aq.f20586a)) {
                throw new h.i();
            }
            n(aa.f27654a);
            this.o.c(a.f21142a);
        }
    }
}
