package com.waze.bv;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    private final int f17539a;

    /* renamed from: b, reason: collision with root package name */
    private final String f17540b;

    /* renamed from: c, reason: collision with root package name */
    private final int f17541c;

    /* renamed from: d, reason: collision with root package name */
    private final double f17542d;

    public n(int i2, String str, int i3, double d2) {
        h.g.b.x.f(str, "units");
        this.f17539a = i2;
        this.f17540b = str;
        this.f17541c = i3;
        this.f17542d = d2;
    }

    public final double a() {
        return this.f17542d;
    }

    public final int b() {
        return this.f17541c;
    }

    public final int c() {
        return this.f17539a;
    }

    public final String d() {
        return this.f17540b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.f17539a == nVar.f17539a && h.g.b.x.n(this.f17540b, nVar.f17540b) && this.f17541c == nVar.f17541c && Double.compare(this.f17542d, nVar.f17542d) == 0;
    }

    public final int hashCode() {
        return (((((this.f17539a * 31) + this.f17540b.hashCode()) * 31) + this.f17541c) * 31) + a.a.e(this.f17542d);
    }

    public final String toString() {
        return "SpeedometerModel(speed=" + this.f17539a + ", units=" + this.f17540b + ", maxSpeedRoad=" + this.f17541c + ", normalizedSpeedKph=" + this.f17542d + ")";
    }
}
