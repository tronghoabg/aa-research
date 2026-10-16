package com.waze.map.b;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class o extends com.waze.ap.b.o {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.shared_infra.h.c f28358a;

    /* renamed from: b, reason: collision with root package name */
    private final Float f28359b;

    /* renamed from: c, reason: collision with root package name */
    private final float f28360c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f28361d;

    /* renamed from: e, reason: collision with root package name */
    private final com.waze.destination_cell.b.e f28362e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(com.waze.shared_infra.h.c cVar, Float f2, float f3, boolean z, com.waze.destination_cell.b.e eVar, int i2) {
        super(null, null);
        eVar = (i2 & 16) != 0 ? new dt((byte[]) null) : eVar;
        int i3 = i2 & 4;
        boolean z2 = z & ((i2 & 8) == 0);
        f3 = i3 != 0 ? 0.0f : f3;
        f2 = (i2 & 2) != 0 ? null : f2;
        h.g.b.x.f(cVar, "position");
        h.g.b.x.f(eVar, "positionInViewport");
        this.f28358a = cVar;
        this.f28359b = f2;
        this.f28360c = f3;
        this.f28361d = z2;
        this.f28362e = eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return h.g.b.x.n(this.f28358a, oVar.f28358a) && h.g.b.x.n(this.f28359b, oVar.f28359b) && ff.b(this.f28360c, oVar.f28360c) && this.f28361d == oVar.f28361d && h.g.b.x.n(this.f28362e, oVar.f28362e);
    }

    public final float g() {
        return this.f28360c;
    }

    public final com.waze.shared_infra.h.c h() {
        return this.f28358a;
    }

    public final int hashCode() {
        int iHashCode = this.f28358a.hashCode() * 31;
        Float f2 = this.f28359b;
        return ((((((iHashCode + (f2 == null ? 0 : f2.hashCode())) * 31) + Float.floatToIntBits(this.f28360c)) * 31) + a.a.a(this.f28361d)) * 31) + this.f28362e.hashCode();
    }

    public final Float i() {
        return this.f28359b;
    }

    public final boolean j() {
        return this.f28361d;
    }

    public final com.waze.destination_cell.b.e k() {
        return this.f28362e;
    }

    public final String toString() {
        return "FocusOnPosition(position=" + this.f28358a + ", orientationDegrees=" + this.f28359b + ", zoom=" + ff.a(this.f28360c) + ", darkenMap=" + this.f28361d + ", positionInViewport=" + this.f28362e + ")";
    }
}
