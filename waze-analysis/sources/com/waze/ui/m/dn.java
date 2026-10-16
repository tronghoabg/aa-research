package com.waze.ui.m;

import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class dn {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.ui.ac.n f42990a;

    /* renamed from: b, reason: collision with root package name */
    private final List f42991b;

    /* renamed from: c, reason: collision with root package name */
    private final List f42992c;

    public dn(com.waze.ui.ac.n nVar, List list, List list2) {
        h.g.b.x.f(nVar, "header");
        h.g.b.x.f(list, "badges");
        h.g.b.x.f(list2, "days");
        this.f42990a = nVar;
        this.f42991b = list;
        this.f42992c = list2;
    }

    public final com.waze.ui.ac.n a() {
        return this.f42990a;
    }

    public final List b() {
        return this.f42991b;
    }

    public final List c() {
        return this.f42992c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dn)) {
            return false;
        }
        dn dnVar = (dn) obj;
        return h.g.b.x.n(this.f42990a, dnVar.f42990a) && h.g.b.x.n(this.f42991b, dnVar.f42991b) && h.g.b.x.n(this.f42992c, dnVar.f42992c);
    }

    public final int hashCode() {
        return (((this.f42990a.hashCode() * 31) + this.f42991b.hashCode()) * 31) + this.f42992c.hashCode();
    }

    public final String toString() {
        return "OpeningHoursWeek(header=" + this.f42990a + ", badges=" + this.f42991b + ", days=" + this.f42992c + ")";
    }
}
