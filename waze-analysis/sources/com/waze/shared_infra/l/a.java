package com.waze.shared_infra.l;

import com.waze.shared_infra.h.c;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final int f37903a;

    /* renamed from: b, reason: collision with root package name */
    private final int f37904b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f37905c;

    /* renamed from: d, reason: collision with root package name */
    private final int f37906d;

    /* renamed from: e, reason: collision with root package name */
    private final int f37907e;

    /* renamed from: f, reason: collision with root package name */
    private final c f37908f;

    /* renamed from: g, reason: collision with root package name */
    private final c f37909g;

    public a(int i2, int i3, boolean z, int i4, int i5, c cVar, c cVar2) {
        this.f37903a = i2;
        this.f37904b = i3;
        this.f37905c = z;
        this.f37906d = i4;
        this.f37907e = i5;
        this.f37908f = cVar;
        this.f37909g = cVar2;
    }

    public final int a() {
        return this.f37906d;
    }

    public final int b() {
        return this.f37904b;
    }

    public final int c() {
        return this.f37903a;
    }

    public final int d() {
        return this.f37907e;
    }

    public final c e() {
        return this.f37908f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f37903a == aVar.f37903a && this.f37904b == aVar.f37904b && this.f37905c == aVar.f37905c && this.f37906d == aVar.f37906d && this.f37907e == aVar.f37907e && x.n(this.f37908f, aVar.f37908f) && x.n(this.f37909g, aVar.f37909g);
    }

    public final c f() {
        return this.f37909g;
    }

    public final boolean g() {
        return this.f37905c;
    }

    public final int hashCode() {
        int i2 = this.f37903a * 31;
        c cVar = this.f37908f;
        return ((((((((((i2 + this.f37904b) * 31) + a.a.a(this.f37905c)) * 31) + this.f37906d) * 31) + this.f37907e) * 31) + cVar.hashCode()) * 31) + this.f37909g.hashCode();
    }

    public final String toString() {
        return "Segment(tileId=" + this.f37903a + ", lineId=" + this.f37904b + ", isReversed=" + this.f37905c + ", fromNodeId=" + this.f37906d + ", toNodeId=" + this.f37907e + ", fromCoordinate=" + this.f37908f + ", toCoordinate=" + this.f37909g + ")";
    }
}
