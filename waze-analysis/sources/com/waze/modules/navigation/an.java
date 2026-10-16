package com.waze.modules.navigation;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class an extends j {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.places.f f30306a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public an(com.waze.places.f fVar) {
        super(null, null);
        h.g.b.x.f(fVar, "place");
        this.f30306a = fVar;
    }

    public final com.waze.places.f c() {
        return this.f30306a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof an) && h.g.b.x.n(this.f30306a, ((an) obj).f30306a);
    }

    public final int hashCode() {
        return this.f30306a.hashCode();
    }

    public final String toString() {
        return "FromPlace(place=" + this.f30306a + ")";
    }
}
