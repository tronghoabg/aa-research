package com.waze.navigate.a;

import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.settings.f.c.a f30929a;

    public a(com.waze.settings.f.c.a aVar) {
        x.f(aVar, "action");
        this.f30929a = aVar;
    }

    public final com.waze.settings.f.c.a a() {
        return this.f30929a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && x.n(this.f30929a, ((a) obj).f30929a);
    }

    public final int hashCode() {
        return -1685240216;
    }

    public final String toString() {
        return "Passes(action=" + this.f30929a + ")";
    }
}
