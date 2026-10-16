package com.waze.map.main;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class bb extends bc {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.modules.navigation.ah f29361a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.modules.navigation.ak f29362b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bb(com.waze.modules.navigation.ah ahVar, com.waze.modules.navigation.ak akVar) {
        super(null);
        h.g.b.x.f(ahVar, "caller");
        h.g.b.x.f(akVar, "destination");
        this.f29361a = ahVar;
        this.f29362b = akVar;
    }

    public final com.waze.modules.navigation.ah a() {
        return this.f29361a;
    }

    public final com.waze.modules.navigation.ak b() {
        return this.f29362b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bb)) {
            return false;
        }
        bb bbVar = (bb) obj;
        return this.f29361a == bbVar.f29361a && h.g.b.x.n(this.f29362b, bbVar.f29362b);
    }

    public final int hashCode() {
        return (this.f29361a.hashCode() * 31) + this.f29362b.hashCode();
    }

    public final String toString() {
        return "StartNavigatingClicked(caller=" + this.f29361a + ", destination=" + this.f29362b + ")";
    }
}
