package com.waze.car_lib.f;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class bh extends com.waze.design_components.g.b {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.map.isolated.e f19422a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bh(com.waze.map.isolated.e eVar) {
        super(null);
        h.g.b.x.f(eVar, "ad");
        this.f19422a = eVar;
    }

    public final com.waze.map.isolated.e a() {
        return this.f19422a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bh) && h.g.b.x.n(this.f19422a, ((bh) obj).f19422a);
    }

    public final int hashCode() {
        return this.f19422a.hashCode();
    }

    public final String toString() {
        return "PreviewAd(ad=" + this.f19422a + ")";
    }
}
