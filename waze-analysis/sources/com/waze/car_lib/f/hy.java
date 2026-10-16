package com.waze.car_lib.f;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class hy extends com.waze.car_lib.p.dh {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.settings.tree.d.n f19689a;

    public hy(com.waze.settings.tree.d.n nVar) {
        super(null);
        this.f19689a = nVar;
    }

    public final com.waze.settings.tree.d.n a() {
        return this.f19689a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hy) && h.g.b.x.n(this.f19689a, ((hy) obj).f19689a);
    }

    public final int hashCode() {
        com.waze.settings.tree.d.n nVar = this.f19689a;
        if (nVar == null) {
            return 0;
        }
        return nVar.hashCode();
    }

    public final String toString() {
        return "OpenScreen(settingsPage=" + this.f19689a + ")";
    }

    public hy() {
        this(null);
    }
}
