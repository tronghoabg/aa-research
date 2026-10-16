package com.waze.app_nav.a;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ar extends at {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.asks.as f15118a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ar(com.waze.asks.as asVar) {
        super(null);
        h.g.b.x.f(asVar, "question");
        this.f15118a = asVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ar) && h.g.b.x.n(this.f15118a, ((ar) obj).f15118a);
    }

    public final int hashCode() {
        return this.f15118a.hashCode();
    }

    public final String toString() {
        return "DismissedByTimeout(question=" + this.f15118a + ")";
    }
}
