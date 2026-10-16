package com.waze.view.popups.a;

import com.waze.R;
import com.waze.map.b.ai;
import com.waze.map.bi;
import com.waze.map.bj;
import com.waze.map.bl;
import com.waze.map.gu;
import com.waze.map.main.bn;
import com.waze.modules.c.ch;
import com.waze.navigate.AddressItem;
import com.waze.realtime.RealtimeNativeManager;
import com.waze.reports.ed;
import java.io.IOException;
import java.util.Objects;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.b.ck;
import kotlinx.coroutines.br;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class aa implements com.waze.ui.r.a.b.a {

    /* renamed from: a, reason: collision with root package name */
    private final RealtimeNativeManager f45140a;

    /* renamed from: b, reason: collision with root package name */
    private final ai f45141b;

    /* renamed from: c, reason: collision with root package name */
    private final bn f45142c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.shared_infra.o.a f45143d;

    /* renamed from: e, reason: collision with root package name */
    private final com.waze.sharedui.e.g f45144e;

    /* renamed from: f, reason: collision with root package name */
    private final ch f45145f;

    /* renamed from: g, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f45146g;

    /* renamed from: h, reason: collision with root package name */
    private final kotlinx.coroutines.af f45147h;

    /* renamed from: i, reason: collision with root package name */
    private br f45148i;

    /* renamed from: j, reason: collision with root package name */
    private int f45149j;

    /* renamed from: k, reason: collision with root package name */
    private final kotlinx.coroutines.b.bn f45150k;

    /* renamed from: l, reason: collision with root package name */
    private final kotlinx.coroutines.b.ch f45151l;

    public aa(RealtimeNativeManager realtimeNativeManager, ai aiVar, bn bnVar, com.waze.shared_infra.o.a aVar, com.waze.sharedui.e.g gVar, ch chVar, com.waze.shared_infra.i.e eVar) {
        h.g.b.x.f(realtimeNativeManager, "realtimeNativeManager");
        h.g.b.x.f(aiVar, "mainMapController");
        h.g.b.x.f(bnVar, "dataFetcher");
        h.g.b.x.f(aVar, "stringProvider");
        h.g.b.x.f(gVar, "locationService");
        h.g.b.x.f(chVar, "routeCalculator");
        h.g.b.x.f(eVar, "logger");
        this.f45140a = realtimeNativeManager;
        this.f45141b = aiVar;
        this.f45142c = bnVar;
        this.f45143d = aVar;
        this.f45144e = gVar;
        this.f45145f = chVar;
        this.f45146g = eVar;
        kotlinx.coroutines.af afVarP = com.waze.ui.a.l.p(this, "MapPopupsStateHolder");
        this.f45147h = afVarP;
        kotlinx.coroutines.b.bn bnVarB = ck.b(null);
        this.f45150k = bnVarB;
        this.f45151l = kotlinx.coroutines.b.ai.U(bnVarB);
        aj.z(afVarP, null, null, new m(this, null), 3);
    }

    public static final /* synthetic */ bl a(aa aaVar, com.waze.places.f fVar) throws IOException {
        String strC = aaVar.f45143d.c(R.string.MAP_POPUP_NEW_VENUE_TITLE, new Object[0]);
        String strG = fVar.g();
        com.waze.places.a aVarA = fVar.a();
        String strH = null;
        if (aVarA != null) {
            String strC2 = aVarA.c();
            if (strC2.length() == 0) {
                strC2 = null;
            }
            String str = strC2;
            String strE = aVarA.e();
            if (strE.length() == 0) {
                strE = null;
            }
            String str2 = strE;
            String strA = aVarA.a();
            if (strA.length() == 0) {
                strA = null;
            }
            strH = com.waze.nightmode.e.h(str, str2, strA, null, null);
        }
        String strAM = h.a.i.aM(h.a.i.k(strG, strH), "\n", null, null, 0, null, 62);
        AddressItem addressItemF = com.waze.notifications.c.k.f(fVar);
        addressItemF.setTitle(strC);
        addressItemF.setSecondaryTitle(strAM);
        return new bj(strC, strAM, null, false, gu.f29184d, fVar.b(), null, null, addressItemF, null, 0, 0, bi.f28399b);
    }

    public static final /* synthetic */ bl b(aa aaVar, AddressItem addressItem) {
        h.k kVar;
        ed venueData = addressItem.getVenueData();
        if (venueData == null) {
            aaVar.f45146g.b("venue is null");
            return null;
        }
        String strT = venueData.t();
        if (strT == null || strT.length() == 0) {
            String strZ = venueData.z();
            h.g.b.x.e(strZ, "getStreet(...)");
            if (strZ.length() > 0) {
                String strR = venueData.r();
                if (strR.length() == 0) {
                    strR = null;
                }
                String str = strR;
                String strZ2 = venueData.z();
                if (strZ2.length() == 0) {
                    strZ2 = null;
                }
                kVar = new h.k(com.waze.nightmode.e.h(str, strZ2, null, null, null), venueData.n());
            } else {
                kVar = new h.k(venueData.n(), aaVar.f45143d.c(R.string.STREETSROAD_WITHOUT_A_NAME, new Object[0]));
            }
        } else {
            String strT2 = venueData.t();
            String strR2 = venueData.r();
            if (strR2.length() == 0) {
                strR2 = null;
            }
            String str2 = strR2;
            String strZ3 = venueData.z();
            if (strZ3.length() == 0) {
                strZ3 = null;
            }
            String str3 = strZ3;
            String strN = venueData.n();
            if (strN.length() == 0) {
                strN = null;
            }
            kVar = new h.k(strT2, com.waze.nightmode.e.h(str2, str3, strN, null, null));
        }
        String str4 = (String) kVar.a();
        String str5 = (String) kVar.b();
        if (str5 == null) {
            str5 = "";
        }
        gu guVar = gu.f29184d;
        com.waze.shared_infra.h.c coordinate = addressItem.getCoordinate();
        h.g.b.x.e(coordinate, "getCoordinate(...)");
        return new bj(str4, str5, null, false, guVar, coordinate, null, null, addressItem, null, 0, 0, bi.f28399b);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ java.lang.Object g(com.waze.view.popups.a.aa r7, com.waze.view.popups.a.r r8, int r9, h.c.e r10) {
        /*
            boolean r0 = r10 instanceof com.waze.view.popups.a.z
            if (r0 == 0) goto L13
            r0 = r10
            com.waze.view.popups.a.z r0 = (com.waze.view.popups.a.z) r0
            int r1 = r0.f45246d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f45246d = r1
            goto L18
        L13:
            com.waze.view.popups.a.z r0 = new com.waze.view.popups.a.z
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.f45244b
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f45246d
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L40
            if (r2 == r5) goto L35
            if (r2 != r4) goto L2d
            int r8 = r0.f45243a
            e.b.c.b(r10)
            goto L7e
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            int r9 = r0.f45243a
            com.waze.view.popups.a.r r8 = r0.f45247e
            r2 = r8
            com.waze.view.popups.a.r r2 = (com.waze.view.popups.a.r) r2
            e.b.c.b(r10)
            goto L54
        L40:
            e.b.c.b(r10)
            com.waze.shared_infra.h.c r10 = r8.c()
            r0.f45247e = r8
            r0.f45243a = r9
            r0.f45246d = r5
            java.lang.Object r10 = r7.m(r10, r0)
            if (r10 != r1) goto L54
            goto L7c
        L54:
            h.o.a r10 = (h.o.a) r10
            if (r10 == 0) goto La7
            com.waze.map.main.bn r2 = r7.f45142c
            long r5 = r10.w()
            com.waze.shared_infra.h.c r10 = r8.c()
            int r8 = r8.b()
            long r5 = h.o.a.p(r5)
            int r5 = (int) r5
            java.lang.Integer r6 = new java.lang.Integer
            r6.<init>(r5)
            r0.f45247e = r3
            r0.f45243a = r9
            r0.f45246d = r4
            java.lang.Object r10 = r2.fetchParkingSuggestionPopupInfo(r10, r8, r6, r0)
            if (r10 != r1) goto L7d
        L7c:
            return r1
        L7d:
            r8 = r9
        L7e:
            com.waze.map.bj r10 = (com.waze.map.bj) r10
            if (r10 != 0) goto L85
            h.ab r7 = h.ab.f48028a
            return r7
        L85:
            kotlinx.coroutines.b.bn r7 = r7.f45150k
        L87:
            java.lang.Object r9 = r7.d()
            r0 = r9
            com.waze.view.popups.a.n r0 = (com.waze.view.popups.a.n) r0
            if (r0 == 0) goto L9e
            int r1 = r0.a()
            if (r1 != r8) goto L9e
            r1 = r10
            com.waze.map.bl r1 = (com.waze.map.bl) r1
            r2 = 5
            com.waze.view.popups.a.n r0 = com.waze.view.popups.a.n.d(r0, r1, r3, r2)
        L9e:
            boolean r9 = r7.f(r9, r0)
            if (r9 == 0) goto L87
            h.ab r7 = h.ab.f48028a
            return r7
        La7:
            h.ab r7 = h.ab.f48028a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.view.popups.a.aa.g(com.waze.view.popups.a.aa, com.waze.view.popups.a.r, int, h.c.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m(com.waze.shared_infra.h.c r23, h.c.e r24) {
        /*
            r22 = this;
            r0 = r22
            r1 = r24
            boolean r2 = r1 instanceof com.waze.view.popups.a.v
            if (r2 == 0) goto L17
            r2 = r1
            com.waze.view.popups.a.v r2 = (com.waze.view.popups.a.v) r2
            int r3 = r2.f45231c
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f45231c = r3
            goto L1c
        L17:
            com.waze.view.popups.a.v r2 = new com.waze.view.popups.a.v
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.f45229a
            h.c.a.a r3 = h.c.a.a.f48038a
            int r4 = r2.f45231c
            r5 = 0
            r6 = 1
            if (r4 == 0) goto L34
            if (r4 != r6) goto L2c
            e.b.c.b(r1)
            goto L88
        L2c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L34:
            e.b.c.b(r1)
            com.waze.sharedui.e.g r1 = r0.f45144e
            com.waze.sharedui.e.c r1 = r1.a()
            if (r1 == 0) goto Ld1
            com.waze.shared_infra.h.c r4 = r1.f()
            boolean r4 = r4.g()
            if (r4 == 0) goto L4b
            goto Ld1
        L4b:
            com.waze.modules.c.ch r4 = r0.f45145f
            com.waze.modules.c.ce r7 = new com.waze.modules.c.ce
            com.waze.modules.c.cg r8 = com.waze.modules.c.cg.f29952e
            com.waze.shared_infra.h.c r9 = r1.f()
            com.waze.av.a.p r12 = new com.waze.av.a.p
            com.waze.av.a.a r13 = new com.waze.av.a.a
            r20 = 0
            r21 = 127(0x7f, float:1.78E-43)
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21)
            com.waze.av.a.o r14 = new com.waze.av.a.o
            r21 = 63
            r14.<init>(r15, r16, r17, r18, r19, r20, r21)
            r1 = r23
            r12.<init>(r13, r1, r14)
            r15 = 0
            r16 = 2464(0x9a0, float:3.453E-42)
            r10 = 0
            r11 = 0
            r13 = 1
            r14 = 0
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r2.f45231c = r6
            java.lang.Object r1 = r4.a(r7, r2)
            if (r1 == r3) goto Ld0
        L88:
            com.waze.sharedui.f.n r1 = (com.waze.sharedui.f.n) r1
            boolean r2 = r1 instanceof com.waze.sharedui.f.i
            if (r2 == 0) goto Lab
            com.waze.sharedui.f.i r1 = (com.waze.sharedui.f.i) r1
            java.lang.Object r0 = r1.a()
            com.waze.modules.c.dk r0 = (com.waze.modules.c.dk) r0
            java.util.List r0 = r0.f()
            java.lang.Object r0 = h.a.i.R(r0)
            com.waze.modules.c.ar r0 = (com.waze.modules.c.ar) r0
            if (r0 == 0) goto Lc9
            long r0 = r0.b()
            h.o.a r0 = h.o.a.z(r0)
            return r0
        Lab:
            boolean r2 = r1 instanceof com.waze.sharedui.f.j
            if (r2 == 0) goto Lca
            com.waze.shared_infra.i.e r0 = r0.f45146g
            com.waze.sharedui.f.j r1 = (com.waze.sharedui.f.j) r1
            com.waze.sharedui.b r1 = r1.a()
            java.util.Objects.toString(r1)
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = "Couldn't ETA to parking. Error: "
            java.lang.String r1 = r2.concat(r1)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r0.g(r1)
        Lc9:
            return r5
        Lca:
            h.i r0 = new h.i
            r0.<init>()
            throw r0
        Ld0:
            return r3
        Ld1:
            com.waze.shared_infra.i.e r0 = r0.f45146g
            java.lang.String r1 = "Couldn't fetch last location"
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r0.g(r1)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.view.popups.a.aa.m(com.waze.shared_infra.h.c, h.c.e):java.lang.Object");
    }

    private final void n() {
        br brVar = this.f45148i;
        if (brVar != null) {
            brVar.s(null);
        }
        this.f45148i = null;
    }

    @Override // com.waze.ui.r.a.b.a, java.io.Closeable, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
    }

    public final kotlinx.coroutines.b.ch i() {
        return this.f45151l;
    }

    public final void j() {
        kotlinx.coroutines.b.bn bnVar = this.f45150k;
        Object objD = bnVar.d();
        Objects.toString(objD);
        this.f45146g.a("user called clearPopups(), popup before clear: ".concat(String.valueOf(objD)));
        n();
        bnVar.e(null);
    }

    public final void l(u uVar) {
        h.g.b.x.f(uVar, "initialPopupData");
        int i2 = this.f45149j + 1;
        this.f45149j = i2;
        this.f45146g.a("user called showPopup(" + uVar.a() + "), id: " + i2);
        j();
        this.f45148i = aj.z(this.f45147h, null, null, new y(uVar, this, i2, null), 3);
    }
}
