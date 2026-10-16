package com.waze.car_lib.p;

import com.waze.R;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class an {

    /* renamed from: a, reason: collision with root package name */
    private final int f20564a;

    /* renamed from: b, reason: collision with root package name */
    private final int f20565b;

    /* renamed from: c, reason: collision with root package name */
    private final int f20566c;

    /* renamed from: d, reason: collision with root package name */
    private final int f20567d;

    /* renamed from: e, reason: collision with root package name */
    private final int f20568e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f20569f;

    /* renamed from: g, reason: collision with root package name */
    private final com.waze.car_lib.r.ca f20570g;

    /* renamed from: h, reason: collision with root package name */
    private final com.waze.car_lib.r.cf f20571h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f20572i;

    /* renamed from: j, reason: collision with root package name */
    private final boolean f20573j;

    /* renamed from: k, reason: collision with root package name */
    private final boolean f20574k;

    /* renamed from: l, reason: collision with root package name */
    private final boolean f20575l;
    private final String m;
    private final boolean n;

    public an(int i2, boolean z, com.waze.car_lib.r.ca caVar, com.waze.car_lib.r.cf cfVar, boolean z2, boolean z3, boolean z4, boolean z5, String str, boolean z6) {
        h.g.b.x.f(caVar, "etaState");
        h.g.b.x.f(cfVar, "instructionsState");
        this.f20564a = R.drawable.icon_outline_close_30px;
        this.f20565b = R.drawable.icon_outline_settings_30px;
        this.f20566c = R.drawable.icon_outline_routes_30px;
        this.f20567d = i2;
        this.f20568e = R.drawable.icon_outline_search_30px;
        this.f20569f = z;
        this.f20570g = caVar;
        this.f20571h = cfVar;
        this.f20572i = z2;
        this.f20573j = z3;
        this.f20574k = z4;
        this.f20575l = z5;
        this.m = str;
        this.n = z6;
    }

    public final int a() {
        return this.f20567d;
    }

    public final com.waze.car_lib.r.ca b() {
        return this.f20570g;
    }

    public final com.waze.car_lib.r.cf c() {
        return this.f20571h;
    }

    public final String d() {
        return this.m;
    }

    public final boolean e() {
        return this.f20569f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof an)) {
            return false;
        }
        an anVar = (an) obj;
        int i2 = anVar.f20564a;
        int i3 = anVar.f20565b;
        int i4 = anVar.f20566c;
        if (this.f20567d != anVar.f20567d) {
            return false;
        }
        int i5 = anVar.f20568e;
        return this.f20569f == anVar.f20569f && h.g.b.x.n(this.f20570g, anVar.f20570g) && h.g.b.x.n(this.f20571h, anVar.f20571h) && this.f20572i == anVar.f20572i && this.f20573j == anVar.f20573j && this.f20574k == anVar.f20574k && this.f20575l == anVar.f20575l && h.g.b.x.n(this.m, anVar.m) && this.n == anVar.n;
    }

    public final boolean f() {
        return this.f20574k;
    }

    public final boolean g() {
        return this.f20572i;
    }

    public final boolean h() {
        return this.f20573j;
    }

    public final int hashCode() {
        int iA = ((((((((this.f20567d + 83389474) * 31) + R.drawable.icon_outline_search_30px) * 31) + a.a.a(this.f20569f)) * 31) + this.f20570g.hashCode()) * 31) + this.f20571h.hashCode();
        String str = this.m;
        int iHashCode = str == null ? 0 : str.hashCode();
        boolean z = this.f20575l;
        return (((((((((((iA * 31) + a.a.a(this.f20572i)) * 31) + a.a.a(this.f20573j)) * 31) + a.a.a(this.f20574k)) * 31) + a.a.a(z)) * 31) + iHashCode) * 31) + a.a.a(this.n);
    }

    public final boolean i() {
        return this.n;
    }

    public final boolean j() {
        return this.f20575l;
    }

    public final String toString() {
        return "UIState(stopNavIconRes=2131231810, settingsIconRes=2131231839, alternateRoutesIconRes=2131231835, soundSettingsIconRes=" + this.f20567d + ", searchIconRes=2131231838, shouldShowOfflineIcon=" + this.f20569f + ", etaState=" + this.f20570g + ", instructionsState=" + this.f20571h + ", showCenterOnMe=" + this.f20572i + ", showSearchButton=" + this.f20573j + ", showActions=" + this.f20574k + ", isInPanMode=" + this.f20575l + ", etaInfoString=" + this.m + ", isCompaninioEnabled=" + this.n + ")";
    }
}
