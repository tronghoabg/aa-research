package com.waze.map;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class av {

    /* renamed from: a, reason: collision with root package name */
    private final int f27967a;

    /* renamed from: b, reason: collision with root package name */
    private final int f27968b;

    /* renamed from: c, reason: collision with root package name */
    private final int f27969c;

    /* renamed from: d, reason: collision with root package name */
    private final int f27970d;

    public av(int i2, int i3, int i4, int i5) {
        this.f27967a = i2;
        this.f27968b = i3;
        this.f27969c = i4;
        this.f27970d = i5;
    }

    public final int a() {
        return this.f27969c;
    }

    public final int b() {
        return this.f27968b;
    }

    public final int c() {
        return this.f27970d;
    }

    public final int d() {
        return this.f27967a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof av)) {
            return false;
        }
        av avVar = (av) obj;
        return this.f27967a == avVar.f27967a && this.f27968b == avVar.f27968b && this.f27969c == avVar.f27969c && this.f27970d == avVar.f27970d;
    }

    public final int hashCode() {
        return (((((this.f27967a * 31) + this.f27968b) * 31) + this.f27969c) * 31) + this.f27970d;
    }

    public final String toString() {
        return "HitBoxInset(top=" + this.f27967a + ", left=" + this.f27968b + ", bottom=" + this.f27969c + ", right=" + this.f27970d + ")";
    }
}
