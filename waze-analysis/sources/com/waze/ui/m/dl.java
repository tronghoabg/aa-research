package com.waze.ui.m;

import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class dl {

    /* renamed from: a, reason: collision with root package name */
    private final ci f42976a;

    /* renamed from: b, reason: collision with root package name */
    private final dd f42977b;

    /* renamed from: c, reason: collision with root package name */
    private final dx f42978c;

    /* renamed from: d, reason: collision with root package name */
    private final t f42979d;

    /* renamed from: e, reason: collision with root package name */
    private final r f42980e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f42981f;

    /* renamed from: g, reason: collision with root package name */
    private final p f42982g;

    /* renamed from: h, reason: collision with root package name */
    private final o f42983h;

    /* renamed from: i, reason: collision with root package name */
    private final dt f42984i;

    /* renamed from: j, reason: collision with root package name */
    private final List f42985j;

    /* renamed from: k, reason: collision with root package name */
    private final y f42986k;

    /* renamed from: l, reason: collision with root package name */
    private final dn f42987l;
    private final com.waze.ui.ac.n m;
    private final List n;
    private final com.waze.ui.c o;
    private final k p;
    private final ae q;
    private final boolean r;
    private final boolean s;
    private final boolean t;
    private final List u;
    private final String v;
    private final b w;
    private final boolean x;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ dl(ci ciVar, dd ddVar, dx dxVar, t tVar, r rVar, boolean z, p pVar, o oVar, dt dtVar, List list, y yVar, dn dnVar, com.waze.ui.ac.n nVar, List list2, k kVar, boolean z2, boolean z3, List list3, String str, b bVar, boolean z4, int i2) {
        List listH = (i2 & 512) != 0 ? h.a.i.h() : list;
        dn dnVar2 = (i2 & 2048) != 0 ? null : dnVar;
        com.waze.ui.ac.n nVar2 = (i2 & 4096) != 0 ? null : nVar;
        List listH2 = (1048576 & i2) != 0 ? h.a.i.h() : list3;
        int i3 = i2 & 128;
        int i4 = i2 & 64;
        int i5 = i2 & 16;
        int i6 = i2 & 8;
        int i7 = i2 & 2;
        boolean z5 = (i2 & 32) == 0;
        o oVar2 = i3 != 0 ? null : oVar;
        p pVar2 = i4 != 0 ? null : pVar;
        boolean z6 = z5 & z;
        r rVar2 = i5 != 0 ? null : rVar;
        this(ciVar, i7 != 0 ? null : ddVar, dxVar, i6 != 0 ? null : tVar, rVar2, z6, pVar2, oVar2, dtVar, listH, yVar, dnVar2, nVar2, list2, null, kVar, null, z2, z3, false, listH2, (2097152 & i2) != 0 ? null : str, (i2 & 4194304) != 0 ? null : bVar, z4);
    }

    public static /* synthetic */ dl y(dl dlVar, y yVar, com.waze.ui.c cVar, ae aeVar, boolean z, int i2) {
        ci ciVar = (i2 & 1) != 0 ? dlVar.f42976a : null;
        dd ddVar = (i2 & 2) != 0 ? dlVar.f42977b : null;
        dx dxVar = (i2 & 4) != 0 ? dlVar.f42978c : null;
        t tVar = (i2 & 8) != 0 ? dlVar.f42979d : null;
        r rVar = (i2 & 16) != 0 ? dlVar.f42980e : null;
        boolean z2 = (i2 & 32) != 0 ? dlVar.f42981f : false;
        p pVar = (i2 & 64) != 0 ? dlVar.f42982g : null;
        o oVar = (i2 & 128) != 0 ? dlVar.f42983h : null;
        dt dtVar = (i2 & 256) != 0 ? dlVar.f42984i : null;
        List list = (i2 & 512) != 0 ? dlVar.f42985j : null;
        y yVar2 = (i2 & 1024) != 0 ? dlVar.f42986k : yVar;
        dn dnVar = (i2 & 2048) != 0 ? dlVar.f42987l : null;
        com.waze.ui.ac.n nVar = (i2 & 4096) != 0 ? dlVar.m : null;
        List list2 = (i2 & 8192) != 0 ? dlVar.n : null;
        com.waze.ui.c cVar2 = (i2 & 16384) != 0 ? dlVar.o : cVar;
        k kVar = (32768 & i2) != 0 ? dlVar.p : null;
        ae aeVar2 = (65536 & i2) != 0 ? dlVar.q : aeVar;
        boolean z3 = (131072 & i2) != 0 ? dlVar.r : false;
        boolean z4 = (262144 & i2) != 0 ? dlVar.s : false;
        boolean z5 = (i2 & 524288) != 0 ? dlVar.t : z;
        List list3 = dlVar.u;
        String str = dlVar.v;
        b bVar = dlVar.w;
        boolean z6 = dlVar.x;
        h.g.b.x.f(ciVar, "header");
        h.g.b.x.f(dxVar, "actions");
        h.g.b.x.f(dtVar, "parkingSuggestion");
        h.g.b.x.f(list, "services");
        h.g.b.x.f(yVar2, "imageCarousel");
        h.g.b.x.f(list2, "attributions");
        h.g.b.x.f(list3, "parkingRates");
        return new dl(ciVar, ddVar, dxVar, tVar, rVar, z2, pVar, oVar, dtVar, list, yVar2, dnVar, nVar, list2, cVar2, kVar, aeVar2, z3, z4, z5, list3, str, bVar, z6);
    }

    public final com.waze.ui.c a() {
        return this.o;
    }

    public final b b() {
        return this.w;
    }

    public final k c() {
        return this.p;
    }

    public final o d() {
        return this.f42983h;
    }

    public final p e() {
        return this.f42982g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dl)) {
            return false;
        }
        dl dlVar = (dl) obj;
        return h.g.b.x.n(this.f42976a, dlVar.f42976a) && h.g.b.x.n(this.f42977b, dlVar.f42977b) && h.g.b.x.n(this.f42978c, dlVar.f42978c) && h.g.b.x.n(this.f42979d, dlVar.f42979d) && h.g.b.x.n(this.f42980e, dlVar.f42980e) && this.f42981f == dlVar.f42981f && h.g.b.x.n(this.f42982g, dlVar.f42982g) && h.g.b.x.n(this.f42983h, dlVar.f42983h) && h.g.b.x.n(this.f42984i, dlVar.f42984i) && h.g.b.x.n(this.f42985j, dlVar.f42985j) && h.g.b.x.n(this.f42986k, dlVar.f42986k) && h.g.b.x.n(this.f42987l, dlVar.f42987l) && h.g.b.x.n(this.m, dlVar.m) && h.g.b.x.n(this.n, dlVar.n) && h.g.b.x.n(this.o, dlVar.o) && h.g.b.x.n(this.p, dlVar.p) && h.g.b.x.n(this.q, dlVar.q) && this.r == dlVar.r && this.s == dlVar.s && this.t == dlVar.t && h.g.b.x.n(this.u, dlVar.u) && h.g.b.x.n(this.v, dlVar.v) && h.g.b.x.n(this.w, dlVar.w) && this.x == dlVar.x;
    }

    public final r f() {
        return this.f42980e;
    }

    public final t g() {
        return this.f42979d;
    }

    public final y h() {
        return this.f42986k;
    }

    public final int hashCode() {
        int iHashCode = this.f42976a.hashCode() * 31;
        dd ddVar = this.f42977b;
        int iHashCode2 = (((iHashCode + (ddVar == null ? 0 : ddVar.hashCode())) * 31) + this.f42978c.hashCode()) * 31;
        t tVar = this.f42979d;
        int iHashCode3 = (iHashCode2 + (tVar == null ? 0 : tVar.hashCode())) * 31;
        r rVar = this.f42980e;
        int iHashCode4 = (((iHashCode3 + (rVar == null ? 0 : rVar.hashCode())) * 31) + a.a.a(this.f42981f)) * 31;
        p pVar = this.f42982g;
        int iHashCode5 = (iHashCode4 + (pVar == null ? 0 : pVar.hashCode())) * 31;
        o oVar = this.f42983h;
        int iHashCode6 = (((((((iHashCode5 + (oVar == null ? 0 : oVar.hashCode())) * 31) + this.f42984i.hashCode()) * 31) + this.f42985j.hashCode()) * 31) + this.f42986k.hashCode()) * 31;
        dn dnVar = this.f42987l;
        int iHashCode7 = (iHashCode6 + (dnVar == null ? 0 : dnVar.hashCode())) * 31;
        com.waze.ui.ac.n nVar = this.m;
        int iHashCode8 = (((iHashCode7 + (nVar == null ? 0 : nVar.hashCode())) * 31) + this.n.hashCode()) * 31;
        com.waze.ui.c cVar = this.o;
        int iHashCode9 = (iHashCode8 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        k kVar = this.p;
        int iHashCode10 = (iHashCode9 + (kVar == null ? 0 : kVar.hashCode())) * 31;
        ae aeVar = this.q;
        int iHashCode11 = (((((((((iHashCode10 + (aeVar == null ? 0 : aeVar.hashCode())) * 31) + a.a.a(this.r)) * 31) + a.a.a(this.s)) * 31) + a.a.a(this.t)) * 31) + this.u.hashCode()) * 31;
        String str = this.v;
        int iHashCode12 = (iHashCode11 + (str == null ? 0 : str.hashCode())) * 31;
        b bVar = this.w;
        return ((iHashCode12 + (bVar != null ? bVar.hashCode() : 0)) * 31) + a.a.a(this.x);
    }

    public final ae i() {
        return this.q;
    }

    public final ci j() {
        return this.f42976a;
    }

    public final dd k() {
        return this.f42977b;
    }

    public final dn l() {
        return this.f42987l;
    }

    public final dt m() {
        return this.f42984i;
    }

    public final dx n() {
        return this.f42978c;
    }

    public final com.waze.ui.ac.n o() {
        return this.m;
    }

    public final String p() {
        return this.v;
    }

    public final List q() {
        return this.n;
    }

    public final List r() {
        return this.u;
    }

    public final List s() {
        return this.f42985j;
    }

    public final boolean t() {
        return this.x;
    }

    public final String toString() {
        return "LocationPreviewState(header=" + this.f42976a + ", parkingInfo=" + this.f42977b + ", actions=" + this.f42978c + ", gasPrices=" + this.f42979d + ", evPlugs=" + this.f42980e + ", evRestrictedAccess=" + this.f42981f + ", evPaymentMethods=" + this.f42982g + ", evDirections=" + this.f42983h + ", parkingSuggestion=" + this.f42984i + ", services=" + this.f42985j + ", imageCarousel=" + this.f42986k + ", openingHours=" + this.f42987l + ", about=" + this.m + ", attributions=" + this.n + ", bottomMenu=" + this.o + ", bottomButtons=" + this.p + ", dialogRequest=" + this.q + ", unverifiedEventMode=" + this.r + ", mapEmpty=" + this.s + ", legalPopupDisplayed=" + this.t + ", parkingRates=" + this.u + ", reservationUri=" + this.v + ", adData=" + this.w + ", addStopMode=" + this.x + ")";
    }

    public final boolean u() {
        return this.f42981f;
    }

    public final boolean v() {
        return this.t;
    }

    public final boolean w() {
        return this.s;
    }

    public final boolean x() {
        return this.r;
    }

    public dl(ci ciVar, dd ddVar, dx dxVar, t tVar, r rVar, boolean z, p pVar, o oVar, dt dtVar, List list, y yVar, dn dnVar, com.waze.ui.ac.n nVar, List list2, com.waze.ui.c cVar, k kVar, ae aeVar, boolean z2, boolean z3, boolean z4, List list3, String str, b bVar, boolean z5) {
        h.g.b.x.f(ciVar, "header");
        h.g.b.x.f(dxVar, "actions");
        h.g.b.x.f(dtVar, "parkingSuggestion");
        h.g.b.x.f(list, "services");
        h.g.b.x.f(yVar, "imageCarousel");
        h.g.b.x.f(list2, "attributions");
        h.g.b.x.f(list3, "parkingRates");
        this.f42976a = ciVar;
        this.f42977b = ddVar;
        this.f42978c = dxVar;
        this.f42979d = tVar;
        this.f42980e = rVar;
        this.f42981f = z;
        this.f42982g = pVar;
        this.f42983h = oVar;
        this.f42984i = dtVar;
        this.f42985j = list;
        this.f42986k = yVar;
        this.f42987l = dnVar;
        this.m = nVar;
        this.n = list2;
        this.o = cVar;
        this.p = kVar;
        this.q = aeVar;
        this.r = z2;
        this.s = z3;
        this.t = z4;
        this.u = list3;
        this.v = str;
        this.w = bVar;
        this.x = z5;
    }
}
