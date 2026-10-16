package com.waze.map;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class ce extends com.waze.google_assistant.an {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.map.b.co f28673a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ce(com.waze.map.b.co coVar) {
        super(null);
        h.g.b.x.f(coVar, "original");
        this.f28673a = coVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ce) && h.g.b.x.n(this.f28673a, ((ce) obj).f28673a);
    }

    public final int hashCode() {
        return this.f28673a.hashCode();
    }

    public final com.waze.map.b.co i() {
        return this.f28673a;
    }

    public final String toString() {
        return "Area(original=" + this.f28673a + ")";
    }
}
