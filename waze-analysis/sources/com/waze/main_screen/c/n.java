package com.waze.main_screen.c;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class n extends com.waze.location.q {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.nav_connect.b.j f26259a;

    public n(com.waze.nav_connect.b.j jVar) {
        h.g.b.x.f(jVar, "navConnectButtonStateHolder");
        this.f26259a = jVar;
    }

    public final com.waze.nav_connect.b.j b() {
        return this.f26259a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n) && h.g.b.x.n(this.f26259a, ((n) obj).f26259a);
    }

    public final int hashCode() {
        return this.f26259a.hashCode();
    }

    public final String toString() {
        return "NavConnect(navConnectButtonStateHolder=" + this.f26259a + ")";
    }
}
