package com.waze.design_components.a;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private static final d f23295a = new d(0.0f, 0, 0);

    /* renamed from: b, reason: collision with root package name */
    private final float f23296b;

    /* renamed from: c, reason: collision with root package name */
    private final int f23297c;

    /* renamed from: d, reason: collision with root package name */
    private final int f23298d;

    public d(float f2, int i2, int i3) {
        this.f23296b = f2;
        this.f23297c = i2;
        this.f23298d = i3;
    }

    public static /* synthetic */ d f(d dVar, float f2) {
        return new d(f2, dVar.f23297c, dVar.f23298d);
    }

    public final float a() {
        return this.f23296b;
    }

    public final int b() {
        return this.f23298d;
    }

    public final int c(int i2) {
        return h.h.a.b((((i2 - r0) - this.f23298d) * this.f23296b) + this.f23297c);
    }

    public final int d() {
        return this.f23297c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Float.compare(this.f23296b, dVar.f23296b) == 0 && this.f23297c == dVar.f23297c && this.f23298d == dVar.f23298d;
    }

    public final int hashCode() {
        return (((Float.floatToIntBits(this.f23296b) * 31) + this.f23297c) * 31) + this.f23298d;
    }

    public final String toString() {
        return "RelativeDraggingOffset(relativeRatio=" + this.f23296b + ", peekHeightPx=" + this.f23297c + ", expandedOffsetPx=" + this.f23298d + ")";
    }
}
