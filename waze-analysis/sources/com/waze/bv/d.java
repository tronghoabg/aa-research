package com.waze.bv;

import androidx.media3.extractor.metadata.icy.IcyHeaders;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f17502a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f17503b;

    /* renamed from: c, reason: collision with root package name */
    public final String f17504c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f17505d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f17506e;

    /* renamed from: f, reason: collision with root package name */
    public final int f17507f;

    /* renamed from: g, reason: collision with root package name */
    public final String f17508g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f17509h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f17510i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f17511j;

    public d(boolean z, boolean z2, String str, boolean z3, boolean z4, int i2, String str2) {
        this.f17502a = z;
        this.f17503b = z2;
        this.f17504c = str;
        this.f17505d = z3;
        this.f17506e = z4;
        this.f17507f = i2;
        this.f17508g = str2;
        this.f17509h = h.g.b.x.n("us", str2);
        this.f17510i = h.g.b.x.n(str, "always");
        this.f17511j = h.a.i.ax(h.a.i.i("always", "yes", IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE), str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f17502a == dVar.f17502a && this.f17503b == dVar.f17503b && h.g.b.x.n(this.f17504c, dVar.f17504c) && this.f17505d == dVar.f17505d && this.f17506e == dVar.f17506e && this.f17507f == dVar.f17507f && h.g.b.x.n(this.f17508g, dVar.f17508g);
    }

    public final int hashCode() {
        String str = this.f17504c;
        int iHashCode = str == null ? 0 : str.hashCode();
        boolean z = this.f17503b;
        boolean z2 = this.f17502a;
        boolean z3 = this.f17505d;
        boolean z4 = this.f17506e;
        int i2 = this.f17507f;
        String str2 = this.f17508g;
        return (((((((((((a.a.a(z2) * 31) + a.a.a(z)) * 31) + iHashCode) * 31) + a.a.a(z3)) * 31) + a.a.a(z4)) * 31) + i2) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "SpeedometerConfigs(speedometerEnabled=" + this.f17502a + ", speedLimitEnabled=" + this.f17503b + ", speedLimitUserConfig=" + this.f17504c + ", speedLimitAlert=" + this.f17505d + ", speedLimitDebug=" + this.f17506e + ", speedLimitOffset=" + this.f17507f + ", style=" + this.f17508g + ")";
    }
}
