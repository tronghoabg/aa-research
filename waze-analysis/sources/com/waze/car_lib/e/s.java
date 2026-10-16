package com.waze.car_lib.e;

import com.waze.car_lib.r.ca;
import com.waze.car_lib.r.cf;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f19318a;

    /* renamed from: b, reason: collision with root package name */
    private final ca f19319b;

    /* renamed from: c, reason: collision with root package name */
    private final cf f19320c;

    public s(boolean z, ca caVar, cf cfVar) {
        this.f19318a = z;
        this.f19319b = caVar;
        this.f19320c = cfVar;
    }

    public final ca a() {
        return this.f19319b;
    }

    public final cf b() {
        return this.f19320c;
    }

    public final boolean c() {
        return this.f19318a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return this.f19318a == sVar.f19318a && x.n(this.f19319b, sVar.f19319b) && x.n(this.f19320c, sVar.f19320c);
    }

    public final int hashCode() {
        ca caVar = this.f19319b;
        int iHashCode = caVar == null ? 0 : caVar.hashCode();
        boolean z = this.f19318a;
        cf cfVar = this.f19320c;
        return (((a.a.a(z) * 31) + iHashCode) * 31) + (cfVar != null ? cfVar.hashCode() : 0);
    }

    public final String toString() {
        return "ClusterUIState(isNavigating=" + this.f19318a + ", etaState=" + this.f19319b + ", instructionsState=" + this.f19320c + ")";
    }

    public s() {
        this(false, null, null);
    }
}
