package com.waze.bl.c.b;

import h.g.b.x;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class f extends j {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f17010a;

    /* renamed from: b, reason: collision with root package name */
    private final List f17011b;

    public f(boolean z, List list) {
        x.f(list, "closuresCandidates");
        this.f17010a = z;
        this.f17011b = list;
    }

    public final List a() {
        return this.f17011b;
    }

    @Override // com.waze.bl.c.b.j, com.waze.t.b.cb
    public final boolean e() {
        return this.f17010a;
    }

    @Override // com.waze.bl.c.b.j
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f17010a == fVar.f17010a && x.n(this.f17011b, fVar.f17011b);
    }

    @Override // com.waze.bl.c.b.j
    public final int hashCode() {
        return (a.a.a(this.f17010a) * 31) + this.f17011b.hashCode();
    }

    public final String toString() {
        return "GetClosureCandidatesResult(success=" + this.f17010a + ", closuresCandidates=" + this.f17011b + ")";
    }
}
