package com.waze.car_lib.f;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ez extends com.waze.app_nav.hub.b.m {

    /* renamed from: a, reason: collision with root package name */
    private final h.g.a.a f19573a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ez(h.g.a.a aVar) {
        super(null);
        h.g.b.x.f(aVar, "onAccept");
        this.f19573a = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ez) && h.g.b.x.n(this.f19573a, ((ez) obj).f19573a);
    }

    public final h.g.a.a g() {
        return this.f19573a;
    }

    public final int hashCode() {
        return this.f19573a.hashCode();
    }

    public final String toString() {
        return "ShowEnableBluetoothPopup";
    }
}
