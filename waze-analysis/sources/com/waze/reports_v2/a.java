package com.waze.reports_v2;

import com.waze.reports_v2.c.ao;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class a extends d {

    /* renamed from: a, reason: collision with root package name */
    private final ao f33982a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(ao aoVar) {
        super(aoVar);
        x.f(aoVar, "config");
        this.f33982a = aoVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && x.n(this.f33982a, ((a) obj).f33982a);
    }

    public final int hashCode() {
        return this.f33982a.hashCode();
    }

    public final String toString() {
        return "Bardinio(config=" + this.f33982a + ")";
    }
}
