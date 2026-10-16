package com.waze.map.b;

import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class dp {

    /* renamed from: a, reason: collision with root package name */
    private final List f28217a;

    /* renamed from: b, reason: collision with root package name */
    private final long f28218b;

    public dp(List list, long j2) {
        h.g.b.x.f(list, "positions");
        this.f28217a = list;
        this.f28218b = j2;
    }

    public final long a() {
        return this.f28218b;
    }

    public final List b() {
        return this.f28217a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dp)) {
            return false;
        }
        dp dpVar = (dp) obj;
        return h.g.b.x.n(this.f28217a, dpVar.f28217a) && this.f28218b == dpVar.f28218b;
    }

    public final int hashCode() {
        return (this.f28217a.hashCode() * 31) + a.a.b(this.f28218b);
    }

    public final String toString() {
        return "Polyline(positions=" + this.f28217a + ", id=" + this.f28218b + ")";
    }
}
