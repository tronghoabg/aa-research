package com.waze.car_lib.p;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ao {

    /* renamed from: a, reason: collision with root package name */
    private final int f20576a;

    /* renamed from: b, reason: collision with root package name */
    private final int f20577b;

    /* renamed from: c, reason: collision with root package name */
    private final int f20578c;

    /* renamed from: d, reason: collision with root package name */
    private final Integer f20579d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f20580e;

    /* renamed from: f, reason: collision with root package name */
    private final com.waze.bw.a.c.r f20581f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f20582g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f20583h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f20584i;

    public ao(int i2, int i3, int i4, Integer num, boolean z, com.waze.bw.a.c.r rVar, boolean z2, boolean z3, boolean z4) {
        this.f20576a = i2;
        this.f20577b = i3;
        this.f20578c = i4;
        this.f20579d = num;
        this.f20580e = z;
        this.f20581f = rVar;
        this.f20582g = z2;
        this.f20583h = z3;
        this.f20584i = z4;
    }

    public static /* synthetic */ ao e(ao aoVar, Integer num, boolean z, com.waze.bw.a.c.r rVar, boolean z2, boolean z3, boolean z4, int i2) {
        int i3 = (i2 & 1) != 0 ? aoVar.f20576a : 0;
        int i4 = (i2 & 2) != 0 ? aoVar.f20577b : 0;
        int i5 = (i2 & 4) != 0 ? aoVar.f20578c : 0;
        if ((i2 & 8) != 0) {
            num = aoVar.f20579d;
        }
        return new ao(i3, i4, i5, num, (i2 & 16) != 0 ? aoVar.f20580e : z, (i2 & 32) != 0 ? aoVar.f20581f : rVar, (i2 & 64) != 0 ? aoVar.f20582g : z2, (i2 & 128) != 0 ? aoVar.f20583h : z3, (i2 & 256) != 0 ? aoVar.f20584i : z4);
    }

    public final int a() {
        return this.f20578c;
    }

    public final com.waze.bw.a.c.r b() {
        return this.f20581f;
    }

    public final boolean c() {
        return this.f20583h;
    }

    public final boolean d() {
        return this.f20584i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ao)) {
            return false;
        }
        ao aoVar = (ao) obj;
        return this.f20576a == aoVar.f20576a && this.f20577b == aoVar.f20577b && this.f20578c == aoVar.f20578c && h.g.b.x.n(this.f20579d, aoVar.f20579d) && this.f20580e == aoVar.f20580e && h.g.b.x.n(this.f20581f, aoVar.f20581f) && this.f20582g == aoVar.f20582g && this.f20583h == aoVar.f20583h && this.f20584i == aoVar.f20584i;
    }

    public final int hashCode() {
        Integer num = this.f20579d;
        int iHashCode = num == null ? 0 : num.hashCode();
        int i2 = this.f20576a;
        int i3 = this.f20577b;
        int i4 = this.f20578c;
        boolean z = this.f20580e;
        com.waze.bw.a.c.r rVar = this.f20581f;
        return (((((((((((((((i2 * 31) + i3) * 31) + i4) * 31) + iHashCode) * 31) + a.a.a(z)) * 31) + (rVar != null ? rVar.hashCode() : 0)) * 31) + a.a.a(this.f20582g)) * 31) + a.a.a(this.f20583h)) * 31) + a.a.a(this.f20584i);
    }

    public final String toString() {
        return "UIState(settingsIconRes=" + this.f20576a + ", searchIconRes=" + this.f20577b + ", closeIconRes=" + this.f20578c + ", soundSettingsIconRes=" + this.f20579d + ", shouldShowOfflineIcon=" + this.f20580e + ", startStateState=" + this.f20581f + ", shutdownEnabled=" + this.f20582g + ", shouldShowCenterOnMe=" + this.f20583h + ", isInPanMode=" + this.f20584i + ")";
    }
}
