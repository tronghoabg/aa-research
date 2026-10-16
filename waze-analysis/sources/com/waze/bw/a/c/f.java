package com.waze.bw.a.c;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class f extends b {

    /* renamed from: a, reason: collision with root package name */
    private final long f17644a;

    public /* synthetic */ f(long j2) {
        super(null);
        this.f17644a = j2;
    }

    public final long a() {
        return this.f17644a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && h.o.a.A(this.f17644a, ((f) obj).f17644a);
    }

    public final int hashCode() {
        h.o.c cVar = h.o.a.f48264a;
        return a.a.b(this.f17644a);
    }

    public final String toString() {
        return "Now(routeDuration=" + h.o.a.y(this.f17644a) + ")";
    }
}
