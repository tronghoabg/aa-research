package com.waze.search;

import com.waze.sdk.bq;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class bc extends bq {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.av.c.l f35537a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bc(com.waze.av.c.l lVar) {
        super(null);
        h.g.b.x.f(lVar, "resultsResponse");
        this.f35537a = lVar;
    }

    public static final bc f(com.waze.av.c.l lVar) {
        h.g.b.x.f(lVar, "resultsResponse");
        return new bc(lVar);
    }

    public final com.waze.av.c.l e() {
        return this.f35537a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bc) && h.g.b.x.n(this.f35537a, ((bc) obj).f35537a);
    }

    public final int hashCode() {
        return this.f35537a.hashCode();
    }

    public final String toString() {
        return "Success(resultsResponse=" + this.f35537a + ")";
    }
}
