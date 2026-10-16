package com.waze.car_lib.n;

import com.waze.car_lib.r.cr;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class l extends cr {

    /* renamed from: a, reason: collision with root package name */
    private final v f20413a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(v vVar) {
        super((byte[]) null);
        h.g.b.x.f(vVar, "query");
        this.f20413a = vVar;
    }

    public final v a() {
        return this.f20413a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l) && h.g.b.x.n(this.f20413a, ((l) obj).f20413a);
    }

    public final int hashCode() {
        return this.f20413a.hashCode();
    }

    public final String toString() {
        return "NoSearchResults(query=" + this.f20413a + ")";
    }
}
