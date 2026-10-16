package com.waze.bw.c.c;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class d extends com.waze.sharedui.api.c {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.av.b.j f17845a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.waze.av.b.j jVar) {
        super(null, null);
        h.g.b.x.f(jVar, "eventPlace");
        this.f17845a = jVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && h.g.b.x.n(this.f17845a, ((d) obj).f17845a);
    }

    public final com.waze.av.b.j g() {
        return this.f17845a;
    }

    public final int hashCode() {
        return this.f17845a.hashCode();
    }

    public final String toString() {
        return "OpenEventSetAddressScreen(eventPlace=" + this.f17845a + ")";
    }
}
