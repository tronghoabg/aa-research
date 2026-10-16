package com.waze.map.b;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class dw {

    /* renamed from: a, reason: collision with root package name */
    private final int f28226a;

    /* renamed from: b, reason: collision with root package name */
    private final int f28227b;

    public dw(int i2, int i3) {
        this.f28226a = i2;
        this.f28227b = i3;
    }

    public final int a() {
        return this.f28226a;
    }

    public final int b() {
        return this.f28227b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dw)) {
            return false;
        }
        dw dwVar = (dw) obj;
        return this.f28226a == dwVar.f28226a && this.f28227b == dwVar.f28227b;
    }

    public final int hashCode() {
        return (this.f28226a * 31) + this.f28227b;
    }

    public final String toString() {
        return "ScreenPoint(x=" + this.f28226a + ", y=" + this.f28227b + ")";
    }
}
