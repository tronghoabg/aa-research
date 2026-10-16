package com.waze.car_lib.n;

import com.waze.car_lib.r.cr;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class n extends cr {

    /* renamed from: a, reason: collision with root package name */
    private final v f20415a;

    /* renamed from: b, reason: collision with root package name */
    private final List f20416b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(v vVar, List list) {
        super((byte[]) null);
        h.g.b.x.f(vVar, "query");
        h.g.b.x.f(list, "items");
        this.f20415a = vVar;
        this.f20416b = list;
    }

    public final v a() {
        return this.f20415a;
    }

    public final List b() {
        return this.f20416b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return h.g.b.x.n(this.f20415a, nVar.f20415a) && h.g.b.x.n(this.f20416b, nVar.f20416b);
    }

    public final int hashCode() {
        return (this.f20415a.hashCode() * 31) + this.f20416b.hashCode();
    }

    public final String toString() {
        return "SearchResults(query=" + this.f20415a + ", items=" + this.f20416b + ")";
    }
}
