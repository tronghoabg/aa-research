package com.waze.design_components.a;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final int f23288a;

    /* renamed from: b, reason: collision with root package name */
    private final int f23289b;

    public a(int i2, float f2) {
        this(i2, h.h.a.b(i2 * f2));
    }

    public final float a() {
        Integer numValueOf = Integer.valueOf(this.f23288a);
        if (numValueOf.intValue() == 0) {
            numValueOf = null;
        }
        if (numValueOf == null) {
            return 0.0f;
        }
        return this.f23289b / numValueOf.intValue();
    }

    public final int b() {
        return this.f23289b;
    }

    public final int c() {
        return this.f23288a;
    }

    public final int d() {
        return this.f23288a - this.f23289b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f23288a == aVar.f23288a && this.f23289b == aVar.f23289b;
    }

    public final int hashCode() {
        return (this.f23288a * 31) + this.f23289b;
    }

    public final String toString() {
        return "AbsoluteDraggingOffset(parentHeightPx=" + this.f23288a + ", bottomOffsetPx=" + this.f23289b + ")";
    }

    public a(int i2, int i3) {
        this.f23288a = i2;
        this.f23289b = i3;
    }
}
