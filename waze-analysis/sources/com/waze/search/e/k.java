package com.waze.search.e;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class k extends com.waze.settings.v {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.ui.ac.n f35629a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(com.waze.ui.ac.n nVar) {
        super(null, null);
        h.g.b.x.f(nVar, "text");
        this.f35629a = nVar;
    }

    public final com.waze.ui.ac.n a() {
        return this.f35629a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k) && h.g.b.x.n(this.f35629a, ((k) obj).f35629a);
    }

    public final int hashCode() {
        return this.f35629a.hashCode();
    }

    public final String toString() {
        return "DistanceText(text=" + this.f35629a + ")";
    }
}
