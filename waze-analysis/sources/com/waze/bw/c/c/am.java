package com.waze.bw.c.c;

import com.waze.bw.c.d.a.bz;
import com.waze.bw.c.d.bh;
import com.waze.bw.c.d.bj;
import com.waze.bw.c.d.bk;
import com.waze.bw.c.d.bo;
import com.waze.bw.c.d.bp;
import com.waze.bw.c.d.bt;
import com.waze.bw.c.d.bu;
import com.waze.bw.c.d.cf;
import com.waze.bw.c.d.cu;
import com.waze.bw.c.d.cv;
import com.waze.bw.c.d.cw;
import com.waze.bw.c.d.da;
import com.waze.bw.c.d.db;
import com.waze.bw.c.d.de;
import com.waze.bw.c.d.dg;
import com.waze.bw.c.d.dh;
import com.waze.bw.c.d.dj;
import com.waze.navigate.en;
import com.waze.network.b.ay;
import com.waze.sound.df;
import com.waze.sound.hn;
import com.waze.sound.jr;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.b.bm;
import kotlinx.coroutines.b.bn;
import kotlinx.coroutines.b.bq;
import kotlinx.coroutines.b.ch;
import kotlinx.coroutines.b.ck;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class am implements x {
    private final bq A;

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.bw.c.a.j f17797a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.av.b.ah f17798b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.b.u f17799c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.bw.c.a.c f17800d;

    /* renamed from: e, reason: collision with root package name */
    private final com.waze.bw.c.b.a f17801e;

    /* renamed from: f, reason: collision with root package name */
    private final com.waze.bw.c.b.c f17802f;

    /* renamed from: g, reason: collision with root package name */
    private final com.waze.bn.b f17803g;

    /* renamed from: h, reason: collision with root package name */
    private final jr f17804h;

    /* renamed from: i, reason: collision with root package name */
    private final hn f17805i;

    /* renamed from: j, reason: collision with root package name */
    private final com.waze.sharedui.e.g f17806j;

    /* renamed from: k, reason: collision with root package name */
    private final com.waze.bw.b.a.p f17807k;

    /* renamed from: l, reason: collision with root package name */
    private final en f17808l;
    private final com.waze.shared_infra.q.e m;
    private final com.waze.network.z n;
    private final com.waze.network.b.al o;
    private final com.waze.shared_infra.i.e p;
    private final com.waze.bw.b.b.h q;
    private final com.waze.br.c.e r;
    private final com.waze.br.b.p s;
    private final kotlinx.coroutines.af t;
    private boolean u;
    private com.waze.br.c.o v;
    private final ax w;
    private final bn x;
    private final ch y;
    private final bm z;

    public am(com.waze.bw.c.a.j jVar, com.waze.av.b.ah ahVar, com.waze.b.u uVar, com.waze.bw.c.a.c cVar, com.waze.bw.c.b.a aVar, com.waze.bw.c.b.c cVar2, com.waze.bn.b bVar, jr jrVar, hn hnVar, com.waze.sharedui.e.g gVar, com.waze.bw.b.a.p pVar, en enVar, com.waze.shared_infra.q.e eVar, com.waze.network.z zVar, com.waze.network.b.al alVar, com.waze.shared_infra.i.e eVar2, com.waze.bw.b.b.h hVar, com.waze.br.c.e eVar3, com.waze.br.b.p pVar2) {
        h.g.b.x.f(jVar, "startStateMobileConfigRepository");
        h.g.b.x.f(ahVar, "wazePlaceRepository");
        h.g.b.x.f(uVar, "ageRestrictionRepository");
        h.g.b.x.f(cVar, "calendarConfigRepository");
        h.g.b.x.f(aVar, "calendarPermissionRequestLauncher");
        h.g.b.x.f(cVar2, "getDriveHistoryUrlUseCase");
        h.g.b.x.f(bVar, "roamingStateProvider");
        h.g.b.x.f(jrVar, "voiceSearchTypeRepository");
        h.g.b.x.f(hnVar, "triggerVoiceTypingUseCase");
        h.g.b.x.f(gVar, "wazeLocationService");
        h.g.b.x.f(pVar, "startStateEtaRepository");
        h.g.b.x.f(enVar, "navigationStateProvider");
        h.g.b.x.f(eVar, "wazeClock");
        h.g.b.x.f(zVar, "networkEventManager");
        h.g.b.x.f(alVar, "networkStatusIndicatorUseCase");
        h.g.b.x.f(eVar2, "logger");
        h.g.b.x.f(hVar, "startStateStatsSender");
        h.g.b.x.f(eVar3, "searchMateSessionStateHolderFactory");
        h.g.b.x.f(pVar2, "searchMateControllerFactory");
        this.f17797a = jVar;
        this.f17798b = ahVar;
        this.f17799c = uVar;
        this.f17800d = cVar;
        this.f17801e = aVar;
        this.f17802f = cVar2;
        this.f17803g = bVar;
        this.f17804h = jrVar;
        this.f17805i = hnVar;
        this.f17806j = gVar;
        this.f17807k = pVar;
        this.f17808l = enVar;
        this.m = eVar;
        this.n = zVar;
        this.o = alVar;
        this.p = eVar2;
        this.q = hVar;
        this.r = eVar3;
        this.s = pVar2;
        this.t = com.waze.ui.a.l.p(this, null);
        this.w = new ax(ahVar, cVar2, hVar, eVar2);
        cf cfVar = new cf(new bu(pVar2.a() != null ? bt.f18001c : bt.f17999a), new bo(false, false, false, false, h.a.i.h()), h.a.i.h(), h.a.i.h(), false, false, false, false);
        h.o.c cVar3 = h.o.a.f48264a;
        bn bnVarB = ck.b(new com.waze.bw.c.d.l(cfVar, h.o.c.i(0, h.o.d.f48273d)));
        this.x = bnVarB;
        this.y = kotlinx.coroutines.b.ai.U(bnVarB);
        bm bmVarC = kotlinx.coroutines.b.bu.c(0, 1, kotlinx.coroutines.a.a.f51272b);
        this.z = bmVarC;
        this.A = kotlinx.coroutines.b.ai.S(bmVarC);
    }

    private final int A() {
        List listD = ((com.waze.bw.c.d.l) this.x.d()).b().d();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listD) {
            if (((cw) obj).b() instanceof da) {
                arrayList.add(obj);
            }
        }
        return arrayList.size();
    }

    private final int B() {
        List listD = ((com.waze.bw.c.d.l) this.x.d()).b().d();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listD) {
            if (((cw) obj).b() instanceof db) {
                arrayList.add(obj);
            }
        }
        return arrayList.size();
    }

    private final int C() {
        cf cfVarB = ((com.waze.bw.c.d.l) this.x.d()).b();
        return cfVarB.d().size() + cfVarB.c().size();
    }

    private final com.waze.bw.b.b.f D() {
        bo boVarA = ((com.waze.bw.c.d.l) this.x.d()).b().a();
        return new com.waze.bw.b.b.f(boVarA.a().size(), boVarA.d(), boVarA.e());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List E(List list) {
        return h.m.k.j(h.m.k.o(h.m.k.r(h.m.k.q(h.m.k.k(h.m.k.n(h.a.i.av(list), new df(17)), y.f17866a), new com.waze.car_lib.r.d.k(10)), (int) h.k.n.k(this.f17797a.f(), 0L)), new df(18)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List F(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            com.waze.av.b.aa aaVar = (com.waze.av.b.aa) it.next();
            List listD = aaVar.d();
            ArrayList arrayList2 = new ArrayList(h.a.i.q(listD, 10));
            Iterator it2 = listD.iterator();
            while (it2.hasNext()) {
                arrayList2.add(new h.k((com.waze.av.b.y) it2.next(), aaVar));
            }
            h.a.i.aD(arrayList, arrayList2);
        }
        List listAl = h.a.i.al(arrayList, new com.waze.car_lib.r.d.k(11));
        ArrayList arrayList3 = new ArrayList(h.a.i.q(listAl, 10));
        Iterator it3 = listAl.iterator();
        while (it3.hasNext()) {
            arrayList3.add((com.waze.av.b.aa) ((h.k) it3.next()).b());
        }
        com.waze.bw.c.a.j jVar = this.f17797a;
        List listAm = h.a.i.am(com.waze.bw.a.c.b.c(arrayList3, jVar.e()), jVar.b());
        ArrayList arrayList4 = new ArrayList();
        Iterator it4 = listAm.iterator();
        while (it4.hasNext()) {
            cv cvVarL = L((com.waze.av.b.aa) it4.next());
            if (cvVarL != null) {
                arrayList4.add(cvVarL);
            }
        }
        return arrayList4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0158  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List G(java.util.List r14, java.util.Map r15) {
        /*
            Method dump skipped, instructions count: 432
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.bw.c.c.am.G(java.util.List, java.util.Map):java.util.List");
    }

    private final void H(bp bpVar) {
        cv cvVarL;
        cv cvVarL2;
        cv cvVarL3;
        if (h.g.b.x.n(bpVar, com.waze.bw.c.d.ac.f17953a)) {
            this.q.e(com.waze.destination_cell.c.c.f23531a, C(), com.waze.bw.b.b.b.f17732a, com.waze.bw.b.b.c.f17738a, 1, null, null, B(), A(), D());
            this.z.c(o.f17856a);
            return;
        }
        if (h.g.b.x.n(bpVar, com.waze.bw.c.d.ad.f17954a)) {
            this.q.e(com.waze.destination_cell.c.c.f23531a, C(), com.waze.bw.b.b.b.f17733b, com.waze.bw.b.b.c.f17739b, 2, null, null, B(), A(), D());
            this.z.c(p.f17857a);
            return;
        }
        if (h.g.b.x.n(bpVar, com.waze.bw.c.d.ak.f17961a)) {
            com.waze.av.b.aa aaVarE = com.waze.av.b.at.e(this.f17798b);
            if (aaVarE == null) {
                this.p.g("Invalid data: Home favorite place not found");
                return;
            }
            List listC = aaVarE.c();
            ArrayList arrayList = new ArrayList();
            for (Object obj : listC) {
                if (obj instanceof com.waze.av.b.e) {
                    arrayList.add(obj);
                }
            }
            com.waze.av.b.e eVar = (com.waze.av.b.e) h.a.i.P(arrayList);
            this.q.e(com.waze.destination_cell.c.c.f23531a, C(), com.waze.bw.b.b.b.f17735d, com.waze.bw.b.b.c.f17738a, 1, aaVarE.a().d(), aaVarE.a().c().c(), B(), A(), D());
            J(com.waze.bw.c.d.v.r(aaVarE, eVar));
            return;
        }
        if (h.g.b.x.n(bpVar, com.waze.bw.c.d.aq.f17967a)) {
            com.waze.bw.b.b.f fVarD = D();
            this.q.e(com.waze.destination_cell.c.c.f23531a, C(), com.waze.bw.b.b.b.f17736e, null, fVarD.a() + 3, null, null, B(), A(), fVarD);
            this.z.c(e.f17846a);
            return;
        }
        int i2 = -1;
        int i3 = 0;
        if (bpVar instanceof com.waze.bw.c.d.ar) {
            com.waze.bw.c.d.ar arVar = (com.waze.bw.c.d.ar) bpVar;
            com.waze.av.b.aa aaVarB = com.waze.av.b.at.b(this.f17798b, arVar.a().a());
            if (aaVarB == null) {
                this.p.g("Invalid data: No favorite place found for favorite id " + arVar.a().a());
                return;
            }
            List listC2 = aaVarB.c();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : listC2) {
                if (obj2 instanceof com.waze.av.b.f) {
                    arrayList2.add(obj2);
                }
            }
            com.waze.av.b.f fVar = (com.waze.av.b.f) h.a.i.R(arrayList2);
            if (fVar == null) {
                this.p.g("Invalid data: No named favorite info found for favorite id " + arVar.a().a());
                return;
            }
            Iterator it = ((com.waze.bw.c.d.l) this.x.d()).b().a().a().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((com.waze.bw.c.d.bn) it.next()).a() == arVar.a().a()) {
                    i2 = i3;
                    break;
                }
                i3++;
            }
            this.q.e(com.waze.destination_cell.c.c.f23531a, C(), com.waze.bw.b.b.b.f17735d, com.waze.bw.b.b.c.f17740c, i2 + 3, aaVarB.a().d(), aaVarB.a().c().c(), B(), A(), D());
            J(com.waze.bw.c.d.v.s(aaVarB, fVar));
            return;
        }
        if (h.g.b.x.n(bpVar, com.waze.bw.c.d.at.f17970a)) {
            com.waze.bw.b.b.f fVarD2 = D();
            this.q.e(com.waze.destination_cell.c.c.f23531a, C(), com.waze.bw.b.b.b.f17734c, null, fVarD2.a() + 3, null, null, B(), A(), fVarD2);
            this.z.c(b.f17843a);
            return;
        }
        if (h.g.b.x.n(bpVar, bj.f17990a)) {
            com.waze.av.b.aa aaVarF = com.waze.av.b.at.f(this.f17798b);
            if (aaVarF == null) {
                this.p.g("Invalid data: Work favorite place not found");
                return;
            }
            List listC3 = aaVarF.c();
            ArrayList arrayList3 = new ArrayList();
            for (Object obj3 : listC3) {
                if (obj3 instanceof com.waze.av.b.g) {
                    arrayList3.add(obj3);
                }
            }
            com.waze.av.b.g gVar = (com.waze.av.b.g) h.a.i.P(arrayList3);
            this.q.e(com.waze.destination_cell.c.c.f23531a, C(), com.waze.bw.b.b.b.f17735d, com.waze.bw.b.b.c.f17739b, 2, aaVarF.a().d(), aaVarF.a().c().c(), B(), A(), D());
            J(com.waze.bw.c.d.v.t(aaVarF, gVar));
            return;
        }
        if (h.g.b.x.n(bpVar, com.waze.bw.c.d.al.f17962a)) {
            com.waze.av.b.aa aaVarE2 = com.waze.av.b.at.e(this.f17798b);
            if (aaVarE2 == null || (cvVarL3 = L(aaVarE2)) == null) {
                this.p.g("Invalid data: Home favorite place not found");
                return;
            } else {
                this.q.e(com.waze.destination_cell.c.c.f23532b, C(), com.waze.bw.b.b.b.f17735d, com.waze.bw.b.b.c.f17738a, 1, aaVarE2.a().d(), aaVarE2.a().c().c(), B(), A(), D());
                M(new bz(cvVarL3, de.f18088a, this.f17797a.i()));
                return;
            }
        }
        if (h.g.b.x.n(bpVar, bk.f17991a)) {
            com.waze.av.b.aa aaVarF2 = com.waze.av.b.at.f(this.f17798b);
            if (aaVarF2 == null || (cvVarL2 = L(aaVarF2)) == null) {
                this.p.g("Invalid data: Work favorite place not found");
                return;
            } else {
                this.q.e(com.waze.destination_cell.c.c.f23532b, C(), com.waze.bw.b.b.b.f17735d, com.waze.bw.b.b.c.f17739b, 2, aaVarF2.a().d(), aaVarF2.a().c().c(), B(), A(), D());
                M(new bz(cvVarL2, dg.f18091a, this.f17797a.i()));
                return;
            }
        }
        if (!(bpVar instanceof com.waze.bw.c.d.as)) {
            if (!h.g.b.x.n(bpVar, bh.f17988a)) {
                throw new h.i();
            }
            if (this.u) {
                return;
            }
            this.u = true;
            this.q.f(com.waze.bw.b.b.a.f17730g, C(), B(), A(), D());
            return;
        }
        com.waze.bw.c.d.as asVar = (com.waze.bw.c.d.as) bpVar;
        com.waze.av.b.aa aaVarB2 = com.waze.av.b.at.b(this.f17798b, asVar.a().a());
        if (aaVarB2 == null || (cvVarL = L(aaVarB2)) == null) {
            this.p.g("Invalid data: No favorite place found for favorite id " + asVar.a().a());
            return;
        }
        dh dhVarB = cvVarL.b();
        com.waze.bw.c.d.df dfVar = dhVarB instanceof com.waze.bw.c.d.df ? (com.waze.bw.c.d.df) dhVarB : null;
        if (dfVar == null) {
            this.p.g("Invalid data: Favorite place found for favorite id " + asVar.a().a() + ", but it wasn't a named favorite");
            return;
        }
        Iterator it2 = ((com.waze.bw.c.d.l) this.x.d()).b().a().a().iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            if (((com.waze.bw.c.d.bn) it2.next()).a() == asVar.a().a()) {
                i2 = i3;
                break;
            }
            i3++;
        }
        this.q.e(com.waze.destination_cell.c.c.f23532b, C(), com.waze.bw.b.b.b.f17735d, com.waze.bw.b.b.c.f17740c, i2 + 3, aaVarB2.a().d(), aaVarB2.a().c().c(), B(), A(), D());
        M(new bz(cvVarL, dfVar, this.f17797a.i()));
    }

    private final void I(com.waze.av.b.j jVar, long j2) {
        this.z.c(new t(jVar, j2));
    }

    private final void J(com.waze.av.b.n nVar) {
        this.z.c(new u(nVar));
    }

    private static final cu K(com.waze.av.a.p pVar) {
        Integer numE = pVar.e();
        dj djVar = null;
        if (numE == null) {
            return null;
        }
        int iIntValue = numE.intValue();
        String strB = pVar.b().b();
        String strA = pVar.b().a();
        String strF = pVar.b().f();
        String strC = pVar.b().c();
        String strE = pVar.b().e();
        String strG = pVar.b().g();
        String strE2 = pVar.c().e();
        String str = strE2;
        if (str != null && str.length() != 0) {
            djVar = new dj(strE2);
        }
        return new cu(iIntValue, strB, strA, strF, strC, strE, strG, djVar);
    }

    private static final cv L(com.waze.av.b.aa aaVar) {
        cu cuVarK = K(aaVar.a());
        com.waze.bw.c.d.df dfVar = null;
        if (cuVarK == null) {
            return null;
        }
        com.waze.av.b.h hVar = (com.waze.av.b.h) h.a.i.R(aaVar.c());
        if (hVar instanceof com.waze.av.b.e) {
            dfVar = de.f18088a;
        } else if (hVar instanceof com.waze.av.b.g) {
            dfVar = dg.f18091a;
        } else if (hVar instanceof com.waze.av.b.f) {
            com.waze.av.b.f fVar = (com.waze.av.b.f) hVar;
            dfVar = new com.waze.bw.c.d.df(fVar.d(), fVar.a());
        } else if (hVar != null) {
            throw new h.i();
        }
        return new cv(cuVarK, dfVar);
    }

    private final void M(com.waze.tide.s sVar) {
        this.q.b();
        while (true) {
            bn bnVar = this.x;
            Object objD = bnVar.d();
            com.waze.tide.s sVar2 = sVar;
            if (bnVar.f(objD, com.waze.bw.c.d.l.h((com.waze.bw.c.d.l) objD, null, sVar2, false, null, null, null, 125))) {
                return;
            } else {
                sVar = sVar2;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x008b, code lost:
    
        if (r2.a(r7, r6, r0) == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ java.lang.Object r(com.waze.bw.c.c.am r5, java.util.List r6, h.c.e r7) {
        /*
            boolean r0 = r7 instanceof com.waze.bw.c.c.al
            if (r0 == 0) goto L13
            r0 = r7
            com.waze.bw.c.c.al r0 = (com.waze.bw.c.c.al) r0
            int r1 = r0.f17796d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f17796d = r1
            goto L18
        L13:
            com.waze.bw.c.c.al r0 = new com.waze.bw.c.c.al
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f17794b
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f17796d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            e.b.c.b(r7)
            goto L8e
        L2a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L32:
            java.lang.Object r6 = r0.f17793a
            java.util.List r6 = (java.util.List) r6
            e.b.c.b(r7)
            goto L4d
        L3a:
            e.b.c.b(r7)
            com.waze.sharedui.e.g r7 = r5.f17806j
            kotlinx.coroutines.b.k r7 = r7.d()
            r0.f17793a = r6
            r0.f17796d = r4
            java.lang.Object r7 = kotlinx.coroutines.b.ai.h(r7, r0)
            if (r7 == r1) goto L91
        L4d:
            com.waze.bw.b.a.p r2 = r5.f17807k
            com.waze.bw.c.a.j r5 = r5.f17797a
            com.waze.sharedui.e.c r7 = (com.waze.sharedui.e.c) r7
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            int r5 = r5.a()
            java.util.List r5 = h.a.i.am(r6, r5)
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Collection r6 = (java.util.Collection) r6
            java.util.Iterator r5 = r5.iterator()
        L6a:
            boolean r4 = r5.hasNext()
            if (r4 == 0) goto L80
            java.lang.Object r4 = r5.next()
            com.waze.av.b.aa r4 = (com.waze.av.b.aa) r4
            java.util.List r4 = a.a.I(r4)
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            h.a.i.aD(r6, r4)
            goto L6a
        L80:
            java.util.List r6 = (java.util.List) r6
            r5 = 0
            r0.f17793a = r5
            r0.f17796d = r3
            java.lang.Object r5 = r2.a(r7, r6, r0)
            if (r5 != r1) goto L8e
            goto L91
        L8e:
            h.ab r5 = h.ab.f48028a
            return r5
        L91:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.bw.c.c.am.r(com.waze.bw.c.c.am, java.util.List, h.c.e):java.lang.Object");
    }

    public static final /* synthetic */ void z(am amVar, h.g.a.l lVar) {
        bn bnVar;
        Object objD;
        com.waze.bw.c.d.l lVar2;
        do {
            bnVar = amVar.x;
            objD = bnVar.d();
            lVar2 = (com.waze.bw.c.d.l) objD;
        } while (!bnVar.f(objD, com.waze.bw.c.d.l.h(lVar2, (cf) lVar.invoke(lVar2.b()), null, false, null, null, null, 126)));
    }

    @Override // com.waze.bw.c.c.x
    public final bq a() {
        return this.A;
    }

    @Override // com.waze.bw.c.c.x
    public final ch b() {
        return this.y;
    }

    @Override // com.waze.bw.c.c.x
    public final void c() {
        com.waze.av.b.ah ahVar = this.f17798b;
        ahVar.e();
        com.waze.av.b.ah ahVar2 = this.f17798b;
        com.waze.bw.c.a.j jVar = this.f17797a;
        List listJ = com.waze.av.b.at.j(ahVar2);
        bo boVar = new bo(com.waze.av.b.at.e(ahVar2) != null, com.waze.av.b.at.f(ahVar2) != null, jVar.h(), h.a.i.aw(listJ), E(listJ));
        bu buVar = new bu(bt.f17999a);
        com.waze.bw.c.a.c cVar = this.f17800d;
        this.x.e(new com.waze.bw.c.d.l(new cf(buVar, boVar, G(com.waze.av.b.at.l(ahVar, this.m.a()), h.a.r.j()), F(com.waze.av.b.at.k(ahVar)), false, false, cVar.d(), !ay.e((ay) this.o.a().d())), this.f17797a.g()));
        ac acVar = new ac(this, (h.c.e) null, 1, (byte[]) null);
        kotlinx.coroutines.af afVar = this.t;
        kotlinx.coroutines.aj.z(afVar, null, null, acVar, 3);
        kotlinx.coroutines.aj.z(afVar, null, null, new ac(this, null, 0), 3);
        kotlinx.coroutines.aj.z(afVar, null, null, new ac(this, (h.c.e) null, 2, (char[]) null), 3);
        kotlinx.coroutines.aj.z(afVar, null, null, new ac(this, (h.c.e) null, 9, (short[][]) null), 3);
        kotlinx.coroutines.aj.z(afVar, null, null, new ac(this, (h.c.e) null, 10, (int[][]) null), 3);
        kotlinx.coroutines.aj.z(afVar, null, null, new ac(this, (h.c.e) null, 6, (float[]) null), 3);
        kotlinx.coroutines.aj.z(afVar, null, null, new ac(this, (h.c.e) null, 3, (short[]) null), 3);
        kotlinx.coroutines.aj.z(afVar, null, null, new ac(this, (h.c.e) null, 4, (int[]) null), 3);
        kotlinx.coroutines.aj.z(afVar, null, null, new ac(this, (h.c.e) null, 7, (byte[][]) null), 3);
        kotlinx.coroutines.aj.z(afVar, null, null, new ac(this, (h.c.e) null, 5, (boolean[]) null), 3);
        if (this.s.a() == null) {
            kotlinx.coroutines.aj.z(afVar, null, null, new ac(this, (h.c.e) null, 11, (boolean[][]) null), 3);
        } else {
            kotlinx.coroutines.aj.z(afVar, null, null, new ac(this, (h.c.e) null, 8, (char[][]) null), 3);
        }
        kotlinx.coroutines.aj.z(afVar, null, null, new ac(this, (h.c.e) null, 13, (byte[][][]) null), 3);
        kotlinx.coroutines.aj.z(afVar, null, null, new ac(this, (h.c.e) null, 12, (float[][]) null), 3);
    }

    @Override // com.waze.ui.r.a.b.a, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        kotlinx.coroutines.aj.h(this.t, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:222:0x04b4  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x04e4  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x04f1  */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v54 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13, types: [java.lang.Object] */
    @Override // com.waze.bw.c.c.x
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(com.waze.sharedui.api.i r25) {
        /*
            Method dump skipped, instructions count: 2266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.bw.c.c.am.d(com.waze.sharedui.api.i):void");
    }
}
