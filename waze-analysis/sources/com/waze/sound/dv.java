package com.waze.sound;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class dv extends dw {

    /* renamed from: a, reason: collision with root package name */
    private final String f39826a;

    public dv(String str) {
        h.g.b.x.f(str, "routeUUID");
        this.f39826a = str;
    }

    @Override // com.waze.sound.dw
    public final String b() {
        return this.f39826a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dv) && h.g.b.x.n(this.f39826a, ((dv) obj).f39826a);
    }

    public final int hashCode() {
        return this.f39826a.hashCode();
    }

    public final String toString() {
        return "ReachedDestination(routeUUID=" + this.f39826a + ")";
    }
}
