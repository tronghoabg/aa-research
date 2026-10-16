package com.waze.car_lib.f;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class hw extends com.waze.car_lib.p.dh {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.settings.tree.d.d f19687a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hw(com.waze.settings.tree.d.d dVar) {
        super(null);
        h.g.b.x.f(dVar, "settingChoice");
        this.f19687a = dVar;
    }

    public final com.waze.settings.tree.d.d a() {
        return this.f19687a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hw) && h.g.b.x.n(this.f19687a, ((hw) obj).f19687a);
    }

    public final int hashCode() {
        return this.f19687a.hashCode();
    }

    public final String toString() {
        return "OpenOptionsScreen(settingChoice=" + this.f19687a + ")";
    }
}
