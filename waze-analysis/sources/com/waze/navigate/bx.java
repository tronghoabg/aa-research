package com.waze.navigate;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class bx {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f31148a;

    /* renamed from: b, reason: collision with root package name */
    private final String f31149b;

    /* renamed from: c, reason: collision with root package name */
    private final String f31150c;

    /* renamed from: d, reason: collision with root package name */
    private final String f31151d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f31152e;

    public bx(boolean z, String str, String str2, String str3, boolean z2) {
        h.g.b.x.f(str, "arrivalTime");
        h.g.b.x.f(str2, "remainingTimeText");
        h.g.b.x.f(str3, "remainingDistanceText");
        this.f31148a = z;
        this.f31149b = str;
        this.f31150c = str2;
        this.f31151d = str3;
        this.f31152e = z2;
    }

    public final String a() {
        return this.f31149b;
    }

    public final String b() {
        return this.f31151d;
    }

    public final String c() {
        return this.f31150c;
    }

    public final boolean d() {
        return this.f31152e;
    }

    public final boolean e() {
        return this.f31148a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bx)) {
            return false;
        }
        bx bxVar = (bx) obj;
        return this.f31148a == bxVar.f31148a && h.g.b.x.n(this.f31149b, bxVar.f31149b) && h.g.b.x.n(this.f31150c, bxVar.f31150c) && h.g.b.x.n(this.f31151d, bxVar.f31151d) && this.f31152e == bxVar.f31152e;
    }

    public final int hashCode() {
        return (((((((a.a.a(this.f31148a) * 31) + this.f31149b.hashCode()) * 31) + this.f31150c.hashCode()) * 31) + this.f31151d.hashCode()) * 31) + a.a.a(this.f31152e);
    }

    public final String toString() {
        return "ETABarModel(isOffline=" + this.f31148a + ", arrivalTime=" + this.f31149b + ", remainingTimeText=" + this.f31150c + ", remainingDistanceText=" + this.f31151d + ", isLocked=" + this.f31152e + ")";
    }

    public bx() {
        this(false, "", "", "", false);
    }
}
