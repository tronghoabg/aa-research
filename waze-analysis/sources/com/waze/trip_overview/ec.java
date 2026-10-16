package com.waze.trip_overview;

import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ec extends fh {

    /* renamed from: a, reason: collision with root package name */
    private final Map f41426a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ec(Map map) {
        super(null);
        h.g.b.x.f(map, "result");
        this.f41426a = map;
    }

    public final Map a() {
        return this.f41426a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ec) && h.g.b.x.n(this.f41426a, ((ec) obj).f41426a);
    }

    public final int hashCode() {
        return this.f41426a.hashCode();
    }

    public final String toString() {
        return "EtaLabelsGenerated(result=" + this.f41426a + ")";
    }
}
