package com.waze.ui.b;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ba {

    /* renamed from: a, reason: collision with root package name */
    private final List f42029a;

    /* renamed from: b, reason: collision with root package name */
    private final List f42030b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.ui.b.a.c f42031c;

    /* renamed from: d, reason: collision with root package name */
    private final MutableState f42032d;

    public ba(List list, List list2, com.waze.ui.b.a.c cVar) {
        h.g.b.x.f(list, "trafficSegments");
        h.g.b.x.f(list2, "routeEvents");
        this.f42029a = list;
        this.f42030b = list2;
        this.f42031c = cVar;
        this.f42032d = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
    }

    public final MutableState a() {
        return this.f42032d;
    }

    public final com.waze.ui.b.a.c b() {
        return this.f42031c;
    }

    public final List c() {
        return this.f42030b;
    }

    public final List d() {
        return this.f42029a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ba)) {
            return false;
        }
        ba baVar = (ba) obj;
        return h.g.b.x.n(this.f42029a, baVar.f42029a) && h.g.b.x.n(this.f42030b, baVar.f42030b) && h.g.b.x.n(this.f42031c, baVar.f42031c);
    }

    public final int hashCode() {
        int iHashCode = (this.f42029a.hashCode() * 31) + this.f42030b.hashCode();
        com.waze.ui.b.a.c cVar = this.f42031c;
        return (iHashCode * 31) + (cVar == null ? 0 : cVar.hashCode());
    }

    public final String toString() {
        return "TimelineState(trafficSegments=" + this.f42029a + ", routeEvents=" + this.f42030b + ", waypoint=" + this.f42031c + ")";
    }
}
