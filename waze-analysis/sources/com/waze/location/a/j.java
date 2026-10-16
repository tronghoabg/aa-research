package com.waze.location.a;

import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class j extends l {

    /* renamed from: a, reason: collision with root package name */
    private final long f25208a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f25209b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(long j2, Map map) {
        super(null);
        h.g.b.x.f(map, "locations");
        this.f25208a = j2;
        this.f25209b = map;
    }

    public final long a() {
        return this.f25208a;
    }

    @Override // com.waze.location.a.l
    public final Map b() {
        return this.f25209b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f25208a == jVar.f25208a && h.g.b.x.n(this.f25209b, jVar.f25209b);
    }

    public final int hashCode() {
        return (a.a.b(this.f25208a) * 31) + this.f25209b.hashCode();
    }

    public final String toString() {
        return "StaleLocation(staleTimeMs=" + this.f25208a + ", locations=" + this.f25209b + ")";
    }
}
