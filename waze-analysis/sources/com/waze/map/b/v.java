package com.waze.map.b;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class v extends com.waze.install.ah implements h {

    /* renamed from: a, reason: collision with root package name */
    private final int f28370a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.shared_infra.h.c f28371b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(int i2, com.waze.shared_infra.h.c cVar) {
        super(null);
        h.g.b.x.f(cVar, "coordinate");
        this.f28370a = i2;
        this.f28371b = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return this.f28370a == vVar.f28370a && h.g.b.x.n(this.f28371b, vVar.f28371b);
    }

    public final int f() {
        return this.f28370a;
    }

    public final com.waze.shared_infra.h.c g() {
        return this.f28371b;
    }

    public final int hashCode() {
        return (this.f28370a * 31) + this.f28371b.hashCode();
    }

    public final String toString() {
        return "ExternalPoiClick(id=" + this.f28370a + ", coordinate=" + this.f28371b + ")";
    }
}
