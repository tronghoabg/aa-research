package com.waze.asks;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ba extends bd {

    /* renamed from: a, reason: collision with root package name */
    private final as f15557a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ba(as asVar) {
        super(null);
        h.g.b.x.f(asVar, "question");
        this.f15557a = asVar;
    }

    public final as a() {
        return this.f15557a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ba) && h.g.b.x.n(this.f15557a, ((ba) obj).f15557a);
    }

    public final int hashCode() {
        return this.f15557a.hashCode();
    }

    public final String toString() {
        return "DismissedByUser(question=" + this.f15557a + ")";
    }
}
