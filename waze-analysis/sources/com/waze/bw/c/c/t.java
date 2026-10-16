package com.waze.bw.c.c;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class t extends com.waze.sharedui.api.c {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.av.b.j f17861a;

    /* renamed from: b, reason: collision with root package name */
    private final long f17862b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(com.waze.av.b.j jVar, long j2) {
        super(null, null);
        h.g.b.x.f(jVar, "destination");
        this.f17861a = jVar;
        this.f17862b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return h.g.b.x.n(this.f17861a, tVar.f17861a) && this.f17862b == tVar.f17862b;
    }

    public final long g() {
        return this.f17862b;
    }

    public final com.waze.av.b.j h() {
        return this.f17861a;
    }

    public final int hashCode() {
        return (this.f17861a.hashCode() * 31) + a.a.b(this.f17862b);
    }

    public final String toString() {
        return "StartFutureNavigation(destination=" + this.f17861a + ", startTimeEpocSec=" + this.f17862b + ")";
    }
}
