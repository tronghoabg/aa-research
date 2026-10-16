package com.waze.search.v2;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class dj {

    /* renamed from: a, reason: collision with root package name */
    private final Integer f36370a;

    /* renamed from: b, reason: collision with root package name */
    private final Integer f36371b;

    /* renamed from: c, reason: collision with root package name */
    private final Integer f36372c;

    /* renamed from: d, reason: collision with root package name */
    private final String f36373d;

    /* renamed from: e, reason: collision with root package name */
    private final String f36374e;

    /* renamed from: f, reason: collision with root package name */
    private final f f36375f;

    public /* synthetic */ dj(Integer num, Integer num2, Integer num3, String str, String str2, f fVar, int i2) {
        fVar = (i2 & 32) != 0 ? f.f36485a : fVar;
        int i3 = i2 & 16;
        int i4 = i2 & 8;
        int i5 = i2 & 4;
        int i6 = i2 & 2;
        int i7 = i2 & 1;
        str2 = i3 != 0 ? null : str2;
        str = i4 != 0 ? null : str;
        num3 = i5 != 0 ? null : num3;
        num2 = i6 != 0 ? null : num2;
        num = 1 == i7 ? null : num;
        h.g.b.x.f(fVar, "backgroundType");
        this.f36370a = num;
        this.f36371b = num2;
        this.f36372c = num3;
        this.f36373d = str;
        this.f36374e = str2;
        this.f36375f = fVar;
    }

    public final f a() {
        return this.f36375f;
    }

    public final Integer b() {
        return this.f36372c;
    }

    public final Integer c() {
        return this.f36371b;
    }

    public final Integer d() {
        return this.f36370a;
    }

    public final String e() {
        return this.f36373d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dj)) {
            return false;
        }
        dj djVar = (dj) obj;
        return h.g.b.x.n(this.f36370a, djVar.f36370a) && h.g.b.x.n(this.f36371b, djVar.f36371b) && h.g.b.x.n(this.f36372c, djVar.f36372c) && h.g.b.x.n(this.f36373d, djVar.f36373d) && h.g.b.x.n(this.f36374e, djVar.f36374e) && this.f36375f == djVar.f36375f;
    }

    public final String f() {
        return this.f36374e;
    }

    public final int hashCode() {
        Integer num = this.f36370a;
        int iHashCode = num == null ? 0 : num.hashCode();
        Integer num2 = this.f36371b;
        int iHashCode2 = num2 == null ? 0 : num2.hashCode();
        int i2 = iHashCode * 31;
        Integer num3 = this.f36372c;
        int iHashCode3 = (((i2 + iHashCode2) * 31) + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str = this.f36373d;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f36374e;
        return ((iHashCode4 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.f36375f.hashCode();
    }

    public final String toString() {
        return "SearchV2PinData(pinResId=" + this.f36370a + ", imageResId=" + this.f36371b + ", badgeResId=" + this.f36372c + ", logoResStr=" + this.f36373d + ", textValue=" + this.f36374e + ", backgroundType=" + this.f36375f + ")";
    }

    public dj() {
        this(null, null, null, null, null, null, 63);
    }
}
