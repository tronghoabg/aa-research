package com.waze.ui.navbar;

import h.g.b.x;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final List f43106a;

    public c(List list) {
        x.f(list, "angles");
        this.f43106a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && x.n(this.f43106a, ((c) obj).f43106a);
    }

    public final int hashCode() {
        return this.f43106a.hashCode();
    }

    public final String toString() {
        return "UiNavigationLane(angles=" + this.f43106a + ")";
    }
}
