package com.waze.car_lib.o;

import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class p {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f20480a;

    /* renamed from: b, reason: collision with root package name */
    private final List f20481b;

    public p(boolean z, List list) {
        h.g.b.x.f(list, "configValuesOnNavStart");
        this.f20480a = z;
        this.f20481b = list;
    }

    public final List a() {
        return this.f20481b;
    }

    public final boolean b() {
        return this.f20480a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return this.f20480a == pVar.f20480a && h.g.b.x.n(this.f20481b, pVar.f20481b);
    }

    public final int hashCode() {
        return (a.a.a(this.f20480a) * 31) + this.f20481b.hashCode();
    }

    public final String toString() {
        return "InternalState(isNavigating=" + this.f20480a + ", configValuesOnNavStart=" + this.f20481b + ")";
    }
}
