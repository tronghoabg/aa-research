package com.waze.navigate;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class es {

    /* renamed from: a, reason: collision with root package name */
    private final int f31333a;

    /* renamed from: b, reason: collision with root package name */
    private final String f31334b;

    /* renamed from: c, reason: collision with root package name */
    private final ee f31335c;

    /* renamed from: d, reason: collision with root package name */
    private final Boolean f31336d;

    public es(int i2, String str, ee eeVar, Boolean bool) {
        h.g.b.x.f(str, "streetName");
        this.f31333a = i2;
        this.f31334b = str;
        this.f31335c = eeVar;
        this.f31336d = bool;
    }

    public final int a() {
        return this.f31333a;
    }

    public final ee b() {
        return this.f31335c;
    }

    public final Boolean c() {
        return this.f31336d;
    }

    public final String d() {
        return this.f31334b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof es)) {
            return false;
        }
        es esVar = (es) obj;
        return this.f31333a == esVar.f31333a && h.g.b.x.n(this.f31334b, esVar.f31334b) && h.g.b.x.n(this.f31335c, esVar.f31335c) && h.g.b.x.n(this.f31336d, esVar.f31336d);
    }

    public final int hashCode() {
        int iHashCode = (this.f31333a * 31) + this.f31334b.hashCode();
        ee eeVar = this.f31335c;
        int iHashCode2 = ((iHashCode * 31) + (eeVar == null ? 0 : eeVar.hashCode())) * 31;
        Boolean bool = this.f31336d;
        return iHashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return "NavigationStreetInfo(segmentId=" + this.f31333a + ", streetName=" + this.f31334b + ", roadSign=" + this.f31335c + ", hasHov=" + this.f31336d + ")";
    }
}
