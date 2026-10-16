package com.waze.navbar;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    private final int f30916a;

    /* renamed from: b, reason: collision with root package name */
    private final int f30917b;

    /* renamed from: c, reason: collision with root package name */
    private final int f30918c;

    public r(int i2, int i3, int i4) {
        this.f30916a = i2;
        this.f30917b = i3;
        this.f30918c = i4;
    }

    public final int a() {
        return this.f30917b;
    }

    public final int b() {
        return this.f30918c;
    }

    public final int c() {
        return this.f30916a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return this.f30916a == rVar.f30916a && this.f30917b == rVar.f30917b && this.f30918c == rVar.f30918c;
    }

    public final int hashCode() {
        return (((this.f30916a * 31) + this.f30917b) * 31) + this.f30918c;
    }

    public final String toString() {
        return "Indexes(start=" + this.f30916a + ", end=" + this.f30917b + ", index=" + this.f30918c + ")";
    }
}
