package com.waze.ui.l;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ac {

    /* renamed from: a, reason: collision with root package name */
    private final long f42477a;

    /* renamed from: b, reason: collision with root package name */
    private final long f42478b;

    public /* synthetic */ ac(long j2, long j3) {
        this.f42477a = j2;
        this.f42478b = j3;
    }

    public final long a() {
        return this.f42477a;
    }

    public final long b() {
        return this.f42478b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ac)) {
            return false;
        }
        ac acVar = (ac) obj;
        return h.o.a.A(this.f42477a, acVar.f42477a) && h.o.f.e(this.f42478b, acVar.f42478b);
    }

    public final int hashCode() {
        h.o.c cVar = h.o.a.f48264a;
        return (a.a.b(this.f42477a) * 31) + a.a.b(this.f42478b);
    }

    public final String toString() {
        long j2 = this.f42478b;
        return "Timeout(duration=" + h.o.a.y(this.f42477a) + ", startTime=" + h.o.f.c(j2) + ")";
    }
}
