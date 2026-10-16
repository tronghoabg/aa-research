package com.waze.car_lib.r.d;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class j {

    /* renamed from: a, reason: collision with root package name */
    private final int f21300a;

    /* renamed from: b, reason: collision with root package name */
    private final h f21301b;

    /* renamed from: c, reason: collision with root package name */
    private final String f21302c;

    public j(int i2, h hVar, String str) {
        h.g.b.x.f(hVar, "contentType");
        h.g.b.x.f(str, "value");
        this.f21300a = i2;
        this.f21301b = hVar;
        this.f21302c = str;
    }

    public final int a() {
        return this.f21300a;
    }

    public final h b() {
        return this.f21301b;
    }

    public final String c() {
        return this.f21302c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f21300a == jVar.f21300a && this.f21301b == jVar.f21301b && h.g.b.x.n(this.f21302c, jVar.f21302c);
    }

    public final int hashCode() {
        return (((this.f21300a * 31) + this.f21301b.hashCode()) * 31) + this.f21302c.hashCode();
    }

    public final String toString() {
        return "RankedContent(position=" + this.f21300a + ", contentType=" + this.f21301b + ", value=" + this.f21302c + ")";
    }
}
