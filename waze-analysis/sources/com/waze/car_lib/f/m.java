package com.waze.car_lib.f;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class m extends com.waze.copilot.data.b.k {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.settings.tree.d.n f19770a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(com.waze.settings.tree.d.n nVar) {
        super(null);
        h.g.b.x.f(nVar, "navSettingsPage");
        this.f19770a = nVar;
    }

    public final com.waze.settings.tree.d.n a() {
        return this.f19770a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m) && h.g.b.x.n(this.f19770a, ((m) obj).f19770a);
    }

    public final int hashCode() {
        return this.f19770a.hashCode();
    }

    public final String toString() {
        return "ShowAllNavigationSettings(navSettingsPage=" + this.f19770a + ")";
    }
}
