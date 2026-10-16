package com.waze.map.b;

import java.util.List;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class ei {

    /* renamed from: a, reason: collision with root package name */
    private final Map f28252a;

    /* renamed from: b, reason: collision with root package name */
    private final List f28253b;

    /* renamed from: c, reason: collision with root package name */
    private final List f28254c;

    public ei(Map map, List list, List list2) {
        h.g.b.x.f(map, "clickableInfoByObjectId");
        h.g.b.x.f(list, "markersForPresenter");
        h.g.b.x.f(list2, "polylinesForPresenter");
        this.f28252a = map;
        this.f28253b = list;
        this.f28254c = list2;
    }

    public final List a() {
        return this.f28253b;
    }

    public final List b() {
        return this.f28254c;
    }

    public final Map c() {
        return this.f28252a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ei)) {
            return false;
        }
        ei eiVar = (ei) obj;
        return h.g.b.x.n(this.f28252a, eiVar.f28252a) && h.g.b.x.n(this.f28253b, eiVar.f28253b) && h.g.b.x.n(this.f28254c, eiVar.f28254c);
    }

    public final int hashCode() {
        return (((this.f28252a.hashCode() * 31) + this.f28253b.hashCode()) * 31) + this.f28254c.hashCode();
    }

    public final String toString() {
        return "MapClickableContent(clickableInfoByObjectId=" + this.f28252a + ", markersForPresenter=" + this.f28253b + ", polylinesForPresenter=" + this.f28254c + ")";
    }
}
