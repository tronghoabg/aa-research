package com.waze.car_lib.p;

import com.waze.gas.GasNativeManager;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class co {

    /* renamed from: a, reason: collision with root package name */
    private final String f20737a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f20738b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f20739c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f20740d;

    /* renamed from: e, reason: collision with root package name */
    private final h.g.a.a f20741e;

    public co(String str, boolean z, boolean z2, h.g.a.a aVar) {
        h.g.b.x.f(str, GasNativeManager.KEY_GAS_PRICE_UPDATE_TITLE);
        h.g.b.x.f(aVar, "onClick");
        this.f20737a = str;
        this.f20738b = z;
        this.f20739c = false;
        this.f20740d = z2;
        this.f20741e = aVar;
    }

    public static /* synthetic */ co e(co coVar, boolean z) {
        String str = coVar.f20737a;
        h.g.b.x.f(str, GasNativeManager.KEY_GAS_PRICE_UPDATE_TITLE);
        h.g.a.a aVar = coVar.f20741e;
        h.g.b.x.f(aVar, "onClick");
        return new co(str, coVar.f20738b, z, aVar);
    }

    public final String a() {
        return this.f20737a;
    }

    public final h.g.a.a b() {
        return this.f20741e;
    }

    public final boolean c() {
        return this.f20740d;
    }

    public final boolean d() {
        return this.f20738b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof co)) {
            return false;
        }
        co coVar = (co) obj;
        if (!h.g.b.x.n(this.f20737a, coVar.f20737a) || this.f20738b != coVar.f20738b) {
            return false;
        }
        boolean z = coVar.f20739c;
        return this.f20740d == coVar.f20740d && h.g.b.x.n(this.f20741e, coVar.f20741e);
    }

    public final int hashCode() {
        int iHashCode = this.f20737a.hashCode() * 31;
        h.g.a.a aVar = this.f20741e;
        return ((((((iHashCode + a.a.a(this.f20738b)) * 31) + a.a.a(false)) * 31) + a.a.a(this.f20740d)) * 31) + aVar.hashCode();
    }

    public final String toString() {
        return "ActionUiState(title=" + this.f20737a + ", isPrimary=" + this.f20738b + ", withTimer=false, isEnabled=" + this.f20740d + ", onClick=" + this.f20741e + ")";
    }

    public /* synthetic */ co(String str, boolean z, h.g.a.a aVar) {
        this(str, z, true, aVar);
    }
}
