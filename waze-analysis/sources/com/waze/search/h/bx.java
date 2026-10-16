package com.waze.search.h;

import com.waze.navigate.ej;
import com.waze.navigate.en;
import com.waze.strings.DisplayStrings;
import kotlinx.coroutines.b.ch;
import kotlinx.coroutines.b.ck;
import l.a.bjz;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class bx implements com.waze.ui.r.a.b.a {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.search.g.a f35861a;

    /* renamed from: b, reason: collision with root package name */
    private final h.g.a.l f35862b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.av.b.o f35863c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.app_nav.w f35864d;

    /* renamed from: e, reason: collision with root package name */
    private final com.waze.menus.a.b.d f35865e;

    /* renamed from: f, reason: collision with root package name */
    private final com.waze.search.c.m f35866f;

    /* renamed from: g, reason: collision with root package name */
    private final kotlinx.coroutines.b.k f35867g;

    /* renamed from: h, reason: collision with root package name */
    private final h.g.a.l f35868h;

    /* renamed from: i, reason: collision with root package name */
    private final com.waze.search.stats.s f35869i;

    /* renamed from: j, reason: collision with root package name */
    private final com.waze.bx.i f35870j;

    /* renamed from: k, reason: collision with root package name */
    private final boolean f35871k;

    /* renamed from: l, reason: collision with root package name */
    private final en f35872l;
    private final kotlinx.coroutines.af m;
    private final kotlinx.coroutines.b.bm n;
    private final kotlinx.coroutines.b.k o;
    private final ap p;
    private final o q;
    private final ch r;
    private final kotlinx.coroutines.b.bn s;
    private final ch t;
    private final ch u;
    private final kotlinx.coroutines.b.k v;
    private final ch w;
    private boolean x;
    private final com.waze.br.b.w y;
    private final ac z;

    /* JADX WARN: Multi-variable type inference failed */
    public bx(com.waze.search.g.a aVar, b bVar, h.g.a.l lVar, com.waze.av.b.o oVar, com.waze.app_nav.w wVar, com.waze.menus.a.b.d dVar, ao aoVar, com.waze.search.c.m mVar, kotlinx.coroutines.b.k kVar, h.g.a.a aVar2, h.g.a.l lVar2, com.waze.search.stats.s sVar, com.waze.ui.j.j jVar, com.waze.bx.i iVar, boolean z, en enVar, com.waze.br.b.w wVar2) {
        int i2;
        com.waze.z.a.d.ak akVar;
        com.waze.br.b.q qVar;
        h.g.b.x.f(aVar, "searchEmptyStateRepository");
        h.g.b.x.f(bVar, "autocompleteStateHolderCreator");
        h.g.b.x.f(lVar, "permissionGranted");
        h.g.b.x.f(oVar, "genericPlaceActions");
        h.g.b.x.f(wVar, "wazeMainScreenFlowController");
        h.g.b.x.f(dVar, "destinationMenuStatsSender");
        h.g.b.x.f(aoVar, "searchEmptyStateListTransformerCreator");
        h.g.b.x.f(mVar, "typeWhileDrivingController");
        h.g.b.x.f(kVar, "voiceSearchTypeFlow");
        h.g.b.x.f(aVar2, "calendarActivated");
        h.g.b.x.f(lVar2, "optionsMenuIconSelector");
        h.g.b.x.f(sVar, "searchStatsSender");
        h.g.b.x.f(jVar, "hamburgerButtonStateHolder");
        h.g.b.x.f(iVar, "techcodeManager");
        h.g.b.x.f(enVar, "navigationStateProvider");
        this.f35861a = aVar;
        this.f35862b = lVar;
        this.f35863c = oVar;
        this.f35864d = wVar;
        this.f35865e = dVar;
        this.f35866f = mVar;
        this.f35867g = kVar;
        this.f35868h = lVar2;
        this.f35869i = sVar;
        this.f35870j = iVar;
        this.f35871k = z;
        this.f35872l = enVar;
        com.waze.br.b.w wVar3 = true != (enVar.ag().d() instanceof ej) ? wVar2 : null;
        this.y = wVar3;
        kotlinx.coroutines.af afVarP = com.waze.ui.a.l.p(this, null);
        this.m = afVarP;
        ac acVar = new ac(new bh(this, 1, null), new bh(this, 0), new bi(this));
        this.z = acVar;
        kotlinx.coroutines.b.bm bmVarE = kotlinx.coroutines.b.bu.e(0, 1, null, 4);
        this.n = bmVarE;
        this.o = bmVarE;
        com.waze.br.b.w wVar4 = wVar3;
        h.g.a.l lVar3 = new h.g.a.l() { // from class: com.waze.search.h.ax
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return bx.d(this.f35802a, (ab) obj);
            }
        };
        bq bqVar = new bq(this);
        com.waze.shared_infra.i.e eVarD = com.waze.shared_infra.i.a.d("SearchEmptyStateListHandler");
        h.g.b.x.e(eVarD, "create(...)");
        this.p = aoVar.a(new br(this), new am(acVar, lVar3, wVar, bqVar, eVarD, sVar));
        this.q = bVar.a(new ay(this), z);
        int i3 = kotlinx.coroutines.b.bz.f51630a;
        ch chVarV = kotlinx.coroutines.b.ai.V(kVar, afVarP, kotlinx.coroutines.b.by.b(), com.waze.z.a.d.ap.f45940b);
        this.r = chVarV;
        com.waze.br.b.o oVarA = (wVar4 == null || (qVar = (com.waze.br.b.q) wVar4.g().d()) == null) ? null : qVar.a();
        if (oVarA != null) {
            akVar = Q(oVarA);
            i2 = 0;
        } else if (wVar4 != null) {
            i2 = 0;
            akVar = new com.waze.z.a.d.ak("", false, com.waze.z.a.d.aj.f45923d);
        } else {
            i2 = 0;
            akVar = new com.waze.z.a.d.ak("", false, P((com.waze.z.a.d.ap) chVarV.d()));
        }
        kotlinx.coroutines.b.bn bnVarB = ck.b(new ce(akVar, com.waze.search.e.ag.f35616a, new com.waze.search.e.c(((Boolean) lVar.invoke("android.permission.READ_CONTACTS")).booleanValue()), new com.waze.search.e.c((h.g.b.x.n(aVar2.invoke(), "yes") && ((Boolean) lVar.invoke("android.permission.READ_CALENDAR")).booleanValue()) ? 1 : i2), false, false, false, null, null, z, false, jVar));
        this.s = bnVarB;
        this.t = bnVarB;
        kotlinx.coroutines.b.bn bnVar = bnVarB;
        ch chVarV2 = kotlinx.coroutines.b.ai.V(kotlinx.coroutines.b.ai.q(new bl(bnVar, 2), new bl(bnVar, 3), new bg(null)), afVarP, kotlinx.coroutines.b.by.b(), new an(!((ce) bnVarB.d()).j().c(), !((ce) bnVarB.d()).i().c()));
        this.u = chVarV2;
        kotlinx.coroutines.b.k kVarR = kotlinx.coroutines.b.ai.r(aVar.b(com.waze.av.a.n.f15820b), aVar.b(com.waze.av.a.n.f15821c), aVar.b(com.waze.av.a.n.f15822d), new bp(null));
        this.v = kVarR;
        this.w = kotlinx.coroutines.b.ai.V(kotlinx.coroutines.b.ai.r(new bl(kotlinx.coroutines.b.ai.V(aVar.d(), afVarP, kotlinx.coroutines.b.by.b(), aVar.c()), 1), kVarR, chVarV2, new bf(this, null)), afVarP, kotlinx.coroutines.b.by.b(), h.a.i.h());
        by.a().a("init");
        kotlinx.coroutines.aj.z(afVarP, null, null, new bu(this, (h.c.e) null, 1, (byte[]) null), 3);
        if (wVar2 == null) {
            kotlinx.coroutines.b.ai.m(kotlinx.coroutines.b.ai.K(kVar, new bo(this, null, 1, null)), afVarP);
        } else if (wVar4 != null) {
            kotlinx.coroutines.aj.z(afVarP, null, null, new bm(wVar4, this, null), 3);
        }
        kotlinx.coroutines.b.ai.m(kotlinx.coroutines.b.ai.K(mVar.a(), new bn(this, null)), afVarP);
        kotlinx.coroutines.aj.z(afVarP, null, null, new bu(this, null, i2), 3);
        kotlinx.coroutines.aj.z(afVarP, null, null, new bu(this, (h.c.e) null, 2, (char[]) null), 3);
    }

    static final h.ab K(bx bxVar, com.waze.search.v2.o oVar) {
        com.waze.search.v2.o oVar2;
        while (true) {
            kotlinx.coroutines.b.bn bnVar = bxVar.s;
            Object objD = bnVar.d();
            oVar2 = oVar;
            if (bnVar.f(objD, ce.l((ce) objD, null, null, null, oVar2, false, false, !oVar.c(), null, null, false, 4023))) {
                break;
            }
            oVar = oVar2;
        }
        if (oVar2.c()) {
            bxVar.n.c(new ba(u.f35963a));
        }
        return h.ab.f48028a;
    }

    static final h.ab L(bx bxVar, com.waze.search.v2.o oVar) {
        while (true) {
            kotlinx.coroutines.b.bn bnVar = bxVar.s;
            Object objD = bnVar.d();
            com.waze.search.v2.o oVar2 = oVar;
            if (bnVar.f(objD, ce.l((ce) objD, null, null, oVar2, null, false, false, false, null, null, false, 4091))) {
                return h.ab.f48028a;
            }
            oVar = oVar2;
        }
    }

    private final void O(com.waze.ui.ac.n nVar) {
        while (true) {
            kotlinx.coroutines.b.bn bnVar = this.s;
            Object objD = bnVar.d();
            com.waze.ui.ac.n nVar2 = nVar;
            if (bnVar.f(objD, ce.l((ce) objD, null, null, null, null, false, false, false, nVar2, null, false, 3967))) {
                return;
            } else {
                nVar = nVar2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.waze.z.a.d.aj P(com.waze.z.a.d.ap apVar) {
        com.waze.z.a.d.ap apVar2 = com.waze.z.a.d.ap.f45939a;
        com.waze.menus.a.a aVar = com.waze.menus.a.a.f29638a;
        int iOrdinal = apVar.ordinal();
        if (iOrdinal == 0) {
            return com.waze.z.a.d.aj.f45921b;
        }
        if (iOrdinal == 1) {
            return com.waze.z.a.d.aj.f45922c;
        }
        throw new h.i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.waze.z.a.d.an Q(com.waze.br.b.o oVar) {
        if (oVar == null) {
            return new com.waze.z.a.d.ak(com.waze.z.a.d.aj.f45923d, 3);
        }
        if (h.g.b.x.n(oVar, com.waze.br.b.m.f17338a)) {
            return new com.waze.z.a.d.am(com.waze.z.a.d.al.f45929b);
        }
        if (oVar instanceof com.waze.br.b.k) {
            return new com.waze.z.a.d.am(com.waze.z.a.d.al.f45930c);
        }
        if (h.g.b.x.n(oVar, com.waze.br.b.n.f17339a)) {
            return new com.waze.z.a.d.am(com.waze.z.a.d.al.f45931d);
        }
        if ((oVar instanceof com.waze.br.b.g) || (oVar instanceof com.waze.br.b.i)) {
            return new com.waze.z.a.d.am(com.waze.z.a.d.al.f45933f);
        }
        if (oVar instanceof com.waze.br.b.l) {
            return new com.waze.z.a.d.am(com.waze.z.a.d.al.f45932e);
        }
        if (h.g.b.x.n(oVar, com.waze.br.b.j.f17335a) || h.g.b.x.n(oVar, com.waze.br.b.h.f17333a)) {
            return new com.waze.z.a.d.am(com.waze.z.a.d.al.f45928a);
        }
        throw new h.i();
    }

    private final void R(com.waze.search.v2.o oVar, h.g.a.a aVar) {
        Object objD;
        if (oVar.c()) {
            kotlinx.coroutines.b.bn bnVar = this.s;
            do {
                objD = bnVar.d();
            } while (!bnVar.f(objD, ce.l((ce) objD, null, null, null, null, false, false, false, by.b(), null, false, 3967)));
        }
        aVar.invoke();
    }

    static final h.ab d(bx bxVar, ab abVar) {
        h.g.b.x.f(abVar, "it");
        bxVar.n.c(new ba(abVar));
        return h.ab.f48028a;
    }

    public static final /* synthetic */ void j(bx bxVar) {
        Object objD;
        by.a().a("Calendar permission clicked");
        if (((Boolean) bxVar.f35862b.invoke("android.permission.READ_CALENDAR")).booleanValue()) {
            bxVar.M(new com.waze.search.e.c(true));
            return;
        }
        kotlinx.coroutines.b.bn bnVar = bxVar.s;
        do {
            objD = bnVar.d();
        } while (!bnVar.f(objD, ce.l((ce) objD, null, null, null, com.waze.search.e.d.f35620a, false, false, false, null, null, false, 4087)));
    }

    public static final /* synthetic */ void k(bx bxVar) {
        kotlinx.coroutines.b.bn bnVar;
        Object objD;
        by.a().a("Contacts permission clicked");
        do {
            bnVar = bxVar.s;
            objD = bnVar.d();
        } while (!bnVar.f(objD, ce.l((ce) objD, null, null, com.waze.search.e.d.f35620a, null, false, false, false, null, null, false, 4091)));
    }

    public static final /* synthetic */ void l(bx bxVar, com.waze.av.b.n nVar) {
        if (nVar instanceof com.waze.av.b.l) {
            com.waze.av.b.l lVar = (com.waze.av.b.l) nVar;
            if (lVar.c() == com.waze.av.b.z.f16014b) {
                com.waze.av.a.o oVarC = lVar.e().c();
                String strC = oVarC.c();
                String strB = oVarC.b();
                if (strC != null && strB != null) {
                    com.waze.search.e.g.d(strC, strB);
                }
            }
        }
        bxVar.f35863c.E(nVar, ((ce) bxVar.t.d()).d(), com.waze.modules.navigation.ah.m);
    }

    public static final /* synthetic */ void m(bx bxVar, String str) {
        ab abVarB = bxVar.z.b(str);
        if (abVarB != null) {
            bxVar.n.c(new ba(abVarB));
        }
    }

    public static final /* synthetic */ void n(bx bxVar, com.waze.av.b.n nVar, com.waze.search.e.p pVar) {
        kotlinx.coroutines.b.bn bnVar;
        Object objD;
        do {
            bnVar = bxVar.s;
            objD = bnVar.d();
        } while (!bnVar.f(objD, ce.l((ce) objD, null, null, null, null, false, false, false, null, new ae(pVar, nVar), false, DisplayStrings.DS_COMPANINIO_BOTTOM_SHEET_TITLE)));
    }

    static final void o(bx bxVar, ab abVar) {
        h.g.b.x.f(abVar, "it");
        bxVar.n.c(new ba(abVar));
    }

    public final void A() {
        com.waze.br.b.w wVar = this.y;
        if (wVar != null) {
            com.waze.br.b.o oVarA = ((com.waze.br.b.q) wVar.g().d()).a();
            if ((oVarA instanceof com.waze.br.b.k) || h.g.b.x.n(oVarA, com.waze.br.b.h.f17333a) || h.g.b.x.n(oVarA, com.waze.br.b.j.f17335a)) {
                wVar.i();
                return;
            }
            if (!(oVarA instanceof com.waze.br.b.l) && !h.g.b.x.n(oVarA, com.waze.br.b.m.f17338a) && !h.g.b.x.n(oVarA, com.waze.br.b.n.f17339a) && !(oVarA instanceof com.waze.br.b.i) && !(oVarA instanceof com.waze.br.b.g) && oVarA != null) {
                throw new h.i();
            }
            wVar.h();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void B() {
        /*
            r8 = this;
            kotlinx.coroutines.b.ch r0 = r8.t
            java.lang.Object r1 = r0.d()
            com.waze.search.h.ce r1 = (com.waze.search.h.ce) r1
            com.waze.settings.v r1 = r1.k()
            boolean r2 = r1 instanceof com.waze.search.e.ae
            r3 = 0
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L34
            r6 = r1
            com.waze.search.e.ae r6 = (com.waze.search.e.ae) r6
            java.util.List r6 = r6.a()
            java.lang.Object r6 = h.a.i.R(r6)
            boolean r7 = r6 instanceof com.waze.search.e.h
            if (r7 == 0) goto L25
            com.waze.search.e.h r6 = (com.waze.search.e.h) r6
            goto L26
        L25:
            r6 = r3
        L26:
            if (r6 == 0) goto L34
            java.util.List r6 = r6.b()
            int r6 = r6.size()
            if (r6 <= r4) goto L34
            r6 = r4
            goto L35
        L34:
            r6 = r5
        L35:
            if (r2 == 0) goto L3a
            r3 = r1
            com.waze.search.e.ae r3 = (com.waze.search.e.ae) r3
        L3a:
            if (r3 == 0) goto L6e
            java.util.List r1 = r3.a()
            if (r1 == 0) goto L6e
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            boolean r2 = r1 instanceof java.util.Collection
            if (r2 == 0) goto L52
            r2 = r1
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L52
            goto L6e
        L52:
            java.util.Iterator r1 = r1.iterator()
        L56:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L6e
            java.lang.Object r2 = r1.next()
            com.waze.search.e.z r2 = (com.waze.search.e.z) r2
            boolean r2 = r2 instanceof com.waze.search.e.p
            if (r2 == 0) goto L56
            int r5 = r5 + 1
            if (r5 >= 0) goto L56
            h.a.i.o()
            goto L56
        L6e:
            com.waze.search.stats.s r8 = r8.f35869i
            java.lang.Object r0 = r0.d()
            com.waze.search.h.ce r0 = (com.waze.search.h.ce) r0
            boolean r0 = r0.e()
            r0 = r0 ^ r4
            l.a.bjz r1 = l.a.bjz.MOBILE_ANDROID
            r8.o(r6, r0, r5, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.search.h.bx.B():void");
    }

    public final void C() {
        p();
        this.n.c(bb.f35815a);
    }

    public final void D() {
        this.f35864d.d();
    }

    public final void E() {
        kotlinx.coroutines.b.bn bnVar;
        Object objD;
        do {
            bnVar = this.s;
            objD = bnVar.d();
        } while (!bnVar.f(objD, ce.l((ce) objD, null, null, null, null, false, false, false, null, null, false, 3967)));
    }

    public final void F(boolean z) {
        while (true) {
            kotlinx.coroutines.b.bn bnVar = this.s;
            Object objD = bnVar.d();
            boolean z2 = z;
            if (bnVar.f(objD, ce.l((ce) objD, null, null, null, null, false, false, false, null, null, z2, DisplayStrings.DS_AAOS_TRIP_OVERVIEW_VIEW_ALL_SETTINGS_BUTTON))) {
                return;
            } else {
                z = z2;
            }
        }
    }

    public final void G() {
        com.waze.search.d.a.b.i(this.f35869i, com.waze.search.stats.k.f36059b, null, null, null, null, null, bjz.MOBILE_ANDROID, 62);
    }

    public final void H(String str) {
        h.g.b.x.f(str, "searchTerm");
        kotlinx.coroutines.aj.z(this.m, null, null, new bw(this, str, null), 3);
    }

    public final void M(com.waze.search.v2.o oVar) {
        h.g.b.x.f(oVar, "permissionState");
        R(oVar, new az(this, oVar, 0, null));
    }

    public final void N(com.waze.search.v2.o oVar) {
        h.g.b.x.f(oVar, "permissionState");
        R(oVar, new az(this, oVar, 1, null));
    }

    @Override // com.waze.ui.r.a.b.a, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        kotlinx.coroutines.aj.h(this.m, null);
    }

    public final h.g.a.l e() {
        return this.f35868h;
    }

    public final kotlinx.coroutines.b.k f() {
        return this.o;
    }

    public final ch i() {
        return this.t;
    }

    public final void p() {
        kotlinx.coroutines.b.bn bnVar;
        Object objD;
        do {
            bnVar = this.s;
            objD = bnVar.d();
        } while (!bnVar.f(objD, ce.l((ce) objD, null, null, null, null, false, false, false, null, null, false, 4031)));
    }

    public final void q() {
        kotlinx.coroutines.b.bn bnVar;
        Object objD;
        this.x = false;
        do {
            bnVar = this.s;
            objD = bnVar.d();
        } while (!bnVar.f(objD, ce.l((ce) objD, null, null, null, null, false, false, false, null, null, false, DisplayStrings.DS_COMPANINIO_BOTTOM_SHEET_TITLE)));
    }

    public final void r(com.waze.menus.a.a aVar, com.waze.av.b.n nVar) {
        h.g.b.x.f(aVar, "destinationMenuOption");
        h.g.b.x.f(nVar, "genericPlace");
        com.waze.z.a.d.ap apVar = com.waze.z.a.d.ap.f45939a;
        com.waze.menus.a.a aVar2 = com.waze.menus.a.a.f29638a;
        int iOrdinal = aVar.ordinal();
        if (iOrdinal == 13) {
            O(by.d());
        } else if (iOrdinal == 14) {
            O(by.e());
        }
        this.x = true;
        this.f35865e.c(aVar, nVar);
    }

    public final void s() {
        if (!this.x) {
            this.f35865e.b();
        }
        q();
    }

    public final void t(com.waze.menus.a.a.c cVar, com.waze.av.b.n nVar) {
        h.g.b.x.f(cVar, "bottomSheetFooterLink");
        h.g.b.x.f(nVar, "genericPlace");
        this.x = true;
        this.f35865e.d(cVar, nVar);
    }

    public final void u() {
        ae aeVarB = ((ce) this.s.d()).b();
        if (aeVarB != null) {
            this.f35865e.e(aeVarB.a());
        }
    }

    public final void v(boolean z) {
        O(z ? by.c() : by.f());
    }

    public final void w(h.g.a.a aVar, h.g.a.l lVar) {
        String string;
        String strB;
        h.g.b.x.f(aVar, "onCloseKeyboard");
        h.g.b.x.f(lVar, "onOpenSearchActivity");
        com.waze.z.a.d.an anVarA = ((ce) this.s.d()).a();
        com.waze.z.a.d.ak akVar = anVarA instanceof com.waze.z.a.d.ak ? (com.waze.z.a.d.ak) anVarA : null;
        if (akVar == null || (strB = akVar.b()) == null || (string = h.n.o.v(strB).toString()) == null) {
            string = "";
        }
        if (string.length() == 0) {
            by.a().g("Not searching with empty input");
            return;
        }
        this.f35869i.d(com.waze.search.stats.c.f36019h, (DisplayStrings.DS_SDK_ERROR_MESSAGE_POPUP_MAIN_BUTTON & 2) != 0 ? null : null, (DisplayStrings.DS_SDK_ERROR_MESSAGE_POPUP_MAIN_BUTTON & 4) != 0 ? null : null, (DisplayStrings.DS_SDK_ERROR_MESSAGE_POPUP_MAIN_BUTTON & 8) != 0 ? null : Long.valueOf(h.n.o.v(r1).toString().length()), (DisplayStrings.DS_SDK_ERROR_MESSAGE_POPUP_MAIN_BUTTON & 16) != 0 ? null : null, null, null, null, null, null, null, bjz.MOBILE_ANDROID);
        if (this.f35870j.t(string)) {
            aVar.invoke();
        } else {
            aVar.invoke();
            lVar.invoke(string);
        }
    }

    public final void x() {
        if (((ce) this.s.d()).b() != null) {
            this.f35865e.a();
            q();
        } else {
            com.waze.search.d.a.b.i(this.f35869i, com.waze.search.stats.k.f36061d, null, null, null, null, null, bjz.MOBILE_ANDROID, 62);
            this.f35864d.c();
        }
    }

    public final void y() {
        com.waze.br.b.w wVar = this.y;
        if (wVar != null) {
            wVar.j();
        }
    }

    public final void z() {
        com.waze.br.b.w wVar = this.y;
        if (wVar != null) {
            wVar.h();
        }
    }
}
