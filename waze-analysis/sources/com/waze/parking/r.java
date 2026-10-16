package com.waze.parking;

import com.waze.map.b.ed;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    private final ed f32986a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f32987b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.reports_v2.presentation.p f32988c;

    public r(ed edVar, boolean z, com.waze.reports_v2.presentation.p pVar) {
        h.g.b.x.f(edVar, "mapController");
        h.g.b.x.f(pVar, "placeName");
        this.f32986a = edVar;
        this.f32987b = z;
        this.f32988c = pVar;
    }

    public static /* synthetic */ r d(r rVar, boolean z, com.waze.reports_v2.presentation.p pVar, int i2) {
        ed edVar = (i2 & 1) != 0 ? rVar.f32986a : null;
        if ((i2 & 2) != 0) {
            z = rVar.f32987b;
        }
        if ((i2 & 4) != 0) {
            pVar = rVar.f32988c;
        }
        h.g.b.x.f(edVar, "mapController");
        h.g.b.x.f(pVar, "placeName");
        return new r(edVar, z, pVar);
    }

    public final ed a() {
        return this.f32986a;
    }

    public final boolean b() {
        return this.f32987b;
    }

    public final com.waze.reports_v2.presentation.p c() {
        return this.f32988c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return h.g.b.x.n(this.f32986a, rVar.f32986a) && this.f32987b == rVar.f32987b && h.g.b.x.n(this.f32988c, rVar.f32988c);
    }

    public final int hashCode() {
        return (((this.f32986a.hashCode() * 31) + a.a.a(this.f32987b)) * 31) + this.f32988c.hashCode();
    }

    public final String toString() {
        return "ParkingUpdateLocationScreenState(mapController=" + this.f32986a + ", isCenteredOnUserLocation=" + this.f32987b + ", placeName=" + this.f32988c + ")";
    }
}
