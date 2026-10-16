package com.waze.ui.l;

import androidx.compose.ui.unit.Dp;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ag implements aj {

    /* renamed from: a, reason: collision with root package name */
    private final ad f42484a;

    /* renamed from: b, reason: collision with root package name */
    private final ad f42485b;

    /* renamed from: c, reason: collision with root package name */
    private final float f42486c;

    public /* synthetic */ ag(ad adVar, ad adVar2, float f2) {
        this.f42484a = adVar;
        this.f42485b = adVar2;
        this.f42486c = f2;
    }

    @Override // com.waze.ui.l.aj
    public final ad a() {
        return this.f42484a;
    }

    public final ad b() {
        return this.f42485b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ag)) {
            return false;
        }
        ag agVar = (ag) obj;
        return h.g.b.x.n(this.f42484a, agVar.f42484a) && h.g.b.x.n(this.f42485b, agVar.f42485b) && Dp.m11169equalsimpl0(this.f42486c, agVar.f42486c);
    }

    public final int hashCode() {
        int iHashCode = this.f42484a.hashCode() * 31;
        ad adVar = this.f42485b;
        return ((iHashCode + (adVar == null ? 0 : adVar.hashCode())) * 31) + Dp.m11170hashCodeimpl(this.f42486c);
    }

    public final String toString() {
        Class<?> cls;
        Class<?> cls2 = this.f42484a.getClass();
        String simpleName = null;
        String simpleName2 = cls2 != null ? cls2.getSimpleName() : null;
        ad adVar = this.f42485b;
        if (adVar != null && (cls = adVar.getClass()) != null) {
            simpleName = cls.getSimpleName();
        }
        return "AnimatingContentOut(cardState=" + simpleName2 + ",targetState=" + simpleName + ", height=" + Dp.m11175toStringimpl(this.f42486c) + ")";
    }
}
