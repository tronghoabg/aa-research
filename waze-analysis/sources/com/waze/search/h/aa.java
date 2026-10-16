package com.waze.search.h;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class aa extends ab {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.av.b.n f35761a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aa(com.waze.av.b.n nVar) {
        super(null);
        h.g.b.x.f(nVar, "genericPlace");
        this.f35761a = nVar;
    }

    public final com.waze.av.b.n a() {
        return this.f35761a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof aa) && h.g.b.x.n(this.f35761a, ((aa) obj).f35761a);
    }

    public final int hashCode() {
        return this.f35761a.hashCode();
    }

    public final String toString() {
        return "UnverifiedCalendarEventClicked(genericPlace=" + this.f35761a + ")";
    }
}
