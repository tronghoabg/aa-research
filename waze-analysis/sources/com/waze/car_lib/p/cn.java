package com.waze.car_lib.p;

import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class cn {

    /* renamed from: a, reason: collision with root package name */
    private final String f20735a;

    /* renamed from: b, reason: collision with root package name */
    private final List f20736b;

    public cn(String str, List list) {
        h.g.b.x.f(str, "sectionHeader");
        h.g.b.x.f(list, "rows");
        this.f20735a = str;
        this.f20736b = list;
    }

    public final String a() {
        return this.f20735a;
    }

    public final List b() {
        return this.f20736b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cn)) {
            return false;
        }
        cn cnVar = (cn) obj;
        return h.g.b.x.n(this.f20735a, cnVar.f20735a) && h.g.b.x.n(this.f20736b, cnVar.f20736b);
    }

    public final int hashCode() {
        return (this.f20735a.hashCode() * 31) + this.f20736b.hashCode();
    }

    public final String toString() {
        return "SectionUiState(sectionHeader=" + this.f20735a + ", rows=" + this.f20736b + ")";
    }
}
