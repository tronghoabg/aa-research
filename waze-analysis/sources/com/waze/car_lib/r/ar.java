package com.waze.car_lib.r;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ar extends com.waze.n.aq {

    /* renamed from: a, reason: collision with root package name */
    private final cq f20969a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ar(cq cqVar) {
        super(null, null);
        h.g.b.x.f(cqVar, "uiState");
        this.f20969a = cqVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ar) && h.g.b.x.n(this.f20969a, ((ar) obj).f20969a);
    }

    @Override // com.waze.n.aq
    public final cq h() {
        return this.f20969a;
    }

    public final int hashCode() {
        return this.f20969a.hashCode();
    }

    public final String toString() {
        return "Loading(uiState=" + this.f20969a + ")";
    }
}
