package com.waze.reports_v2.b;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class c extends com.waze.reports_v2.a.a.a.d {

    /* renamed from: a, reason: collision with root package name */
    private final long f34088a;

    public c(long j2) {
        super(null);
        this.f34088a = j2;
    }

    public final long c() {
        return this.f34088a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && this.f34088a == ((c) obj).f34088a;
    }

    public final int hashCode() {
        return a.a.b(this.f34088a);
    }

    public final String toString() {
        return "Success(receivedPointsCount=" + this.f34088a + ")";
    }
}
