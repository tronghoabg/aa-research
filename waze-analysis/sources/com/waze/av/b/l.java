package com.waze.av.b;

import androidx.autofill.HintConstants;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class l extends n {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.av.a.p f15980a;

    /* renamed from: b, reason: collision with root package name */
    private final z f15981b;

    /* renamed from: c, reason: collision with root package name */
    private final String f15982c;

    /* renamed from: d, reason: collision with root package name */
    private final String f15983d;

    /* renamed from: e, reason: collision with root package name */
    private final long f15984e;

    /* renamed from: f, reason: collision with root package name */
    private final int f15985f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f15986g;

    public l(com.waze.av.a.p pVar, z zVar, String str, String str2, long j2, int i2, boolean z) {
        h.g.b.x.f(pVar, "wazeAddress");
        h.g.b.x.f(zVar, "recentPlaceType");
        h.g.b.x.f(str, HintConstants.AUTOFILL_HINT_NAME);
        h.g.b.x.f(str2, "imageId");
        this.f15980a = pVar;
        this.f15981b = zVar;
        this.f15982c = str;
        this.f15983d = str2;
        this.f15984e = j2;
        this.f15985f = i2;
        this.f15986g = z;
    }

    public static /* synthetic */ l h(l lVar, com.waze.av.a.p pVar) {
        z zVar = lVar.f15981b;
        String str = lVar.f15982c;
        String str2 = lVar.f15983d;
        long j2 = lVar.f15984e;
        int i2 = lVar.f15985f;
        boolean z = lVar.f15986g;
        h.g.b.x.f(pVar, "wazeAddress");
        h.g.b.x.f(zVar, "recentPlaceType");
        h.g.b.x.f(str, HintConstants.AUTOFILL_HINT_NAME);
        h.g.b.x.f(str2, "imageId");
        return new l(pVar, zVar, str, str2, j2, i2, z);
    }

    public final int a() {
        return this.f15985f;
    }

    public final long b() {
        return this.f15984e;
    }

    public final z c() {
        return this.f15981b;
    }

    public final String d() {
        return this.f15983d;
    }

    @Override // com.waze.av.b.n
    public final com.waze.av.a.p e() {
        return this.f15980a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return h.g.b.x.n(this.f15980a, lVar.f15980a) && this.f15981b == lVar.f15981b && h.g.b.x.n(this.f15982c, lVar.f15982c) && h.g.b.x.n(this.f15983d, lVar.f15983d) && this.f15984e == lVar.f15984e && this.f15985f == lVar.f15985f && this.f15986g == lVar.f15986g;
    }

    public final String f() {
        return this.f15982c;
    }

    public final boolean g() {
        return this.f15986g;
    }

    public final int hashCode() {
        return (((((((((((this.f15980a.hashCode() * 31) + this.f15981b.hashCode()) * 31) + this.f15982c.hashCode()) * 31) + this.f15983d.hashCode()) * 31) + a.a.b(this.f15984e)) * 31) + this.f15985f) * 31) + a.a.a(this.f15986g);
    }

    public final String toString() {
        return "RecentPlace(wazeAddress=" + this.f15980a + ", recentPlaceType=" + this.f15981b + ", name=" + this.f15982c + ", imageId=" + this.f15983d + ", accessTimeSec=" + this.f15984e + ", recentId=" + this.f15985f + ", shouldConfirmLocationUpdate=" + this.f15986g + ")";
    }

    public /* synthetic */ l(com.waze.av.a.p pVar, z zVar, String str, String str2, long j2, int i2, boolean z, int i3) {
        this(pVar, zVar, (i3 & 4) != 0 ? "" : str, (i3 & 8) != 0 ? "" : str2, (i3 & 16) != 0 ? 0L : j2, (i3 & 32) != 0 ? -1 : i2, z & ((i3 & 64) == 0));
    }
}
