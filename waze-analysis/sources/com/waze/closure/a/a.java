package com.waze.closure.a;

import com.waze.shared_infra.h.c;
import com.waze.shared_infra.l.b;
import h.g.b.x;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final int f22441a;

    /* renamed from: b, reason: collision with root package name */
    private final int f22442b;

    /* renamed from: c, reason: collision with root package name */
    private final int f22443c;

    /* renamed from: d, reason: collision with root package name */
    private final int f22444d;

    /* renamed from: e, reason: collision with root package name */
    private final c f22445e;

    /* renamed from: f, reason: collision with root package name */
    private final c f22446f;

    /* renamed from: g, reason: collision with root package name */
    private final List f22447g;

    /* renamed from: h, reason: collision with root package name */
    private final String f22448h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f22449i;

    public a(int i2, int i3, int i4, int i5, c cVar, c cVar2, List list, String str, boolean z) {
        x.f(cVar, "fromCoordinate");
        x.f(cVar2, "toCoordinate");
        x.f(list, "polyline");
        this.f22441a = i2;
        this.f22442b = i3;
        this.f22443c = i4;
        this.f22444d = i5;
        this.f22445e = cVar;
        this.f22446f = cVar2;
        this.f22447g = list;
        this.f22448h = str;
        this.f22449i = z;
    }

    public final float a() {
        List list = this.f22447g;
        return list.size() < 2 ? b.a(this.f22445e, this.f22446f) : b.a((c) list.get(0), (c) list.get(1));
    }

    public final int b() {
        return this.f22443c;
    }

    public final int c() {
        return this.f22444d;
    }

    public final c d() {
        return this.f22445e;
    }

    public final String e() {
        return this.f22448h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f22441a == aVar.f22441a && this.f22442b == aVar.f22442b && this.f22443c == aVar.f22443c && this.f22444d == aVar.f22444d && x.n(this.f22445e, aVar.f22445e) && x.n(this.f22446f, aVar.f22446f) && x.n(this.f22447g, aVar.f22447g) && x.n(this.f22448h, aVar.f22448h) && this.f22449i == aVar.f22449i;
    }

    public final List f() {
        return this.f22447g;
    }

    public final boolean g() {
        return this.f22449i;
    }

    public final int hashCode() {
        int iHashCode = (((((((((((this.f22441a * 31) + this.f22442b) * 31) + this.f22443c) * 31) + this.f22444d) * 31) + this.f22445e.hashCode()) * 31) + this.f22446f.hashCode()) * 31) + this.f22447g.hashCode();
        String str = this.f22448h;
        return (((iHashCode * 31) + (str == null ? 0 : str.hashCode())) * 31) + a.a.a(this.f22449i);
    }

    public final String toString() {
        return "ClosureCandidate(tileId=" + this.f22441a + ", lineId=" + this.f22442b + ", fromNodeId=" + this.f22443c + ", toNodeId=" + this.f22444d + ", fromCoordinate=" + this.f22445e + ", toCoordinate=" + this.f22446f + ", polyline=" + this.f22447g + ", streetName=" + this.f22448h + ", isOnRoute=" + this.f22449i + ")";
    }
}
