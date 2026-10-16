package com.waze.av.b;

import androidx.autofill.HintConstants;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class j extends n {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.av.a.p f15960a;

    /* renamed from: b, reason: collision with root package name */
    private final String f15961b;

    /* renamed from: c, reason: collision with root package name */
    private final d f15962c;

    /* renamed from: d, reason: collision with root package name */
    private final String f15963d;

    /* renamed from: e, reason: collision with root package name */
    private final long f15964e;

    /* renamed from: f, reason: collision with root package name */
    private final long f15965f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f15966g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f15967h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f15968i;

    /* renamed from: j, reason: collision with root package name */
    private final boolean f15969j;

    /* renamed from: k, reason: collision with root package name */
    private final String f15970k;

    /* renamed from: l, reason: collision with root package name */
    private final String f15971l;
    private final com.waze.av.a.p m;
    private final int n;

    public j(com.waze.av.a.p pVar, String str, d dVar, String str2, long j2, long j3, boolean z, boolean z2, boolean z3, boolean z4, String str3, String str4, com.waze.av.a.p pVar2, int i2) {
        h.g.b.x.f(pVar, "wazeAddress");
        h.g.b.x.f(str, "eventId");
        h.g.b.x.f(dVar, "eventType");
        h.g.b.x.f(str2, HintConstants.AUTOFILL_HINT_NAME);
        this.f15960a = pVar;
        this.f15961b = str;
        this.f15962c = dVar;
        this.f15963d = str2;
        this.f15964e = j2;
        this.f15965f = j3;
        this.f15966g = z;
        this.f15967h = z2;
        this.f15968i = z3;
        this.f15969j = z4;
        this.f15970k = str3;
        this.f15971l = str4;
        this.m = pVar2;
        this.n = i2;
    }

    public static /* synthetic */ j o(j jVar, com.waze.av.a.p pVar) {
        String str = jVar.f15961b;
        d dVar = jVar.f15962c;
        String str2 = jVar.f15963d;
        long j2 = jVar.f15964e;
        long j3 = jVar.f15965f;
        boolean z = jVar.f15966g;
        boolean z2 = jVar.f15967h;
        boolean z3 = jVar.f15968i;
        boolean z4 = jVar.f15969j;
        String str3 = jVar.f15970k;
        String str4 = jVar.f15971l;
        com.waze.av.a.p pVar2 = jVar.m;
        int i2 = jVar.n;
        h.g.b.x.f(pVar, "wazeAddress");
        h.g.b.x.f(str, "eventId");
        h.g.b.x.f(dVar, "eventType");
        h.g.b.x.f(str2, HintConstants.AUTOFILL_HINT_NAME);
        return new j(pVar, str, dVar, str2, j2, j3, z, z2, z3, z4, str3, str4, pVar2, i2);
    }

    public final int a() {
        return this.n;
    }

    public final long b() {
        return this.f15965f;
    }

    public final long c() {
        return this.f15964e;
    }

    public final com.waze.av.a.p d() {
        return this.m;
    }

    @Override // com.waze.av.b.n
    public final com.waze.av.a.p e() {
        return this.f15960a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return h.g.b.x.n(this.f15960a, jVar.f15960a) && h.g.b.x.n(this.f15961b, jVar.f15961b) && this.f15962c == jVar.f15962c && h.g.b.x.n(this.f15963d, jVar.f15963d) && this.f15964e == jVar.f15964e && this.f15965f == jVar.f15965f && this.f15966g == jVar.f15966g && this.f15967h == jVar.f15967h && this.f15968i == jVar.f15968i && this.f15969j == jVar.f15969j && h.g.b.x.n(this.f15970k, jVar.f15970k) && h.g.b.x.n(this.f15971l, jVar.f15971l) && h.g.b.x.n(this.m, jVar.m) && this.n == jVar.n;
    }

    public final d f() {
        return this.f15962c;
    }

    public final String g() {
        return this.f15961b;
    }

    public final String h() {
        return this.f15971l;
    }

    public final int hashCode() {
        int iHashCode = (((((this.f15960a.hashCode() * 31) + this.f15961b.hashCode()) * 31) + this.f15962c.hashCode()) * 31) + this.f15963d.hashCode();
        String str = this.f15970k;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        long j2 = this.f15964e;
        long j3 = this.f15965f;
        boolean z = this.f15969j;
        boolean z2 = this.f15968i;
        int iB = ((((((((((((((iHashCode * 31) + a.a.b(j2)) * 31) + a.a.b(j3)) * 31) + a.a.a(this.f15966g)) * 31) + a.a.a(this.f15967h)) * 31) + a.a.a(z2)) * 31) + a.a.a(z)) * 31) + iHashCode2) * 31;
        String str2 = this.f15971l;
        int iHashCode3 = (iB + (str2 == null ? 0 : str2.hashCode())) * 31;
        com.waze.av.a.p pVar = this.m;
        return ((iHashCode3 + (pVar != null ? pVar.hashCode() : 0)) * 31) + this.n;
    }

    public final String i() {
        return this.f15963d;
    }

    public final String j() {
        return this.f15970k;
    }

    public final boolean k() {
        return this.f15966g;
    }

    public final boolean l() {
        return this.f15968i;
    }

    public final boolean m() {
        return this.f15969j;
    }

    public final boolean n() {
        return this.f15967h;
    }

    public final String toString() {
        return "EventPlace(wazeAddress=" + this.f15960a + ", eventId=" + this.f15961b + ", eventType=" + this.f15962c + ", name=" + this.f15963d + ", startTimeSec=" + this.f15964e + ", endTimeSec=" + this.f15965f + ", allDay=" + this.f15966g + ", validated=" + this.f15967h + ", recurring=" + this.f15968i + ", validateOnly=" + this.f15969j + ", refEventId=" + this.f15970k + ", imageUrl=" + this.f15971l + ", originPlace=" + this.m + ", internalId=" + this.n + ")";
    }

    public /* synthetic */ j(com.waze.av.a.p pVar, String str, d dVar, String str2, long j2, boolean z, int i2, int i3) {
        this(pVar, str, dVar, str2, j2, (i3 & 32) != 0 ? -1L : 0L, false, ((i3 & 128) == 0) & z, false, false, null, null, null, (i3 & 8192) != 0 ? -1 : i2);
    }
}
