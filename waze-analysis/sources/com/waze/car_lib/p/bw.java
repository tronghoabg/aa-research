package com.waze.car_lib.p;

import androidx.car.app.model.CarIcon;
import androidx.car.app.model.OnClickListener;
import com.waze.gas.GasNativeManager;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class bw {

    /* renamed from: a, reason: collision with root package name */
    private final String f20665a;

    /* renamed from: b, reason: collision with root package name */
    private final CarIcon f20666b;

    /* renamed from: c, reason: collision with root package name */
    private final Integer f20667c;

    /* renamed from: d, reason: collision with root package name */
    private final String f20668d;

    /* renamed from: e, reason: collision with root package name */
    private final bv f20669e;

    /* renamed from: f, reason: collision with root package name */
    private final bx f20670f;

    /* renamed from: g, reason: collision with root package name */
    private final Integer f20671g;

    /* renamed from: h, reason: collision with root package name */
    private final Integer f20672h;

    /* renamed from: i, reason: collision with root package name */
    private final Integer f20673i;

    /* renamed from: j, reason: collision with root package name */
    private final Double f20674j;

    /* renamed from: k, reason: collision with root package name */
    private final com.waze.bc.a.a f20675k;

    /* renamed from: l, reason: collision with root package name */
    private final OnClickListener f20676l;
    private final String m;
    private final com.waze.car_lib.n.v n;
    private final com.waze.car_lib.r.bq o;

    public bw(String str, CarIcon carIcon, Integer num, String str2, bv bvVar, bx bxVar, Integer num2, Integer num3, Integer num4, com.waze.car_lib.r.bq bqVar, Double d2, com.waze.bc.a.a aVar, OnClickListener onClickListener, String str3, com.waze.car_lib.n.v vVar) {
        h.g.b.x.f(str, GasNativeManager.KEY_GAS_PRICE_UPDATE_TITLE);
        h.g.b.x.f(carIcon, "icon");
        h.g.b.x.f(str2, "address");
        h.g.b.x.f(onClickListener, "onClick");
        h.g.b.x.f(str3, "venueId");
        h.g.b.x.f(vVar, "query");
        this.f20665a = str;
        this.f20666b = carIcon;
        this.f20667c = num;
        this.f20668d = str2;
        this.f20669e = bvVar;
        this.f20670f = bxVar;
        this.f20671g = num2;
        this.f20672h = num3;
        this.f20673i = num4;
        this.o = bqVar;
        this.f20674j = d2;
        this.f20675k = aVar;
        this.f20676l = onClickListener;
        this.m = str3;
        this.n = vVar;
    }

    public final CarIcon a() {
        return this.f20666b;
    }

    public final OnClickListener b() {
        return this.f20676l;
    }

    public final com.waze.car_lib.n.v c() {
        return this.n;
    }

    public final bv d() {
        return this.f20669e;
    }

    public final bx e() {
        return this.f20670f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bw)) {
            return false;
        }
        bw bwVar = (bw) obj;
        return h.g.b.x.n(this.f20665a, bwVar.f20665a) && h.g.b.x.n(this.f20666b, bwVar.f20666b) && h.g.b.x.n(this.f20667c, bwVar.f20667c) && h.g.b.x.n(this.f20668d, bwVar.f20668d) && h.g.b.x.n(this.f20669e, bwVar.f20669e) && h.g.b.x.n(this.f20670f, bwVar.f20670f) && h.g.b.x.n(this.f20671g, bwVar.f20671g) && h.g.b.x.n(this.f20672h, bwVar.f20672h) && h.g.b.x.n(this.f20673i, bwVar.f20673i) && h.g.b.x.n(this.o, bwVar.o) && h.g.b.x.n(this.f20674j, bwVar.f20674j) && h.g.b.x.n(this.f20675k, bwVar.f20675k) && h.g.b.x.n(this.f20676l, bwVar.f20676l) && h.g.b.x.n(this.m, bwVar.m) && h.g.b.x.n(this.n, bwVar.n);
    }

    public final com.waze.bc.a.a f() {
        return this.f20675k;
    }

    public final Double g() {
        return this.f20674j;
    }

    public final Integer h() {
        return this.f20667c;
    }

    public final int hashCode() {
        int iHashCode = (this.f20665a.hashCode() * 31) + this.f20666b.hashCode();
        Integer num = this.f20667c;
        int iHashCode2 = ((((iHashCode * 31) + (num == null ? 0 : num.hashCode())) * 31) + this.f20668d.hashCode()) * 31;
        bv bvVar = this.f20669e;
        int iHashCode3 = (iHashCode2 + (bvVar == null ? 0 : bvVar.hashCode())) * 31;
        bx bxVar = this.f20670f;
        int iHashCode4 = (iHashCode3 + (bxVar == null ? 0 : bxVar.hashCode())) * 31;
        Integer num2 = this.f20671g;
        int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f20672h;
        int iHashCode6 = (iHashCode5 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.f20673i;
        int iHashCode7 = (iHashCode6 + (num4 == null ? 0 : num4.hashCode())) * 31;
        com.waze.car_lib.r.bq bqVar = this.o;
        int iHashCode8 = (iHashCode7 + (bqVar == null ? 0 : bqVar.hashCode())) * 31;
        Double d2 = this.f20674j;
        int iHashCode9 = (iHashCode8 + (d2 == null ? 0 : d2.hashCode())) * 31;
        com.waze.bc.a.a aVar = this.f20675k;
        return ((((((iHashCode9 + (aVar != null ? aVar.hashCode() : 0)) * 31) + this.f20676l.hashCode()) * 31) + this.m.hashCode()) * 31) + this.n.hashCode();
    }

    public final Integer i() {
        return this.f20671g;
    }

    public final Integer j() {
        return this.f20673i;
    }

    public final Integer k() {
        return this.f20672h;
    }

    public final String l() {
        return this.f20668d;
    }

    public final String m() {
        return this.f20665a;
    }

    public final String n() {
        return this.m;
    }

    public final com.waze.car_lib.r.bq o() {
        return this.o;
    }

    public final String toString() {
        return "Item(title=" + this.f20665a + ", icon=" + this.f20666b + ", distanceMeters=" + this.f20667c + ", address=" + this.f20668d + ", gasPrice=" + this.f20669e + ", parkingPrice=" + this.f20670f + ", minutesOffRoute=" + this.f20671g + ", walkingMinutes=" + this.f20672h + ", walkingMeters=" + this.f20673i + ", evData=" + this.o + ", rating=" + this.f20674j + ", openStatus=" + this.f20675k + ", onClick=" + this.f20676l + ", venueId=" + this.m + ", query=" + this.n + ")";
    }
}
