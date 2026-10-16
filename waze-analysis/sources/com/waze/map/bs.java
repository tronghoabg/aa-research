package com.waze.map;

import androidx.constraintlayout.core.motion.utils.TypedValues;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class bs {

    /* renamed from: a, reason: collision with root package name */
    private final int f28444a;

    /* renamed from: b, reason: collision with root package name */
    private final bv f28445b;

    /* renamed from: c, reason: collision with root package name */
    private final h.g.a.l f28446c;

    public bs(int i2, bv bvVar, h.g.a.l lVar) {
        h.g.b.x.f(bvVar, TypedValues.AttributesType.S_TARGET);
        h.g.b.x.f(lVar, "onPositionUpdated");
        this.f28444a = i2;
        this.f28445b = bvVar;
        this.f28446c = lVar;
    }

    public final int a() {
        return this.f28444a;
    }

    public final bv b() {
        return this.f28445b;
    }

    public final h.g.a.l c() {
        return this.f28446c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bs)) {
            return false;
        }
        bs bsVar = (bs) obj;
        return this.f28444a == bsVar.f28444a && h.g.b.x.n(this.f28445b, bsVar.f28445b) && h.g.b.x.n(this.f28446c, bsVar.f28446c);
    }

    public final int hashCode() {
        return (((this.f28444a * 31) + this.f28445b.hashCode()) * 31) + this.f28446c.hashCode();
    }

    public final String toString() {
        return "PositionTrackingRequest(id=" + this.f28444a + ", target=" + this.f28445b + ", onPositionUpdated=" + this.f28446c + ")";
    }
}
