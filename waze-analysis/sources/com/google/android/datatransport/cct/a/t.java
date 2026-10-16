package com.google.android.datatransport.cct.a;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class t extends af {

    /* renamed from: a, reason: collision with root package name */
    private final ad f4056a;

    @Override // com.google.android.datatransport.cct.a.af
    public final ad a() {
        return this.f4056a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof af)) {
            return false;
        }
        af afVar = (af) obj;
        ad adVar = this.f4056a;
        return adVar == null ? afVar.a() == null : adVar.equals(afVar.a());
    }

    public final int hashCode() {
        ad adVar = this.f4056a;
        return (adVar == null ? 0 : adVar.hashCode()) ^ 1000003;
    }

    public final String toString() {
        return "ExternalPrivacyContext{prequest=" + String.valueOf(this.f4056a) + "}";
    }
}
