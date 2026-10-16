package com.waze.map;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    private final int f29605a;

    /* renamed from: b, reason: collision with root package name */
    private final int f29606b;

    public z(int i2, int i3) {
        this.f29605a = i2;
        this.f29606b = i3;
    }

    public final int a() {
        return this.f29605a;
    }

    public final int b() {
        return this.f29606b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return this.f29605a == zVar.f29605a && this.f29606b == zVar.f29606b;
    }

    public final int hashCode() {
        return (this.f29605a * 31) + this.f29606b;
    }

    public final String toString() {
        return "RouteColors(routeBgColor=" + this.f29605a + ", routeFgColor=" + this.f29606b + ")";
    }
}
