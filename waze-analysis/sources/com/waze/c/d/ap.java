package com.waze.c.d;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ap extends ar {

    /* renamed from: a, reason: collision with root package name */
    private final long f18321a;

    public /* synthetic */ ap(long j2) {
        super(null);
        this.f18321a = j2;
    }

    public final long a() {
        return this.f18321a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ap) && h.o.a.A(this.f18321a, ((ap) obj).f18321a);
    }

    public final int hashCode() {
        h.o.c cVar = h.o.a.f48264a;
        return a.a.b(this.f18321a);
    }

    public final String toString() {
        return "Similar(delta=" + h.o.a.y(this.f18321a) + ")";
    }
}
