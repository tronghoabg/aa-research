package com.waze.location.a;

import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class i extends l {

    /* renamed from: a, reason: collision with root package name */
    private final long f25206a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f25207b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(long j2, Map map) {
        super(null);
        h.g.b.x.f(map, "locations");
        this.f25206a = j2;
        this.f25207b = map;
    }

    public final long a() {
        return this.f25206a;
    }

    @Override // com.waze.location.a.l
    public final Map b() {
        return this.f25207b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f25206a == iVar.f25206a && h.g.b.x.n(this.f25207b, iVar.f25207b);
    }

    public final int hashCode() {
        return (a.a.b(this.f25206a) * 31) + this.f25207b.hashCode();
    }

    public final String toString() {
        return "LocationInconsistency(distanceMeters=" + this.f25206a + ", locations=" + this.f25207b + ")";
    }
}
