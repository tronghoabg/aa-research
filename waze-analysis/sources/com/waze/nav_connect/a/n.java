package com.waze.nav_connect.a;

import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class n extends com.waze.map.isolated.k implements b, c {

    /* renamed from: a, reason: collision with root package name */
    private final e f30743a;

    /* renamed from: b, reason: collision with root package name */
    private final String f30744b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(e eVar, String str) {
        super(null, null);
        x.f(eVar, "appInfo");
        x.f(str, "externalTripToken");
        this.f30743a = eVar;
        this.f30744b = str;
    }

    @Override // com.waze.nav_connect.a.b
    public final e a() {
        return this.f30743a;
    }

    @Override // com.waze.nav_connect.a.c
    public final String b() {
        return this.f30744b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return x.n(this.f30743a, nVar.f30743a) && x.n(this.f30744b, nVar.f30744b);
    }

    public final int hashCode() {
        return (this.f30743a.hashCode() * 31) + this.f30744b.hashCode();
    }

    public final String toString() {
        return "Paused(appInfo=" + this.f30743a + ", externalTripToken=" + this.f30744b + ")";
    }
}
