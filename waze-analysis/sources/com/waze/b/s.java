package com.waze.b;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f16166a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.shared_infra.q.i f16167b;

    /* renamed from: c, reason: collision with root package name */
    private final e f16168c;

    /* renamed from: d, reason: collision with root package name */
    private final z f16169d;

    public s(boolean z, com.waze.shared_infra.q.i iVar, e eVar, z zVar) {
        h.g.b.x.f(eVar, "aadcData");
        h.g.b.x.f(zVar, "u18RestrictionData");
        this.f16166a = z;
        this.f16167b = iVar;
        this.f16168c = eVar;
        this.f16169d = zVar;
    }

    public final e a() {
        return this.f16168c;
    }

    public final z b() {
        return this.f16169d;
    }

    public final com.waze.shared_infra.q.i c() {
        return this.f16167b;
    }

    public final boolean d() {
        return this.f16166a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return this.f16166a == sVar.f16166a && h.g.b.x.n(this.f16167b, sVar.f16167b) && h.g.b.x.n(this.f16168c, sVar.f16168c) && h.g.b.x.n(this.f16169d, sVar.f16169d);
    }

    public final int hashCode() {
        com.waze.shared_infra.q.i iVar = this.f16167b;
        return (((((a.a.a(this.f16166a) * 31) + (iVar == null ? 0 : iVar.hashCode())) * 31) + this.f16168c.hashCode()) * 31) + this.f16169d.hashCode();
    }

    public final String toString() {
        return "AgeRestrictionData(isRestricted=" + this.f16166a + ", userBirthdate=" + this.f16167b + ", aadcData=" + this.f16168c + ", u18RestrictionData=" + this.f16169d + ")";
    }
}
