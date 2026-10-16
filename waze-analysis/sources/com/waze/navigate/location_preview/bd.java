package com.waze.navigate.location_preview;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class bd {

    /* renamed from: a, reason: collision with root package name */
    private final String f31623a;

    /* renamed from: b, reason: collision with root package name */
    private final String f31624b;

    /* renamed from: c, reason: collision with root package name */
    private final String f31625c;

    /* renamed from: d, reason: collision with root package name */
    private final String f31626d;

    /* renamed from: e, reason: collision with root package name */
    private final String f31627e;

    /* renamed from: f, reason: collision with root package name */
    private final String f31628f;

    public bd(String str, String str2, String str3, String str4, String str5, String str6) {
        this.f31623a = str;
        this.f31624b = str2;
        this.f31625c = str3;
        this.f31626d = str4;
        this.f31627e = str5;
        this.f31628f = str6;
    }

    public final String a() {
        return this.f31624b;
    }

    public final String b() {
        return this.f31625c;
    }

    public final String c() {
        return this.f31627e;
    }

    public final String d() {
        return this.f31623a;
    }

    public final String e() {
        return this.f31626d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bd)) {
            return false;
        }
        bd bdVar = (bd) obj;
        return h.g.b.x.n(this.f31623a, bdVar.f31623a) && h.g.b.x.n(this.f31624b, bdVar.f31624b) && h.g.b.x.n(this.f31625c, bdVar.f31625c) && h.g.b.x.n(this.f31626d, bdVar.f31626d) && h.g.b.x.n(this.f31627e, bdVar.f31627e) && h.g.b.x.n(this.f31628f, bdVar.f31628f);
    }

    public final String f() {
        return this.f31628f;
    }

    public final int hashCode() {
        String str = this.f31623a;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.f31624b;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        int i2 = iHashCode * 31;
        String str3 = this.f31625c;
        int iHashCode3 = (((i2 + iHashCode2) * 31) + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f31626d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f31627e;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f31628f;
        return iHashCode5 + (str6 != null ? str6.hashCode() : 0);
    }

    public final String toString() {
        return "GoogleAdBannerInformation(headline=" + this.f31623a + ", body=" + this.f31624b + ", callToAction=" + this.f31625c + ", thumbnailUrl=" + this.f31626d + ", clickUrl=" + this.f31627e + ", visibleUrl=" + this.f31628f + ")";
    }
}
