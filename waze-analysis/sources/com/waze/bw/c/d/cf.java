package com.waze.bw.c.d;

import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class cf {

    /* renamed from: a, reason: collision with root package name */
    private final ce f18013a;

    /* renamed from: b, reason: collision with root package name */
    private final bo f18014b;

    /* renamed from: c, reason: collision with root package name */
    private final List f18015c;

    /* renamed from: d, reason: collision with root package name */
    private final List f18016d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f18017e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f18018f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f18019g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f18020h;

    public cf(ce ceVar, bo boVar, List list, List list2, boolean z, boolean z2, boolean z3, boolean z4) {
        h.g.b.x.f(ceVar, "searchHeaderType");
        h.g.b.x.f(boVar, "favorites");
        h.g.b.x.f(list, "upcoming");
        h.g.b.x.f(list2, "recents");
        this.f18013a = ceVar;
        this.f18014b = boVar;
        this.f18015c = list;
        this.f18016d = list2;
        this.f18017e = z;
        this.f18018f = z2;
        this.f18019g = z3;
        this.f18020h = z4;
    }

    public static /* synthetic */ cf i(cf cfVar, ce ceVar, bo boVar, List list, List list2, boolean z, boolean z2, boolean z3, boolean z4, int i2) {
        if ((i2 & 1) != 0) {
            ceVar = cfVar.f18013a;
        }
        ce ceVar2 = ceVar;
        if ((i2 & 2) != 0) {
            boVar = cfVar.f18014b;
        }
        bo boVar2 = boVar;
        if ((i2 & 4) != 0) {
            list = cfVar.f18015c;
        }
        List list3 = list;
        if ((i2 & 8) != 0) {
            list2 = cfVar.f18016d;
        }
        List list4 = list2;
        if ((i2 & 16) != 0) {
            z = cfVar.f18017e;
        }
        boolean z5 = z;
        if ((i2 & 32) != 0) {
            z2 = cfVar.f18018f;
        }
        boolean z6 = z2;
        boolean z7 = (i2 & 64) != 0 ? cfVar.f18019g : z3;
        boolean z8 = (i2 & 128) != 0 ? cfVar.f18020h : z4;
        h.g.b.x.f(ceVar2, "searchHeaderType");
        h.g.b.x.f(boVar2, "favorites");
        h.g.b.x.f(list3, "upcoming");
        h.g.b.x.f(list4, "recents");
        return new cf(ceVar2, boVar2, list3, list4, z5, z6, z7, z8);
    }

    public final bo a() {
        return this.f18014b;
    }

    public final ce b() {
        return this.f18013a;
    }

    public final List c() {
        return this.f18016d;
    }

    public final List d() {
        return this.f18015c;
    }

    public final boolean e() {
        return this.f18018f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cf)) {
            return false;
        }
        cf cfVar = (cf) obj;
        return h.g.b.x.n(this.f18013a, cfVar.f18013a) && h.g.b.x.n(this.f18014b, cfVar.f18014b) && h.g.b.x.n(this.f18015c, cfVar.f18015c) && h.g.b.x.n(this.f18016d, cfVar.f18016d) && this.f18017e == cfVar.f18017e && this.f18018f == cfVar.f18018f && this.f18019g == cfVar.f18019g && this.f18020h == cfVar.f18020h;
    }

    public final boolean f() {
        return this.f18017e;
    }

    public final boolean g() {
        return this.f18020h;
    }

    public final boolean h() {
        return this.f18019g;
    }

    public final int hashCode() {
        int iHashCode = (((((this.f18013a.hashCode() * 31) + this.f18014b.hashCode()) * 31) + this.f18015c.hashCode()) * 31) + this.f18016d.hashCode();
        boolean z = this.f18020h;
        boolean z2 = this.f18019g;
        return (((((((iHashCode * 31) + a.a.a(this.f18017e)) * 31) + a.a.a(this.f18018f)) * 31) + a.a.a(z2)) * 31) + a.a.a(z);
    }

    public final String toString() {
        return "State(searchHeaderType=" + this.f18013a + ", favorites=" + this.f18014b + ", upcoming=" + this.f18015c + ", recents=" + this.f18016d + ", areContactsConnected=" + this.f18017e + ", areCalendarPermissionsGranted=" + this.f18018f + ", isCalendarEnabled=" + this.f18019g + ", shouldShowOfflineError=" + this.f18020h + ")";
    }
}
