package com.waze.sound;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class cb {

    /* renamed from: a, reason: collision with root package name */
    private final int f39644a;

    /* renamed from: b, reason: collision with root package name */
    private final gn f39645b;

    public cb(int i2, gn gnVar) {
        h.g.b.x.f(gnVar, "speedConstraint");
        this.f39644a = i2;
        this.f39645b = gnVar;
    }

    public final int a() {
        return this.f39644a;
    }

    public final gn b() {
        return this.f39645b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cb)) {
            return false;
        }
        cb cbVar = (cb) obj;
        return this.f39644a == cbVar.f39644a && h.g.b.x.n(this.f39645b, cbVar.f39645b);
    }

    public final int hashCode() {
        return (this.f39644a * 31) + this.f39645b.hashCode();
    }

    public final String toString() {
        return "Trigger(distanceMeters=" + this.f39644a + ", speedConstraint=" + this.f39645b + ")";
    }
}
