package com.waze.sharedui.e;

import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.shared_infra.h.c f38863a;

    /* renamed from: b, reason: collision with root package name */
    private final int f38864b;

    /* renamed from: c, reason: collision with root package name */
    private final b f38865c;

    /* renamed from: d, reason: collision with root package name */
    private final String f38866d;

    public a(com.waze.shared_infra.h.c cVar, int i2, b bVar, String str) {
        x.f(cVar, "location");
        this.f38863a = cVar;
        this.f38864b = i2;
        this.f38865c = bVar;
        this.f38866d = str;
    }

    public final int a() {
        return this.f38864b;
    }

    public final com.waze.shared_infra.h.c b() {
        return this.f38863a;
    }

    public final b c() {
        return this.f38865c;
    }

    public final String d() {
        return this.f38866d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return x.n(this.f38863a, aVar.f38863a) && this.f38864b == aVar.f38864b && x.n(this.f38865c, aVar.f38865c) && x.n(this.f38866d, aVar.f38866d);
    }

    public final int hashCode() {
        int iHashCode = this.f38863a.hashCode() * 31;
        b bVar = this.f38865c;
        int iHashCode2 = (((iHashCode + this.f38864b) * 31) + (bVar == null ? 0 : bVar.hashCode())) * 31;
        String str = this.f38866d;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "MatchedPosition(location=" + this.f38863a + ", accuracyMeters=" + this.f38864b + ", nodes=" + this.f38865c + ", streetName=" + this.f38866d + ")";
    }
}
