package com.waze.c.d;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class aq extends ar {

    /* renamed from: a, reason: collision with root package name */
    private final long f18322a;

    public /* synthetic */ aq(long j2) {
        super(null);
        this.f18322a = j2;
    }

    public final long a() {
        return this.f18322a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof aq) && h.o.a.A(this.f18322a, ((aq) obj).f18322a);
    }

    public final int hashCode() {
        h.o.c cVar = h.o.a.f48264a;
        return a.a.b(this.f18322a);
    }

    public final String toString() {
        return "Slower(delta=" + h.o.a.y(this.f18322a) + ")";
    }
}
