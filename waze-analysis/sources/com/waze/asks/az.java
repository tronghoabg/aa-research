package com.waze.asks;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class az extends bd {

    /* renamed from: a, reason: collision with root package name */
    private final as f15553a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public az(as asVar) {
        super(null);
        h.g.b.x.f(asVar, "question");
        this.f15553a = asVar;
    }

    public final as a() {
        return this.f15553a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof az) && h.g.b.x.n(this.f15553a, ((az) obj).f15553a);
    }

    public final int hashCode() {
        return this.f15553a.hashCode();
    }

    public final String toString() {
        return "DismissedByTimeout(question=" + this.f15553a + ")";
    }
}
