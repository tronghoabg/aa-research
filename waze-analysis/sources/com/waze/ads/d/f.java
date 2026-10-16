package com.waze.ads.d;

import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class f implements h {

    /* renamed from: a, reason: collision with root package name */
    private final e f14017a;

    public f(e eVar) {
        x.f(eVar, "reason");
        this.f14017a = eVar;
    }

    public final e a() {
        return this.f14017a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && this.f14017a == ((f) obj).f14017a;
    }

    public final int hashCode() {
        return this.f14017a.hashCode();
    }

    public final String toString() {
        return "Failure(reason=" + this.f14017a + ")";
    }
}
