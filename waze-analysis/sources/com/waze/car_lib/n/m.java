package com.waze.car_lib.n;

import com.waze.car_lib.r.cr;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class m extends cr {

    /* renamed from: a, reason: collision with root package name */
    private final v f20414a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(v vVar) {
        super((byte[]) null);
        h.g.b.x.f(vVar, "query");
        this.f20414a = vVar;
    }

    public final v a() {
        return this.f20414a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m) && h.g.b.x.n(this.f20414a, ((m) obj).f20414a);
    }

    public final int hashCode() {
        return this.f20414a.hashCode();
    }

    public final String toString() {
        return "SearchInProgress(query=" + this.f20414a + ")";
    }
}
