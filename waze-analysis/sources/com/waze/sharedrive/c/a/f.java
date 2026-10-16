package com.waze.sharedrive.c.a;

import h.g.b.x;
import j$.time.Instant;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class f implements h {

    /* renamed from: a, reason: collision with root package name */
    private final Instant f38064a;

    /* renamed from: b, reason: collision with root package name */
    private final List f38065b;

    public f(Instant instant, List list) {
        x.f(instant, "eta");
        x.f(list, "routeGeometry");
        this.f38064a = instant;
        this.f38065b = list;
    }

    @Override // com.waze.sharedrive.c.a.h
    public final Instant a() {
        return this.f38064a;
    }

    public final List b() {
        return this.f38065b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return x.n(this.f38064a, fVar.f38064a) && x.n(this.f38065b, fVar.f38065b);
    }

    public final int hashCode() {
        return (this.f38064a.hashCode() * 31) + this.f38065b.hashCode();
    }

    public final String toString() {
        return "LiveDrive(eta=" + this.f38064a + ", routeGeometry=" + this.f38065b + ")";
    }
}
