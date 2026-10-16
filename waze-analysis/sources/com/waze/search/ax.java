package com.waze.search;

import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ax extends ai {

    /* renamed from: a, reason: collision with root package name */
    private final List f35525a;

    /* JADX WARN: Illegal instructions before constructor call */
    public ax(List list) {
        h.g.b.x.f(list, "selectedPriceRanges");
        byte[] bArr = null;
        super(bArr, bArr);
        this.f35525a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ax) && h.g.b.x.n(this.f35525a, ((ax) obj).f35525a);
    }

    public final int hashCode() {
        return this.f35525a.hashCode();
    }

    public final List p() {
        return this.f35525a;
    }

    public final String toString() {
        return "Price(selectedPriceRanges=" + this.f35525a + ")";
    }
}
