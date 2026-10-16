package com.waze.car_lib.f;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class bp extends com.waze.design_components.g.b {

    /* renamed from: a, reason: collision with root package name */
    private final String f19432a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bp(String str) {
        super(null);
        h.g.b.x.f(str, "adId");
        this.f19432a = str;
    }

    public final String a() {
        return this.f19432a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bp) && h.g.b.x.n(this.f19432a, ((bp) obj).f19432a);
    }

    public final int hashCode() {
        return this.f19432a.hashCode();
    }

    public final String toString() {
        return "ShowAd(adId=" + this.f19432a + ")";
    }
}
