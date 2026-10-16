package com.waze.shared_infra.q;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final long f37929a;

    /* renamed from: b, reason: collision with root package name */
    private final long f37930b;

    public a(long j2, long j3) {
        this.f37929a = j2;
        this.f37930b = j3;
    }

    public final long a() {
        return this.f37930b;
    }

    public final long b() {
        return this.f37929a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f37929a == aVar.f37929a && this.f37930b == aVar.f37930b;
    }

    public final int hashCode() {
        return (a.a.b(this.f37929a) * 31) + a.a.b(this.f37930b);
    }

    public final String toString() {
        return "AbsoluteTimeout(startMs=" + this.f37929a + ", endMs=" + this.f37930b + ")";
    }
}
