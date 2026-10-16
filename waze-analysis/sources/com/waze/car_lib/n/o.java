package com.waze.car_lib.n;

import com.waze.car_lib.r.cr;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class o extends cr {

    /* renamed from: a, reason: collision with root package name */
    private final v f20417a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.av.d.k f20418b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(v vVar, com.waze.av.d.k kVar) {
        super((byte[]) null);
        h.g.b.x.f(vVar, "query");
        h.g.b.x.f(kVar, "item");
        this.f20417a = vVar;
        this.f20418b = kVar;
    }

    public final com.waze.av.d.k a() {
        return this.f20418b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return h.g.b.x.n(this.f20417a, oVar.f20417a) && h.g.b.x.n(this.f20418b, oVar.f20418b);
    }

    public final int hashCode() {
        return (this.f20417a.hashCode() * 31) + this.f20418b.hashCode();
    }

    public final String toString() {
        return "SearchSingleResult(query=" + this.f20417a + ", item=" + this.f20418b + ")";
    }
}
