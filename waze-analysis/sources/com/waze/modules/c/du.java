package com.waze.modules.c;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class du extends eb {

    /* renamed from: a, reason: collision with root package name */
    private final ag f30126a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public du(ag agVar) {
        super(null);
        h.g.b.x.f(agVar, "route");
        this.f30126a = agVar;
    }

    public final ag a() {
        return this.f30126a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof du) && h.g.b.x.n(this.f30126a, ((du) obj).f30126a);
    }

    public final int hashCode() {
        return this.f30126a.hashCode();
    }

    public final String toString() {
        return "OfflineRoute(route=" + this.f30126a + ")";
    }
}
