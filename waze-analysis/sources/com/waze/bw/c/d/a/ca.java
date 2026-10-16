package com.waze.bw.c.d.a;

import com.waze.bw.c.d.cv;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ca extends com.waze.tide.s {

    /* renamed from: a, reason: collision with root package name */
    private final cv f17921a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f17922b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ca(cv cvVar, boolean z) {
        super((byte[]) null);
        h.g.b.x.f(cvVar, "wazeUIDestination");
        this.f17921a = cvVar;
        this.f17922b = z;
    }

    public final cv a() {
        return this.f17921a;
    }

    public final boolean b() {
        return this.f17922b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ca)) {
            return false;
        }
        ca caVar = (ca) obj;
        return h.g.b.x.n(this.f17921a, caVar.f17921a) && this.f17922b == caVar.f17922b;
    }

    public final int hashCode() {
        return (this.f17921a.hashCode() * 31) + a.a.a(this.f17922b);
    }

    public final String toString() {
        return "Recent(wazeUIDestination=" + this.f17921a + ", isLatam=" + this.f17922b + ")";
    }
}
