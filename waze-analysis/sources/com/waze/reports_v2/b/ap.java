package com.waze.reports_v2.b;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ap {

    /* renamed from: a, reason: collision with root package name */
    private final int f34067a;

    /* renamed from: b, reason: collision with root package name */
    private final ab f34068b;

    public ap(int i2, ab abVar) {
        h.g.b.x.f(abVar, "statSource");
        this.f34067a = i2;
        this.f34068b = abVar;
    }

    public final int a() {
        return this.f34067a;
    }

    public final ab b() {
        return this.f34068b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ap)) {
            return false;
        }
        ap apVar = (ap) obj;
        return this.f34067a == apVar.f34067a && this.f34068b == apVar.f34068b;
    }

    public final int hashCode() {
        return (this.f34067a * 31) + this.f34068b.hashCode();
    }

    public final String toString() {
        return "Feedback(points=" + this.f34067a + ", statSource=" + this.f34068b + ")";
    }
}
