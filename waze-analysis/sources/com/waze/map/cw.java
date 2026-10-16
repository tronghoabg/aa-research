package com.waze.map;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class cw {

    /* renamed from: a, reason: collision with root package name */
    private final cx f28710a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.map.main.v f28711b;

    /* renamed from: c, reason: collision with root package name */
    private final cx f28712c;

    public cw(com.waze.map.main.v vVar, cx cxVar, cx cxVar2) {
        h.g.b.x.f(vVar, "helpers");
        h.g.b.x.f(cxVar, "requests");
        h.g.b.x.f(cxVar2, "callbacks");
        this.f28711b = vVar;
        this.f28710a = cxVar;
        this.f28712c = cxVar2;
    }

    public final cx a() {
        return this.f28710a;
    }

    public final cx b() {
        return this.f28712c;
    }

    public final com.waze.map.main.v c() {
        return this.f28711b;
    }

    public final com.waze.map.main.v d() {
        return this.f28711b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cw)) {
            return false;
        }
        cw cwVar = (cw) obj;
        return h.g.b.x.n(this.f28711b, cwVar.f28711b) && h.g.b.x.n(this.f28710a, cwVar.f28710a) && h.g.b.x.n(this.f28712c, cwVar.f28712c);
    }

    public final int hashCode() {
        return (((this.f28711b.hashCode() * 31) + this.f28710a.hashCode()) * 31) + this.f28712c.hashCode();
    }

    public final String toString() {
        return "Presentation(helpers=" + this.f28711b + ", requests=" + this.f28710a + ", callbacks=" + this.f28712c + ")";
    }
}
