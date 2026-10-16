package com.waze.main_screen.q.b;

import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.main_screen.q.a.a f27395a;

    public h(com.waze.main_screen.q.a.a aVar) {
        x.f(aVar, "data");
        this.f27395a = aVar;
    }

    public final com.waze.main_screen.q.a.a a() {
        return this.f27395a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && x.n(this.f27395a, ((h) obj).f27395a);
    }

    public final int hashCode() {
        return this.f27395a.hashCode();
    }

    public final String toString() {
        return "State(data=" + this.f27395a + ")";
    }
}
