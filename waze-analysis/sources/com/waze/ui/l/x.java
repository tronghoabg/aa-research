package com.waze.ui.l;

import com.waze.gas.GasNativeManager;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class x implements ad {

    /* renamed from: a, reason: collision with root package name */
    private final String f42737a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f42738b;

    public x(String str, boolean z) {
        h.g.b.x.f(str, GasNativeManager.KEY_GAS_PRICE_UPDATE_TITLE);
        this.f42737a = str;
        this.f42738b = z;
    }

    public final String a() {
        return this.f42737a;
    }

    @Override // com.waze.ui.l.ad
    public final boolean e() {
        return this.f42738b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return h.g.b.x.n(this.f42737a, xVar.f42737a) && this.f42738b == xVar.f42738b;
    }

    public final int hashCode() {
        return (this.f42737a.hashCode() * 31) + a.a.a(this.f42738b);
    }

    public final String toString() {
        return "Label(title=" + this.f42737a + ", visible=" + this.f42738b + ")";
    }
}
