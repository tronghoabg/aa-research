package com.waze.search;

import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ba extends ai {

    /* renamed from: a, reason: collision with root package name */
    private final List f35534a;

    /* JADX WARN: Illegal instructions before constructor call */
    public ba(List list) {
        h.g.b.x.f(list, "coordinates");
        byte[] bArr = null;
        super(bArr, bArr);
        this.f35534a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ba) && h.g.b.x.n(this.f35534a, ((ba) obj).f35534a);
    }

    public final int hashCode() {
        return this.f35534a.hashCode();
    }

    public final List p() {
        return this.f35534a;
    }

    public final String toString() {
        return "ViewRectangle(coordinates=" + this.f35534a + ")";
    }
}
