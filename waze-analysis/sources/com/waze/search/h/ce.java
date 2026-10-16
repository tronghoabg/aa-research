package com.waze.search.h;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ce {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.z.a.d.an f35890a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f35891b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f35892c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f35893d;

    /* renamed from: e, reason: collision with root package name */
    private final com.waze.ui.ac.n f35894e;

    /* renamed from: f, reason: collision with root package name */
    private final ae f35895f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f35896g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f35897h;

    /* renamed from: i, reason: collision with root package name */
    private final com.waze.ui.j.j f35898i;

    /* renamed from: j, reason: collision with root package name */
    private final com.waze.search.v2.o f35899j;

    /* renamed from: k, reason: collision with root package name */
    private final com.waze.search.v2.o f35900k;

    /* renamed from: l, reason: collision with root package name */
    private final com.waze.settings.v f35901l;

    public ce(com.waze.z.a.d.an anVar, com.waze.settings.v vVar, com.waze.search.v2.o oVar, com.waze.search.v2.o oVar2, boolean z, boolean z2, boolean z3, com.waze.ui.ac.n nVar, ae aeVar, boolean z4, boolean z5, com.waze.ui.j.j jVar) {
        h.g.b.x.f(anVar, "searchFieldState");
        h.g.b.x.f(vVar, "searchState");
        h.g.b.x.f(oVar, "contactsPermissionState");
        h.g.b.x.f(oVar2, "calendarPermissionState");
        h.g.b.x.f(jVar, "hamburgerButtonStateHolder");
        this.f35890a = anVar;
        this.f35901l = vVar;
        this.f35899j = oVar;
        this.f35900k = oVar2;
        this.f35891b = z;
        this.f35892c = z2;
        this.f35893d = z3;
        this.f35894e = nVar;
        this.f35895f = aeVar;
        this.f35896g = z4;
        this.f35897h = z5;
        this.f35898i = jVar;
    }

    public static /* synthetic */ ce l(ce ceVar, com.waze.z.a.d.an anVar, com.waze.settings.v vVar, com.waze.search.v2.o oVar, com.waze.search.v2.o oVar2, boolean z, boolean z2, boolean z3, com.waze.ui.ac.n nVar, ae aeVar, boolean z4, int i2) {
        com.waze.z.a.d.an anVar2 = (i2 & 1) != 0 ? ceVar.f35890a : anVar;
        com.waze.settings.v vVar2 = (i2 & 2) != 0 ? ceVar.f35901l : vVar;
        com.waze.search.v2.o oVar3 = (i2 & 4) != 0 ? ceVar.f35899j : oVar;
        com.waze.search.v2.o oVar4 = (i2 & 8) != 0 ? ceVar.f35900k : oVar2;
        boolean z5 = (i2 & 16) != 0 ? ceVar.f35891b : z;
        boolean z6 = (i2 & 32) != 0 ? ceVar.f35892c : z2;
        boolean z7 = (i2 & 64) != 0 ? ceVar.f35893d : z3;
        com.waze.ui.ac.n nVar2 = (i2 & 128) != 0 ? ceVar.f35894e : nVar;
        ae aeVar2 = (i2 & 256) != 0 ? ceVar.f35895f : aeVar;
        boolean z8 = (i2 & 512) != 0 ? ceVar.f35896g : false;
        boolean z9 = (i2 & 1024) != 0 ? ceVar.f35897h : z4;
        com.waze.ui.j.j jVar = ceVar.f35898i;
        h.g.b.x.f(anVar2, "searchFieldState");
        h.g.b.x.f(vVar2, "searchState");
        h.g.b.x.f(oVar3, "contactsPermissionState");
        h.g.b.x.f(oVar4, "calendarPermissionState");
        h.g.b.x.f(jVar, "hamburgerButtonStateHolder");
        return new ce(anVar2, vVar2, oVar3, oVar4, z5, z6, z7, nVar2, aeVar2, z8, z9, jVar);
    }

    public final com.waze.z.a.d.an a() {
        return this.f35890a;
    }

    public final ae b() {
        return this.f35895f;
    }

    public final com.waze.ui.ac.n c() {
        return this.f35894e;
    }

    public final boolean d() {
        return this.f35896g;
    }

    public final boolean e() {
        return this.f35897h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ce)) {
            return false;
        }
        ce ceVar = (ce) obj;
        return h.g.b.x.n(this.f35890a, ceVar.f35890a) && h.g.b.x.n(this.f35901l, ceVar.f35901l) && h.g.b.x.n(this.f35899j, ceVar.f35899j) && h.g.b.x.n(this.f35900k, ceVar.f35900k) && this.f35891b == ceVar.f35891b && this.f35892c == ceVar.f35892c && this.f35893d == ceVar.f35893d && h.g.b.x.n(this.f35894e, ceVar.f35894e) && h.g.b.x.n(this.f35895f, ceVar.f35895f) && this.f35896g == ceVar.f35896g && this.f35897h == ceVar.f35897h && h.g.b.x.n(this.f35898i, ceVar.f35898i);
    }

    public final boolean f() {
        return this.f35891b;
    }

    public final boolean g() {
        return this.f35893d;
    }

    public final boolean h() {
        return this.f35892c;
    }

    public final int hashCode() {
        int iHashCode = (((((this.f35890a.hashCode() * 31) + this.f35901l.hashCode()) * 31) + this.f35899j.hashCode()) * 31) + this.f35900k.hashCode();
        com.waze.ui.ac.n nVar = this.f35894e;
        int iHashCode2 = nVar == null ? 0 : nVar.hashCode();
        int iA = ((((((((iHashCode * 31) + a.a.a(this.f35891b)) * 31) + a.a.a(this.f35892c)) * 31) + a.a.a(this.f35893d)) * 31) + iHashCode2) * 31;
        ae aeVar = this.f35895f;
        return ((((((iA + (aeVar != null ? aeVar.hashCode() : 0)) * 31) + a.a.a(this.f35896g)) * 31) + a.a.a(this.f35897h)) * 31) + this.f35898i.hashCode();
    }

    public final com.waze.search.v2.o i() {
        return this.f35900k;
    }

    public final com.waze.search.v2.o j() {
        return this.f35899j;
    }

    public final com.waze.settings.v k() {
        return this.f35901l;
    }

    public final String toString() {
        return "SearchScreenState(searchFieldState=" + this.f35890a + ", searchState=" + this.f35901l + ", contactsPermissionState=" + this.f35899j + ", calendarPermissionState=" + this.f35900k + ", loadingVenue=" + this.f35891b + ", typeWhileDrivingWarning=" + this.f35892c + ", showingCalendarPermissionDeniedDialog=" + this.f35893d + ", snackBarText=" + this.f35894e + ", longClickedItem=" + this.f35895f + ", addStopMode=" + this.f35896g + ", landscape=" + this.f35897h + ", hamburgerButtonStateHolder=" + this.f35898i + ")";
    }
}
