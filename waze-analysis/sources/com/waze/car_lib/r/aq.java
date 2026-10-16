package com.waze.car_lib.r;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class aq extends com.waze.n.aq {

    /* renamed from: a, reason: collision with root package name */
    private final cq f20968a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aq(cq cqVar) {
        super(null, null);
        h.g.b.x.f(cqVar, "uiState");
        this.f20968a = cqVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof aq) && h.g.b.x.n(this.f20968a, ((aq) obj).f20968a);
    }

    @Override // com.waze.n.aq
    public final cq h() {
        return this.f20968a;
    }

    public final int hashCode() {
        return this.f20968a.hashCode();
    }

    public final String toString() {
        return "Initial(uiState=" + this.f20968a + ")";
    }
}
