package com.waze.alerters.a;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ad {

    /* renamed from: a, reason: collision with root package name */
    private final ac f14152a;

    /* renamed from: b, reason: collision with root package name */
    private final int f14153b;

    public ad(ac acVar, int i2) {
        h.g.b.x.f(acVar, "state");
        this.f14152a = acVar;
        this.f14153b = i2;
    }

    public final int a() {
        return this.f14153b;
    }

    public final ac b() {
        return this.f14152a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ad)) {
            return false;
        }
        ad adVar = (ad) obj;
        return this.f14152a == adVar.f14152a && this.f14153b == adVar.f14153b;
    }

    public final int hashCode() {
        return (this.f14152a.hashCode() * 31) + this.f14153b;
    }

    public final String toString() {
        return "ZoneAlertData(state=" + this.f14152a + ", percent=" + this.f14153b + ")";
    }
}
