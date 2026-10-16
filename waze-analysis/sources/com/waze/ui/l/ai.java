package com.waze.ui.l;

import androidx.compose.ui.unit.Dp;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ai implements aj {

    /* renamed from: a, reason: collision with root package name */
    private final ad f42489a;

    /* renamed from: b, reason: collision with root package name */
    private final float f42490b;

    public /* synthetic */ ai(ad adVar, float f2) {
        this.f42489a = adVar;
        this.f42490b = f2;
    }

    @Override // com.waze.ui.l.aj
    public final ad a() {
        return this.f42489a;
    }

    public final float b() {
        return this.f42490b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ai)) {
            return false;
        }
        ai aiVar = (ai) obj;
        return h.g.b.x.n(this.f42489a, aiVar.f42489a) && Dp.m11169equalsimpl0(this.f42490b, aiVar.f42490b);
    }

    public final int hashCode() {
        ad adVar = this.f42489a;
        return ((adVar == null ? 0 : adVar.hashCode()) * 31) + Dp.m11170hashCodeimpl(this.f42490b);
    }

    public final String toString() {
        Class<?> cls;
        ad adVar = this.f42489a;
        String simpleName = null;
        if (adVar != null && (cls = adVar.getClass()) != null) {
            simpleName = cls.getSimpleName();
        }
        return "Idle(cardState=" + simpleName + ", height=" + Dp.m11175toStringimpl(this.f42490b) + ")";
    }
}
