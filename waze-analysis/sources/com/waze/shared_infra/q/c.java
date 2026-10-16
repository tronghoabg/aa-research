package com.waze.shared_infra.q;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final long f37932a;

    /* renamed from: b, reason: collision with root package name */
    private final long f37933b;

    public c(long j2, long j3) {
        this.f37932a = j2;
        this.f37933b = j3;
    }

    public final long a() {
        return this.f37933b;
    }

    public final long b() {
        return this.f37932a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f37932a == cVar.f37932a && this.f37933b == cVar.f37933b;
    }

    public final int hashCode() {
        return (a.a.b(this.f37932a) * 31) + a.a.b(this.f37933b);
    }

    public final String toString() {
        return "RelativeTimeout(totalMs=" + this.f37932a + ", elapsedMs=" + this.f37933b + ")";
    }
}
