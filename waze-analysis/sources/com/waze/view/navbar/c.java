package com.waze.view.navbar;

import h.g.b.x;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private static final c f45068a = new c(false, 0, 0, h.a.i.h(), h.a.i.h(), 0);

    /* renamed from: b, reason: collision with root package name */
    private final boolean f45069b;

    /* renamed from: c, reason: collision with root package name */
    private final int f45070c;

    /* renamed from: d, reason: collision with root package name */
    private final int f45071d;

    /* renamed from: e, reason: collision with root package name */
    private final List f45072e;

    /* renamed from: f, reason: collision with root package name */
    private final List f45073f;

    /* renamed from: g, reason: collision with root package name */
    private final int f45074g;

    public c(boolean z, int i2, int i3, List list, List list2, int i4) {
        x.f(list, "levels");
        x.f(list2, "lengths");
        this.f45069b = z;
        this.f45070c = i2;
        this.f45071d = i3;
        this.f45072e = list;
        this.f45073f = list2;
        this.f45074g = i4;
    }

    public final int a() {
        return this.f45070c;
    }

    public final int b() {
        return this.f45074g;
    }

    public final int c() {
        return this.f45071d;
    }

    public final List e() {
        return this.f45073f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f45069b == cVar.f45069b && this.f45070c == cVar.f45070c && this.f45071d == cVar.f45071d && x.n(this.f45072e, cVar.f45072e) && x.n(this.f45073f, cVar.f45073f) && this.f45074g == cVar.f45074g;
    }

    public final List f() {
        return this.f45072e;
    }

    public final boolean g() {
        return this.f45069b;
    }

    public final int hashCode() {
        return (((((((((a.a.a(this.f45069b) * 31) + this.f45070c) * 31) + this.f45071d) * 31) + this.f45072e.hashCode()) * 31) + this.f45073f.hashCode()) * 31) + this.f45074g;
    }

    public final String toString() {
        return "TrafficBarData(shown=" + this.f45069b + ", currentPercent=" + this.f45070c + ", totalTime=" + this.f45071d + ", levels=" + this.f45072e + ", lengths=" + this.f45073f + ", distanceLeft=" + this.f45074g + ")";
    }
}
