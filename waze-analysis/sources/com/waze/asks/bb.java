package com.waze.asks;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class bb extends bd {

    /* renamed from: a, reason: collision with root package name */
    private final as f15558a;

    /* renamed from: b, reason: collision with root package name */
    private final d f15559b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bb(as asVar, d dVar) {
        super(null);
        h.g.b.x.f(asVar, "question");
        h.g.b.x.f(dVar, "answer");
        this.f15558a = asVar;
        this.f15559b = dVar;
    }

    public final d a() {
        return this.f15559b;
    }

    public final as b() {
        return this.f15558a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bb)) {
            return false;
        }
        bb bbVar = (bb) obj;
        return h.g.b.x.n(this.f15558a, bbVar.f15558a) && h.g.b.x.n(this.f15559b, bbVar.f15559b);
    }

    public final int hashCode() {
        return (this.f15558a.hashCode() * 31) + this.f15559b.hashCode();
    }

    public final String toString() {
        return "EnrichAlertAnswerSelected(question=" + this.f15558a + ", answer=" + this.f15559b + ")";
    }
}
