package com.waze.modules.c;

import com.waze.gas.GasNativeManager;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class di {

    /* renamed from: a, reason: collision with root package name */
    private final String f30065a;

    /* renamed from: b, reason: collision with root package name */
    private final String f30066b;

    /* renamed from: c, reason: collision with root package name */
    private final String f30067c;

    /* renamed from: d, reason: collision with root package name */
    private final String f30068d;

    /* renamed from: e, reason: collision with root package name */
    private final String f30069e;

    /* renamed from: f, reason: collision with root package name */
    private final String f30070f;

    /* renamed from: g, reason: collision with root package name */
    private final String f30071g;

    /* renamed from: h, reason: collision with root package name */
    private final String f30072h;

    /* renamed from: i, reason: collision with root package name */
    private final dj f30073i;

    /* renamed from: j, reason: collision with root package name */
    private final dj f30074j;

    /* renamed from: k, reason: collision with root package name */
    private final String f30075k;

    /* renamed from: l, reason: collision with root package name */
    private final String f30076l;

    public di(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, dj djVar, dj djVar2, String str9, String str10) {
        h.g.b.x.f(str, GasNativeManager.KEY_GAS_PRICE_UPDATE_TITLE);
        h.g.b.x.f(str2, "inCarTitle");
        h.g.b.x.f(str3, "subtitle");
        h.g.b.x.f(str4, "inCarSubtitle");
        h.g.b.x.f(str5, "primaryButtonText");
        h.g.b.x.f(str6, "inCarPrimaryButtonText");
        h.g.b.x.f(str7, "secondaryButtonText");
        h.g.b.x.f(str8, "inCarSecondaryButtonText");
        h.g.b.x.f(djVar, "actions");
        h.g.b.x.f(djVar2, "inCarActions");
        h.g.b.x.f(str9, "imageUrl");
        h.g.b.x.f(str10, "checkboxText");
        this.f30065a = str;
        this.f30066b = str2;
        this.f30067c = str3;
        this.f30068d = str4;
        this.f30069e = str5;
        this.f30070f = str6;
        this.f30071g = str7;
        this.f30072h = str8;
        this.f30073i = djVar;
        this.f30074j = djVar2;
        this.f30075k = str9;
        this.f30076l = str10;
    }

    public final dj a() {
        return this.f30073i;
    }

    public final dj b() {
        return this.f30074j;
    }

    public final String c() {
        return this.f30076l;
    }

    public final String d() {
        return this.f30075k;
    }

    public final String e() {
        return this.f30070f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof di)) {
            return false;
        }
        di diVar = (di) obj;
        return h.g.b.x.n(this.f30065a, diVar.f30065a) && h.g.b.x.n(this.f30066b, diVar.f30066b) && h.g.b.x.n(this.f30067c, diVar.f30067c) && h.g.b.x.n(this.f30068d, diVar.f30068d) && h.g.b.x.n(this.f30069e, diVar.f30069e) && h.g.b.x.n(this.f30070f, diVar.f30070f) && h.g.b.x.n(this.f30071g, diVar.f30071g) && h.g.b.x.n(this.f30072h, diVar.f30072h) && h.g.b.x.n(this.f30073i, diVar.f30073i) && h.g.b.x.n(this.f30074j, diVar.f30074j) && h.g.b.x.n(this.f30075k, diVar.f30075k) && h.g.b.x.n(this.f30076l, diVar.f30076l);
    }

    public final String f() {
        return this.f30072h;
    }

    public final String g() {
        return this.f30068d;
    }

    public final String h() {
        return this.f30066b;
    }

    public final int hashCode() {
        return (((((((((((((((((((((this.f30065a.hashCode() * 31) + this.f30066b.hashCode()) * 31) + this.f30067c.hashCode()) * 31) + this.f30068d.hashCode()) * 31) + this.f30069e.hashCode()) * 31) + this.f30070f.hashCode()) * 31) + this.f30071g.hashCode()) * 31) + this.f30072h.hashCode()) * 31) + this.f30073i.hashCode()) * 31) + this.f30074j.hashCode()) * 31) + this.f30075k.hashCode()) * 31) + this.f30076l.hashCode();
    }

    public final String i() {
        return this.f30069e;
    }

    public final String j() {
        return this.f30071g;
    }

    public final String k() {
        return this.f30067c;
    }

    public final String l() {
        return this.f30065a;
    }

    public final String toString() {
        return "RoutingPopup(title=" + this.f30065a + ", inCarTitle=" + this.f30066b + ", subtitle=" + this.f30067c + ", inCarSubtitle=" + this.f30068d + ", primaryButtonText=" + this.f30069e + ", inCarPrimaryButtonText=" + this.f30070f + ", secondaryButtonText=" + this.f30071g + ", inCarSecondaryButtonText=" + this.f30072h + ", actions=" + this.f30073i + ", inCarActions=" + this.f30074j + ", imageUrl=" + this.f30075k + ", checkboxText=" + this.f30076l + ")";
    }
}
