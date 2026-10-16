package com.waze.car_lib.f;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class af extends com.waze.x.g {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.map.isolated.e f19355a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public af(com.waze.map.isolated.e eVar) {
        super(null);
        h.g.b.x.f(eVar, "ad");
        this.f19355a = eVar;
    }

    public final com.waze.map.isolated.e a() {
        return this.f19355a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof af) && h.g.b.x.n(this.f19355a, ((af) obj).f19355a);
    }

    public final int hashCode() {
        return this.f19355a.hashCode();
    }

    public final String toString() {
        return "ShowMapAd(ad=" + this.f19355a + ")";
    }
}
