package com.waze.car_lib.f;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ev extends com.waze.app_nav.hub.b.m {

    /* renamed from: a, reason: collision with root package name */
    private final String f19569a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ev(String str) {
        super(null);
        h.g.b.x.f(str, "adId");
        this.f19569a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ev) && h.g.b.x.n(this.f19569a, ((ev) obj).f19569a);
    }

    public final String g() {
        return this.f19569a;
    }

    public final int hashCode() {
        return this.f19569a.hashCode();
    }

    public final String toString() {
        return "ShowAd(adId=" + this.f19569a + ")";
    }
}
