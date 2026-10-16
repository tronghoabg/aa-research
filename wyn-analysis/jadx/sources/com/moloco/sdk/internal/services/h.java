package com.moloco.sdk.internal.services;

import A.AbstractC0213f;
import A7.AbstractC0279p0;

/* loaded from: classes4.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final int f29617a;

    /* renamed from: b, reason: collision with root package name */
    public final float f29618b;

    /* renamed from: c, reason: collision with root package name */
    public final int f29619c;

    /* renamed from: d, reason: collision with root package name */
    public final float f29620d;

    /* renamed from: e, reason: collision with root package name */
    public final float f29621e;

    /* renamed from: f, reason: collision with root package name */
    public final int f29622f;

    /* renamed from: g, reason: collision with root package name */
    public final float f29623g;

    /* renamed from: h, reason: collision with root package name */
    public final float f29624h;

    public h(int i5, float f10, int i10, float f11, float f12, int i11, float f13, float f14) {
        this.f29617a = i5;
        this.f29618b = f10;
        this.f29619c = i10;
        this.f29620d = f11;
        this.f29621e = f12;
        this.f29622f = i11;
        this.f29623g = f13;
        this.f29624h = f14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f29617a == hVar.f29617a && Float.compare(this.f29618b, hVar.f29618b) == 0 && this.f29619c == hVar.f29619c && Float.compare(this.f29620d, hVar.f29620d) == 0 && Float.compare(this.f29621e, hVar.f29621e) == 0 && this.f29622f == hVar.f29622f && Float.compare(this.f29623g, hVar.f29623g) == 0 && Float.compare(this.f29624h, hVar.f29624h) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f29624h) + AbstractC0213f.c(this.f29623g, (AbstractC0213f.c(this.f29621e, AbstractC0213f.c(this.f29620d, (AbstractC0213f.c(this.f29618b, this.f29617a * 31, 31) + this.f29619c) * 31, 31), 31) + this.f29622f) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ScreenInfo(screenWidthPx=");
        sb2.append(this.f29617a);
        sb2.append(", screenWidthDp=");
        sb2.append(this.f29618b);
        sb2.append(", screenHeightPx=");
        sb2.append(this.f29619c);
        sb2.append(", screenHeightDp=");
        sb2.append(this.f29620d);
        sb2.append(", density=");
        sb2.append(this.f29621e);
        sb2.append(", dpi=");
        sb2.append(this.f29622f);
        sb2.append(", xdpi=");
        sb2.append(this.f29623g);
        sb2.append(", ydpi=");
        return AbstractC0279p0.m(sb2, this.f29624h, ')');
    }
}
