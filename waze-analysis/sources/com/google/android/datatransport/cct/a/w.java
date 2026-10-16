package com.google.android.datatransport.cct.a;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class w extends ao {

    /* renamed from: a, reason: collision with root package name */
    private final an f4073a;

    /* renamed from: b, reason: collision with root package name */
    private final am f4074b;

    /* synthetic */ w(an anVar, am amVar) {
        this.f4073a = anVar;
        this.f4074b = amVar;
    }

    @Override // com.google.android.datatransport.cct.a.ao
    public final am a() {
        return this.f4074b;
    }

    @Override // com.google.android.datatransport.cct.a.ao
    public final an b() {
        return this.f4073a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ao) {
            ao aoVar = (ao) obj;
            an anVar = this.f4073a;
            if (anVar != null ? anVar.equals(aoVar.b()) : aoVar.b() == null) {
                am amVar = this.f4074b;
                if (amVar != null ? amVar.equals(aoVar.a()) : aoVar.a() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        an anVar = this.f4073a;
        int iHashCode = anVar == null ? 0 : anVar.hashCode();
        am amVar = this.f4074b;
        return ((iHashCode ^ 1000003) * 1000003) ^ (amVar != null ? amVar.hashCode() : 0);
    }

    public final String toString() {
        am amVar = this.f4074b;
        return "NetworkConnectionInfo{networkType=" + String.valueOf(this.f4073a) + ", mobileSubtype=" + String.valueOf(amVar) + "}";
    }
}
