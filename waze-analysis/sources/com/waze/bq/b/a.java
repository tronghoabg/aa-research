package com.waze.bq.b;

import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final String f17236a;

    public a(byte[] bArr) {
        x.f("dummy_search_query", "query");
        this.f17236a = "dummy_search_query";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && x.n(this.f17236a, ((a) obj).f17236a);
    }

    public final int hashCode() {
        return this.f17236a.hashCode();
    }

    public final String toString() {
        return "Search(query=" + this.f17236a + ")";
    }

    private a() {
        throw null;
    }
}
