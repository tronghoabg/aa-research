package com.waze.map.b;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class dm {

    /* renamed from: a, reason: collision with root package name */
    private final ci f28206a;

    /* renamed from: b, reason: collision with root package name */
    private final ci f28207b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.shared_infra.h.c f28208c;

    /* renamed from: d, reason: collision with root package name */
    private final float f28209d;

    /* renamed from: e, reason: collision with root package name */
    private final float f28210e;

    /* renamed from: f, reason: collision with root package name */
    private final float f28211f;

    public /* synthetic */ dm(ci ciVar, ci ciVar2, com.waze.shared_infra.h.c cVar, float f2, float f3, float f4) {
        h.g.b.x.f(ciVar, "viewportCornersPolygon");
        h.g.b.x.f(ciVar2, "fullscreenCornersPolygon");
        h.g.b.x.f(cVar, "viewportCenter");
        this.f28206a = ciVar;
        this.f28207b = ciVar2;
        this.f28208c = cVar;
        this.f28209d = f2;
        this.f28210e = f3;
        this.f28211f = f4;
    }

    public final float a() {
        return this.f28210e;
    }

    public final float b() {
        return this.f28209d;
    }

    public final float c() {
        return this.f28211f;
    }

    public final ci d() {
        return this.f28206a;
    }

    public final com.waze.shared_infra.h.c e() {
        return this.f28208c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dm)) {
            return false;
        }
        dm dmVar = (dm) obj;
        return h.g.b.x.n(this.f28206a, dmVar.f28206a) && h.g.b.x.n(this.f28207b, dmVar.f28207b) && h.g.b.x.n(this.f28208c, dmVar.f28208c) && Float.compare(this.f28209d, dmVar.f28209d) == 0 && Float.compare(this.f28210e, dmVar.f28210e) == 0 && ff.b(this.f28211f, dmVar.f28211f);
    }

    public final int hashCode() {
        return (((((((((this.f28206a.hashCode() * 31) + this.f28207b.hashCode()) * 31) + this.f28208c.hashCode()) * 31) + Float.floatToIntBits(this.f28209d)) * 31) + Float.floatToIntBits(this.f28210e)) * 31) + Float.floatToIntBits(this.f28211f);
    }

    public final String toString() {
        return "MapVisibleArea(viewportCornersPolygon=" + this.f28206a + ", fullscreenCornersPolygon=" + this.f28207b + ", viewportCenter=" + this.f28208c + ", orientationDegrees=" + this.f28209d + ", cameraAngleDegrees=" + this.f28210e + ", zoom=" + ff.a(this.f28211f) + ")";
    }
}
