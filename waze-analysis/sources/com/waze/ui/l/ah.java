package com.waze.ui.l;

import androidx.compose.ui.unit.Dp;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ah implements aj {

    /* renamed from: a, reason: collision with root package name */
    private final ad f42487a;

    /* renamed from: b, reason: collision with root package name */
    private final float f42488b;

    public /* synthetic */ ah(ad adVar, float f2) {
        this.f42487a = adVar;
        this.f42488b = f2;
    }

    @Override // com.waze.ui.l.aj
    public final ad a() {
        return this.f42487a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ah)) {
            return false;
        }
        ah ahVar = (ah) obj;
        return h.g.b.x.n(this.f42487a, ahVar.f42487a) && Dp.m11169equalsimpl0(this.f42488b, ahVar.f42488b);
    }

    public final int hashCode() {
        ad adVar = this.f42487a;
        return ((adVar == null ? 0 : adVar.hashCode()) * 31) + Dp.m11170hashCodeimpl(this.f42488b);
    }

    public final String toString() {
        Class<?> cls;
        ad adVar = this.f42487a;
        String simpleName = null;
        if (adVar != null && (cls = adVar.getClass()) != null) {
            simpleName = cls.getSimpleName();
        }
        return "AnimatingSize(cardState=" + simpleName + ", height=" + Dp.m11175toStringimpl(this.f42488b) + ")";
    }
}
