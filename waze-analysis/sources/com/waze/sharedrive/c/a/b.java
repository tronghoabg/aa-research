package com.waze.sharedrive.c.a;

import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final String f38058a;

    /* renamed from: b, reason: collision with root package name */
    private final String f38059b;

    /* renamed from: c, reason: collision with root package name */
    private final String f38060c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.shared_infra.h.c f38061d;

    public b(String str, String str2, String str3, com.waze.shared_infra.h.c cVar) {
        x.f(cVar, "location");
        this.f38058a = str;
        this.f38059b = str2;
        this.f38060c = str3;
        this.f38061d = cVar;
    }

    public final com.waze.shared_infra.h.c a() {
        return this.f38061d;
    }

    public final String b() {
        return this.f38060c;
    }

    public final String c() {
        return this.f38059b;
    }

    public final String d() {
        return this.f38058a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return x.n(this.f38058a, bVar.f38058a) && x.n(this.f38059b, bVar.f38059b) && x.n(this.f38060c, bVar.f38060c) && x.n(this.f38061d, bVar.f38061d);
    }

    public final int hashCode() {
        String str = this.f38058a;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.f38059b;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        int i2 = iHashCode * 31;
        String str3 = this.f38060c;
        return ((((i2 + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0)) * 31) + this.f38061d.hashCode();
    }

    public final String toString() {
        return "Destination(venueId=" + this.f38058a + ", name=" + this.f38059b + ", address=" + this.f38060c + ", location=" + this.f38061d + ")";
    }
}
