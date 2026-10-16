package com.waze.car_lib.c;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f19240a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f19241b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f19242c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f19243d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f19244e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f19245f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f19246g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f19247h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f19248i;

    /* renamed from: j, reason: collision with root package name */
    private final boolean f19249j;

    /* renamed from: k, reason: collision with root package name */
    private final boolean f19250k;

    public /* synthetic */ h(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, int i2) {
        this.f19240a = 1 == ((z ? 1 : 0) & ((i2 & 1) ^ 1));
        this.f19241b = ((i2 & 2) == 0) & z2;
        this.f19242c = ((i2 & 4) == 0) & z3;
        this.f19243d = ((i2 & 8) == 0) & z4;
        this.f19244e = false;
        this.f19245f = ((i2 & 32) == 0) & z5;
        this.f19246g = ((i2 & 64) == 0) & z6;
        this.f19247h = ((i2 & 128) == 0) & z7;
        this.f19248i = ((i2 & 256) == 0) & z8;
        this.f19249j = ((i2 & 512) == 0) & z9;
        this.f19250k = ((i2 & 1024) == 0) & z10;
    }

    public final boolean a() {
        return this.f19247h;
    }

    public final boolean b() {
        return this.f19242c;
    }

    public final boolean c() {
        return this.f19240a;
    }

    public final boolean d() {
        return this.f19246g;
    }

    public final boolean e() {
        return this.f19249j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (this.f19240a != hVar.f19240a || this.f19241b != hVar.f19241b || this.f19242c != hVar.f19242c || this.f19243d != hVar.f19243d) {
            return false;
        }
        boolean z = hVar.f19244e;
        return this.f19245f == hVar.f19245f && this.f19246g == hVar.f19246g && this.f19247h == hVar.f19247h && this.f19248i == hVar.f19248i && this.f19249j == hVar.f19249j && this.f19250k == hVar.f19250k;
    }

    public final boolean f() {
        return this.f19243d;
    }

    public final boolean g() {
        return this.f19245f;
    }

    public final boolean h() {
        return this.f19248i;
    }

    public final int hashCode() {
        int iA = a.a.a(this.f19240a);
        boolean z = this.f19250k;
        boolean z2 = this.f19249j;
        boolean z3 = this.f19248i;
        boolean z4 = this.f19247h;
        boolean z5 = this.f19246g;
        boolean z6 = this.f19245f;
        boolean z7 = this.f19243d;
        return (((((((((((((((((((iA * 31) + a.a.a(this.f19241b)) * 31) + a.a.a(this.f19242c)) * 31) + a.a.a(z7)) * 31) + a.a.a(false)) * 31) + a.a.a(z6)) * 31) + a.a.a(z5)) * 31) + a.a.a(z4)) * 31) + a.a.a(z3)) * 31) + a.a.a(z2)) * 31) + a.a.a(z);
    }

    public final boolean i() {
        return this.f19250k;
    }

    public final boolean j() {
        return this.f19241b;
    }

    public final String toString() {
        return "MapButtons(isHomeShown=" + this.f19240a + ", isWorkShown=" + this.f19241b + ", isFavoritesShown=" + this.f19242c + ", isSearchShown=" + this.f19243d + ", isVoiceAssistantShown=false, isSettingsShown=" + this.f19245f + ", isRecenterShown=" + this.f19246g + ", isAlternateRoutesShown=" + this.f19247h + ", isSoundsShown=" + this.f19248i + ", isReportShown=" + this.f19249j + ", isStopNavigationShown=" + this.f19250k + ")";
    }

    public h() {
        this(false, false, false, false, false, false, false, false, false, false, 2047);
    }
}
