package com.waze.av.b;

import androidx.autofill.HintConstants;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class k extends n {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.av.a.p f15972a;

    /* renamed from: b, reason: collision with root package name */
    private final String f15973b;

    /* renamed from: c, reason: collision with root package name */
    private final i f15974c;

    /* renamed from: d, reason: collision with root package name */
    private final long f15975d;

    /* renamed from: e, reason: collision with root package name */
    private final long f15976e;

    /* renamed from: f, reason: collision with root package name */
    private final int f15977f;

    /* renamed from: g, reason: collision with root package name */
    private final Integer f15978g;

    /* renamed from: h, reason: collision with root package name */
    private final int f15979h;

    public k(com.waze.av.a.p pVar, String str, i iVar, long j2, long j3, int i2, Integer num, int i3) {
        h.g.b.x.f(pVar, "wazeAddress");
        h.g.b.x.f(str, HintConstants.AUTOFILL_HINT_NAME);
        h.g.b.x.f(iVar, "favoritePlaceType");
        this.f15972a = pVar;
        this.f15973b = str;
        this.f15974c = iVar;
        this.f15975d = j2;
        this.f15976e = j3;
        this.f15977f = i2;
        this.f15978g = num;
        this.f15979h = i3;
    }

    public static /* synthetic */ k i(k kVar, com.waze.av.a.p pVar) {
        String str = kVar.f15973b;
        i iVar = kVar.f15974c;
        long j2 = kVar.f15975d;
        long j3 = kVar.f15976e;
        int i2 = kVar.f15977f;
        Integer num = kVar.f15978g;
        int i3 = kVar.f15979h;
        h.g.b.x.f(pVar, "wazeAddress");
        h.g.b.x.f(str, HintConstants.AUTOFILL_HINT_NAME);
        h.g.b.x.f(iVar, "favoritePlaceType");
        return new k(pVar, str, iVar, j2, j3, i2, num, i3);
    }

    public final int a() {
        return this.f15977f;
    }

    public final int b() {
        return this.f15979h;
    }

    public final long c() {
        return this.f15975d;
    }

    public final long d() {
        return this.f15976e;
    }

    @Override // com.waze.av.b.n
    public final com.waze.av.a.p e() {
        return this.f15972a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return h.g.b.x.n(this.f15972a, kVar.f15972a) && h.g.b.x.n(this.f15973b, kVar.f15973b) && this.f15974c == kVar.f15974c && this.f15975d == kVar.f15975d && this.f15976e == kVar.f15976e && this.f15977f == kVar.f15977f && h.g.b.x.n(this.f15978g, kVar.f15978g) && this.f15979h == kVar.f15979h;
    }

    public final i f() {
        return this.f15974c;
    }

    public final Integer g() {
        return this.f15978g;
    }

    public final String h() {
        return this.f15973b;
    }

    public final int hashCode() {
        int iHashCode = (((this.f15972a.hashCode() * 31) + this.f15973b.hashCode()) * 31) + this.f15974c.hashCode();
        Integer num = this.f15978g;
        return (((((((((iHashCode * 31) + a.a.b(this.f15975d)) * 31) + a.a.b(this.f15976e)) * 31) + this.f15977f) * 31) + (num == null ? 0 : num.hashCode())) * 31) + this.f15979h;
    }

    public final String toString() {
        return "FavoritePlace(wazeAddress=" + this.f15972a + ", name=" + this.f15973b + ", favoritePlaceType=" + this.f15974c + ", accessTimeSec=" + this.f15975d + ", serverId=" + this.f15976e + ", favoriteId=" + this.f15977f + ", recentId=" + this.f15978g + ", rank=" + this.f15979h + ")";
    }

    public /* synthetic */ k(com.waze.av.a.p pVar, String str, i iVar, long j2, long j3, int i2, int i3, int i4) {
        this(pVar, str, iVar, (i4 & 8) != 0 ? 0L : j2, (i4 & 16) != 0 ? 0L : j3, (i4 & 32) != 0 ? -1 : i2, (Integer) null, (i4 & 128) != 0 ? 0 : i3);
    }
}
