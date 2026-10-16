package com.waze.app_nav;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private final int f15200a;

    /* renamed from: b, reason: collision with root package name */
    private final int f15201b;

    /* renamed from: c, reason: collision with root package name */
    private final int f15202c;

    /* renamed from: d, reason: collision with root package name */
    private final int f15203d;

    public d(int i2, int i3, int i4, int i5) {
        this.f15200a = i2;
        this.f15201b = i3;
        this.f15202c = i4;
        this.f15203d = i5;
    }

    public final int a() {
        return this.f15200a;
    }

    public final int b() {
        return this.f15201b;
    }

    public final int c() {
        return this.f15202c;
    }

    public final int d() {
        return this.f15203d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f15200a == dVar.f15200a && this.f15201b == dVar.f15201b && this.f15202c == dVar.f15202c && this.f15203d == dVar.f15203d;
    }

    public final int hashCode() {
        return (((((this.f15200a * 31) + this.f15201b) * 31) + this.f15202c) * 31) + this.f15203d;
    }

    public final String toString() {
        return "Transition(enter=" + this.f15200a + ", exit=" + this.f15201b + ", popEnter=" + this.f15202c + ", popExit=" + this.f15203d + ")";
    }
}
