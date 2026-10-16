package com.waze.shared_infra.g;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class d {

    /* renamed from: a, reason: collision with root package name */
    private final int f37864a;

    /* renamed from: b, reason: collision with root package name */
    private final int f37865b;

    /* renamed from: c, reason: collision with root package name */
    private final int f37866c;

    /* renamed from: d, reason: collision with root package name */
    private final int f37867d;

    public d(int i2, int i3, int i4, int i5) {
        this.f37864a = i2;
        this.f37865b = i3;
        this.f37866c = i4;
        this.f37867d = i5;
    }

    public final int a() {
        return this.f37867d;
    }

    public final int b() {
        return this.f37864a;
    }

    public final int c() {
        return this.f37866c;
    }

    public final int d() {
        return this.f37865b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f37864a == dVar.f37864a && this.f37865b == dVar.f37865b && this.f37866c == dVar.f37866c && this.f37867d == dVar.f37867d;
    }

    public final int hashCode() {
        return (((((this.f37864a * 31) + this.f37865b) * 31) + this.f37866c) * 31) + this.f37867d;
    }

    public final String toString() {
        return "InsetsValues(left=" + this.f37864a + ", top=" + this.f37865b + ", right=" + this.f37866c + ", bottom=" + this.f37867d + ")";
    }
}
