package com.waze.modules.c;

import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class ag {

    /* renamed from: a, reason: collision with root package name */
    private final List f29835a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f29836b;

    /* renamed from: c, reason: collision with root package name */
    private final String f29837c;

    public ag(List list, boolean z, String str) {
        h.g.b.x.f(list, "segments");
        h.g.b.x.f(str, "routeUUID");
        this.f29835a = list;
        this.f29836b = z;
        this.f29837c = str;
    }

    public final String a() {
        return this.f29837c;
    }

    public final List b() {
        return this.f29835a;
    }

    public final boolean c() {
        return this.f29836b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ag)) {
            return false;
        }
        ag agVar = (ag) obj;
        return h.g.b.x.n(this.f29835a, agVar.f29835a) && this.f29836b == agVar.f29836b && h.g.b.x.n(this.f29837c, agVar.f29837c);
    }

    public final int hashCode() {
        return (((this.f29835a.hashCode() * 31) + a.a.a(this.f29836b)) * 31) + this.f29837c.hashCode();
    }

    public final String toString() {
        return "LocalRoute(segments=" + this.f29835a + ", isReroute=" + this.f29836b + ", routeUUID=" + this.f29837c + ")";
    }
}
