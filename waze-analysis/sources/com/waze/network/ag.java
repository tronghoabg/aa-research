package com.waze.network;

import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class ag {

    /* renamed from: a, reason: collision with root package name */
    private final Map f31871a;

    public ag(Map map) {
        h.g.b.x.f(map, "queueStats");
        this.f31871a = map;
    }

    public final Map a() {
        return this.f31871a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ag) && h.g.b.x.n(this.f31871a, ((ag) obj).f31871a);
    }

    public final int hashCode() {
        return this.f31871a.hashCode();
    }

    public final String toString() {
        return "NetworkStats(queueStats=" + this.f31871a + ")";
    }
}
