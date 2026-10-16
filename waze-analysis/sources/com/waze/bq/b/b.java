package com.waze.bq.b;

import h.g.b.x;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class b extends c {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f17237a;

    /* renamed from: b, reason: collision with root package name */
    private final List f17238b;

    public b(List list) {
        x.f(list, "items");
        this.f17237a = true;
        this.f17238b = list;
    }

    public final List a() {
        return this.f17238b;
    }

    @Override // com.waze.bq.b.c, com.waze.t.b.cb
    public final boolean e() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        boolean z = bVar.f17237a;
        return x.n(this.f17238b, bVar.f17238b);
    }

    public final int hashCode() {
        return this.f17238b.hashCode() + 38161;
    }

    public final String toString() {
        return "SearchResult(success=true, items=" + this.f17238b + ")";
    }
}
