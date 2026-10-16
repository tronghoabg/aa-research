package com.waze.places;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private final String f33107a;

    /* renamed from: b, reason: collision with root package name */
    private final String f33108b;

    /* renamed from: c, reason: collision with root package name */
    private final String f33109c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.shared_infra.h.c f33110d;

    /* renamed from: e, reason: collision with root package name */
    private final a f33111e;

    /* renamed from: f, reason: collision with root package name */
    private final String f33112f;

    /* renamed from: g, reason: collision with root package name */
    private final String f33113g;

    /* renamed from: h, reason: collision with root package name */
    private final String f33114h;

    /* renamed from: i, reason: collision with root package name */
    private final String f33115i;

    public f(String str, String str2, String str3, com.waze.shared_infra.h.c cVar, a aVar, String str4, String str5, String str6, String str7) {
        h.g.b.x.f(str, "venueId");
        h.g.b.x.f(str3, "placeName");
        h.g.b.x.f(cVar, "coordinate");
        h.g.b.x.f(str4, "routingContext");
        this.f33107a = str;
        this.f33108b = str2;
        this.f33109c = str3;
        this.f33110d = cVar;
        this.f33111e = aVar;
        this.f33112f = str4;
        this.f33113g = str5;
        this.f33114h = str6;
        this.f33115i = str7;
    }

    public final a a() {
        return this.f33111e;
    }

    public final com.waze.shared_infra.h.c b() {
        return this.f33110d;
    }

    public final String c() {
        return this.f33113g;
    }

    public final String d() {
        return this.f33115i;
    }

    public final String e() {
        return this.f33114h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return h.g.b.x.n(this.f33107a, fVar.f33107a) && h.g.b.x.n(this.f33108b, fVar.f33108b) && h.g.b.x.n(this.f33109c, fVar.f33109c) && h.g.b.x.n(this.f33110d, fVar.f33110d) && h.g.b.x.n(this.f33111e, fVar.f33111e) && h.g.b.x.n(this.f33112f, fVar.f33112f) && h.g.b.x.n(this.f33113g, fVar.f33113g) && h.g.b.x.n(this.f33114h, fVar.f33114h) && h.g.b.x.n(this.f33115i, fVar.f33115i);
    }

    public final String f() {
        return this.f33108b;
    }

    public final String g() {
        return this.f33109c;
    }

    public final String h() {
        return this.f33112f;
    }

    public final int hashCode() {
        int iHashCode = this.f33107a.hashCode() * 31;
        String str = this.f33108b;
        int iHashCode2 = (((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f33109c.hashCode()) * 31) + this.f33110d.hashCode()) * 31;
        a aVar = this.f33111e;
        int iHashCode3 = (((iHashCode2 + (aVar == null ? 0 : aVar.hashCode())) * 31) + this.f33112f.hashCode()) * 31;
        String str2 = this.f33113g;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f33114h;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f33115i;
        return iHashCode5 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String i() {
        return this.f33107a;
    }

    public final String toString() {
        return "Place(venueId=" + this.f33107a + ", name=" + this.f33108b + ", placeName=" + this.f33109c + ", coordinate=" + this.f33110d + ", address=" + this.f33111e + ", routingContext=" + this.f33112f + ", advertisementId=" + this.f33113g + ", internalId=" + this.f33114h + ", icon=" + this.f33115i + ")";
    }

    public /* synthetic */ f(String str, String str2, String str3, com.waze.shared_infra.h.c cVar, a aVar, String str4, String str5) {
        this(str, str2, str3, cVar, aVar, str4, str5, null, null);
    }
}
