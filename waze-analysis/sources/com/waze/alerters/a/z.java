package com.waze.alerters.a;

import com.waze.jni.protos.InsightPriority;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.k f14213a;

    /* renamed from: b, reason: collision with root package name */
    private final InsightPriority f14214b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.j f14215c;

    /* renamed from: d, reason: collision with root package name */
    private final int f14216d;

    /* renamed from: e, reason: collision with root package name */
    private final ad f14217e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f14218f;

    public z(com.waze.k kVar, InsightPriority insightPriority, com.waze.j jVar, int i2, ad adVar, boolean z) {
        h.g.b.x.f(kVar, "alertId");
        h.g.b.x.f(insightPriority, "priority");
        h.g.b.x.f(jVar, "alerter");
        this.f14213a = kVar;
        this.f14214b = insightPriority;
        this.f14215c = jVar;
        this.f14216d = i2;
        this.f14217e = adVar;
        this.f14218f = z;
    }

    public final int a() {
        return this.f14216d;
    }

    public final com.waze.j b() {
        return this.f14215c;
    }

    public final com.waze.k c() {
        return this.f14213a;
    }

    public final ad d() {
        return this.f14217e;
    }

    public final InsightPriority e() {
        return this.f14214b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return h.g.b.x.n(this.f14213a, zVar.f14213a) && h.g.b.x.n(this.f14214b, zVar.f14214b) && h.g.b.x.n(this.f14215c, zVar.f14215c) && this.f14216d == zVar.f14216d && h.g.b.x.n(this.f14217e, zVar.f14217e) && this.f14218f == zVar.f14218f;
    }

    public final boolean f() {
        return this.f14218f;
    }

    public final int hashCode() {
        int iHashCode = (((this.f14213a.hashCode() * 31) + this.f14214b.hashCode()) * 31) + this.f14215c.hashCode();
        ad adVar = this.f14217e;
        return (((((iHashCode * 31) + this.f14216d) * 31) + (adVar == null ? 0 : adVar.hashCode())) * 31) + a.a.a(this.f14218f);
    }

    public final String toString() {
        return "NativeDescriptorData(alertId=" + this.f14213a + ", priority=" + this.f14214b + ", alerter=" + this.f14215c + ", triggerDistanceMeters=" + this.f14216d + ", zoneAlertData=" + this.f14217e + ", abortImmediatelyOnRemoval=" + this.f14218f + ")";
    }
}
