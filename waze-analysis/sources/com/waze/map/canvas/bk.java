package com.waze.map.canvas;

import com.waze.map.b.ff;
import com.waze.strings.DisplayStrings;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class bk {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.shared_infra.h.c f28606a;

    /* renamed from: b, reason: collision with root package name */
    private final Float f28607b;

    /* renamed from: c, reason: collision with root package name */
    private final float f28608c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f28609d;

    /* renamed from: e, reason: collision with root package name */
    private final com.waze.destination_cell.b.e f28610e;

    public /* synthetic */ bk(com.waze.shared_infra.h.c cVar, Float f2, float f3, com.waze.destination_cell.b.e eVar) {
        h.g.b.x.f(cVar, "position");
        h.g.b.x.f(eVar, "positionInViewport");
        this.f28606a = cVar;
        this.f28607b = f2;
        this.f28608c = f3;
        this.f28609d = false;
        this.f28610e = eVar;
    }

    public final float a() {
        return this.f28608c;
    }

    public final com.waze.shared_infra.h.c b() {
        return this.f28606a;
    }

    public final Float c() {
        return this.f28607b;
    }

    public final com.waze.destination_cell.b.e d() {
        return this.f28610e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bk)) {
            return false;
        }
        bk bkVar = (bk) obj;
        if (!h.g.b.x.n(this.f28606a, bkVar.f28606a) || !h.g.b.x.n(this.f28607b, bkVar.f28607b) || !ff.b(this.f28608c, bkVar.f28608c)) {
            return false;
        }
        boolean z = bkVar.f28609d;
        return h.g.b.x.n(this.f28610e, bkVar.f28610e);
    }

    public final int hashCode() {
        int iHashCode = this.f28606a.hashCode() * 31;
        Float f2 = this.f28607b;
        return ((((((iHashCode + (f2 == null ? 0 : f2.hashCode())) * 31) + Float.floatToIntBits(this.f28608c)) * 31) + DisplayStrings.DS_SEARCH_RESULTS_PARKING_POPULAR_HEADER) * 31) + this.f28610e.hashCode();
    }

    public final String toString() {
        return "CenterOnPosition(position=" + this.f28606a + ", orientationDegrees=" + this.f28607b + ", zoom=" + ff.a(this.f28608c) + ", darkenMap=false, positionInViewport=" + this.f28610e + ")";
    }
}
