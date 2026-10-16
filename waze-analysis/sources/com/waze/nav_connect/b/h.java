package com.waze.nav_connect.b;

import androidx.compose.ui.graphics.ImageBitmap;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    private final ImageBitmap f30797a;

    /* renamed from: b, reason: collision with root package name */
    private final String f30798b;

    /* renamed from: c, reason: collision with root package name */
    private final long f30799c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f30800d;

    /* renamed from: e, reason: collision with root package name */
    private final com.waze.map.isolated.k f30801e;

    private h(ImageBitmap imageBitmap, String str, com.waze.map.isolated.k kVar, long j2, boolean z) {
        h.g.b.x.f(str, "appTitle");
        h.g.b.x.f(kVar, "navConnectState");
        this.f30797a = imageBitmap;
        this.f30798b = str;
        this.f30801e = kVar;
        this.f30799c = j2;
        this.f30800d = z;
    }

    public final long a() {
        return this.f30799c;
    }

    public final ImageBitmap b() {
        return this.f30797a;
    }

    public final String c() {
        return this.f30798b;
    }

    public final boolean d() {
        return this.f30800d;
    }

    public final com.waze.map.isolated.k e() {
        return this.f30801e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return h.g.b.x.n(this.f30797a, hVar.f30797a) && h.g.b.x.n(this.f30798b, hVar.f30798b) && h.g.b.x.n(this.f30801e, hVar.f30801e) && h.o.a.A(this.f30799c, hVar.f30799c) && this.f30800d == hVar.f30800d;
    }

    public final int hashCode() {
        ImageBitmap imageBitmap = this.f30797a;
        int iHashCode = ((((imageBitmap == null ? 0 : imageBitmap.hashCode()) * 31) + this.f30798b.hashCode()) * 31) + this.f30801e.hashCode();
        long j2 = this.f30799c;
        h.o.c cVar = h.o.a.f48264a;
        return (((iHashCode * 31) + a.a.b(j2)) * 31) + a.a.a(this.f30800d);
    }

    public final String toString() {
        return "State(navConnectImage=" + this.f30797a + ", appTitle=" + this.f30798b + ", navConnectState=" + this.f30801e + ", buttonExpansionDuration=" + h.o.a.y(this.f30799c) + ", isExpansionPermittedByTooltip=" + this.f30800d + ")";
    }

    public /* synthetic */ h(ImageBitmap imageBitmap, String str, com.waze.map.isolated.k kVar, long j2, boolean z, byte[] bArr) {
        this(imageBitmap, str, kVar, j2, z);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ h() {
        com.waze.nav_connect.a.m mVar = com.waze.nav_connect.a.m.f30742a;
        h.o.c cVar = h.o.a.f48264a;
        this(null, "", mVar, h.o.c.i(4000, h.o.d.f48273d), false);
    }
}
