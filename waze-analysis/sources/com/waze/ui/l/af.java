package com.waze.ui.l;

import androidx.compose.ui.unit.Dp;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class af implements aj {

    /* renamed from: a, reason: collision with root package name */
    private final ad f42482a;

    /* renamed from: b, reason: collision with root package name */
    private final float f42483b;

    public /* synthetic */ af(ad adVar, float f2) {
        this.f42482a = adVar;
        this.f42483b = f2;
    }

    @Override // com.waze.ui.l.aj
    public final ad a() {
        return this.f42482a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof af)) {
            return false;
        }
        af afVar = (af) obj;
        return h.g.b.x.n(this.f42482a, afVar.f42482a) && Dp.m11169equalsimpl0(this.f42483b, afVar.f42483b);
    }

    public final int hashCode() {
        return (this.f42482a.hashCode() * 31) + Dp.m11170hashCodeimpl(this.f42483b);
    }

    public final String toString() {
        Class<?> cls = this.f42482a.getClass();
        return "AnimatingContentIn(cardState=" + (cls != null ? cls.getSimpleName() : null) + ", height=" + Dp.m11175toStringimpl(this.f42483b) + ")";
    }
}
