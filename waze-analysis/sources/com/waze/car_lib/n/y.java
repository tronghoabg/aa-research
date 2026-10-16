package com.waze.car_lib.n;

import com.waze.car_lib.r.co;
import com.waze.search.bc;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class y extends co {

    /* renamed from: a, reason: collision with root package name */
    private final List f20445a;

    /* renamed from: b, reason: collision with root package name */
    private final v f20446b;

    /* renamed from: c, reason: collision with root package name */
    private final bc f20447c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(List list, v vVar, bc bcVar) {
        super(null);
        h.g.b.x.f(list, "results");
        h.g.b.x.f(vVar, "query");
        this.f20445a = list;
        this.f20446b = vVar;
        this.f20447c = bcVar;
    }

    public final v a() {
        return this.f20446b;
    }

    public final bc b() {
        return this.f20447c;
    }

    public final List c() {
        return this.f20445a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return h.g.b.x.n(this.f20445a, yVar.f20445a) && h.g.b.x.n(this.f20446b, yVar.f20446b) && h.g.b.x.n(this.f20447c, yVar.f20447c);
    }

    public final int hashCode() {
        int iHashCode = (this.f20445a.hashCode() * 31) + this.f20446b.hashCode();
        bc bcVar = this.f20447c;
        return (iHashCode * 31) + (bcVar == null ? 0 : bcVar.hashCode());
    }

    public final String toString() {
        return "Success(results=" + this.f20445a + ", query=" + this.f20446b + ", originalResponse=" + this.f20447c + ")";
    }
}
