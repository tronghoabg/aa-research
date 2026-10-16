package com.waze.z.a;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class as extends com.waze.z.a.g.s {

    /* renamed from: a, reason: collision with root package name */
    private final long f45673a;

    /* renamed from: b, reason: collision with root package name */
    private final long f45674b;

    /* renamed from: c, reason: collision with root package name */
    private final h.g.a.a f45675c;

    public /* synthetic */ as(long j2, long j3) {
        super(null, null);
        this.f45673a = j2;
        this.f45674b = j3;
        this.f45675c = null;
    }

    public final long a() {
        return this.f45673a;
    }

    public final long b() {
        return this.f45674b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof as)) {
            return false;
        }
        as asVar = (as) obj;
        if (this.f45673a != asVar.f45673a || this.f45674b != asVar.f45674b) {
            return false;
        }
        h.g.a.a aVar = asVar.f45675c;
        return h.g.b.x.n(null, null);
    }

    public final int hashCode() {
        return ((a.a.b(this.f45673a) * 31) + a.a.b(this.f45674b)) * 31;
    }

    public final String toString() {
        return "Data(durationMs=" + this.f45673a + ", startTimeUtcMs=" + this.f45674b + ", onTimeout=null)";
    }
}
