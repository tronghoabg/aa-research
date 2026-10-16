package com.waze.car_lib.f;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class hx extends com.waze.car_lib.p.dh {

    /* renamed from: a, reason: collision with root package name */
    private final h.g.a.l f19688a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hx(h.g.a.l lVar) {
        super(null);
        h.g.b.x.f(lVar, "onPermissionResult");
        this.f19688a = lVar;
    }

    public final h.g.a.l a() {
        return this.f19688a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hx) && h.g.b.x.n(this.f19688a, ((hx) obj).f19688a);
    }

    public final int hashCode() {
        return this.f19688a.hashCode();
    }

    public final String toString() {
        return "OpenRequestRecordAudioPermission(onPermissionResult=" + this.f19688a + ")";
    }
}
