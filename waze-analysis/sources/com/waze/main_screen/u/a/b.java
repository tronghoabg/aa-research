package com.waze.main_screen.u.a;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class b extends d {

    /* renamed from: a, reason: collision with root package name */
    private final long f27652a;

    public /* synthetic */ b(long j2) {
        super(null);
        this.f27652a = j2;
    }

    public final long a() {
        return this.f27652a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && h.o.a.A(this.f27652a, ((b) obj).f27652a);
    }

    public final int hashCode() {
        h.o.c cVar = h.o.a.f48264a;
        return a.a.b(this.f27652a);
    }

    public final String toString() {
        return "RoamingTimeout(timeoutDuration=" + h.o.a.y(this.f27652a) + ")";
    }
}
