package com.waze.trip_overview;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class au {

    /* renamed from: a, reason: collision with root package name */
    private final am f41031a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.speech.k f41032b;

    public au(am amVar, com.waze.speech.k kVar) {
        this.f41031a = amVar;
        this.f41032b = kVar;
    }

    public final am a() {
        return this.f41031a;
    }

    public final com.waze.speech.k b() {
        return this.f41032b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof au)) {
            return false;
        }
        au auVar = (au) obj;
        return h.g.b.x.n(this.f41031a, auVar.f41031a) && h.g.b.x.n(this.f41032b, auVar.f41032b);
    }

    public final int hashCode() {
        am amVar = this.f41031a;
        int iHashCode = amVar == null ? 0 : amVar.hashCode();
        com.waze.speech.k kVar = this.f41032b;
        return (iHashCode * 31) + (kVar != null ? kVar.hashCode() : 0);
    }

    public final String toString() {
        return "RouteProperties(hovData=" + this.f41031a + ", tollData=" + this.f41032b + ")";
    }
}
