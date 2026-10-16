package com.waze.br.a;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class c implements i {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.av.d.k f17284a;

    public c(com.waze.av.d.k kVar) {
        h.g.b.x.f(kVar, "venueExtendedData");
        this.f17284a = kVar;
    }

    public final com.waze.av.d.k a() {
        return this.f17284a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && h.g.b.x.n(this.f17284a, ((c) obj).f17284a);
    }

    public final int hashCode() {
        return this.f17284a.hashCode();
    }

    public final String toString() {
        return "LocationDetails(venueExtendedData=" + this.f17284a + ")";
    }
}
