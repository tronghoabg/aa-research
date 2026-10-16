package com.waze.map.b;

import android.graphics.Rect;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class dz extends ec {

    /* renamed from: a, reason: collision with root package name */
    private final Rect f28234a;

    /* renamed from: b, reason: collision with root package name */
    private final bs f28235b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dz(Rect rect, bs bsVar) {
        super(null);
        h.g.b.x.f(rect, "rect");
        h.g.b.x.f(bsVar, "paddingDp");
        this.f28234a = rect;
        this.f28235b = bsVar;
    }

    public final Rect a() {
        return this.f28234a;
    }

    @Override // com.waze.map.b.ec
    public final bs b() {
        return this.f28235b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dz)) {
            return false;
        }
        dz dzVar = (dz) obj;
        return h.g.b.x.n(this.f28234a, dzVar.f28234a) && h.g.b.x.n(this.f28235b, dzVar.f28235b);
    }

    public final int hashCode() {
        return (this.f28234a.hashCode() * 31) + this.f28235b.hashCode();
    }

    public final String toString() {
        return "Area(rect=" + this.f28234a + ", paddingDp=" + this.f28235b + ")";
    }

    public /* synthetic */ dz(Rect rect) {
        this(rect, bs.f28105a);
    }
}
