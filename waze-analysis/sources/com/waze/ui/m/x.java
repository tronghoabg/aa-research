package com.waze.ui.m;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    private final String f43043a;

    /* renamed from: b, reason: collision with root package name */
    private final String f43044b;

    /* renamed from: c, reason: collision with root package name */
    private final String f43045c;

    /* renamed from: d, reason: collision with root package name */
    private final String f43046d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f43047e;

    public x(String str, String str2, String str3, String str4, boolean z) {
        h.g.b.x.f(str, "url");
        h.g.b.x.f(str2, "thumbnailUrl");
        h.g.b.x.f(str3, "reporterName");
        h.g.b.x.f(str4, "reporterMood");
        this.f43043a = str;
        this.f43044b = str2;
        this.f43045c = str3;
        this.f43046d = str4;
        this.f43047e = z;
    }

    public final String a() {
        return this.f43045c;
    }

    public final String b() {
        return this.f43044b;
    }

    public final String c() {
        return this.f43043a;
    }

    public final boolean d() {
        return this.f43047e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return h.g.b.x.n(this.f43043a, xVar.f43043a) && h.g.b.x.n(this.f43044b, xVar.f43044b) && h.g.b.x.n(this.f43045c, xVar.f43045c) && h.g.b.x.n(this.f43046d, xVar.f43046d) && this.f43047e == xVar.f43047e;
    }

    public final int hashCode() {
        return (((((((this.f43043a.hashCode() * 31) + this.f43044b.hashCode()) * 31) + this.f43045c.hashCode()) * 31) + this.f43046d.hashCode()) * 31) + a.a.a(this.f43047e);
    }

    public final String toString() {
        return "LocationImage(url=" + this.f43043a + ", thumbnailUrl=" + this.f43044b + ", reporterName=" + this.f43045c + ", reporterMood=" + this.f43046d + ", byMe=" + this.f43047e + ")";
    }
}
