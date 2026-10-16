package com.waze.nav_connect.a;

import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class l extends com.waze.map.isolated.k implements b, c {

    /* renamed from: a, reason: collision with root package name */
    private final e f30740a;

    /* renamed from: b, reason: collision with root package name */
    private final String f30741b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(e eVar, String str) {
        super(null, null);
        x.f(eVar, "appInfo");
        x.f(str, "externalTripToken");
        this.f30740a = eVar;
        this.f30741b = str;
    }

    @Override // com.waze.nav_connect.a.b
    public final e a() {
        return this.f30740a;
    }

    @Override // com.waze.nav_connect.a.c
    public final String b() {
        return this.f30741b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return x.n(this.f30740a, lVar.f30740a) && x.n(this.f30741b, lVar.f30741b);
    }

    public final int hashCode() {
        return (this.f30740a.hashCode() * 31) + this.f30741b.hashCode();
    }

    public final String toString() {
        return "Active(appInfo=" + this.f30740a + ", externalTripToken=" + this.f30741b + ")";
    }
}
