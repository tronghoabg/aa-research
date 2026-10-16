package com.waze.search;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class aw extends ai {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.av.d.k f35524a;

    /* JADX WARN: Illegal instructions before constructor call */
    public aw(com.waze.av.d.k kVar) {
        h.g.b.x.f(kVar, "venue");
        byte[] bArr = null;
        super(bArr, bArr);
        this.f35524a = kVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof aw) && h.g.b.x.n(this.f35524a, ((aw) obj).f35524a);
    }

    public final int hashCode() {
        return this.f35524a.hashCode();
    }

    public final com.waze.av.d.k p() {
        return this.f35524a;
    }

    public final String toString() {
        return "ParkNearVenue(venue=" + this.f35524a + ")";
    }
}
