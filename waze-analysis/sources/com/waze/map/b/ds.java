package com.waze.map.b;

import android.graphics.PointF;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class ds extends com.waze.destination_cell.b.e {

    /* renamed from: a, reason: collision with root package name */
    private final PointF f28222a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ds(PointF pointF) {
        super(null);
        h.g.b.x.f(pointF, "positionInViewport");
        this.f28222a = pointF;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ds) && h.g.b.x.n(this.f28222a, ((ds) obj).f28222a);
    }

    public final PointF h() {
        return this.f28222a;
    }

    public final int hashCode() {
        return this.f28222a.hashCode();
    }

    public final String toString() {
        return "Fraction(positionInViewport=" + this.f28222a + ")";
    }
}
