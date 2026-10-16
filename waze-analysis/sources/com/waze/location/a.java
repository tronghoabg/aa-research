package com.waze.location;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.common.api.y f25171a;

    public a(com.google.android.gms.common.api.y yVar) {
        this.f25171a = yVar;
    }

    public final com.google.android.gms.common.api.y a() {
        return this.f25171a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && h.g.b.x.n(this.f25171a, ((a) obj).f25171a);
    }

    public final int hashCode() {
        com.google.android.gms.common.api.y yVar = this.f25171a;
        if (yVar == null) {
            return 0;
        }
        return yVar.hashCode();
    }

    public final String toString() {
        return "LocationProviderResponse(resolvableApiException=" + this.f25171a + ")";
    }

    public a() {
        this(null);
    }
}
