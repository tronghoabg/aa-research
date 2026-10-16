package com.waze.an.a;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class x implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    private static final x f14612a = new x(1000, false);

    /* renamed from: b, reason: collision with root package name */
    private static final x f14613b = new x(1001, false);

    /* renamed from: c, reason: collision with root package name */
    private final int f14614c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f14615d;

    public x(int i2, boolean z) {
        this.f14614c = i2;
        this.f14615d = z;
    }

    public final int a() {
        return this.f14614c;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        x xVar = (x) obj;
        h.g.b.x.f(xVar, "other");
        return h.g.b.x.a(this.f14614c, xVar.f14614c);
    }

    public final boolean d() {
        return this.f14615d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return this.f14614c == xVar.f14614c && this.f14615d == xVar.f14615d;
    }

    public final int hashCode() {
        return (this.f14614c * 31) + a.a.a(this.f14615d);
    }

    public final String toString() {
        return "InsightPriority(value=" + this.f14614c + ", preemptive=" + this.f14615d + ")";
    }
}
