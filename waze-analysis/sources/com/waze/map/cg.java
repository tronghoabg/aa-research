package com.waze.map;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class cg extends com.waze.google_assistant.an {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.map.b.cq f28675a;

    /* renamed from: b, reason: collision with root package name */
    private final float f28676b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cg(com.waze.map.b.cq cqVar, float f2) {
        super(null);
        h.g.b.x.f(cqVar, "original");
        this.f28675a = cqVar;
        this.f28676b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cg)) {
            return false;
        }
        cg cgVar = (cg) obj;
        return h.g.b.x.n(this.f28675a, cgVar.f28675a) && Float.compare(this.f28676b, cgVar.f28676b) == 0;
    }

    public final int hashCode() {
        return (this.f28675a.hashCode() * 31) + Float.floatToIntBits(this.f28676b);
    }

    public final float i() {
        return this.f28676b;
    }

    public final com.waze.map.b.cq j() {
        return this.f28675a;
    }

    public final String toString() {
        return "Coordinate(original=" + this.f28675a + ", orientationDegrees=" + this.f28676b + ")";
    }
}
