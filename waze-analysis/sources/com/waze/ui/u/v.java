package com.waze.ui.u;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    private final int f43475a;

    /* renamed from: b, reason: collision with root package name */
    private final int f43476b;

    public v(int i2, int i3) {
        this.f43475a = i2;
        this.f43476b = i3;
    }

    public final int a() {
        return this.f43475a;
    }

    public final int b() {
        return this.f43476b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return this.f43475a == vVar.f43475a && this.f43476b == vVar.f43476b;
    }

    public final int hashCode() {
        return (this.f43475a * 31) + this.f43476b;
    }

    public final String toString() {
        return "Coordinate(latitude=" + this.f43475a + ", longitude=" + this.f43476b + ")";
    }
}
