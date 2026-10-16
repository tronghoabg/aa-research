package com.waze;

import com.waze.gas.GasNativeManager;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class jt extends ka {

    /* renamed from: a, reason: collision with root package name */
    private final String f24969a;

    /* renamed from: b, reason: collision with root package name */
    private final String f24970b;

    /* renamed from: c, reason: collision with root package name */
    private final String f24971c;

    /* renamed from: d, reason: collision with root package name */
    private final String f24972d;

    /* renamed from: e, reason: collision with root package name */
    private final String f24973e;

    /* renamed from: f, reason: collision with root package name */
    private final String f24974f;

    /* renamed from: g, reason: collision with root package name */
    private final String f24975g;

    /* renamed from: h, reason: collision with root package name */
    private final com.waze.modules.c.dj f24976h;

    /* renamed from: i, reason: collision with root package name */
    private final com.waze.modules.c.dj f24977i;

    /* renamed from: j, reason: collision with root package name */
    private final String f24978j;

    /* renamed from: k, reason: collision with root package name */
    private final String f24979k;

    /* renamed from: l, reason: collision with root package name */
    private final String f24980l;

    public jt(String str, String str2, String str3, String str4, String str5, String str6, String str7, com.waze.modules.c.dj djVar, com.waze.modules.c.dj djVar2, String str8, String str9, String str10) {
        h.g.b.x.f(str, GasNativeManager.KEY_GAS_PRICE_UPDATE_TITLE);
        h.g.b.x.f(str2, "subtitle");
        h.g.b.x.f(str3, "primaryActionButtonText");
        h.g.b.x.f(str4, "secondaryActionButtonText");
        h.g.b.x.f(str5, "imageUrl");
        h.g.b.x.f(str6, "inCarTitle");
        h.g.b.x.f(str7, "inCarSubtitle");
        h.g.b.x.f(djVar, "actions");
        h.g.b.x.f(djVar2, "inCarActions");
        h.g.b.x.f(str8, "inCarPrimaryActionButtonText");
        h.g.b.x.f(str9, "inCarSecondaryActionButtonText");
        this.f24969a = str;
        this.f24970b = str2;
        this.f24971c = str3;
        this.f24972d = str4;
        this.f24973e = str5;
        this.f24974f = str6;
        this.f24975g = str7;
        this.f24976h = djVar;
        this.f24977i = djVar2;
        this.f24978j = str8;
        this.f24979k = str9;
        this.f24980l = str10;
    }

    public final com.waze.modules.c.dj a() {
        return this.f24976h;
    }

    public final com.waze.modules.c.dj b() {
        return this.f24977i;
    }

    public final String c() {
        return this.f24980l;
    }

    public final String d() {
        return this.f24973e;
    }

    public final String e() {
        return this.f24978j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jt)) {
            return false;
        }
        jt jtVar = (jt) obj;
        return h.g.b.x.n(this.f24969a, jtVar.f24969a) && h.g.b.x.n(this.f24970b, jtVar.f24970b) && h.g.b.x.n(this.f24971c, jtVar.f24971c) && h.g.b.x.n(this.f24972d, jtVar.f24972d) && h.g.b.x.n(this.f24973e, jtVar.f24973e) && h.g.b.x.n(this.f24974f, jtVar.f24974f) && h.g.b.x.n(this.f24975g, jtVar.f24975g) && h.g.b.x.n(this.f24976h, jtVar.f24976h) && h.g.b.x.n(this.f24977i, jtVar.f24977i) && h.g.b.x.n(this.f24978j, jtVar.f24978j) && h.g.b.x.n(this.f24979k, jtVar.f24979k) && h.g.b.x.n(this.f24980l, jtVar.f24980l);
    }

    public final String f() {
        return this.f24979k;
    }

    public final String g() {
        return this.f24975g;
    }

    public final String h() {
        return this.f24974f;
    }

    public final int hashCode() {
        int iHashCode = (((((((((((((((((((this.f24969a.hashCode() * 31) + this.f24970b.hashCode()) * 31) + this.f24971c.hashCode()) * 31) + this.f24972d.hashCode()) * 31) + this.f24973e.hashCode()) * 31) + this.f24974f.hashCode()) * 31) + this.f24975g.hashCode()) * 31) + this.f24976h.hashCode()) * 31) + this.f24977i.hashCode()) * 31) + this.f24978j.hashCode()) * 31) + this.f24979k.hashCode();
        String str = this.f24980l;
        return (iHashCode * 31) + (str == null ? 0 : str.hashCode());
    }

    public final String i() {
        return this.f24971c;
    }

    public final String j() {
        return this.f24972d;
    }

    public final String k() {
        return this.f24970b;
    }

    public final String l() {
        return this.f24969a;
    }

    public final String toString() {
        return "RoutingPopup(title=" + this.f24969a + ", subtitle=" + this.f24970b + ", primaryActionButtonText=" + this.f24971c + ", secondaryActionButtonText=" + this.f24972d + ", imageUrl=" + this.f24973e + ", inCarTitle=" + this.f24974f + ", inCarSubtitle=" + this.f24975g + ", actions=" + this.f24976h + ", inCarActions=" + this.f24977i + ", inCarPrimaryActionButtonText=" + this.f24978j + ", inCarSecondaryActionButtonText=" + this.f24979k + ", checkboxText=" + this.f24980l + ")";
    }
}
