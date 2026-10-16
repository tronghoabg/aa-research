package com.waze.network;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class ao {

    /* renamed from: a, reason: collision with root package name */
    private final long f31891a;

    /* renamed from: b, reason: collision with root package name */
    private final long f31892b;

    public ao(long j2, long j3) {
        this.f31891a = j2;
        this.f31892b = j3;
    }

    public final long a() {
        return this.f31891a;
    }

    public final long b() {
        return this.f31892b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ao)) {
            return false;
        }
        ao aoVar = (ao) obj;
        return this.f31891a == aoVar.f31891a && this.f31892b == aoVar.f31892b;
    }

    public final int hashCode() {
        return (a.a.b(this.f31891a) * 31) + a.a.b(this.f31892b);
    }

    public final String toString() {
        return "NetworkUsage(rxBytes=" + this.f31891a + ", txBytes=" + this.f31892b + ")";
    }
}
