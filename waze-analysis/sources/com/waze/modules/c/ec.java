package com.waze.modules.c;

import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class ec {

    /* renamed from: a, reason: collision with root package name */
    private final List f30140a;

    /* renamed from: b, reason: collision with root package name */
    private final String f30141b;

    public ec(List list, String str) {
        h.g.b.x.f(list, "polygon");
        h.g.b.x.f(str, "displayLabel");
        this.f30140a = list;
        this.f30141b = str;
    }

    public final String a() {
        return this.f30141b;
    }

    public final List b() {
        return this.f30140a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ec)) {
            return false;
        }
        ec ecVar = (ec) obj;
        return h.g.b.x.n(this.f30140a, ecVar.f30140a) && h.g.b.x.n(this.f30141b, ecVar.f30141b);
    }

    public final int hashCode() {
        return (this.f30140a.hashCode() * 31) + this.f30141b.hashCode();
    }

    public final String toString() {
        return "VisualMte(polygon=" + this.f30140a + ", displayLabel=" + this.f30141b + ")";
    }
}
