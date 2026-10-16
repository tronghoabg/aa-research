package com.waze.navigate.location_preview;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.ev.l f31718a;

    /* renamed from: b, reason: collision with root package name */
    private final int f31719b;

    public e(com.waze.ev.l lVar, int i2) {
        h.g.b.x.f(lVar, "tier");
        this.f31718a = lVar;
        this.f31719b = i2;
    }

    public final int a() {
        return this.f31719b;
    }

    public final com.waze.ev.l b() {
        return this.f31718a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return h.g.b.x.n(this.f31718a, eVar.f31718a) && this.f31719b == eVar.f31719b;
    }

    public final int hashCode() {
        return (this.f31718a.hashCode() * 31) + this.f31719b;
    }

    public final String toString() {
        return "EVSpeedTierKW(tier=" + this.f31718a + ", kw=" + this.f31719b + ")";
    }
}
