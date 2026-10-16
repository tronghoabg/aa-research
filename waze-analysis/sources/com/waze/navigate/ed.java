package com.waze.navigate;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class ed {

    /* renamed from: a, reason: collision with root package name */
    private final String f31303a;

    /* renamed from: b, reason: collision with root package name */
    private final String f31304b;

    /* renamed from: c, reason: collision with root package name */
    private final String f31305c;

    public ed(String str, String str2, String str3) {
        h.g.b.x.f(str, "resourceName");
        h.g.b.x.f(str2, "direction");
        h.g.b.x.f(str3, "text");
        this.f31303a = str;
        this.f31304b = str2;
        this.f31305c = str3;
    }

    public final String a() {
        return this.f31304b;
    }

    public final String b() {
        return this.f31303a;
    }

    public final String c() {
        return this.f31305c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ed)) {
            return false;
        }
        ed edVar = (ed) obj;
        return h.g.b.x.n(this.f31303a, edVar.f31303a) && h.g.b.x.n(this.f31304b, edVar.f31304b) && h.g.b.x.n(this.f31305c, edVar.f31305c);
    }

    public final int hashCode() {
        return (((this.f31303a.hashCode() * 31) + this.f31304b.hashCode()) * 31) + this.f31305c.hashCode();
    }

    public final String toString() {
        return "NavigationRoadShield(resourceName=" + this.f31303a + ", direction=" + this.f31304b + ", text=" + this.f31305c + ")";
    }
}
