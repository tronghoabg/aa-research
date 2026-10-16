package com.waze.search;

import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class au extends ai {

    /* renamed from: a, reason: collision with root package name */
    private final List f35522a;

    /* JADX WARN: Illegal instructions before constructor call */
    public au(List list) {
        h.g.b.x.f(list, "amenities");
        byte[] bArr = null;
        super(bArr, bArr);
        this.f35522a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof au) && h.g.b.x.n(this.f35522a, ((au) obj).f35522a);
    }

    public final int hashCode() {
        return this.f35522a.hashCode();
    }

    public final List p() {
        return this.f35522a;
    }

    public final String toString() {
        return "HasAmenities(amenities=" + this.f35522a + ")";
    }
}
