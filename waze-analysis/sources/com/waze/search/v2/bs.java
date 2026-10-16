package com.waze.search.v2;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class bs extends com.waze.speech.k {

    /* renamed from: a, reason: collision with root package name */
    private final int f36199a;

    public bs(int i2) {
        super(null);
        this.f36199a = i2;
    }

    public final int a() {
        return this.f36199a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bs) && this.f36199a == ((bs) obj).f36199a;
    }

    public final int hashCode() {
        return this.f36199a;
    }

    public final String toString() {
        return "UpdatePriceRangeFilter(selectedPriceRange=" + this.f36199a + ")";
    }
}
