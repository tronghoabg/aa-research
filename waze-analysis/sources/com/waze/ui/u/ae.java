package com.waze.ui.u;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ae {

    /* renamed from: a, reason: collision with root package name */
    private final long f43424a;

    /* renamed from: b, reason: collision with root package name */
    private final long f43425b;

    public /* synthetic */ ae(long j2, long j3) {
        this.f43424a = j2;
        this.f43425b = j3;
    }

    public final long a() {
        return this.f43425b;
    }

    public final long b() {
        return this.f43424a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ae)) {
            return false;
        }
        ae aeVar = (ae) obj;
        return h.o.a.A(this.f43424a, aeVar.f43424a) && this.f43425b == aeVar.f43425b;
    }

    public final int hashCode() {
        h.o.c cVar = h.o.a.f48264a;
        return (a.a.b(this.f43424a) * 31) + a.a.b(this.f43425b);
    }

    public final String toString() {
        return "Timer(timeout=" + h.o.a.y(this.f43424a) + ", startTimeUtcMs=" + this.f43425b + ")";
    }
}
