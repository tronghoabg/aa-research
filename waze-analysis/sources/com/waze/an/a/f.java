package com.waze.an.a;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class f implements h {

    /* renamed from: a, reason: collision with root package name */
    private final int f14577a;

    /* renamed from: b, reason: collision with root package name */
    private final int f14578b;

    public f(int i2, int i3) {
        this.f14577a = i2;
        this.f14578b = i3;
    }

    public final int a() {
        return this.f14577a;
    }

    public final int b() {
        return this.f14578b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f14577a == fVar.f14577a && this.f14578b == fVar.f14578b;
    }

    public final int hashCode() {
        return (this.f14577a * 31) + this.f14578b;
    }

    public final String toString() {
        return "SilentPhaseData(animationResId=" + this.f14577a + ", textResId=" + this.f14578b + ")";
    }
}
