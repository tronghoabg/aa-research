package com.waze.bw.a.c;

import com.waze.sharedui.web.at;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private final c f17639a;

    /* renamed from: b, reason: collision with root package name */
    private final at f17640b;

    public d(c cVar, at atVar) {
        x.f(cVar, "address");
        this.f17639a = cVar;
        this.f17640b = atVar;
    }

    public final c a() {
        return this.f17639a;
    }

    public final at b() {
        return this.f17640b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return x.n(this.f17639a, dVar.f17639a) && x.n(this.f17640b, dVar.f17640b);
    }

    public final int hashCode() {
        int iHashCode = this.f17639a.hashCode() * 31;
        at atVar = this.f17640b;
        return iHashCode + (atVar == null ? 0 : atVar.hashCode());
    }

    public final String toString() {
        return "StartStateCarUIDestination(address=" + this.f17639a + ", favoriteInfo=" + this.f17640b + ")";
    }
}
