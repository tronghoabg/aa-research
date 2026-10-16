package com.waze.car_lib.p;

import com.waze.gas.GasNativeManager;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ak {

    /* renamed from: a, reason: collision with root package name */
    private final String f20549a;

    /* renamed from: b, reason: collision with root package name */
    private final String f20550b;

    /* renamed from: c, reason: collision with root package name */
    private final af f20551c;

    /* renamed from: d, reason: collision with root package name */
    private final af f20552d;

    /* renamed from: e, reason: collision with root package name */
    private final Integer f20553e;

    /* renamed from: f, reason: collision with root package name */
    private final com.waze.n.aq f20554f;

    public /* synthetic */ ak(String str, String str2, com.waze.n.aq aqVar, af afVar, af afVar2, Integer num, int i2) {
        h.g.b.x.f(str, GasNativeManager.KEY_GAS_PRICE_UPDATE_TITLE);
        h.g.b.x.f(str2, "message");
        h.g.b.x.f(aqVar, "headerAction");
        this.f20549a = str;
        this.f20550b = str2;
        this.f20554f = aqVar;
        this.f20551c = (i2 & 8) != 0 ? null : afVar;
        this.f20552d = (i2 & 16) != 0 ? null : afVar2;
        this.f20553e = (i2 & 32) != 0 ? null : num;
    }

    public final af a() {
        return this.f20551c;
    }

    public final af b() {
        return this.f20552d;
    }

    public final Integer c() {
        return this.f20553e;
    }

    public final String d() {
        return this.f20550b;
    }

    public final String e() {
        return this.f20549a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ak)) {
            return false;
        }
        ak akVar = (ak) obj;
        return h.g.b.x.n(this.f20549a, akVar.f20549a) && h.g.b.x.n(this.f20550b, akVar.f20550b) && h.g.b.x.n(this.f20554f, akVar.f20554f) && h.g.b.x.n(this.f20551c, akVar.f20551c) && h.g.b.x.n(this.f20552d, akVar.f20552d) && h.g.b.x.n(this.f20553e, akVar.f20553e);
    }

    public final com.waze.n.aq f() {
        return this.f20554f;
    }

    public final int hashCode() {
        int iHashCode = (((this.f20549a.hashCode() * 31) + this.f20550b.hashCode()) * 31) + this.f20554f.hashCode();
        af afVar = this.f20551c;
        int iHashCode2 = ((iHashCode * 31) + (afVar == null ? 0 : afVar.hashCode())) * 31;
        af afVar2 = this.f20552d;
        int iHashCode3 = (iHashCode2 + (afVar2 == null ? 0 : afVar2.hashCode())) * 31;
        Integer num = this.f20553e;
        return iHashCode3 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return "UIState(title=" + this.f20549a + ", message=" + this.f20550b + ", headerAction=" + this.f20554f + ", firstAction=" + this.f20551c + ", secondAction=" + this.f20552d + ", closeIconResOverride=" + this.f20553e + ")";
    }
}
