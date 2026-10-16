package com.waze.car_lib.p;

import com.waze.gas.GasNativeManager;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class cs {

    /* renamed from: a, reason: collision with root package name */
    private final String f20744a;

    /* renamed from: b, reason: collision with root package name */
    private final String f20745b;

    /* renamed from: c, reason: collision with root package name */
    private final Integer f20746c;

    /* renamed from: d, reason: collision with root package name */
    private final h.g.a.a f20747d;

    /* renamed from: e, reason: collision with root package name */
    private final com.waze.car_lib.r.co f20748e;

    public cs(String str, com.waze.car_lib.r.co coVar, String str2, Integer num, h.g.a.a aVar) {
        h.g.b.x.f(str, GasNativeManager.KEY_GAS_PRICE_UPDATE_TITLE);
        h.g.b.x.f(aVar, "onItemClicked");
        this.f20744a = str;
        this.f20748e = coVar;
        this.f20745b = str2;
        this.f20746c = num;
        this.f20747d = aVar;
    }

    public final Integer a() {
        return this.f20746c;
    }

    public final String b() {
        return this.f20745b;
    }

    public final String c() {
        return this.f20744a;
    }

    public final h.g.a.a d() {
        return this.f20747d;
    }

    public final com.waze.car_lib.r.co e() {
        return this.f20748e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cs)) {
            return false;
        }
        cs csVar = (cs) obj;
        return h.g.b.x.n(this.f20744a, csVar.f20744a) && h.g.b.x.n(this.f20748e, csVar.f20748e) && h.g.b.x.n(this.f20745b, csVar.f20745b) && h.g.b.x.n(this.f20746c, csVar.f20746c) && h.g.b.x.n(this.f20747d, csVar.f20747d);
    }

    public final int hashCode() {
        int iHashCode = this.f20744a.hashCode() * 31;
        com.waze.car_lib.r.co coVar = this.f20748e;
        int iHashCode2 = (iHashCode + (coVar == null ? 0 : coVar.hashCode())) * 31;
        String str = this.f20745b;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.f20746c;
        return ((iHashCode3 + (num != null ? num.hashCode() : 0)) * 31) + this.f20747d.hashCode();
    }

    public final String toString() {
        return "Item(title=" + this.f20744a + ", icon=" + this.f20748e + ", address=" + this.f20745b + ", distanceMeters=" + this.f20746c + ", onItemClicked=" + this.f20747d + ")";
    }

    public /* synthetic */ cs(String str, com.waze.car_lib.r.co coVar, h.g.a.a aVar) {
        this(str, coVar, null, null, aVar);
    }
}
