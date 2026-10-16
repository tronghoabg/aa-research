package com.waze.car_lib.screens.b;

import com.waze.car_lib.r.cq;
import com.waze.gas.GasNativeManager;
import h.g.b.x;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class q extends cq {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f21857a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.ui.ac.n f21858b;

    /* renamed from: c, reason: collision with root package name */
    private final List f21859c;

    /* renamed from: d, reason: collision with root package name */
    private final int f21860d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f21861e;

    /* renamed from: f, reason: collision with root package name */
    private final h.g.a.l f21862f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f21863g;

    /* renamed from: h, reason: collision with root package name */
    private final int f21864h;

    public q(boolean z, com.waze.ui.ac.n nVar, List list, int i2, boolean z2, h.g.a.l lVar, boolean z3, int i3) {
        x.f(nVar, GasNativeManager.KEY_GAS_PRICE_UPDATE_TITLE);
        x.f(list, "routesInfo");
        x.f(lVar, "onSelected");
        this.f21857a = z;
        this.f21858b = nVar;
        this.f21859c = list;
        this.f21860d = i2;
        this.f21861e = z2;
        this.f21862f = lVar;
        this.f21863g = z3;
        this.f21864h = i3;
    }

    public static /* synthetic */ q i(q qVar, int i2, boolean z, int i3) {
        boolean z2 = (i3 & 1) != 0 ? qVar.f21857a : false;
        com.waze.ui.ac.n nVar = (i3 & 2) != 0 ? qVar.f21858b : null;
        List list = (i3 & 4) != 0 ? qVar.f21859c : null;
        if ((i3 & 8) != 0) {
            i2 = qVar.f21860d;
        }
        int i4 = i2;
        boolean z3 = (i3 & 16) != 0 ? qVar.f21861e : false;
        h.g.a.l lVar = (i3 & 32) != 0 ? qVar.f21862f : null;
        if ((i3 & 64) != 0) {
            z = qVar.f21863g;
        }
        int i5 = qVar.f21864h;
        x.f(nVar, GasNativeManager.KEY_GAS_PRICE_UPDATE_TITLE);
        x.f(list, "routesInfo");
        x.f(lVar, "onSelected");
        return new q(z2, nVar, list, i4, z3, lVar, z, i5);
    }

    public final int a() {
        return this.f21860d;
    }

    public final int b() {
        return this.f21864h;
    }

    public final com.waze.ui.ac.n c() {
        return this.f21858b;
    }

    public final List d() {
        return this.f21859c;
    }

    public final h.g.a.l e() {
        return this.f21862f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return this.f21857a == qVar.f21857a && x.n(this.f21858b, qVar.f21858b) && x.n(this.f21859c, qVar.f21859c) && this.f21860d == qVar.f21860d && this.f21861e == qVar.f21861e && x.n(this.f21862f, qVar.f21862f) && this.f21863g == qVar.f21863g && this.f21864h == qVar.f21864h;
    }

    public final boolean f() {
        return this.f21861e;
    }

    @Override // com.waze.car_lib.r.cq
    public final boolean g() {
        return this.f21857a;
    }

    public final boolean h() {
        return this.f21863g;
    }

    public final int hashCode() {
        int iA = (((a.a.a(this.f21857a) * 31) + this.f21858b.hashCode()) * 31) + this.f21859c.hashCode();
        h.g.a.l lVar = this.f21862f;
        return (((((((((iA * 31) + this.f21860d) * 31) + a.a.a(this.f21861e)) * 31) + lVar.hashCode()) * 31) + a.a.a(this.f21863g)) * 31) + this.f21864h;
    }

    public final String toString() {
        return "Loaded(isInPanMode=" + this.f21857a + ", title=" + this.f21858b + ", routesInfo=" + this.f21859c + ", selectedRouteIndex=" + this.f21860d + ", shouldDisplayInfoButton=" + this.f21861e + ", onSelected=" + this.f21862f + ", isTimerActive=" + this.f21863g + ", timerDurationSeconds=" + this.f21864h + ")";
    }
}
