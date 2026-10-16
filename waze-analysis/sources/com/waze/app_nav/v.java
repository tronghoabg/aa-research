package com.waze.app_nav;

import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    private final m f15439a;

    /* renamed from: b, reason: collision with root package name */
    private final List f15440b;

    public v(m mVar, List list) {
        h.g.b.x.f(mVar, "currentDestination");
        h.g.b.x.f(list, "backStack");
        this.f15439a = mVar;
        this.f15440b = list;
    }

    public final m a() {
        return this.f15439a;
    }

    public final List b() {
        return this.f15440b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return h.g.b.x.n(this.f15439a, vVar.f15439a) && h.g.b.x.n(this.f15440b, vVar.f15440b);
    }

    public final int hashCode() {
        return (this.f15439a.hashCode() * 31) + this.f15440b.hashCode();
    }

    public final String toString() {
        return "ScreenFlowState(currentDestination=" + this.f15439a + ", backStack=" + this.f15440b + ")";
    }
}
