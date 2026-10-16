package com.waze.ui.navbar;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final int f43104a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f43105b;

    public b(int i2, boolean z) {
        this.f43104a = i2;
        this.f43105b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f43104a == bVar.f43104a && this.f43105b == bVar.f43105b;
    }

    public final int hashCode() {
        return (this.f43104a * 31) + a.a.a(this.f43105b);
    }

    public final String toString() {
        return "UiNavigationLaneAngle(angle=" + this.f43104a + ", selected=" + this.f43105b + ")";
    }

    public b() {
        this(0, false);
    }
}
