package com.waze.modules.navigation;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class am extends j {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.sharedui.e.c f30305a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public am(com.waze.sharedui.e.c cVar) {
        super(null, null);
        h.g.b.x.f(cVar, "location");
        this.f30305a = cVar;
    }

    public final com.waze.sharedui.e.c c() {
        return this.f30305a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof am) && h.g.b.x.n(this.f30305a, ((am) obj).f30305a);
    }

    public final int hashCode() {
        return this.f30305a.hashCode();
    }

    public final String toString() {
        return "CurrentLocation(location=" + this.f30305a + ")";
    }
}
