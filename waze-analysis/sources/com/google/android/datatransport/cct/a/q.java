package com.google.android.datatransport.cct.a;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class q extends ab {

    /* renamed from: a, reason: collision with root package name */
    private final af f4051a;

    /* renamed from: b, reason: collision with root package name */
    private final aa f4052b;

    /* synthetic */ q(af afVar, aa aaVar) {
        this.f4051a = afVar;
        this.f4052b = aaVar;
    }

    @Override // com.google.android.datatransport.cct.a.ab
    public final aa a() {
        return this.f4052b;
    }

    @Override // com.google.android.datatransport.cct.a.ab
    public final af b() {
        return this.f4051a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ab) {
            ab abVar = (ab) obj;
            af afVar = this.f4051a;
            if (afVar != null ? afVar.equals(abVar.b()) : abVar.b() == null) {
                aa aaVar = this.f4052b;
                if (aaVar != null ? aaVar.equals(abVar.a()) : abVar.a() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        af afVar = this.f4051a;
        int iHashCode = afVar == null ? 0 : afVar.hashCode();
        aa aaVar = this.f4052b;
        return ((iHashCode ^ 1000003) * 1000003) ^ (aaVar != null ? aaVar.hashCode() : 0);
    }

    public final String toString() {
        aa aaVar = this.f4052b;
        return "ComplianceData{privacyContext=" + String.valueOf(this.f4051a) + ", productIdOrigin=" + String.valueOf(aaVar) + "}";
    }
}
