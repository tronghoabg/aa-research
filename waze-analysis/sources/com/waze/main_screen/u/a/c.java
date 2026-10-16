package com.waze.main_screen.u.a;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class c extends d {

    /* renamed from: a, reason: collision with root package name */
    private final long f27653a;

    public /* synthetic */ c(long j2) {
        super(null);
        this.f27653a = j2;
    }

    public final long a() {
        return this.f27653a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && h.o.a.A(this.f27653a, ((c) obj).f27653a);
    }

    public final int hashCode() {
        h.o.c cVar = h.o.a.f48264a;
        return a.a.b(this.f27653a);
    }

    public final String toString() {
        return "Timer(timerDuration=" + h.o.a.y(this.f27653a) + ")";
    }
}
