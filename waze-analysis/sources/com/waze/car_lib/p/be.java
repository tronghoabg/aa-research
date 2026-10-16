package com.waze.car_lib.p;

import androidx.savedstate.serialization.ClassDiscriminatorModeKt;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class be {

    /* renamed from: a, reason: collision with root package name */
    private final bc f20615a;

    /* renamed from: b, reason: collision with root package name */
    private final bb f20616b;

    /* renamed from: c, reason: collision with root package name */
    private final au f20617c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.car_lib.m.c f20618d;

    public be(bc bcVar, com.waze.car_lib.m.c cVar, bb bbVar, au auVar) {
        h.g.b.x.f(bcVar, "destination");
        h.g.b.x.f(cVar, "source");
        h.g.b.x.f(bbVar, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
        this.f20615a = bcVar;
        this.f20618d = cVar;
        this.f20616b = bbVar;
        this.f20617c = auVar;
    }

    public static /* synthetic */ be d(be beVar, au auVar) {
        bc bcVar = beVar.f20615a;
        com.waze.car_lib.m.c cVar = beVar.f20618d;
        bb bbVar = beVar.f20616b;
        h.g.b.x.f(bcVar, "destination");
        h.g.b.x.f(cVar, "source");
        h.g.b.x.f(bbVar, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
        return new be(bcVar, cVar, bbVar, auVar);
    }

    public final au a() {
        return this.f20617c;
    }

    public final bb b() {
        return this.f20616b;
    }

    public final bc c() {
        return this.f20615a;
    }

    public final com.waze.car_lib.m.c e() {
        return this.f20618d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof be)) {
            return false;
        }
        be beVar = (be) obj;
        return h.g.b.x.n(this.f20615a, beVar.f20615a) && h.g.b.x.n(this.f20618d, beVar.f20618d) && this.f20616b == beVar.f20616b && h.g.b.x.n(this.f20617c, beVar.f20617c);
    }

    public final int hashCode() {
        int iHashCode = (((this.f20615a.hashCode() * 31) + this.f20618d.hashCode()) * 31) + this.f20616b.hashCode();
        au auVar = this.f20617c;
        return (iHashCode * 31) + (auVar == null ? 0 : auVar.hashCode());
    }

    public final String toString() {
        return "PredictionState(destination=" + this.f20615a + ", source=" + this.f20618d + ", type=" + this.f20616b + ", eta=" + this.f20617c + ")";
    }
}
