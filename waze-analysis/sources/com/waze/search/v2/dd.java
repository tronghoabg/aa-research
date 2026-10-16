package com.waze.search.v2;

import com.waze.NativeManager;
import com.waze.R;
import com.waze.config.ConfigValues;
import com.waze.jni.protos.navigate.PolylineGeometry;
import com.waze.li;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class dd {

    /* renamed from: a, reason: collision with root package name */
    private final dc f36341a;

    /* renamed from: b, reason: collision with root package name */
    private final c f36342b;

    /* renamed from: c, reason: collision with root package name */
    private final p f36343c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.location.o f36344d;

    /* renamed from: e, reason: collision with root package name */
    private final com.waze.navigate.location_preview.ay f36345e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f36346f;

    /* renamed from: g, reason: collision with root package name */
    private final Float f36347g;

    /* renamed from: h, reason: collision with root package name */
    private final com.waze.shared_infra.h.c f36348h;

    /* renamed from: i, reason: collision with root package name */
    private final Map f36349i;

    /* renamed from: j, reason: collision with root package name */
    private final PolylineGeometry f36350j;

    /* renamed from: k, reason: collision with root package name */
    private final q f36351k;

    /* renamed from: l, reason: collision with root package name */
    private final int f36352l;
    private final long m;
    private final boolean n;
    private final boolean o;
    private final e p;
    private final boolean q;
    private final List r;
    private final com.waze.speech.k s;
    private final com.waze.sdk.bq t;
    private final com.waze.ad.c.b u;
    private final com.waze.destination_cell.b.e v;

    public dd(dc dcVar, com.waze.ad.c.b bVar, c cVar, p pVar, com.waze.location.o oVar, com.waze.sdk.bq bqVar, com.waze.navigate.location_preview.ay ayVar, boolean z, com.waze.shared_infra.h.c cVar2, Map map, PolylineGeometry polylineGeometry, com.waze.speech.k kVar, q qVar, int i2, long j2, boolean z2, boolean z3, com.waze.destination_cell.b.e eVar, e eVar2, boolean z4, List list) {
        h.g.b.x.f(dcVar, "searchStatus");
        h.g.b.x.f(bVar, "query");
        h.g.b.x.f(cVar, "filters");
        h.g.b.x.f(pVar, "config");
        h.g.b.x.f(oVar, "locationSensorListener");
        h.g.b.x.f(map, "pinBitmaps");
        h.g.b.x.f(qVar, "searchMode");
        h.g.b.x.f(list, "gasTypes");
        this.f36341a = dcVar;
        this.u = bVar;
        this.f36342b = cVar;
        this.f36343c = pVar;
        this.f36344d = oVar;
        this.t = bqVar;
        this.f36345e = ayVar;
        this.f36346f = z;
        this.f36347g = null;
        this.f36348h = cVar2;
        this.f36349i = map;
        this.f36350j = polylineGeometry;
        this.s = kVar;
        this.f36351k = qVar;
        this.f36352l = i2;
        this.m = j2;
        this.n = z2;
        this.o = z3;
        this.v = eVar;
        this.p = eVar2;
        this.q = z4;
        this.r = list;
    }

    public static /* synthetic */ dd s(dd ddVar, dc dcVar, com.waze.ad.c.b bVar, c cVar, p pVar, com.waze.location.o oVar, com.waze.sdk.bq bqVar, com.waze.navigate.location_preview.ay ayVar, boolean z, com.waze.shared_infra.h.c cVar2, Map map, PolylineGeometry polylineGeometry, com.waze.speech.k kVar, q qVar, int i2, long j2, boolean z2, boolean z3, com.waze.destination_cell.b.e eVar, e eVar2, boolean z4, List list, int i3) {
        com.waze.sdk.bq bqVar2;
        com.waze.navigate.location_preview.ay ayVar2;
        long j3;
        dc dcVar2 = (i3 & 1) != 0 ? ddVar.f36341a : dcVar;
        com.waze.ad.c.b bVar2 = (i3 & 2) != 0 ? ddVar.u : bVar;
        c cVar3 = (i3 & 4) != 0 ? ddVar.f36342b : cVar;
        p pVar2 = (i3 & 8) != 0 ? ddVar.f36343c : pVar;
        com.waze.location.o oVar2 = (i3 & 16) != 0 ? ddVar.f36344d : oVar;
        com.waze.sdk.bq bqVar3 = (i3 & 32) != 0 ? ddVar.t : bqVar;
        com.waze.navigate.location_preview.ay ayVar3 = (i3 & 64) != 0 ? ddVar.f36345e : ayVar;
        boolean z5 = (i3 & 128) != 0 ? ddVar.f36346f : z;
        if ((i3 & 256) != 0) {
            Float f2 = ddVar.f36347g;
        }
        com.waze.shared_infra.h.c cVar4 = (i3 & 512) != 0 ? ddVar.f36348h : cVar2;
        Map map2 = (i3 & 1024) != 0 ? ddVar.f36349i : map;
        PolylineGeometry polylineGeometry2 = (i3 & 2048) != 0 ? ddVar.f36350j : polylineGeometry;
        com.waze.speech.k kVar2 = (i3 & 4096) != 0 ? ddVar.s : kVar;
        q qVar2 = (i3 & 8192) != 0 ? ddVar.f36351k : qVar;
        int i4 = (i3 & 16384) != 0 ? ddVar.f36352l : i2;
        if ((i3 & 32768) != 0) {
            bqVar2 = bqVar3;
            ayVar2 = ayVar3;
            j3 = ddVar.m;
        } else {
            bqVar2 = bqVar3;
            ayVar2 = ayVar3;
            j3 = j2;
        }
        boolean z6 = (i3 & 65536) != 0 ? ddVar.n : z2;
        boolean z7 = (i3 & 131072) != 0 ? ddVar.o : z3;
        com.waze.destination_cell.b.e eVar3 = (i3 & 262144) != 0 ? ddVar.v : eVar;
        e eVar4 = (i3 & 524288) != 0 ? ddVar.p : eVar2;
        boolean z8 = (i3 & 1048576) != 0 ? ddVar.q : z4;
        List list2 = (i3 & 2097152) != 0 ? ddVar.r : list;
        h.g.b.x.f(dcVar2, "searchStatus");
        h.g.b.x.f(bVar2, "query");
        h.g.b.x.f(cVar3, "filters");
        h.g.b.x.f(pVar2, "config");
        h.g.b.x.f(oVar2, "locationSensorListener");
        h.g.b.x.f(map2, "pinBitmaps");
        h.g.b.x.f(qVar2, "searchMode");
        h.g.b.x.f(list2, "gasTypes");
        return new dd(dcVar2, bVar2, cVar3, pVar2, oVar2, bqVar2, ayVar2, z5, cVar4, map2, polylineGeometry2, kVar2, qVar2, i4, j3, z6, z7, eVar3, eVar4, z8, list2);
    }

    private final com.waze.av.d.k t() {
        com.waze.search.aw awVarI = this.f36342b.i();
        if (awVarI != null) {
            return awVarI.p();
        }
        return null;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final dj u(com.waze.av.d.k kVar, db dbVar) {
        Double dI;
        String strL;
        com.waze.av.d.a aVarB;
        com.waze.av.d.c cVarF;
        String str;
        com.waze.av.d.c cVarF2;
        Integer numValueOf = null;
        if (dbVar.d() == null && dbVar.c() == null) {
            String strA = p.a();
            List listH = kVar.H();
            ArrayList arrayList = new ArrayList();
            for (Object obj : listH) {
                if (((com.waze.av.d.s) obj).a() != null) {
                    arrayList.add(obj);
                }
            }
            com.waze.av.d.i iVar = (com.waze.av.d.i) h.a.i.R(cv.a(h.a.i.al(com.waze.av.d.t.a(arrayList, this.r), new com.waze.car_lib.r.d.k(2)), new com.waze.car_lib.r.fl(strA, 13)));
            strL = iVar != null ? String.valueOf(kVar.q()).concat(String.valueOf(com.waze.shared_infra.q.m.c(iVar.e(), iVar.a()))) : null;
            if (strL == null) {
                com.waze.av.d.a aVarB2 = kVar.b();
                strL = (aVarB2 == null || !p.d() || (cVarF2 = com.waze.ad.c.b.f(aVarB2)) == null) ? null : com.waze.ad.c.b.l(cVarF2, aVarB2.a() != null && p.e());
                if (strL == null) {
                    Double dI2 = kVar.i();
                    if (dI2 != null) {
                        strL = df.h().format(dI2.doubleValue());
                    }
                    str = null;
                }
            }
            str = strL;
        } else {
            String strD = dbVar.d();
            String strC = dbVar.c();
            if (com.waze.ad.c.b.s(strD, strC)) {
                String strA2 = p.a();
                List listH2 = kVar.H();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : listH2) {
                    if (((com.waze.av.d.s) obj2).a() != null) {
                        arrayList2.add(obj2);
                    }
                }
                com.waze.av.d.i iVar2 = (com.waze.av.d.i) h.a.i.R(cv.a(h.a.i.al(com.waze.av.d.t.a(arrayList2, this.r), new com.waze.car_lib.r.d.k(1)), new com.waze.car_lib.r.fl(strA2, 14)));
                if (iVar2 != null) {
                    strL = String.valueOf(kVar.q()).concat(String.valueOf(com.waze.shared_infra.q.m.c(iVar2.e(), iVar2.a())));
                    str = strL;
                }
                str = null;
            } else {
                if (com.waze.ad.c.b.t(strD, strC)) {
                    if (!p.d() || (aVarB = kVar.b()) == null || (cVarF = com.waze.ad.c.b.f(aVarB)) == null) {
                        strL = null;
                    } else {
                        com.waze.av.d.a aVarB3 = kVar.b();
                        strL = com.waze.ad.c.b.l(cVarF, (aVarB3 != null ? aVarB3.a() : null) != null && p.e());
                    }
                    Boolean boolB = ConfigValues.CONFIG_VALUE_SEARCH_PARKING_SHOW_PRICE.b();
                    h.g.b.x.e(boolB, "getValue(...)");
                    if (!boolB.booleanValue() && strL == null && kVar.i() != null) {
                        strL = df.h().format(kVar.i());
                    }
                } else {
                    if (!com.waze.ad.c.b.r(strD, strC) && (dI = kVar.i()) != null) {
                        dI.doubleValue();
                        strL = df.h().format(kVar.i());
                    }
                    str = null;
                }
                str = strL;
            }
        }
        String strV = kVar.v();
        Integer numB = dbVar.b();
        int iIntValue = numB != null ? numB.intValue() : df.a(kVar).c(com.waze.design_components.b.e.f23313b);
        String strM = kVar.m();
        if (strM != null) {
            switch (strM.hashCode()) {
                case 118:
                    if (strM.equals("v")) {
                        numValueOf = Integer.valueOf(R.drawable.pin_ads_badge_v);
                        break;
                    }
                    break;
                case 99750:
                    if (strM.equals("drt")) {
                        numValueOf = Integer.valueOf(R.drawable.pin_ads_badge_drive_through);
                        break;
                    }
                    break;
                case 100802:
                    if (strM.equals("eur")) {
                        numValueOf = Integer.valueOf(R.drawable.pin_ads_badge_euro);
                        break;
                    }
                    break;
                case 101147:
                    if (strM.equals("fav")) {
                        numValueOf = Integer.valueOf(R.drawable.pin_ads_badge_heart);
                        break;
                    }
                    break;
                case 102133:
                    if (strM.equals("gbp")) {
                        numValueOf = Integer.valueOf(R.drawable.pin_ads_badge_gbp);
                        break;
                    }
                    break;
                case 104368:
                    if (strM.equals("ils")) {
                        numValueOf = Integer.valueOf(R.drawable.pin_ads_badge_ils);
                        break;
                    }
                    break;
                case 110808:
                    if (strM.equals("pck")) {
                        numValueOf = Integer.valueOf(R.drawable.pin_ads_badge_curbside_pickup);
                        break;
                    }
                    break;
                case 111273:
                    if (strM.equals("prk")) {
                        numValueOf = Integer.valueOf(R.drawable.pin_ads_badge_parking);
                        break;
                    }
                    break;
                case 116102:
                    if (strM.equals("usd")) {
                        numValueOf = Integer.valueOf(R.drawable.pin_ads_badge_usd);
                        break;
                    }
                    break;
            }
        }
        return new dj(null, Integer.valueOf(iIntValue), numValueOf, strV, str, dbVar.a(), 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.waze.ui.ac.n v(java.util.List r5) {
        /*
            r4 = this;
            com.waze.ad.c.b r4 = r4.u
            boolean r0 = r4 instanceof com.waze.av.c.d
            r1 = 0
            if (r0 == 0) goto Lb
            r0 = r4
            com.waze.av.c.d r0 = (com.waze.av.c.d) r0
            goto Lc
        Lb:
            r0 = r1
        Lc:
            if (r0 == 0) goto L47
            if (r5 == 0) goto L3f
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.Iterator r5 = r5.iterator()
        L16:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L35
            java.lang.Object r0 = r5.next()
            r2 = r0
            com.waze.li r2 = (com.waze.li) r2
            java.lang.String r2 = r2.a()
            r3 = r4
            com.waze.av.c.d r3 = (com.waze.av.c.d) r3
            java.lang.String r3 = r3.v()
            boolean r2 = h.g.b.x.n(r2, r3)
            if (r2 == 0) goto L16
            goto L36
        L35:
            r0 = r1
        L36:
            com.waze.li r0 = (com.waze.li) r0
            if (r0 == 0) goto L3f
            java.lang.String r4 = r0.b()
            goto L40
        L3f:
            r4 = r1
        L40:
            if (r4 == 0) goto L47
            com.waze.ui.ac.m r1 = new com.waze.ui.ac.m
            r1.<init>(r4)
        L47:
            com.waze.ui.ac.n r1 = (com.waze.ui.ac.n) r1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.search.v2.dd.v(java.util.List):com.waze.ui.ac.n");
    }

    private static final com.waze.ui.ac.j w(boolean z) {
        return new com.waze.ui.ac.j(true != z ? R.string.SEARCH_RESULTS_DEFAULT_TITLE : R.string.SEARCH_RESULTS_TITLE_ALONG_ROUTE);
    }

    private static final db x(String str, String str2) {
        return new db(com.waze.ad.c.b.t(str2, str) ? f.f36486b : (h.g.b.x.n(str2, "CRISIS_LOCATIONS") || h.g.b.x.n(str2, "OTHER_CRISIS_LOCATIONS") || h.g.b.x.n(str, "crisis_locations")) ? f.f36487c : h.g.b.x.n(str2, "DONATION_CENTERS") ? f.f36489e : h.g.b.x.n(str2, "SHELTER_LOCATIONS") ? f.f36488d : f.f36485a, (str == null && str2 == null) ? null : Integer.valueOf(com.waze.av.c.b.c(str, str2, null, com.waze.design_components.b.e.f23313b, 4)), str2, str);
    }

    private static final com.waze.ui.ac.m y(List list, String str) {
        Object next;
        String strB;
        if (list != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((li) next).a().equals(str)) {
                    break;
                }
            }
            li liVar = (li) next;
            if (liVar != null && (strB = liVar.b()) != null) {
                return new com.waze.ui.ac.m(strB);
            }
        }
        return null;
    }

    private static final com.waze.ui.ac.n z(com.waze.search.bc bcVar, List list, List list2, boolean z) {
        Object next;
        String str;
        String strA = bcVar.e().a();
        String strB = bcVar.e().b();
        if (strA != null) {
            com.waze.ui.ac.m mVarY = y(list, strA);
            return mVarY != null ? mVarY : w(z);
        }
        if (strB == null) {
            return w(z);
        }
        if (list2 != null) {
            Iterator it = list2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((NativeManager.VenueCategory) next).id.equals(strB)) {
                    break;
                }
            }
            NativeManager.VenueCategory venueCategory = (NativeManager.VenueCategory) next;
            if (venueCategory != null && (str = venueCategory.label) != null) {
                return new com.waze.ui.ac.m(str);
            }
        }
        return new com.waze.ui.ac.j(R.string.SEARCH_RESULTS_DEFAULT_TITLE);
    }

    public final int a() {
        return this.f36352l;
    }

    public final com.waze.navigate.location_preview.ay b() {
        return this.f36345e;
    }

    public final c c() {
        return this.f36342b;
    }

    public final e d() {
        return this.p;
    }

    public final q e() {
        return this.f36351k;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dd)) {
            return false;
        }
        dd ddVar = (dd) obj;
        if (this.f36341a != ddVar.f36341a || !h.g.b.x.n(this.u, ddVar.u) || !h.g.b.x.n(this.f36342b, ddVar.f36342b) || !h.g.b.x.n(this.f36343c, ddVar.f36343c) || !h.g.b.x.n(this.f36344d, ddVar.f36344d) || !h.g.b.x.n(this.t, ddVar.t) || !h.g.b.x.n(this.f36345e, ddVar.f36345e) || this.f36346f != ddVar.f36346f) {
            return false;
        }
        Float f2 = ddVar.f36347g;
        return h.g.b.x.n(null, null) && h.g.b.x.n(this.f36348h, ddVar.f36348h) && h.g.b.x.n(this.f36349i, ddVar.f36349i) && h.g.b.x.n(this.f36350j, ddVar.f36350j) && h.g.b.x.n(this.s, ddVar.s) && this.f36351k == ddVar.f36351k && this.f36352l == ddVar.f36352l && this.m == ddVar.m && this.n == ddVar.n && this.o == ddVar.o && h.g.b.x.n(this.v, ddVar.v) && h.g.b.x.n(this.p, ddVar.p) && this.q == ddVar.q && h.g.b.x.n(this.r, ddVar.r);
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x028a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.waze.search.v2.cz f(boolean r35, h.g.a.l r36) {
        /*
            Method dump skipped, instructions count: 719
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.search.v2.dd.f(boolean, h.g.a.l):com.waze.search.v2.cz");
    }

    public final da g() {
        return new da(this.n, this.o);
    }

    public final dc h() {
        return this.f36341a;
    }

    public final int hashCode() {
        int iHashCode = (((((((this.f36341a.hashCode() * 31) + this.u.hashCode()) * 31) + this.f36342b.hashCode()) * 31) + this.f36343c.hashCode()) * 31) + this.f36344d.hashCode();
        com.waze.sdk.bq bqVar = this.t;
        int iHashCode2 = ((iHashCode * 31) + (bqVar == null ? 0 : bqVar.hashCode())) * 31;
        com.waze.navigate.location_preview.ay ayVar = this.f36345e;
        int iHashCode3 = (iHashCode2 + (ayVar == null ? 0 : ayVar.hashCode())) * 31;
        boolean z = this.f36346f;
        com.waze.shared_infra.h.c cVar = this.f36348h;
        int iA = (((((iHashCode3 + a.a.a(z)) * 961) + (cVar == null ? 0 : cVar.hashCode())) * 31) + this.f36349i.hashCode()) * 31;
        PolylineGeometry polylineGeometry = this.f36350j;
        int iHashCode4 = (iA + (polylineGeometry == null ? 0 : polylineGeometry.hashCode())) * 31;
        com.waze.speech.k kVar = this.s;
        int iHashCode5 = (((((((((((iHashCode4 + (kVar == null ? 0 : kVar.hashCode())) * 31) + this.f36351k.hashCode()) * 31) + this.f36352l) * 31) + a.a.b(this.m)) * 31) + a.a.a(this.n)) * 31) + a.a.a(this.o)) * 31;
        com.waze.destination_cell.b.e eVar = this.v;
        int iHashCode6 = (iHashCode5 + (eVar == null ? 0 : eVar.hashCode())) * 31;
        e eVar2 = this.p;
        return ((((iHashCode6 + (eVar2 != null ? eVar2.hashCode() : 0)) * 31) + a.a.a(this.q)) * 31) + this.r.hashCode();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0275  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.waze.search.v2.dt i(com.waze.shared_infra.o.a r25, java.lang.String r26, java.util.List r27, java.util.List r28, java.lang.Integer r29, boolean r30, com.waze.shared_infra.q.e r31, com.waze.shared_infra.q.j r32, com.waze.ev.n r33, com.waze.search.v2.dt r34, com.waze.search.v2.p r35, com.waze.shared_infra.q.r r36, h.g.a.l r37) {
        /*
            Method dump skipped, instructions count: 944
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.search.v2.dd.i(com.waze.shared_infra.o.a, java.lang.String, java.util.List, java.util.List, java.lang.Integer, boolean, com.waze.shared_infra.q.e, com.waze.shared_infra.q.j, com.waze.ev.n, com.waze.search.v2.dt, com.waze.search.v2.p, com.waze.shared_infra.q.r, h.g.a.l):com.waze.search.v2.dt");
    }

    public final List j() {
        return h.a.i.i(this.u, this.t, this.f36342b, this.s, this.f36351k);
    }

    public final List k() {
        return this.r;
    }

    public final List l() {
        return h.a.i.i(this.f36348h, this.f36349i, this.f36350j, this.f36345e);
    }

    public final boolean m() {
        return this.o;
    }

    public final boolean n() {
        return this.n;
    }

    public final boolean o() {
        return this.q;
    }

    public final com.waze.speech.k p() {
        return this.s;
    }

    public final com.waze.sdk.bq q() {
        return this.t;
    }

    public final com.waze.ad.c.b r() {
        return this.u;
    }

    public final String toString() {
        return "SearchV2Model(searchStatus=" + this.f36341a + ", query=" + this.u + ", filters=" + this.f36342b + ", config=" + this.f36343c + ", locationSensorListener=" + this.f36344d + ", response=" + this.t + ", selectedLocation=" + this.f36345e + ", selectionChange=" + this.f36346f + ", viewportHeight=null, destination=" + this.f36348h + ", pinBitmaps=" + this.f36349i + ", polylineGeometry=" + this.f36350j + ", sortBy=" + this.s + ", searchMode=" + this.f36351k + ", reportedSeenIndex=" + this.f36352l + ", lastMapTouchEvent=" + this.m + ", showSearchInArea=" + this.n + ", showRecenter=" + this.o + ", focusedMapArea=" + this.v + ", currentResultsMapLoc=" + this.p + ", userMovedMap=" + this.q + ", gasTypes=" + this.r + ")";
    }
}
