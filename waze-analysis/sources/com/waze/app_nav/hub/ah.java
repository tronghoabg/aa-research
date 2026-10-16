package com.waze.app_nav.hub;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ah {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f15250a;

    /* renamed from: b, reason: collision with root package name */
    private final k f15251b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.app_nav.hub.b.c f15252c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.app_nav.hub.a.e f15253d;

    public ah(com.waze.shared_infra.i.e eVar, k kVar, com.waze.app_nav.hub.b.c cVar, com.waze.app_nav.hub.a.e eVar2) {
        h.g.b.x.f(eVar, "logger");
        h.g.b.x.f(kVar, "activityLauncher");
        h.g.b.x.f(cVar, "popupManager");
        h.g.b.x.f(eVar2, "policyManager");
        this.f15250a = eVar;
        this.f15251b = kVar;
        this.f15252c = cVar;
        this.f15253d = eVar2;
    }

    public final k a() {
        return this.f15251b;
    }

    public final com.waze.app_nav.hub.b.c b() {
        return this.f15252c;
    }

    public final com.waze.shared_infra.i.e c() {
        return this.f15250a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ah)) {
            return false;
        }
        ah ahVar = (ah) obj;
        return h.g.b.x.n(this.f15250a, ahVar.f15250a) && h.g.b.x.n(this.f15251b, ahVar.f15251b) && h.g.b.x.n(this.f15252c, ahVar.f15252c) && h.g.b.x.n(this.f15253d, ahVar.f15253d);
    }

    public final int hashCode() {
        return (((((this.f15250a.hashCode() * 31) + this.f15251b.hashCode()) * 31) + this.f15252c.hashCode()) * 31) + this.f15253d.hashCode();
    }

    public final String toString() {
        return "WazeHubManager(logger=" + this.f15250a + ", activityLauncher=" + this.f15251b + ", popupManager=" + this.f15252c + ", policyManager=" + this.f15253d + ")";
    }
}
