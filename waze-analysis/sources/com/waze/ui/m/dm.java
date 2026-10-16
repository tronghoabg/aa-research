package com.waze.ui.m;

import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class dm {

    /* renamed from: a, reason: collision with root package name */
    private final String f42988a;

    /* renamed from: b, reason: collision with root package name */
    private final List f42989b;

    public dm(String str, List list) {
        h.g.b.x.f(str, "day");
        h.g.b.x.f(list, "times");
        this.f42988a = str;
        this.f42989b = list;
    }

    public final String a() {
        return this.f42988a;
    }

    public final List b() {
        return this.f42989b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dm)) {
            return false;
        }
        dm dmVar = (dm) obj;
        return h.g.b.x.n(this.f42988a, dmVar.f42988a) && h.g.b.x.n(this.f42989b, dmVar.f42989b);
    }

    public final int hashCode() {
        return (this.f42988a.hashCode() * 31) + this.f42989b.hashCode();
    }

    public final String toString() {
        return "OpeningHoursDay(day=" + this.f42988a + ", times=" + this.f42989b + ")";
    }
}
