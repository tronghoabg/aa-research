package com.waze.app_nav.a;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class as extends at {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.asks.as f15119a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public as(com.waze.asks.as asVar) {
        super(null);
        h.g.b.x.f(asVar, "question");
        this.f15119a = asVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof as) && h.g.b.x.n(this.f15119a, ((as) obj).f15119a);
    }

    public final int hashCode() {
        return this.f15119a.hashCode();
    }

    public final String toString() {
        return "DismissedByUser(question=" + this.f15119a + ")";
    }
}
