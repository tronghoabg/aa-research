package com.waze.z.a;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f46191a;

    /* renamed from: b, reason: collision with root package name */
    private final t f46192b;

    /* renamed from: c, reason: collision with root package name */
    private final h.g.a.a f46193c;

    public u(boolean z, t tVar, h.g.a.a aVar) {
        h.g.b.x.f(tVar, "slidingDirection");
        h.g.b.x.f(aVar, "onClick");
        this.f46191a = z;
        this.f46192b = tVar;
        this.f46193c = aVar;
    }

    public final t a() {
        return this.f46192b;
    }

    public final h.g.a.a b() {
        return this.f46193c;
    }

    public final boolean c() {
        return this.f46191a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return this.f46191a == uVar.f46191a && this.f46192b == uVar.f46192b && h.g.b.x.n(this.f46193c, uVar.f46193c);
    }

    public final int hashCode() {
        return (((a.a.a(this.f46191a) * 31) + this.f46192b.hashCode()) * 31) + this.f46193c.hashCode();
    }

    public final String toString() {
        return "MapRecenterState(visible=" + this.f46191a + ", slidingDirection=" + this.f46192b + ", onClick=" + this.f46193c + ")";
    }

    public u() {
        this(false, t.f46188a, new com.waze.car_lib.o.a(17));
    }
}
