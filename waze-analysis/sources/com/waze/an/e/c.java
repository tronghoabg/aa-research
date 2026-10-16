package com.waze.an.e;

import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class c implements g {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.j f14861a;

    public c(com.waze.j jVar) {
        x.f(jVar, "alerter");
        this.f14861a = jVar;
    }

    public final com.waze.j a() {
        return this.f14861a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && x.n(this.f14861a, ((c) obj).f14861a);
    }

    public final int hashCode() {
        return this.f14861a.hashCode();
    }

    public final String toString() {
        return "Alert(alerter=" + this.f14861a + ")";
    }
}
