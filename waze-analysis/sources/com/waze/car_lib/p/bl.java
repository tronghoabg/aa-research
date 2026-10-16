package com.waze.car_lib.p;

import com.waze.gas.GasNativeManager;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class bl extends com.waze.car_lib.screens.bx {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.ui.ac.n f20638a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.ui.ac.n f20639b;

    /* renamed from: c, reason: collision with root package name */
    private final List f20640c;

    /* renamed from: d, reason: collision with root package name */
    private final int f20641d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f20642e;

    /* renamed from: f, reason: collision with root package name */
    private final h.g.a.l f20643f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f20644g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bl(com.waze.ui.ac.n nVar, com.waze.ui.ac.n nVar2, List list, int i2, boolean z, h.g.a.l lVar, boolean z2) {
        super(null);
        h.g.b.x.f(nVar, GasNativeManager.KEY_GAS_PRICE_UPDATE_TITLE);
        h.g.b.x.f(nVar2, "startNavigationButtonTitle");
        h.g.b.x.f(list, "routes");
        h.g.b.x.f(lVar, "onSelected");
        this.f20638a = nVar;
        this.f20639b = nVar2;
        this.f20640c = list;
        this.f20641d = i2;
        this.f20642e = z;
        this.f20643f = lVar;
        this.f20644g = z2;
    }

    public static /* synthetic */ bl q(bl blVar, boolean z) {
        com.waze.ui.ac.n nVar = blVar.f20638a;
        com.waze.ui.ac.n nVar2 = blVar.f20639b;
        List list = blVar.f20640c;
        int i2 = blVar.f20641d;
        boolean z2 = blVar.f20642e;
        h.g.a.l lVar = blVar.f20643f;
        h.g.b.x.f(nVar, GasNativeManager.KEY_GAS_PRICE_UPDATE_TITLE);
        h.g.b.x.f(nVar2, "startNavigationButtonTitle");
        h.g.b.x.f(list, "routes");
        h.g.b.x.f(lVar, "onSelected");
        return new bl(nVar, nVar2, list, i2, z2, lVar, z);
    }

    public final int a() {
        return this.f20641d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bl)) {
            return false;
        }
        bl blVar = (bl) obj;
        return h.g.b.x.n(this.f20638a, blVar.f20638a) && h.g.b.x.n(this.f20639b, blVar.f20639b) && h.g.b.x.n(this.f20640c, blVar.f20640c) && this.f20641d == blVar.f20641d && this.f20642e == blVar.f20642e && h.g.b.x.n(this.f20643f, blVar.f20643f) && this.f20644g == blVar.f20644g;
    }

    public final int hashCode() {
        int iHashCode = (((this.f20638a.hashCode() * 31) + this.f20639b.hashCode()) * 31) + this.f20640c.hashCode();
        h.g.a.l lVar = this.f20643f;
        return (((((((iHashCode * 31) + this.f20641d) * 31) + a.a.a(this.f20642e)) * 31) + lVar.hashCode()) * 31) + a.a.a(this.f20644g);
    }

    @Override // com.waze.car_lib.screens.bx
    public final boolean j() {
        return this.f20644g;
    }

    public final com.waze.ui.ac.n l() {
        return this.f20639b;
    }

    public final com.waze.ui.ac.n m() {
        return this.f20638a;
    }

    public final List n() {
        return this.f20640c;
    }

    public final h.g.a.l o() {
        return this.f20643f;
    }

    public final boolean p() {
        return this.f20642e;
    }

    public final String toString() {
        return "Loaded(title=" + this.f20638a + ", startNavigationButtonTitle=" + this.f20639b + ", routes=" + this.f20640c + ", selectedRouteIndex=" + this.f20641d + ", shouldDisplayTollInfo=" + this.f20642e + ", onSelected=" + this.f20643f + ", isInPanMode=" + this.f20644g + ")";
    }
}
