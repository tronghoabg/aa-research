package com.waze.c.d;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ao extends ar {

    /* renamed from: a, reason: collision with root package name */
    private final long f18320a;

    public /* synthetic */ ao(long j2) {
        super(null);
        this.f18320a = j2;
    }

    public final long a() {
        return this.f18320a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ao) && h.o.a.A(this.f18320a, ((ao) obj).f18320a);
    }

    public final int hashCode() {
        h.o.c cVar = h.o.a.f48264a;
        return a.a.b(this.f18320a);
    }

    public final String toString() {
        return "Faster(delta=" + h.o.a.y(this.f18320a) + ")";
    }
}
