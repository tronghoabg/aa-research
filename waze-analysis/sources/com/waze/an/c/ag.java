package com.waze.an.c;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class ag {

    /* renamed from: a, reason: collision with root package name */
    private final long f14752a;

    /* renamed from: b, reason: collision with root package name */
    private final long f14753b;

    public /* synthetic */ ag(long j2, long j3) {
        this.f14752a = j2;
        this.f14753b = j3;
    }

    public final long a() {
        return this.f14752a;
    }

    public final long b() {
        return this.f14753b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ag)) {
            return false;
        }
        ag agVar = (ag) obj;
        return h.o.a.A(this.f14752a, agVar.f14752a) && h.o.f.e(this.f14753b, agVar.f14753b);
    }

    public final int hashCode() {
        h.o.c cVar = h.o.a.f48264a;
        return (a.a.b(this.f14752a) * 31) + a.a.b(this.f14753b);
    }

    public final String toString() {
        long j2 = this.f14753b;
        return "Timeout(duration=" + h.o.a.y(this.f14752a) + ", startTime=" + h.o.f.c(j2) + ")";
    }
}
