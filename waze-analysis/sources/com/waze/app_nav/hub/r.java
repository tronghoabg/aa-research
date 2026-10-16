package com.waze.app_nav.hub;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    private final int f15367a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f15368b;

    public r(int i2, boolean z) {
        this.f15367a = i2;
        this.f15368b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return this.f15367a == rVar.f15367a && this.f15368b == rVar.f15368b;
    }

    public final int hashCode() {
        return (this.f15367a * 31) + a.a.a(this.f15368b);
    }

    public final String toString() {
        return "DialogConfig(orientation=" + this.f15367a + ", isNightModeActive=" + this.f15368b + ")";
    }
}
