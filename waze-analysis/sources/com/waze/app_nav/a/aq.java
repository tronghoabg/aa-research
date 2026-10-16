package com.waze.app_nav.a;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class aq extends at {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.asks.as f15116a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.asks.d f15117b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aq(com.waze.asks.as asVar, com.waze.asks.d dVar) {
        super(null);
        h.g.b.x.f(asVar, "question");
        h.g.b.x.f(dVar, "answer");
        this.f15116a = asVar;
        this.f15117b = dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aq)) {
            return false;
        }
        aq aqVar = (aq) obj;
        return h.g.b.x.n(this.f15116a, aqVar.f15116a) && h.g.b.x.n(this.f15117b, aqVar.f15117b);
    }

    public final int hashCode() {
        return (this.f15116a.hashCode() * 31) + this.f15117b.hashCode();
    }

    public final String toString() {
        return "AnswerSelected(question=" + this.f15116a + ", answer=" + this.f15117b + ")";
    }
}
