package com.waze.car_lib.i.c;

import com.waze.car_lib.p.dh;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class d extends dh {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.map.z f20090a;

    /* renamed from: b, reason: collision with root package name */
    private final String f20091b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f20092c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.waze.map.z zVar, String str, boolean z) {
        super(null);
        h.g.b.x.f(zVar, "colors");
        h.g.b.x.f(str, "streetName");
        this.f20090a = zVar;
        this.f20091b = str;
        this.f20092c = z;
    }

    public final com.waze.map.z a() {
        return this.f20090a;
    }

    public final String b() {
        return this.f20091b;
    }

    public final boolean c() {
        return this.f20092c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return h.g.b.x.n(this.f20090a, dVar.f20090a) && h.g.b.x.n(this.f20091b, dVar.f20091b) && this.f20092c == dVar.f20092c;
    }

    public final int hashCode() {
        return (((this.f20090a.hashCode() * 31) + this.f20091b.hashCode()) * 31) + a.a.a(this.f20092c);
    }

    public final String toString() {
        return "CurrentStreet(colors=" + this.f20090a + ", streetName=" + this.f20091b + ", isHov=" + this.f20092c + ")";
    }
}
