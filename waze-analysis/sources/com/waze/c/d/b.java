package com.waze.c.d;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class b extends d {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.modules.c.ar f18335a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.modules.navigation.ak f18336b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.sharedui.e.c f18337c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(com.waze.modules.c.ar arVar, com.waze.modules.navigation.ak akVar, com.waze.sharedui.e.c cVar) {
        super(null);
        h.g.b.x.f(arVar, "localActiveRoute");
        h.g.b.x.f(akVar, "currentDestination");
        h.g.b.x.f(cVar, "lastKnownLocation");
        this.f18335a = arVar;
        this.f18336b = akVar;
        this.f18337c = cVar;
    }

    public final com.waze.modules.navigation.ak a() {
        return this.f18336b;
    }

    public final com.waze.modules.c.ar b() {
        return this.f18335a;
    }

    public final com.waze.sharedui.e.c c() {
        return this.f18337c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return h.g.b.x.n(this.f18335a, bVar.f18335a) && h.g.b.x.n(this.f18336b, bVar.f18336b) && h.g.b.x.n(this.f18337c, bVar.f18337c);
    }

    public final int hashCode() {
        return (((this.f18335a.hashCode() * 31) + this.f18336b.hashCode()) * 31) + this.f18337c.hashCode();
    }

    public final String toString() {
        return "Meet(localActiveRoute=" + this.f18335a + ", currentDestination=" + this.f18336b + ", lastKnownLocation=" + this.f18337c + ")";
    }
}
