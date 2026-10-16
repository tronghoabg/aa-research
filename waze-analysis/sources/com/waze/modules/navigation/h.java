package com.waze.modules.navigation;

import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    private final int f30435a;

    /* renamed from: b, reason: collision with root package name */
    private final int f30436b;

    /* renamed from: c, reason: collision with root package name */
    private final List f30437c;

    public h(int i2, int i3, List list) {
        h.g.b.x.f(list, "required_permits");
        this.f30435a = i2;
        this.f30436b = i3;
        this.f30437c = list;
    }

    public final int a() {
        return this.f30435a;
    }

    public final int b() {
        return this.f30436b;
    }

    public final List c() {
        return this.f30437c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f30435a == hVar.f30435a && this.f30436b == hVar.f30436b && h.g.b.x.n(this.f30437c, hVar.f30437c);
    }

    public final int hashCode() {
        return (((this.f30435a * 31) + this.f30436b) * 31) + this.f30437c.hashCode();
    }

    public final String toString() {
        return "AlternativeHovRouteInfo(duration_seconds=" + this.f30435a + ", min_passengers=" + this.f30436b + ", required_permits=" + this.f30437c + ")";
    }
}
