package com.waze.sharedrive.g;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class i implements j {

    /* renamed from: a, reason: collision with root package name */
    private final String f38711a;

    /* renamed from: b, reason: collision with root package name */
    private final String f38712b;

    /* renamed from: c, reason: collision with root package name */
    private final String f38713c;

    public i(String str, String str2, String str3) {
        h.g.b.x.f(str, "link");
        h.g.b.x.f(str2, "address");
        h.g.b.x.f(str3, "eta");
        this.f38711a = str;
        this.f38712b = str2;
        this.f38713c = str3;
    }

    public final String a() {
        return this.f38712b;
    }

    public final String b() {
        return this.f38713c;
    }

    public final String c() {
        return this.f38711a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return h.g.b.x.n(this.f38711a, iVar.f38711a) && h.g.b.x.n(this.f38712b, iVar.f38712b) && h.g.b.x.n(this.f38713c, iVar.f38713c);
    }

    public final int hashCode() {
        return (((this.f38711a.hashCode() * 31) + this.f38712b.hashCode()) * 31) + this.f38713c.hashCode();
    }

    public final String toString() {
        return "Success(link=" + this.f38711a + ", address=" + this.f38712b + ", eta=" + this.f38713c + ")";
    }
}
