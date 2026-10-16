package com.waze.car_lib.r;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ap extends com.waze.n.aq {

    /* renamed from: a, reason: collision with root package name */
    private final cq f20967a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ap(cq cqVar) {
        super(null, null);
        h.g.b.x.f(cqVar, "uiState");
        this.f20967a = cqVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ap) && h.g.b.x.n(this.f20967a, ((ap) obj).f20967a);
    }

    @Override // com.waze.n.aq
    public final cq h() {
        return this.f20967a;
    }

    public final int hashCode() {
        return this.f20967a.hashCode();
    }

    public final String toString() {
        return "Error(uiState=" + this.f20967a + ")";
    }
}
