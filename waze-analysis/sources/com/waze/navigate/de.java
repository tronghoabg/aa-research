package com.waze.navigate;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class de {

    /* renamed from: a, reason: collision with root package name */
    private final double f31229a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.sharedui.utils.d f31230b;

    /* renamed from: c, reason: collision with root package name */
    private final String f31231c;

    /* renamed from: d, reason: collision with root package name */
    private final String f31232d;

    /* renamed from: e, reason: collision with root package name */
    private final int f31233e;

    public de(double d2, com.waze.sharedui.utils.d dVar, String str, String str2, int i2) {
        h.g.b.x.f(dVar, "unit");
        h.g.b.x.f(str, "distanceString");
        h.g.b.x.f(str2, "unitString");
        this.f31229a = d2;
        this.f31230b = dVar;
        this.f31231c = str;
        this.f31232d = str2;
        this.f31233e = i2;
    }

    public final double a() {
        return this.f31229a;
    }

    public final int b() {
        return this.f31233e;
    }

    public final com.waze.sharedui.utils.d c() {
        return this.f31230b;
    }

    public final String d() {
        return this.f31231c;
    }

    public final String e() {
        return this.f31232d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof de)) {
            return false;
        }
        de deVar = (de) obj;
        return Double.compare(this.f31229a, deVar.f31229a) == 0 && this.f31230b == deVar.f31230b && h.g.b.x.n(this.f31231c, deVar.f31231c) && h.g.b.x.n(this.f31232d, deVar.f31232d) && this.f31233e == deVar.f31233e;
    }

    public final int hashCode() {
        return (((((((a.a.e(this.f31229a) * 31) + this.f31230b.hashCode()) * 31) + this.f31231c.hashCode()) * 31) + this.f31232d.hashCode()) * 31) + this.f31233e;
    }

    public final String toString() {
        return "NavigationDistanceState(distanceValue=" + this.f31229a + ", unit=" + this.f31230b + ", distanceString=" + this.f31231c + ", unitString=" + this.f31232d + ", meters=" + this.f31233e + ")";
    }
}
