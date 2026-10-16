package com.waze.location;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f25401a;

    /* renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.common.api.y f25402b;

    public h(boolean z, com.google.android.gms.common.api.y yVar) {
        this.f25401a = z;
        this.f25402b = yVar;
    }

    public final com.google.android.gms.common.api.y a() {
        return this.f25402b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f25401a == hVar.f25401a && h.g.b.x.n(this.f25402b, hVar.f25402b);
    }

    public final int hashCode() {
        com.google.android.gms.common.api.y yVar = this.f25402b;
        return (a.a.a(this.f25401a) * 31) + (yVar == null ? 0 : yVar.hashCode());
    }

    public final String toString() {
        return "CheckLocationSettingsDeferredResponse(enabled=" + this.f25401a + ", resolvableApiException=" + this.f25402b + ")";
    }

    public /* synthetic */ h(boolean z) {
        this(z, null);
    }
}
