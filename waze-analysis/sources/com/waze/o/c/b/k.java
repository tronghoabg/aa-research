package com.waze.o.c.b;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    private final long f32801a;

    /* renamed from: b, reason: collision with root package name */
    private final l f32802b;

    /* renamed from: c, reason: collision with root package name */
    private final m f32803c;

    public k(long j2, l lVar, m mVar) {
        h.g.b.x.f(lVar, "color");
        h.g.b.x.f(mVar, "description");
        this.f32801a = j2;
        this.f32802b = lVar;
        this.f32803c = mVar;
    }

    public final long a() {
        return this.f32801a;
    }

    public final l b() {
        return this.f32802b;
    }

    public final m c() {
        return this.f32803c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f32801a == kVar.f32801a && this.f32802b == kVar.f32802b && h.g.b.x.n(this.f32803c, kVar.f32803c);
    }

    public final int hashCode() {
        return (((a.a.b(this.f32801a) * 31) + this.f32802b.hashCode()) * 31) + this.f32803c.hashCode();
    }

    public final String toString() {
        return "Route(altId=" + this.f32801a + ", color=" + this.f32802b + ", description=" + this.f32803c + ")";
    }
}
