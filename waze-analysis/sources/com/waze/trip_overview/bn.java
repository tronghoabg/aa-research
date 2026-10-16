package com.waze.trip_overview;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class bn extends com.waze.speech.k {

    /* renamed from: a, reason: collision with root package name */
    private final String f41097a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bn(String str) {
        super(null);
        h.g.b.x.f(str, "price");
        this.f41097a = str;
    }

    public final String a() {
        return this.f41097a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bn) && h.g.b.x.n(this.f41097a, ((bn) obj).f41097a);
    }

    public final int hashCode() {
        return this.f41097a.hashCode();
    }

    public final String toString() {
        return "HasPrice(price=" + this.f41097a + ")";
    }
}
