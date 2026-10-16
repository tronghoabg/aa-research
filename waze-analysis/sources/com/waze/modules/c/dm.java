package com.waze.modules.c;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class dm {

    /* renamed from: a, reason: collision with root package name */
    private final Double f30092a;

    /* renamed from: b, reason: collision with root package name */
    private final String f30093b;

    /* renamed from: c, reason: collision with root package name */
    private final Integer f30094c;

    /* renamed from: d, reason: collision with root package name */
    private final String f30095d;

    /* renamed from: e, reason: collision with root package name */
    private final String f30096e;

    /* renamed from: f, reason: collision with root package name */
    private final String f30097f;

    /* renamed from: g, reason: collision with root package name */
    private final Double f30098g;

    /* renamed from: h, reason: collision with root package name */
    private final Integer f30099h;

    /* renamed from: i, reason: collision with root package name */
    private final Double f30100i;

    /* renamed from: j, reason: collision with root package name */
    private final String f30101j;

    public dm(Double d2, String str, Integer num, String str2, String str3, String str4, Double d3, Integer num2, Double d4, String str5) {
        this.f30092a = d2;
        this.f30093b = str;
        this.f30094c = num;
        this.f30095d = str2;
        this.f30096e = str3;
        this.f30097f = str4;
        this.f30098g = d3;
        this.f30099h = num2;
        this.f30100i = d4;
        this.f30101j = str5;
    }

    public final Double a() {
        return this.f30098g;
    }

    public final Double b() {
        return this.f30100i;
    }

    public final Double c() {
        return this.f30092a;
    }

    public final Integer d() {
        return this.f30094c;
    }

    public final Integer e() {
        return this.f30099h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dm)) {
            return false;
        }
        dm dmVar = (dm) obj;
        return h.g.b.x.n(this.f30092a, dmVar.f30092a) && h.g.b.x.n(this.f30093b, dmVar.f30093b) && h.g.b.x.n(this.f30094c, dmVar.f30094c) && h.g.b.x.n(this.f30095d, dmVar.f30095d) && h.g.b.x.n(this.f30096e, dmVar.f30096e) && h.g.b.x.n(this.f30097f, dmVar.f30097f) && h.g.b.x.n(this.f30098g, dmVar.f30098g) && h.g.b.x.n(this.f30099h, dmVar.f30099h) && h.g.b.x.n(this.f30100i, dmVar.f30100i) && h.g.b.x.n(this.f30101j, dmVar.f30101j);
    }

    public final String f() {
        return this.f30095d;
    }

    public final String g() {
        return this.f30097f;
    }

    public final String h() {
        return this.f30101j;
    }

    public final int hashCode() {
        Double d2 = this.f30092a;
        int iHashCode = d2 == null ? 0 : d2.hashCode();
        String str = this.f30093b;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        int i2 = iHashCode * 31;
        Integer num = this.f30094c;
        int iHashCode3 = (((i2 + iHashCode2) * 31) + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.f30095d;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f30096e;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f30097f;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Double d3 = this.f30098g;
        int iHashCode7 = (iHashCode6 + (d3 == null ? 0 : d3.hashCode())) * 31;
        Integer num2 = this.f30099h;
        int iHashCode8 = (iHashCode7 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Double d4 = this.f30100i;
        int iHashCode9 = (iHashCode8 + (d4 == null ? 0 : d4.hashCode())) * 31;
        String str5 = this.f30101j;
        return iHashCode9 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String i() {
        return this.f30093b;
    }

    public final String j() {
        return this.f30096e;
    }

    public final String toString() {
        return "TollInfo(tollPrice=" + this.f30092a + ", tollPriceCurrencyCode=" + this.f30093b + ", popupId=" + this.f30094c + ", actionUrl=" + this.f30095d + ", tollRoadName=" + this.f30096e + ", passBasedMissingPassName=" + this.f30097f + ", passBasedPriceChangeToPrice=" + this.f30098g + ", timeBasedPriceChangeAtSeconds=" + this.f30099h + ", timeBasedPriceChangeToPrice=" + this.f30100i + ", passBasedUserPassName=" + this.f30101j + ")";
    }
}
