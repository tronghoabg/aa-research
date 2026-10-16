package com.waze.app_nav.hub.c;

import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class k {

    /* renamed from: a, reason: collision with root package name */
    private final b f15309a;

    /* renamed from: b, reason: collision with root package name */
    private final f f15310b;

    /* renamed from: c, reason: collision with root package name */
    private final long f15311c;

    public k(b bVar, f fVar, long j2) {
        x.f(bVar, "presenter");
        x.f(fVar, "priority");
        this.f15309a = bVar;
        this.f15310b = fVar;
        this.f15311c = j2;
    }

    public final long a() {
        return this.f15311c;
    }

    public final b b() {
        return this.f15309a;
    }

    public final f c() {
        return this.f15310b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return x.n(this.f15309a, kVar.f15309a) && this.f15310b == kVar.f15310b && this.f15311c == kVar.f15311c;
    }

    public final int hashCode() {
        return (((this.f15309a.hashCode() * 31) + this.f15310b.hashCode()) * 31) + a.a.b(this.f15311c);
    }

    public final String toString() {
        return "PriorityPresenter(presenter=" + this.f15309a + ", priority=" + this.f15310b + ", insertionId=" + this.f15311c + ")";
    }
}
