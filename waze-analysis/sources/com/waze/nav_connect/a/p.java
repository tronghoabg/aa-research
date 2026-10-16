package com.waze.nav_connect.a;

import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class p extends com.waze.map.isolated.k implements b, c {

    /* renamed from: a, reason: collision with root package name */
    private final e f30746a;

    /* renamed from: b, reason: collision with root package name */
    private final String f30747b;

    /* renamed from: c, reason: collision with root package name */
    private final a f30748c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(e eVar, String str, a aVar) {
        super(null, null);
        x.f(eVar, "appInfo");
        x.f(str, "externalTripToken");
        x.f(aVar, "reason");
        this.f30746a = eVar;
        this.f30747b = str;
        this.f30748c = aVar;
    }

    @Override // com.waze.nav_connect.a.b
    public final e a() {
        return this.f30746a;
    }

    @Override // com.waze.nav_connect.a.c
    public final String b() {
        return this.f30747b;
    }

    public final a d() {
        return this.f30748c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return x.n(this.f30746a, pVar.f30746a) && x.n(this.f30747b, pVar.f30747b) && this.f30748c == pVar.f30748c;
    }

    public final int hashCode() {
        return (((this.f30746a.hashCode() * 31) + this.f30747b.hashCode()) * 31) + this.f30748c.hashCode();
    }

    public final String toString() {
        return "PendingUserConsent(appInfo=" + this.f30746a + ", externalTripToken=" + this.f30747b + ", reason=" + this.f30748c + ")";
    }
}
