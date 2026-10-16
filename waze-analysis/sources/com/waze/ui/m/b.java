package com.waze.ui.m;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final String f42804a;

    /* renamed from: b, reason: collision with root package name */
    private final String f42805b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f42806c;

    /* renamed from: d, reason: collision with root package name */
    private final String f42807d;

    /* renamed from: e, reason: collision with root package name */
    private final String f42808e;

    /* renamed from: f, reason: collision with root package name */
    private final String f42809f;

    /* renamed from: g, reason: collision with root package name */
    private final String f42810g;

    /* renamed from: h, reason: collision with root package name */
    private final String f42811h;

    /* renamed from: i, reason: collision with root package name */
    private final String f42812i;

    /* renamed from: j, reason: collision with root package name */
    private final String f42813j;

    /* renamed from: k, reason: collision with root package name */
    private final String f42814k;

    /* renamed from: l, reason: collision with root package name */
    private final String f42815l;
    private final String m;

    public b(String str, String str2, boolean z, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12) {
        h.g.b.x.f(str, "adId");
        h.g.b.x.f(str2, "placeId");
        this.f42804a = str;
        this.f42805b = str2;
        this.f42806c = z;
        this.f42807d = str3;
        this.f42808e = str4;
        this.f42809f = str5;
        this.f42810g = str6;
        this.f42811h = str7;
        this.f42812i = str8;
        this.f42813j = str9;
        this.f42814k = str10;
        this.f42815l = str11;
        this.m = str12;
    }

    public final String a() {
        return this.f42815l;
    }

    public final String b() {
        return this.f42804a;
    }

    public final String c() {
        return this.f42810g;
    }

    public final String d() {
        return this.f42809f;
    }

    public final String e() {
        return this.f42811h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return h.g.b.x.n(this.f42804a, bVar.f42804a) && h.g.b.x.n(this.f42805b, bVar.f42805b) && this.f42806c == bVar.f42806c && h.g.b.x.n(this.f42807d, bVar.f42807d) && h.g.b.x.n(this.f42808e, bVar.f42808e) && h.g.b.x.n(this.f42809f, bVar.f42809f) && h.g.b.x.n(this.f42810g, bVar.f42810g) && h.g.b.x.n(this.f42811h, bVar.f42811h) && h.g.b.x.n(this.f42812i, bVar.f42812i) && h.g.b.x.n(this.f42813j, bVar.f42813j) && h.g.b.x.n(this.f42814k, bVar.f42814k) && h.g.b.x.n(this.f42815l, bVar.f42815l) && h.g.b.x.n(this.m, bVar.m);
    }

    public final String f() {
        return this.f42808e;
    }

    public final String g() {
        return this.f42814k;
    }

    public final String h() {
        return this.f42805b;
    }

    public final int hashCode() {
        int iHashCode = (this.f42804a.hashCode() * 31) + this.f42805b.hashCode();
        String str = this.f42807d;
        int iA = ((((iHashCode * 31) + a.a.a(this.f42806c)) * 31) + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f42808e;
        int iHashCode2 = (iA + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f42809f;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f42810g;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f42811h;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f42812i;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f42813j;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f42814k;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.f42815l;
        int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.m;
        return iHashCode9 + (str10 != null ? str10.hashCode() : 0);
    }

    public final String i() {
        return this.f42807d;
    }

    public final String j() {
        return this.m;
    }

    public final String k() {
        return this.f42812i;
    }

    public final String l() {
        return this.f42813j;
    }

    public final boolean m() {
        return this.f42806c;
    }

    public final String toString() {
        return "AdData(adId=" + this.f42804a + ", placeId=" + this.f42805b + ", isTest=" + this.f42806c + ", placeName=" + this.f42807d + ", iconUrl=" + this.f42808e + ", bannerHeadline=" + this.f42809f + ", bannerBody=" + this.f42810g + ", ctaMessage=" + this.f42811h + ", url=" + this.f42812i + ", visibleUrl=" + this.f42813j + ", imageUrl=" + this.f42814k + ", aboutThisAdUrl=" + this.f42815l + ", trackAddStopUrl=" + this.m + ")";
    }
}
