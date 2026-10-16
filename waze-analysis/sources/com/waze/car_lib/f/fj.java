package com.waze.car_lib.f;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class fj extends com.waze.i.a {

    /* renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.common.api.y f19583a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fj(com.google.android.gms.common.api.y yVar) {
        super(null);
        h.g.b.x.f(yVar, "exception");
        this.f19583a = yVar;
    }

    public final com.google.android.gms.common.api.y a() {
        return this.f19583a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fj) && h.g.b.x.n(this.f19583a, ((fj) obj).f19583a);
    }

    public final int hashCode() {
        return this.f19583a.hashCode();
    }

    public final String toString() {
        return "OnLocationProviderFailedWithException(exception=" + this.f19583a + ")";
    }
}
