package com.waze.navigate.location_preview;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class be {

    /* renamed from: a, reason: collision with root package name */
    private final String f31629a;

    /* renamed from: b, reason: collision with root package name */
    private final String f31630b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f31631c;

    public be(String str, String str2, boolean z) {
        h.g.b.x.f(str, "adImpressionId");
        h.g.b.x.f(str2, "placeId");
        this.f31629a = str;
        this.f31630b = str2;
        this.f31631c = z;
    }

    public final String a() {
        return this.f31629a;
    }

    public final String b() {
        return this.f31630b;
    }

    public final boolean c() {
        return this.f31631c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof be)) {
            return false;
        }
        be beVar = (be) obj;
        return h.g.b.x.n(this.f31629a, beVar.f31629a) && h.g.b.x.n(this.f31630b, beVar.f31630b) && this.f31631c == beVar.f31631c;
    }

    public final int hashCode() {
        return (((this.f31629a.hashCode() * 31) + this.f31630b.hashCode()) * 31) + a.a.a(this.f31631c);
    }

    public final String toString() {
        return "GoogleAdInformation(adImpressionId=" + this.f31629a + ", placeId=" + this.f31630b + ", isTest=" + this.f31631c + ")";
    }
}
