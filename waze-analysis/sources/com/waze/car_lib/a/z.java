package com.waze.car_lib.a;

import com.waze.gas.GasNativeManager;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class z extends com.waze.l.m {

    /* renamed from: a, reason: collision with root package name */
    private final String f18859a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.ui.ac.i f18860b;

    /* renamed from: c, reason: collision with root package name */
    private final Float f18861c;

    /* renamed from: d, reason: collision with root package name */
    private final h.o.a f18862d;

    /* renamed from: e, reason: collision with root package name */
    private final String f18863e;

    /* renamed from: f, reason: collision with root package name */
    private final com.waze.shared_infra.h.c f18864f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f18865g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f18866h;

    /* renamed from: i, reason: collision with root package name */
    private final com.waze.c.c.e f18867i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z(String str, com.waze.ui.ac.i iVar, com.waze.c.c.e eVar, Float f2, h.o.a aVar, String str2, com.waze.shared_infra.h.c cVar, boolean z, boolean z2) {
        super(null);
        h.g.b.x.f(str, GasNativeManager.KEY_GAS_PRICE_UPDATE_TITLE);
        this.f18859a = str;
        this.f18860b = iVar;
        this.f18867i = eVar;
        this.f18861c = f2;
        this.f18862d = aVar;
        this.f18863e = str2;
        this.f18864f = cVar;
        this.f18865g = z;
        this.f18866h = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return h.g.b.x.n(this.f18859a, zVar.f18859a) && h.g.b.x.n(this.f18860b, zVar.f18860b) && h.g.b.x.n(this.f18867i, zVar.f18867i) && h.g.b.x.n(this.f18861c, zVar.f18861c) && h.g.b.x.n(this.f18862d, zVar.f18862d) && h.g.b.x.n(this.f18863e, zVar.f18863e) && h.g.b.x.n(this.f18864f, zVar.f18864f) && this.f18865g == zVar.f18865g && this.f18866h == zVar.f18866h;
    }

    public final int hashCode() {
        int iHashCode = this.f18859a.hashCode() * 31;
        com.waze.ui.ac.i iVar = this.f18860b;
        int iHashCode2 = (iHashCode + (iVar == null ? 0 : iVar.hashCode())) * 31;
        com.waze.c.c.e eVar = this.f18867i;
        int iHashCode3 = (iHashCode2 + (eVar == null ? 0 : eVar.hashCode())) * 31;
        Float f2 = this.f18861c;
        int iHashCode4 = (iHashCode3 + (f2 == null ? 0 : f2.hashCode())) * 31;
        h.o.a aVar = this.f18862d;
        int iB = (iHashCode4 + (aVar == null ? 0 : a.a.b(aVar.w()))) * 31;
        String str = this.f18863e;
        int iHashCode5 = (iB + (str == null ? 0 : str.hashCode())) * 31;
        com.waze.shared_infra.h.c cVar = this.f18864f;
        return ((((iHashCode5 + (cVar != null ? cVar.hashCode() : 0)) * 31) + a.a.a(this.f18865g)) * 31) + a.a.a(this.f18866h);
    }

    public final Float n() {
        return this.f18861c;
    }

    public final String o() {
        return this.f18859a;
    }

    public final h.o.a p() {
        return this.f18862d;
    }

    public final boolean q() {
        return this.f18866h;
    }

    public final boolean r() {
        return this.f18865g;
    }

    public final com.waze.c.c.e s() {
        return this.f18867i;
    }

    public final String toString() {
        return "Loaded(title=" + this.f18859a + ", imageSource=" + this.f18860b + ", openStatus=" + this.f18867i + ", rating=" + this.f18861c + ", detourDuration=" + this.f18862d + ", aboutThisAdUrl=" + this.f18863e + ", coordinate=" + this.f18864f + ", isStopAdded=" + this.f18865g + ", isNavigating=" + this.f18866h + ")";
    }
}
