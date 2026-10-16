package com.waze.reports_v2.c;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class c extends d {

    /* renamed from: a, reason: collision with root package name */
    private final long f34314a;

    public c(long j2) {
        super(null);
        this.f34314a = j2;
    }

    public final long a() {
        return this.f34314a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && this.f34314a == ((c) obj).f34314a;
    }

    public final int hashCode() {
        return a.a.b(this.f34314a);
    }

    public final String toString() {
        return "Success(pointsAwards=" + this.f34314a + ")";
    }
}
