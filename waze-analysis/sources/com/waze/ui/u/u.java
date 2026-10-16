package com.waze.ui.u;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    private final String f43468a;

    /* renamed from: b, reason: collision with root package name */
    private final String f43469b;

    /* renamed from: c, reason: collision with root package name */
    private final String f43470c;

    /* renamed from: d, reason: collision with root package name */
    private final String f43471d;

    /* renamed from: e, reason: collision with root package name */
    private final String f43472e;

    /* renamed from: f, reason: collision with root package name */
    private final String f43473f;

    /* renamed from: g, reason: collision with root package name */
    private final ai f43474g;

    public u(String str, String str2, String str3, String str4, String str5, String str6, ai aiVar) {
        this.f43468a = str;
        this.f43469b = str2;
        this.f43470c = str3;
        this.f43471d = str4;
        this.f43472e = str5;
        this.f43473f = str6;
        this.f43474g = aiVar;
    }

    public final ai a() {
        return this.f43474g;
    }

    public final String b() {
        return this.f43469b;
    }

    public final String c() {
        return this.f43471d;
    }

    public final String d() {
        return this.f43470c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return h.g.b.x.n(this.f43468a, uVar.f43468a) && h.g.b.x.n(this.f43469b, uVar.f43469b) && h.g.b.x.n(this.f43470c, uVar.f43470c) && h.g.b.x.n(this.f43471d, uVar.f43471d) && h.g.b.x.n(this.f43472e, uVar.f43472e) && h.g.b.x.n(this.f43473f, uVar.f43473f) && h.g.b.x.n(this.f43474g, uVar.f43474g);
    }

    public final int hashCode() {
        String str = this.f43468a;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.f43469b;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        int i2 = iHashCode * 31;
        String str3 = this.f43470c;
        int iHashCode3 = (((i2 + iHashCode2) * 31) + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f43471d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f43472e;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f43473f;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        ai aiVar = this.f43474g;
        return iHashCode6 + (aiVar != null ? aiVar.hashCode() : 0);
    }

    public final String toString() {
        return "Address(country=" + this.f43468a + ", city=" + this.f43469b + ", streetName=" + this.f43470c + ", houseNumber=" + this.f43471d + ", state=" + this.f43472e + ", zip=" + this.f43473f + ", venueData=" + this.f43474g + ")";
    }
}
