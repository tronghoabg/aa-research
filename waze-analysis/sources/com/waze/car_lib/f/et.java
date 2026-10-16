package com.waze.car_lib.f;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class et extends com.waze.app_nav.hub.b.m {

    /* renamed from: a, reason: collision with root package name */
    private final h.g.a.l f19566a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public et(h.g.a.l lVar) {
        super(null);
        h.g.b.x.f(lVar, "onComplete");
        this.f19566a = lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof et) && h.g.b.x.n(this.f19566a, ((et) obj).f19566a);
    }

    public final h.g.a.l g() {
        return this.f19566a;
    }

    public final int hashCode() {
        return this.f19566a.hashCode();
    }

    public final String toString() {
        return "RequestBluetoothPermissions";
    }
}
