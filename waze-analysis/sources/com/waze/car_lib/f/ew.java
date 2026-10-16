package com.waze.car_lib.f;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ew extends com.waze.app_nav.hub.b.m {

    /* renamed from: a, reason: collision with root package name */
    private final h.g.a.a f19570a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ew(h.g.a.a aVar) {
        super(null);
        h.g.b.x.f(aVar, "onAccept");
        this.f19570a = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ew) && h.g.b.x.n(this.f19570a, ((ew) obj).f19570a);
    }

    public final h.g.a.a g() {
        return this.f19570a;
    }

    public final int hashCode() {
        return this.f19570a.hashCode();
    }

    public final String toString() {
        return "ShowAppNeedBluetoothPermissionPopup";
    }
}
