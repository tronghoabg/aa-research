package com.waze.map.canvas;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class bo {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.shared_infra.h.c f28624a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f28625b;

    public bo(com.waze.shared_infra.h.c cVar, boolean z) {
        h.g.b.x.f(cVar, "coordinate");
        this.f28624a = cVar;
        this.f28625b = z;
    }

    public final com.waze.shared_infra.h.c a() {
        return this.f28624a;
    }

    public final boolean b() {
        return this.f28625b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bo)) {
            return false;
        }
        bo boVar = (bo) obj;
        return h.g.b.x.n(this.f28624a, boVar.f28624a) && this.f28625b == boVar.f28625b;
    }

    public final int hashCode() {
        return (this.f28624a.hashCode() * 31) + a.a.a(this.f28625b);
    }

    public final String toString() {
        return "SelectedLocation(coordinate=" + this.f28624a + ", highlightSegment=" + this.f28625b + ")";
    }
}
