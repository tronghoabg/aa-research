package com.waze.map.b;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class af extends com.waze.install.ah {

    /* renamed from: a, reason: collision with root package name */
    private final int f27994a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.shared_infra.h.c f27995b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public af(int i2, com.waze.shared_infra.h.c cVar) {
        super(null);
        h.g.b.x.f(cVar, "coordinate");
        this.f27994a = i2;
        this.f27995b = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof af)) {
            return false;
        }
        af afVar = (af) obj;
        return this.f27994a == afVar.f27994a && h.g.b.x.n(this.f27995b, afVar.f27995b);
    }

    public final int f() {
        return this.f27994a;
    }

    public final com.waze.shared_infra.h.c g() {
        return this.f27995b;
    }

    public final int hashCode() {
        return (this.f27994a * 31) + this.f27995b.hashCode();
    }

    public final String toString() {
        return "WazerClick(id=" + this.f27994a + ", coordinate=" + this.f27995b + ")";
    }
}
