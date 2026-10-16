package com.waze.search.v2;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class au extends com.waze.speech.k {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.speech.k f36163a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public au(com.waze.speech.k kVar) {
        super(null);
        h.g.b.x.f(kVar, "outcome");
        this.f36163a = kVar;
    }

    public final com.waze.speech.k a() {
        return this.f36163a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof au) && h.g.b.x.n(this.f36163a, ((au) obj).f36163a);
    }

    public final int hashCode() {
        return this.f36163a.hashCode();
    }

    public final String toString() {
        return "ReturnToMap(outcome=" + this.f36163a + ")";
    }
}
