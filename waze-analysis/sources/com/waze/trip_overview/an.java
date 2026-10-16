package com.waze.trip_overview;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class an {

    /* renamed from: a, reason: collision with root package name */
    private final at f41003a;

    /* renamed from: b, reason: collision with root package name */
    private final String f41004b;

    /* renamed from: c, reason: collision with root package name */
    private final ao f41005c;

    public an(at atVar, String str, ao aoVar) {
        h.g.b.x.f(atVar, "presentRoute");
        h.g.b.x.f(str, "display");
        h.g.b.x.f(aoVar, "savingTime");
        this.f41003a = atVar;
        this.f41004b = str;
        this.f41005c = aoVar;
    }

    public final ao a() {
        return this.f41005c;
    }

    public final at b() {
        return this.f41003a;
    }

    public final String c() {
        return this.f41004b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof an)) {
            return false;
        }
        an anVar = (an) obj;
        return h.g.b.x.n(this.f41003a, anVar.f41003a) && h.g.b.x.n(this.f41004b, anVar.f41004b) && h.g.b.x.n(this.f41005c, anVar.f41005c);
    }

    public final int hashCode() {
        return (((this.f41003a.hashCode() * 31) + this.f41004b.hashCode()) * 31) + this.f41005c.hashCode();
    }

    public final String toString() {
        return "HovInfoRoute(presentRoute=" + this.f41003a + ", display=" + this.f41004b + ", savingTime=" + this.f41005c + ")";
    }
}
