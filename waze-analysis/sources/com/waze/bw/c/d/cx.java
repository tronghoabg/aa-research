package com.waze.bw.c.d;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class cx extends cz {

    /* renamed from: a, reason: collision with root package name */
    private final long f18077a;

    public /* synthetic */ cx(long j2) {
        super(null);
        this.f18077a = j2;
    }

    public final long a() {
        return this.f18077a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cx) && h.o.a.A(this.f18077a, ((cx) obj).f18077a);
    }

    public final int hashCode() {
        h.o.c cVar = h.o.a.f48264a;
        return a.a.b(this.f18077a);
    }

    public final String toString() {
        return "Now(routeDuration=" + h.o.a.y(this.f18077a) + ")";
    }
}
