package com.waze.ui.m;

import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    private final List f43030a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.ui.ac.n f43031b;

    public r(List list, com.waze.ui.ac.n nVar) {
        h.g.b.x.f(list, "plugs");
        this.f43030a = list;
        this.f43031b = nVar;
    }

    public final com.waze.ui.ac.n a() {
        return this.f43031b;
    }

    public final List b() {
        return this.f43030a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return h.g.b.x.n(this.f43030a, rVar.f43030a) && h.g.b.x.n(this.f43031b, rVar.f43031b);
    }

    public final int hashCode() {
        int iHashCode = this.f43030a.hashCode() * 31;
        com.waze.ui.ac.n nVar = this.f43031b;
        return iHashCode + (nVar == null ? 0 : nVar.hashCode());
    }

    public final String toString() {
        return "EVPlugsUIModel(plugs=" + this.f43030a + ", noPlugsMatchYourCarText=" + this.f43031b + ")";
    }
}
