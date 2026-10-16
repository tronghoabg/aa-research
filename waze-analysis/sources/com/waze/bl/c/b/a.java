package com.waze.bl.c.b;

import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final String f17002a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.shared_infra.h.c f17003b;

    /* renamed from: c, reason: collision with root package name */
    private final float f17004c;

    public a(String str, com.waze.shared_infra.h.c cVar, float f2) {
        x.f(str, "referenceName");
        x.f(cVar, "coordinate");
        this.f17002a = str;
        this.f17003b = cVar;
        this.f17004c = f2;
    }

    public final float a() {
        return this.f17004c;
    }

    public final com.waze.shared_infra.h.c b() {
        return this.f17003b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return x.n(this.f17002a, aVar.f17002a) && x.n(this.f17003b, aVar.f17003b) && Float.compare(this.f17004c, aVar.f17004c) == 0;
    }

    public final int hashCode() {
        return (((this.f17002a.hashCode() * 31) + this.f17003b.hashCode()) * 31) + Float.floatToIntBits(this.f17004c);
    }

    public final String toString() {
        return "ClosureCandidateMarkerData(referenceName=" + this.f17002a + ", coordinate=" + this.f17003b + ", azimuthDegrees=" + this.f17004c + ")";
    }
}
