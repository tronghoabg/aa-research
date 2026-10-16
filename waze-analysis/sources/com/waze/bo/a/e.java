package com.waze.bo.a;

import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f17168a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f17169b;

    /* renamed from: c, reason: collision with root package name */
    private final String f17170c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f17171d;

    /* renamed from: e, reason: collision with root package name */
    private final String f17172e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f17173f;

    /* renamed from: g, reason: collision with root package name */
    private final String f17174g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f17175h;

    public e(boolean z, boolean z2, String str, boolean z3, String str2, boolean z4, String str3, boolean z5) {
        x.f(str, "tollAndHowPassesValue");
        x.f(str2, "trialsValue");
        x.f(str3, "vehicleType");
        this.f17168a = z;
        this.f17169b = z2;
        this.f17170c = str;
        this.f17171d = z3;
        this.f17172e = str2;
        this.f17173f = z4;
        this.f17174g = str3;
        this.f17175h = z5;
    }

    public final String a() {
        return this.f17174g;
    }

    public final boolean b() {
        return this.f17169b;
    }

    public final boolean c() {
        return this.f17168a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f17168a == eVar.f17168a && this.f17169b == eVar.f17169b && x.n(this.f17170c, eVar.f17170c) && this.f17171d == eVar.f17171d && x.n(this.f17172e, eVar.f17172e) && this.f17173f == eVar.f17173f && x.n(this.f17174g, eVar.f17174g) && this.f17175h == eVar.f17175h;
    }

    public final int hashCode() {
        return (((((((((((((a.a.a(this.f17168a) * 31) + a.a.a(this.f17169b)) * 31) + this.f17170c.hashCode()) * 31) + a.a.a(this.f17171d)) * 31) + this.f17172e.hashCode()) * 31) + a.a.a(this.f17173f)) * 31) + this.f17174g.hashCode()) * 31) + a.a.a(this.f17175h);
    }

    public final String toString() {
        return "RouteSettingsState(isAvoidTolls=" + this.f17168a + ", isAvoidFerries=" + this.f17169b + ", tollAndHowPassesValue=" + this.f17170c + ", isAvoidFreeways=" + this.f17171d + ", trialsValue=" + this.f17172e + ", isAvoidDangerousTurns=" + this.f17173f + ", vehicleType=" + this.f17174g + ", isAvoidDangerousAreas=" + this.f17175h + ")";
    }
}
