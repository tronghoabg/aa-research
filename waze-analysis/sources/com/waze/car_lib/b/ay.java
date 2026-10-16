package com.waze.car_lib.b;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ay extends com.waze.ads.c.e {

    /* renamed from: a, reason: collision with root package name */
    private final bt f19005a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ay(bt btVar) {
        super(null);
        h.g.b.x.f(btVar, "errorType");
        this.f19005a = btVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ay) && this.f19005a == ((ay) obj).f19005a;
    }

    public final int hashCode() {
        return this.f19005a.hashCode();
    }

    public final bt i() {
        return this.f19005a;
    }

    public final String toString() {
        return "Error(errorType=" + this.f19005a + ")";
    }
}
