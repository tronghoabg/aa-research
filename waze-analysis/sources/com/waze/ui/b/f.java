package com.waze.ui.b;

import androidx.compose.ui.unit.Dp;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private final float f42057a;

    /* renamed from: b, reason: collision with root package name */
    private final float f42058b;

    /* renamed from: c, reason: collision with root package name */
    private final float f42059c;

    public /* synthetic */ f(float f2, float f3, float f4) {
        this.f42057a = f2;
        this.f42058b = f3;
        this.f42059c = f4;
    }

    public final float a() {
        return this.f42059c;
    }

    public final float b() {
        return this.f42057a;
    }

    public final float c() {
        return this.f42058b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return Dp.m11169equalsimpl0(this.f42057a, fVar.f42057a) && Dp.m11169equalsimpl0(this.f42058b, fVar.f42058b) && Dp.m11169equalsimpl0(this.f42059c, fVar.f42059c);
    }

    public final int hashCode() {
        return (((Dp.m11170hashCodeimpl(this.f42057a) * 31) + Dp.m11170hashCodeimpl(this.f42058b)) * 31) + Dp.m11170hashCodeimpl(this.f42059c);
    }

    public final String toString() {
        float f2 = this.f42059c;
        float f3 = this.f42058b;
        return "AlternativeRoutesLayoutAnchors(expandedAnchor=" + Dp.m11175toStringimpl(this.f42057a) + ", poppedAnchor=" + Dp.m11175toStringimpl(f3) + ", collapsedAnchor=" + Dp.m11175toStringimpl(f2) + ")";
    }
}
