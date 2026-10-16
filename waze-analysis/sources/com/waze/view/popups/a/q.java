package com.waze.view.popups.a;

import com.waze.map.gu;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class q extends u {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.places.f f45221a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(com.waze.places.f fVar) {
        super(gu.f29190j);
        h.g.b.x.f(fVar, "place");
        this.f45221a = fVar;
    }

    public final com.waze.places.f b() {
        return this.f45221a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q) && h.g.b.x.n(this.f45221a, ((q) obj).f45221a);
    }

    public final int hashCode() {
        return this.f45221a.hashCode();
    }

    public final String toString() {
        return "NewVenuePopup(place=" + this.f45221a + ")";
    }
}
