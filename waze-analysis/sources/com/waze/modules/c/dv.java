package com.waze.modules.c;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class dv extends eb {

    /* renamed from: a, reason: collision with root package name */
    private final ar f30127a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dv(ar arVar) {
        super(null);
        h.g.b.x.f(arVar, "route");
        this.f30127a = arVar;
    }

    public final ar a() {
        return this.f30127a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dv) && h.g.b.x.n(this.f30127a, ((dv) obj).f30127a);
    }

    public final int hashCode() {
        return this.f30127a.hashCode();
    }

    public final String toString() {
        return "OnlineRoute(route=" + this.f30127a + ")";
    }
}
