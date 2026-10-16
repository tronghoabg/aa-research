package com.waze.location.a;

import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class k extends l {

    /* renamed from: a, reason: collision with root package name */
    private final long f25210a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f25211b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(long j2, Map map) {
        super(null);
        h.g.b.x.f(map, "locations");
        this.f25210a = j2;
        this.f25211b = map;
    }

    public final long a() {
        return this.f25210a;
    }

    @Override // com.waze.location.a.l
    public final Map b() {
        return this.f25211b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f25210a == kVar.f25210a && h.g.b.x.n(this.f25211b, kVar.f25211b);
    }

    public final int hashCode() {
        return (a.a.b(this.f25210a) * 31) + this.f25211b.hashCode();
    }

    public final String toString() {
        return "TimeInconsistency(timeDiffMs=" + this.f25210a + ", locations=" + this.f25211b + ")";
    }
}
